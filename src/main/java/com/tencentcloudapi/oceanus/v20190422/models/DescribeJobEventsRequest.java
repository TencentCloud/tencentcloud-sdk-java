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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeJobEventsRequest extends AbstractModel {

    /**
    * <p>作业的 ID</p>
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>筛选条件：起始 Unix 时间戳（秒）</p>
    */
    @SerializedName("StartTimestamp")
    @Expose
    private Long StartTimestamp;

    /**
    * <p>筛选条件：结束 Unix 时间戳（秒）</p>
    */
    @SerializedName("EndTimestamp")
    @Expose
    private Long EndTimestamp;

    /**
    * <p>事件类型。如果不传则返回所有类型的数据</p>
    */
    @SerializedName("Types")
    @Expose
    private String [] Types;

    /**
    * <p>运行实例 ID 数组</p>
    */
    @SerializedName("RunningOrderIds")
    @Expose
    private Long [] RunningOrderIds;

    /**
    * <p>工作空间 SerialId</p>
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
    * <p>返回条数</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>起始偏移个数</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>作业的 ID</p> 
     * @return JobId <p>作业的 ID</p>
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>作业的 ID</p>
     * @param JobId <p>作业的 ID</p>
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>筛选条件：起始 Unix 时间戳（秒）</p> 
     * @return StartTimestamp <p>筛选条件：起始 Unix 时间戳（秒）</p>
     */
    public Long getStartTimestamp() {
        return this.StartTimestamp;
    }

    /**
     * Set <p>筛选条件：起始 Unix 时间戳（秒）</p>
     * @param StartTimestamp <p>筛选条件：起始 Unix 时间戳（秒）</p>
     */
    public void setStartTimestamp(Long StartTimestamp) {
        this.StartTimestamp = StartTimestamp;
    }

    /**
     * Get <p>筛选条件：结束 Unix 时间戳（秒）</p> 
     * @return EndTimestamp <p>筛选条件：结束 Unix 时间戳（秒）</p>
     */
    public Long getEndTimestamp() {
        return this.EndTimestamp;
    }

    /**
     * Set <p>筛选条件：结束 Unix 时间戳（秒）</p>
     * @param EndTimestamp <p>筛选条件：结束 Unix 时间戳（秒）</p>
     */
    public void setEndTimestamp(Long EndTimestamp) {
        this.EndTimestamp = EndTimestamp;
    }

    /**
     * Get <p>事件类型。如果不传则返回所有类型的数据</p> 
     * @return Types <p>事件类型。如果不传则返回所有类型的数据</p>
     */
    public String [] getTypes() {
        return this.Types;
    }

    /**
     * Set <p>事件类型。如果不传则返回所有类型的数据</p>
     * @param Types <p>事件类型。如果不传则返回所有类型的数据</p>
     */
    public void setTypes(String [] Types) {
        this.Types = Types;
    }

    /**
     * Get <p>运行实例 ID 数组</p> 
     * @return RunningOrderIds <p>运行实例 ID 数组</p>
     */
    public Long [] getRunningOrderIds() {
        return this.RunningOrderIds;
    }

    /**
     * Set <p>运行实例 ID 数组</p>
     * @param RunningOrderIds <p>运行实例 ID 数组</p>
     */
    public void setRunningOrderIds(Long [] RunningOrderIds) {
        this.RunningOrderIds = RunningOrderIds;
    }

    /**
     * Get <p>工作空间 SerialId</p> 
     * @return WorkSpaceId <p>工作空间 SerialId</p>
     */
    public String getWorkSpaceId() {
        return this.WorkSpaceId;
    }

    /**
     * Set <p>工作空间 SerialId</p>
     * @param WorkSpaceId <p>工作空间 SerialId</p>
     */
    public void setWorkSpaceId(String WorkSpaceId) {
        this.WorkSpaceId = WorkSpaceId;
    }

    /**
     * Get <p>返回条数</p> 
     * @return Limit <p>返回条数</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回条数</p>
     * @param Limit <p>返回条数</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>起始偏移个数</p> 
     * @return Offset <p>起始偏移个数</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>起始偏移个数</p>
     * @param Offset <p>起始偏移个数</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeJobEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeJobEventsRequest(DescribeJobEventsRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.StartTimestamp != null) {
            this.StartTimestamp = new Long(source.StartTimestamp);
        }
        if (source.EndTimestamp != null) {
            this.EndTimestamp = new Long(source.EndTimestamp);
        }
        if (source.Types != null) {
            this.Types = new String[source.Types.length];
            for (int i = 0; i < source.Types.length; i++) {
                this.Types[i] = new String(source.Types[i]);
            }
        }
        if (source.RunningOrderIds != null) {
            this.RunningOrderIds = new Long[source.RunningOrderIds.length];
            for (int i = 0; i < source.RunningOrderIds.length; i++) {
                this.RunningOrderIds[i] = new Long(source.RunningOrderIds[i]);
            }
        }
        if (source.WorkSpaceId != null) {
            this.WorkSpaceId = new String(source.WorkSpaceId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "StartTimestamp", this.StartTimestamp);
        this.setParamSimple(map, prefix + "EndTimestamp", this.EndTimestamp);
        this.setParamArraySimple(map, prefix + "Types.", this.Types);
        this.setParamArraySimple(map, prefix + "RunningOrderIds.", this.RunningOrderIds);
        this.setParamSimple(map, prefix + "WorkSpaceId", this.WorkSpaceId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

