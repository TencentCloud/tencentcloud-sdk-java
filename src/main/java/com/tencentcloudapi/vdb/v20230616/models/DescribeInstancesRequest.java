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
package com.tencentcloudapi.vdb.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesRequest extends AbstractModel {

    /**
    * 实例ID数组。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 实例名称，支持模糊搜索。
    */
    @SerializedName("InstanceNames")
    @Expose
    private String [] InstanceNames;

    /**
    * 实例模糊搜索字段。
    */
    @SerializedName("InstanceKeys")
    @Expose
    private String [] InstanceKeys;

    /**
    * 根据状态获取实例， 为空则获取全部非隔离和非下线的实例。
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
    * 按照引擎筛选实例。
    */
    @SerializedName("EngineNames")
    @Expose
    private String [] EngineNames;

    /**
    * 按照版本筛选实例。
    */
    @SerializedName("EngineVersions")
    @Expose
    private String [] EngineVersions;

    /**
    * 按照api版本筛选实例
    */
    @SerializedName("ApiVersions")
    @Expose
    private String [] ApiVersions;

    /**
    * 按照创建时间筛选实例。
    */
    @SerializedName("CreateAt")
    @Expose
    private String CreateAt;

    /**
    * 按照可用区筛选实例。
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * 排序字段。
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序方式。
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
    * 查询开始位置。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 列表查询数量。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 按照标签筛选实例
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
     * Get 实例ID数组。 
     * @return InstanceIds 实例ID数组。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例ID数组。
     * @param InstanceIds 实例ID数组。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 实例名称，支持模糊搜索。 
     * @return InstanceNames 实例名称，支持模糊搜索。
     */
    public String [] getInstanceNames() {
        return this.InstanceNames;
    }

    /**
     * Set 实例名称，支持模糊搜索。
     * @param InstanceNames 实例名称，支持模糊搜索。
     */
    public void setInstanceNames(String [] InstanceNames) {
        this.InstanceNames = InstanceNames;
    }

    /**
     * Get 实例模糊搜索字段。 
     * @return InstanceKeys 实例模糊搜索字段。
     */
    public String [] getInstanceKeys() {
        return this.InstanceKeys;
    }

    /**
     * Set 实例模糊搜索字段。
     * @param InstanceKeys 实例模糊搜索字段。
     */
    public void setInstanceKeys(String [] InstanceKeys) {
        this.InstanceKeys = InstanceKeys;
    }

    /**
     * Get 根据状态获取实例， 为空则获取全部非隔离和非下线的实例。 
     * @return Status 根据状态获取实例， 为空则获取全部非隔离和非下线的实例。
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set 根据状态获取实例， 为空则获取全部非隔离和非下线的实例。
     * @param Status 根据状态获取实例， 为空则获取全部非隔离和非下线的实例。
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    /**
     * Get 按照引擎筛选实例。 
     * @return EngineNames 按照引擎筛选实例。
     * @deprecated
     */
    @Deprecated
    public String [] getEngineNames() {
        return this.EngineNames;
    }

    /**
     * Set 按照引擎筛选实例。
     * @param EngineNames 按照引擎筛选实例。
     * @deprecated
     */
    @Deprecated
    public void setEngineNames(String [] EngineNames) {
        this.EngineNames = EngineNames;
    }

    /**
     * Get 按照版本筛选实例。 
     * @return EngineVersions 按照版本筛选实例。
     */
    public String [] getEngineVersions() {
        return this.EngineVersions;
    }

    /**
     * Set 按照版本筛选实例。
     * @param EngineVersions 按照版本筛选实例。
     */
    public void setEngineVersions(String [] EngineVersions) {
        this.EngineVersions = EngineVersions;
    }

    /**
     * Get 按照api版本筛选实例 
     * @return ApiVersions 按照api版本筛选实例
     */
    public String [] getApiVersions() {
        return this.ApiVersions;
    }

    /**
     * Set 按照api版本筛选实例
     * @param ApiVersions 按照api版本筛选实例
     */
    public void setApiVersions(String [] ApiVersions) {
        this.ApiVersions = ApiVersions;
    }

    /**
     * Get 按照创建时间筛选实例。 
     * @return CreateAt 按照创建时间筛选实例。
     */
    public String getCreateAt() {
        return this.CreateAt;
    }

    /**
     * Set 按照创建时间筛选实例。
     * @param CreateAt 按照创建时间筛选实例。
     */
    public void setCreateAt(String CreateAt) {
        this.CreateAt = CreateAt;
    }

    /**
     * Get 按照可用区筛选实例。 
     * @return Zones 按照可用区筛选实例。
     * @deprecated
     */
    @Deprecated
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set 按照可用区筛选实例。
     * @param Zones 按照可用区筛选实例。
     * @deprecated
     */
    @Deprecated
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get 排序字段。 
     * @return OrderBy 排序字段。
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段。
     * @param OrderBy 排序字段。
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序方式。 
     * @return OrderDirection 排序方式。
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set 排序方式。
     * @param OrderDirection 排序方式。
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * Get 查询开始位置。 
     * @return Offset 查询开始位置。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询开始位置。
     * @param Offset 查询开始位置。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 列表查询数量。 
     * @return Limit 列表查询数量。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 列表查询数量。
     * @param Limit 列表查询数量。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 按照标签筛选实例 
     * @return ResourceTags 按照标签筛选实例
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set 按照标签筛选实例
     * @param ResourceTags 按照标签筛选实例
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    public DescribeInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesRequest(DescribeInstancesRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.InstanceNames != null) {
            this.InstanceNames = new String[source.InstanceNames.length];
            for (int i = 0; i < source.InstanceNames.length; i++) {
                this.InstanceNames[i] = new String(source.InstanceNames[i]);
            }
        }
        if (source.InstanceKeys != null) {
            this.InstanceKeys = new String[source.InstanceKeys.length];
            for (int i = 0; i < source.InstanceKeys.length; i++) {
                this.InstanceKeys[i] = new String(source.InstanceKeys[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new String(source.Status[i]);
            }
        }
        if (source.EngineNames != null) {
            this.EngineNames = new String[source.EngineNames.length];
            for (int i = 0; i < source.EngineNames.length; i++) {
                this.EngineNames[i] = new String(source.EngineNames[i]);
            }
        }
        if (source.EngineVersions != null) {
            this.EngineVersions = new String[source.EngineVersions.length];
            for (int i = 0; i < source.EngineVersions.length; i++) {
                this.EngineVersions[i] = new String(source.EngineVersions[i]);
            }
        }
        if (source.ApiVersions != null) {
            this.ApiVersions = new String[source.ApiVersions.length];
            for (int i = 0; i < source.ApiVersions.length; i++) {
                this.ApiVersions[i] = new String(source.ApiVersions[i]);
            }
        }
        if (source.CreateAt != null) {
            this.CreateAt = new String(source.CreateAt);
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderDirection != null) {
            this.OrderDirection = new String(source.OrderDirection);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new Tag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new Tag(source.ResourceTags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "InstanceNames.", this.InstanceNames);
        this.setParamArraySimple(map, prefix + "InstanceKeys.", this.InstanceKeys);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamArraySimple(map, prefix + "EngineNames.", this.EngineNames);
        this.setParamArraySimple(map, prefix + "EngineVersions.", this.EngineVersions);
        this.setParamArraySimple(map, prefix + "ApiVersions.", this.ApiVersions);
        this.setParamSimple(map, prefix + "CreateAt", this.CreateAt);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);

    }
}

