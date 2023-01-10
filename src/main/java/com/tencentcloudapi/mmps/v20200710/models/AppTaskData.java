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
package com.tencentcloudapi.mmps.v20200710.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppTaskData extends AbstractModel{

    /**
    * 任务id
    */
    @SerializedName("TaskID")
    @Expose
    private String TaskID;

    /**
    * 任务类型, 0:基础版, 1:专家版, 2:本地化
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 0:默认值(待检测/待咨询), 1.检测中, 2:待评估, 3:评估中, 4:任务完成/咨询完成, 5:任务失败, 6:咨询中;
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * 错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskErrMsg")
    @Expose
    private String TaskErrMsg;

    /**
    * 任务来源,0:小程序诊断, 1:预留字段(暂未使用), 2:app诊断(android);
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * 应用信息
    */
    @SerializedName("AppInfo")
    @Expose
    private AppInfoItem AppInfo;

    /**
    * 任务启动时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 任务完成时间(更新时间)
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 联系人信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContactName")
    @Expose
    private String ContactName;

    /**
     * Get 任务id 
     * @return TaskID 任务id
     */
    public String getTaskID() {
        return this.TaskID;
    }

    /**
     * Set 任务id
     * @param TaskID 任务id
     */
    public void setTaskID(String TaskID) {
        this.TaskID = TaskID;
    }

    /**
     * Get 任务类型, 0:基础版, 1:专家版, 2:本地化 
     * @return TaskType 任务类型, 0:基础版, 1:专家版, 2:本地化
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型, 0:基础版, 1:专家版, 2:本地化
     * @param TaskType 任务类型, 0:基础版, 1:专家版, 2:本地化
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 0:默认值(待检测/待咨询), 1.检测中, 2:待评估, 3:评估中, 4:任务完成/咨询完成, 5:任务失败, 6:咨询中; 
     * @return TaskStatus 0:默认值(待检测/待咨询), 1.检测中, 2:待评估, 3:评估中, 4:任务完成/咨询完成, 5:任务失败, 6:咨询中;
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 0:默认值(待检测/待咨询), 1.检测中, 2:待评估, 3:评估中, 4:任务完成/咨询完成, 5:任务失败, 6:咨询中;
     * @param TaskStatus 0:默认值(待检测/待咨询), 1.检测中, 2:待评估, 3:评估中, 4:任务完成/咨询完成, 5:任务失败, 6:咨询中;
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskErrMsg 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskErrMsg() {
        return this.TaskErrMsg;
    }

    /**
     * Set 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskErrMsg 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskErrMsg(String TaskErrMsg) {
        this.TaskErrMsg = TaskErrMsg;
    }

    /**
     * Get 任务来源,0:小程序诊断, 1:预留字段(暂未使用), 2:app诊断(android); 
     * @return Source 任务来源,0:小程序诊断, 1:预留字段(暂未使用), 2:app诊断(android);
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 任务来源,0:小程序诊断, 1:预留字段(暂未使用), 2:app诊断(android);
     * @param Source 任务来源,0:小程序诊断, 1:预留字段(暂未使用), 2:app诊断(android);
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get 应用信息 
     * @return AppInfo 应用信息
     */
    public AppInfoItem getAppInfo() {
        return this.AppInfo;
    }

    /**
     * Set 应用信息
     * @param AppInfo 应用信息
     */
    public void setAppInfo(AppInfoItem AppInfo) {
        this.AppInfo = AppInfo;
    }

    /**
     * Get 任务启动时间 
     * @return StartTime 任务启动时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 任务启动时间
     * @param StartTime 任务启动时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 任务完成时间(更新时间) 
     * @return EndTime 任务完成时间(更新时间)
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 任务完成时间(更新时间)
     * @param EndTime 任务完成时间(更新时间)
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 联系人信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContactName 联系人信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContactName() {
        return this.ContactName;
    }

    /**
     * Set 联系人信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContactName 联系人信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContactName(String ContactName) {
        this.ContactName = ContactName;
    }

    public AppTaskData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppTaskData(AppTaskData source) {
        if (source.TaskID != null) {
            this.TaskID = new String(source.TaskID);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long(source.TaskStatus);
        }
        if (source.TaskErrMsg != null) {
            this.TaskErrMsg = new String(source.TaskErrMsg);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.AppInfo != null) {
            this.AppInfo = new AppInfoItem(source.AppInfo);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ContactName != null) {
            this.ContactName = new String(source.ContactName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskID", this.TaskID);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "TaskErrMsg", this.TaskErrMsg);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamObj(map, prefix + "AppInfo.", this.AppInfo);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ContactName", this.ContactName);

    }
}

