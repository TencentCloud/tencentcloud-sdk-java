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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeJobEventsRequest extends AbstractModel {

    /**
    * 作业的 ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 筛选条件：起始 Unix 时间戳（秒）
    */
    @SerializedName("StartTimestamp")
    @Expose
    private Long StartTimestamp;

    /**
    * 筛选条件：结束 Unix 时间戳（秒）
    */
    @SerializedName("EndTimestamp")
    @Expose
    private Long EndTimestamp;

    /**
    * 事件类型。如果不传则返回所有类型的数据
    */
    @SerializedName("Types")
    @Expose
    private String [] Types;

    /**
    * 运行实例 ID 数组
    */
    @SerializedName("RunningOrderIds")
    @Expose
    private Long [] RunningOrderIds;

    /**
    * 工作空间 SerialId
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
     * Get 作业的 ID 
     * @return JobId 作业的 ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 作业的 ID
     * @param JobId 作业的 ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 筛选条件：起始 Unix 时间戳（秒） 
     * @return StartTimestamp 筛选条件：起始 Unix 时间戳（秒）
     */
    public Long getStartTimestamp() {
        return this.StartTimestamp;
    }

    /**
     * Set 筛选条件：起始 Unix 时间戳（秒）
     * @param StartTimestamp 筛选条件：起始 Unix 时间戳（秒）
     */
    public void setStartTimestamp(Long StartTimestamp) {
        this.StartTimestamp = StartTimestamp;
    }

    /**
     * Get 筛选条件：结束 Unix 时间戳（秒） 
     * @return EndTimestamp 筛选条件：结束 Unix 时间戳（秒）
     */
    public Long getEndTimestamp() {
        return this.EndTimestamp;
    }

    /**
     * Set 筛选条件：结束 Unix 时间戳（秒）
     * @param EndTimestamp 筛选条件：结束 Unix 时间戳（秒）
     */
    public void setEndTimestamp(Long EndTimestamp) {
        this.EndTimestamp = EndTimestamp;
    }

    /**
     * Get 事件类型。如果不传则返回所有类型的数据 
     * @return Types 事件类型。如果不传则返回所有类型的数据
     */
    public String [] getTypes() {
        return this.Types;
    }

    /**
     * Set 事件类型。如果不传则返回所有类型的数据
     * @param Types 事件类型。如果不传则返回所有类型的数据
     */
    public void setTypes(String [] Types) {
        this.Types = Types;
    }

    /**
     * Get 运行实例 ID 数组 
     * @return RunningOrderIds 运行实例 ID 数组
     */
    public Long [] getRunningOrderIds() {
        return this.RunningOrderIds;
    }

    /**
     * Set 运行实例 ID 数组
     * @param RunningOrderIds 运行实例 ID 数组
     */
    public void setRunningOrderIds(Long [] RunningOrderIds) {
        this.RunningOrderIds = RunningOrderIds;
    }

    /**
     * Get 工作空间 SerialId 
     * @return WorkSpaceId 工作空间 SerialId
     */
    public String getWorkSpaceId() {
        return this.WorkSpaceId;
    }

    /**
     * Set 工作空间 SerialId
     * @param WorkSpaceId 工作空间 SerialId
     */
    public void setWorkSpaceId(String WorkSpaceId) {
        this.WorkSpaceId = WorkSpaceId;
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

    }
}

