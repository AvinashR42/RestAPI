package pojo;

public class TestPayloadBuild {
	
	public AddBook addbook() {
		
		AddBook ab = new AddBook();
		ab.setName("RestAPI");
		ab.setIsbn("bndfgt");
		ab.setAisle(12345);
		ab.setAuthor("Prem Rathore");
		
		return ab;
	}

}
