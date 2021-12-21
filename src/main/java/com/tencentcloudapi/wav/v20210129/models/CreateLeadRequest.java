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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLeadRequest extends AbstractModel{

    /**
    * 来源ID
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

    /**
    * 来源名称
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 创建时间， 单位毫秒
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 线索类型：1-400呼入，2-常规留资
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * 经销商id
    */
    @SerializedName("DealerId")
    @Expose
    private Long DealerId;

    /**
    * 品牌id
    */
    @SerializedName("BrandId")
    @Expose
    private Long BrandId;

    /**
    * 车系id
    */
    @SerializedName("SeriesId")
    @Expose
    private Long SeriesId;

    /**
    * 客户姓名
    */
    @SerializedName("CustomerName")
    @Expose
    private String CustomerName;

    /**
    * 客户手机号
    */
    @SerializedName("CustomerPhone")
    @Expose
    private String CustomerPhone;

    /**
    * 车型id
    */
    @SerializedName("ModelId")
    @Expose
    private Long ModelId;

    /**
    * 客户性别: 0-未知, 1-男, 2-女
    */
    @SerializedName("CustomerSex")
    @Expose
    private Long CustomerSex;

    /**
    * 销售姓名
    */
    @SerializedName("SalesName")
    @Expose
    private String SalesName;

    /**
    * 销售手机号
    */
    @SerializedName("SalesPhone")
    @Expose
    private String SalesPhone;

    /**
    * Cc坐席姓名
    */
    @SerializedName("CcName")
    @Expose
    private String CcName;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 来源ID 
     * @return ChannelId 来源ID
     */
    public Long getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 来源ID
     * @param ChannelId 来源ID
     */
    public void setChannelId(Long ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 来源名称 
     * @return ChannelName 来源名称
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 来源名称
     * @param ChannelName 来源名称
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 创建时间， 单位毫秒 
     * @return CreateTime 创建时间， 单位毫秒
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间， 单位毫秒
     * @param CreateTime 创建时间， 单位毫秒
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 线索类型：1-400呼入，2-常规留资 
     * @return SourceType 线索类型：1-400呼入，2-常规留资
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 线索类型：1-400呼入，2-常规留资
     * @param SourceType 线索类型：1-400呼入，2-常规留资
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 经销商id 
     * @return DealerId 经销商id
     */
    public Long getDealerId() {
        return this.DealerId;
    }

    /**
     * Set 经销商id
     * @param DealerId 经销商id
     */
    public void setDealerId(Long DealerId) {
        this.DealerId = DealerId;
    }

    /**
     * Get 品牌id 
     * @return BrandId 品牌id
     */
    public Long getBrandId() {
        return this.BrandId;
    }

    /**
     * Set 品牌id
     * @param BrandId 品牌id
     */
    public void setBrandId(Long BrandId) {
        this.BrandId = BrandId;
    }

    /**
     * Get 车系id 
     * @return SeriesId 车系id
     */
    public Long getSeriesId() {
        return this.SeriesId;
    }

    /**
     * Set 车系id
     * @param SeriesId 车系id
     */
    public void setSeriesId(Long SeriesId) {
        this.SeriesId = SeriesId;
    }

    /**
     * Get 客户姓名 
     * @return CustomerName 客户姓名
     */
    public String getCustomerName() {
        return this.CustomerName;
    }

    /**
     * Set 客户姓名
     * @param CustomerName 客户姓名
     */
    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    /**
     * Get 客户手机号 
     * @return CustomerPhone 客户手机号
     */
    public String getCustomerPhone() {
        return this.CustomerPhone;
    }

    /**
     * Set 客户手机号
     * @param CustomerPhone 客户手机号
     */
    public void setCustomerPhone(String CustomerPhone) {
        this.CustomerPhone = CustomerPhone;
    }

    /**
     * Get 车型id 
     * @return ModelId 车型id
     */
    public Long getModelId() {
        return this.ModelId;
    }

    /**
     * Set 车型id
     * @param ModelId 车型id
     */
    public void setModelId(Long ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get 客户性别: 0-未知, 1-男, 2-女 
     * @return CustomerSex 客户性别: 0-未知, 1-男, 2-女
     */
    public Long getCustomerSex() {
        return this.CustomerSex;
    }

    /**
     * Set 客户性别: 0-未知, 1-男, 2-女
     * @param CustomerSex 客户性别: 0-未知, 1-男, 2-女
     */
    public void setCustomerSex(Long CustomerSex) {
        this.CustomerSex = CustomerSex;
    }

    /**
     * Get 销售姓名 
     * @return SalesName 销售姓名
     */
    public String getSalesName() {
        return this.SalesName;
    }

    /**
     * Set 销售姓名
     * @param SalesName 销售姓名
     */
    public void setSalesName(String SalesName) {
        this.SalesName = SalesName;
    }

    /**
     * Get 销售手机号 
     * @return SalesPhone 销售手机号
     */
    public String getSalesPhone() {
        return this.SalesPhone;
    }

    /**
     * Set 销售手机号
     * @param SalesPhone 销售手机号
     */
    public void setSalesPhone(String SalesPhone) {
        this.SalesPhone = SalesPhone;
    }

    /**
     * Get Cc坐席姓名 
     * @return CcName Cc坐席姓名
     */
    public String getCcName() {
        return this.CcName;
    }

    /**
     * Set Cc坐席姓名
     * @param CcName Cc坐席姓名
     */
    public void setCcName(String CcName) {
        this.CcName = CcName;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public CreateLeadRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLeadRequest(CreateLeadRequest source) {
        if (source.ChannelId != null) {
            this.ChannelId = new Long(source.ChannelId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.DealerId != null) {
            this.DealerId = new Long(source.DealerId);
        }
        if (source.BrandId != null) {
            this.BrandId = new Long(source.BrandId);
        }
        if (source.SeriesId != null) {
            this.SeriesId = new Long(source.SeriesId);
        }
        if (source.CustomerName != null) {
            this.CustomerName = new String(source.CustomerName);
        }
        if (source.CustomerPhone != null) {
            this.CustomerPhone = new String(source.CustomerPhone);
        }
        if (source.ModelId != null) {
            this.ModelId = new Long(source.ModelId);
        }
        if (source.CustomerSex != null) {
            this.CustomerSex = new Long(source.CustomerSex);
        }
        if (source.SalesName != null) {
            this.SalesName = new String(source.SalesName);
        }
        if (source.SalesPhone != null) {
            this.SalesPhone = new String(source.SalesPhone);
        }
        if (source.CcName != null) {
            this.CcName = new String(source.CcName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "DealerId", this.DealerId);
        this.setParamSimple(map, prefix + "BrandId", this.BrandId);
        this.setParamSimple(map, prefix + "SeriesId", this.SeriesId);
        this.setParamSimple(map, prefix + "CustomerName", this.CustomerName);
        this.setParamSimple(map, prefix + "CustomerPhone", this.CustomerPhone);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "CustomerSex", this.CustomerSex);
        this.setParamSimple(map, prefix + "SalesName", this.SalesName);
        this.setParamSimple(map, prefix + "SalesPhone", this.SalesPhone);
        this.setParamSimple(map, prefix + "CcName", this.CcName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

