class basic{
    public static void main(String[] args){

        String str = "Java programming";
        String s = new String("the king is bck");

        String s1 = "Maker";
        String s2 = "MAker";
        String s3="";
        String s4 = "the man   ";

        System.out.println(str.length());  //length pf the string
       // System.out.println(str.concat("the")); //add of new string to prevoius one

       System.out.println(str.charAt(0)); //get character at index position
       System.out.println(str.toLowerCase()); //convert to upper 
       System.out.println(str.toUpperCase());  //convert to lower
       System.out.println(s1.equals(s2));    //comapre each string totalss
       System.out.println(s1.equalsIgnoreCase(s2)); //comapre skip lower or uppper is okay
       System.out.println(str.contains("JAva")); //check the substring is present in originla string
       System.out.println(s1.startsWith("Ma")); //check the sting stsrt letters
       System.out.println(s1.endsWith("er")); //check the string ends with leters
       System.out.println(str.substring(7)); //give from index starts
        System.out.println(str.substring(7,11)); //portion of string
        System.out.println(s1.indexOf('k')); //return the index npo of character
        System.out.println(str.lastIndexOf('g')); //return the index npo of character from last
        System.out.println(str.replace("Java","python")); //repkcae the sepecific part of string
        System.out.println(s4.trim()); //remove trailing spaces
        System.out.println(s3.isEmpty()); //check it empty or not string
        String[] king = str.split(" "); //split the string into parts
        for(String one:king)
        {
            System.out.println(one);
        }


      
        



    }
}