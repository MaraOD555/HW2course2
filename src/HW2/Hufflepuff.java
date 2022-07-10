package HW2;

class HufflepuffStudents extends HogwartsStudents {
    private int hardWork;
    private int honor;
    private int loyalty;


    public HufflepuffStudents(String name, int magicPower, int transgressionDistance, int hardWork, int honor, int loyalty) {
        super(name, magicPower, transgressionDistance);
        this.hardWork = hardWork;
        this.honor = honor;
        this.loyalty = loyalty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }
    private int skills(){
        return hardWork + honor + loyalty;
    }

    public void compareHufflepuff(HufflepuffStudents hufflepuffStudents){
        int skills1 = this.skills();
        int skills2 = hufflepuffStudents.skills();
        if (skills1 > skills2) {
            System.out.println(getName() + " лучший Пуффендуец чем " + hufflepuffStudents.getName());
        } else if (skills2 > skills1){
            System.out.println(hufflepuffStudents.getName() + " лучший Пуффендуец чем " + getName());
        } else {
            System.out.println(hufflepuffStudents.getName() + " такой же Пуффендуец как " + getName());
        }
    }

    public String toString() {
       return  super.toString() + ", трудолюбие - " + getHardWork() + ", честность - "
                + getHonor() + ", верность - " + getLoyalty();
    }
}
