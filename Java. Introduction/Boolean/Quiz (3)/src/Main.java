class Task {
  boolean knowJava;
  int yearsOfExperienceInJava;
  boolean knowPython;
  int yearsOfExperienceInPython;

  public static void main(String[] args) {
    Candidate john = new Candidate(true,1,false,0);
    Candidate marry = new Candidate(false,0,true,3);
    Candidate olivia = new Candidate(true,0,true,2);
    Candidate alexander = new Candidate(true,3,true,2);
    Candidate andrew = new Candidate(false,1,false,1);
    Candidate emily = new Candidate(false,0,true,2);

    boolean offerAJobToJohn = (john.knowJava && john.yearsOfExperienceInJava >= 1) || (john.knowPython && john.yearsOfExperienceInPython >= 3);
    boolean offerAJobToMary = (marry.knowJava && marry.yearsOfExperienceInJava >= 1) || (marry.knowPython && marry.yearsOfExperienceInPython >= 3);
    boolean offerAJobToOlivia = (olivia.knowJava && olivia.yearsOfExperienceInJava >= 1) || (olivia.knowPython && olivia.yearsOfExperienceInPython >= 3);
    boolean offerAJobToAlexander = (alexander.knowJava && alexander.yearsOfExperienceInJava >= 1) || (alexander.knowPython && alexander.yearsOfExperienceInPython >= 3);
    boolean offerAJobToAndrew = (andrew.knowJava && andrew.yearsOfExperienceInJava >= 1) || (andrew.knowPython && andrew.yearsOfExperienceInPython >= 3);
    boolean offerAJobToEmily = (emily.knowJava && emily.yearsOfExperienceInJava >= 1) || (emily.knowPython && emily.yearsOfExperienceInPython >= 3);


    System.out.println(offerAJobToJohn +" " +" " +offerAJobToMary +" " +offerAJobToOlivia +" " + offerAJobToAlexander +" " +offerAJobToAndrew +" " +offerAJobToEmily);
  }
}

class Candidate{

  boolean knowJava;
  int yearsOfExperienceInJava;
  boolean knowPython;
  int yearsOfExperienceInPython;

  public Candidate(boolean knowJava, int yearsOfExperienceInJava, boolean knowPython, int yearsOfExperienceInPython){
    this.knowJava = knowJava;
    this.yearsOfExperienceInJava = yearsOfExperienceInJava;
    this.knowPython = knowPython;
    this.yearsOfExperienceInPython = yearsOfExperienceInPython;

  }
}