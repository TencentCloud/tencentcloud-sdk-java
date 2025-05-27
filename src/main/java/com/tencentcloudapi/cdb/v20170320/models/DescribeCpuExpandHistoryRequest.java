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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCpuExpandHistoryRequest extends AbstractModel {

    /**
    * 实例 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 扩容策略，值包括：all，manual，auto
    */
    @SerializedName("ExpandStrategy")
    @Expose
    private String ExpandStrategy;

    /**
    * 扩容状态，值包括：all，extend，reduce，extend_failed
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 查询的开始时间。只能查看30天内的扩容历史
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 查询的结束时间。只能查看30天内的扩容历史
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 分页入参
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页入参
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 实例 ID 
     * @return InstanceId 实例 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID
     * @param InstanceId 实例 ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 扩容策略，值包括：all，manual，auto 
     * @return ExpandStrategy 扩容策略，值包括：all，manual，auto
     */
    public String getExpandStrategy() {
        return this.ExpandStrategy;
    }

    /**
     * Set 扩容策略，值包括：all，manual，auto
     * @param ExpandStrategy 扩容策略，值包括：all，manual，auto
     */
    public void setExpandStrategy(String ExpandStrategy) {
        this.ExpandStrategy = ExpandStrategy;
    }

    /**
     * Get 扩容状态，值包括：all，extend，reduce，extend_failed 
     * @return Status 扩容状态，值包括：all，extend，reduce，extend_failed
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 扩容状态，值包括：all，extend，reduce，extend_failed
     * @param Status 扩容状态，值包括：all，extend，reduce，extend_failed
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 查询的开始时间。只能查看30天内的扩容历史 
     * @return StartTime 查询的开始时间。只能查看30天内的扩容历史
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询的开始时间。只能查看30天内的扩容历史
     * @param StartTime 查询的开始时间。只能查看30天内的扩容历史
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询的结束时间。只能查看30天内的扩容历史 
     * @return EndTime 查询的结束时间。只能查看30天内的扩容历史
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询的结束时间。只能查看30天内的扩容历史
     * @param EndTime 查询的结束时间。只能查看30天内的扩容历史
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 分页入参 
     * @return Offset 分页入参
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页入参
     * @param Offset 分页入参
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页入参 
     * @return Limit 分页入参
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页入参
     * @param Limit 分页入参
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeCpuExpandHistoryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCpuExpandHistoryRequest(DescribeCpuExpandHistoryRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ExpandStrategy != null) {
            this.ExpandStrategy = new String(source.ExpandStrategy);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ExpandStrategy", this.ExpandStrategy);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

