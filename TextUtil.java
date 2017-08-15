import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class TextUtil {

	public static List<String> read(File file) {
		List<String> list = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String str;
			while ((str = br.readLine()) != null) {
				list.add(str);
			}
			br.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return list;
	}

}
