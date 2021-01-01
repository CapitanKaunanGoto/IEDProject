import java.util.*;

public class main2 {
    // Method variables
    public static String Centum;
    public static String Satem;
    public static String GermanicClans;
    public static String SlavicClans;
    static public String Dialect;
    static public String LGF;
    static public String Germanic;
    static public String Slavic;
    // Scanners
    static Scanner K1;
    static Scanner K2;
    static Scanner K3;
    static boolean run = true;

    // Clans
    //=====================================================================================================================
    // Germanic Clans
    static public Clans Alemanni = new Clans("Centum", "Germanic", "Alemannic German", "Nothern Germany", "213 AD",
		    "Germanic Pantheon", "R1b");
    static public Clans AngloSaxon = new Claddddns("Centum", "Germanic", "Old English", "Nothern Germany", "500AD",
		    "Germanic Pantheon", "R1b");
    static public Clans Thuringii = new Clans("Centum", "Germanic", "East Central German", "Central Germany", "300AD",
		    "Germanic Pantheon", "R1b");
    static public Clans Norse = new Clans("Centum", "Germanic", "East old Norse", "Scandinavia", "800AD",
		    "Germanic Pantheon", "R1b/R1a");
    static public Clans Gothic = new Clans("Centum", "Germanic", "Gothic", "Gotland", "800AD", "Germanic Pantheon",
		    "R1b/R1a");
    static public Clans Herules = new Clans("Centum", "Germanic", "Gothic", "Gotland", "800AD", "Germanic Pantheon",
		    "R1b/R1a");
    static public Clans Vendals = new Clans("Centum", "Germanic", "Gothic", "Gotland", "800AD", "Germanic Pantheon",
		    "R1b/R1a");

    // Slavic Clans
    static public Clans Rus = new Clans("Satem", "Slavic", "Old East Slavic", "Keiv, Ukraine", "879 AD",
		    "Germanic, Slavic, Uralic Pantheons & Christianity", "R1a, I1");
    static public Clans Antes = new Clans("Satem", "Slavic", "Proto-Slavic", "Lower Danube", "600AD", "Slavic Pantheon",
		    "R1a");
    static public Clans Dulebes = new Clans("Satem", "Slavic", "Old East Slavic ", "Western Volhynia", "700 BC",
		    "Slavic Pantheon", "R1a");
    static public Clans Veneti = new Clans("Satem", "Slavic", "Proto-Slavic", "Central Europe", "1 AD",
		    "Slavic Pantheon", "R1a");
    static public Clans Moravians = new Clans("Satem", "Slavic", "Old Church Slavic", "Gotland", "800 AD",
		    "Slavic Pantheon", "R1a");
    static public Clans Polans = new Clans("Satem", "Slavic", "Gothic", "Gotland", "800AD", "Slavic Pantheon", "R1a");
    static public Clans Sclaveni = new Clans("Satem", "Slavic", "Gothic", "Gotland", "800AD", "Slavic Pantheon", "R1a");

    // Main
    //=====================================================================================================================
    // Main Method
    public static void main(String[] args) {

	System.out.println("1. Directory   2. Game\n" + "3. About   4. Quit");
	try {
	    Thread.sleep(1000);
	} catch (InterruptedException e) {

	    System.exit(0);
	}
	System.out.print(".");
	try {
	    Thread.sleep(1000);
	} catch (InterruptedException e) {

	    System.exit(0);
	}
	System.out.print(".");
	try {
	    Thread.sleep(1000);
	} catch (InterruptedException e) {

	    System.exit(0);
	}
	System.out.print(".");
	try {
	    Thread.sleep(1000);
	} catch (InterruptedException e) {

	    System.exit(0);
	}
	System.out.print(".");
	try {
	    Thread.sleep(1000);
	} catch (InterruptedException e) {

	    System.exit(0);
	}
	System.out.println(".");
	try {
	    Thread.sleep(1000);
	} catch (InterruptedException e) {

	    System.exit(0);
	} // 10000ms = 10s
	System.out.println("Type in a option:");
	StartProgram();

    }

    // Methods
    //=====================================================================================================================
    public static void StartProgram() {
	Scanner Start = new Scanner(System.in);
	String startCommand = Start.next();

	if (startCommand.equalsIgnoreCase("Directory")) {

	    while (run) {
		System.out.println("Directory: -->>   ");
		Directory();
	    }

	} else {
	    StartProgram();
	}
    }

