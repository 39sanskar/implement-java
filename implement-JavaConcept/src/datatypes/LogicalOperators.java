package datatypes;


public class LogicalOperators {
    public static void main(String[] args) {

        System.out.println("===== Logical Operators Examples =====");

        /*
         * Definition:
         * Logical operators are used to combine multiple conditions (expressions).
         * They return a boolean result: true or false.
         */

        // Example variables (Real-world scenarios)
        int age = 22;
        boolean hasLicense = true;
        double accountBalance = 5000;
        boolean isLoggedIn = true;
        boolean isAdmin = false;

        // 1. Logical AND (&&)
        /*
         * Definition:
         * Returns true only if BOTH conditions are true.
         * Syntax: condition1 && condition2
         *
         * Real-world example:
         * A person can drive only if they are above 18 AND have a valid license.
         */
        boolean canDrive = (age >= 18) && hasLicense;
        System.out.println("Can drive: " + canDrive); // true

        /*
         * User can access premium content only if logged in AND has sufficient balance.
         */
        boolean canAccessPremium = isLoggedIn && (accountBalance > 1000);
        System.out.println("Access Premium: " + canAccessPremium); // true


        // 2. Logical OR (||)
        /*
         * Definition:
         * Returns true if AT LEAST ONE condition is true.
         * Syntax: condition1 || condition2
         *
         * Real-world example:
         * A user can log in if they use either email OR phone number.
         */
        boolean loginMethod = true;   // email login
        boolean phoneLogin = false;

        boolean canLogin = loginMethod || phoneLogin;
        System.out.println("Can Login: " + canLogin); // true

        /*
         * Admin panel access is allowed if user is ADMIN OR SUPERUSER.
         */
        boolean isSuperUser = false;
        boolean hasAccess = isAdmin || isSuperUser;
        System.out.println("Admin Access: " + hasAccess); // false


        // 3. Logical NOT (!)
        /*
         * Definition:
         * Reverses the result of a condition.
         * true becomes false, false becomes true.
         *
         * Syntax: !condition
         *
         * Check if user is NOT logged in.
         */
        boolean isGuestUser = !isLoggedIn;
        System.out.println("Is Guest User: " + isGuestUser); // false

        /*
         * Block access if user is NOT verified.
         */
        boolean isVerified = false;
        boolean blockAccess = !isVerified;
        System.out.println("Block Access: " + blockAccess); // true


        // Combined Example
        /*
         * A user can purchase a product if:
         * - user is logged in AND
         * - has enough balance OR is an admin
         */
        boolean canPurchase = isLoggedIn && (accountBalance > 1000 || isAdmin);
        System.out.println("Can Purchase Product: " + canPurchase); // true

        System.out.println("\n===== End of Program =====");
    }
}

