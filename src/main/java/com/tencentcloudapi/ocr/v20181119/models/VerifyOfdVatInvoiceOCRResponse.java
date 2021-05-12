/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyOfdVatInvoiceOCRResponse extends AbstractModel{

    /**
    * 发票类型
026:增值税电子普通发票
028:增值税电子专用发票
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 发票代码
    */
    @SerializedName("InvoiceCode")
    @Expose
    private String InvoiceCode;

    /**
    * 发票号码
    */
    @SerializedName("InvoiceNumber")
    @Expose
    private String InvoiceNumber;

    /**
    * 开票日期
    */
    @SerializedName("IssueDate")
    @Expose
    private String IssueDate;

    /**
    * 验证码
    */
    @SerializedName("InvoiceCheckCode")
    @Expose
    private String InvoiceCheckCode;

    /**
    * 机器编号
    */
    @SerializedName("MachineNumber")
    @Expose
    private String MachineNumber;

    /**
    * 密码区
    */
    @SerializedName("TaxControlCode")
    @Expose
    private String TaxControlCode;

    /**
    * 购买方
    */
    @SerializedName("Buyer")
    @Expose
    private VatInvoiceUserInfo Buyer;

    /**
    * 销售方
    */
    @SerializedName("Seller")
    @Expose
    private VatInvoiceUserInfo Seller;

    /**
    * 价税合计
    */
    @SerializedName("TaxInclusiveTotalAmount")
    @Expose
    private String TaxInclusiveTotalAmount;

    /**
    * 开票人
    */
    @SerializedName("InvoiceClerk")
    @Expose
    private String InvoiceClerk;

    /**
    * 收款人
    */
    @SerializedName("Payee")
    @Expose
    private String Payee;

    /**
    * 复核人
    */
    @SerializedName("Checker")
    @Expose
    private String Checker;

    /**
    * 税额
    */
    @SerializedName("TaxTotalAmount")
    @Expose
    private String TaxTotalAmount;

    /**
    * 不含税金额
    */
    @SerializedName("TaxExclusiveTotalAmount")
    @Expose
    private String TaxExclusiveTotalAmount;

    /**
    * 备注
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * 货物或服务清单
    */
    @SerializedName("GoodsInfos")
    @Expose
    private VatInvoiceGoodsInfo [] GoodsInfos;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 发票类型
026:增值税电子普通发票
028:增值税电子专用发票 
     * @return Type 发票类型
026:增值税电子普通发票
028:增值税电子专用发票
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 发票类型
026:增值税电子普通发票
028:增值税电子专用发票
     * @param Type 发票类型
026:增值税电子普通发票
028:增值税电子专用发票
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 发票代码 
     * @return InvoiceCode 发票代码
     */
    public String getInvoiceCode() {
        return this.InvoiceCode;
    }

    /**
     * Set 发票代码
     * @param InvoiceCode 发票代码
     */
    public void setInvoiceCode(String InvoiceCode) {
        this.InvoiceCode = InvoiceCode;
    }

    /**
     * Get 发票号码 
     * @return InvoiceNumber 发票号码
     */
    public String getInvoiceNumber() {
        return this.InvoiceNumber;
    }

    /**
     * Set 发票号码
     * @param InvoiceNumber 发票号码
     */
    public void setInvoiceNumber(String InvoiceNumber) {
        this.InvoiceNumber = InvoiceNumber;
    }

    /**
     * Get 开票日期 
     * @return IssueDate 开票日期
     */
    public String getIssueDate() {
        return this.IssueDate;
    }

    /**
     * Set 开票日期
     * @param IssueDate 开票日期
     */
    public void setIssueDate(String IssueDate) {
        this.IssueDate = IssueDate;
    }

    /**
     * Get 验证码 
     * @return InvoiceCheckCode 验证码
     */
    public String getInvoiceCheckCode() {
        return this.InvoiceCheckCode;
    }

    /**
     * Set 验证码
     * @param InvoiceCheckCode 验证码
     */
    public void setInvoiceCheckCode(String InvoiceCheckCode) {
        this.InvoiceCheckCode = InvoiceCheckCode;
    }

    /**
     * Get 机器编号 
     * @return MachineNumber 机器编号
     */
    public String getMachineNumber() {
        return this.MachineNumber;
    }

    /**
     * Set 机器编号
     * @param MachineNumber 机器编号
     */
    public void setMachineNumber(String MachineNumber) {
        this.MachineNumber = MachineNumber;
    }

    /**
     * Get 密码区 
     * @return TaxControlCode 密码区
     */
    public String getTaxControlCode() {
        return this.TaxControlCode;
    }

    /**
     * Set 密码区
     * @param TaxControlCode 密码区
     */
    public void setTaxControlCode(String TaxControlCode) {
        this.TaxControlCode = TaxControlCode;
    }

    /**
     * Get 购买方 
     * @return Buyer 购买方
     */
    public VatInvoiceUserInfo getBuyer() {
        return this.Buyer;
    }

    /**
     * Set 购买方
     * @param Buyer 购买方
     */
    public void setBuyer(VatInvoiceUserInfo Buyer) {
        this.Buyer = Buyer;
    }

    /**
     * Get 销售方 
     * @return Seller 销售方
     */
    public VatInvoiceUserInfo getSeller() {
        return this.Seller;
    }

    /**
     * Set 销售方
     * @param Seller 销售方
     */
    public void setSeller(VatInvoiceUserInfo Seller) {
        this.Seller = Seller;
    }

    /**
     * Get 价税合计 
     * @return TaxInclusiveTotalAmount 价税合计
     */
    public String getTaxInclusiveTotalAmount() {
        return this.TaxInclusiveTotalAmount;
    }

    /**
     * Set 价税合计
     * @param TaxInclusiveTotalAmount 价税合计
     */
    public void setTaxInclusiveTotalAmount(String TaxInclusiveTotalAmount) {
        this.TaxInclusiveTotalAmount = TaxInclusiveTotalAmount;
    }

    /**
     * Get 开票人 
     * @return InvoiceClerk 开票人
     */
    public String getInvoiceClerk() {
        return this.InvoiceClerk;
    }

    /**
     * Set 开票人
     * @param InvoiceClerk 开票人
     */
    public void setInvoiceClerk(String InvoiceClerk) {
        this.InvoiceClerk = InvoiceClerk;
    }

    /**
     * Get 收款人 
     * @return Payee 收款人
     */
    public String getPayee() {
        return this.Payee;
    }

    /**
     * Set 收款人
     * @param Payee 收款人
     */
    public void setPayee(String Payee) {
        this.Payee = Payee;
    }

    /**
     * Get 复核人 
     * @return Checker 复核人
     */
    public String getChecker() {
        return this.Checker;
    }

    /**
     * Set 复核人
     * @param Checker 复核人
     */
    public void setChecker(String Checker) {
        this.Checker = Checker;
    }

    /**
     * Get 税额 
     * @return TaxTotalAmount 税额
     */
    public String getTaxTotalAmount() {
        return this.TaxTotalAmount;
    }

    /**
     * Set 税额
     * @param TaxTotalAmount 税额
     */
    public void setTaxTotalAmount(String TaxTotalAmount) {
        this.TaxTotalAmount = TaxTotalAmount;
    }

    /**
     * Get 不含税金额 
     * @return TaxExclusiveTotalAmount 不含税金额
     */
    public String getTaxExclusiveTotalAmount() {
        return this.TaxExclusiveTotalAmount;
    }

    /**
     * Set 不含税金额
     * @param TaxExclusiveTotalAmount 不含税金额
     */
    public void setTaxExclusiveTotalAmount(String TaxExclusiveTotalAmount) {
        this.TaxExclusiveTotalAmount = TaxExclusiveTotalAmount;
    }

    /**
     * Get 备注 
     * @return Note 备注
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set 备注
     * @param Note 备注
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get 货物或服务清单 
     * @return GoodsInfos 货物或服务清单
     */
    public VatInvoiceGoodsInfo [] getGoodsInfos() {
        return this.GoodsInfos;
    }

    /**
     * Set 货物或服务清单
     * @param GoodsInfos 货物或服务清单
     */
    public void setGoodsInfos(VatInvoiceGoodsInfo [] GoodsInfos) {
        this.GoodsInfos = GoodsInfos;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public VerifyOfdVatInvoiceOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyOfdVatInvoiceOCRResponse(VerifyOfdVatInvoiceOCRResponse source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.InvoiceCode != null) {
            this.InvoiceCode = new String(source.InvoiceCode);
        }
        if (source.InvoiceNumber != null) {
            this.InvoiceNumber = new String(source.InvoiceNumber);
        }
        if (source.IssueDate != null) {
            this.IssueDate = new String(source.IssueDate);
        }
        if (source.InvoiceCheckCode != null) {
            this.InvoiceCheckCode = new String(source.InvoiceCheckCode);
        }
        if (source.MachineNumber != null) {
            this.MachineNumber = new String(source.MachineNumber);
        }
        if (source.TaxControlCode != null) {
            this.TaxControlCode = new String(source.TaxControlCode);
        }
        if (source.Buyer != null) {
            this.Buyer = new VatInvoiceUserInfo(source.Buyer);
        }
        if (source.Seller != null) {
            this.Seller = new VatInvoiceUserInfo(source.Seller);
        }
        if (source.TaxInclusiveTotalAmount != null) {
            this.TaxInclusiveTotalAmount = new String(source.TaxInclusiveTotalAmount);
        }
        if (source.InvoiceClerk != null) {
            this.InvoiceClerk = new String(source.InvoiceClerk);
        }
        if (source.Payee != null) {
            this.Payee = new String(source.Payee);
        }
        if (source.Checker != null) {
            this.Checker = new String(source.Checker);
        }
        if (source.TaxTotalAmount != null) {
            this.TaxTotalAmount = new String(source.TaxTotalAmount);
        }
        if (source.TaxExclusiveTotalAmount != null) {
            this.TaxExclusiveTotalAmount = new String(source.TaxExclusiveTotalAmount);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.GoodsInfos != null) {
            this.GoodsInfos = new VatInvoiceGoodsInfo[source.GoodsInfos.length];
            for (int i = 0; i < source.GoodsInfos.length; i++) {
                this.GoodsInfos[i] = new VatInvoiceGoodsInfo(source.GoodsInfos[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "InvoiceCode", this.InvoiceCode);
        this.setParamSimple(map, prefix + "InvoiceNumber", this.InvoiceNumber);
        this.setParamSimple(map, prefix + "IssueDate", this.IssueDate);
        this.setParamSimple(map, prefix + "InvoiceCheckCode", this.InvoiceCheckCode);
        this.setParamSimple(map, prefix + "MachineNumber", this.MachineNumber);
        this.setParamSimple(map, prefix + "TaxControlCode", this.TaxControlCode);
        this.setParamObj(map, prefix + "Buyer.", this.Buyer);
        this.setParamObj(map, prefix + "Seller.", this.Seller);
        this.setParamSimple(map, prefix + "TaxInclusiveTotalAmount", this.TaxInclusiveTotalAmount);
        this.setParamSimple(map, prefix + "InvoiceClerk", this.InvoiceClerk);
        this.setParamSimple(map, prefix + "Payee", this.Payee);
        this.setParamSimple(map, prefix + "Checker", this.Checker);
        this.setParamSimple(map, prefix + "TaxTotalAmount", this.TaxTotalAmount);
        this.setParamSimple(map, prefix + "TaxExclusiveTotalAmount", this.TaxExclusiveTotalAmount);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamArrayObj(map, prefix + "GoodsInfos.", this.GoodsInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

