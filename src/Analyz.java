import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by valerijszemlanikins on 15.04.14.
 */
public class Analyz  {


    public  String[] analizator (String name){



        //String keyword[] = name.split("\\s*[a-zA-Z]+\\s*");
        // String keyword[] = name.split("\\p[Punct]");
        // String keyword[] = name.split("\\s");
        //String vasa[]=name.split();

        String keyword[] = name.split("[^\\w]");

    System.out.println(keyword);
        return keyword;



    };






    public ArrayList<String> analizators (String name){

        ArrayList<String> vasa = new ArrayList<String>();

        String keyword[] = name.split("[^\\w]");

        for(int i = 0; i < keyword.length; i++){

            vasa.add(keyword[i]);
        }
    return vasa;
    };



    public ArrayList<String> analizatorEmptyWords(String name){
        ArrayList<String> keys = new ArrayList<String>();
        if(name.contains("<>")){
           keys.add("<>");
        }
        if(name.contains(">")){
            keys.add("<");
        }
        if(name.contains(";")){
            keys.add(":");
        }
        if(name.contains(",")){
            keys.add(".");
        }
        if(name.contains("'")){
            keys.add(":=");



        }
        if(name.contains("<>")){
            keys.add("<>");
        }
        if(name.contains("<>")){
            keys.add("<>");
        }
        if(name.contains("<>")){
            keys.add("<>");
        }
        if(name.contains("<>")){
            keys.add("<>");
        }
        if(name.contains("<>")){
            keys.add("<>");
        }


        return keys;
    };










//
//    public String[] analizatorKeywords(ArrayList<String> name){
//
//        ArrayList<String> keywordName = new ArrayList<String>();
//           String[] analizatorKeys;
//for(int i=0; i<name.size();i++){
//        keywordName.add(">" + "<>" + "<" + "+" + "if" + "Length" + "then" + "procedure" + "end" +";" + "Max" + "Min" + "else" + "Dec" + "[" + "]" + "begin");
//      if (name.contains(keywordName)){
//
//
//      }
//}
//
//        return analizatorKeys;
//    };


//    public String[] analizators(String[] name){
//
//
//
//
//        //ArrayList<String> list = new ArrayList<String>();
//
//
//
//        ArrayList<String> list = new ArrayList<String>();
//        ArrayList<String> list2 = new ArrayList<String>();
//
//
//        String[] analiz = new String[name.length];
//        for(int i = 0; i<name.length; i++){
//
//         if (list.contains(list2)){
//          //name[i].equals("vasko")|| name[i].equals("vertok") || name[i].equals("vila")){
//
//           analiz[i] = name[i];
//        return analiz;
////        return keywords[];
//    }
//
//    }
//       return analiz ;
//    };
}

