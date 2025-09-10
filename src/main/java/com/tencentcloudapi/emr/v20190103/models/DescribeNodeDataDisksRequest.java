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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNodeDataDisksRequest extends AbstractModel {

    /**
    * EMR集群实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 节点CVM实例Id列表
    */
    @SerializedName("CvmInstanceIds")
    @Expose
    private String [] CvmInstanceIds;

    /**
    * 查询云盘的过滤条件
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * 模糊搜索
    */
    @SerializedName("InnerSearch")
    @Expose
    private String InnerSearch;

    /**
    * 每页返回数量，默认值为100，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 数据偏移值
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 场景值：
ModifyDiskExtraPerformance ：调整数据盘额外性能
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
     * Get EMR集群实例ID 
     * @return InstanceId EMR集群实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set EMR集群实例ID
     * @param InstanceId EMR集群实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 节点CVM实例Id列表 
     * @return CvmInstanceIds 节点CVM实例Id列表
     */
    public String [] getCvmInstanceIds() {
        return this.CvmInstanceIds;
    }

    /**
     * Set 节点CVM实例Id列表
     * @param CvmInstanceIds 节点CVM实例Id列表
     */
    public void setCvmInstanceIds(String [] CvmInstanceIds) {
        this.CvmInstanceIds = CvmInstanceIds;
    }

    /**
     * Get 查询云盘的过滤条件 
     * @return Filters 查询云盘的过滤条件
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 查询云盘的过滤条件
     * @param Filters 查询云盘的过滤条件
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 模糊搜索 
     * @return InnerSearch 模糊搜索
     */
    public String getInnerSearch() {
        return this.InnerSearch;
    }

    /**
     * Set 模糊搜索
     * @param InnerSearch 模糊搜索
     */
    public void setInnerSearch(String InnerSearch) {
        this.InnerSearch = InnerSearch;
    }

    /**
     * Get 每页返回数量，默认值为100，最大值为100。 
     * @return Limit 每页返回数量，默认值为100，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页返回数量，默认值为100，最大值为100。
     * @param Limit 每页返回数量，默认值为100，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 数据偏移值 
     * @return Offset 数据偏移值
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 数据偏移值
     * @param Offset 数据偏移值
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 场景值：
ModifyDiskExtraPerformance ：调整数据盘额外性能 
     * @return Scene 场景值：
ModifyDiskExtraPerformance ：调整数据盘额外性能
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set 场景值：
ModifyDiskExtraPerformance ：调整数据盘额外性能
     * @param Scene 场景值：
ModifyDiskExtraPerformance ：调整数据盘额外性能
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    public DescribeNodeDataDisksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNodeDataDisksRequest(DescribeNodeDataDisksRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CvmInstanceIds != null) {
            this.CvmInstanceIds = new String[source.CvmInstanceIds.length];
            for (int i = 0; i < source.CvmInstanceIds.length; i++) {
                this.CvmInstanceIds[i] = new String(source.CvmInstanceIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.InnerSearch != null) {
            this.InnerSearch = new String(source.InnerSearch);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Scene != null) {
            this.Scene = new String(source.Scene);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "CvmInstanceIds.", this.CvmInstanceIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "InnerSearch", this.InnerSearch);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Scene", this.Scene);

    }
}

