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
    * 发票代码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 发票号码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * 开票日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Amount")
    @Expose
    private String Amount;

    /**
    * 校验码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckCode")
    @Expose
    private String CheckCode;

    /**
    * 价税合计
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * 抵扣标志
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeductionMark")
    @Expose
    private String DeductionMark;

    /**
    * 发票状态代码，0正常 1 未更新  2作废 3已红冲
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StateCode")
    @Expose
    private String StateCode;

    /**
    * 购方识别号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BuyerTaxCode")
    @Expose
    private String BuyerTaxCode;

    /**
    * 购方名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BuyerName")
    @Expose
    private String BuyerName;

    /**
    * 合计税额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tax")
    @Expose
    private String Tax;

    /**
    * 国内国际标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DomesticInternationalMark")
    @Expose
    private String DomesticInternationalMark;

    /**
    * 旅客姓名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PassengerName")
    @Expose
    private String PassengerName;

    /**
    * 有效身份证件号码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PassengerNo")
    @Expose
    private String PassengerNo;

    /**
    * 电子客票号码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ElectronicNumber")
    @Expose
    private String ElectronicNumber;

    /**
    * 全电发票（航空运输电子客票行程单）详细信息


注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ElectronicAirTransportDetails")
    @Expose
    private ElectronicAirTransportDetail [] ElectronicAirTransportDetails;

    /**
     * Get 发票代码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Code 发票代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 发票代码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Code 发票代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 发票号码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Number 发票号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set 发票号码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Number 发票号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Get 开票日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Date 开票日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 开票日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param Date 开票日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Amount 金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAmount() {
        return this.Amount;
    }

    /**
     * Set 金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param Amount 金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAmount(String Amount) {
        this.Amount = Amount;
    }

    /**
     * Get 校验码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckCode 校验码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCheckCode() {
        return this.CheckCode;
    }

    /**
     * Set 校验码
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckCode 校验码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckCode(String CheckCode) {
        this.CheckCode = CheckCode;
    }

    /**
     * Get 价税合计
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 价税合计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set 价税合计
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 价税合计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(String Total) {
        this.Total = Total;
    }

    /**
     * Get 抵扣标志
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeductionMark 抵扣标志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeductionMark() {
        return this.DeductionMark;
    }

    /**
     * Set 抵扣标志
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeductionMark 抵扣标志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeductionMark(String DeductionMark) {
        this.DeductionMark = DeductionMark;
    }

    /**
     * Get 发票状态代码，0正常 1 未更新  2作废 3已红冲
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StateCode 发票状态代码，0正常 1 未更新  2作废 3已红冲
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStateCode() {
        return this.StateCode;
    }

    /**
     * Set 发票状态代码，0正常 1 未更新  2作废 3已红冲
注意：此字段可能返回 null，表示取不到有效值。
     * @param StateCode 发票状态代码，0正常 1 未更新  2作废 3已红冲
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStateCode(String StateCode) {
        this.StateCode = StateCode;
    }

    /**
     * Get 购方识别号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BuyerTaxCode 购方识别号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBuyerTaxCode() {
        return this.BuyerTaxCode;
    }

    /**
     * Set 购方识别号
注意：此字段可能返回 null，表示取不到有效值。
     * @param BuyerTaxCode 购方识别号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBuyerTaxCode(String BuyerTaxCode) {
        this.BuyerTaxCode = BuyerTaxCode;
    }

    /**
     * Get 购方名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BuyerName 购方名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBuyerName() {
        return this.BuyerName;
    }

    /**
     * Set 购方名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param BuyerName 购方名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBuyerName(String BuyerName) {
        this.BuyerName = BuyerName;
    }

    /**
     * Get 合计税额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tax 合计税额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTax() {
        return this.Tax;
    }

    /**
     * Set 合计税额
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tax 合计税额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTax(String Tax) {
        this.Tax = Tax;
    }

    /**
     * Get 国内国际标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DomesticInternationalMark 国内国际标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomesticInternationalMark() {
        return this.DomesticInternationalMark;
    }

    /**
     * Set 国内国际标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param DomesticInternationalMark 国内国际标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomesticInternationalMark(String DomesticInternationalMark) {
        this.DomesticInternationalMark = DomesticInternationalMark;
    }

    /**
     * Get 旅客姓名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PassengerName 旅客姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassengerName() {
        return this.PassengerName;
    }

    /**
     * Set 旅客姓名
注意：此字段可能返回 null，表示取不到有效值。
     * @param PassengerName 旅客姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassengerName(String PassengerName) {
        this.PassengerName = PassengerName;
    }

    /**
     * Get 有效身份证件号码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PassengerNo 有效身份证件号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassengerNo() {
        return this.PassengerNo;
    }

    /**
     * Set 有效身份证件号码
注意：此字段可能返回 null，表示取不到有效值。
     * @param PassengerNo 有效身份证件号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassengerNo(String PassengerNo) {
        this.PassengerNo = PassengerNo;
    }

    /**
     * Get 电子客票号码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ElectronicNumber 电子客票号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getElectronicNumber() {
        return this.ElectronicNumber;
    }

    /**
     * Set 电子客票号码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ElectronicNumber 电子客票号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setElectronicNumber(String ElectronicNumber) {
        this.ElectronicNumber = ElectronicNumber;
    }

    /**
     * Get 全电发票（航空运输电子客票行程单）详细信息


注意：此字段可能返回 null，表示取不到有效值。 
     * @return ElectronicAirTransportDetails 全电发票（航空运输电子客票行程单）详细信息


注意：此字段可能返回 null，表示取不到有效值。
     */
    public ElectronicAirTransportDetail [] getElectronicAirTransportDetails() {
        return this.ElectronicAirTransportDetails;
    }

    /**
     * Set 全电发票（航空运输电子客票行程单）详细信息


注意：此字段可能返回 null，表示取不到有效值。
     * @param ElectronicAirTransportDetails 全电发票（航空运输电子客票行程单）详细信息


注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setElectronicAirTransportDetails(ElectronicAirTransportDetail [] ElectronicAirTransportDetails) {
        this.ElectronicAirTransportDetails = ElectronicAirTransportDetails;
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

    }
}

