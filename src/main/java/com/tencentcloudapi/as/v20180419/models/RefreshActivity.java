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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RefreshActivity extends AbstractModel{

    /**
    * 伸缩组 ID。
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * 刷新活动 ID。
    */
    @SerializedName("RefreshActivityId")
    @Expose
    private String RefreshActivityId;

    /**
    * 原始刷新活动ID，仅在回滚刷新活动中存在。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginRefreshActivityId")
    @Expose
    private String OriginRefreshActivityId;

    /**
    * 刷新批次信息列表。
    */
    @SerializedName("RefreshBatchSet")
    @Expose
    private RefreshBatch [] RefreshBatchSet;

    /**
    * 刷新模式。
    */
    @SerializedName("RefreshMode")
    @Expose
    private String RefreshMode;

    /**
    * 实例更新设置参数。
    */
    @SerializedName("RefreshSettings")
    @Expose
    private RefreshSettings RefreshSettings;

    /**
    * 刷新活动类型。取值如下：<br><li>NORMAL：正常刷新活动</li><li>ROLLBACK：回滚刷新活动
    */
    @SerializedName("ActivityType")
    @Expose
    private String ActivityType;

    /**
    * 刷新活动状态。取值如下：<br><li>INIT：初始化中</li><li>RUNNING：运行中</li><li>SUCCESSFUL：活动成功</li><li>FAILED_PAUSE：因刷新批次失败暂停</li><li>AUTO_PAUSE：因暂停策略自动暂停</li><li>MANUAL_PAUSE：手动暂停</li><li>CANCELLED：活动取消</li><li>FAILED：活动失败
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 当前刷新批次序号。例如，2 表示当前活动正在刷新第二批次的实例。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentRefreshBatchNum")
    @Expose
    private Long CurrentRefreshBatchNum;

    /**
    * 刷新活动开始时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 刷新活动结束时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 刷新活动创建时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get 伸缩组 ID。 
     * @return AutoScalingGroupId 伸缩组 ID。
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set 伸缩组 ID。
     * @param AutoScalingGroupId 伸缩组 ID。
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get 刷新活动 ID。 
     * @return RefreshActivityId 刷新活动 ID。
     */
    public String getRefreshActivityId() {
        return this.RefreshActivityId;
    }

    /**
     * Set 刷新活动 ID。
     * @param RefreshActivityId 刷新活动 ID。
     */
    public void setRefreshActivityId(String RefreshActivityId) {
        this.RefreshActivityId = RefreshActivityId;
    }

    /**
     * Get 原始刷新活动ID，仅在回滚刷新活动中存在。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginRefreshActivityId 原始刷新活动ID，仅在回滚刷新活动中存在。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginRefreshActivityId() {
        return this.OriginRefreshActivityId;
    }

    /**
     * Set 原始刷新活动ID，仅在回滚刷新活动中存在。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginRefreshActivityId 原始刷新活动ID，仅在回滚刷新活动中存在。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginRefreshActivityId(String OriginRefreshActivityId) {
        this.OriginRefreshActivityId = OriginRefreshActivityId;
    }

    /**
     * Get 刷新批次信息列表。 
     * @return RefreshBatchSet 刷新批次信息列表。
     */
    public RefreshBatch [] getRefreshBatchSet() {
        return this.RefreshBatchSet;
    }

    /**
     * Set 刷新批次信息列表。
     * @param RefreshBatchSet 刷新批次信息列表。
     */
    public void setRefreshBatchSet(RefreshBatch [] RefreshBatchSet) {
        this.RefreshBatchSet = RefreshBatchSet;
    }

    /**
     * Get 刷新模式。 
     * @return RefreshMode 刷新模式。
     */
    public String getRefreshMode() {
        return this.RefreshMode;
    }

    /**
     * Set 刷新模式。
     * @param RefreshMode 刷新模式。
     */
    public void setRefreshMode(String RefreshMode) {
        this.RefreshMode = RefreshMode;
    }

    /**
     * Get 实例更新设置参数。 
     * @return RefreshSettings 实例更新设置参数。
     */
    public RefreshSettings getRefreshSettings() {
        return this.RefreshSettings;
    }

    /**
     * Set 实例更新设置参数。
     * @param RefreshSettings 实例更新设置参数。
     */
    public void setRefreshSettings(RefreshSettings RefreshSettings) {
        this.RefreshSettings = RefreshSettings;
    }

    /**
     * Get 刷新活动类型。取值如下：<br><li>NORMAL：正常刷新活动</li><li>ROLLBACK：回滚刷新活动 
     * @return ActivityType 刷新活动类型。取值如下：<br><li>NORMAL：正常刷新活动</li><li>ROLLBACK：回滚刷新活动
     */
    public String getActivityType() {
        return this.ActivityType;
    }

    /**
     * Set 刷新活动类型。取值如下：<br><li>NORMAL：正常刷新活动</li><li>ROLLBACK：回滚刷新活动
     * @param ActivityType 刷新活动类型。取值如下：<br><li>NORMAL：正常刷新活动</li><li>ROLLBACK：回滚刷新活动
     */
    public void setActivityType(String ActivityType) {
        this.ActivityType = ActivityType;
    }

    /**
     * Get 刷新活动状态。取值如下：<br><li>INIT：初始化中</li><li>RUNNING：运行中</li><li>SUCCESSFUL：活动成功</li><li>FAILED_PAUSE：因刷新批次失败暂停</li><li>AUTO_PAUSE：因暂停策略自动暂停</li><li>MANUAL_PAUSE：手动暂停</li><li>CANCELLED：活动取消</li><li>FAILED：活动失败 
     * @return Status 刷新活动状态。取值如下：<br><li>INIT：初始化中</li><li>RUNNING：运行中</li><li>SUCCESSFUL：活动成功</li><li>FAILED_PAUSE：因刷新批次失败暂停</li><li>AUTO_PAUSE：因暂停策略自动暂停</li><li>MANUAL_PAUSE：手动暂停</li><li>CANCELLED：活动取消</li><li>FAILED：活动失败
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 刷新活动状态。取值如下：<br><li>INIT：初始化中</li><li>RUNNING：运行中</li><li>SUCCESSFUL：活动成功</li><li>FAILED_PAUSE：因刷新批次失败暂停</li><li>AUTO_PAUSE：因暂停策略自动暂停</li><li>MANUAL_PAUSE：手动暂停</li><li>CANCELLED：活动取消</li><li>FAILED：活动失败
     * @param Status 刷新活动状态。取值如下：<br><li>INIT：初始化中</li><li>RUNNING：运行中</li><li>SUCCESSFUL：活动成功</li><li>FAILED_PAUSE：因刷新批次失败暂停</li><li>AUTO_PAUSE：因暂停策略自动暂停</li><li>MANUAL_PAUSE：手动暂停</li><li>CANCELLED：活动取消</li><li>FAILED：活动失败
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 当前刷新批次序号。例如，2 表示当前活动正在刷新第二批次的实例。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentRefreshBatchNum 当前刷新批次序号。例如，2 表示当前活动正在刷新第二批次的实例。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCurrentRefreshBatchNum() {
        return this.CurrentRefreshBatchNum;
    }

    /**
     * Set 当前刷新批次序号。例如，2 表示当前活动正在刷新第二批次的实例。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentRefreshBatchNum 当前刷新批次序号。例如，2 表示当前活动正在刷新第二批次的实例。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentRefreshBatchNum(Long CurrentRefreshBatchNum) {
        this.CurrentRefreshBatchNum = CurrentRefreshBatchNum;
    }

    /**
     * Get 刷新活动开始时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 刷新活动开始时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 刷新活动开始时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 刷新活动开始时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 刷新活动结束时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 刷新活动结束时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 刷新活动结束时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 刷新活动结束时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 刷新活动创建时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime 刷新活动创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 刷新活动创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime 刷新活动创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    public RefreshActivity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RefreshActivity(RefreshActivity source) {
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
        }
        if (source.RefreshActivityId != null) {
            this.RefreshActivityId = new String(source.RefreshActivityId);
        }
        if (source.OriginRefreshActivityId != null) {
            this.OriginRefreshActivityId = new String(source.OriginRefreshActivityId);
        }
        if (source.RefreshBatchSet != null) {
            this.RefreshBatchSet = new RefreshBatch[source.RefreshBatchSet.length];
            for (int i = 0; i < source.RefreshBatchSet.length; i++) {
                this.RefreshBatchSet[i] = new RefreshBatch(source.RefreshBatchSet[i]);
            }
        }
        if (source.RefreshMode != null) {
            this.RefreshMode = new String(source.RefreshMode);
        }
        if (source.RefreshSettings != null) {
            this.RefreshSettings = new RefreshSettings(source.RefreshSettings);
        }
        if (source.ActivityType != null) {
            this.ActivityType = new String(source.ActivityType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CurrentRefreshBatchNum != null) {
            this.CurrentRefreshBatchNum = new Long(source.CurrentRefreshBatchNum);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "RefreshActivityId", this.RefreshActivityId);
        this.setParamSimple(map, prefix + "OriginRefreshActivityId", this.OriginRefreshActivityId);
        this.setParamArrayObj(map, prefix + "RefreshBatchSet.", this.RefreshBatchSet);
        this.setParamSimple(map, prefix + "RefreshMode", this.RefreshMode);
        this.setParamObj(map, prefix + "RefreshSettings.", this.RefreshSettings);
        this.setParamSimple(map, prefix + "ActivityType", this.ActivityType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CurrentRefreshBatchNum", this.CurrentRefreshBatchNum);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

