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

public class RollbackTask extends AbstractModel{

    /**
    * 任务执行信息描述。
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
    * 任务执行结果。可能的取值：INITIAL - 初始化，RUNNING - 运行中，SUCCESS - 执行成功，FAILED - 执行失败，KILLED - 已终止，REMOVED - 已删除，PAUSED - 终止中。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务执行进度。取值范围为[0, 100]。
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

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
    * 回档任务详情。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Detail")
    @Expose
    private RollbackInstancesInfo [] Detail;

    /**
     * Get 任务执行信息描述。 
     * @return Info 任务执行信息描述。
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * Set 任务执行信息描述。
     * @param Info 任务执行信息描述。
     */
    public void setInfo(String Info) {
        this.Info = Info;
    }

    /**
     * Get 任务执行结果。可能的取值：INITIAL - 初始化，RUNNING - 运行中，SUCCESS - 执行成功，FAILED - 执行失败，KILLED - 已终止，REMOVED - 已删除，PAUSED - 终止中。 
     * @return Status 任务执行结果。可能的取值：INITIAL - 初始化，RUNNING - 运行中，SUCCESS - 执行成功，FAILED - 执行失败，KILLED - 已终止，REMOVED - 已删除，PAUSED - 终止中。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务执行结果。可能的取值：INITIAL - 初始化，RUNNING - 运行中，SUCCESS - 执行成功，FAILED - 执行失败，KILLED - 已终止，REMOVED - 已删除，PAUSED - 终止中。
     * @param Status 任务执行结果。可能的取值：INITIAL - 初始化，RUNNING - 运行中，SUCCESS - 执行成功，FAILED - 执行失败，KILLED - 已终止，REMOVED - 已删除，PAUSED - 终止中。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 任务执行进度。取值范围为[0, 100]。 
     * @return Progress 任务执行进度。取值范围为[0, 100]。
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 任务执行进度。取值范围为[0, 100]。
     * @param Progress 任务执行进度。取值范围为[0, 100]。
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
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
     * Get 回档任务详情。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Detail 回档任务详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RollbackInstancesInfo [] getDetail() {
        return this.Detail;
    }

    /**
     * Set 回档任务详情。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Detail 回档任务详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetail(RollbackInstancesInfo [] Detail) {
        this.Detail = Detail;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Info", this.Info);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "Detail.", this.Detail);

    }
}

