import java.util.*;
public class Tries{
static class Node{
    Node children[]= new Node[26];
    boolean eow = false;

    public Node(){
        for(int i = 0; i< 26; i++){
            children[i]=null;
        }
    }
}
public static Node root = new Node();

public static void insert(String Words){
    Node curr = root;
    for(int i=0; i<Words.length(); i++){
        int idx = Words.charAt(i)-'a';
        if(curr.children[idx]==null){
            curr.children[idx]=new Node();
        }
        curr=curr.children[idx];
    }
    curr.eow = true;
}

public static boolean Search(String Key){
    Node curr = root;
    for(int i =0; i<Key.length(); i++){
        int idx = Key.charAt(i)-'a';
        if(curr.children[idx]==null){
            return false;
        }
        curr = curr.children[idx];
    }
    return curr.eow == true;
}

//WORD BREAK PROBLEM
public static boolean wordBreak(String Key){
    //0(L)
    if(Key.length() == 0){
        return true;
    }
    for(int i=1; i<=Key.length(); i++){
        if(Search(Key.substring(0, i)) && wordBreak(Key.substring(i))){
            return true;
        }
    }
    return false;

}
//STARTSWITH PROBLEM
public static boolean startsWith(String Prefix){    //0(L)
    Node curr = root;
    for(int i=0; i<Prefix.length(); i++){
        int idx = Prefix.charAt(i)-'a';
        if(curr.children[idx]== null){
            return false;
        }
        curr=curr.children[idx];
    }
    return true;
}
//count unique Nodes
public static int countnodes(Node root){
    if(root == null){
        return 0;
    }
    int count = 0;
    for(int i=0; i<26; i++){
        if(root.children[i]!=null){
            count+=countnodes(root.children[i]);
        }
    }
    return count+1;
}



public static void main(String[] args) {
    //String Words[]={"apple", "man", "woman", "mango", "app"};

    //for(int i=0; i<Words.length; i++){
    //    insert(Words[i]);
    //}
    // System.out.println(Search("the"));
    // System.out.println(Search("xyz"));

    // String Key = "ilike";
    // String xyz = "ilikesung";
    // System.out.println(wordBreak(Key));
    // System.out.println(wordBreak(xyz));

    // String prefix1 = "app";
    // String prefix2 = "man";
    // String prefix3 = "application";
    // System.out.println(startsWith(prefix1));
    // System.out.println(startsWith(prefix2));
    // System.out.println(startsWith(prefix3));

    String str= "apple";
    for(int i =0; i<str.length(); i++){
        String suffix = str.substring(i);
        insert(suffix);
    }
    System.out.println(countnodes(root));
}
}