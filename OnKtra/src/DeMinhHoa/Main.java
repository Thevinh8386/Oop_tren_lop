package DeMinhHoa;

public class Main {
	public static void main(String[] args) {
		// Tạo đối tượng TileManagerImpl để quản lý kho
		TileManager manager = new TileManagerImpl();
		try {
			//Thêm sản phẩm trong kho
			manager.addTile(new Tile("001", "Gạch vuông", 500.0, 2, "Sứ", "240x100x90 cm"));
			manager.addTile(new Tile("002", "Gạch tròn", 250.0, 5, "gạch", "100x90x90 cm"));
			manager.addTile(new Tile("003", "Gạch thoi", 400.0, 4, "đá hoa", "224x120x90 cm"));

			// Tìm kiếm sản phẩm
        	System.out.println("Kết quả tìm kiếm sản phẩm tên 'Gạch thoi':");
        	for (Tile i : manager.searchTile("Gạch thoi")) {
            	System.out.println(i);
        	}

        	System.out.println();
        	// Xóa sản phẩm và xử lý lỗi khi xóa sản phẩm không tồn tại
        	Tile temp = new Tile("002", "Gạch tròn", 220.0, 5, "gạch", "100x90x90 cm");
        	if (!manager.delTile(temp)) {
            	System.out.println("Sản phẩm muốn xóa không tồn tại trong kho.");
        	}
    
        	// Sắp xếp theo giá
        	System.out.println();
        	System.out.println("Danh sách sau khi sắp xếp theo giá:");
			for (Tile i : manager.sortedTile(0)) {
            	System.out.println(i);
        	}
    	} catch (Exception e) {
    		System.out.println("Có lỗi trong quá trình thực hiện: " + e.getMessage());
    	}
	}
}
