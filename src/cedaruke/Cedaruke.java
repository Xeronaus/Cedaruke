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

    public void loadContent(){
        CedarukePlanets.load();
    }

}
