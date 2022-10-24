import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class PhoneBook {
    public static void main(String[] args) throws IOException {
        Reader in = new FileReader("C:\\Users\\mpatt\\IdeaProjects\\lab4_exB\\src\\main\\resources\\uk-500.csv");
        Iterable<CSVRecord> records = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in);
        for (CSVRecord record : records) {
            String id = record.get("city");
//            String customerNo = record.get("CustomerNo");
//            String name = record.get("Name");
            System.out.println(id);
        }
    }
}
