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

public class WorkflowBaseInfo extends AbstractModel {

    /**
    * 工作流名称，长度不超过 1024
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * 工作流ID，创建时无需传入，由服务端生成
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

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
    * 创建人UIN。系统生成字段，入参传值不生效（服务端忽略且不报错）
【已废弃】服务端忽略传入值，不报错。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
     * Get 工作流名称，长度不超过 1024
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowName 工作流名称，长度不超过 1024
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set 工作流名称，长度不超过 1024
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowName 工作流名称，长度不超过 1024
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get 工作流ID，创建时无需传入，由服务端生成
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowId 工作流ID，创建时无需传入，由服务端生成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流ID，创建时无需传入，由服务端生成
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowId 工作流ID，创建时无需传入，由服务端生成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
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
     * Get 创建人UIN。系统生成字段，入参传值不生效（服务端忽略且不报错）
【已废弃】服务端忽略传入值，不报错。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUserUin 创建人UIN。系统生成字段，入参传值不生效（服务端忽略且不报错）
【已废弃】服务端忽略传入值，不报错。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set 创建人UIN。系统生成字段，入参传值不生效（服务端忽略且不报错）
【已废弃】服务端忽略传入值，不报错。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUserUin 创建人UIN。系统生成字段，入参传值不生效（服务端忽略且不报错）
【已废弃】服务端忽略传入值，不报错。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    public WorkflowBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowBaseInfo(WorkflowBaseInfo source) {
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
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
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "RunUserUin", this.RunUserUin);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "OwnerUserName", this.OwnerUserName);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);

    }
}

