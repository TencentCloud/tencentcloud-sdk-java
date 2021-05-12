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

public class DescribeFlowServiceDetailResponse extends AbstractModel{

    /**
    * 状态机所属服务名
    */
    @SerializedName("FlowServiceName")
    @Expose
    private String FlowServiceName;

    /**
    * 状态机状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 定义文本（JSON格式）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Definition")
    @Expose
    private String Definition;

    /**
    * 角色资源名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoleResource")
    @Expose
    private String RoleResource;

    /**
    * 状态机的类型，可以为 （EXPRESS/STANDARD）
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 生成时间
    */
    @SerializedName("CreateDate")
    @Expose
    private String CreateDate;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 状态机所属服务中文名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowServiceChineseName")
    @Expose
    private String FlowServiceChineseName;

    /**
    * 是否开启日志CLS服务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableCLS")
    @Expose
    private Boolean EnableCLS;

    /**
    * CLS日志查看地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CLSUrl")
    @Expose
    private String CLSUrl;

    /**
    * 工作流提示输入
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowInput")
    @Expose
    private String FlowInput;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get 定义文本（JSON格式）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Definition 定义文本（JSON格式）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDefinition() {
        return this.Definition;
    }

    /**
     * Set 定义文本（JSON格式）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Definition 定义文本（JSON格式）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefinition(String Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 角色资源名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoleResource 角色资源名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoleResource() {
        return this.RoleResource;
    }

    /**
     * Set 角色资源名
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoleResource 角色资源名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoleResource(String RoleResource) {
        this.RoleResource = RoleResource;
    }

    /**
     * Get 状态机的类型，可以为 （EXPRESS/STANDARD） 
     * @return Type 状态机的类型，可以为 （EXPRESS/STANDARD）
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 状态机的类型，可以为 （EXPRESS/STANDARD）
     * @param Type 状态机的类型，可以为 （EXPRESS/STANDARD）
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 生成时间 
     * @return CreateDate 生成时间
     */
    public String getCreateDate() {
        return this.CreateDate;
    }

    /**
     * Set 生成时间
     * @param CreateDate 生成时间
     */
    public void setCreateDate(String CreateDate) {
        this.CreateDate = CreateDate;
    }

    /**
     * Get 备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 状态机所属服务中文名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowServiceChineseName 状态机所属服务中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlowServiceChineseName() {
        return this.FlowServiceChineseName;
    }

    /**
     * Set 状态机所属服务中文名
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowServiceChineseName 状态机所属服务中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowServiceChineseName(String FlowServiceChineseName) {
        this.FlowServiceChineseName = FlowServiceChineseName;
    }

    /**
     * Get 是否开启日志CLS服务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableCLS 是否开启日志CLS服务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableCLS() {
        return this.EnableCLS;
    }

    /**
     * Set 是否开启日志CLS服务
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableCLS 是否开启日志CLS服务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableCLS(Boolean EnableCLS) {
        this.EnableCLS = EnableCLS;
    }

    /**
     * Get CLS日志查看地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CLSUrl CLS日志查看地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCLSUrl() {
        return this.CLSUrl;
    }

    /**
     * Set CLS日志查看地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param CLSUrl CLS日志查看地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCLSUrl(String CLSUrl) {
        this.CLSUrl = CLSUrl;
    }

    /**
     * Get 工作流提示输入
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowInput 工作流提示输入
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlowInput() {
        return this.FlowInput;
    }

    /**
     * Set 工作流提示输入
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowInput 工作流提示输入
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowInput(String FlowInput) {
        this.FlowInput = FlowInput;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeFlowServiceDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFlowServiceDetailResponse(DescribeFlowServiceDetailResponse source) {
        if (source.FlowServiceName != null) {
            this.FlowServiceName = new String(source.FlowServiceName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Definition != null) {
            this.Definition = new String(source.Definition);
        }
        if (source.RoleResource != null) {
            this.RoleResource = new String(source.RoleResource);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CreateDate != null) {
            this.CreateDate = new String(source.CreateDate);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.FlowServiceChineseName != null) {
            this.FlowServiceChineseName = new String(source.FlowServiceChineseName);
        }
        if (source.EnableCLS != null) {
            this.EnableCLS = new Boolean(source.EnableCLS);
        }
        if (source.CLSUrl != null) {
            this.CLSUrl = new String(source.CLSUrl);
        }
        if (source.FlowInput != null) {
            this.FlowInput = new String(source.FlowInput);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowServiceName", this.FlowServiceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "RoleResource", this.RoleResource);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CreateDate", this.CreateDate);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "FlowServiceChineseName", this.FlowServiceChineseName);
        this.setParamSimple(map, prefix + "EnableCLS", this.EnableCLS);
        this.setParamSimple(map, prefix + "CLSUrl", this.CLSUrl);
        this.setParamSimple(map, prefix + "FlowInput", this.FlowInput);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

