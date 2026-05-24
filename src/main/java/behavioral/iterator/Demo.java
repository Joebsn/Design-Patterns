package behavioral.iterator;

import behavioral.iterator.profile.Profile;
import behavioral.iterator.social_networks.Facebook;
import behavioral.iterator.social_networks.LinkedIn;
import behavioral.iterator.social_networks.SocialNetwork;
import behavioral.iterator.spammer.SocialSpammer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please specify social network to target spam tool (default:Facebook):");
        System.out.println("1. Facebook");
        System.out.println("2. LinkedIn");
        String choice = scanner.nextLine();

        SocialNetwork network;
        if (choice.equals("2")) {
            network = new LinkedIn(createTestProfiles());
        }
        else {
            network = new Facebook(createTestProfiles());
        }

        SocialSpammer spammer = new SocialSpammer(network);
        spammer.sendSpamToFriends("email1@hotmail.com","Message1");
        spammer.sendSpamToCoworkers("email2@hotmail.com","Message2");
    }

    public static List<Profile> createTestProfiles() {
        List<Profile> data = new ArrayList<Profile>();
        data.add(new Profile("email1@hotmail.com", "name1", "friends:email3@hotmail.com", "friends:email4@hotmail.com", "coworkers:email5@hotmail.com"));
        data.add(new Profile("email2@hotmail.com", "name2", "friends:email1@hotmail.com", "coworkers:email3@hotmail.com"));
        data.add(new Profile("email3@hotmail.com", "name3", "coworkers:email1@hotmail.com"));
        data.add(new Profile("email4@hotmail.com", "name4", "coworkers:email2@hotmail.com"));
        data.add(new Profile("email5@hotmail.com", "name5", "coworkers:email1@hotmail.com", "coworkers:email2@hotmail.com", "friends:email3@hotmail.com"));
        return data;
    }
}