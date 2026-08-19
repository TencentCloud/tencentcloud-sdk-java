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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Merchant extends AbstractModel {

    /**
    * <p>商家ID</p>
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * <p>商家名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>商家的注册时间</p><p>参数格式：符合ISO 8601标准的带UTC时区的毫秒级时间</p>
    */
    @SerializedName("RegisterTime")
    @Expose
    private String RegisterTime;

    /**
    * <p>商家类别代码</p><p>参数格式：符合ISO 18245标准的4位编号</p>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>商家电话</p><p>参数格式：符合E.164标准的带“+”、地区编码和号码的格式</p>
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * <p>商家邮件</p>
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * <p>商家店铺网址</p>
    */
    @SerializedName("URL")
    @Expose
    private String URL;

    /**
    * <p>商家地址</p>
    */
    @SerializedName("Address")
    @Expose
    private Address Address;

    /**
    * <p>商家等级</p>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * <p>经营类型</p><p>枚举值：</p><ul><li>person： 个人</li><li>company： 企业</li></ul>
    */
    @SerializedName("BusinessType")
    @Expose
    private String BusinessType;

    /**
    * <p>商家在售商品数量</p>
    */
    @SerializedName("GoodsQuantity")
    @Expose
    private Long GoodsQuantity;

    /**
    * <p>商家历史销售数量</p>
    */
    @SerializedName("HistoricSalesQuantity")
    @Expose
    private Long HistoricSalesQuantity;

    /**
    * <p>商家历史销售总额</p>
    */
    @SerializedName("HistoricSalesAmount")
    @Expose
    private Amount HistoricSalesAmount;

    /**
     * Get <p>商家ID</p> 
     * @return MerchantId <p>商家ID</p>
     */
    public String getMerchantId() {
        return this.MerchantId;
    }

    /**
     * Set <p>商家ID</p>
     * @param MerchantId <p>商家ID</p>
     */
    public void setMerchantId(String MerchantId) {
        this.MerchantId = MerchantId;
    }

    /**
     * Get <p>商家名称</p> 
     * @return Name <p>商家名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>商家名称</p>
     * @param Name <p>商家名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>商家的注册时间</p><p>参数格式：符合ISO 8601标准的带UTC时区的毫秒级时间</p> 
     * @return RegisterTime <p>商家的注册时间</p><p>参数格式：符合ISO 8601标准的带UTC时区的毫秒级时间</p>
     */
    public String getRegisterTime() {
        return this.RegisterTime;
    }

    /**
     * Set <p>商家的注册时间</p><p>参数格式：符合ISO 8601标准的带UTC时区的毫秒级时间</p>
     * @param RegisterTime <p>商家的注册时间</p><p>参数格式：符合ISO 8601标准的带UTC时区的毫秒级时间</p>
     */
    public void setRegisterTime(String RegisterTime) {
        this.RegisterTime = RegisterTime;
    }

    /**
     * Get <p>商家类别代码</p><p>参数格式：符合ISO 18245标准的4位编号</p> 
     * @return Category <p>商家类别代码</p><p>参数格式：符合ISO 18245标准的4位编号</p>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>商家类别代码</p><p>参数格式：符合ISO 18245标准的4位编号</p>
     * @param Category <p>商家类别代码</p><p>参数格式：符合ISO 18245标准的4位编号</p>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get <p>商家电话</p><p>参数格式：符合E.164标准的带“+”、地区编码和号码的格式</p> 
     * @return Phone <p>商家电话</p><p>参数格式：符合E.164标准的带“+”、地区编码和号码的格式</p>
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set <p>商家电话</p><p>参数格式：符合E.164标准的带“+”、地区编码和号码的格式</p>
     * @param Phone <p>商家电话</p><p>参数格式：符合E.164标准的带“+”、地区编码和号码的格式</p>
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get <p>商家邮件</p> 
     * @return Email <p>商家邮件</p>
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set <p>商家邮件</p>
     * @param Email <p>商家邮件</p>
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get <p>商家店铺网址</p> 
     * @return URL <p>商家店铺网址</p>
     */
    public String getURL() {
        return this.URL;
    }

    /**
     * Set <p>商家店铺网址</p>
     * @param URL <p>商家店铺网址</p>
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     * Get <p>商家地址</p> 
     * @return Address <p>商家地址</p>
     */
    public Address getAddress() {
        return this.Address;
    }

    /**
     * Set <p>商家地址</p>
     * @param Address <p>商家地址</p>
     */
    public void setAddress(Address Address) {
        this.Address = Address;
    }

    /**
     * Get <p>商家等级</p> 
     * @return Level <p>商家等级</p>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set <p>商家等级</p>
     * @param Level <p>商家等级</p>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get <p>经营类型</p><p>枚举值：</p><ul><li>person： 个人</li><li>company： 企业</li></ul> 
     * @return BusinessType <p>经营类型</p><p>枚举值：</p><ul><li>person： 个人</li><li>company： 企业</li></ul>
     */
    public String getBusinessType() {
        return this.BusinessType;
    }

    /**
     * Set <p>经营类型</p><p>枚举值：</p><ul><li>person： 个人</li><li>company： 企业</li></ul>
     * @param BusinessType <p>经营类型</p><p>枚举值：</p><ul><li>person： 个人</li><li>company： 企业</li></ul>
     */
    public void setBusinessType(String BusinessType) {
        this.BusinessType = BusinessType;
    }

    /**
     * Get <p>商家在售商品数量</p> 
     * @return GoodsQuantity <p>商家在售商品数量</p>
     */
    public Long getGoodsQuantity() {
        return this.GoodsQuantity;
    }

    /**
     * Set <p>商家在售商品数量</p>
     * @param GoodsQuantity <p>商家在售商品数量</p>
     */
    public void setGoodsQuantity(Long GoodsQuantity) {
        this.GoodsQuantity = GoodsQuantity;
    }

    /**
     * Get <p>商家历史销售数量</p> 
     * @return HistoricSalesQuantity <p>商家历史销售数量</p>
     */
    public Long getHistoricSalesQuantity() {
        return this.HistoricSalesQuantity;
    }

    /**
     * Set <p>商家历史销售数量</p>
     * @param HistoricSalesQuantity <p>商家历史销售数量</p>
     */
    public void setHistoricSalesQuantity(Long HistoricSalesQuantity) {
        this.HistoricSalesQuantity = HistoricSalesQuantity;
    }

    /**
     * Get <p>商家历史销售总额</p> 
     * @return HistoricSalesAmount <p>商家历史销售总额</p>
     */
    public Amount getHistoricSalesAmount() {
        return this.HistoricSalesAmount;
    }

    /**
     * Set <p>商家历史销售总额</p>
     * @param HistoricSalesAmount <p>商家历史销售总额</p>
     */
    public void setHistoricSalesAmount(Amount HistoricSalesAmount) {
        this.HistoricSalesAmount = HistoricSalesAmount;
    }

    public Merchant() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Merchant(Merchant source) {
        if (source.MerchantId != null) {
            this.MerchantId = new String(source.MerchantId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RegisterTime != null) {
            this.RegisterTime = new String(source.RegisterTime);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.URL != null) {
            this.URL = new String(source.URL);
        }
        if (source.Address != null) {
            this.Address = new Address(source.Address);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.BusinessType != null) {
            this.BusinessType = new String(source.BusinessType);
        }
        if (source.GoodsQuantity != null) {
            this.GoodsQuantity = new Long(source.GoodsQuantity);
        }
        if (source.HistoricSalesQuantity != null) {
            this.HistoricSalesQuantity = new Long(source.HistoricSalesQuantity);
        }
        if (source.HistoricSalesAmount != null) {
            this.HistoricSalesAmount = new Amount(source.HistoricSalesAmount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RegisterTime", this.RegisterTime);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "URL", this.URL);
        this.setParamObj(map, prefix + "Address.", this.Address);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "BusinessType", this.BusinessType);
        this.setParamSimple(map, prefix + "GoodsQuantity", this.GoodsQuantity);
        this.setParamSimple(map, prefix + "HistoricSalesQuantity", this.HistoricSalesQuantity);
        this.setParamObj(map, prefix + "HistoricSalesAmount.", this.HistoricSalesAmount);

    }
}

