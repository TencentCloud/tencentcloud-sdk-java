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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloneItem extends AbstractModel{

    /**
    * 克隆任务的源实例Id。
    */
    @SerializedName("SrcInstanceId")
    @Expose
    private String SrcInstanceId;

    /**
    * 克隆任务的新产生实例Id。
    */
    @SerializedName("DstInstanceId")
    @Expose
    private String DstInstanceId;

    /**
    * 克隆任务对应的任务列表Id。
    */
    @SerializedName("CloneJobId")
    @Expose
    private Long CloneJobId;

    /**
    * 克隆实例使用的策略， 包括以下类型：  timepoint:指定时间点回档，  backupset: 指定备份文件回档。
    */
    @SerializedName("RollbackStrategy")
    @Expose
    private String RollbackStrategy;

    /**
    * 克隆实例回档的时间点。
    */
    @SerializedName("RollbackTargetTime")
    @Expose
    private String RollbackTargetTime;

    /**
    * 任务开始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 任务结束时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 任务状态，包括以下状态：initial,running,wait_complete,success,failed
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
     * Get 克隆任务的源实例Id。 
     * @return SrcInstanceId 克隆任务的源实例Id。
     */
    public String getSrcInstanceId() {
        return this.SrcInstanceId;
    }

    /**
     * Set 克隆任务的源实例Id。
     * @param SrcInstanceId 克隆任务的源实例Id。
     */
    public void setSrcInstanceId(String SrcInstanceId) {
        this.SrcInstanceId = SrcInstanceId;
    }

    /**
     * Get 克隆任务的新产生实例Id。 
     * @return DstInstanceId 克隆任务的新产生实例Id。
     */
    public String getDstInstanceId() {
        return this.DstInstanceId;
    }

    /**
     * Set 克隆任务的新产生实例Id。
     * @param DstInstanceId 克隆任务的新产生实例Id。
     */
    public void setDstInstanceId(String DstInstanceId) {
        this.DstInstanceId = DstInstanceId;
    }

    /**
     * Get 克隆任务对应的任务列表Id。 
     * @return CloneJobId 克隆任务对应的任务列表Id。
     */
    public Long getCloneJobId() {
        return this.CloneJobId;
    }

    /**
     * Set 克隆任务对应的任务列表Id。
     * @param CloneJobId 克隆任务对应的任务列表Id。
     */
    public void setCloneJobId(Long CloneJobId) {
        this.CloneJobId = CloneJobId;
    }

    /**
     * Get 克隆实例使用的策略， 包括以下类型：  timepoint:指定时间点回档，  backupset: 指定备份文件回档。 
     * @return RollbackStrategy 克隆实例使用的策略， 包括以下类型：  timepoint:指定时间点回档，  backupset: 指定备份文件回档。
     */
    public String getRollbackStrategy() {
        return this.RollbackStrategy;
    }

    /**
     * Set 克隆实例使用的策略， 包括以下类型：  timepoint:指定时间点回档，  backupset: 指定备份文件回档。
     * @param RollbackStrategy 克隆实例使用的策略， 包括以下类型：  timepoint:指定时间点回档，  backupset: 指定备份文件回档。
     */
    public void setRollbackStrategy(String RollbackStrategy) {
        this.RollbackStrategy = RollbackStrategy;
    }

    /**
     * Get 克隆实例回档的时间点。 
     * @return RollbackTargetTime 克隆实例回档的时间点。
     */
    public String getRollbackTargetTime() {
        return this.RollbackTargetTime;
    }

    /**
     * Set 克隆实例回档的时间点。
     * @param RollbackTargetTime 克隆实例回档的时间点。
     */
    public void setRollbackTargetTime(String RollbackTargetTime) {
        this.RollbackTargetTime = RollbackTargetTime;
    }

    /**
     * Get 任务开始时间。 
     * @return StartTime 任务开始时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 任务开始时间。
     * @param StartTime 任务开始时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 任务结束时间。 
     * @return EndTime 任务结束时间。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 任务结束时间。
     * @param EndTime 任务结束时间。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 任务状态，包括以下状态：initial,running,wait_complete,success,failed 
     * @return TaskStatus 任务状态，包括以下状态：initial,running,wait_complete,success,failed
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务状态，包括以下状态：initial,running,wait_complete,success,failed
     * @param TaskStatus 任务状态，包括以下状态：initial,running,wait_complete,success,failed
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    public CloneItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloneItem(CloneItem source) {
        if (source.SrcInstanceId != null) {
            this.SrcInstanceId = new String(source.SrcInstanceId);
        }
        if (source.DstInstanceId != null) {
            this.DstInstanceId = new String(source.DstInstanceId);
        }
        if (source.CloneJobId != null) {
            this.CloneJobId = new Long(source.CloneJobId);
        }
        if (source.RollbackStrategy != null) {
            this.RollbackStrategy = new String(source.RollbackStrategy);
        }
        if (source.RollbackTargetTime != null) {
            this.RollbackTargetTime = new String(source.RollbackTargetTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SrcInstanceId", this.SrcInstanceId);
        this.setParamSimple(map, prefix + "DstInstanceId", this.DstInstanceId);
        this.setParamSimple(map, prefix + "CloneJobId", this.CloneJobId);
        this.setParamSimple(map, prefix + "RollbackStrategy", this.RollbackStrategy);
        this.setParamSimple(map, prefix + "RollbackTargetTime", this.RollbackTargetTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);

    }
}

