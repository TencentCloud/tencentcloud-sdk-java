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

public class ReportTaskDetail extends AbstractModel {

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
    @SerializedName("TaskTypeId")
    @Expose
    private Long TaskTypeId;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessInfo")
    @Expose
    private String BusinessInfo;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineTaskInfo")
    @Expose
    private EngineTaskInfo EngineTaskInfo;

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
     * @return BusinessInfo 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBusinessInfo() {
        return this.BusinessInfo;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessInfo 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessInfo(String BusinessInfo) {
        this.BusinessInfo = BusinessInfo;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineTaskInfo 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EngineTaskInfo getEngineTaskInfo() {
        return this.EngineTaskInfo;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineTaskInfo 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineTaskInfo(EngineTaskInfo EngineTaskInfo) {
        this.EngineTaskInfo = EngineTaskInfo;
    }

    public ReportTaskDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReportTaskDetail(ReportTaskDetail source) {
        if (source.EngineTaskId != null) {
            this.EngineTaskId = new String(source.EngineTaskId);
        }
        if (source.EngineExeStatus != null) {
            this.EngineExeStatus = new String(source.EngineExeStatus);
        }
        if (source.EngineExeStartTime != null) {
            this.EngineExeStartTime = new String(source.EngineExeStartTime);
        }
        if (source.EngineExeEndTime != null) {
            this.EngineExeEndTime = new String(source.EngineExeEndTime);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new Long(source.TaskTypeId);
        }
        if (source.BusinessInfo != null) {
            this.BusinessInfo = new String(source.BusinessInfo);
        }
        if (source.EngineTaskInfo != null) {
            this.EngineTaskInfo = new EngineTaskInfo(source.EngineTaskInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EngineTaskId", this.EngineTaskId);
        this.setParamSimple(map, prefix + "EngineExeStatus", this.EngineExeStatus);
        this.setParamSimple(map, prefix + "EngineExeStartTime", this.EngineExeStartTime);
        this.setParamSimple(map, prefix + "EngineExeEndTime", this.EngineExeEndTime);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "BusinessInfo", this.BusinessInfo);
        this.setParamObj(map, prefix + "EngineTaskInfo.", this.EngineTaskInfo);

    }
}

