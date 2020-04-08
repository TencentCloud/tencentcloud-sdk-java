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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInvoiceItem extends AbstractModel{

    /**
    * 商品名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 税收商品编码
    */
    @SerializedName("TaxCode")
    @Expose
    private String TaxCode;

    /**
    * 不含税商品总价（商品含税价总额/（1+税率））。单位为分
    */
    @SerializedName("TotalPrice")
    @Expose
    private Long TotalPrice;

    /**
    * 商品税率
    */
    @SerializedName("TaxRate")
    @Expose
    private Long TaxRate;

    /**
    * 商品税额（不含税商品总价*税率）。单位为分
    */
    @SerializedName("TaxAmount")
    @Expose
    private Long TaxAmount;

    /**
    * 税收商品类别
    */
    @SerializedName("TaxType")
    @Expose
    private String TaxType;

    /**
    * 商品规格
    */
    @SerializedName("Models")
    @Expose
    private String Models;

    /**
    * 商品单位
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 商品数量
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * 不含税商品单价
    */
    @SerializedName("Price")
    @Expose
    private String Price;

    /**
    * 含税折扣总额。单位为分
    */
    @SerializedName("Discount")
    @Expose
    private Long Discount;

    /**
    * 优惠政策标志。0：不使用优惠政策；1：使用优惠政策。
    */
    @SerializedName("PreferentialPolicyFlag")
    @Expose
    private String PreferentialPolicyFlag;

    /**
    * 零税率标识：
空：非零税率；
0：出口零税率；
1：免税；
2：不征税；
3：普通零税率。
    */
    @SerializedName("ZeroTaxFlag")
    @Expose
    private String ZeroTaxFlag;

    /**
    * 增值税特殊管理。PreferentialPolicyFlag字段为1时，必填。目前仅支持5%(3%，2%，1.5%)简易征税、免税、不征税。
    */
    @SerializedName("VatSpecialManagement")
    @Expose
    private String VatSpecialManagement;

    /**
     * Get 商品名称 
     * @return Name 商品名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 商品名称
     * @param Name 商品名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 税收商品编码 
     * @return TaxCode 税收商品编码
     */
    public String getTaxCode() {
        return this.TaxCode;
    }

    /**
     * Set 税收商品编码
     * @param TaxCode 税收商品编码
     */
    public void setTaxCode(String TaxCode) {
        this.TaxCode = TaxCode;
    }

    /**
     * Get 不含税商品总价（商品含税价总额/（1+税率））。单位为分 
     * @return TotalPrice 不含税商品总价（商品含税价总额/（1+税率））。单位为分
     */
    public Long getTotalPrice() {
        return this.TotalPrice;
    }

    /**
     * Set 不含税商品总价（商品含税价总额/（1+税率））。单位为分
     * @param TotalPrice 不含税商品总价（商品含税价总额/（1+税率））。单位为分
     */
    public void setTotalPrice(Long TotalPrice) {
        this.TotalPrice = TotalPrice;
    }

    /**
     * Get 商品税率 
     * @return TaxRate 商品税率
     */
    public Long getTaxRate() {
        return this.TaxRate;
    }

    /**
     * Set 商品税率
     * @param TaxRate 商品税率
     */
    public void setTaxRate(Long TaxRate) {
        this.TaxRate = TaxRate;
    }

    /**
     * Get 商品税额（不含税商品总价*税率）。单位为分 
     * @return TaxAmount 商品税额（不含税商品总价*税率）。单位为分
     */
    public Long getTaxAmount() {
        return this.TaxAmount;
    }

    /**
     * Set 商品税额（不含税商品总价*税率）。单位为分
     * @param TaxAmount 商品税额（不含税商品总价*税率）。单位为分
     */
    public void setTaxAmount(Long TaxAmount) {
        this.TaxAmount = TaxAmount;
    }

    /**
     * Get 税收商品类别 
     * @return TaxType 税收商品类别
     */
    public String getTaxType() {
        return this.TaxType;
    }

    /**
     * Set 税收商品类别
     * @param TaxType 税收商品类别
     */
    public void setTaxType(String TaxType) {
        this.TaxType = TaxType;
    }

    /**
     * Get 商品规格 
     * @return Models 商品规格
     */
    public String getModels() {
        return this.Models;
    }

    /**
     * Set 商品规格
     * @param Models 商品规格
     */
    public void setModels(String Models) {
        this.Models = Models;
    }

    /**
     * Get 商品单位 
     * @return Unit 商品单位
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 商品单位
     * @param Unit 商品单位
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 商品数量 
     * @return Total 商品数量
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set 商品数量
     * @param Total 商品数量
     */
    public void setTotal(String Total) {
        this.Total = Total;
    }

    /**
     * Get 不含税商品单价 
     * @return Price 不含税商品单价
     */
    public String getPrice() {
        return this.Price;
    }

    /**
     * Set 不含税商品单价
     * @param Price 不含税商品单价
     */
    public void setPrice(String Price) {
        this.Price = Price;
    }

    /**
     * Get 含税折扣总额。单位为分 
     * @return Discount 含税折扣总额。单位为分
     */
    public Long getDiscount() {
        return this.Discount;
    }

    /**
     * Set 含税折扣总额。单位为分
     * @param Discount 含税折扣总额。单位为分
     */
    public void setDiscount(Long Discount) {
        this.Discount = Discount;
    }

    /**
     * Get 优惠政策标志。0：不使用优惠政策；1：使用优惠政策。 
     * @return PreferentialPolicyFlag 优惠政策标志。0：不使用优惠政策；1：使用优惠政策。
     */
    public String getPreferentialPolicyFlag() {
        return this.PreferentialPolicyFlag;
    }

    /**
     * Set 优惠政策标志。0：不使用优惠政策；1：使用优惠政策。
     * @param PreferentialPolicyFlag 优惠政策标志。0：不使用优惠政策；1：使用优惠政策。
     */
    public void setPreferentialPolicyFlag(String PreferentialPolicyFlag) {
        this.PreferentialPolicyFlag = PreferentialPolicyFlag;
    }

    /**
     * Get 零税率标识：
空：非零税率；
0：出口零税率；
1：免税；
2：不征税；
3：普通零税率。 
     * @return ZeroTaxFlag 零税率标识：
空：非零税率；
0：出口零税率；
1：免税；
2：不征税；
3：普通零税率。
     */
    public String getZeroTaxFlag() {
        return this.ZeroTaxFlag;
    }

    /**
     * Set 零税率标识：
空：非零税率；
0：出口零税率；
1：免税；
2：不征税；
3：普通零税率。
     * @param ZeroTaxFlag 零税率标识：
空：非零税率；
0：出口零税率；
1：免税；
2：不征税；
3：普通零税率。
     */
    public void setZeroTaxFlag(String ZeroTaxFlag) {
        this.ZeroTaxFlag = ZeroTaxFlag;
    }

    /**
     * Get 增值税特殊管理。PreferentialPolicyFlag字段为1时，必填。目前仅支持5%(3%，2%，1.5%)简易征税、免税、不征税。 
     * @return VatSpecialManagement 增值税特殊管理。PreferentialPolicyFlag字段为1时，必填。目前仅支持5%(3%，2%，1.5%)简易征税、免税、不征税。
     */
    public String getVatSpecialManagement() {
        return this.VatSpecialManagement;
    }

    /**
     * Set 增值税特殊管理。PreferentialPolicyFlag字段为1时，必填。目前仅支持5%(3%，2%，1.5%)简易征税、免税、不征税。
     * @param VatSpecialManagement 增值税特殊管理。PreferentialPolicyFlag字段为1时，必填。目前仅支持5%(3%，2%，1.5%)简易征税、免税、不征税。
     */
    public void setVatSpecialManagement(String VatSpecialManagement) {
        this.VatSpecialManagement = VatSpecialManagement;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TaxCode", this.TaxCode);
        this.setParamSimple(map, prefix + "TotalPrice", this.TotalPrice);
        this.setParamSimple(map, prefix + "TaxRate", this.TaxRate);
        this.setParamSimple(map, prefix + "TaxAmount", this.TaxAmount);
        this.setParamSimple(map, prefix + "TaxType", this.TaxType);
        this.setParamSimple(map, prefix + "Models", this.Models);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "PreferentialPolicyFlag", this.PreferentialPolicyFlag);
        this.setParamSimple(map, prefix + "ZeroTaxFlag", this.ZeroTaxFlag);
        this.setParamSimple(map, prefix + "VatSpecialManagement", this.VatSpecialManagement);

    }
}

