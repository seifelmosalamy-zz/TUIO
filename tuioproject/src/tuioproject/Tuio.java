package tuioproject;
import java.io.*;
import java.net.*;

import TUIO.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;


class Tuio 
     
{   
    public static void main(String args[]) throws Exception 
      {  
          
          Tuio listener = new Tuio();

    
          //Server c = new Server();
         
            TuioObjects app = new TuioObjects();
            TuioClient client = new TuioClient();
            client.addTuioListener(app);
            client.connect();
            
             
             // c.ServerC();
            
         // TuioCursor  y;
       // y = new TuioCursor(y);
         
         
     
         
                    
                    
       
          
      }}

   
   