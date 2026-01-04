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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GeneralSKU extends AbstractModel {

    /**
    * 规格标识
    */
    @SerializedName("SkuCode")
    @Expose
    private String SkuCode;

    /**
    * 是否可售卖
    */
    @SerializedName("OnSale")
    @Expose
    private Boolean OnSale;

    /**
    * TPS上限
    */
    @SerializedName("TpsLimit")
    @Expose
    private Long TpsLimit;

    /**
    * 主题数免费额度
    */
    @SerializedName("TopicNumLimit")
    @Expose
    private Long TopicNumLimit;

    /**
    * 主题数上限
    */
    @SerializedName("TopicNumUpperLimit")
    @Expose
    private Long TopicNumUpperLimit;

    /**
    * 计费项信息
    */
    @SerializedName("PriceTags")
    @Expose
    private PriceTag [] PriceTags;

    /**
    * 存储节点个数
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
     * Get 规格标识 
     * @return SkuCode 规格标识
     */
    public String getSkuCode() {
        return this.SkuCode;
    }

    /**
     * Set 规格标识
     * @param SkuCode 规格标识
     */
    public void setSkuCode(String SkuCode) {
        this.SkuCode = SkuCode;
    }

    /**
     * Get 是否可售卖 
     * @return OnSale 是否可售卖
     */
    public Boolean getOnSale() {
        return this.OnSale;
    }

    /**
     * Set 是否可售卖
     * @param OnSale 是否可售卖
     */
    public void setOnSale(Boolean OnSale) {
        this.OnSale = OnSale;
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
     * Get 主题数免费额度 
     * @return TopicNumLimit 主题数免费额度
     */
    public Long getTopicNumLimit() {
        return this.TopicNumLimit;
    }

    /**
     * Set 主题数免费额度
     * @param TopicNumLimit 主题数免费额度
     */
    public void setTopicNumLimit(Long TopicNumLimit) {
        this.TopicNumLimit = TopicNumLimit;
    }

    /**
     * Get 主题数上限 
     * @return TopicNumUpperLimit 主题数上限
     */
    public Long getTopicNumUpperLimit() {
        return this.TopicNumUpperLimit;
    }

    /**
     * Set 主题数上限
     * @param TopicNumUpperLimit 主题数上限
     */
    public void setTopicNumUpperLimit(Long TopicNumUpperLimit) {
        this.TopicNumUpperLimit = TopicNumUpperLimit;
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
     * Get 存储节点个数 
     * @return NodeCount 存储节点个数
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set 存储节点个数
     * @param NodeCount 存储节点个数
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    public GeneralSKU() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GeneralSKU(GeneralSKU source) {
        if (source.SkuCode != null) {
            this.SkuCode = new String(source.SkuCode);
        }
        if (source.OnSale != null) {
            this.OnSale = new Boolean(source.OnSale);
        }
        if (source.TpsLimit != null) {
            this.TpsLimit = new Long(source.TpsLimit);
        }
        if (source.TopicNumLimit != null) {
            this.TopicNumLimit = new Long(source.TopicNumLimit);
        }
        if (source.TopicNumUpperLimit != null) {
            this.TopicNumUpperLimit = new Long(source.TopicNumUpperLimit);
        }
        if (source.PriceTags != null) {
            this.PriceTags = new PriceTag[source.PriceTags.length];
            for (int i = 0; i < source.PriceTags.length; i++) {
                this.PriceTags[i] = new PriceTag(source.PriceTags[i]);
            }
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SkuCode", this.SkuCode);
        this.setParamSimple(map, prefix + "OnSale", this.OnSale);
        this.setParamSimple(map, prefix + "TpsLimit", this.TpsLimit);
        this.setParamSimple(map, prefix + "TopicNumLimit", this.TopicNumLimit);
        this.setParamSimple(map, prefix + "TopicNumUpperLimit", this.TopicNumUpperLimit);
        this.setParamArrayObj(map, prefix + "PriceTags.", this.PriceTags);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);

    }
}

