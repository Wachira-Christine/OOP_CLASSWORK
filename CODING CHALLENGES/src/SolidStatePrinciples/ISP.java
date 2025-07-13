package SolidStatePrinciples;

    //VIOLATING
// A "fat" interface forcing teachers to handle all subjects
    interface Teacher {
        void teachMath();
        void teachBiology();
        void teachEnglish();
    }

    // Jane only teaches English but must implement all methods!
    class Jane implements Teacher {
        @Override
        public void teachMath() {}      // ❌ Empty (not needed)
        @Override
        public void teachBiology() {}   // ❌ Empty (not needed)
        @Override
        public void teachEnglish() {   // ✅ Only this is relevant
            System.out.println("Jane teaches English.");
        }
    }


//FOLLOWING

    // Step 1: Split into smaller, focused interfaces
    interface Teacher {
        void startClass();  // Common to all teachers
    }

    interface MathTeacher {
        void teachMath();
    }

    interface EnglishTeacher {
        void teachEnglish();
    }

    interface BiologyTeacher {
        void teachBiology();
    }

    // Step 2: Jane only implements what she needs
    class Jane implements Teacher, EnglishTeacher {
        @Override
        public void startClass() {
            System.out.println("Class starts at 9 AM.");
        }

        @Override
        public void teachEnglish() {  // ✅ Only relevant methods
            System.out.println("Jane teaches Shakespeare.");
        }
    }

    // Step 3: Another teacher can choose their subjects
    class Einstein implements Teacher, MathTeacher {
        @Override
        public void startClass() {
            System.out.println("Class starts at 10 AM.");
        }

        @Override
        public void teachMath() {  // ✅ Only math
            System.out.println("Einstein teaches Algebra.");
        }
    }

