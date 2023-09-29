import java.util.*;
public class AddressBook
{
    ArrayList <BuddyInfo> lst;
    AddressBook()
    {
    lst = new ArrayList<BuddyInfo>();
    }

    void addBuddy(BuddyInfo obj)
    {
        lst.add(obj);
    }

    void removeBuddy(BuddyInfo obj)
    {
        lst.remove(obj);
    }

    void removeAll() {
        ArrayList<BuddyInfo> lst2 = new ArrayList<BuddyInfo>();
        lst = lst2;
    }

    public static void main(String[] args){

        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        BuddyInfo buddy2 = new BuddyInfo("Tom", "Carleton", "613");
        BuddyInfo buddy3 = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.addBuddy(buddy2);

        addressBook.removeBuddy(buddy);
        addressBook.removeBuddy(buddy2);
        System.out.println();

    }
}
