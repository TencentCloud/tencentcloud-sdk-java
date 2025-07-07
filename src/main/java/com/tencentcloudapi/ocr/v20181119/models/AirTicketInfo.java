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

public class AirTicketInfo extends AbstractModel {

    /**
    * 旅客姓名
    */
    @SerializedName("PassengerName")
    @Expose
    private String PassengerName;

    /**
    * 有效身份证件号码
    */
    @SerializedName("ValidIdNumber")
    @Expose
    private String ValidIdNumber;

    /**
    * 签注
    */
    @SerializedName("Endorsement")
    @Expose
    private String Endorsement;

    /**
    * GP单号
    */
    @SerializedName("NumberOfGPOrder")
    @Expose
    private String NumberOfGPOrder;

    /**
    * 发票号码
    */
    @SerializedName("ElectronicInvoiceAirTransportReceiptNumber")
    @Expose
    private String ElectronicInvoiceAirTransportReceiptNumber;

    /**
    * 机票详细信息元组
    */
    @SerializedName("DetailInformationOfAirTicketTuple")
    @Expose
    private DetailInformationOfAirTicketTupleList [] DetailInformationOfAirTicketTuple;

    /**
    * 票价
    */
    @SerializedName("Fare")
    @Expose
    private String Fare;

    /**
    * 燃油附加费
    */
    @SerializedName("FuelSurcharge")
    @Expose
    private String FuelSurcharge;

    /**
    * 增值税税率
    */
    @SerializedName("VatRate")
    @Expose
    private String VatRate;

    /**
    * 增值税税额
    */
    @SerializedName("VatTaxAmount")
    @Expose
    private String VatTaxAmount;

    /**
    * 民航发展基金
    */
    @SerializedName("CivilAviationDevelopmentFund")
    @Expose
    private String CivilAviationDevelopmentFund;

    /**
    * 其他税费
    */
    @SerializedName("OtherTaxes")
    @Expose
    private String OtherTaxes;

    /**
    * 合计
    */
    @SerializedName("TotalAmount")
    @Expose
    private String TotalAmount;

    /**
    * 电子客票号码
    */
    @SerializedName("ElectronicTicketNum")
    @Expose
    private String ElectronicTicketNum;

    /**
    * 验证码
    */
    @SerializedName("VerificationCode")
    @Expose
    private String VerificationCode;

    /**
    * 提示信息
    */
    @SerializedName("PromptInformation")
    @Expose
    private String PromptInformation;

    /**
    * 保险费
    */
    @SerializedName("Insurance")
    @Expose
    private String Insurance;

    /**
    * 销售网点代号
    */
    @SerializedName("AgentCode")
    @Expose
    private String AgentCode;

    /**
    * 填开单位
    */
    @SerializedName("IssueParty")
    @Expose
    private String IssueParty;

    /**
    * 填开时间
    */
    @SerializedName("IssueDate")
    @Expose
    private String IssueDate;

    /**
    * 开具状态
    */
    @SerializedName("IssuingStatus")
    @Expose
    private String IssuingStatus;

    /**
    * 国内国际标识
    */
    @SerializedName("MarkingOfDomesticOrInternational")
    @Expose
    private String MarkingOfDomesticOrInternational;

    /**
    * 购买方名称
    */
    @SerializedName("NameOfPurchaser")
    @Expose
    private String NameOfPurchaser;

    /**
    * 销售方名称
    */
    @SerializedName("NameOfSeller")
    @Expose
    private String NameOfSeller;

    /**
    * 统一社会信用代码
    */
    @SerializedName("UnifiedSocialCreditCodeOfPurchaser")
    @Expose
    private String UnifiedSocialCreditCodeOfPurchaser;

    /**
     * Get 旅客姓名 
     * @return PassengerName 旅客姓名
     */
    public String getPassengerName() {
        return this.PassengerName;
    }

    /**
     * Set 旅客姓名
     * @param PassengerName 旅客姓名
     */
    public void setPassengerName(String PassengerName) {
        this.PassengerName = PassengerName;
    }

