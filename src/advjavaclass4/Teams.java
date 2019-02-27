/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advjavaclass4;

/**
 *
 * @author tyler
 */


public enum Teams {
   
        PACKERS ("Green Bay", "Packers"),
        VIKINGS ("Minnesota" , "Vikings"),
        BEARS ("Chicago", "Bears"),
        LIONS("Detroit", "Lions");
      
         private String city, team;
         Teams(String city, String team)
         {
         this.city = city;
         this.team = team;
          }
               public String getCity()
               {
               return city;
               }
               public String getTeam()
               {
               return team;
               }
}
