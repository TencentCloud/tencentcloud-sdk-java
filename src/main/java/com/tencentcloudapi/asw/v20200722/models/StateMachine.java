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
package com.tencentcloudapi.asw.v20200722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StateMachine extends AbstractModel{

    /**
    * 状态机资源
    */
    @SerializedName("FlowServiceResource")
    @Expose
    private String FlowServiceResource;

    /**
    * 状态机类型。EXPRESS，STANDARD
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 状态机名称
    */
    @SerializedName("FlowServiceName")
    @Expose
    private String FlowServiceName;

    /**
    * 状态机中文名
    */
    @SerializedName("FlowServiceChineseName")
    @Expose
    private String FlowServiceChineseName;

    /**
    * 创建时间。timestamp
    */
    @SerializedName("CreateDate")
    @Expose
    private String CreateDate;

    /**
    * 修改时间。timestamp
    */
    @SerializedName("ModifyDate")
    @Expose
    private String ModifyDate;

    /**
    * 状态机状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 创建者的subAccountUin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 修改者的subAccountUin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Modifier")
    @Expose
    private String Modifier;

    /**
    * 状态机id
    */
    @SerializedName("FlowServiceId")
    @Expose
    private String FlowServiceId;

    /**
    * 模板id
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 备注
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 状态机资源 
     * @return FlowServiceResource 状态机资源
     */
    public String getFlowServiceResource() {
        return this.FlowServiceResource;
    }

    /**
     * Set 状态机资源
     * @param FlowServiceResource 状态机资源
     */
    public void setFlowServiceResource(String FlowServiceResource) {
        this.FlowServiceResource = FlowServiceResource;
    }

    /**
     * Get 状态机类型。EXPRESS，STANDARD 
     * @return Type 状态机类型。EXPRESS，STANDARD
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 状态机类型。EXPRESS，STANDARD
     * @param Type 状态机类型。EXPRESS，STANDARD
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 状态机名称 
     * @return FlowServiceName 状态机名称
     */
    public String getFlowServiceName() {
        return this.FlowServiceName;
    }

    /**
     * Set 状态机名称
     * @param FlowServiceName 状态机名称
     */
    public void setFlowServiceName(String FlowServiceName) {
        this.FlowServiceName = FlowServiceName;
    }

    /**
     * Get 状态机中文名 
     * @return FlowServiceChineseName 状态机中文名
     */
    public String getFlowServiceChineseName() {
        return this.FlowServiceChineseName;
    }

    /**
     * Set 状态机中文名
     * @param FlowServiceChineseName 状态机中文名
     */
    public void setFlowServiceChineseName(String FlowServiceChineseName) {
        this.FlowServiceChineseName = FlowServiceChineseName;
    }

    /**
     * Get 创建时间。timestamp 
     * @return CreateDate 创建时间。timestamp
     */
    public String getCreateDate() {
        return this.CreateDate;
    }

    /**
     * Set 创建时间。timestamp
     * @param CreateDate 创建时间。timestamp
     */
    public void setCreateDate(String CreateDate) {
        this.CreateDate = CreateDate;
    }

    /**
     * Get 修改时间。timestamp 
     * @return ModifyDate 修改时间。timestamp
     */
    public String getModifyDate() {
        return this.ModifyDate;
    }

    /**
     * Set 修改时间。timestamp
     * @param ModifyDate 修改时间。timestamp
     */
    public void setModifyDate(String ModifyDate) {
        this.ModifyDate = ModifyDate;
    }

    /**
     * Get 状态机状态 
     * @return Status 状态机状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态机状态
     * @param Status 状态机状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 创建者的subAccountUin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Creator 创建者的subAccountUin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建者的subAccountUin
注意：此字段可能返回 null，表示取不到有效值。
     * @param Creator 创建者的subAccountUin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 修改者的subAccountUin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Modifier 修改者的subAccountUin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifier() {
        return this.Modifier;
    }

    /**
     * Set 修改者的subAccountUin
注意：此字段可能返回 null，表示取不到有效值。
     * @param Modifier 修改者的subAccountUin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifier(String Modifier) {
        this.Modifier = Modifier;
    }

    /**
     * Get 状态机id 
     * @return FlowServiceId 状态机id
     */
    public String getFlowServiceId() {
        return this.FlowServiceId;
    }

    /**
     * Set 状态机id
     * @param FlowServiceId 状态机id
     */
    public void setFlowServiceId(String FlowServiceId) {
        this.FlowServiceId = FlowServiceId;
    }

    /**
     * Get 模板id 
     * @return TemplateId 模板id
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板id
     * @param TemplateId 模板id
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 备注 
     * @return Description 备注
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 备注
     * @param Description 备注
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public StateMachine() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StateMachine(StateMachine source) {
        if (source.FlowServiceResource != null) {
            this.FlowServiceResource = new String(source.FlowServiceResource);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.FlowServiceName != null) {
            this.FlowServiceName = new String(source.FlowServiceName);
        }
        if (source.FlowServiceChineseName != null) {
            this.FlowServiceChineseName = new String(source.FlowServiceChineseName);
        }
        if (source.CreateDate != null) {
            this.CreateDate = new String(source.CreateDate);
        }
        if (source.ModifyDate != null) {
            this.ModifyDate = new String(source.ModifyDate);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.Modifier != null) {
            this.Modifier = new String(source.Modifier);
        }
        if (source.FlowServiceId != null) {
            this.FlowServiceId = new String(source.FlowServiceId);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowServiceResource", this.FlowServiceResource);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "FlowServiceName", this.FlowServiceName);
        this.setParamSimple(map, prefix + "FlowServiceChineseName", this.FlowServiceChineseName);
        this.setParamSimple(map, prefix + "CreateDate", this.CreateDate);
        this.setParamSimple(map, prefix + "ModifyDate", this.ModifyDate);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "Modifier", this.Modifier);
        this.setParamSimple(map, prefix + "FlowServiceId", this.FlowServiceId);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

