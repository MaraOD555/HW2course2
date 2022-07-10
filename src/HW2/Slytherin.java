package HW2;

class SlytherinStudents extends HogwartsStudents {
    private int sly;
    private int decisive;
    private int ambitious;
    private int resourceful;
    private int desireForPower;


    public SlytherinStudents(String name, int magicPower, int transgressionDistance, int sly, int decisive, int ambitious, int resourceful, int desireForPower) {
        super(name, magicPower, transgressionDistance);
        this.sly = sly;
        this.decisive = decisive;
        this.ambitious = ambitious;
        this.resourceful = resourceful;
        this.desireForPower = desireForPower;
    }

    public int getSly() {
        return sly;
    }

    public void setSly(int sly) {
        this.sly = sly;
    }

    public int getDecisive() {
        return decisive;
    }

    public void setDecisive(int decisive) {
        this.decisive = decisive;
    }

    public int getAmbitious() {
        return ambitious;
    }

    public void setAmbitious(int ambitious) {
        this.ambitious = ambitious;
    }

    public int getResourceful() {
        return resourceful;
    }

    public void setResourceful(int resourceful) {
        this.resourceful = resourceful;
    }

    public int getDesireForPower() {
        return desireForPower;
    }

    public void setDesireForPower(int desireForPower) {
        this.desireForPower = desireForPower;
    }
    private int skills(){
        return decisive + ambitious + resourceful + desireForPower;
    }
    public void compareSlytherin(SlytherinStudents slytherinStudents){
        int skills1 = this.skills();
        int skills2 = slytherinStudents.skills();
        if (skills1 > skills2) {
            System.out.println(getName() + " лучший Слизеринец чем " + slytherinStudents.getName());
        } else if (skills2 > skills1){
            System.out.println(slytherinStudents.getName() + " лучший Слизеринец чем " + getName());
        } else {
            System.out.println(slytherinStudents.getName() + " такой же Слизеринец как " + getName());
        }
    }

    public String toString() {
       return super.toString() + ", хитрость - " + getSly() + ", решительность - " + getDecisive()
               + ", амбициозность - " + getAmbitious() + ", находчивость - "
               + getResourceful() + ", жажда власти - " + getDesireForPower();
    }
}
