package com.globallogic.composition;

import com.globallogic.composition.casePkg.Case;
import com.globallogic.composition.casePkg.Dimensions;
import com.globallogic.composition.onTheDesk.Monitor;
import com.globallogic.composition.onTheDesk.Motherboard;
import com.globallogic.composition.onTheDesk.Resolution;

public class PC_Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B","Dell","240",dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer",27, new Resolution(2540,1440));
        Motherboard theMotherboard = new Motherboard("BJ-200", "ASUS", 4, 6, "v2.44");
        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
        thePC.getMotherboard().loadProgram("windows 1.0");
        thePC.getTheCase().pressPowerButton();
    }
}
