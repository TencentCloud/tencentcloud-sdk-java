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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAndroidInstancesRequest extends AbstractModel {

    /**
    * 偏移量，默认为 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制量，默认为20，最大值为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 实例ID。每次请求的实例的上限为100。
    */
    @SerializedName("AndroidInstanceIds")
    @Expose
    private String [] AndroidInstanceIds;

    /**
    * 实例地域。目前还不支持按地域进行聚合查询
    */
    @SerializedName("AndroidInstanceRegion")
    @Expose
    private String AndroidInstanceRegion;

    /**
    * 实例可用区
    */
    @SerializedName("AndroidInstanceZone")
    @Expose
    private String AndroidInstanceZone;

    /**
    * 实例分组 ID 列表
    */
    @SerializedName("AndroidInstanceGroupIds")
    @Expose
    private String [] AndroidInstanceGroupIds;

    /**
    * 实例标签选择器
    */
    @SerializedName("LabelSelector")
    @Expose
    private LabelRequirement [] LabelSelector;

    /**
    * 字段过滤器。Filter 的 Name 有以下值：
Name：实例名称
UserId：实例用户ID
HostSerialNumber：宿主机序列号
HostServerSerialNumber：机箱序列号
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 偏移量，默认为 0 
     * @return Offset 偏移量，默认为 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为 0
     * @param Offset 偏移量，默认为 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制量，默认为20，最大值为100 
     * @return Limit 限制量，默认为20，最大值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制量，默认为20，最大值为100
     * @param Limit 限制量，默认为20，最大值为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 实例ID。每次请求的实例的上限为100。 
     * @return AndroidInstanceIds 实例ID。每次请求的实例的上限为100。
     */
    public String [] getAndroidInstanceIds() {
        return this.AndroidInstanceIds;
    }

    /**
     * Set 实例ID。每次请求的实例的上限为100。
     * @param AndroidInstanceIds 实例ID。每次请求的实例的上限为100。
     */
    public void setAndroidInstanceIds(String [] AndroidInstanceIds) {
        this.AndroidInstanceIds = AndroidInstanceIds;
    }

    /**
     * Get 实例地域。目前还不支持按地域进行聚合查询 
     * @return AndroidInstanceRegion 实例地域。目前还不支持按地域进行聚合查询
     */
    public String getAndroidInstanceRegion() {
        return this.AndroidInstanceRegion;
    }

    /**
     * Set 实例地域。目前还不支持按地域进行聚合查询
     * @param AndroidInstanceRegion 实例地域。目前还不支持按地域进行聚合查询
     */
    public void setAndroidInstanceRegion(String AndroidInstanceRegion) {
        this.AndroidInstanceRegion = AndroidInstanceRegion;
    }

    /**
     * Get 实例可用区 
     * @return AndroidInstanceZone 实例可用区
     */
    public String getAndroidInstanceZone() {
        return this.AndroidInstanceZone;
    }

    /**
     * Set 实例可用区
     * @param AndroidInstanceZone 实例可用区
     */
    public void setAndroidInstanceZone(String AndroidInstanceZone) {
        this.AndroidInstanceZone = AndroidInstanceZone;
    }

    /**
     * Get 实例分组 ID 列表 
     * @return AndroidInstanceGroupIds 实例分组 ID 列表
     */
    public String [] getAndroidInstanceGroupIds() {
        return this.AndroidInstanceGroupIds;
    }

    /**
     * Set 实例分组 ID 列表
     * @param AndroidInstanceGroupIds 实例分组 ID 列表
     */
    public void setAndroidInstanceGroupIds(String [] AndroidInstanceGroupIds) {
        this.AndroidInstanceGroupIds = AndroidInstanceGroupIds;
    }

    /**
     * Get 实例标签选择器 
     * @return LabelSelector 实例标签选择器
     */
    public LabelRequirement [] getLabelSelector() {
        return this.LabelSelector;
    }

    /**
     * Set 实例标签选择器
     * @param LabelSelector 实例标签选择器
     */
    public void setLabelSelector(LabelRequirement [] LabelSelector) {
        this.LabelSelector = LabelSelector;
    }

    /**
     * Get 字段过滤器。Filter 的 Name 有以下值：
Name：实例名称
UserId：实例用户ID
HostSerialNumber：宿主机序列号
HostServerSerialNumber：机箱序列号 
     * @return Filters 字段过滤器。Filter 的 Name 有以下值：
Name：实例名称
UserId：实例用户ID
HostSerialNumber：宿主机序列号
HostServerSerialNumber：机箱序列号
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 字段过滤器。Filter 的 Name 有以下值：
Name：实例名称
UserId：实例用户ID
HostSerialNumber：宿主机序列号
HostServerSerialNumber：机箱序列号
     * @param Filters 字段过滤器。Filter 的 Name 有以下值：
Name：实例名称
UserId：实例用户ID
HostSerialNumber：宿主机序列号
HostServerSerialNumber：机箱序列号
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeAndroidInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAndroidInstancesRequest(DescribeAndroidInstancesRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.AndroidInstanceIds != null) {
            this.AndroidInstanceIds = new String[source.AndroidInstanceIds.length];
            for (int i = 0; i < source.AndroidInstanceIds.length; i++) {
                this.AndroidInstanceIds[i] = new String(source.AndroidInstanceIds[i]);
            }
        }
        if (source.AndroidInstanceRegion != null) {
            this.AndroidInstanceRegion = new String(source.AndroidInstanceRegion);
        }
        if (source.AndroidInstanceZone != null) {
            this.AndroidInstanceZone = new String(source.AndroidInstanceZone);
        }
        if (source.AndroidInstanceGroupIds != null) {
            this.AndroidInstanceGroupIds = new String[source.AndroidInstanceGroupIds.length];
            for (int i = 0; i < source.AndroidInstanceGroupIds.length; i++) {
                this.AndroidInstanceGroupIds[i] = new String(source.AndroidInstanceGroupIds[i]);
            }
        }
        if (source.LabelSelector != null) {
            this.LabelSelector = new LabelRequirement[source.LabelSelector.length];
            for (int i = 0; i < source.LabelSelector.length; i++) {
                this.LabelSelector[i] = new LabelRequirement(source.LabelSelector[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "AndroidInstanceIds.", this.AndroidInstanceIds);
        this.setParamSimple(map, prefix + "AndroidInstanceRegion", this.AndroidInstanceRegion);
        this.setParamSimple(map, prefix + "AndroidInstanceZone", this.AndroidInstanceZone);
        this.setParamArraySimple(map, prefix + "AndroidInstanceGroupIds.", this.AndroidInstanceGroupIds);
        this.setParamArrayObj(map, prefix + "LabelSelector.", this.LabelSelector);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

