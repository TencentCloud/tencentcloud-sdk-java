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

public class RecycleTaskInfo extends AbstractModel {

    /**
    * 任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 工作流id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * 责任人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
    * 责任人用户id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InChargeId")
    @Expose
    private String InChargeId;

    /**
    * 项目id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 项目标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectIdent")
    @Expose
    private String ProjectIdent;

    /**
    * 项目名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 任务类型描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TypeDesc")
    @Expose
    private String TypeDesc;

    /**
    * 任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TypeId")
    @Expose
    private Long TypeId;

    /**
    * 回收站提示
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecycleTips")
    @Expose
    private String RecycleTips;

    /**
    * 操作人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecycleUser")
    @Expose
    private String RecycleUser;

    /**
    * 产品名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 主账户id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnId")
    @Expose
    private String OwnId;

    /**
    * 用户id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 租户id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * 更新者名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateUser")
    @Expose
    private String UpdateUser;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 更新者id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateUserId")
    @Expose
    private String UpdateUserId;

    /**
    * 扩展属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Properties")
    @Expose
    private ParamInfo [] Properties;

    /**
    * 是否为虚拟任务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirtualFlag")
    @Expose
    private Boolean VirtualFlag;

    /**
    * 虚拟任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirtualTaskId")
    @Expose
    private String VirtualTaskId;

    /**
    * 文件id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserFileId")
    @Expose
    private String UserFileId;

    /**
     * Get 任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 工作流id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowId 工作流id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流id
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowId 工作流id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

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
     * Get 责任人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InCharge 责任人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInCharge() {
        return this.InCharge;
    }

    /**
     * Set 责任人
注意：此字段可能返回 null，表示取不到有效值。
     * @param InCharge 责任人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInCharge(String InCharge) {
        this.InCharge = InCharge;
    }

    /**
     * Get 责任人用户id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InChargeId 责任人用户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInChargeId() {
        return this.InChargeId;
    }

    /**
     * Set 责任人用户id
注意：此字段可能返回 null，表示取不到有效值。
     * @param InChargeId 责任人用户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInChargeId(String InChargeId) {
        this.InChargeId = InChargeId;
    }

    /**
     * Get 项目id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 项目标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectIdent 项目标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectIdent() {
        return this.ProjectIdent;
    }

    /**
     * Set 项目标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectIdent 项目标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectIdent(String ProjectIdent) {
        this.ProjectIdent = ProjectIdent;
    }

    /**
     * Get 项目名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 任务类型描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TypeDesc 任务类型描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTypeDesc() {
        return this.TypeDesc;
    }

    /**
     * Set 任务类型描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param TypeDesc 任务类型描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTypeDesc(String TypeDesc) {
        this.TypeDesc = TypeDesc;
    }

    /**
     * Get 任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TypeId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTypeId() {
        return this.TypeId;
    }

    /**
     * Set 任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TypeId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTypeId(Long TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * Get 回收站提示
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecycleTips 回收站提示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecycleTips() {
        return this.RecycleTips;
    }

    /**
     * Set 回收站提示
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecycleTips 回收站提示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecycleTips(String RecycleTips) {
        this.RecycleTips = RecycleTips;
    }

    /**
     * Get 操作人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecycleUser 操作人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecycleUser() {
        return this.RecycleUser;
    }

    /**
     * Set 操作人
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecycleUser 操作人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecycleUser(String RecycleUser) {
        this.RecycleUser = RecycleUser;
    }

    /**
     * Get 产品名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductName 产品名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductName 产品名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 主账户id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnId 主账户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnId() {
        return this.OwnId;
    }

    /**
     * Set 主账户id
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnId 主账户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnId(String OwnId) {
        this.OwnId = OwnId;
    }

    /**
     * Get 用户id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId 用户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户id
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId 用户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 租户id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TenantId 租户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set 租户id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TenantId 租户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get 更新者名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateUser 更新者名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateUser() {
        return this.UpdateUser;
    }

    /**
     * Set 更新者名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateUser 更新者名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateUser(String UpdateUser) {
        this.UpdateUser = UpdateUser;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 更新者id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateUserId 更新者id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateUserId() {
        return this.UpdateUserId;
    }

    /**
     * Set 更新者id
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateUserId 更新者id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateUserId(String UpdateUserId) {
        this.UpdateUserId = UpdateUserId;
    }

    /**
     * Get 扩展属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Properties 扩展属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ParamInfo [] getProperties() {
        return this.Properties;
    }

    /**
     * Set 扩展属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param Properties 扩展属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProperties(ParamInfo [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get 是否为虚拟任务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirtualFlag 是否为虚拟任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getVirtualFlag() {
        return this.VirtualFlag;
    }

    /**
     * Set 是否为虚拟任务
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirtualFlag 是否为虚拟任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirtualFlag(Boolean VirtualFlag) {
        this.VirtualFlag = VirtualFlag;
    }

    /**
     * Get 虚拟任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirtualTaskId 虚拟任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVirtualTaskId() {
        return this.VirtualTaskId;
    }

    /**
     * Set 虚拟任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirtualTaskId 虚拟任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirtualTaskId(String VirtualTaskId) {
        this.VirtualTaskId = VirtualTaskId;
    }

    /**
     * Get 文件id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserFileId 文件id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserFileId() {
        return this.UserFileId;
    }

    /**
     * Set 文件id
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserFileId 文件id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserFileId(String UserFileId) {
        this.UserFileId = UserFileId;
    }

    public RecycleTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecycleTaskInfo(RecycleTaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.InCharge != null) {
            this.InCharge = new String(source.InCharge);
        }
        if (source.InChargeId != null) {
            this.InChargeId = new String(source.InChargeId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectIdent != null) {
            this.ProjectIdent = new String(source.ProjectIdent);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.TypeDesc != null) {
            this.TypeDesc = new String(source.TypeDesc);
        }
        if (source.TypeId != null) {
            this.TypeId = new Long(source.TypeId);
        }
        if (source.RecycleTips != null) {
            this.RecycleTips = new String(source.RecycleTips);
        }
        if (source.RecycleUser != null) {
            this.RecycleUser = new String(source.RecycleUser);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.OwnId != null) {
            this.OwnId = new String(source.OwnId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.UpdateUser != null) {
            this.UpdateUser = new String(source.UpdateUser);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.UpdateUserId != null) {
            this.UpdateUserId = new String(source.UpdateUserId);
        }
        if (source.Properties != null) {
            this.Properties = new ParamInfo[source.Properties.length];
            for (int i = 0; i < source.Properties.length; i++) {
                this.Properties[i] = new ParamInfo(source.Properties[i]);
            }
        }
        if (source.VirtualFlag != null) {
            this.VirtualFlag = new Boolean(source.VirtualFlag);
        }
        if (source.VirtualTaskId != null) {
            this.VirtualTaskId = new String(source.VirtualTaskId);
        }
        if (source.UserFileId != null) {
            this.UserFileId = new String(source.UserFileId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "InCharge", this.InCharge);
        this.setParamSimple(map, prefix + "InChargeId", this.InChargeId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectIdent", this.ProjectIdent);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "TypeDesc", this.TypeDesc);
        this.setParamSimple(map, prefix + "TypeId", this.TypeId);
        this.setParamSimple(map, prefix + "RecycleTips", this.RecycleTips);
        this.setParamSimple(map, prefix + "RecycleUser", this.RecycleUser);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "OwnId", this.OwnId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "UpdateUser", this.UpdateUser);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "UpdateUserId", this.UpdateUserId);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);
        this.setParamSimple(map, prefix + "VirtualFlag", this.VirtualFlag);
        this.setParamSimple(map, prefix + "VirtualTaskId", this.VirtualTaskId);
        this.setParamSimple(map, prefix + "UserFileId", this.UserFileId);

    }
}

