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

public class ModifyFlowServiceRequest extends AbstractModel{

    /**
    * 状态机资源名
    */
    @SerializedName("FlowServiceResource")
    @Expose
    private String FlowServiceResource;

    /**
    * 定义JSON
    */
    @SerializedName("Definition")
    @Expose
    private String Definition;

    /**
    * 状态机所属服务名
    */
    @SerializedName("FlowServiceName")
    @Expose
    private String FlowServiceName;

    /**
    * 状态机所属服务中文名
    */
    @SerializedName("FlowServiceChineseName")
    @Expose
    private String FlowServiceChineseName;

    /**
    * 是否是新角色
    */
    @SerializedName("IsNewRole")
    @Expose
    private Boolean IsNewRole;

    /**
    * 状态机类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 角色资源名
    */
    @SerializedName("RoleResource")
    @Expose
    private String RoleResource;

    /**
    * 状态机备注
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 是否允许日志投递
    */
    @SerializedName("EnableCLS")
    @Expose
    private Boolean EnableCLS;

    /**
     * Get 状态机资源名 
     * @return FlowServiceResource 状态机资源名
     */
    public String getFlowServiceResource() {
        return this.FlowServiceResource;
    }

    /**
     * Set 状态机资源名
     * @param FlowServiceResource 状态机资源名
     */
    public void setFlowServiceResource(String FlowServiceResource) {
        this.FlowServiceResource = FlowServiceResource;
    }

    /**
     * Get 定义JSON 
     * @return Definition 定义JSON
     */
    public String getDefinition() {
        return this.Definition;
    }

    /**
     * Set 定义JSON
     * @param Definition 定义JSON
     */
    public void setDefinition(String Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 状态机所属服务名 
     * @return FlowServiceName 状态机所属服务名
     */
    public String getFlowServiceName() {
        return this.FlowServiceName;
    }

    /**
     * Set 状态机所属服务名
     * @param FlowServiceName 状态机所属服务名
     */
    public void setFlowServiceName(String FlowServiceName) {
        this.FlowServiceName = FlowServiceName;
    }

    /**
     * Get 状态机所属服务中文名 
     * @return FlowServiceChineseName 状态机所属服务中文名
     */
    public String getFlowServiceChineseName() {
        return this.FlowServiceChineseName;
    }

    /**
     * Set 状态机所属服务中文名
     * @param FlowServiceChineseName 状态机所属服务中文名
     */
    public void setFlowServiceChineseName(String FlowServiceChineseName) {
        this.FlowServiceChineseName = FlowServiceChineseName;
    }

    /**
     * Get 是否是新角色 
     * @return IsNewRole 是否是新角色
     */
    public Boolean getIsNewRole() {
        return this.IsNewRole;
    }

    /**
     * Set 是否是新角色
     * @param IsNewRole 是否是新角色
     */
    public void setIsNewRole(Boolean IsNewRole) {
        this.IsNewRole = IsNewRole;
    }

    /**
     * Get 状态机类型 
     * @return Type 状态机类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 状态机类型
     * @param Type 状态机类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 角色资源名 
     * @return RoleResource 角色资源名
     */
    public String getRoleResource() {
        return this.RoleResource;
    }

    /**
     * Set 角色资源名
     * @param RoleResource 角色资源名
     */
    public void setRoleResource(String RoleResource) {
        this.RoleResource = RoleResource;
    }

    /**
     * Get 状态机备注 
     * @return Description 状态机备注
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 状态机备注
     * @param Description 状态机备注
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 是否允许日志投递 
     * @return EnableCLS 是否允许日志投递
     */
    public Boolean getEnableCLS() {
        return this.EnableCLS;
    }

    /**
     * Set 是否允许日志投递
     * @param EnableCLS 是否允许日志投递
     */
    public void setEnableCLS(Boolean EnableCLS) {
        this.EnableCLS = EnableCLS;
    }

    public ModifyFlowServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyFlowServiceRequest(ModifyFlowServiceRequest source) {
        if (source.FlowServiceResource != null) {
            this.FlowServiceResource = new String(source.FlowServiceResource);
        }
        if (source.Definition != null) {
            this.Definition = new String(source.Definition);
        }
        if (source.FlowServiceName != null) {
            this.FlowServiceName = new String(source.FlowServiceName);
        }
        if (source.FlowServiceChineseName != null) {
            this.FlowServiceChineseName = new String(source.FlowServiceChineseName);
        }
        if (source.IsNewRole != null) {
            this.IsNewRole = new Boolean(source.IsNewRole);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.RoleResource != null) {
            this.RoleResource = new String(source.RoleResource);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.EnableCLS != null) {
            this.EnableCLS = new Boolean(source.EnableCLS);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowServiceResource", this.FlowServiceResource);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "FlowServiceName", this.FlowServiceName);
        this.setParamSimple(map, prefix + "FlowServiceChineseName", this.FlowServiceChineseName);
        this.setParamSimple(map, prefix + "IsNewRole", this.IsNewRole);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RoleResource", this.RoleResource);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "EnableCLS", this.EnableCLS);

    }
}

