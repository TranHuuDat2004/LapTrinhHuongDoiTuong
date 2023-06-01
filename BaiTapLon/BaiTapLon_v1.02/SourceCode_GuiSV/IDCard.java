public class IDCard {
      private int idNumber;
      private String fullName;
      private String gender;
      private String dateOfBirth;
      private String address;
      private int phoneNumber;      

      public IDCard(int idNumber, String fullName, String gender, String dateOfBirth, String address, int phoneNumber) {
            setIdNumber(idNumber);
            setFullName(fullName);
            setGender(gender);
            setDateOfBirth(dateOfBirth);
            setAddress(address);
            setPhoneNumber(phoneNumber);
      }
      
      public int getIdNumber() {
            return idNumber;
      }

      public void setIdNumber(int idNumber) {
            this.idNumber = idNumber;
      }

      public String getFullName() {
            return fullName;
      }

      public void setFullName(String fullName) {
            this.fullName = fullName;
      }

      public String getGender() {
            return gender;
      }

      public void setGender(String gender) {
            this.gender = gender;
      }

      public String getDateOfBirth() {
            return dateOfBirth;
      }

      public void setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
      }

      public String getAddress() {
            return address;
      }

      public void setAddress(String address) {
            this.address = address;
      }

      public int getPhoneNumber() {
            return phoneNumber;
      }

      public void setPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
      }

      public String toString() {
            return getIdNumber() + "," 
            + getFullName() + "," 
            + getGender() + "," 
            + getDateOfBirth() + "," 
            + getAddress() + "," 
            + getPhoneNumber();
      }
      
}
