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

public class MQTTProductSkuItem extends AbstractModel {

    /**
    * 类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * cide
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SkuCode")
    @Expose
    private String SkuCode;

    /**
    * sale
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OnSale")
    @Expose
    private Boolean OnSale;

    /**
    * topic num限制
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicNumLimit")
    @Expose
    private Long TopicNumLimit;

    /**
    * tps
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TpsLimit")
    @Expose
    private Long TpsLimit;

    /**
    * 客户端连接数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientNumLimit")
    @Expose
    private Long ClientNumLimit;

    /**
    * 订阅数限制
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubscriptionNumLimit")
    @Expose
    private Long SubscriptionNumLimit;

    /**
    * 代理核
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxySpecCore")
    @Expose
    private Long ProxySpecCore;

    /**
    * 代理内存
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxySpecMemory")
    @Expose
    private Long ProxySpecMemory;

    /**
    * 代理总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxySpecCount")
    @Expose
    private Long ProxySpecCount;

    /**
     * Get 类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get cide
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SkuCode cide
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSkuCode() {
        return this.SkuCode;
    }

    /**
     * Set cide
注意：此字段可能返回 null，表示取不到有效值。
     * @param SkuCode cide
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSkuCode(String SkuCode) {
        this.SkuCode = SkuCode;
    }

    /**
     * Get sale
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OnSale sale
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getOnSale() {
        return this.OnSale;
    }

    /**
     * Set sale
注意：此字段可能返回 null，表示取不到有效值。
     * @param OnSale sale
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOnSale(Boolean OnSale) {
        this.OnSale = OnSale;
    }

    /**
     * Get topic num限制
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicNumLimit topic num限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTopicNumLimit() {
        return this.TopicNumLimit;
    }

    /**
     * Set topic num限制
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicNumLimit topic num限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicNumLimit(Long TopicNumLimit) {
        this.TopicNumLimit = TopicNumLimit;
    }

    /**
     * Get tps
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TpsLimit tps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTpsLimit() {
        return this.TpsLimit;
    }

    /**
     * Set tps
注意：此字段可能返回 null，表示取不到有效值。
     * @param TpsLimit tps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTpsLimit(Long TpsLimit) {
        this.TpsLimit = TpsLimit;
    }

    /**
     * Get 客户端连接数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientNumLimit 客户端连接数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getClientNumLimit() {
        return this.ClientNumLimit;
    }

    /**
     * Set 客户端连接数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientNumLimit 客户端连接数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientNumLimit(Long ClientNumLimit) {
        this.ClientNumLimit = ClientNumLimit;
    }

    /**
     * Get 订阅数限制
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubscriptionNumLimit 订阅数限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSubscriptionNumLimit() {
        return this.SubscriptionNumLimit;
    }

    /**
     * Set 订阅数限制
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubscriptionNumLimit 订阅数限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubscriptionNumLimit(Long SubscriptionNumLimit) {
        this.SubscriptionNumLimit = SubscriptionNumLimit;
    }

    /**
     * Get 代理核
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxySpecCore 代理核
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProxySpecCore() {
        return this.ProxySpecCore;
    }

    /**
     * Set 代理核
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxySpecCore 代理核
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxySpecCore(Long ProxySpecCore) {
        this.ProxySpecCore = ProxySpecCore;
    }

    /**
     * Get 代理内存
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxySpecMemory 代理内存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProxySpecMemory() {
        return this.ProxySpecMemory;
    }

    /**
     * Set 代理内存
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxySpecMemory 代理内存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxySpecMemory(Long ProxySpecMemory) {
        this.ProxySpecMemory = ProxySpecMemory;
    }

    /**
     * Get 代理总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxySpecCount 代理总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProxySpecCount() {
        return this.ProxySpecCount;
    }

    /**
     * Set 代理总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxySpecCount 代理总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxySpecCount(Long ProxySpecCount) {
        this.ProxySpecCount = ProxySpecCount;
    }

    public MQTTProductSkuItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MQTTProductSkuItem(MQTTProductSkuItem source) {
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
        if (source.SubscriptionNumLimit != null) {
            this.SubscriptionNumLimit = new Long(source.SubscriptionNumLimit);
        }
        if (source.ProxySpecCore != null) {
            this.ProxySpecCore = new Long(source.ProxySpecCore);
        }
        if (source.ProxySpecMemory != null) {
            this.ProxySpecMemory = new Long(source.ProxySpecMemory);
        }
        if (source.ProxySpecCount != null) {
            this.ProxySpecCount = new Long(source.ProxySpecCount);
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
        this.setParamSimple(map, prefix + "SubscriptionNumLimit", this.SubscriptionNumLimit);
        this.setParamSimple(map, prefix + "ProxySpecCore", this.ProxySpecCore);
        this.setParamSimple(map, prefix + "ProxySpecMemory", this.ProxySpecMemory);
        this.setParamSimple(map, prefix + "ProxySpecCount", this.ProxySpecCount);

    }
}

