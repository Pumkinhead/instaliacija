package Buttons;

public abstract class LightableButton extends Button {
    private boolean lit = false;

    public boolean isLit(){
        return lit;
    }
    public void setLit(boolean lit){
        this.lit = lit;
    }
    public boolean toggleLit(){
        return (lit = !lit);
    }
}