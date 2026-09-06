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

public class ElectronicAirTransport extends AbstractModel {

    /**
    * <p>发票代码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * <p>发票号码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * <p>开票日期</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * <p>金额</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Amount")
    @Expose
    private String Amount;

    /**
    * <p>校验码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckCode")
    @Expose
    private String CheckCode;

    /**
    * <p>价税合计</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * <p>抵扣标志</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeductionMark")
    @Expose
    private String DeductionMark;

    /**
    * <p>发票状态代码，0正常 1 未更新  2作废 3已红冲</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StateCode")
    @Expose
    private String StateCode;

    /**
    * <p>购方识别号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BuyerTaxCode")
    @Expose
    private String BuyerTaxCode;

    /**
    * <p>购方名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BuyerName")
    @Expose
    private String BuyerName;

    /**
    * <p>合计税额</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tax")
    @Expose
    private String Tax;

    /**
    * <p>国内国际标识</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DomesticInternationalMark")
    @Expose
    private String DomesticInternationalMark;

    /**
    * <p>旅客姓名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PassengerName")
    @Expose
    private String PassengerName;

    /**
    * <p>有效身份证件号码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PassengerNo")
    @Expose
    private String PassengerNo;

    /**
    * <p>电子客票号码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ElectronicNumber")
    @Expose
    private String ElectronicNumber;

    /**
    * <p>全电发票（航空运输电子客票行程单）详细信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ElectronicAirTransportDetails")
    @Expose
    private ElectronicAirTransportDetail [] ElectronicAirTransportDetails;

    /**
    * <p>票价</p>
    */
    @SerializedName("Fare")
    @Expose
    private String Fare;

    /**
    * <p>燃油附加费</p>
    */
    @SerializedName("FuelSurcharge")
    @Expose
    private String FuelSurcharge;

    /**
    * <p>增值税税额</p>
    */
    @SerializedName("TaxAmount")
    @Expose
    private String TaxAmount;

    /**
    * <p>民航发展基金</p>
    */
    @SerializedName("DevelopmentFund")
    @Expose
    private String DevelopmentFund;

