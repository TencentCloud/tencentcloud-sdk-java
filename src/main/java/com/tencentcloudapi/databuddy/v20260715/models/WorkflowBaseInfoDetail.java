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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowBaseInfoDetail extends AbstractModel {

    /**
    * 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 创建人UIN
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * 工作流运行人UIN
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunUserUin")
    @Expose
    private String RunUserUin;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 工作流负责人用户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUserName")
    @Expose
    private String OwnerUserName;

    /**
    * 工作流负责人UIN
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUserUin")
    @Expose
    private String OwnerUserUin;

    /**
    * 工作流负责人展示名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerDisplayName")
    @Expose
    private String OwnerDisplayName;

    /**
    * 创建时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 工作流名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowName 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowName 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get 工作流ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowId 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowId 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 创建人UIN
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUserUin 创建人UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set 创建人UIN
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUserUin 创建人UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get 工作流运行人UIN
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunUserUin 工作流运行人UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunUserUin() {
        return this.RunUserUin;
    }

    /**
     * Set 工作流运行人UIN
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunUserUin 工作流运行人UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunUserUin(String RunUserUin) {
        this.RunUserUin = RunUserUin;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 工作流负责人用户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUserName 工作流负责人用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUserName() {
        return this.OwnerUserName;
    }

    /**
     * Set 工作流负责人用户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUserName 工作流负责人用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUserName(String OwnerUserName) {
        this.OwnerUserName = OwnerUserName;
    }

    /**
     * Get 工作流负责人UIN
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUserUin 工作流负责人UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUserUin() {
        return this.OwnerUserUin;
    }

    /**
     * Set 工作流负责人UIN
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUserUin 工作流负责人UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUserUin(String OwnerUserUin) {
        this.OwnerUserUin = OwnerUserUin;
    }

    /**
     * Get 工作流负责人展示名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerDisplayName 工作流负责人展示名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerDisplayName() {
        return this.OwnerDisplayName;
    }

    /**
     * Set 工作流负责人展示名
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerDisplayName 工作流负责人展示名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerDisplayName(String OwnerDisplayName) {
        this.OwnerDisplayName = OwnerDisplayName;
    }

    /**
     * Get 创建时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public WorkflowBaseInfoDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowBaseInfoDetail(WorkflowBaseInfoDetail source) {
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.RunUserUin != null) {
            this.RunUserUin = new String(source.RunUserUin);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.OwnerUserName != null) {
            this.OwnerUserName = new String(source.OwnerUserName);
        }
        if (source.OwnerUserUin != null) {
            this.OwnerUserUin = new String(source.OwnerUserUin);
        }
        if (source.OwnerDisplayName != null) {
            this.OwnerDisplayName = new String(source.OwnerDisplayName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamSimple(map, prefix + "RunUserUin", this.RunUserUin);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "OwnerUserName", this.OwnerUserName);
        this.setParamSimple(map, prefix + "OwnerUserUin", this.OwnerUserUin);
        this.setParamSimple(map, prefix + "OwnerDisplayName", this.OwnerDisplayName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