    /**
     * Get 有效身份证件号码 
     * @return ValidIdNumber 有效身份证件号码
     */
    public String getValidIdNumber() {
        return this.ValidIdNumber;
    }

    /**
     * Set 有效身份证件号码
     * @param ValidIdNumber 有效身份证件号码
     */
    public void setValidIdNumber(String ValidIdNumber) {
        this.ValidIdNumber = ValidIdNumber;
    }

    /**
     * Get 签注 
     * @return Endorsement 签注
     */
    public String getEndorsement() {
        return this.Endorsement;
    }

    /**
     * Set 签注
     * @param Endorsement 签注
     */
    public void setEndorsement(String Endorsement) {
        this.Endorsement = Endorsement;
    }

    /**
     * Get GP单号 
     * @return NumberOfGPOrder GP单号
     */
    public String getNumberOfGPOrder() {
        return this.NumberOfGPOrder;
    }

    /**
     * Set GP单号
     * @param NumberOfGPOrder GP单号
     */
    public void setNumberOfGPOrder(String NumberOfGPOrder) {
        this.NumberOfGPOrder = NumberOfGPOrder;
    }

    /**
     * Get 发票号码 
     * @return ElectronicInvoiceAirTransportReceiptNumber 发票号码
     */
    public String getElectronicInvoiceAirTransportReceiptNumber() {
        return this.ElectronicInvoiceAirTransportReceiptNumber;
    }

    /**
     * Set 发票号码
     * @param ElectronicInvoiceAirTransportReceiptNumber 发票号码
     */
    public void setElectronicInvoiceAirTransportReceiptNumber(String ElectronicInvoiceAirTransportReceiptNumber) {
        this.ElectronicInvoiceAirTransportReceiptNumber = ElectronicInvoiceAirTransportReceiptNumber;
    }

    /**
     * Get 机票详细信息元组 
     * @return DetailInformationOfAirTicketTuple 机票详细信息元组
     */
    public DetailInformationOfAirTicketTupleList [] getDetailInformationOfAirTicketTuple() {
        return this.DetailInformationOfAirTicketTuple;
    }

    /**
     * Set 机票详细信息元组
     * @param DetailInformationOfAirTicketTuple 机票详细信息元组
     */
    public void setDetailInformationOfAirTicketTuple(DetailInformationOfAirTicketTupleList [] DetailInformationOfAirTicketTuple) {
        this.DetailInformationOfAirTicketTuple = DetailInformationOfAirTicketTuple;
    }

    /**
     * Get 票价 
     * @return Fare 票价
     */
    public String getFare() {
        return this.Fare;
    }

    /**
     * Set 票价
     * @param Fare 票价
     */
    public void setFare(String Fare) {
        this.Fare = Fare;
    }

    /**
     * Get 燃油附加费 
     * @return FuelSurcharge 燃油附加费
     */
    public String getFuelSurcharge() {
        return this.FuelSurcharge;
    }

    /**
     * Set 燃油附加费
     * @param FuelSurcharge 燃油附加费
     */
    public void setFuelSurcharge(String FuelSurcharge) {
        this.FuelSurcharge = FuelSurcharge;
    }

    /**
     * Get 增值税税率 
     * @return VatRate 增值税税率
     */
    public String getVatRate() {
        return this.VatRate;
    }

    /**
     * Set 增值税税率
     * @param VatRate 增值税税率
     */
    public void setVatRate(String VatRate) {
        this.VatRate = VatRate;
    }

    /**
     * Get 增值税税额 
     * @return VatTaxAmount 增值税税额
     */
    public String getVatTaxAmount() {
        return this.VatTaxAmount;
    }

    /**
     * Set 增值税税额
     * @param VatTaxAmount 增值税税额
     */
    public void setVatTaxAmount(String VatTaxAmount) {
        this.VatTaxAmount = VatTaxAmount;
    }

