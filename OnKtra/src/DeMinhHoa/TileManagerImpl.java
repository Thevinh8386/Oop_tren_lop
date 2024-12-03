package DeMinhHoa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TileManagerImpl implements TileManager {
	 private List<Tile> tileList = new ArrayList<>();
	
	@Override
	public boolean addTile(Tile t) {
		return tileList.add(t);
	}

	@Override
	public boolean editTile(Tile t) {
		for (int i = 0; i < tileList.size(); i++) {
			if (tileList.get(i).getProduct_id().equals(t.getProduct_id())) {
				tileList.set(i, t);
				return true;
			}	
		}
		return false;
	}

	@Override
	public boolean delTile(Tile t) {
		return tileList.remove(t);
	}

	@Override
	public List<Tile> searchTile(String name) {
		List<Tile> result = new ArrayList<>();
		for (Tile tile : tileList) {
			if (tile.getProduct_name().equalsIgnoreCase(name)) {
				result.add(tile);
			}
		}
		return result;
	}

	@Override
	public List<Tile> sortedTile(double price) {
		List<Tile> sortedList = new ArrayList<>(tileList);
        sortedList.sort(Comparator.comparingDouble(Tile::getProduct_price));
        return sortedList;
	}	
}
