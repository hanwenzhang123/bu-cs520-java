//Person - anything implemented here will also be implemented down the line, implement all those rules
public abstract class Person {

	public abstract void walk(); //abstract do not specific a body, will be implement somewhere down the line

	public abstract void talk();
	
	public abstract void sleep();

	public abstract double computeExamScore();
}

//Student - if here it is not abstract, the type student must implement the inherited abstract methods like Person.walk(), Person.talk(), Person.sleep()
public abstract class Student extends Person {      //we do not have these above here that is because we passed it to our own child, OnlineStudent

	public abstract double computeHomeworkScore();  //pass to my own children
  
	public double computeExamScore() {
		return 88.8;
	}
  
	public double computeScore() {
		return 0.5 * this.computeHomeworkScore() + 0.5 * this.computeExamScore();
	}

}

//OnlineStudent - it is not abstract, it is the bottom of the food chain
public class OnlineStudent extends Student {  //it is not abstract

    public void walk() {  //student passed down to OnlineStudent, you do not have to do anything but just implement these as subclass
         // walk
    }

    public void talk() {
        // talk
    }

    public void sleep() {
        // sleep
    }

	public double computeHomeworkScore() {
        super.computeExamScore(); //88.8
        this.computeExamScore();  //84.0
        return 95.5;
    }
  
  public double computeExamScore() {
         return 84.0;
     }
  
	public double computeScore() {
		return super.computeScore();
	  }

}
