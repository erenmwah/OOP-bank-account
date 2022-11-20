import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
        final String MoneyEmoji = "\uD83D\uDCB0"; //MONEYEMOJİ

        Personal personal = new Personal();
        Company company = new Company();
        Scanner scanner = new Scanner(System.in);


        System.out.println(MoneyEmoji + "AeroBank'a hoşgeldiniz !" + MoneyEmoji);
        System.out.println(PURPLE_BOLD + "Hesabınız bireysel (1) mi kurumsal (2) mı ? ");
        int hesap = scanner.nextInt();
        switch (hesap) {
            case 1:
                bireysel();
                break;
            case 2:
                kurumsal();
        }
    }

    public static void bireysel() {
        final String GREEN_BOLD = "\033[1;32m";  // GREEN
        Personal personal = new Personal();
        Scanner scanner = new Scanner(System.in);
        //set
        System.out.println(GREEN_BOLD + "Adınızı giriniz :");
        personal.setFirstName(scanner.nextLine());
        System.out.println("Soyadınızı giriniz :");
        personal.setLastName(scanner.nextLine());
        System.out.println("Müşteri numaranızı giriniz :");
        personal.setId(scanner.nextLine());
        System.out.println("Telefon numaranızı giriniz :");
        personal.setPhoneNo(scanner.nextLine());

        //get
        System.out.println(personal.getFirstName());
        System.out.println(personal.getLastName());
        System.out.println(personal.getId());
        System.out.println(personal.getPhoneNo());
    }

    public static void kurumsal() {
        final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
        Company company = new Company();
        Scanner scanner = new Scanner(System.in);
        //set
        System.out.println(YELLOW_BOLD + "Şirket adını giriniz :");
        company.setCompanyName(scanner.nextLine());
        System.out.println("Fax no giriniz :");
        company.setFaxNo(scanner.nextLine());
        System.out.println("Müşteri numaranızı giriniz :");
        company.setId(scanner.nextLine());
        System.out.println("Telefon numaranızı giriniz :");
        company.setPhoneNo(scanner.nextLine());
        //get
        System.out.println(company.getCompanyName());
        System.out.println(company.getFaxNo());
        System.out.println(company.getId());
        System.out.println(company.getPhoneNo());
    }
}