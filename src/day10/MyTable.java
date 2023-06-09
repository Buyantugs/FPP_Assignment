package day10;
public class MyTable {
    private Entry[] entries;
    public MyTable() {
        entries = new Entry[26];
    }
    public String get(char c) {
        //implement
        for (int i = 0; i < entries.length; i++) {
            if (entries[i].ch == c) {
                return entries[i].str;
            }
        }
        return null;
    }

    public void add(char c, String s) {
        int index = c - 'a';
        if (index >= 0 && index < entries.length) {
            entries[index] = new Entry(c, s);
        }
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (Entry e:entries){
            if (e!=null){
                sb.append(e+"\n");
            }
        }
        return sb.toString();
    }

    private class Entry {
        char ch;
        String str;

        Entry(char ch, String str) {
            //implement
            this.ch = ch;
            this.str = str;
        }

        public String toString() {
               return ch + "->" + str;
        }
    }
    public static void main(String[] args) {
        MyTable t = new MyTable();
        t.add('a', "Andrew");
        t.add('b', "Billy");
        t.add('w', "Willie");
        System.out.println(t.get('a'));
        System.out.println(t);
    }
}
