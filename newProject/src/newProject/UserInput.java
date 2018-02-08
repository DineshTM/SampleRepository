package newProject;
public class UserInput {
    static String data = new String();
    public static class TextInput {
        public void add(char c){
           data = data+c;
      }
        public String getValue(){
            return data;
        }
    }

    public static class NumericInput extends TextInput{
        
        public void add(char c){
          if(Character.isDigit(c)){
              data = data+c;
          }    
        }
    }
    

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}
