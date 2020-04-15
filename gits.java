package gist;

         import java.net.MalformedURLException;
         import cucumber.selenium.selenium.seleniumFunction;
         import cucumber.api.PendingException;
         import cucumber.api.java.en.Given;
         import cucumber.api.java.en.Then;
         import cucumber.api.java.en.When;

         public class gist {
			seleniumFunction sf = new seleniumFunction();
			public void user_gits () throws MalformedURLException,InterruptedException{
			
			sf.createDriver();
			sf.shopeeGIST();
			}
			public void add_new(){
      case "create" :
			sf.clickAdd();
			sf.addPublic(); 
      break;
      case "add"
      sf.displayed_add_updated();
			}
public void user_edit_an_existing_gist(){
			case "edit":
    		       sf.clickDetailGist;
			sf.EditExisting ;
			sf.displayed_add_updated;
      break;
      case "delete":
			sf.GistDelete();
			}
			public void seeGist(){
			sf.shopeeGIST();
			public void displayed_list_all_gist(){
			sf.shopeeGIST();
			}
	}