    // Access Directory method--
    public static String Directory() {

	printDialects();

	return Directory();
    }

    // Prints out Centum Language Family
    public static String CentumList() {
	Centum = new String("\n1. Italic    2. Hellenic\n" + "3. Germanic  4. Celtic\n" + "5. Anatolian 6. Tocharian");
	return Centum;
    }

    // Prints out Satem Language Family
    public static String SatemList() {
	Satem = new String("\n1. Slavic   2. Baltic\n" + "3. Albanian 4. Armanian \n" + "5. Dardic   6. Indic    7. Iranic");
	return Satem;

    }

    // Prints out Germanic Clans list
    public static String GermanicClans() {
	GermanicClans = new String("\n1. Alemanni   2. Thuringii\n" + "3. Anglo-Saxons 4. Norse \n" + "5. Goths   6. Herules    7.Vendals ");
	return GermanicClans;
    }

    public static String SlavicClans() {
	SlavicClans = new String("\n1. Rus   2. Antes\n" + "3. Dulebes 4. Ventis \n" + "5. Moravians   6. Polans    7. Sclaveni ");
	return SlavicClans;
    }

    // Prints out Language Family based on Dialect Selection
    public static String printDialects() {
	System.out.println("                  *** Enter a Dialect ***");
	System.out.println("1. Centum\n2. Satem");
	System.out.println("------------------------------------------------------");
	printLanguageFamily();
	return printDialects();
    }

    public static String printLanguageFamily() {

	Scanner K1 = new Scanner(System.in);
	String Dialect = K1.next();
	if (Dialect.equalsIgnoreCase("Centum") || Dialect.equalsIgnoreCase("centum") || Dialect.equals("1")) {
	    System.out.println("               *** Choose a Language Family ***");
	    System.out.println("------------------------------------------------------");
	    System.out.println(CentumList());
	    K1.nextLine();
	} else if (Dialect.equalsIgnoreCase("Satem") || Dialect.equalsIgnoreCase("satem") || Dialect.equals("2")) {
	    System.out.println("               *** Choose a Language Family ***");
	    System.out.println("------------------------------------------------------");
	    System.out.println(SatemList());
	    K1.nextLine();
	} else {
	    System.out.println("Invlaid");
	    printDialects();
	    K1.nextLine();
	}

	printClans();
	return printLanguageFamily();
    }

    // Prints out list of Clans from Language Family
    public static String printClans() {
	Scanner K2 = new Scanner(System.in);
	String LGF = K2.next();

	if (LGF.equalsIgnoreCase("Germanic") || LGF.equals("3")) {
	    System.out.println("                   *** Choose a Clan ***");
	    System.out.print("------------------------------------------------------");
	    System.out.println(GermanicClans());
	    K2.nextLine();
	} else if (LGF.equalsIgnoreCase("Slavic") || LGF.equals("1")) {
	    System.out.println("                   *** Choose a Clan ***");
	    System.out.print("------------------------------------------------------");
	    System.out.println(SlavicClans());
	    K2.nextLine();
	} else {
	    System.out.printf("Invalid");
	    printLanguageFamily();
	}

	printClanInfo();
	return printClans();
    }

