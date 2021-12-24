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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEdgeUnitsCloudRequest extends AbstractModel{

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * limit值
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 集群名称模糊匹配
    */
    @SerializedName("NamePattern")
    @Expose
    private String NamePattern;

    /**
    * 排序，ASC/DESC(默认)
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get limit值 
     * @return Limit limit值
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set limit值
     * @param Limit limit值
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 集群名称模糊匹配 
     * @return NamePattern 集群名称模糊匹配
     */
    public String getNamePattern() {
        return this.NamePattern;
    }

    /**
     * Set 集群名称模糊匹配
     * @param NamePattern 集群名称模糊匹配
     */
    public void setNamePattern(String NamePattern) {
        this.NamePattern = NamePattern;
    }

    /**
     * Get 排序，ASC/DESC(默认) 
     * @return Order 排序，ASC/DESC(默认)
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序，ASC/DESC(默认)
     * @param Order 排序，ASC/DESC(默认)
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeEdgeUnitsCloudRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEdgeUnitsCloudRequest(DescribeEdgeUnitsCloudRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.NamePattern != null) {
            this.NamePattern = new String(source.NamePattern);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "NamePattern", this.NamePattern);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

