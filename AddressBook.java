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

    public static void main(String[] args){

        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
        System.out.println();

    }
}
