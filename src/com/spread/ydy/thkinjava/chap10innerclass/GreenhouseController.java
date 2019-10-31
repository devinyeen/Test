package com.spread.ydy.thkinjava.chap10innerclass;

public class GreenhouseController {
    public static void main(String[] args) {
        GreenhouseControls ghc = new GreenhouseControls();
        // Instead of hard-wiring, you could parse
        // configuration information from a text file here:
        ghc.addEvent(ghc.new Bell(900));
        Event[] eventList = {
                ghc.new ThermostatNight(0),
                ghc.new LightOn(200),
                ghc.new LightOff(400),
                ghc.new WaterOn(600),
                ghc.new WaterOff(800),
                ghc.new ThermostatDay(1400) };
        ghc.addEvent(ghc.new Restart(2000, eventList));
        if (args.length == 1)
            ghc.addEvent(new GreenhouseControls.Terminate(new Integer(args[0])));
        ghc.run();
    }
} /* Output:
Bing!
Thermostat on night setting
Light is on
Light is off
Greenhouse water is on
Greenhouse water is off
Thermostat on day setting
Restarting system
Terminating
*///:~
