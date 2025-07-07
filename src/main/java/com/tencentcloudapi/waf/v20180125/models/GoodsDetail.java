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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GoodsDetail extends AbstractModel {

    /**
    * 时间间隔
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 单位，支持m、y、d
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 产品码
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * 二级产品码
    */
    @SerializedName("SubProductCode")
    @Expose
    private String SubProductCode;

    /**
    * 计费策略id
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * waf产品码
    */
    @SerializedName("ProductInfo")
    @Expose
    private ProductInfo [] ProductInfo;

    /**
    * waf实例名
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * QPS数量
    */
    @SerializedName("ElasticQps")
    @Expose
    private Long ElasticQps;

    /**
    * 弹性账单
    */
    @SerializedName("FlexBill")
    @Expose
    private Long FlexBill;

    /**
    * 1:自动续费，0:不自动续费
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * waf购买的实际地域信息
    */
    @SerializedName("RealRegion")
    @Expose
    private Long RealRegion;

    /**
    * Waf实例对应的二级产品码
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 计费细项标签数组
    */
    @SerializedName("LabelTypes")
    @Expose
    private String [] LabelTypes;

    /**
    * 计费细项标签数量，一般和SvLabelType一一对应
    */
    @SerializedName("LabelCounts")
    @Expose
    private Long [] LabelCounts;

    /**
    * 变配使用，实例到期时间
    */
    @SerializedName("CurDeadline")
    @Expose
    private String CurDeadline;

    /**
    * 对存在的实例购买bot 或api 安全
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get 时间间隔 
     * @return TimeSpan 时间间隔
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 时间间隔
     * @param TimeSpan 时间间隔
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 单位，支持m、y、d 
     * @return TimeUnit 单位，支持m、y、d
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 单位，支持m、y、d
     * @param TimeUnit 单位，支持m、y、d
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 产品码 
     * @return ProductCode 产品码
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set 产品码
     * @param ProductCode 产品码
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get 二级产品码 
     * @return SubProductCode 二级产品码
     */
    public String getSubProductCode() {
        return this.SubProductCode;
    }

    /**
     * Set 二级产品码
     * @param SubProductCode 二级产品码
     */
    public void setSubProductCode(String SubProductCode) {
        this.SubProductCode = SubProductCode;
    }

    /**
     * Get 计费策略id 
     * @return Pid 计费策略id
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set 计费策略id
     * @param Pid 计费策略id
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get waf产品码 
     * @return ProductInfo waf产品码
     */
    public ProductInfo [] getProductInfo() {
        return this.ProductInfo;
    }

    /**
     * Set waf产品码
     * @param ProductInfo waf产品码
     */
    public void setProductInfo(ProductInfo [] ProductInfo) {
        this.ProductInfo = ProductInfo;
    }

    /**
     * Get waf实例名 
     * @return InstanceName waf实例名
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set waf实例名
     * @param InstanceName waf实例名
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get QPS数量 
     * @return ElasticQps QPS数量
     */
    public Long getElasticQps() {
        return this.ElasticQps;
    }

    /**
     * Set QPS数量
     * @param ElasticQps QPS数量
     */
    public void setElasticQps(Long ElasticQps) {
        this.ElasticQps = ElasticQps;
    }

    /**
     * Get 弹性账单 
     * @return FlexBill 弹性账单
     */
    public Long getFlexBill() {
        return this.FlexBill;
    }

    /**
     * Set 弹性账单
     * @param FlexBill 弹性账单
     */
    public void setFlexBill(Long FlexBill) {
        this.FlexBill = FlexBill;
    }

    /**
     * Get 1:自动续费，0:不自动续费 
     * @return AutoRenewFlag 1:自动续费，0:不自动续费
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 1:自动续费，0:不自动续费
     * @param AutoRenewFlag 1:自动续费，0:不自动续费
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get waf购买的实际地域信息 
     * @return RealRegion waf购买的实际地域信息
     */
    public Long getRealRegion() {
        return this.RealRegion;
    }

    /**
     * Set waf购买的实际地域信息
     * @param RealRegion waf购买的实际地域信息
     */
    public void setRealRegion(Long RealRegion) {
        this.RealRegion = RealRegion;
    }

    /**
     * Get Waf实例对应的二级产品码 
     * @return Type Waf实例对应的二级产品码
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Waf实例对应的二级产品码
     * @param Type Waf实例对应的二级产品码
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 计费细项标签数组 
     * @return LabelTypes 计费细项标签数组
     */
    public String [] getLabelTypes() {
        return this.LabelTypes;
    }

    /**
     * Set 计费细项标签数组
     * @param LabelTypes 计费细项标签数组
     */
    public void setLabelTypes(String [] LabelTypes) {
        this.LabelTypes = LabelTypes;
    }

    /**
     * Get 计费细项标签数量，一般和SvLabelType一一对应 
     * @return LabelCounts 计费细项标签数量，一般和SvLabelType一一对应
     */
    public Long [] getLabelCounts() {
        return this.LabelCounts;
    }

    /**
     * Set 计费细项标签数量，一般和SvLabelType一一对应
     * @param LabelCounts 计费细项标签数量，一般和SvLabelType一一对应
     */
    public void setLabelCounts(Long [] LabelCounts) {
        this.LabelCounts = LabelCounts;
    }

    /**
     * Get 变配使用，实例到期时间 
     * @return CurDeadline 变配使用，实例到期时间
     */
    public String getCurDeadline() {
        return this.CurDeadline;
    }

    /**
     * Set 变配使用，实例到期时间
     * @param CurDeadline 变配使用，实例到期时间
     */
    public void setCurDeadline(String CurDeadline) {
        this.CurDeadline = CurDeadline;
    }

    /**
     * Get 对存在的实例购买bot 或api 安全 
     * @return InstanceId 对存在的实例购买bot 或api 安全
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 对存在的实例购买bot 或api 安全
     * @param InstanceId 对存在的实例购买bot 或api 安全
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public GoodsDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GoodsDetail(GoodsDetail source) {
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.SubProductCode != null) {
            this.SubProductCode = new String(source.SubProductCode);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.ProductInfo != null) {
            this.ProductInfo = new ProductInfo[source.ProductInfo.length];
            for (int i = 0; i < source.ProductInfo.length; i++) {
                this.ProductInfo[i] = new ProductInfo(source.ProductInfo[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ElasticQps != null) {
            this.ElasticQps = new Long(source.ElasticQps);
        }
        if (source.FlexBill != null) {
            this.FlexBill = new Long(source.FlexBill);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.RealRegion != null) {
            this.RealRegion = new Long(source.RealRegion);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.LabelTypes != null) {
            this.LabelTypes = new String[source.LabelTypes.length];
            for (int i = 0; i < source.LabelTypes.length; i++) {
                this.LabelTypes[i] = new String(source.LabelTypes[i]);
            }
        }
        if (source.LabelCounts != null) {
            this.LabelCounts = new Long[source.LabelCounts.length];
            for (int i = 0; i < source.LabelCounts.length; i++) {
                this.LabelCounts[i] = new Long(source.LabelCounts[i]);
            }
        }
        if (source.CurDeadline != null) {
            this.CurDeadline = new String(source.CurDeadline);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "SubProductCode", this.SubProductCode);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamArrayObj(map, prefix + "ProductInfo.", this.ProductInfo);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ElasticQps", this.ElasticQps);
        this.setParamSimple(map, prefix + "FlexBill", this.FlexBill);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "RealRegion", this.RealRegion);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "LabelTypes.", this.LabelTypes);
        this.setParamArraySimple(map, prefix + "LabelCounts.", this.LabelCounts);
        this.setParamSimple(map, prefix + "CurDeadline", this.CurDeadline);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

