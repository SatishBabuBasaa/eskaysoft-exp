package com.rest.eskaysoftAPI.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PurchaseEntry")
public class PurchaseEntry implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "purchaseNumber", nullable = false)
	private Integer purchaseNumber;
	
	@Column(name = "invoiceNumber", length = 16,nullable = false)
	private String invoiceNumber;

	@Column(name = "date", nullable = false)
	private Date date;
	
	@Column(name = "gstin", nullable = false)
	private String gstin;
	
	@Column(name = "wayBill", length = 15, nullable = false)
	private String wayBill;
	
	@Column(name = "transport", length = 20, nullable = false)
	private String transport;
	
	@Column(name = "numberOfCases",nullable = false)
	private Integer numberOfCases;
	
	@Column(name = "invoiceDate",nullable = false)
	private Date invoiceDate;

	@Column(name = "mode", length = 6,nullable = false)
	private String mode;
	
	@Column(name = "lrNumber", length = 15,nullable = false)
	private String lrNumber;
	
	@Column(name = "lrDate",nullable = false)
	private Date lrDate;
	
	@Column(name = "delvFrom", length = 20,nullable = false)
	private String delvFrom;
	
	@Column(name = "productCode", length = 5,nullable = false)
	private String productCode;
	
	@Column(name = "productName", length = 30, nullable = false)
	private String productName;
	
	@Column(name = "batch", length = 12, nullable = false)
	private String batch;
	
	@Column(name = "expiry", nullable = false)
	private Date expiry;
	
	@Column(name = "qty",nullable = false)
	private Double qty;
	
	@Column(name = "othCharges",nullable = false)
	private Double othCharges;
	
	@Column(name = "grsValue", nullable = false)
	private Double grsValue;
	
	@Column(name = "discount", nullable = false)
	private Double discount;
	
	@Column(name = "ptd", nullable = false)
	private Double ptd;
	
	@Column(name = "saleRate",nullable = false)
	private Double saleRate;
	
	@Column(name = "tax",nullable = false)
	private Double tax;
	
	@Column(name = "hsn", nullable = false)
	private Long hsn;
	
	@Column(name = "mrp", nullable = false)
	private Double mrp;
	
	@Column(name = "mfgName", length = 20,nullable = false)
	private String mfgName;
	
	@Column(name = "purRate", nullable = false)
	private Double purRate;
	
	@Column(name = "free", nullable = false)
	private Double free;
	
	@Column(name = "grossValue",nullable = false)
	private Double grossValue;
	
	@Column(name = "discountValue", nullable = false)
	private Double discountValue;
	
	@Column(name = "taxValue",nullable = false)
	private Double taxValue;
	
	@Column(name = "netValue", nullable = false)
	private Double netValue;
	
	@Column(name = "debitAdjustmentLedger", nullable = false)
	private Double debitAdjustmentLedger;
	
	@Column(name = "creditAdjustmentLedger",nullable = false)
	private Double creditAdjustmentLedger;
	
	@Column(name = "remarks", length = 50,nullable = false)
	private String remarks;
	
	@Column(name = "debitAdjustmentValue", nullable = false)
	private Double debitAdjustmentValue;
	
	@Column(name = "creditAdjustmentValue", nullable = false)
	private Double creditAdjustmentValue;
	
	@Column(name = "invoiceValue", nullable = false)
	private Double invoiceValue;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getPurchaseNumber() {
		return purchaseNumber;
	}

	public void setPurchaseNumber(Integer purchaseNumber) {
		this.purchaseNumber = purchaseNumber;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getGstin() {
		return gstin;
	}

	public void setGstin(String gstin) {
		this.gstin = gstin;
	}

	public String getWayBill() {
		return wayBill;
	}

	public void setWayBill(String wayBill) {
		this.wayBill = wayBill;
	}

	public String getTransport() {
		return transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public Integer getNumberOfCases() {
		return numberOfCases;
	}

	public void setNumberOfCases(Integer numberOfCases) {
		this.numberOfCases = numberOfCases;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getLrNumber() {
		return lrNumber;
	}

	public void setLrNumber(String lrNumber) {
		this.lrNumber = lrNumber;
	}

	public Date getLrDate() {
		return lrDate;
	}

	public void setLrDate(Date lrDate) {
		this.lrDate = lrDate;
	}

	public String getDelvFrom() {
		return delvFrom;
	}

	public void setDelvFrom(String delvFrom) {
		this.delvFrom = delvFrom;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public Date getExpiry() {
		return expiry;
	}

	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Double getOthCharges() {
		return othCharges;
	}

	public void setOthCharges(Double othCharges) {
		this.othCharges = othCharges;
	}

	public Double getGrsValue() {
		return grsValue;
	}

	public void setGrsValue(Double grsValue) {
		this.grsValue = grsValue;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Double getPtd() {
		return ptd;
	}

	public void setPtd(Double ptd) {
		this.ptd = ptd;
	}

	public Double getSaleRate() {
		return saleRate;
	}

	public void setSaleRate(Double saleRate) {
		this.saleRate = saleRate;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Long getHsn() {
		return hsn;
	}

	public void setHsn(Long hsn) {
		this.hsn = hsn;
	}

	public Double getMrp() {
		return mrp;
	}

	public void setMrp(Double mrp) {
		this.mrp = mrp;
	}

	public String getMfgName() {
		return mfgName;
	}

	public void setMfgName(String mfgName) {
		this.mfgName = mfgName;
	}

	public Double getPurRate() {
		return purRate;
	}

	public void setPurRate(Double purRate) {
		this.purRate = purRate;
	}

	public Double getFree() {
		return free;
	}

	public void setFree(Double free) {
		this.free = free;
	}

	public Double getGrossValue() {
		return grossValue;
	}

	public void setGrossValue(Double grossValue) {
		this.grossValue = grossValue;
	}

	public Double getDiscountValue() {
		return discountValue;
	}

	public void setDiscountValue(Double discountValue) {
		this.discountValue = discountValue;
	}

	public Double getTaxValue() {
		return taxValue;
	}

	public void setTaxValue(Double taxValue) {
		this.taxValue = taxValue;
	}

	public Double getNetValue() {
		return netValue;
	}

	public void setNetValue(Double netValue) {
		this.netValue = netValue;
	}

	public Double getDebitAdjustmentLedger() {
		return debitAdjustmentLedger;
	}

	public void setDebitAdjustmentLedger(Double debitAdjustmentLedger) {
		this.debitAdjustmentLedger = debitAdjustmentLedger;
	}

	

	public Double getCreditAdjustmentLedger() {
		return creditAdjustmentLedger;
	}

	public void setCreditAdjustmentLedger(Double creditAdjustmentLedger) {
		this.creditAdjustmentLedger = creditAdjustmentLedger;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	

	public Double getDebitAdjustmentValue() {
		return debitAdjustmentValue;
	}

	public void setDebitAdjustmentValue(Double debitAdjustmentValue) {
		this.debitAdjustmentValue = debitAdjustmentValue;
	}

	public Double getCreditAdjustmentValue() {
		return creditAdjustmentValue;
	}

	public void setCreditAdjustmentValue(Double creditAdjustmentValue) {
		this.creditAdjustmentValue = creditAdjustmentValue;
	}

	public Double getInvoiceValue() {
		return invoiceValue;
	}

	public void setInvoiceValue(Double invoiceValue) {
		this.invoiceValue = invoiceValue;
	}

}
