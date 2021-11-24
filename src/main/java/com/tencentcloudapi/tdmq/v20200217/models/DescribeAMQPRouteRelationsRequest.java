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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAMQPRouteRelationsRequest extends AbstractModel{

    /**
    * 查询偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询限制数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Vhost名称
    */
    @SerializedName("VHostId")
    @Expose
    private String VHostId;

    /**
    * 按源exchange名称过滤查询结果，支持模糊查询
    */
    @SerializedName("FilterSourceExchange")
    @Expose
    private String FilterSourceExchange;

    /**
    * 按绑定的目标类型过滤查询结果，可选值:Exchange、Queue
    */
    @SerializedName("FilterDestType")
    @Expose
    private String FilterDestType;

    /**
    * 按目标名称过滤查询结果，支持模糊查询
    */
    @SerializedName("FilterDestValue")
    @Expose
    private String FilterDestValue;

    /**
     * Get 查询偏移量 
     * @return Offset 查询偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询偏移量
     * @param Offset 查询偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询限制数 
     * @return Limit 查询限制数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询限制数
     * @param Limit 查询限制数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Vhost名称 
     * @return VHostId Vhost名称
     */
    public String getVHostId() {
        return this.VHostId;
    }

    /**
     * Set Vhost名称
     * @param VHostId Vhost名称
     */
    public void setVHostId(String VHostId) {
        this.VHostId = VHostId;
    }

    /**
     * Get 按源exchange名称过滤查询结果，支持模糊查询 
     * @return FilterSourceExchange 按源exchange名称过滤查询结果，支持模糊查询
     */
    public String getFilterSourceExchange() {
        return this.FilterSourceExchange;
    }

    /**
     * Set 按源exchange名称过滤查询结果，支持模糊查询
     * @param FilterSourceExchange 按源exchange名称过滤查询结果，支持模糊查询
     */
    public void setFilterSourceExchange(String FilterSourceExchange) {
        this.FilterSourceExchange = FilterSourceExchange;
    }

    /**
     * Get 按绑定的目标类型过滤查询结果，可选值:Exchange、Queue 
     * @return FilterDestType 按绑定的目标类型过滤查询结果，可选值:Exchange、Queue
     */
    public String getFilterDestType() {
        return this.FilterDestType;
    }

    /**
     * Set 按绑定的目标类型过滤查询结果，可选值:Exchange、Queue
     * @param FilterDestType 按绑定的目标类型过滤查询结果，可选值:Exchange、Queue
     */
    public void setFilterDestType(String FilterDestType) {
        this.FilterDestType = FilterDestType;
    }

    /**
     * Get 按目标名称过滤查询结果，支持模糊查询 
     * @return FilterDestValue 按目标名称过滤查询结果，支持模糊查询
     */
    public String getFilterDestValue() {
        return this.FilterDestValue;
    }

    /**
     * Set 按目标名称过滤查询结果，支持模糊查询
     * @param FilterDestValue 按目标名称过滤查询结果，支持模糊查询
     */
    public void setFilterDestValue(String FilterDestValue) {
        this.FilterDestValue = FilterDestValue;
    }

    public DescribeAMQPRouteRelationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAMQPRouteRelationsRequest(DescribeAMQPRouteRelationsRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.VHostId != null) {
            this.VHostId = new String(source.VHostId);
        }
        if (source.FilterSourceExchange != null) {
            this.FilterSourceExchange = new String(source.FilterSourceExchange);
        }
        if (source.FilterDestType != null) {
            this.FilterDestType = new String(source.FilterDestType);
        }
        if (source.FilterDestValue != null) {
            this.FilterDestValue = new String(source.FilterDestValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "VHostId", this.VHostId);
        this.setParamSimple(map, prefix + "FilterSourceExchange", this.FilterSourceExchange);
        this.setParamSimple(map, prefix + "FilterDestType", this.FilterDestType);
        this.setParamSimple(map, prefix + "FilterDestValue", this.FilterDestValue);

    }
}

