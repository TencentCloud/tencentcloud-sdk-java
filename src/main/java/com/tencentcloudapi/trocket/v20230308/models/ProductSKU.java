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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductSKU extends AbstractModel {

    /**
    * 产品类型，
EXPERIMENT，体验版
BASIC，基础版
PRO，专业版
PLATINUM，铂金版
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 规格代码
    */
    @SerializedName("SkuCode")
    @Expose
    private String SkuCode;

    /**
    * TPS上限
    */
    @SerializedName("TpsLimit")
    @Expose
    private Long TpsLimit;

    /**
    * 弹性TPS上限
    */
    @SerializedName("ScaledTpsLimit")
    @Expose
    private Long ScaledTpsLimit;

    /**
    * 主题数量上限默认值
    */
    @SerializedName("TopicNumLimit")
    @Expose
    private Long TopicNumLimit;

    /**
    * 消费组数量上限
    */
    @SerializedName("GroupNumLimit")
    @Expose
    private Long GroupNumLimit;

    /**
    * 默认消息保留时间，小时为单位
    */
    @SerializedName("DefaultRetention")
    @Expose
    private Long DefaultRetention;

    /**
    * 可调整消息保留时间上限，小时为单位
    */
    @SerializedName("RetentionUpperLimit")
    @Expose
    private Long RetentionUpperLimit;

    /**
    * 可调整消息保留时间下限，小时为单位
    */
    @SerializedName("RetentionLowerLimit")
    @Expose
    private Long RetentionLowerLimit;

    /**
    * 延时消息最大时长，小时为单位
    */
    @SerializedName("MaxMessageDelay")
    @Expose
    private Long MaxMessageDelay;

    /**
    * 是否可购买
    */
    @SerializedName("OnSale")
    @Expose
    private Boolean OnSale;

    /**
    * 计费项信息
    */
    @SerializedName("PriceTags")
    @Expose
    private PriceTag [] PriceTags;

    /**
    * 主题数量上限默认最大值
    */
    @SerializedName("TopicNumUpperLimit")
    @Expose
    private Long TopicNumUpperLimit;

    /**
     * Get 产品类型，
EXPERIMENT，体验版
BASIC，基础版
PRO，专业版
PLATINUM，铂金版 
     * @return InstanceType 产品类型，
EXPERIMENT，体验版
BASIC，基础版
PRO，专业版
PLATINUM，铂金版
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 产品类型，
EXPERIMENT，体验版
BASIC，基础版
PRO，专业版
PLATINUM，铂金版
     * @param InstanceType 产品类型，
EXPERIMENT，体验版
BASIC，基础版
PRO，专业版
PLATINUM，铂金版
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 规格代码 
     * @return SkuCode 规格代码
     */
    public String getSkuCode() {
        return this.SkuCode;
    }

    /**
     * Set 规格代码
     * @param SkuCode 规格代码
     */
    public void setSkuCode(String SkuCode) {
        this.SkuCode = SkuCode;
    }

    /**
     * Get TPS上限 
     * @return TpsLimit TPS上限
     */
    public Long getTpsLimit() {
        return this.TpsLimit;
    }

    /**
     * Set TPS上限
     * @param TpsLimit TPS上限
     */
    public void setTpsLimit(Long TpsLimit) {
        this.TpsLimit = TpsLimit;
    }

    /**
     * Get 弹性TPS上限 
     * @return ScaledTpsLimit 弹性TPS上限
     */
    public Long getScaledTpsLimit() {
        return this.ScaledTpsLimit;
    }

    /**
     * Set 弹性TPS上限
     * @param ScaledTpsLimit 弹性TPS上限
     */
    public void setScaledTpsLimit(Long ScaledTpsLimit) {
        this.ScaledTpsLimit = ScaledTpsLimit;
    }

    /**
     * Get 主题数量上限默认值 
     * @return TopicNumLimit 主题数量上限默认值
     */
    public Long getTopicNumLimit() {
        return this.TopicNumLimit;
    }

    /**
     * Set 主题数量上限默认值
     * @param TopicNumLimit 主题数量上限默认值
     */
    public void setTopicNumLimit(Long TopicNumLimit) {
        this.TopicNumLimit = TopicNumLimit;
    }

    /**
     * Get 消费组数量上限 
     * @return GroupNumLimit 消费组数量上限
     */
    public Long getGroupNumLimit() {
        return this.GroupNumLimit;
    }

    /**
     * Set 消费组数量上限
     * @param GroupNumLimit 消费组数量上限
     */
    public void setGroupNumLimit(Long GroupNumLimit) {
        this.GroupNumLimit = GroupNumLimit;
    }

    /**
     * Get 默认消息保留时间，小时为单位 
     * @return DefaultRetention 默认消息保留时间，小时为单位
     */
    public Long getDefaultRetention() {
        return this.DefaultRetention;
    }

    /**
     * Set 默认消息保留时间，小时为单位
     * @param DefaultRetention 默认消息保留时间，小时为单位
     */
    public void setDefaultRetention(Long DefaultRetention) {
        this.DefaultRetention = DefaultRetention;
    }

    /**
     * Get 可调整消息保留时间上限，小时为单位 
     * @return RetentionUpperLimit 可调整消息保留时间上限，小时为单位
     */
    public Long getRetentionUpperLimit() {
        return this.RetentionUpperLimit;
    }

    /**
     * Set 可调整消息保留时间上限，小时为单位
     * @param RetentionUpperLimit 可调整消息保留时间上限，小时为单位
     */
    public void setRetentionUpperLimit(Long RetentionUpperLimit) {
        this.RetentionUpperLimit = RetentionUpperLimit;
    }

    /**
     * Get 可调整消息保留时间下限，小时为单位 
     * @return RetentionLowerLimit 可调整消息保留时间下限，小时为单位
     */
    public Long getRetentionLowerLimit() {
        return this.RetentionLowerLimit;
    }

    /**
     * Set 可调整消息保留时间下限，小时为单位
     * @param RetentionLowerLimit 可调整消息保留时间下限，小时为单位
     */
    public void setRetentionLowerLimit(Long RetentionLowerLimit) {
        this.RetentionLowerLimit = RetentionLowerLimit;
    }

    /**
     * Get 延时消息最大时长，小时为单位 
     * @return MaxMessageDelay 延时消息最大时长，小时为单位
     */
    public Long getMaxMessageDelay() {
        return this.MaxMessageDelay;
    }

    /**
     * Set 延时消息最大时长，小时为单位
     * @param MaxMessageDelay 延时消息最大时长，小时为单位
     */
    public void setMaxMessageDelay(Long MaxMessageDelay) {
        this.MaxMessageDelay = MaxMessageDelay;
    }

    /**
     * Get 是否可购买 
     * @return OnSale 是否可购买
     */
    public Boolean getOnSale() {
        return this.OnSale;
    }

    /**
     * Set 是否可购买
     * @param OnSale 是否可购买
     */
    public void setOnSale(Boolean OnSale) {
        this.OnSale = OnSale;
    }

    /**
     * Get 计费项信息 
     * @return PriceTags 计费项信息
     */
    public PriceTag [] getPriceTags() {
        return this.PriceTags;
    }

    /**
     * Set 计费项信息
     * @param PriceTags 计费项信息
     */
    public void setPriceTags(PriceTag [] PriceTags) {
        this.PriceTags = PriceTags;
    }

    /**
     * Get 主题数量上限默认最大值 
     * @return TopicNumUpperLimit 主题数量上限默认最大值
     */
    public Long getTopicNumUpperLimit() {
        return this.TopicNumUpperLimit;
    }

    /**
     * Set 主题数量上限默认最大值
     * @param TopicNumUpperLimit 主题数量上限默认最大值
     */
    public void setTopicNumUpperLimit(Long TopicNumUpperLimit) {
        this.TopicNumUpperLimit = TopicNumUpperLimit;
    }

    public ProductSKU() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProductSKU(ProductSKU source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.SkuCode != null) {
            this.SkuCode = new String(source.SkuCode);
        }
        if (source.TpsLimit != null) {
            this.TpsLimit = new Long(source.TpsLimit);
        }
        if (source.ScaledTpsLimit != null) {
            this.ScaledTpsLimit = new Long(source.ScaledTpsLimit);
        }
        if (source.TopicNumLimit != null) {
            this.TopicNumLimit = new Long(source.TopicNumLimit);
        }
        if (source.GroupNumLimit != null) {
            this.GroupNumLimit = new Long(source.GroupNumLimit);
        }
        if (source.DefaultRetention != null) {
            this.DefaultRetention = new Long(source.DefaultRetention);
        }
        if (source.RetentionUpperLimit != null) {
            this.RetentionUpperLimit = new Long(source.RetentionUpperLimit);
        }
        if (source.RetentionLowerLimit != null) {
            this.RetentionLowerLimit = new Long(source.RetentionLowerLimit);
        }
        if (source.MaxMessageDelay != null) {
            this.MaxMessageDelay = new Long(source.MaxMessageDelay);
        }
        if (source.OnSale != null) {
            this.OnSale = new Boolean(source.OnSale);
        }
        if (source.PriceTags != null) {
            this.PriceTags = new PriceTag[source.PriceTags.length];
            for (int i = 0; i < source.PriceTags.length; i++) {
                this.PriceTags[i] = new PriceTag(source.PriceTags[i]);
            }
        }
        if (source.TopicNumUpperLimit != null) {
            this.TopicNumUpperLimit = new Long(source.TopicNumUpperLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "SkuCode", this.SkuCode);
        this.setParamSimple(map, prefix + "TpsLimit", this.TpsLimit);
        this.setParamSimple(map, prefix + "ScaledTpsLimit", this.ScaledTpsLimit);
        this.setParamSimple(map, prefix + "TopicNumLimit", this.TopicNumLimit);
        this.setParamSimple(map, prefix + "GroupNumLimit", this.GroupNumLimit);
        this.setParamSimple(map, prefix + "DefaultRetention", this.DefaultRetention);
        this.setParamSimple(map, prefix + "RetentionUpperLimit", this.RetentionUpperLimit);
        this.setParamSimple(map, prefix + "RetentionLowerLimit", this.RetentionLowerLimit);
        this.setParamSimple(map, prefix + "MaxMessageDelay", this.MaxMessageDelay);
        this.setParamSimple(map, prefix + "OnSale", this.OnSale);
        this.setParamArrayObj(map, prefix + "PriceTags.", this.PriceTags);
        this.setParamSimple(map, prefix + "TopicNumUpperLimit", this.TopicNumUpperLimit);

    }
}

