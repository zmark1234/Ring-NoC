package javaapplication7;

import java.io.IOException;


public class RingNoC51 {
    
    IPnode ip1;
    IPnode ip2;
    IPnode ip3;
    IPnode ip4;
    IPnode ip5;
    IPnode ip6;
    IPnode ip7;
    IPnode ip8;
    IPnode ip9;
    IPnode ip10;
    IPnode ip11;
    IPnode ip12;
    IPnode ip13;
    IPnode ip14;
    IPnode ip15;
    IPnode ip16;
    IPnode ip17;
    IPnode ip18;
    IPnode ip19;
    IPnode ip20;
    IPnode ip21;
    IPnode ip22;
    IPnode ip23;
    IPnode ip24;
    IPnode ip25;
    IPnode ip26;
    IPnode ip27;
    IPnode ip28;
    IPnode ip29;
    IPnode ip30;
    IPnode ip31;
    IPnode ip32; 
    IPnode ip33;
    IPnode ip34;
    IPnode ip35;
    IPnode ip36;
    IPnode ip37;
    IPnode ip38;
    IPnode ip39;
    IPnode ip40;
    IPnode ip41;
    IPnode ip42;
    IPnode ip43;
    IPnode ip44;
    IPnode ip45;
    IPnode ip46;
    IPnode ip47;
    IPnode ip48; 
    IPnode ip49;
    IPnode ip50;
    IPnode ip51;

    Link l1 = new Link();
    Link l2 = new Link();
    Link l3 = new Link();
    Link l4 = new Link();
    Link l5 = new Link();
    Link l6 = new Link();
    Link l7 = new Link();
    Link l8 = new Link();
    Link l9 = new Link();
    Link l10 = new Link();
    Link l11 = new Link();
    Link l12 = new Link();
    Link l13 = new Link();
    Link l14 = new Link();
    Link l15 = new Link();
    Link l16 = new Link();   
    Link l17 = new Link();
    Link l18 = new Link();
    Link l19 = new Link();
    Link l20 = new Link();
    Link l21 = new Link();
    Link l22 = new Link();
    Link l23 = new Link();
    Link l24 = new Link();
    Link l25 = new Link();
    Link l26 = new Link();
    Link l27 = new Link();
    Link l28 = new Link();
    Link l29 = new Link();
    Link l30 = new Link();
    Link l31 = new Link();
    Link l32 = new Link(); 
    Link l33 = new Link();
    Link l34 = new Link();
    Link l35 = new Link();
    Link l36 = new Link();
    Link l37 = new Link();
    Link l38 = new Link();
    Link l39 = new Link();
    Link l40 = new Link();
    Link l41 = new Link();
    Link l42 = new Link();
    Link l43 = new Link();
    Link l44 = new Link();
    Link l45 = new Link();
    Link l46 = new Link();
    Link l47 = new Link();
    Link l48 = new Link();
    Link l49 = new Link();
    Link l50 = new Link();
    Link l51 = new Link();
    
    Switch switchIP1 = new Switch(1);
    Switch switchIP2 = new Switch(2);
    Switch switchIP3 = new Switch(3);
    Switch switchIP4 = new Switch(4);
    Switch switchIP5 = new Switch(5);
    Switch switchIP6 = new Switch(6);
    Switch switchIP7 = new Switch(7);
    Switch switchIP8 = new Switch(8);
    Switch switchIP9 = new Switch(9);
    Switch switchIP10 = new Switch(10);
    Switch switchIP11 = new Switch(11);
    Switch switchIP12 = new Switch(12);
    Switch switchIP13 = new Switch(13);
    Switch switchIP14 = new Switch(14);
    Switch switchIP15 = new Switch(15);
    Switch switchIP16 = new Switch(16);
    Switch switchIP17 = new Switch(17);
    Switch switchIP18 = new Switch(18);
    Switch switchIP19 = new Switch(19);
    Switch switchIP20 = new Switch(20);
    Switch switchIP21 = new Switch(21);
    Switch switchIP22 = new Switch(22);
    Switch switchIP23 = new Switch(23);
    Switch switchIP24 = new Switch(24);
    Switch switchIP25 = new Switch(25);
    Switch switchIP26 = new Switch(26);
    Switch switchIP27 = new Switch(27);
    Switch switchIP28 = new Switch(28);
    Switch switchIP29 = new Switch(29);
    Switch switchIP30 = new Switch(30);
    Switch switchIP31 = new Switch(31);
    Switch switchIP32 = new Switch(32);
    Switch switchIP33 = new Switch(33);
    Switch switchIP34 = new Switch(34);
    Switch switchIP35 = new Switch(35);
    Switch switchIP36 = new Switch(36);
    Switch switchIP37 = new Switch(37);
    Switch switchIP38 = new Switch(38);
    Switch switchIP39 = new Switch(39);
    Switch switchIP40 = new Switch(40);  
    Switch switchIP41 = new Switch(41);
    Switch switchIP42 = new Switch(42);
    Switch switchIP43 = new Switch(43);
    Switch switchIP44 = new Switch(44);
    Switch switchIP45 = new Switch(45);
    Switch switchIP46 = new Switch(46);
    Switch switchIP47 = new Switch(47);
    Switch switchIP48 = new Switch(48);
    Switch switchIP49 = new Switch(49);
    Switch switchIP50 = new Switch(50);
    Switch switchIP51 = new Switch(51);

