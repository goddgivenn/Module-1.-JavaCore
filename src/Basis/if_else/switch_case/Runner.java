package Basis.if_else.switch_case;

public class Runner {
    public static void main(String[] args) {
        Human bogdan = new Human((short)2002);
        short yearOfBirth_Bogdan = bogdan.getYearOfBirth();
        System.out.println("Bogdan's year of birth: " + yearOfBirth_Bogdan);

//        for (int i = 2001; i<=2016; i++){
//            System.out.print(i + ",");
//        }

        switch (bogdan.getYearOfBirth()){
            case 1943,1944,1945,1946,1947,1948,1949,1950,1951,1952,1953,1954,1955,1956,1957,1958,1959,1960,1961,1962:
                System.out.println("Вы из поколения бэби-бумеров");
                break;
            case 1963,1964,1965,1966,1967,1968,1969,1970,1971,1972,1973,1974,1975,1976,1977,1978,1979,1980,1981:
                System.out.println("Вы из поколения X");
                break;
            case 1982,1983,1984,1985,1986,1987,1988,1989,1990,1991,1992,1993,1994,1995,1996,1997,1998,1999,2000:
                System.out.println("Вы из поколения Y");
                break;
            case 2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015,2016:
                System.out.println("Вы из поколения Z");
                break;
            default:
                System.out.println("Программа пока не знает, как называется поколение, к которому вы относитесь");
        }
    }
}
