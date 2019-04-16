package com.BridgeLabs.Stock.modal;

public class StockPojo {

	private String stockName;
	private Long  stockShares;
	private Long price;
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public Long getStockShares() {
		return stockShares;
	}
	public void setStockShares(Long stockShares) {
		this.stockShares = stockShares;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	
	@Override
    public String toString() {
        return "name: " + stockName + "\n "
                + "stockshare: " + stockShares + "\n "
                        + "price: " +  price + "";
    }

}
