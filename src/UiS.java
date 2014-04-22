import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by valerijszemlanikins on 14.04.14.
 */
public class UiS implements ActionListener {
    public static String code;
    public String[] keyw;
    public ArrayList<String> keysforName;
    public int keywordSindex ;
    public int keywordsIndexForString;
    public int forStrings;




    public String[] keywords = {";",":","+","-","Dec","Number","if","Length","then","Integer","procedure","begin","end","Update","Min","Max","Size","Limit","(",")","<>","<",">","'",".","update" };



    public int vasko;
    public int lastindex = 0;
    public int lastindexforString = 0;


    Analyz n = new Analyz();
    JFrame frame = new JFrame("Vasa");
    JPanel mainpanel = new JPanel(new FlowLayout());

    public String keyss;


    JTextArea textAreaForCode = new JTextArea(10,20);
    JList  textAreaForKeyWords = new JList();
    JTextArea  textAreaForIndef = new JTextArea(10,20);
    JList fs = new JList();
    JList forString = new JList();
    JList forKeywords = new JList();


    JButton findKeywords = new JButton("Find Keywords");
    JButton findAllperemen = new JButton("Find integer");
    JButton findStrings = new JButton("Find Strings");
    JButton findAllKeys = new JButton("Find all words without space");

    public void UisS() {

    frame.setVisible(true);
        frame.setSize(1000,1000);
       findKeywords.addActionListener(this);
        findAllperemen.addActionListener(this);
        findStrings.addActionListener(this);
        findAllKeys.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainpanel.add(findKeywords);
        frame.add(mainpanel);
        mainpanel.add(textAreaForCode);
        mainpanel.add(textAreaForIndef);
        mainpanel.add(textAreaForKeyWords);
        mainpanel.add(fs);
        mainpanel.add(forString);
        mainpanel.add(forKeywords);
        mainpanel.add(findAllperemen);
        mainpanel.add(findStrings);
        mainpanel.add(findAllKeys);







    }

    public void actionPerformed(ActionEvent e){
        code = textAreaForCode.getText();

        Object source = e.getSource();
        if (source == findKeywords){
//           code = textAreaForCode.getText();
//            keysforName = n.analizators(code);
//            textAreaForKeyWords.setText(code);
//             keyss  =  keysforName.toString();
//            textAreaForIndef.setText(keyss);



//            buffer = findIndeficators(code).toString();


//            fs.setListData(findIndeficators(code));
//            forString.setListData(findIndeString(code));

            forKeywords.setListData(findIndeficatorsForKeywords(code));
//

//            for(int i = 0; i<findIndeficators(code).length  ;i++ ){
//
//
//                fs.setListData(findIndeficators(code));
//
//            }

        }
        if (source == findAllperemen){


            fs.setListData(findIndeficators(code));
        }
        if (source == findAllKeys){

            keyw= n.analizator(code);
            textAreaForKeyWords.setListData(keyw);
            




        }
        if (source == findStrings){
            forString.setListData(findIndeString(code));

        }

    }




    public String[] findIndeficators(String name){



        String[] buffers = new String[name.length()];
    for(int i =0 ; i < name.length(); i++){
//

        if(i==0){

        keywordSindex = name.indexOf(":=",0);
        vasko = name.indexOf(";",keywordSindex);

        char[] buf = new char[vasko - keywordSindex];
        name.getChars(keywordSindex+2, vasko, buf, 0);

       buffers[lastindex] = String.valueOf(buf);

            i=vasko;
            lastindex++;
        }
        else{

            if(lastindex>=0){
                lastindex++;
            keywordSindex = name.indexOf(":=",i);
            vasko = name.indexOf(";", keywordSindex);

        char[] buf = new char[vasko - keywordSindex];
        name.getChars(keywordSindex+2, vasko, buf, 0);

        buffers[lastindex] = String.valueOf(buf);

            System.out.println(buf);

            i=vasko;

            }
        }
    }

            return buffers;


    }


    public String[] findIndeficatorsForKeywords (String name){
        String[] keys = new String[keywords.length];
        for(int i=0; i<keywords.length; i++){
            if(name.contains(keywords[i])){
                keys[i] = keywords[i];
            }

        }
        return keys;
    }


    public String[] findIndeString(String name){



        String[] buffers = new String[name.length()];
        for(int i =0 ; i < name.length(); i++){
//

            if(i==0){

                keywordsIndexForString = name.indexOf("'",0);
                forStrings = name.indexOf("'",keywordsIndexForString+1);
                char[] buf = new char[forStrings - keywordsIndexForString];
                name.getChars(keywordsIndexForString+1, forStrings, buf, 0);

                buffers[lastindexforString] = String.valueOf(buf);
                lastindexforString++;
                i=forStrings;
            }
            else{

                if(lastindexforString>=0){

                    lastindexforString++;
                    keywordsIndexForString = name.indexOf("'",i);
                    forStrings = name.indexOf("'", keywordsIndexForString+1);



                    char[] buf = new char[forStrings - keywordsIndexForString];
                    name.getChars(keywordsIndexForString+1, forStrings, buf, 0);
                    System.out.println( keywordsIndexForString);
                    System.out.println( forString);

                    buffers[lastindexforString] = String.valueOf(buf);

                    System.out.println(buf);

                    i=forStrings;

                }
            }
        }

        return buffers;


//
//      public String[] findAsamblerCode(String name){
//
//        }

    }







}
