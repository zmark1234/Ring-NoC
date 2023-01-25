
package javaapplication7;

import java.util.BitSet;

public class Flit {

    long injectionDelay = 0;

    long timeSent;
    int sourceNode;
    int destNode;
    int numFlitsTotal;
    long timeHeaderSent;
    boolean sideChannelHit = false;
    long timeInExb = 0;

    boolean headerFlit = false;
    boolean bodyFlit = false;
    boolean tailFlit = false;


}
