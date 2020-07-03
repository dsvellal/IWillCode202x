public class NestedIfConditions{

     public static void main(String []args){
         
        final boolean officeTransportationIsAvailable = false;
        final boolean olaCabIsAvailable = false;
        final boolean iCanGoWithMyFriend = false ;
        if (officeTransportationIsAvailable){
         
        System.out.println(" I will take office bus");
        }
        if(olaCabIsAvailable){
        System.out.println("I will go with ola cab"); 
        }
        if(iCanGoWithMyFriend){
        System.out.println("I will go with my friend");    
        }
        else
        { 
        System.out.println("I will opt for emergency cab service from office");
    }
        }
     }
