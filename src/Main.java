public class Main {
    public static void main(String[] args) {
        String greeting="Hello";// strings are used for storin text
        System.out.println(greeting);
        /*string length
        * the length of a string can be found with the length() method*/
        String txt="ABCDEFGHIJKLMNOPQRST";
        System.out.println("The length of te txt string is: " +txt.length());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.toUpperCase());

        //Finding a character in a string
        /*the indexOf() metods returns the index of the first occurance
        of a specified text in a string(including whitespace)*/
        String tpt="I am Ramah Saad locate where 'Ramah' is";
        System.out.println(tpt.indexOf("Ramah"));

        //java string concatination
        //the + operator can be used between strings
        String firstName="Saad ";
        String lastName="Ramah";
        System.out.println(firstName  + lastName);
        //You can also use concat() metod to concat two strings
        System.out.println(firstName.concat(lastName));

        //Java Numbers and strings
        /*adding numbers and strings remember java uses + operator for both
        * addition and concatination.
        * numbers are added. Strings are concatenated.*/
        int x=20;
        int y=15;
        int z=x+y;// the results will be 35
        String a="20";
        String b="15";
        String c=a+b;//z will be 2015
        System.out.println(z);
        System.out.println(c);
        //if you add a number and a string the results will be a string concatenation

        int e=24;
        String f=" is the age of Zain";
        System.out.println(e + f);

        //Strings-special characters
        String txtB="we are the \"Bongos\" from the east";// the backslash special characters turns special characters into string characters.(\" inserts double quote in a string)
        String bob="i am the \'12th\' born ";// \' inserts a single quote in a string
        String dos="we love \\skating "; // \\ inserts a single backslash in a string
        System.out.println(txtB + " " + bob + " " + dos);

    }
}