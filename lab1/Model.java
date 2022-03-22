package labs.lab1;
/**
 * @author classes and interfaces only, required
 *
*/

public class Model { // fields
    private String firstName;
    private String lastName;
    private int heightInches;
    private double weightPounds;
    private boolean traveler;
    private boolean smoker;

    /**
     *
     * @param firstName
     * @param lastName
     * @param heightInches
     * @param weightPounds
     * @param traveler
     * @param smoker
     */

    public Model(String firstName, String lastName, int heightInches, double weightPounds, boolean traveler, boolean smoker){
    setFirstName(firstName);
    setLastName(lastName);
    setHeightInches(heightInches);
    setWeightPounds(weightPounds);
    setCanTraveler(traveler);
    setSmoker(smoker);
    }

    /**
     *
     * @param firstName
     */
    public final void setFirstName(String firstName){
      // First name is 3 to 20 characters long.
      if (firstName.length() > 3 && firstName.length() < 20)
          this.firstName = firstName;
  }
    /**
     *
     * @param lastName
     */
    public final void setLastName(String lastName){
      // Last name is 3 to 20 characters long.
      if (lastName.length() > 3 && lastName.length() < 20)
          this.lastName = lastName;
  }
    /**
     *
     * @param heightInches
     */
    public final void setHeightInches(int heightInches){

      if (heightInches > 24 && heightInches < 84)
          this.heightInches = heightInches;
    }

    /**
     *
     * @param weightPounds
     */
    public final void setWeightPounds (double weightPounds){

      if (weightPounds > 80 && weightPounds < 280)
          this.weightPounds = weightPounds;
    }
    /**
     *
     * @param traveler
     */
    public final void setCanTraveler (boolean traveler){
        this.traveler = traveler;
    }
    /**
     *
     * @param smoker
     */
    public final void setSmoker (boolean smoker) {
        this.smoker = smoker;
    }
    /**
     *
     * @return setFirstName
     */
    public String getFirstName(){
        return this.firstName;
    }

    /**
     *
     * @return setLastName
     */
    public String getLastName(){
        return this.lastName;
    }
    /**
     *
     * @return setHeightInches
     */
    public int getHeightInches(){
        return this.heightInches;
    }

    /**
     *
     * @return setWeightPounds
     */
    public double getWeight(){
        return this.weightPounds;
    }

    /**
     *
     * @return setCanTraveler
     */
    public boolean getTraveler(){
        return this.traveler;
    }

    /**
     *
     * @return setSmoker
     */
     public boolean getSmoker(){
        return this.smoker;
    }

}

