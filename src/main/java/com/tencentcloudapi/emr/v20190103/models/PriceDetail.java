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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PriceDetail extends AbstractModel{

    /**
    * 节点ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 价格计算公式
    */
    @SerializedName("Formula")
    @Expose
    private String Formula;

    /**
    * 原价
    */
    @SerializedName("OriginalCost")
    @Expose
    private Float OriginalCost;

    /**
    * 折扣价
    */
    @SerializedName("DiscountCost")
    @Expose
    private Float DiscountCost;

    /**
     * Get 节点ID 
     * @return ResourceId 节点ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 节点ID
     * @param ResourceId 节点ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 价格计算公式 
     * @return Formula 价格计算公式
     */
    public String getFormula() {
        return this.Formula;
    }

    /**
     * Set 价格计算公式
     * @param Formula 价格计算公式
     */
    public void setFormula(String Formula) {
        this.Formula = Formula;
    }

    /**
     * Get 原价 
     * @return OriginalCost 原价
     */
    public Float getOriginalCost() {
        return this.OriginalCost;
    }

    /**
     * Set 原价
     * @param OriginalCost 原价
     */
    public void setOriginalCost(Float OriginalCost) {
        this.OriginalCost = OriginalCost;
    }

    /**
     * Get 折扣价 
     * @return DiscountCost 折扣价
     */
    public Float getDiscountCost() {
        return this.DiscountCost;
    }

    /**
     * Set 折扣价
     * @param DiscountCost 折扣价
     */
    public void setDiscountCost(Float DiscountCost) {
        this.DiscountCost = DiscountCost;
    }

    public PriceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PriceDetail(PriceDetail source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Formula != null) {
            this.Formula = new String(source.Formula);
        }
        if (source.OriginalCost != null) {
            this.OriginalCost = new Float(source.OriginalCost);
        }
        if (source.DiscountCost != null) {
            this.DiscountCost = new Float(source.DiscountCost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Formula", this.Formula);
        this.setParamSimple(map, prefix + "OriginalCost", this.OriginalCost);
        this.setParamSimple(map, prefix + "DiscountCost", this.DiscountCost);

    }
}

