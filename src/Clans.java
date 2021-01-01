
public class Clans {
    // Attributes
//=====================================================================================================================
    String Dialect;
    String LanguageFamily;
    String Toungue;
    String Location;
    String Age;
    String Religion;
    String Haplogroup;

    // Constructor
//=====================================================================================================================
    public Clans(String Dialect, String LanguageFamily, String Toungue, String Location, String Age, String Religion,
	    String Haplogroup) {
	this.Dialect = Dialect;
	this.LanguageFamily = LanguageFamily;
	this.Toungue = Toungue;
	this.Location = Location;
	this.Age = Age;
	this.Religion = Religion;
	this.Haplogroup = Haplogroup;
    }

    // Methods
//=====================================================================================================================
    public String getInfo() {

	return "Dialect: " + Dialect + "\nLanguage Family: " + LanguageFamily + "\nToungue: " + Toungue
		+ "\nLocation: " + Location + "\nAge: " + Age + "\nReligion: " + Religion + "\nHaplogroup: "
		+ Haplogroup;
    }

    public static void main(String[] args) {

    }

}