    /**
     * Get <p>发票代码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Code <p>发票代码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set <p>发票代码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Code <p>发票代码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get <p>发票号码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Number <p>发票号码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set <p>发票号码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Number <p>发票号码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Get <p>开票日期</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Date <p>开票日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set <p>开票日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Date <p>开票日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get <p>金额</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Amount <p>金额</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAmount() {
        return this.Amount;
    }

    /**
     * Set <p>金额</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Amount <p>金额</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAmount(String Amount) {
        this.Amount = Amount;
    }

    /**
     * Get <p>校验码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckCode <p>校验码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCheckCode() {
        return this.CheckCode;
    }

    /**
     * Set <p>校验码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckCode <p>校验码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckCode(String CheckCode) {
        this.CheckCode = CheckCode;
    }

    /**
     * Get <p>价税合计</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total <p>价税合计</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set <p>价税合计</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total <p>价税合计</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(String Total) {
        this.Total = Total;
    }

    /**
     * Get <p>抵扣标志</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeductionMark <p>抵扣标志</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeductionMark() {
        return this.DeductionMark;
    }

    /**
     * Set <p>抵扣标志</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeductionMark <p>抵扣标志</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeductionMark(String DeductionMark) {
        this.DeductionMark = DeductionMark;
    }

    /**
     * Get <p>发票状态代码，0正常 1 未更新  2作废 3已红冲</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StateCode <p>发票状态代码，0正常 1 未更新  2作废 3已红冲</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStateCode() {
        return this.StateCode;
    }

    /**
     * Set <p>发票状态代码，0正常 1 未更新  2作废 3已红冲</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StateCode <p>发票状态代码，0正常 1 未更新  2作废 3已红冲</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStateCode(String StateCode) {
        this.StateCode = StateCode;
    }

    /**
     * Get <p>购方识别号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BuyerTaxCode <p>购方识别号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBuyerTaxCode() {
        return this.BuyerTaxCode;
    }

    /**
     * Set <p>购方识别号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BuyerTaxCode <p>购方识别号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBuyerTaxCode(String BuyerTaxCode) {
        this.BuyerTaxCode = BuyerTaxCode;
    }

    /**
     * Get <p>购方名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BuyerName <p>购方名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBuyerName() {
        return this.BuyerName;
    }

    /**
     * Set <p>购方名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BuyerName <p>购方名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBuyerName(String BuyerName) {
        this.BuyerName = BuyerName;
    }

    /**
     * Get <p>合计税额</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tax <p>合计税额</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTax() {
        return this.Tax;
    }

    /**
     * Set <p>合计税额</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tax <p>合计税额</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTax(String Tax) {
        this.Tax = Tax;
    }

    /**
     * Get <p>国内国际标识</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DomesticInternationalMark <p>国内国际标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomesticInternationalMark() {
        return this.DomesticInternationalMark;
    }

    /**
     * Set <p>国内国际标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DomesticInternationalMark <p>国内国际标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomesticInternationalMark(String DomesticInternationalMark) {
        this.DomesticInternationalMark = DomesticInternationalMark;
    }

    /**
     * Get <p>旅客姓名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PassengerName <p>旅客姓名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassengerName() {
        return this.PassengerName;
    }

    /**
     * Set <p>旅客姓名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PassengerName <p>旅客姓名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassengerName(String PassengerName) {
        this.PassengerName = PassengerName;
    }

    /**
     * Get <p>有效身份证件号码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PassengerNo <p>有效身份证件号码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassengerNo() {
        return this.PassengerNo;
    }

    /**
     * Set <p>有效身份证件号码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PassengerNo <p>有效身份证件号码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassengerNo(String PassengerNo) {
        this.PassengerNo = PassengerNo;
    }

    /**
     * Get <p>电子客票号码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ElectronicNumber <p>电子客票号码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getElectronicNumber() {
        return this.ElectronicNumber;
    }

    /**
     * Set <p>电子客票号码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ElectronicNumber <p>电子客票号码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setElectronicNumber(String ElectronicNumber) {
        this.ElectronicNumber = ElectronicNumber;
    }

    /**
     * Get <p>全电发票（航空运输电子客票行程单）详细信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ElectronicAirTransportDetails <p>全电发票（航空运输电子客票行程单）详细信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ElectronicAirTransportDetail [] getElectronicAirTransportDetails() {
        return this.ElectronicAirTransportDetails;
    }

    /**
     * Set <p>全电发票（航空运输电子客票行程单）详细信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ElectronicAirTransportDetails <p>全电发票（航空运输电子客票行程单）详细信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setElectronicAirTransportDetails(ElectronicAirTransportDetail [] ElectronicAirTransportDetails) {
        this.ElectronicAirTransportDetails = ElectronicAirTransportDetails;
    }

    /**
     * Get <p>票价</p> 
     * @return Fare <p>票价</p>
     */
    public String getFare() {
        return this.Fare;
    }

    /**
     * Set <p>票价</p>
     * @param Fare <p>票价</p>
     */
    public void setFare(String Fare) {
        this.Fare = Fare;
    }

    /**
     * Get <p>燃油附加费</p> 
     * @return FuelSurcharge <p>燃油附加费</p>
     */
    public String getFuelSurcharge() {
        return this.FuelSurcharge;
    }

    /**
     * Set <p>燃油附加费</p>
     * @param FuelSurcharge <p>燃油附加费</p>
     */
    public void setFuelSurcharge(String FuelSurcharge) {
        this.FuelSurcharge = FuelSurcharge;
    }

    /**
     * Get <p>增值税税额</p> 
     * @return TaxAmount <p>增值税税额</p>
     */
    public String getTaxAmount() {
        return this.TaxAmount;
    }

    /**
     * Set <p>增值税税额</p>
     * @param TaxAmount <p>增值税税额</p>
     */
    public void setTaxAmount(String TaxAmount) {
        this.TaxAmount = TaxAmount;
    }

