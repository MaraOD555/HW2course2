package HW2;

class RavenclawStudents extends HogwartsStudents {
    private int smart;
    private int wise;
    private int witty;
    private int creative;


    public RavenclawStudents(String name, int magicPower, int transgressionDistance, int smart, int wise, int witty, int creative) {
        super(name, magicPower, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }
    private int skills(){
        return smart + wise + witty + creative;
    }
    public void compareRavenclaw(RavenclawStudents ravenclawStudents){
        int skills1 = this.skills();
        int skills2 = ravenclawStudents.skills();
        if (skills1 > skills2) {
            System.out.println(getName() + " лучший Когтевранец чем " + ravenclawStudents.getName());
        } else if (skills2 > skills1){
            System.out.println(ravenclawStudents.getName() + " лучший Когтевранец чем " + getName());
        } else {
            System.out.println(ravenclawStudents.getName() + " текой же Когтевранец как " + getName());
        }
    }

    public String toString() {
       return super.toString() + ", ум - " + getSmart() + ", мудрость - "
                + getWise() + ", остроумие - " + getWitty() + ", творчество - " + getCreative();
    }
}
