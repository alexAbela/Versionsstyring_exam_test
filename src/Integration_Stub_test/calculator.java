package Integration_Stub_test;

public class calculator {

    private addition add;
    //private additionStub add;

    public calculator(){
        this.add = new addition();
        //this.add = new additionStub();
    }

    public addition add(){
        return this.add;
    }


}
