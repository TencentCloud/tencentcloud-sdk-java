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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductSkuItem extends AbstractModel {

    /**
    * 规格类型
BASIC：基础版
PRO ：专业版
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
    * 是否售卖
    */
    @SerializedName("OnSale")
    @Expose
    private Boolean OnSale;

    /**
    * topic num限制
    */
    @SerializedName("TopicNumLimit")
    @Expose
    private Long TopicNumLimit;

    /**
    * tps
    */
    @SerializedName("TpsLimit")
    @Expose
    private Long TpsLimit;

    /**
    * 客户端连接数
    */
    @SerializedName("ClientNumLimit")
    @Expose
    private Long ClientNumLimit;

    /**
    * 单客户端最大订阅数
    */
    @SerializedName("MaxSubscriptionPerClient")
    @Expose
    private Long MaxSubscriptionPerClient;

    /**
    * 授权规则条数
    */
    @SerializedName("AuthorizationPolicyLimit")
    @Expose
    private Long AuthorizationPolicyLimit;

    /**
    * 计费项信息
    */
    @SerializedName("PriceTags")
    @Expose
    private PriceTag [] PriceTags;

    /**
     * Get 规格类型
BASIC：基础版
PRO ：专业版 
     * @return InstanceType 规格类型
BASIC：基础版
PRO ：专业版
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 规格类型
BASIC：基础版
PRO ：专业版
     * @param InstanceType 规格类型
BASIC：基础版
PRO ：专业版
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
     * Get 是否售卖 
     * @return OnSale 是否售卖
     */
    public Boolean getOnSale() {
        return this.OnSale;
    }

    /**
     * Set 是否售卖
     * @param OnSale 是否售卖
     */
    public void setOnSale(Boolean OnSale) {
        this.OnSale = OnSale;
    }

    /**
     * Get topic num限制 
     * @return TopicNumLimit topic num限制
     */
    public Long getTopicNumLimit() {
        return this.TopicNumLimit;
    }

    /**
     * Set topic num限制
     * @param TopicNumLimit topic num限制
     */
    public void setTopicNumLimit(Long TopicNumLimit) {
        this.TopicNumLimit = TopicNumLimit;
    }

    /**
     * Get tps 
     * @return TpsLimit tps
     */
    public Long getTpsLimit() {
        return this.TpsLimit;
    }

    /**
     * Set tps
     * @param TpsLimit tps
     */
    public void setTpsLimit(Long TpsLimit) {
        this.TpsLimit = TpsLimit;
    }

    /**
     * Get 客户端连接数 
     * @return ClientNumLimit 客户端连接数
     */
    public Long getClientNumLimit() {
        return this.ClientNumLimit;
    }

    /**
     * Set 客户端连接数
     * @param ClientNumLimit 客户端连接数
     */
    public void setClientNumLimit(Long ClientNumLimit) {
        this.ClientNumLimit = ClientNumLimit;
    }

    /**
     * Get 单客户端最大订阅数 
     * @return MaxSubscriptionPerClient 单客户端最大订阅数
     */
    public Long getMaxSubscriptionPerClient() {
        return this.MaxSubscriptionPerClient;
    }

    /**
     * Set 单客户端最大订阅数
     * @param MaxSubscriptionPerClient 单客户端最大订阅数
     */
    public void setMaxSubscriptionPerClient(Long MaxSubscriptionPerClient) {
        this.MaxSubscriptionPerClient = MaxSubscriptionPerClient;
    }

    /**
     * Get 授权规则条数 
     * @return AuthorizationPolicyLimit 授权规则条数
     */
    public Long getAuthorizationPolicyLimit() {
        return this.AuthorizationPolicyLimit;
    }

    /**
     * Set 授权规则条数
     * @param AuthorizationPolicyLimit 授权规则条数
     */
    public void setAuthorizationPolicyLimit(Long AuthorizationPolicyLimit) {
        this.AuthorizationPolicyLimit = AuthorizationPolicyLimit;
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

    public ProductSkuItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProductSkuItem(ProductSkuItem source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.SkuCode != null) {
            this.SkuCode = new String(source.SkuCode);
        }
        if (source.OnSale != null) {
            this.OnSale = new Boolean(source.OnSale);
        }
        if (source.TopicNumLimit != null) {
            this.TopicNumLimit = new Long(source.TopicNumLimit);
        }
        if (source.TpsLimit != null) {
            this.TpsLimit = new Long(source.TpsLimit);
        }
        if (source.ClientNumLimit != null) {
            this.ClientNumLimit = new Long(source.ClientNumLimit);
        }
        if (source.MaxSubscriptionPerClient != null) {
            this.MaxSubscriptionPerClient = new Long(source.MaxSubscriptionPerClient);
        }
        if (source.AuthorizationPolicyLimit != null) {
            this.AuthorizationPolicyLimit = new Long(source.AuthorizationPolicyLimit);
        }
        if (source.PriceTags != null) {
            this.PriceTags = new PriceTag[source.PriceTags.length];
            for (int i = 0; i < source.PriceTags.length; i++) {
                this.PriceTags[i] = new PriceTag(source.PriceTags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "SkuCode", this.SkuCode);
        this.setParamSimple(map, prefix + "OnSale", this.OnSale);
        this.setParamSimple(map, prefix + "TopicNumLimit", this.TopicNumLimit);
        this.setParamSimple(map, prefix + "TpsLimit", this.TpsLimit);
        this.setParamSimple(map, prefix + "ClientNumLimit", this.ClientNumLimit);
        this.setParamSimple(map, prefix + "MaxSubscriptionPerClient", this.MaxSubscriptionPerClient);
        this.setParamSimple(map, prefix + "AuthorizationPolicyLimit", this.AuthorizationPolicyLimit);
        this.setParamArrayObj(map, prefix + "PriceTags.", this.PriceTags);

    }
}

