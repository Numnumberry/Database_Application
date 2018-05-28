import java.sql.*;
import java.util.ArrayList;

public class GroupProject {
    
    private static String tempUsername;         //these fields are for checking for match during login
    private static String tempPassword;         
    
    public int tid;                             //these fields hold single pieces of info about trainer
    public String username;                     //that are displayed upon login
    public String password;
    public String gender;
    public String bday;
    public int tlevel;
    public String team;
    
    public ArrayList<Integer> pidList = new ArrayList<>();          //these lists keep track of captured info
    public ArrayList<String> pnameList = new ArrayList<>();
    public ArrayList<String> whereList = new ArrayList<>();
    public ArrayList<String> whenList = new ArrayList<>();
    public ArrayList<Integer> levelList = new ArrayList<>();
    public ArrayList<Integer> statList = new ArrayList<>();
    
    public ArrayList<String> fullPokedexList = new ArrayList<>();   //these lists keep track of all pokemon info
    public ArrayList<String> fullPokemonList = new ArrayList<>();
    public ArrayList<Integer> fullStatList = new ArrayList<>();
    
    public ArrayList<String> fullTrainerList = new ArrayList<>();   //these lists keep track of all trainer info
    public ArrayList<Integer> fullTidList = new ArrayList<>();
    public ArrayList<String> fullTrainerPassList = new ArrayList<>();
    
    public String login(String loginName, String loginPass) {               //login methods will check to see if
        if (loginName.equals("admin") && loginPass.equals("password")) {    //admin, user, or no match
            return loginName;
        } else if (checkMatch(loginName, loginPass) == true) {
            return loginName;
        } else {
            return "@";
        }
    }
    
