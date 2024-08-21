package cedaruke;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.*;
import cedaruke.content.*;

 public class Cedaruke extends Mod{

    @Override

// Temporarily disable most content load to prevent compiling errors
    public void loadContent(){
        // CedarukeBlocks.load();
        // CedarukeLiquids.load();
        CedarukePlanets.load();
        // CedarukeSectors.load();
        // CedarukeStatusEffects.load();
        // CedarukeTechTree.load();
        // CedarukeUnits.load();
        // CedarukeWeather.load();
    }

}
