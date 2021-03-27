
/**
 * 在这里给出对类 WordPlay 的描述。
 * 
 * @Kaiyi Huang
 * @1.0
 */
import edu.duke.*;
import org.apache.commons.csv.*;
import java.io.*;


public class WordPlay {
    public boolean isVowel(char ch){
        String Vowels = "aeiouAEIOU";
        if(Vowels.indexOf(ch)!= -1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public String replaceVowels(String phrase, char ch){
        String replaced = "";
        for(int k =0; k < phrase.length(); k++){
            if(isVowel(phrase.charAt(k))){
                replaced = replaced + ch;
            }
            else{
                replaced =replaced + phrase.charAt(k);
            }
        }
        return replaced;
    }
    
    public String emphasize(String phrase, char ch){
        String replaced = "";
        char odd = '+';
        char even = '*';
        for(int k =0; k < phrase.length(); k++){
            if(phrase.charAt(k) == ch){
                if(k%2 == 0){
                    replaced = replaced + even;
                }else{
                    replaced = replaced + odd;
                }
            }
            else{
                replaced =replaced + phrase.charAt(k);
            }
        }
        return replaced;
    }
    
    public void tester(){
        System.out.println(isVowel('F'));
        System.out.println(isVowel('a'));
        System.out.println(replaceVowels("Hello World", '*'));
        System.out.println(emphasize("Mary Bella Abracadabra", 'a'));
    }

}
