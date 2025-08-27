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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppInfo extends AbstractModel {

    /**
    * 应用类型；knowledge_qa-知识问答管理；summary-知识摘要；classifys-知识标签提取
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppType")
    @Expose
    private String AppType;

    /**
    * 应用类型描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppTypeDesc")
    @Expose
    private String AppTypeDesc;

    /**
    * 应用ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppBizId")
    @Expose
    private String AppBizId;

    /**
    * 应用名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 应用头像
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Avatar")
    @Expose
    private String Avatar;

    /**
    * 应用描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 应用状态，1：未上线，2：运行中，3：停用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppStatus")
    @Expose
    private Long AppStatus;

    /**
    * 状态说明
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppStatusDesc")
    @Expose
    private String AppStatusDesc;

    /**
    * 修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 最后修改人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 模型名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 生成模型别名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelAliasName")
    @Expose
    private String ModelAliasName;

    /**
    * 应用模式 standard:标准模式, agent: agent模式，single_workflow：单工作流模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Pattern")
    @Expose
    private String Pattern;

    /**
    * 思考模型别名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ThoughtModelAliasName")
    @Expose
    private String ThoughtModelAliasName;

    /**
    * 权限位信息
    */
    @SerializedName("PermissionIds")
    @Expose
    private String [] PermissionIds;

    /**
    * 创建人昵称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
     * Get 应用类型；knowledge_qa-知识问答管理；summary-知识摘要；classifys-知识标签提取
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppType 应用类型；knowledge_qa-知识问答管理；summary-知识摘要；classifys-知识标签提取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppType() {
        return this.AppType;
    }

    /**
     * Set 应用类型；knowledge_qa-知识问答管理；summary-知识摘要；classifys-知识标签提取
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppType 应用类型；knowledge_qa-知识问答管理；summary-知识摘要；classifys-知识标签提取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppType(String AppType) {
        this.AppType = AppType;
    }

    /**
     * Get 应用类型描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppTypeDesc 应用类型描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppTypeDesc() {
        return this.AppTypeDesc;
    }

    /**
     * Set 应用类型描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppTypeDesc 应用类型描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppTypeDesc(String AppTypeDesc) {
        this.AppTypeDesc = AppTypeDesc;
    }

    /**
     * Get 应用ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppBizId 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppBizId() {
        return this.AppBizId;
    }

    /**
     * Set 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppBizId 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppBizId(String AppBizId) {
        this.AppBizId = AppBizId;
    }

    /**
     * Get 应用名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 应用头像
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Avatar 应用头像
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAvatar() {
        return this.Avatar;
    }

    /**
     * Set 应用头像
注意：此字段可能返回 null，表示取不到有效值。
     * @param Avatar 应用头像
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
    }

    /**
     * Get 应用描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Desc 应用描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 应用描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Desc 应用描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 应用状态，1：未上线，2：运行中，3：停用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppStatus 应用状态，1：未上线，2：运行中，3：停用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppStatus() {
        return this.AppStatus;
    }

    /**
     * Set 应用状态，1：未上线，2：运行中，3：停用
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppStatus 应用状态，1：未上线，2：运行中，3：停用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppStatus(Long AppStatus) {
        this.AppStatus = AppStatus;
    }

    /**
     * Get 状态说明
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppStatusDesc 状态说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppStatusDesc() {
        return this.AppStatusDesc;
    }

    /**
     * Set 状态说明
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppStatusDesc 状态说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppStatusDesc(String AppStatusDesc) {
        this.AppStatusDesc = AppStatusDesc;
    }

    /**
     * Get 修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 最后修改人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operator 最后修改人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 最后修改人
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operator 最后修改人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 模型名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelName 模型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 模型名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelName 模型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get 生成模型别名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelAliasName 生成模型别名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelAliasName() {
        return this.ModelAliasName;
    }

    /**
     * Set 生成模型别名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelAliasName 生成模型别名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelAliasName(String ModelAliasName) {
        this.ModelAliasName = ModelAliasName;
    }

    /**
     * Get 应用模式 standard:标准模式, agent: agent模式，single_workflow：单工作流模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Pattern 应用模式 standard:标准模式, agent: agent模式，single_workflow：单工作流模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPattern() {
        return this.Pattern;
    }

    /**
     * Set 应用模式 standard:标准模式, agent: agent模式，single_workflow：单工作流模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Pattern 应用模式 standard:标准模式, agent: agent模式，single_workflow：单工作流模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPattern(String Pattern) {
        this.Pattern = Pattern;
    }

    /**
     * Get 思考模型别名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ThoughtModelAliasName 思考模型别名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getThoughtModelAliasName() {
        return this.ThoughtModelAliasName;
    }

    /**
     * Set 思考模型别名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ThoughtModelAliasName 思考模型别名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThoughtModelAliasName(String ThoughtModelAliasName) {
        this.ThoughtModelAliasName = ThoughtModelAliasName;
    }

    /**
     * Get 权限位信息 
     * @return PermissionIds 权限位信息
     */
    public String [] getPermissionIds() {
        return this.PermissionIds;
    }

    /**
     * Set 权限位信息
     * @param PermissionIds 权限位信息
     */
    public void setPermissionIds(String [] PermissionIds) {
        this.PermissionIds = PermissionIds;
    }

    /**
     * Get 创建人昵称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Creator 创建人昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建人昵称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Creator 创建人昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    public AppInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppInfo(AppInfo source) {
        if (source.AppType != null) {
            this.AppType = new String(source.AppType);
        }
        if (source.AppTypeDesc != null) {
            this.AppTypeDesc = new String(source.AppTypeDesc);
        }
        if (source.AppBizId != null) {
            this.AppBizId = new String(source.AppBizId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Avatar != null) {
            this.Avatar = new String(source.Avatar);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.AppStatus != null) {
            this.AppStatus = new Long(source.AppStatus);
        }
        if (source.AppStatusDesc != null) {
            this.AppStatusDesc = new String(source.AppStatusDesc);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelAliasName != null) {
            this.ModelAliasName = new String(source.ModelAliasName);
        }
        if (source.Pattern != null) {
            this.Pattern = new String(source.Pattern);
        }
        if (source.ThoughtModelAliasName != null) {
            this.ThoughtModelAliasName = new String(source.ThoughtModelAliasName);
        }
        if (source.PermissionIds != null) {
            this.PermissionIds = new String[source.PermissionIds.length];
            for (int i = 0; i < source.PermissionIds.length; i++) {
                this.PermissionIds[i] = new String(source.PermissionIds[i]);
            }
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppType", this.AppType);
        this.setParamSimple(map, prefix + "AppTypeDesc", this.AppTypeDesc);
        this.setParamSimple(map, prefix + "AppBizId", this.AppBizId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Avatar", this.Avatar);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "AppStatus", this.AppStatus);
        this.setParamSimple(map, prefix + "AppStatusDesc", this.AppStatusDesc);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelAliasName", this.ModelAliasName);
        this.setParamSimple(map, prefix + "Pattern", this.Pattern);
        this.setParamSimple(map, prefix + "ThoughtModelAliasName", this.ThoughtModelAliasName);
        this.setParamArraySimple(map, prefix + "PermissionIds.", this.PermissionIds);
        this.setParamSimple(map, prefix + "Creator", this.Creator);

    }
}

