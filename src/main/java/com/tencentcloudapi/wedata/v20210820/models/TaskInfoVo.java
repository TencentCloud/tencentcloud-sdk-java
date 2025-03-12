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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskInfoVo extends AbstractModel {

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppID")
    @Expose
    private String AppID;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTypeId")
    @Expose
    private Long TaskTypeId;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OnwerUid")
    @Expose
    private String OnwerUid;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InChargeId")
    @Expose
    private String InChargeId;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineName")
    @Expose
    private String EngineName;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineSubType")
    @Expose
    private String EngineSubType;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineTaskId")
    @Expose
    private String EngineTaskId;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineExeStatus")
    @Expose
    private String EngineExeStatus;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineExeUser")
    @Expose
    private String EngineExeUser;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineExeStartTime")
    @Expose
    private String EngineExeStartTime;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineExeEndTime")
    @Expose
    private String EngineExeEndTime;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductSource")
    @Expose
    private String ProductSource;

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppID 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppID() {
        return this.AppID;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppID 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppID(String AppID) {
        this.AppID = AppID;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTypeId 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTypeId 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTypeId(Long TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OnwerUid 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOnwerUid() {
        return this.OnwerUid;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param OnwerUid 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOnwerUid(String OnwerUid) {
        this.OnwerUid = OnwerUid;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InChargeId 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInChargeId() {
        return this.InChargeId;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param InChargeId 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInChargeId(String InChargeId) {
        this.InChargeId = InChargeId;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobId 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobId 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineType 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineType 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineName 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineName() {
        return this.EngineName;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineName 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineName(String EngineName) {
        this.EngineName = EngineName;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineSubType 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineSubType() {
        return this.EngineSubType;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineSubType 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineSubType(String EngineSubType) {
        this.EngineSubType = EngineSubType;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineTaskId 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineTaskId() {
        return this.EngineTaskId;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineTaskId 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineTaskId(String EngineTaskId) {
        this.EngineTaskId = EngineTaskId;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineExeStatus 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineExeStatus() {
        return this.EngineExeStatus;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineExeStatus 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineExeStatus(String EngineExeStatus) {
        this.EngineExeStatus = EngineExeStatus;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineExeUser 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineExeUser() {
        return this.EngineExeUser;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineExeUser 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineExeUser(String EngineExeUser) {
        this.EngineExeUser = EngineExeUser;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineExeStartTime 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineExeStartTime() {
        return this.EngineExeStartTime;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineExeStartTime 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineExeStartTime(String EngineExeStartTime) {
        this.EngineExeStartTime = EngineExeStartTime;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineExeEndTime 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineExeEndTime() {
        return this.EngineExeEndTime;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineExeEndTime 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineExeEndTime(String EngineExeEndTime) {
        this.EngineExeEndTime = EngineExeEndTime;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductSource 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductSource() {
        return this.ProductSource;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductSource 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductSource(String ProductSource) {
        this.ProductSource = ProductSource;
    }

    public TaskInfoVo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskInfoVo(TaskInfoVo source) {
        if (source.AppID != null) {
            this.AppID = new String(source.AppID);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new Long(source.TaskTypeId);
        }
        if (source.OnwerUid != null) {
            this.OnwerUid = new String(source.OnwerUid);
        }
        if (source.InChargeId != null) {
            this.InChargeId = new String(source.InChargeId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
        if (source.EngineName != null) {
            this.EngineName = new String(source.EngineName);
        }
        if (source.EngineSubType != null) {
            this.EngineSubType = new String(source.EngineSubType);
        }
        if (source.EngineTaskId != null) {
            this.EngineTaskId = new String(source.EngineTaskId);
        }
        if (source.EngineExeStatus != null) {
            this.EngineExeStatus = new String(source.EngineExeStatus);
        }
        if (source.EngineExeUser != null) {
            this.EngineExeUser = new String(source.EngineExeUser);
        }
        if (source.EngineExeStartTime != null) {
            this.EngineExeStartTime = new String(source.EngineExeStartTime);
        }
        if (source.EngineExeEndTime != null) {
            this.EngineExeEndTime = new String(source.EngineExeEndTime);
        }
        if (source.ProductSource != null) {
            this.ProductSource = new String(source.ProductSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "OnwerUid", this.OnwerUid);
        this.setParamSimple(map, prefix + "InChargeId", this.InChargeId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamSimple(map, prefix + "EngineName", this.EngineName);
        this.setParamSimple(map, prefix + "EngineSubType", this.EngineSubType);
        this.setParamSimple(map, prefix + "EngineTaskId", this.EngineTaskId);
        this.setParamSimple(map, prefix + "EngineExeStatus", this.EngineExeStatus);
        this.setParamSimple(map, prefix + "EngineExeUser", this.EngineExeUser);
        this.setParamSimple(map, prefix + "EngineExeStartTime", this.EngineExeStartTime);
        this.setParamSimple(map, prefix + "EngineExeEndTime", this.EngineExeEndTime);
        this.setParamSimple(map, prefix + "ProductSource", this.ProductSource);

    }
}

