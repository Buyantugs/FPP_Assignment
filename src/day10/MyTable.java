package Assigment6;

import weekend.Singleton;

public class MyTable {
    private Entry[] entries=new Entry[26];

    //returns the String that is matched with char c in the table
    public String get(char c){
        //implement
        int index = c - 'a';
        return entries[index].str;
    }

    //adds to the table a pair (c, s) so that s can be looked up using c
    public void add(char c, String s) {
        //implement
        int index = c - 'a';
        if (index >= 0 && index < entries.length) {
            entries[index] = new Entry(c, s);
        }
    }

    //returns a String consisting of nicely formatted display
    //of the contents of the table
    @Override
    public String toString() {
        //implement
        String ss="";

        for (Entry e:entries) {
            if (e != null) {
                ss=ss+e.ch+"->"+e.str+'\n';
            }
        }
        return ss;
    }
    private class Entry {
        char ch;
        String str;
        Entry(char ch, String str){
            this.ch=ch;
            this.str=str;
        }
        //returns a String of the form "ch->str"
        public String toString() {
            return ch+"->"+str;
        }
    }

    public static void main(String[] args) {
        MyTable t = new MyTable();
        t.add('a', "Andrew");
        t.add('b',"Billy");
        t.add('c',"Charlie");
        String s = t.get('b');
        System.out.println(s);
        //print all table value
        System.out.println(t.toString());
    }
}