    public boolean checkMatch(String loginName, String loginPass) {     //this method collects every username and password
        boolean matchFound = false;                                     //and runs a loop to see if any 2 match with login
        Connection c = null;                                            //information
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:GroupProject.db");
            c.setAutoCommit(false);
            stmt = c.createStatement();
            String query = "select username, password from trainers;";
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {
                tempUsername = rs.getString("username");
                tempPassword = rs.getString("password");
                
                if (tempUsername.equals(loginName) && tempPassword.equals(loginPass)) {
                    matchFound = true;
                }
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return matchFound;
    }
    
    public void getFullTrainerList() {                              //methods fills lists with all usernames, passwords, and tid's
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:GroupProject.db");
            c.setAutoCommit(false);

            fullTrainerList.clear();                                            //clears list to repopulate
            fullTidList.clear();                                                //clears list to repopulate
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("select username, password, tid from trainers order by tid;");
            while (rs.next()) {                                                 //loop gets all usernames, passwords, and tid's in order by tid
                fullTrainerList.add(rs.getString("username"));
                fullTrainerPassList.add(rs.getString("password"));
                fullTidList.add(rs.getInt("tid"));
            }
            getPokemonNamesAndStats();
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
    
    public void registerTrainer(String username, String password, char gender, String team, String bday, int tid, int tlevel) {
        Connection c = null;                                                        //this method will insert a trainer with passed argument info
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:GroupProject.db");
            c.setAutoCommit(false);

            stmt = c.createStatement();
            String query = "insert into trainers (tid, username, password, gender, bday, tlevel, team) " +
                           "values ("+tid+", "+"'"+username+"'"+", "+"'"+password+"'"+", "+"'"+gender+"'"+", "+"'"+bday+"'"+", "+tlevel+", "+"'"+team+"'"+");";
                  
            stmt.executeUpdate(query);    
            stmt.close();
            c.commit();
            c.close();
        } catch ( Exception e ) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
    
    public void insertIntoCaptured(int tid, int pid, String date, String city, int plevel) { //method will give trainers captured pokemon
        Connection c = null;                                                                 //and info about the capture
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:GroupProject.db");
            c.setAutoCommit(false);

            stmt = c.createStatement();
            String query = "insert into captured (tid, pid, date, city, plevel) " +
                           "values ("+tid+", "+pid+", "+"'"+date+"'"+", "+"'"+city+"'"+", "+plevel+");";
                  
            stmt.executeUpdate(query);    
            stmt.close();
            c.commit();
            c.close();
        } catch ( Exception e ) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
    
    public int getTidValue() {                                         //method finds tid to use upon insertion of new trainer
        int counter = 1;
        for (int j = 0; j < fullTidList.size(); j++) {                 //loop checks to see if any gaps in list of tid's
            if (counter != fullTidList.get(j)) {
                return counter;                                        //if so, then set the new tid as the one to fill the gap
            }
            counter++;
        }
        return fullTidList.size() + 1;                                 //if no gap, then add to the end of the list
    }
    
    public void modify(String query) {                                 //this loop simply modifies info in DB with passed query
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:GroupProject.db");
            c.setAutoCommit(false);
            
            stmt = c.createStatement();
            stmt.executeUpdate(query);
            c.commit();
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
    
    public void delete(String query) {              //deletes info in DB specified in query
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:GroupProject.db");
            c.setAutoCommit(false);

            stmt = c.createStatement();
            stmt.executeUpdate(query);    
            stmt.close();
            c.commit();
            c.close();
        } catch ( Exception e ) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
    
    public void insertIntoPokemon(int pid, String pname, int hp, int atk, int def, int spatk, int spdef, int speed) {
        Connection c = null;                                                            //this method adds a new pokemon to DB
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:GroupProject.db");
            c.setAutoCommit(false);

            stmt = c.createStatement();
            String query = "insert into pokemon (pid, pname, hp, atk, def, spatk, spdef, speed) " +
                           "values ("+pid+", "+"'"+pname+"'"+", "+hp+", "+atk+", "+def+", "+spatk+", "+spdef+", "+speed+");";
                  
            stmt.executeUpdate(query);    
            stmt.close();
            c.commit();
            c.close();
        } catch ( Exception e ) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
    
    public void getCapturedInfo(String query) {             //method finds all the pokemon owned by a trainer and information about them
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:GroupProject.db");
            c.setAutoCommit(false);

            pidList.clear();                            //clear all previous lists to be repopulated
            whereList.clear();
            whenList.clear();
            levelList.clear();
            
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {                         //loop puts info of owned pokemon into multiple lists
                pidList.add(rs.getInt("pid"));
                whereList.add(rs.getString("city"));
                whenList.add(rs.getString("date"));
                levelList.add(rs.getInt("plevel"));
            }
            getPokemonNamesAndStats();
            rs.close();
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
    
    public void getPokemonNamesAndStats() {                             //method fills lists with all pokemon info and info
        Connection c = null;                                            //for which a single trainer has caught
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:GroupProject.db");
            c.setAutoCommit(false);

            fullStatList.clear();                                               //clears stat, dex lists to repopulate
            fullPokedexList.clear();
            fullPokemonList.clear();
            
            stmt = c.createStatement();
            ResultSet rs;
            ResultSet rs2 = stmt.executeQuery("select * from pokemon;");
            
            int dexNum = 1;
            while (rs2.next()) {
                fullStatList.add(rs2.getInt("hp"));
                fullStatList.add(rs2.getInt("atk"));
                fullStatList.add(rs2.getInt("def"));
                fullStatList.add(rs2.getInt("spatk"));
                fullStatList.add(rs2.getInt("spdef"));
                fullStatList.add(rs2.getInt("speed"));
                fullPokemonList.add(rs2.getString("pname"));
                if (dexNum < 10) {
                    fullPokedexList.add("00" + dexNum + ". " + rs2.getString("pname"));
                }
                else if (dexNum < 100) {
                    fullPokedexList.add("0" + dexNum + ". " + rs2.getString("pname")); 
                }
                else {
                    fullPokedexList.add(dexNum + ". " + rs2.getString("pname"));
                }
                dexNum++;
            }
            
            for (int x = 0; x < pidList.size(); x++) {                          //fills arrays with actual pokemon names and stats
                rs = stmt.executeQuery("select * from Pokemon where pid = " + pidList.get(x) + ";");
                pnameList.add(rs.getString("pname"));                           
                statList.add(rs.getInt("hp"));
                statList.add(rs.getInt("atk"));
                statList.add(rs.getInt("def"));
                statList.add(rs.getInt("spatk"));
                statList.add(rs.getInt("spdef"));
                statList.add(rs.getInt("speed"));
                rs.close();
            }
            rs2.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
    
    public void getTrainerTid(String query) {                       //finds the tid of a trainer with a specific username
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:GroupProject.db");
            c.setAutoCommit(false);

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                tid = rs.getInt("tid");
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
    
    public void selectionTrainers(String query) {       //selects info of one particular trainer
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:GroupProject.db");
            c.setAutoCommit(false);

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                tid = rs.getInt("tid");
                username = rs.getString("username");
                password = rs.getString("password");
                gender = rs.getString("gender");
                bday = rs.getString("bday");
                tlevel = rs.getInt("tlevel");
                team = rs.getString("team");
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
}