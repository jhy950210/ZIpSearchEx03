import java.util.ArrayList;

import javax.swing.AbstractListModel;

public class CustomListModel extends AbstractListModel<String> {
	private ArrayList<String> values = new ArrayList<String>();
	
	public CustomListModel(String str) {
		// TODO Auto-generated constructor stub
		ZipcodeDAO dao = new ZipcodeDAO();
		values = dao.allZipcode(str);
	}
	
	@Override
	public String getElementAt(int index) {
		// TODO Auto-generated method stub
		return values.get(index);
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return values.size();
	}

}