    // Prints out Clan information when chosen
    public static String printClanInfo() {

	Scanner K3 = new Scanner(System.in);
	Scanner K4 = new Scanner(System.in);
	String Germanic = K3.next();
	String Slavic = K4.next();

	//GermanicClansInfo----------************-----------************

	if (Germanic.equalsIgnoreCase("Alemanni") || Germanic.equals("1")) {
	    System.out.println("\n*** Clan Information: Alemanni ***");
	    System.out.println("------------------------------------------------------");
	    System.out.println(Alemanni.getInfo());
	    System.out.println("=====================================================");
	    K3.nextLine();
	} else if (Germanic.equalsIgnoreCase("Thuringii") || Germanic.equals("2")) {
	    System.out.println("\n*** Clan Information: Thuringii ***");
	    System.out.println("------------------------------------------------------");
	    System.out.println(Thuringii.getInfo());
	    System.out.println("=====================================================");
	    K3.nextLine();
	} else if (Germanic.equalsIgnoreCase("Anglo-Saxon") || Germanic.equals("3")) {
	    System.out.println("\n*** Clan Information: Anglo-Saxons ***");
	    System.out.println("------------------------------------------------------");
	    System.out.println(AngloSaxon.getInfo());
	    System.out.println("=====================================================");
	    K3.nextLine();
	} else if (Germanic.equalsIgnoreCase("Norse") || Germanic.equals("4")) {
	    System.out.println("\n*** Clan Information: Norse ***");
	    System.out.println("------------------------------------------------------");
	    System.out.println(Norse.getInfo());
	    System.out.println("=====================================================");
	    K3.nextLine();
	} else if (Germanic.equalsIgnoreCase("Gothic") || Germanic.equals("5")) {
	    System.out.println("\n*** Clan Information: Goithic ***");
	    System.out.println("------------------------------------------------------");
	    System.out.println(Gothic.getInfo());
	    System.out.println("=====================================================");
	    K3.nextLine();
	} else if (Germanic.equalsIgnoreCase("Herules") || Germanic.equals("6")) {
	    System.out.println("\n*** Clan Information: Herules ***");
	    System.out.println("------------------------------------------------------");
	    System.out.println(Herules.getInfo());
	    System.out.println("=====================================================");
	    K3.nextLine();
	} else if (Germanic.equalsIgnoreCase("Vendals") || Germanic.equals("7")) {
	    System.out.println("\n*** Clan Information: Vendals ***");
	    System.out.println("------------------------------------------------------");
	    System.out.println(Vendals.getInfo());
	    System.out.println("=====================================================");
	    K3.nextLine();
	} else if (Germanic.equalsIgnoreCase("Back")) {
	    System.out.flush();
	    printDialects();
	} else {
	    System.out.println("Invalid");
	    System.out.flush();
	    printDialects();
	}

	    //SlavicClansInfo----------************-----------************

	    if (Slavic.equalsIgnoreCase("Rus") || Slavic.equals("1")) {
		System.out.println("\n*** Clan Information: Rus ***");
		System.out.println("------------------------------------------------------");
		System.out.println(Rus.getInfo());
		System.out.println("=====================================================");
	    } else if (Slavic.equalsIgnoreCase("Antes") || Slavic.equals("2")) {
		System.out.println("\n*** Clan Information: Antes ***");
		System.out.println("------------------------------------------------------");
		System.out.println(Antes.getInfo());
		System.out.println("=====================================================");
	    } else if (Slavic.equalsIgnoreCase("Dulebes") || Slavic.equals("3")) {
		System.out.println("\n*** Clan Information: Dulebes ***");
		System.out.println("------------------------------------------------------");
		System.out.println(Dulebes.getInfo());
		System.out.println("=====================================================");
	    } else if (Slavic.equalsIgnoreCase("Veneti") || Slavic.equals("4")) {
		System.out.println("\n*** Clan Information: Veneti ***");
		System.out.println("------------------------------------------------------");
		System.out.println(Veneti.getInfo());
		System.out.println("=====================================================");
	    } else if (Slavic.equalsIgnoreCase("Moravians") || Slavic.equals("5")) {
		System.out.println("\n*** Clan Information: Moravians ***");
		System.out.println("------------------------------------------------------");
		System.out.println(Moravians.getInfo());
		System.out.println("=====================================================");
	    } else if (Slavic.equalsIgnoreCase("Polans") || Slavic.equals("6")) {
		System.out.println("\n*** Clan Information: Polans ***");
		System.out.println("------------------------------------------------------");
		System.out.println(Polans.getInfo());
		System.out.println("=====================================================");
	    } else if (Slavic.equalsIgnoreCase("Sclaveni") || Slavic.equals("7")) {
		System.out.println("\n*** Clan Information: Sclaveni ***");
		System.out.println("------------------------------------------------------");
		System.out.println(Sclaveni.getInfo());
		System.out.println("=====================================================");
	    } else if (Slavic.equalsIgnoreCase("Back")) {
		System.out.flush();
		printDialects();
	    } else {
		System.out.println("Invalid");
		System.out.flush();
		printDialects();
	    }

	return printClanInfo();
    }



    }