    /**
     * Get 民航发展基金 
     * @return CivilAviationDevelopmentFund 民航发展基金
     */
    public String getCivilAviationDevelopmentFund() {
        return this.CivilAviationDevelopmentFund;
    }

    /**
     * Set 民航发展基金
     * @param CivilAviationDevelopmentFund 民航发展基金
     */
    public void setCivilAviationDevelopmentFund(String CivilAviationDevelopmentFund) {
        this.CivilAviationDevelopmentFund = CivilAviationDevelopmentFund;
    }

    /**
     * Get 其他税费 
     * @return OtherTaxes 其他税费
     */
    public String getOtherTaxes() {
        return this.OtherTaxes;
    }

    /**
     * Set 其他税费
     * @param OtherTaxes 其他税费
     */
    public void setOtherTaxes(String OtherTaxes) {
        this.OtherTaxes = OtherTaxes;
    }

    /**
     * Get 合计 
     * @return TotalAmount 合计
     */
    public String getTotalAmount() {
        return this.TotalAmount;
    }

    /**
     * Set 合计
     * @param TotalAmount 合计
     */
    public void setTotalAmount(String TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    /**
     * Get 电子客票号码 
     * @return ElectronicTicketNum 电子客票号码
     */
    public String getElectronicTicketNum() {
        return this.ElectronicTicketNum;
    }

    /**
     * Set 电子客票号码
     * @param ElectronicTicketNum 电子客票号码
     */
    public void setElectronicTicketNum(String ElectronicTicketNum) {
        this.ElectronicTicketNum = ElectronicTicketNum;
    }

    /**
     * Get 验证码 
     * @return VerificationCode 验证码
     */
    public String getVerificationCode() {
        return this.VerificationCode;
    }

    /**
     * Set 验证码
     * @param VerificationCode 验证码
     */
    public void setVerificationCode(String VerificationCode) {
        this.VerificationCode = VerificationCode;
    }

    /**
     * Get 提示信息 
     * @return PromptInformation 提示信息
     */
    public String getPromptInformation() {
        return this.PromptInformation;
    }

    /**
     * Set 提示信息
     * @param PromptInformation 提示信息
     */
    public void setPromptInformation(String PromptInformation) {
        this.PromptInformation = PromptInformation;
    }

    /**
     * Get 保险费 
     * @return Insurance 保险费
     */
    public String getInsurance() {
        return this.Insurance;
    }

    /**
     * Set 保险费
     * @param Insurance 保险费
     */
    public void setInsurance(String Insurance) {
        this.Insurance = Insurance;
    }

    /**
     * Get 销售网点代号 
     * @return AgentCode 销售网点代号
     */
    public String getAgentCode() {
        return this.AgentCode;
    }

    /**
     * Set 销售网点代号
     * @param AgentCode 销售网点代号
     */
    public void setAgentCode(String AgentCode) {
        this.AgentCode = AgentCode;
    }

    /**
     * Get 填开单位 
     * @return IssueParty 填开单位
     */
    public String getIssueParty() {
        return this.IssueParty;
    }

    /**
     * Set 填开单位
     * @param IssueParty 填开单位
     */
    public void setIssueParty(String IssueParty) {
        this.IssueParty = IssueParty;
    }

    /**
     * Get 填开时间 
     * @return IssueDate 填开时间
     */
    public String getIssueDate() {
        return this.IssueDate;
    }

    /**
     * Set 填开时间
     * @param IssueDate 填开时间
     */
    public void setIssueDate(String IssueDate) {
        this.IssueDate = IssueDate;
    }

    /**
     * Get 开具状态 
     * @return IssuingStatus 开具状态
     */
    public String getIssuingStatus() {
        return this.IssuingStatus;
    }

    /**
     * Set 开具状态
     * @param IssuingStatus 开具状态
     */
    public void setIssuingStatus(String IssuingStatus) {
        this.IssuingStatus = IssuingStatus;
    }

    /**
     * Get 国内国际标识 
     * @return MarkingOfDomesticOrInternational 国内国际标识
     */
    public String getMarkingOfDomesticOrInternational() {
        return this.MarkingOfDomesticOrInternational;
    }

    /**
     * Set 国内国际标识
     * @param MarkingOfDomesticOrInternational 国内国际标识
     */
    public void setMarkingOfDomesticOrInternational(String MarkingOfDomesticOrInternational) {
        this.MarkingOfDomesticOrInternational = MarkingOfDomesticOrInternational;
    }

    /**
     * Get 购买方名称 
     * @return NameOfPurchaser 购买方名称
     */
    public String getNameOfPurchaser() {
        return this.NameOfPurchaser;
    }

    /**
     * Set 购买方名称
     * @param NameOfPurchaser 购买方名称
     */
    public void setNameOfPurchaser(String NameOfPurchaser) {
        this.NameOfPurchaser = NameOfPurchaser;
    }

    /**
     * Get 销售方名称 
     * @return NameOfSeller 销售方名称
     */
    public String getNameOfSeller() {
        return this.NameOfSeller;
    }

    /**
     * Set 销售方名称
     * @param NameOfSeller 销售方名称
     */
    public void setNameOfSeller(String NameOfSeller) {
        this.NameOfSeller = NameOfSeller;
    }

    /**
     * Get 统一社会信用代码 
     * @return UnifiedSocialCreditCodeOfPurchaser 统一社会信用代码
     */
    public String getUnifiedSocialCreditCodeOfPurchaser() {
        return this.UnifiedSocialCreditCodeOfPurchaser;
    }

    /**
     * Set 统一社会信用代码
     * @param UnifiedSocialCreditCodeOfPurchaser 统一社会信用代码
     */
    public void setUnifiedSocialCreditCodeOfPurchaser(String UnifiedSocialCreditCodeOfPurchaser) {
        this.UnifiedSocialCreditCodeOfPurchaser = UnifiedSocialCreditCodeOfPurchaser;
    }

    public AirTicketInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AirTicketInfo(AirTicketInfo source) {
        if (source.PassengerName != null) {
            this.PassengerName = new String(source.PassengerName);
        }
        if (source.ValidIdNumber != null) {
            this.ValidIdNumber = new String(source.ValidIdNumber);
        }
        if (source.Endorsement != null) {
            this.Endorsement = new String(source.Endorsement);
        }
        if (source.NumberOfGPOrder != null) {
            this.NumberOfGPOrder = new String(source.NumberOfGPOrder);
        }
        if (source.ElectronicInvoiceAirTransportReceiptNumber != null) {
            this.ElectronicInvoiceAirTransportReceiptNumber = new String(source.ElectronicInvoiceAirTransportReceiptNumber);
        }
        if (source.DetailInformationOfAirTicketTuple != null) {
            this.DetailInformationOfAirTicketTuple = new DetailInformationOfAirTicketTupleList[source.DetailInformationOfAirTicketTuple.length];
            for (int i = 0; i < source.DetailInformationOfAirTicketTuple.length; i++) {
                this.DetailInformationOfAirTicketTuple[i] = new DetailInformationOfAirTicketTupleList(source.DetailInformationOfAirTicketTuple[i]);
            }
        }
        if (source.Fare != null) {
            this.Fare = new String(source.Fare);
        }
        if (source.FuelSurcharge != null) {
            this.FuelSurcharge = new String(source.FuelSurcharge);
        }
        if (source.VatRate != null) {
            this.VatRate = new String(source.VatRate);
        }
        if (source.VatTaxAmount != null) {
            this.VatTaxAmount = new String(source.VatTaxAmount);
        }
        if (source.CivilAviationDevelopmentFund != null) {
            this.CivilAviationDevelopmentFund = new String(source.CivilAviationDevelopmentFund);
        }
        if (source.OtherTaxes != null) {
            this.OtherTaxes = new String(source.OtherTaxes);
        }
        if (source.TotalAmount != null) {
            this.TotalAmount = new String(source.TotalAmount);
        }
        if (source.ElectronicTicketNum != null) {
            this.ElectronicTicketNum = new String(source.ElectronicTicketNum);
        }
        if (source.VerificationCode != null) {
            this.VerificationCode = new String(source.VerificationCode);
        }
        if (source.PromptInformation != null) {
            this.PromptInformation = new String(source.PromptInformation);
        }
        if (source.Insurance != null) {
            this.Insurance = new String(source.Insurance);
        }
        if (source.AgentCode != null) {
            this.AgentCode = new String(source.AgentCode);
        }
        if (source.IssueParty != null) {
            this.IssueParty = new String(source.IssueParty);
        }
        if (source.IssueDate != null) {
            this.IssueDate = new String(source.IssueDate);
        }
        if (source.IssuingStatus != null) {
            this.IssuingStatus = new String(source.IssuingStatus);
        }
        if (source.MarkingOfDomesticOrInternational != null) {
            this.MarkingOfDomesticOrInternational = new String(source.MarkingOfDomesticOrInternational);
        }
        if (source.NameOfPurchaser != null) {
            this.NameOfPurchaser = new String(source.NameOfPurchaser);
        }
        if (source.NameOfSeller != null) {
            this.NameOfSeller = new String(source.NameOfSeller);
        }
        if (source.UnifiedSocialCreditCodeOfPurchaser != null) {
            this.UnifiedSocialCreditCodeOfPurchaser = new String(source.UnifiedSocialCreditCodeOfPurchaser);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PassengerName", this.PassengerName);
        this.setParamSimple(map, prefix + "ValidIdNumber", this.ValidIdNumber);
        this.setParamSimple(map, prefix + "Endorsement", this.Endorsement);
        this.setParamSimple(map, prefix + "NumberOfGPOrder", this.NumberOfGPOrder);
        this.setParamSimple(map, prefix + "ElectronicInvoiceAirTransportReceiptNumber", this.ElectronicInvoiceAirTransportReceiptNumber);
        this.setParamArrayObj(map, prefix + "DetailInformationOfAirTicketTuple.", this.DetailInformationOfAirTicketTuple);
        this.setParamSimple(map, prefix + "Fare", this.Fare);
        this.setParamSimple(map, prefix + "FuelSurcharge", this.FuelSurcharge);
        this.setParamSimple(map, prefix + "VatRate", this.VatRate);
        this.setParamSimple(map, prefix + "VatTaxAmount", this.VatTaxAmount);
        this.setParamSimple(map, prefix + "CivilAviationDevelopmentFund", this.CivilAviationDevelopmentFund);
        this.setParamSimple(map, prefix + "OtherTaxes", this.OtherTaxes);
        this.setParamSimple(map, prefix + "TotalAmount", this.TotalAmount);
        this.setParamSimple(map, prefix + "ElectronicTicketNum", this.ElectronicTicketNum);
        this.setParamSimple(map, prefix + "VerificationCode", this.VerificationCode);
        this.setParamSimple(map, prefix + "PromptInformation", this.PromptInformation);
        this.setParamSimple(map, prefix + "Insurance", this.Insurance);
        this.setParamSimple(map, prefix + "AgentCode", this.AgentCode);
        this.setParamSimple(map, prefix + "IssueParty", this.IssueParty);
        this.setParamSimple(map, prefix + "IssueDate", this.IssueDate);
        this.setParamSimple(map, prefix + "IssuingStatus", this.IssuingStatus);
        this.setParamSimple(map, prefix + "MarkingOfDomesticOrInternational", this.MarkingOfDomesticOrInternational);
        this.setParamSimple(map, prefix + "NameOfPurchaser", this.NameOfPurchaser);
        this.setParamSimple(map, prefix + "NameOfSeller", this.NameOfSeller);
        this.setParamSimple(map, prefix + "UnifiedSocialCreditCodeOfPurchaser", this.UnifiedSocialCreditCodeOfPurchaser);

    }
}

