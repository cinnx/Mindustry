package mindustry.entities.def;

import mindustry.annotations.Annotations.*;
import mindustry.gen.*;

import static mindustry.Vars.collisions;

@Component
abstract class ElevationMoveComp implements Velc, Posc, Flyingc, Hitboxc{
    transient float x, y;

    @Replace
    @Override
    public void move(float cx, float cy){
        if(isFlying()){
            x += cx;
            y += cy;
        }else{
            collisions.move(this, cx, cy);
        }
    }
}