    /**
     * Get <p>民航发展基金</p> 
     * @return DevelopmentFund <p>民航发展基金</p>
     */
    public String getDevelopmentFund() {
        return this.DevelopmentFund;
    }

    /**
     * Set <p>民航发展基金</p>
     * @param DevelopmentFund <p>民航发展基金</p>
     */
    public void setDevelopmentFund(String DevelopmentFund) {
        this.DevelopmentFund = DevelopmentFund;
    }

    public ElectronicAirTransport() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ElectronicAirTransport(ElectronicAirTransport source) {
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.Amount != null) {
            this.Amount = new String(source.Amount);
        }
        if (source.CheckCode != null) {
            this.CheckCode = new String(source.CheckCode);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.DeductionMark != null) {
            this.DeductionMark = new String(source.DeductionMark);
        }
        if (source.StateCode != null) {
            this.StateCode = new String(source.StateCode);
        }
        if (source.BuyerTaxCode != null) {
            this.BuyerTaxCode = new String(source.BuyerTaxCode);
        }
        if (source.BuyerName != null) {
            this.BuyerName = new String(source.BuyerName);
        }
        if (source.Tax != null) {
            this.Tax = new String(source.Tax);
        }
        if (source.DomesticInternationalMark != null) {
            this.DomesticInternationalMark = new String(source.DomesticInternationalMark);
        }
        if (source.PassengerName != null) {
            this.PassengerName = new String(source.PassengerName);
        }
        if (source.PassengerNo != null) {
            this.PassengerNo = new String(source.PassengerNo);
        }
        if (source.ElectronicNumber != null) {
            this.ElectronicNumber = new String(source.ElectronicNumber);
        }
        if (source.ElectronicAirTransportDetails != null) {
            this.ElectronicAirTransportDetails = new ElectronicAirTransportDetail[source.ElectronicAirTransportDetails.length];
            for (int i = 0; i < source.ElectronicAirTransportDetails.length; i++) {
                this.ElectronicAirTransportDetails[i] = new ElectronicAirTransportDetail(source.ElectronicAirTransportDetails[i]);
            }
        }
        if (source.Fare != null) {
            this.Fare = new String(source.Fare);
        }
        if (source.FuelSurcharge != null) {
            this.FuelSurcharge = new String(source.FuelSurcharge);
        }
        if (source.TaxAmount != null) {
            this.TaxAmount = new String(source.TaxAmount);
        }
        if (source.DevelopmentFund != null) {
            this.DevelopmentFund = new String(source.DevelopmentFund);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Amount", this.Amount);
        this.setParamSimple(map, prefix + "CheckCode", this.CheckCode);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "DeductionMark", this.DeductionMark);
        this.setParamSimple(map, prefix + "StateCode", this.StateCode);
        this.setParamSimple(map, prefix + "BuyerTaxCode", this.BuyerTaxCode);
        this.setParamSimple(map, prefix + "BuyerName", this.BuyerName);
        this.setParamSimple(map, prefix + "Tax", this.Tax);
        this.setParamSimple(map, prefix + "DomesticInternationalMark", this.DomesticInternationalMark);
        this.setParamSimple(map, prefix + "PassengerName", this.PassengerName);
        this.setParamSimple(map, prefix + "PassengerNo", this.PassengerNo);
        this.setParamSimple(map, prefix + "ElectronicNumber", this.ElectronicNumber);
        this.setParamArrayObj(map, prefix + "ElectronicAirTransportDetails.", this.ElectronicAirTransportDetails);
        this.setParamSimple(map, prefix + "Fare", this.Fare);
        this.setParamSimple(map, prefix + "FuelSurcharge", this.FuelSurcharge);
        this.setParamSimple(map, prefix + "TaxAmount", this.TaxAmount);
        this.setParamSimple(map, prefix + "DevelopmentFund", this.DevelopmentFund);

    }
}

