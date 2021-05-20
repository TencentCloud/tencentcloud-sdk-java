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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplyResult extends AbstractModel{

    /**
    * 申请单id
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 申请类型
    */
    @SerializedName("ApplicationType")
    @Expose
    private Long ApplicationType;

    /**
    * 处理状态 0-待审核 1-已经审核并提交任务 2-已驳回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationStatus")
    @Expose
    private Long ApplicationStatus;

    /**
    * 已提交的任务Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Error")
    @Expose
    private ErrorInfo Error;

    /**
     * Get 申请单id 
     * @return ApplicationId 申请单id
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 申请单id
     * @param ApplicationId 申请单id
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 申请类型 
     * @return ApplicationType 申请类型
     */
    public Long getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set 申请类型
     * @param ApplicationType 申请类型
     */
    public void setApplicationType(Long ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get 处理状态 0-待审核 1-已经审核并提交任务 2-已驳回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationStatus 处理状态 0-待审核 1-已经审核并提交任务 2-已驳回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getApplicationStatus() {
        return this.ApplicationStatus;
    }

    /**
     * Set 处理状态 0-待审核 1-已经审核并提交任务 2-已驳回
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationStatus 处理状态 0-待审核 1-已经审核并提交任务 2-已驳回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationStatus(Long ApplicationStatus) {
        this.ApplicationStatus = ApplicationStatus;
    }

    /**
     * Get 已提交的任务Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 已提交的任务Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 已提交的任务Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 已提交的任务Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Error 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ErrorInfo getError() {
        return this.Error;
    }

    /**
     * Set 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Error 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setError(ErrorInfo Error) {
        this.Error = Error;
    }

    public ApplyResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyResult(ApplyResult source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationType != null) {
            this.ApplicationType = new Long(source.ApplicationType);
        }
        if (source.ApplicationStatus != null) {
            this.ApplicationStatus = new Long(source.ApplicationStatus);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Error != null) {
            this.Error = new ErrorInfo(source.Error);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamSimple(map, prefix + "ApplicationStatus", this.ApplicationStatus);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamObj(map, prefix + "Error.", this.Error);

    }
}

