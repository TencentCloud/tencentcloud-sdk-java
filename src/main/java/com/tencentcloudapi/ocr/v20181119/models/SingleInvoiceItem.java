/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SingleInvoiceItem extends AbstractModel {

    /**
    * 增值税专用发票
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VatSpecialInvoice")
    @Expose
    private VatInvoiceInfo VatSpecialInvoice;

    /**
    * 增值税普通发票
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VatCommonInvoice")
    @Expose
    private VatInvoiceInfo VatCommonInvoice;

    /**
    * 增值税电子普通发票
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VatElectronicCommonInvoice")
    @Expose
    private VatInvoiceInfo VatElectronicCommonInvoice;

    /**
    * 增值税电子专用发票
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VatElectronicSpecialInvoice")
    @Expose
    private VatInvoiceInfo VatElectronicSpecialInvoice;

    /**
    * 区块链电子发票
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VatElectronicInvoiceBlockchain")
    @Expose
    private VatInvoiceInfo VatElectronicInvoiceBlockchain;

    /**
    * 增值税电子普通发票(通行费)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VatElectronicInvoiceToll")
    @Expose
    private VatInvoiceInfo VatElectronicInvoiceToll;

    /**
    * 电子发票(专用发票)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VatElectronicSpecialInvoiceFull")
    @Expose
    private VatElectronicInfo VatElectronicSpecialInvoiceFull;

    /**
    * 电子发票(普通发票)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VatElectronicInvoiceFull")
    @Expose
    private VatElectronicInfo VatElectronicInvoiceFull;

    /**
    * 通用机打发票
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MachinePrintedInvoice")
    @Expose
    private MachinePrintedInvoice MachinePrintedInvoice;

    /**
    * 汽车票
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusInvoice")
    @Expose
    private BusInvoice BusInvoice;

    /**
    * 轮船票
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShippingInvoice")
    @Expose
    private ShippingInvoice ShippingInvoice;

    /**
    * 过路过桥费发票
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TollInvoice")
    @Expose
    private TollInvoice TollInvoice;

    /**
    * 其他发票
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OtherInvoice")
    @Expose
    private OtherInvoice OtherInvoice;

    /**
    * 机动车销售统一发票
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MotorVehicleSaleInvoice")
    @Expose
    private MotorVehicleSaleInvoice MotorVehicleSaleInvoice;

    /**
    * 二手车销售统一发票
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsedCarPurchaseInvoice")
    @Expose
    private UsedCarPurchaseInvoice UsedCarPurchaseInvoice;

    /**
    * 增值税普通发票(卷票)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VatInvoiceRoll")
    @Expose
    private VatInvoiceRoll VatInvoiceRoll;

    /**
    * 出租车发票
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaxiTicket")
    @Expose
    private TaxiTicket TaxiTicket;

    /**
    * 定额发票
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QuotaInvoice")
    @Expose
    private QuotaInvoice QuotaInvoice;

    /**
    * 机票行程单
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AirTransport")
    @Expose
    private AirTransport AirTransport;

    /**
    * 非税收入通用票据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NonTaxIncomeGeneralBill")
    @Expose
    private NonTaxIncomeBill NonTaxIncomeGeneralBill;

    /**
    * 非税收入一般缴款书(电子)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NonTaxIncomeElectronicBill")
    @Expose
    private NonTaxIncomeBill NonTaxIncomeElectronicBill;

    /**
    * 火车票
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrainTicket")
    @Expose
    private TrainTicket TrainTicket;

    /**
    * 医疗门诊收费票据（电子）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MedicalOutpatientInvoice")
    @Expose
    private MedicalInvoice MedicalOutpatientInvoice;

    /**
    * 医疗住院收费票据（电子）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MedicalHospitalizedInvoice")
    @Expose
    private MedicalInvoice MedicalHospitalizedInvoice;

    /**
    * 增值税销货清单
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VatSalesList")
    @Expose
    private VatInvoiceInfo VatSalesList;

    /**
    * 电子发票（火车票）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ElectronicTrainTicketFull")
    @Expose
    private ElectronicTrainTicketFull ElectronicTrainTicketFull;

    /**
    * 电子发票（机票行程单）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ElectronicFlightTicketFull")
    @Expose
    private ElectronicFlightTicketFull ElectronicFlightTicketFull;

    /**
    * 完税凭证
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaxPayment")
    @Expose
    private TaxPayment TaxPayment;

    /**
    * 海关缴款
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomsPaymentReceipt")
    @Expose
    private CustomsPaymentReceipt CustomsPaymentReceipt;

    /**
    * 银行回单
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BankSlip")
    @Expose
    private BankSlip BankSlip;

    /**
    * 网约车行程单
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OnlineTaxiItinerary")
    @Expose
    private OnlineTaxiItinerary OnlineTaxiItinerary;

    /**
    * 海关进/出口货物报关单
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomsDeclaration")
    @Expose
    private CustomsDeclaration CustomsDeclaration;

    /**
    * 海外发票
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OverseasInvoice")
    @Expose
    private OverseasInvoice OverseasInvoice;

    /**
    * 购物小票
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShoppingReceipt")
    @Expose
    private ShoppingReceipt ShoppingReceipt;

    /**
    * 销货清单
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SaleInventory")
    @Expose
    private SaleInventory SaleInventory;

    /**
    * 机动车销售统一发票（电子）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MotorVehicleSaleInvoiceElectronic")
    @Expose
    private MotorVehicleSaleInvoice MotorVehicleSaleInvoiceElectronic;

    /**
    * 二手车销售统一发票（电子）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsedCarPurchaseInvoiceElectronic")
    @Expose
    private UsedCarPurchaseInvoice UsedCarPurchaseInvoiceElectronic;

    /**
     * Get 增值税专用发票
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VatSpecialInvoice 增值税专用发票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VatInvoiceInfo getVatSpecialInvoice() {
        return this.VatSpecialInvoice;
    }

    /**
     * Set 增值税专用发票
注意：此字段可能返回 null，表示取不到有效值。
     * @param VatSpecialInvoice 增值税专用发票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVatSpecialInvoice(VatInvoiceInfo VatSpecialInvoice) {
        this.VatSpecialInvoice = VatSpecialInvoice;
    }

    /**
     * Get 增值税普通发票
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VatCommonInvoice 增值税普通发票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VatInvoiceInfo getVatCommonInvoice() {
        return this.VatCommonInvoice;
    }

    /**
     * Set 增值税普通发票
注意：此字段可能返回 null，表示取不到有效值。
     * @param VatCommonInvoice 增值税普通发票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVatCommonInvoice(VatInvoiceInfo VatCommonInvoice) {
        this.VatCommonInvoice = VatCommonInvoice;
    }

    /**
     * Get 增值税电子普通发票
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VatElectronicCommonInvoice 增值税电子普通发票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VatInvoiceInfo getVatElectronicCommonInvoice() {
        return this.VatElectronicCommonInvoice;
    }

    /**
     * Set 增值税电子普通发票
注意：此字段可能返回 null，表示取不到有效值。
     * @param VatElectronicCommonInvoice 增值税电子普通发票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVatElectronicCommonInvoice(VatInvoiceInfo VatElectronicCommonInvoice) {
        this.VatElectronicCommonInvoice = VatElectronicCommonInvoice;
    }

    /**
     * Get 增值税电子专用发票
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VatElectronicSpecialInvoice 增值税电子专用发票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VatInvoiceInfo getVatElectronicSpecialInvoice() {
        return this.VatElectronicSpecialInvoice;
    }

    /**
     * Set 增值税电子专用发票
注意：此字段可能返回 null，表示取不到有效值。
     * @param VatElectronicSpecialInvoice 增值税电子专用发票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVatElectronicSpecialInvoice(VatInvoiceInfo VatElectronicSpecialInvoice) {
        this.VatElectronicSpecialInvoice = VatElectronicSpecialInvoice;
    }

    /**
     * Get 区块链电子发票
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VatElectronicInvoiceBlockchain 区块链电子发票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VatInvoiceInfo getVatElectronicInvoiceBlockchain() {
        return this.VatElectronicInvoiceBlockchain;
    }

    /**
     * Set 区块链电子发票
注意：此字段可能返回 null，表示取不到有效值。
     * @param VatElectronicInvoiceBlockchain 区块链电子发票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVatElectronicInvoiceBlockchain(VatInvoiceInfo VatElectronicInvoiceBlockchain) {
        this.VatElectronicInvoiceBlockchain = VatElectronicInvoiceBlockchain;
    }

    /**
     * Get 增值税电子普通发票(通行费)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VatElectronicInvoiceToll 增值税电子普通发票(通行费)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VatInvoiceInfo getVatElectronicInvoiceToll() {
        return this.VatElectronicInvoiceToll;
    }

    /**
     * Set 增值税电子普通发票(通行费)
注意：此字段可能返回 null，表示取不到有效值。
     * @param VatElectronicInvoiceToll 增值税电子普通发票(通行费)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVatElectronicInvoiceToll(VatInvoiceInfo VatElectronicInvoiceToll) {
        this.VatElectronicInvoiceToll = VatElectronicInvoiceToll;
    }

    /**
     * Get 电子发票(专用发票)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VatElectronicSpecialInvoiceFull 电子发票(专用发票)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VatElectronicInfo getVatElectronicSpecialInvoiceFull() {
        return this.VatElectronicSpecialInvoiceFull;
    }

    /**
     * Set 电子发票(专用发票)
注意：此字段可能返回 null，表示取不到有效值。
     * @param VatElectronicSpecialInvoiceFull 电子发票(专用发票)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVatElectronicSpecialInvoiceFull(VatElectronicInfo VatElectronicSpecialInvoiceFull) {
        this.VatElectronicSpecialInvoiceFull = VatElectronicSpecialInvoiceFull;
    }

    /**
     * Get 电子发票(普通发票)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VatElectronicInvoiceFull 电子发票(普通发票)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VatElectronicInfo getVatElectronicInvoiceFull() {
        return this.VatElectronicInvoiceFull;
    }

    /**
     * Set 电子发票(普通发票)
注意：此字段可能返回 null，表示取不到有效值。
     * @param VatElectronicInvoiceFull 电子发票(普通发票)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVatElectronicInvoiceFull(VatElectronicInfo VatElectronicInvoiceFull) {
        this.VatElectronicInvoiceFull = VatElectronicInvoiceFull;
    }

    /**
     * Get 通用机打发票
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MachinePrintedInvoice 通用机打发票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MachinePrintedInvoice getMachinePrintedInvoice() {
        return this.MachinePrintedInvoice;
    }

    /**
     * Set 通用机打发票
注意：此字段可能返回 null，表示取不到有效值。
     * @param MachinePrintedInvoice 通用机打发票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMachinePrintedInvoice(MachinePrintedInvoice MachinePrintedInvoice) {
        this.MachinePrintedInvoice = MachinePrintedInvoice;
    }

    /**
     * Get 汽车票
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusInvoice 汽车票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BusInvoice getBusInvoice() {
        return this.BusInvoice;
    }

    /**
     * Set 汽车票
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusInvoice 汽车票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusInvoice(BusInvoice BusInvoice) {
        this.BusInvoice = BusInvoice;
    }

    /**
     * Get 轮船票
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShippingInvoice 轮船票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ShippingInvoice getShippingInvoice() {
        return this.ShippingInvoice;
    }

    /**
     * Set 轮船票
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShippingInvoice 轮船票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShippingInvoice(ShippingInvoice ShippingInvoice) {
        this.ShippingInvoice = ShippingInvoice;
    }

    /**
     * Get 过路过桥费发票
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TollInvoice 过路过桥费发票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TollInvoice getTollInvoice() {
        return this.TollInvoice;
    }

    /**
     * Set 过路过桥费发票
注意：此字段可能返回 null，表示取不到有效值。
     * @param TollInvoice 过路过桥费发票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTollInvoice(TollInvoice TollInvoice) {
        this.TollInvoice = TollInvoice;
    }

    /**
     * Get 其他发票
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OtherInvoice 其他发票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OtherInvoice getOtherInvoice() {
        return this.OtherInvoice;
    }

    /**
     * Set 其他发票
注意：此字段可能返回 null，表示取不到有效值。
     * @param OtherInvoice 其他发票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOtherInvoice(OtherInvoice OtherInvoice) {
        this.OtherInvoice = OtherInvoice;
    }

    /**
     * Get 机动车销售统一发票
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MotorVehicleSaleInvoice 机动车销售统一发票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MotorVehicleSaleInvoice getMotorVehicleSaleInvoice() {
        return this.MotorVehicleSaleInvoice;
    }

    /**
     * Set 机动车销售统一发票
注意：此字段可能返回 null，表示取不到有效值。
     * @param MotorVehicleSaleInvoice 机动车销售统一发票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMotorVehicleSaleInvoice(MotorVehicleSaleInvoice MotorVehicleSaleInvoice) {
        this.MotorVehicleSaleInvoice = MotorVehicleSaleInvoice;
    }

    /**
     * Get 二手车销售统一发票
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsedCarPurchaseInvoice 二手车销售统一发票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UsedCarPurchaseInvoice getUsedCarPurchaseInvoice() {
        return this.UsedCarPurchaseInvoice;
    }

    /**
     * Set 二手车销售统一发票
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsedCarPurchaseInvoice 二手车销售统一发票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsedCarPurchaseInvoice(UsedCarPurchaseInvoice UsedCarPurchaseInvoice) {
        this.UsedCarPurchaseInvoice = UsedCarPurchaseInvoice;
    }

    /**
     * Get 增值税普通发票(卷票)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VatInvoiceRoll 增值税普通发票(卷票)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VatInvoiceRoll getVatInvoiceRoll() {
        return this.VatInvoiceRoll;
    }

    /**
     * Set 增值税普通发票(卷票)
注意：此字段可能返回 null，表示取不到有效值。
     * @param VatInvoiceRoll 增值税普通发票(卷票)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVatInvoiceRoll(VatInvoiceRoll VatInvoiceRoll) {
        this.VatInvoiceRoll = VatInvoiceRoll;
    }

    /**
     * Get 出租车发票
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaxiTicket 出租车发票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaxiTicket getTaxiTicket() {
        return this.TaxiTicket;
    }

    /**
     * Set 出租车发票
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaxiTicket 出租车发票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaxiTicket(TaxiTicket TaxiTicket) {
        this.TaxiTicket = TaxiTicket;
    }

    /**
     * Get 定额发票
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QuotaInvoice 定额发票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QuotaInvoice getQuotaInvoice() {
        return this.QuotaInvoice;
    }

    /**
     * Set 定额发票
注意：此字段可能返回 null，表示取不到有效值。
     * @param QuotaInvoice 定额发票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuotaInvoice(QuotaInvoice QuotaInvoice) {
        this.QuotaInvoice = QuotaInvoice;
    }

    /**
     * Get 机票行程单
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AirTransport 机票行程单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AirTransport getAirTransport() {
        return this.AirTransport;
    }

    /**
     * Set 机票行程单
注意：此字段可能返回 null，表示取不到有效值。
     * @param AirTransport 机票行程单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAirTransport(AirTransport AirTransport) {
        this.AirTransport = AirTransport;
    }

    /**
     * Get 非税收入通用票据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NonTaxIncomeGeneralBill 非税收入通用票据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NonTaxIncomeBill getNonTaxIncomeGeneralBill() {
        return this.NonTaxIncomeGeneralBill;
    }

    /**
     * Set 非税收入通用票据
注意：此字段可能返回 null，表示取不到有效值。
     * @param NonTaxIncomeGeneralBill 非税收入通用票据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNonTaxIncomeGeneralBill(NonTaxIncomeBill NonTaxIncomeGeneralBill) {
        this.NonTaxIncomeGeneralBill = NonTaxIncomeGeneralBill;
    }

    /**
     * Get 非税收入一般缴款书(电子)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NonTaxIncomeElectronicBill 非税收入一般缴款书(电子)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NonTaxIncomeBill getNonTaxIncomeElectronicBill() {
        return this.NonTaxIncomeElectronicBill;
    }

    /**
     * Set 非税收入一般缴款书(电子)
注意：此字段可能返回 null，表示取不到有效值。
     * @param NonTaxIncomeElectronicBill 非税收入一般缴款书(电子)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNonTaxIncomeElectronicBill(NonTaxIncomeBill NonTaxIncomeElectronicBill) {
        this.NonTaxIncomeElectronicBill = NonTaxIncomeElectronicBill;
    }

    /**
     * Get 火车票
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrainTicket 火车票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TrainTicket getTrainTicket() {
        return this.TrainTicket;
    }

    /**
     * Set 火车票
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrainTicket 火车票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrainTicket(TrainTicket TrainTicket) {
        this.TrainTicket = TrainTicket;
    }

    /**
     * Get 医疗门诊收费票据（电子）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MedicalOutpatientInvoice 医疗门诊收费票据（电子）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MedicalInvoice getMedicalOutpatientInvoice() {
        return this.MedicalOutpatientInvoice;
    }

    /**
     * Set 医疗门诊收费票据（电子）
注意：此字段可能返回 null，表示取不到有效值。
     * @param MedicalOutpatientInvoice 医疗门诊收费票据（电子）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMedicalOutpatientInvoice(MedicalInvoice MedicalOutpatientInvoice) {
        this.MedicalOutpatientInvoice = MedicalOutpatientInvoice;
    }

    /**
     * Get 医疗住院收费票据（电子）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MedicalHospitalizedInvoice 医疗住院收费票据（电子）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MedicalInvoice getMedicalHospitalizedInvoice() {
        return this.MedicalHospitalizedInvoice;
    }

    /**
     * Set 医疗住院收费票据（电子）
注意：此字段可能返回 null，表示取不到有效值。
     * @param MedicalHospitalizedInvoice 医疗住院收费票据（电子）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMedicalHospitalizedInvoice(MedicalInvoice MedicalHospitalizedInvoice) {
        this.MedicalHospitalizedInvoice = MedicalHospitalizedInvoice;
    }

    /**
     * Get 增值税销货清单
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VatSalesList 增值税销货清单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VatInvoiceInfo getVatSalesList() {
        return this.VatSalesList;
    }

    /**
     * Set 增值税销货清单
注意：此字段可能返回 null，表示取不到有效值。
     * @param VatSalesList 增值税销货清单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVatSalesList(VatInvoiceInfo VatSalesList) {
        this.VatSalesList = VatSalesList;
    }

    /**
     * Get 电子发票（火车票）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ElectronicTrainTicketFull 电子发票（火车票）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ElectronicTrainTicketFull getElectronicTrainTicketFull() {
        return this.ElectronicTrainTicketFull;
    }

    /**
     * Set 电子发票（火车票）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ElectronicTrainTicketFull 电子发票（火车票）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setElectronicTrainTicketFull(ElectronicTrainTicketFull ElectronicTrainTicketFull) {
        this.ElectronicTrainTicketFull = ElectronicTrainTicketFull;
    }

    /**
     * Get 电子发票（机票行程单）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ElectronicFlightTicketFull 电子发票（机票行程单）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ElectronicFlightTicketFull getElectronicFlightTicketFull() {
        return this.ElectronicFlightTicketFull;
    }

    /**
     * Set 电子发票（机票行程单）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ElectronicFlightTicketFull 电子发票（机票行程单）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setElectronicFlightTicketFull(ElectronicFlightTicketFull ElectronicFlightTicketFull) {
        this.ElectronicFlightTicketFull = ElectronicFlightTicketFull;
    }

    /**
     * Get 完税凭证
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaxPayment 完税凭证
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaxPayment getTaxPayment() {
        return this.TaxPayment;
    }

    /**
     * Set 完税凭证
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaxPayment 完税凭证
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaxPayment(TaxPayment TaxPayment) {
        this.TaxPayment = TaxPayment;
    }

    /**
     * Get 海关缴款
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomsPaymentReceipt 海关缴款
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CustomsPaymentReceipt getCustomsPaymentReceipt() {
        return this.CustomsPaymentReceipt;
    }

    /**
     * Set 海关缴款
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomsPaymentReceipt 海关缴款
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomsPaymentReceipt(CustomsPaymentReceipt CustomsPaymentReceipt) {
        this.CustomsPaymentReceipt = CustomsPaymentReceipt;
    }

    /**
     * Get 银行回单
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BankSlip 银行回单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BankSlip getBankSlip() {
        return this.BankSlip;
    }

    /**
     * Set 银行回单
注意：此字段可能返回 null，表示取不到有效值。
     * @param BankSlip 银行回单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBankSlip(BankSlip BankSlip) {
        this.BankSlip = BankSlip;
    }

    /**
     * Get 网约车行程单
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OnlineTaxiItinerary 网约车行程单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OnlineTaxiItinerary getOnlineTaxiItinerary() {
        return this.OnlineTaxiItinerary;
    }

    /**
     * Set 网约车行程单
注意：此字段可能返回 null，表示取不到有效值。
     * @param OnlineTaxiItinerary 网约车行程单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOnlineTaxiItinerary(OnlineTaxiItinerary OnlineTaxiItinerary) {
        this.OnlineTaxiItinerary = OnlineTaxiItinerary;
    }

    /**
     * Get 海关进/出口货物报关单
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomsDeclaration 海关进/出口货物报关单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CustomsDeclaration getCustomsDeclaration() {
        return this.CustomsDeclaration;
    }

    /**
     * Set 海关进/出口货物报关单
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomsDeclaration 海关进/出口货物报关单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomsDeclaration(CustomsDeclaration CustomsDeclaration) {
        this.CustomsDeclaration = CustomsDeclaration;
    }

    /**
     * Get 海外发票
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OverseasInvoice 海外发票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OverseasInvoice getOverseasInvoice() {
        return this.OverseasInvoice;
    }

    /**
     * Set 海外发票
注意：此字段可能返回 null，表示取不到有效值。
     * @param OverseasInvoice 海外发票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOverseasInvoice(OverseasInvoice OverseasInvoice) {
        this.OverseasInvoice = OverseasInvoice;
    }

    /**
     * Get 购物小票
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShoppingReceipt 购物小票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ShoppingReceipt getShoppingReceipt() {
        return this.ShoppingReceipt;
    }

    /**
     * Set 购物小票
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShoppingReceipt 购物小票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShoppingReceipt(ShoppingReceipt ShoppingReceipt) {
        this.ShoppingReceipt = ShoppingReceipt;
    }

    /**
     * Get 销货清单
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SaleInventory 销货清单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SaleInventory getSaleInventory() {
        return this.SaleInventory;
    }

    /**
     * Set 销货清单
注意：此字段可能返回 null，表示取不到有效值。
     * @param SaleInventory 销货清单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSaleInventory(SaleInventory SaleInventory) {
        this.SaleInventory = SaleInventory;
    }

    /**
     * Get 机动车销售统一发票（电子）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MotorVehicleSaleInvoiceElectronic 机动车销售统一发票（电子）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MotorVehicleSaleInvoice getMotorVehicleSaleInvoiceElectronic() {
        return this.MotorVehicleSaleInvoiceElectronic;
    }

    /**
     * Set 机动车销售统一发票（电子）
注意：此字段可能返回 null，表示取不到有效值。
     * @param MotorVehicleSaleInvoiceElectronic 机动车销售统一发票（电子）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMotorVehicleSaleInvoiceElectronic(MotorVehicleSaleInvoice MotorVehicleSaleInvoiceElectronic) {
        this.MotorVehicleSaleInvoiceElectronic = MotorVehicleSaleInvoiceElectronic;
    }

    /**
     * Get 二手车销售统一发票（电子）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsedCarPurchaseInvoiceElectronic 二手车销售统一发票（电子）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UsedCarPurchaseInvoice getUsedCarPurchaseInvoiceElectronic() {
        return this.UsedCarPurchaseInvoiceElectronic;
    }

    /**
     * Set 二手车销售统一发票（电子）
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsedCarPurchaseInvoiceElectronic 二手车销售统一发票（电子）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsedCarPurchaseInvoiceElectronic(UsedCarPurchaseInvoice UsedCarPurchaseInvoiceElectronic) {
        this.UsedCarPurchaseInvoiceElectronic = UsedCarPurchaseInvoiceElectronic;
    }

    public SingleInvoiceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SingleInvoiceItem(SingleInvoiceItem source) {
        if (source.VatSpecialInvoice != null) {
            this.VatSpecialInvoice = new VatInvoiceInfo(source.VatSpecialInvoice);
        }
        if (source.VatCommonInvoice != null) {
            this.VatCommonInvoice = new VatInvoiceInfo(source.VatCommonInvoice);
        }
        if (source.VatElectronicCommonInvoice != null) {
            this.VatElectronicCommonInvoice = new VatInvoiceInfo(source.VatElectronicCommonInvoice);
        }
        if (source.VatElectronicSpecialInvoice != null) {
            this.VatElectronicSpecialInvoice = new VatInvoiceInfo(source.VatElectronicSpecialInvoice);
        }
        if (source.VatElectronicInvoiceBlockchain != null) {
            this.VatElectronicInvoiceBlockchain = new VatInvoiceInfo(source.VatElectronicInvoiceBlockchain);
        }
        if (source.VatElectronicInvoiceToll != null) {
            this.VatElectronicInvoiceToll = new VatInvoiceInfo(source.VatElectronicInvoiceToll);
        }
        if (source.VatElectronicSpecialInvoiceFull != null) {
            this.VatElectronicSpecialInvoiceFull = new VatElectronicInfo(source.VatElectronicSpecialInvoiceFull);
        }
        if (source.VatElectronicInvoiceFull != null) {
            this.VatElectronicInvoiceFull = new VatElectronicInfo(source.VatElectronicInvoiceFull);
        }
        if (source.MachinePrintedInvoice != null) {
            this.MachinePrintedInvoice = new MachinePrintedInvoice(source.MachinePrintedInvoice);
        }
        if (source.BusInvoice != null) {
            this.BusInvoice = new BusInvoice(source.BusInvoice);
        }
        if (source.ShippingInvoice != null) {
            this.ShippingInvoice = new ShippingInvoice(source.ShippingInvoice);
        }
        if (source.TollInvoice != null) {
            this.TollInvoice = new TollInvoice(source.TollInvoice);
        }
        if (source.OtherInvoice != null) {
            this.OtherInvoice = new OtherInvoice(source.OtherInvoice);
        }
        if (source.MotorVehicleSaleInvoice != null) {
            this.MotorVehicleSaleInvoice = new MotorVehicleSaleInvoice(source.MotorVehicleSaleInvoice);
        }
        if (source.UsedCarPurchaseInvoice != null) {
            this.UsedCarPurchaseInvoice = new UsedCarPurchaseInvoice(source.UsedCarPurchaseInvoice);
        }
        if (source.VatInvoiceRoll != null) {
            this.VatInvoiceRoll = new VatInvoiceRoll(source.VatInvoiceRoll);
        }
        if (source.TaxiTicket != null) {
            this.TaxiTicket = new TaxiTicket(source.TaxiTicket);
        }
        if (source.QuotaInvoice != null) {
            this.QuotaInvoice = new QuotaInvoice(source.QuotaInvoice);
        }
        if (source.AirTransport != null) {
            this.AirTransport = new AirTransport(source.AirTransport);
        }
        if (source.NonTaxIncomeGeneralBill != null) {
            this.NonTaxIncomeGeneralBill = new NonTaxIncomeBill(source.NonTaxIncomeGeneralBill);
        }
        if (source.NonTaxIncomeElectronicBill != null) {
            this.NonTaxIncomeElectronicBill = new NonTaxIncomeBill(source.NonTaxIncomeElectronicBill);
        }
        if (source.TrainTicket != null) {
            this.TrainTicket = new TrainTicket(source.TrainTicket);
        }
        if (source.MedicalOutpatientInvoice != null) {
            this.MedicalOutpatientInvoice = new MedicalInvoice(source.MedicalOutpatientInvoice);
        }
        if (source.MedicalHospitalizedInvoice != null) {
            this.MedicalHospitalizedInvoice = new MedicalInvoice(source.MedicalHospitalizedInvoice);
        }
        if (source.VatSalesList != null) {
            this.VatSalesList = new VatInvoiceInfo(source.VatSalesList);
        }
        if (source.ElectronicTrainTicketFull != null) {
            this.ElectronicTrainTicketFull = new ElectronicTrainTicketFull(source.ElectronicTrainTicketFull);
        }
        if (source.ElectronicFlightTicketFull != null) {
            this.ElectronicFlightTicketFull = new ElectronicFlightTicketFull(source.ElectronicFlightTicketFull);
        }
        if (source.TaxPayment != null) {
            this.TaxPayment = new TaxPayment(source.TaxPayment);
        }
        if (source.CustomsPaymentReceipt != null) {
            this.CustomsPaymentReceipt = new CustomsPaymentReceipt(source.CustomsPaymentReceipt);
        }
        if (source.BankSlip != null) {
            this.BankSlip = new BankSlip(source.BankSlip);
        }
        if (source.OnlineTaxiItinerary != null) {
            this.OnlineTaxiItinerary = new OnlineTaxiItinerary(source.OnlineTaxiItinerary);
        }
        if (source.CustomsDeclaration != null) {
            this.CustomsDeclaration = new CustomsDeclaration(source.CustomsDeclaration);
        }
        if (source.OverseasInvoice != null) {
            this.OverseasInvoice = new OverseasInvoice(source.OverseasInvoice);
        }
        if (source.ShoppingReceipt != null) {
            this.ShoppingReceipt = new ShoppingReceipt(source.ShoppingReceipt);
        }
        if (source.SaleInventory != null) {
            this.SaleInventory = new SaleInventory(source.SaleInventory);
        }
        if (source.MotorVehicleSaleInvoiceElectronic != null) {
            this.MotorVehicleSaleInvoiceElectronic = new MotorVehicleSaleInvoice(source.MotorVehicleSaleInvoiceElectronic);
        }
        if (source.UsedCarPurchaseInvoiceElectronic != null) {
            this.UsedCarPurchaseInvoiceElectronic = new UsedCarPurchaseInvoice(source.UsedCarPurchaseInvoiceElectronic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "VatSpecialInvoice.", this.VatSpecialInvoice);
        this.setParamObj(map, prefix + "VatCommonInvoice.", this.VatCommonInvoice);
        this.setParamObj(map, prefix + "VatElectronicCommonInvoice.", this.VatElectronicCommonInvoice);
        this.setParamObj(map, prefix + "VatElectronicSpecialInvoice.", this.VatElectronicSpecialInvoice);
        this.setParamObj(map, prefix + "VatElectronicInvoiceBlockchain.", this.VatElectronicInvoiceBlockchain);
        this.setParamObj(map, prefix + "VatElectronicInvoiceToll.", this.VatElectronicInvoiceToll);
        this.setParamObj(map, prefix + "VatElectronicSpecialInvoiceFull.", this.VatElectronicSpecialInvoiceFull);
        this.setParamObj(map, prefix + "VatElectronicInvoiceFull.", this.VatElectronicInvoiceFull);
        this.setParamObj(map, prefix + "MachinePrintedInvoice.", this.MachinePrintedInvoice);
        this.setParamObj(map, prefix + "BusInvoice.", this.BusInvoice);
        this.setParamObj(map, prefix + "ShippingInvoice.", this.ShippingInvoice);
        this.setParamObj(map, prefix + "TollInvoice.", this.TollInvoice);
        this.setParamObj(map, prefix + "OtherInvoice.", this.OtherInvoice);
        this.setParamObj(map, prefix + "MotorVehicleSaleInvoice.", this.MotorVehicleSaleInvoice);
        this.setParamObj(map, prefix + "UsedCarPurchaseInvoice.", this.UsedCarPurchaseInvoice);
        this.setParamObj(map, prefix + "VatInvoiceRoll.", this.VatInvoiceRoll);
        this.setParamObj(map, prefix + "TaxiTicket.", this.TaxiTicket);
        this.setParamObj(map, prefix + "QuotaInvoice.", this.QuotaInvoice);
        this.setParamObj(map, prefix + "AirTransport.", this.AirTransport);
        this.setParamObj(map, prefix + "NonTaxIncomeGeneralBill.", this.NonTaxIncomeGeneralBill);
        this.setParamObj(map, prefix + "NonTaxIncomeElectronicBill.", this.NonTaxIncomeElectronicBill);
        this.setParamObj(map, prefix + "TrainTicket.", this.TrainTicket);
        this.setParamObj(map, prefix + "MedicalOutpatientInvoice.", this.MedicalOutpatientInvoice);
        this.setParamObj(map, prefix + "MedicalHospitalizedInvoice.", this.MedicalHospitalizedInvoice);
        this.setParamObj(map, prefix + "VatSalesList.", this.VatSalesList);
        this.setParamObj(map, prefix + "ElectronicTrainTicketFull.", this.ElectronicTrainTicketFull);
        this.setParamObj(map, prefix + "ElectronicFlightTicketFull.", this.ElectronicFlightTicketFull);
        this.setParamObj(map, prefix + "TaxPayment.", this.TaxPayment);
        this.setParamObj(map, prefix + "CustomsPaymentReceipt.", this.CustomsPaymentReceipt);
        this.setParamObj(map, prefix + "BankSlip.", this.BankSlip);
        this.setParamObj(map, prefix + "OnlineTaxiItinerary.", this.OnlineTaxiItinerary);
        this.setParamObj(map, prefix + "CustomsDeclaration.", this.CustomsDeclaration);
        this.setParamObj(map, prefix + "OverseasInvoice.", this.OverseasInvoice);
        this.setParamObj(map, prefix + "ShoppingReceipt.", this.ShoppingReceipt);
        this.setParamObj(map, prefix + "SaleInventory.", this.SaleInventory);
        this.setParamObj(map, prefix + "MotorVehicleSaleInvoiceElectronic.", this.MotorVehicleSaleInvoiceElectronic);
        this.setParamObj(map, prefix + "UsedCarPurchaseInvoiceElectronic.", this.UsedCarPurchaseInvoiceElectronic);

    }
}

