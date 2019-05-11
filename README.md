## Spring Development Process (DI)

### Inject Types 
   There are many types of injection with spring
   
   1. Constructor Injection
   2. Setter Injection
   
  Process : 
    
    1. Define the dependency Interface and class
    2. Create a Contructor in your class For Injections.
    3. Configure the dependency injection in Spring cofig file.
    
    
  
  Codes : 
  
      1.    <bean id="myFortune" 
                     class="com.ovi.springdemo.HappyFortuneService">
                   </bean>
  
       2.   <bean id="trackCoach" class="com.ovi.springdemo.TrackCoach">
                     <!--set up constructor injection -->
                     <constructor-arg ref="myFortune" />
                 </bean>
  
     3.    <bean id="myCricketCouch" class="com.ovi.springdemo.CricketCoach">
             <!--set up Setter  -->
                    <property name="fortuneService" ref="myFortune"/>
                  </bean>  
 
 
 
Enplaning :   
    
     1. FortuneService myFortune = new HappyFortuneService();
     
     2.  Coach trackCoach = new TrackCoach(myFortune); 
     
     3.     public void setFortuneService(FortuneService fortuneService) {
                  System.out.println("CricketCouch : inside Setter Method .");
                  this.fortuneService = fortuneService;
              }