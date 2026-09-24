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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAndroidInstancesRequest extends AbstractModel {

    /**
    * <p>偏移量，默认为 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>限制量，默认为20，最大值为100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>实例ID。每次请求的实例的上限为100。</p>
    */
    @SerializedName("AndroidInstanceIds")
    @Expose
    private String [] AndroidInstanceIds;

    /**
    * <p>实例地域。目前还不支持按地域进行聚合查询</p>
    */
    @SerializedName("AndroidInstanceRegion")
    @Expose
    private String AndroidInstanceRegion;

    /**
    * <p>实例可用区</p>
    */
    @SerializedName("AndroidInstanceZone")
    @Expose
    private String AndroidInstanceZone;

    /**
    * <p>实例分组 ID 列表</p>
    */
    @SerializedName("AndroidInstanceGroupIds")
    @Expose
    private String [] AndroidInstanceGroupIds;

    /**
    * <p>实例标签选择器</p>
    */
    @SerializedName("LabelSelector")
    @Expose
    private LabelRequirement [] LabelSelector;

    /**
    * <p>字段过滤器。Filter 的 Name 有以下值：<br>Name：实例名称<br>UserId：实例用户ID<br>HostSerialNumber：宿主机序列号<br>HostServerSerialNumber：机箱序列号<br>AndroidInstanceModel：实例型号</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get <p>偏移量，默认为 0</p> 
     * @return Offset <p>偏移量，默认为 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认为 0</p>
     * @param Offset <p>偏移量，默认为 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>限制量，默认为20，最大值为100</p> 
     * @return Limit <p>限制量，默认为20，最大值为100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>限制量，默认为20，最大值为100</p>
     * @param Limit <p>限制量，默认为20，最大值为100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>实例ID。每次请求的实例的上限为100。</p> 
     * @return AndroidInstanceIds <p>实例ID。每次请求的实例的上限为100。</p>
     */
    public String [] getAndroidInstanceIds() {
        return this.AndroidInstanceIds;
    }

    /**
     * Set <p>实例ID。每次请求的实例的上限为100。</p>
     * @param AndroidInstanceIds <p>实例ID。每次请求的实例的上限为100。</p>
     */
    public void setAndroidInstanceIds(String [] AndroidInstanceIds) {
        this.AndroidInstanceIds = AndroidInstanceIds;
    }

    /**
     * Get <p>实例地域。目前还不支持按地域进行聚合查询</p> 
     * @return AndroidInstanceRegion <p>实例地域。目前还不支持按地域进行聚合查询</p>
     */
    public String getAndroidInstanceRegion() {
        return this.AndroidInstanceRegion;
    }

    /**
     * Set <p>实例地域。目前还不支持按地域进行聚合查询</p>
     * @param AndroidInstanceRegion <p>实例地域。目前还不支持按地域进行聚合查询</p>
     */
    public void setAndroidInstanceRegion(String AndroidInstanceRegion) {
        this.AndroidInstanceRegion = AndroidInstanceRegion;
    }

    /**
     * Get <p>实例可用区</p> 
     * @return AndroidInstanceZone <p>实例可用区</p>
     */
    public String getAndroidInstanceZone() {
        return this.AndroidInstanceZone;
    }

    /**
     * Set <p>实例可用区</p>
     * @param AndroidInstanceZone <p>实例可用区</p>
     */
    public void setAndroidInstanceZone(String AndroidInstanceZone) {
        this.AndroidInstanceZone = AndroidInstanceZone;
    }

    /**
     * Get <p>实例分组 ID 列表</p> 
     * @return AndroidInstanceGroupIds <p>实例分组 ID 列表</p>
     */
    public String [] getAndroidInstanceGroupIds() {
        return this.AndroidInstanceGroupIds;
    }

    /**
     * Set <p>实例分组 ID 列表</p>
     * @param AndroidInstanceGroupIds <p>实例分组 ID 列表</p>
     */
    public void setAndroidInstanceGroupIds(String [] AndroidInstanceGroupIds) {
        this.AndroidInstanceGroupIds = AndroidInstanceGroupIds;
    }

    /**
     * Get <p>实例标签选择器</p> 
     * @return LabelSelector <p>实例标签选择器</p>
     */
    public LabelRequirement [] getLabelSelector() {
        return this.LabelSelector;
    }

    /**
     * Set <p>实例标签选择器</p>
     * @param LabelSelector <p>实例标签选择器</p>
     */
    public void setLabelSelector(LabelRequirement [] LabelSelector) {
        this.LabelSelector = LabelSelector;
    }

    /**
     * Get <p>字段过滤器。Filter 的 Name 有以下值：<br>Name：实例名称<br>UserId：实例用户ID<br>HostSerialNumber：宿主机序列号<br>HostServerSerialNumber：机箱序列号<br>AndroidInstanceModel：实例型号</p> 
     * @return Filters <p>字段过滤器。Filter 的 Name 有以下值：<br>Name：实例名称<br>UserId：实例用户ID<br>HostSerialNumber：宿主机序列号<br>HostServerSerialNumber：机箱序列号<br>AndroidInstanceModel：实例型号</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>字段过滤器。Filter 的 Name 有以下值：<br>Name：实例名称<br>UserId：实例用户ID<br>HostSerialNumber：宿主机序列号<br>HostServerSerialNumber：机箱序列号<br>AndroidInstanceModel：实例型号</p>
     * @param Filters <p>字段过滤器。Filter 的 Name 有以下值：<br>Name：实例名称<br>UserId：实例用户ID<br>HostSerialNumber：宿主机序列号<br>HostServerSerialNumber：机箱序列号<br>AndroidInstanceModel：实例型号</p>
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