    Taskset  theTaskSet = new Taskset();
    
    Gui gui = new Gui();    
        
    Clock clock = new Clock();

    void initialise() throws InterruptedException, IOException { 
    
    theTaskSet.loadCaseStudy();
    
    clock.targetPeriod = theTaskSet.targetPeriod;

//    gui.setVisible(true);

    ip1 = new IPnode(IP.PROCESSOR, 1);
    ip2 = new IPnode(IP.PROCESSOR, 2);
    ip3 = new IPnode(IP.PROCESSOR, 3);
    
    ip4 = new IPnode(IP.PROBE, 4);
   
    ip5 = new IPnode(IP.PROCESSOR, 5);
    
    ip6 = new IPnode(IP.PROBE, 6);

    ip7 = new IPnode(IP.PROCESSOR, 7);
    ip8 = new IPnode(IP.PROCESSOR, 8);
    ip9 = new IPnode(IP.PROCESSOR, 9);
    ip10 = new IPnode(IP.PROCESSOR, 10);
    ip11 = new IPnode(IP.PROCESSOR, 11);
    ip12 = new IPnode(IP.PROCESSOR, 12);
    ip13 = new IPnode(IP.PROCESSOR, 13);
    ip14 = new IPnode(IP.PROCESSOR, 14);
    ip15 = new IPnode(IP.PROCESSOR, 15);
    ip16 = new IPnode(IP.PROCESSOR, 16);
    ip17 = new IPnode(IP.PROCESSOR, 17);
    ip18 = new IPnode(IP.PROCESSOR, 18);
    ip19 = new IPnode(IP.PROCESSOR, 19);
    ip20 = new IPnode(IP.PROCESSOR, 20);
    ip21 = new IPnode(IP.PROCESSOR, 21);
    ip22 = new IPnode(IP.PROCESSOR, 22);
    ip23 = new IPnode(IP.PROCESSOR, 23);
    ip24 = new IPnode(IP.PROCESSOR, 24);
    ip25 = new IPnode(IP.PROCESSOR, 25);
    ip26 = new IPnode(IP.PROCESSOR, 26);
    ip27 = new IPnode(IP.PROCESSOR, 27);
    ip28 = new IPnode(IP.PROCESSOR, 28);
    ip29 = new IPnode(IP.PROCESSOR, 29);
    ip30 = new IPnode(IP.PROCESSOR, 30);
    ip31 = new IPnode(IP.PROCESSOR, 31);
    ip32 = new IPnode(IP.PROCESSOR, 32);
    ip33 = new IPnode(IP.PROCESSOR, 33);
    ip34 = new IPnode(IP.PROCESSOR, 34);
    ip35 = new IPnode(IP.PROCESSOR, 35);
    ip36 = new IPnode(IP.PROCESSOR, 36); 
    ip37 = new IPnode(IP.PROCESSOR, 37);
    ip38 = new IPnode(IP.PROCESSOR, 38);
    ip39 = new IPnode(IP.PROCESSOR, 39);
    ip40 = new IPnode(IP.PROCESSOR, 40);
    ip41 = new IPnode(IP.PROCESSOR, 41);
    ip42 = new IPnode(IP.PROCESSOR, 42);
    ip43 = new IPnode(IP.PROCESSOR, 43);
    ip44 = new IPnode(IP.PROCESSOR, 44);
    ip45 = new IPnode(IP.PROCESSOR, 45);
    ip46 = new IPnode(IP.PROCESSOR, 46);
    ip47 = new IPnode(IP.PROCESSOR, 47);
    ip48 = new IPnode(IP.PROCESSOR, 48);   
    ip49 = new IPnode(IP.PROCESSOR, 49);
    ip50 = new IPnode(IP.PROCESSOR, 50);
    ip51 = new IPnode(IP.PROCESSOR, 51);

    gui.ipCores [0] = ip1;     
    gui.ipCores [1] = ip2;
    gui.ipCores [2] = ip3;
    gui.ipCores [3] = ip4;
    gui.ipCores [4] = ip5;
    gui.ipCores [5] = ip6;
    gui.ipCores [6] = ip7;
    gui.ipCores [7] = ip8;    
    gui.ipCores [8] = ip9;     
    gui.ipCores [9] = ip10;
    gui.ipCores [10] = ip11;
    gui.ipCores [11] = ip12;
    gui.ipCores [12] = ip13;
    gui.ipCores [13] = ip14;
    gui.ipCores [14] = ip15;
    gui.ipCores [15] = ip16;       
    gui.ipCores [16] = ip17;     
    gui.ipCores [17] = ip18;
    gui.ipCores [18] = ip19;
    gui.ipCores [19] = ip20;
    gui.ipCores [20] = ip21;
    gui.ipCores [21] = ip22;
    gui.ipCores [22] = ip23;
    gui.ipCores [23] = ip24;    
    gui.ipCores [24] = ip25;     
    gui.ipCores [25] = ip26;
    gui.ipCores [26] = ip27;
    gui.ipCores [27] = ip28;
    gui.ipCores [28] = ip29;
    gui.ipCores [29] = ip30;
    gui.ipCores [30] = ip31;
    gui.ipCores [31] = ip32;
    gui.ipCores [32] = ip33;
    gui.ipCores [33] = ip34;
    gui.ipCores [34] = ip35;
    gui.ipCores [35] = ip36;   
    gui.ipCores [36] = ip37;     
    gui.ipCores [37] = ip38;
    gui.ipCores [38] = ip39;
    gui.ipCores [39] = ip40;
    gui.ipCores [40] = ip41;     
    gui.ipCores [41] = ip42;
    gui.ipCores [42] = ip43;
    gui.ipCores [43] = ip44;
    gui.ipCores [44] = ip45;
    gui.ipCores [45] = ip46;
    gui.ipCores [46] = ip47;
    gui.ipCores [47] = ip48;
    gui.ipCores [48] = ip49;     
    gui.ipCores [49] = ip50;
    gui.ipCores [50] = ip51;
    
    ip1.theGui = gui;
    ip2.theGui = gui;
    ip3.theGui = gui;
    ip4.theGui = gui;
    ip5.theGui = gui;
    ip6.theGui = gui;
    ip7.theGui = gui;
    ip8.theGui = gui;
    ip9.theGui = gui;
    ip10.theGui = gui;
    ip11.theGui = gui;
    ip12.theGui = gui;
    ip13.theGui = gui;
    ip14.theGui = gui;
    ip15.theGui = gui;
    ip16.theGui = gui;
    ip17.theGui = gui;
    ip18.theGui = gui;
    ip19.theGui = gui;
    ip20.theGui = gui;
    ip21.theGui = gui;
    ip22.theGui = gui;
    ip23.theGui = gui;
    ip24.theGui = gui;
    ip25.theGui = gui;
    ip26.theGui = gui;
    ip27.theGui = gui;
    ip28.theGui = gui;
    ip29.theGui = gui;
    ip30.theGui = gui;
    ip31.theGui = gui;
    ip32.theGui = gui;
    ip33.theGui = gui;
    ip34.theGui = gui;
    ip35.theGui = gui;
    ip36.theGui = gui;
    ip37.theGui = gui;
    ip38.theGui = gui;
    ip39.theGui = gui;
    ip40.theGui = gui;
    ip41.theGui = gui;
    ip42.theGui = gui;
    ip43.theGui = gui;
    ip44.theGui = gui;
    ip45.theGui = gui;
    ip46.theGui = gui;
    ip47.theGui = gui;
    ip48.theGui = gui;
    ip49.theGui = gui;
    ip50.theGui = gui;
    ip51.theGui = gui;

    switchIP1.ipcore = ip1;
    switchIP1.incominglink = l51;
    switchIP1.outgoinglink = l1;
    switchIP1.theGui = gui;
    ip1.theSwitch = switchIP1;
    

    switchIP2.ipcore = ip2;
    switchIP2.incominglink = l1;
    switchIP2.outgoinglink = l2;
    switchIP2.theGui = gui;
    ip2.theSwitch = switchIP2;  
    

    switchIP3.ipcore = ip3;
    switchIP3.incominglink = l2;
    switchIP3.outgoinglink = l3;
    switchIP3.theGui = gui;
    ip3.theSwitch = switchIP3;  
    

    switchIP4.ipcore = ip4;
    switchIP4.incominglink = l3;
    switchIP4.outgoinglink = l4;
    switchIP4.theGui = gui;    
    ip4.theSwitch = switchIP4;  


    switchIP5.ipcore = ip5;
    switchIP5.incominglink = l4;
    switchIP5.outgoinglink = l5;
    switchIP5.theGui = gui;
    ip5.theSwitch = switchIP5;
    

    switchIP6.ipcore = ip6;
    switchIP6.incominglink = l5;
    switchIP6.outgoinglink = l6;
    switchIP6.theGui = gui;
    ip6.theSwitch = switchIP6;  
    

    switchIP7.ipcore = ip7;
    switchIP7.incominglink = l6;
    switchIP7.outgoinglink = l7;
    switchIP7.theGui = gui;
    ip7.theSwitch = switchIP7;  
    

    switchIP8.ipcore = ip8;
    switchIP8.incominglink = l7;
    switchIP8.outgoinglink = l8;
    switchIP8.theGui = gui;    
    ip8.theSwitch = switchIP8;   
    

    switchIP9.ipcore = ip9;
    switchIP9.incominglink = l8;
    switchIP9.outgoinglink = l9;
    switchIP9.theGui = gui;
    ip9.theSwitch = switchIP9;
    

    switchIP10.ipcore = ip10;
    switchIP10.incominglink = l9;
    switchIP10.outgoinglink = l10;
    switchIP10.theGui = gui;
    ip10.theSwitch = switchIP10;  
    

    switchIP11.ipcore = ip11;
    switchIP11.incominglink = l10;
    switchIP11.outgoinglink = l11;
    switchIP11.theGui = gui;
    ip11.theSwitch = switchIP11;  
    

    switchIP12.ipcore = ip12;
    switchIP12.incominglink = l11;
    switchIP12.outgoinglink = l12;
    switchIP12.theGui = gui;    
    ip12.theSwitch = switchIP12;  

 
    switchIP13.ipcore = ip13;
    switchIP13.incominglink = l12;
    switchIP13.outgoinglink = l13;
    switchIP13.theGui = gui;
    ip13.theSwitch = switchIP13;
    
  
    switchIP14.ipcore = ip14;
    switchIP14.incominglink = l13;
    switchIP14.outgoinglink = l14;
    switchIP14.theGui = gui;
    ip14.theSwitch = switchIP14;  
    
   
    switchIP15.ipcore = ip15;
    switchIP15.incominglink = l14;
    switchIP15.outgoinglink = l15;
    switchIP15.theGui = gui;
    ip15.theSwitch = switchIP15;  
    
    
    switchIP16.ipcore = ip16;
    switchIP16.incominglink = l15;
    switchIP16.outgoinglink = l16;
    switchIP16.theGui = gui;    
    ip16.theSwitch = switchIP16;   
      
    
    switchIP17.ipcore = ip17;
    switchIP17.incominglink = l16;
    switchIP17.outgoinglink = l17;
    switchIP17.theGui = gui;
    ip17.theSwitch = switchIP17;
    
    
    switchIP18.ipcore = ip18;
    switchIP18.incominglink = l17;
    switchIP18.outgoinglink = l18;
    switchIP18.theGui = gui;
    ip18.theSwitch = switchIP18;  
    
    
    switchIP19.ipcore = ip19;
    switchIP19.incominglink = l18;
    switchIP19.outgoinglink = l19;
    switchIP19.theGui = gui;
    ip19.theSwitch = switchIP19;  
    
    
    switchIP20.ipcore = ip20;
    switchIP20.incominglink = l19;
    switchIP20.outgoinglink = l20;
    switchIP20.theGui = gui;    
    ip20.theSwitch = switchIP20;  

    
    switchIP21.ipcore = ip21;
    switchIP21.incominglink = l20;
    switchIP21.outgoinglink = l21;
    switchIP21.theGui = gui;
    ip21.theSwitch = switchIP21;
    
    
    switchIP22.ipcore = ip22;
    switchIP22.incominglink = l21;
    switchIP22.outgoinglink = l22;
    switchIP22.theGui = gui;
    ip22.theSwitch = switchIP22;  
    
    
    switchIP23.ipcore = ip23;
    switchIP23.incominglink = l22;
    switchIP23.outgoinglink = l23;
    switchIP23.theGui = gui;
    ip23.theSwitch = switchIP23;  
    
    
    switchIP24.ipcore = ip24;
    switchIP24.incominglink = l23;
    switchIP24.outgoinglink = l24;
    switchIP24.theGui = gui;    
    ip24.theSwitch = switchIP24;   
    
    
    switchIP25.ipcore = ip25;
    switchIP25.incominglink = l24;
    switchIP25.outgoinglink = l25;
    switchIP25.theGui = gui;
    ip25.theSwitch = switchIP25;
    
    
    switchIP26.ipcore = ip26;
    switchIP26.incominglink = l25;
    switchIP26.outgoinglink = l26;
    switchIP26.theGui = gui;
    ip26.theSwitch = switchIP26;  
    

    switchIP27.ipcore = ip27;
    switchIP27.incominglink = l26;
    switchIP27.outgoinglink = l27;
    switchIP27.theGui = gui;
    ip27.theSwitch = switchIP27;  
    

    switchIP28.ipcore = ip28;
    switchIP28.incominglink = l27;
    switchIP28.outgoinglink = l28;
    switchIP28.theGui = gui;    
    ip28.theSwitch = switchIP28;  


    switchIP29.ipcore = ip29;
    switchIP29.incominglink = l28;
    switchIP29.outgoinglink = l29;
    switchIP29.theGui = gui;
    ip29.theSwitch = switchIP29;
    

    switchIP30.ipcore = ip30;
    switchIP30.incominglink = l29;
    switchIP30.outgoinglink = l30;
    switchIP30.theGui = gui;
    ip30.theSwitch = switchIP30;  

    switchIP31.ipcore = ip31;
    switchIP31.incominglink = l30;
    switchIP31.outgoinglink = l31;
    switchIP31.theGui = gui;
    ip31.theSwitch = switchIP31;  

    switchIP32.ipcore = ip32;
    switchIP32.incominglink = l31;
    switchIP32.outgoinglink = l32;
    switchIP32.theGui = gui;    
    ip32.theSwitch = switchIP32;
    
    switchIP33.ipcore = ip33;
    switchIP33.incominglink = l32;
    switchIP33.outgoinglink = l33;
    switchIP33.theGui = gui;
    ip33.theSwitch = switchIP33;
    
    switchIP34.ipcore = ip34;
    switchIP34.incominglink = l33;
    switchIP34.outgoinglink = l34;
    switchIP34.theGui = gui;
    ip34.theSwitch = switchIP34;  
    
    switchIP35.ipcore = ip35;
    switchIP35.incominglink = l34;
    switchIP35.outgoinglink = l35;
    switchIP35.theGui = gui;
    ip35.theSwitch = switchIP35;  
    
    switchIP36.ipcore = ip36;
    switchIP36.incominglink = l35;
    switchIP36.outgoinglink = l36;
    switchIP36.theGui = gui;    
    ip36.theSwitch = switchIP36; 
    
    switchIP37.ipcore = ip37;
    switchIP37.incominglink = l36;
    switchIP37.outgoinglink = l37;
    switchIP37.theGui = gui;    
    ip37.theSwitch = switchIP37;  

    switchIP38.ipcore = ip38;
    switchIP38.incominglink = l37;
    switchIP38.outgoinglink = l38;
    switchIP38.theGui = gui;
    ip38.theSwitch = switchIP38;
    
    switchIP39.ipcore = ip39;
    switchIP39.incominglink = l38;
    switchIP39.outgoinglink = l39;
    switchIP39.theGui = gui;
    ip39.theSwitch = switchIP39;  
    
    switchIP40.ipcore = ip40;
    switchIP40.incominglink = l39;
    switchIP40.outgoinglink = l40;
    switchIP40.theGui = gui;
    ip40.theSwitch = switchIP40;

    switchIP41.ipcore = ip41;
    switchIP41.incominglink = l40;
    switchIP41.outgoinglink = l41;
    switchIP41.theGui = gui;
    ip41.theSwitch = switchIP41;
    
    switchIP42.ipcore = ip42;
    switchIP42.incominglink = l41;
    switchIP42.outgoinglink = l42;
    switchIP42.theGui = gui;
    ip42.theSwitch = switchIP42;  
    
    switchIP43.ipcore = ip43;
    switchIP43.incominglink = l42;
    switchIP43.outgoinglink = l43;
    switchIP43.theGui = gui;
    ip43.theSwitch = switchIP43;  
    
    switchIP44.ipcore = ip44;
    switchIP44.incominglink = l43;
    switchIP44.outgoinglink = l44;
    switchIP44.theGui = gui;    
    ip44.theSwitch = switchIP44;  

    switchIP45.ipcore = ip45;
    switchIP45.incominglink = l44;
    switchIP45.outgoinglink = l45;
    switchIP45.theGui = gui;
    ip45.theSwitch = switchIP45;
    
    switchIP46.ipcore = ip46;
    switchIP46.incominglink = l45;
    switchIP46.outgoinglink = l46;
    switchIP46.theGui = gui;
    ip46.theSwitch = switchIP46;  
    
    switchIP47.ipcore = ip47;
    switchIP47.incominglink = l46;
    switchIP47.outgoinglink = l47;
    switchIP47.theGui = gui;
    ip47.theSwitch = switchIP47;  
    
    switchIP48.ipcore = ip48;
    switchIP48.incominglink = l47;
    switchIP48.outgoinglink = l48;
    switchIP48.theGui = gui;    
    ip48.theSwitch = switchIP48;  
    
    switchIP49.ipcore = ip49;
    switchIP49.incominglink = l48;
    switchIP49.outgoinglink = l49;
    switchIP49.theGui = gui;
    ip49.theSwitch = switchIP49;
    
    switchIP50.ipcore = ip50;
    switchIP50.incominglink = l49;
    switchIP50.outgoinglink = l50;
    switchIP50.theGui = gui;
    ip50.theSwitch = switchIP50;  
    
    switchIP51.ipcore = ip51;
    switchIP51.incominglink = l50;
    switchIP51.outgoinglink = l51;
    switchIP51.theGui = gui;
    ip51.theSwitch = switchIP51;     

    clock.theGui = gui;
    
    ip1.theClock = clock;
    ip2.theClock = clock;
    ip3.theClock = clock;
    ip4.theClock = clock;   
    ip5.theClock = clock;
    ip6.theClock = clock;
    ip7.theClock = clock;
    ip8.theClock = clock;
    ip9.theClock = clock;
    ip10.theClock = clock;
    ip11.theClock = clock;
    ip12.theClock = clock;   
    ip13.theClock = clock;
    ip14.theClock = clock;
    ip15.theClock = clock;
    ip16.theClock = clock;
    ip17.theClock = clock;
    ip18.theClock = clock;
    ip19.theClock = clock;
    ip20.theClock = clock;   
    ip21.theClock = clock;
    ip22.theClock = clock;
    ip23.theClock = clock;
    ip24.theClock = clock;
    ip25.theClock = clock;
    ip26.theClock = clock;
    ip27.theClock = clock;
    ip28.theClock = clock;   
    ip29.theClock = clock;
    ip30.theClock = clock;
    ip31.theClock = clock;
    ip32.theClock = clock;
    ip33.theClock = clock;
    ip34.theClock = clock;
    ip35.theClock = clock;
    ip36.theClock = clock;
    ip37.theClock = clock;
    ip38.theClock = clock;
    ip39.theClock = clock;
    ip40.theClock = clock; 
    ip41.theClock = clock;
    ip42.theClock = clock;
    ip43.theClock = clock;
    ip44.theClock = clock;   
    ip45.theClock = clock;
    ip46.theClock = clock;
    ip47.theClock = clock;
    ip48.theClock = clock;
    ip49.theClock = clock;
    ip50.theClock = clock;
    ip51.theClock = clock;
    
    switchIP1.theClock = clock;
    switchIP2.theClock = clock;
    switchIP3.theClock = clock;
    switchIP4.theClock = clock;
    switchIP5.theClock = clock;
    switchIP6.theClock = clock;
    switchIP7.theClock = clock;
    switchIP8.theClock = clock;
    switchIP9.theClock = clock;
    switchIP10.theClock = clock;
    switchIP11.theClock = clock;
    switchIP12.theClock = clock;
    switchIP13.theClock = clock;
    switchIP14.theClock = clock;
    switchIP15.theClock = clock;
    switchIP16.theClock = clock;
    switchIP17.theClock = clock;
    switchIP18.theClock = clock;
    switchIP19.theClock = clock;
    switchIP20.theClock = clock;
    switchIP21.theClock = clock;
    switchIP22.theClock = clock;
    switchIP23.theClock = clock;
    switchIP24.theClock = clock;
    switchIP25.theClock = clock;
    switchIP26.theClock = clock;
    switchIP27.theClock = clock;
    switchIP28.theClock = clock;
    switchIP29.theClock = clock;
    switchIP30.theClock = clock;
    switchIP31.theClock = clock;
    switchIP32.theClock = clock;
    switchIP33.theClock = clock;
    switchIP34.theClock = clock;
    switchIP35.theClock = clock;
    switchIP36.theClock = clock;
    switchIP37.theClock = clock;
    switchIP38.theClock = clock;
    switchIP39.theClock = clock;
    switchIP40.theClock = clock;
    switchIP41.theClock = clock;
    switchIP42.theClock = clock;
    switchIP43.theClock = clock;
    switchIP44.theClock = clock;
    switchIP45.theClock = clock;
    switchIP46.theClock = clock;
    switchIP47.theClock = clock;
    switchIP48.theClock = clock;
    switchIP49.theClock = clock;
    switchIP50.theClock = clock;
    switchIP51.theClock = clock;
    
    clock.register(ip1);
    clock.register(ip2);
    clock.register(ip3);
    clock.register(ip4);
    clock.register(ip5);
    clock.register(ip6);
    clock.register(ip7);
    clock.register(ip8);
    clock.register(ip9);
    clock.register(ip10);
    clock.register(ip11);
    clock.register(ip12);
    clock.register(ip13);
    clock.register(ip14);
    clock.register(ip15);
    clock.register(ip16);
    clock.register(ip17);
    clock.register(ip18);
    clock.register(ip19);
    clock.register(ip20);
    clock.register(ip21);
    clock.register(ip22);
    clock.register(ip23);
    clock.register(ip24);
    clock.register(ip25);
    clock.register(ip26);
    clock.register(ip27);
    clock.register(ip28);
    clock.register(ip29);
    clock.register(ip30);
    clock.register(ip31);
    clock.register(ip32);
    clock.register(ip33);
    clock.register(ip34);
    clock.register(ip35);
    clock.register(ip36);
    clock.register(ip37);
    clock.register(ip38);
    clock.register(ip39);
    clock.register(ip40);
    clock.register(ip41);
    clock.register(ip42);
    clock.register(ip43);
    clock.register(ip44);
    clock.register(ip45);
    clock.register(ip46);
    clock.register(ip47);
    clock.register(ip48);
    clock.register(ip49);
    clock.register(ip50);
    clock.register(ip51);

    
    clock.register(switchIP1);
    clock.register(switchIP2);
    clock.register(switchIP3);
    clock.register(switchIP4);
    clock.register(switchIP5);
    clock.register(switchIP6);
    clock.register(switchIP7);
    clock.register(switchIP8);
    clock.register(switchIP9);
    clock.register(switchIP10);
    clock.register(switchIP11);
    clock.register(switchIP12);
    clock.register(switchIP13);
    clock.register(switchIP14);
    clock.register(switchIP15);
    clock.register(switchIP16);
    clock.register(switchIP17);
    clock.register(switchIP18);
    clock.register(switchIP19);
    clock.register(switchIP20);
    clock.register(switchIP21);
    clock.register(switchIP22);
    clock.register(switchIP23);
    clock.register(switchIP24);
    clock.register(switchIP25);
    clock.register(switchIP26);
    clock.register(switchIP27);
    clock.register(switchIP28);
    clock.register(switchIP29);
    clock.register(switchIP30);
    clock.register(switchIP31);
    clock.register(switchIP32);
    clock.register(switchIP33);
    clock.register(switchIP34);
    clock.register(switchIP35);
    clock.register(switchIP36);
    clock.register(switchIP37);
    clock.register(switchIP38);
    clock.register(switchIP39);
    clock.register(switchIP40);
    clock.register(switchIP41);
    clock.register(switchIP42);
    clock.register(switchIP43);
    clock.register(switchIP44);
    clock.register(switchIP45);
    clock.register(switchIP46);
    clock.register(switchIP47);
    clock.register(switchIP48);
    clock.register(switchIP49);
    clock.register(switchIP50);
    clock.register(switchIP51);
    
    int numFlows = theTaskSet.numTaskflows;

        int loop=0;
     
        while (loop<numFlows) {
            
        Task aMessage = theTaskSet.taskFlows[loop].message; 
        
        if (aMessage.source_node==1) ip1.loadMessage(aMessage);
        
        if (aMessage.source_node==2) ip2.loadMessage(aMessage);
        
        if (aMessage.source_node==3) ip3.loadMessage(aMessage);
        
        if (aMessage.source_node==4) ip4.loadMessage(aMessage);     
        
        if (aMessage.source_node==5) ip5.loadMessage(aMessage);
        
        if (aMessage.source_node==6) ip6.loadMessage(aMessage);
        
        if (aMessage.source_node==7) ip7.loadMessage(aMessage);
        
        if (aMessage.source_node==8) ip8.loadMessage(aMessage); 
        
        if (aMessage.source_node==9) ip9.loadMessage(aMessage);
        
        if (aMessage.source_node==10) ip10.loadMessage(aMessage);
        
        if (aMessage.source_node==11) ip11.loadMessage(aMessage);
        
        if (aMessage.source_node==12) ip12.loadMessage(aMessage);     
        
        if (aMessage.source_node==13) ip13.loadMessage(aMessage);
        
        if (aMessage.source_node==14) ip14.loadMessage(aMessage);
        
        if (aMessage.source_node==15) ip15.loadMessage(aMessage);
        
        if (aMessage.source_node==16) ip16.loadMessage(aMessage); 
        
        if (aMessage.source_node==17) ip17.loadMessage(aMessage);
        
        if (aMessage.source_node==18) ip18.loadMessage(aMessage);
        
        if (aMessage.source_node==19) ip19.loadMessage(aMessage);
        
        if (aMessage.source_node==20) ip20.loadMessage(aMessage); 
        
        if (aMessage.source_node==21) ip21.loadMessage(aMessage);
        
        if (aMessage.source_node==22) ip22.loadMessage(aMessage);
        
        if (aMessage.source_node==23) ip23.loadMessage(aMessage);
        
        if (aMessage.source_node==24) ip24.loadMessage(aMessage);     
        
        if (aMessage.source_node==25) ip25.loadMessage(aMessage);
        
        if (aMessage.source_node==26) ip26.loadMessage(aMessage);
        
        if (aMessage.source_node==27) ip27.loadMessage(aMessage);
        
        if (aMessage.source_node==28) ip28.loadMessage(aMessage); 
        
        if (aMessage.source_node==29) ip29.loadMessage(aMessage);
        
        if (aMessage.source_node==30) ip30.loadMessage(aMessage);
        
        if (aMessage.source_node==31) ip31.loadMessage(aMessage);
        
        if (aMessage.source_node==32) ip32.loadMessage(aMessage);
        
        if (aMessage.source_node==33) ip33.loadMessage(aMessage);
        
        if (aMessage.source_node==34) ip34.loadMessage(aMessage);
        
        if (aMessage.source_node==35) ip35.loadMessage(aMessage);
        
        if (aMessage.source_node==36) ip36.loadMessage(aMessage);        
        
        if (aMessage.source_node==37) ip37.loadMessage(aMessage);
        
        if (aMessage.source_node==38) ip38.loadMessage(aMessage);
        
        if (aMessage.source_node==39) ip39.loadMessage(aMessage);
        
        if (aMessage.source_node==40) ip40.loadMessage(aMessage); 
        
        if (aMessage.source_node==41) ip41.loadMessage(aMessage);
        
        if (aMessage.source_node==42) ip42.loadMessage(aMessage);
        
        if (aMessage.source_node==43) ip43.loadMessage(aMessage);
        
        if (aMessage.source_node==44) ip44.loadMessage(aMessage);     
        
        if (aMessage.source_node==45) ip45.loadMessage(aMessage);
        
        if (aMessage.source_node==46) ip46.loadMessage(aMessage);
        
        if (aMessage.source_node==47) ip47.loadMessage(aMessage);
        
        if (aMessage.source_node==48) ip48.loadMessage(aMessage); 
        
        if (aMessage.source_node==49) ip49.loadMessage(aMessage);
        
        if (aMessage.source_node==50) ip50.loadMessage(aMessage);
        
        if (aMessage.source_node==51) ip51.loadMessage(aMessage);
              
        loop++;
    }
    
    clock.start();
    
    }
}
