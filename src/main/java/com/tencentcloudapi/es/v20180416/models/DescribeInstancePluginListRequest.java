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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancePluginListRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 分页起始值, 默认值0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页大小，默认值10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序字段<li>1：插件名 pluginName</li>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序方式<li>0：升序 asc</li><li>1：降序 desc</li>
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * 0：系统插件
    */
    @SerializedName("PluginType")
    @Expose
    private Long PluginType;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 分页起始值, 默认值0 
     * @return Offset 分页起始值, 默认值0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页起始值, 默认值0
     * @param Offset 分页起始值, 默认值0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页大小，默认值10 
     * @return Limit 分页大小，默认值10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页大小，默认值10
     * @param Limit 分页大小，默认值10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序字段<li>1：插件名 pluginName</li> 
     * @return OrderBy 排序字段<li>1：插件名 pluginName</li>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段<li>1：插件名 pluginName</li>
     * @param OrderBy 排序字段<li>1：插件名 pluginName</li>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序方式<li>0：升序 asc</li><li>1：降序 desc</li> 
     * @return OrderByType 排序方式<li>0：升序 asc</li><li>1：降序 desc</li>
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 排序方式<li>0：升序 asc</li><li>1：降序 desc</li>
     * @param OrderByType 排序方式<li>0：升序 asc</li><li>1：降序 desc</li>
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get 0：系统插件 
     * @return PluginType 0：系统插件
     */
    public Long getPluginType() {
        return this.PluginType;
    }

    /**
     * Set 0：系统插件
     * @param PluginType 0：系统插件
     */
    public void setPluginType(Long PluginType) {
        this.PluginType = PluginType;
    }

    public DescribeInstancePluginListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancePluginListRequest(DescribeInstancePluginListRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
        if (source.PluginType != null) {
            this.PluginType = new Long(source.PluginType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamSimple(map, prefix + "PluginType", this.PluginType);

    }
}

