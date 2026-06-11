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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowExtOpsDto extends AbstractModel {

    /**
    * <p>任务数量count</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskCount")
    @Expose
    private Long TaskCount;

    /**
    * <p>文件名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
    * <p>工作流id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkFlowId")
    @Expose
    private String WorkFlowId;

    /**
    * <p>责任人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * <p>责任人userId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerId")
    @Expose
    private String OwnerId;

    /**
    * <p>项目id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>项目标识</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectIdent")
    @Expose
    private String ProjectIdent;

    /**
    * <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * <p>工作流描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkFlowDesc")
    @Expose
    private String WorkFlowDesc;

    /**
    * <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkFlowName")
    @Expose
    private String WorkFlowName;

    /**
    * <p>工作流文件id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * <p>工作流状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>工作流创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>最近更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>最近更新人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyUser")
    @Expose
    private String ModifyUser;

    /**
    * <p>工作流类型，周期cycle，手动manual</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowType")
    @Expose
    private String WorkflowType;

    /**
    * <p>bundle客户端绑定唯一id</p>
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * <p>bundle客户端扩展信息，json格式</p>
    */
    @SerializedName("BundleInfo")
    @Expose
    private String BundleInfo;

    /**
    * <p>引用该手动工作流的嵌套工作流任务ID列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NestedBySpTaskIds")
    @Expose
    private String [] NestedBySpTaskIds;

    /**
     * Get <p>任务数量count</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskCount <p>任务数量count</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskCount() {
        return this.TaskCount;
    }

    /**
     * Set <p>任务数量count</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskCount <p>任务数量count</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskCount(Long TaskCount) {
        this.TaskCount = TaskCount;
    }

    /**
     * Get <p>文件名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderName <p>文件名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set <p>文件名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderName <p>文件名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
    }

    /**
     * Get <p>工作流id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkFlowId <p>工作流id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkFlowId() {
        return this.WorkFlowId;
    }

    /**
     * Set <p>工作流id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkFlowId <p>工作流id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkFlowId(String WorkFlowId) {
        this.WorkFlowId = WorkFlowId;
    }

    /**
     * Get <p>责任人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Owner <p>责任人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set <p>责任人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Owner <p>责任人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get <p>责任人userId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerId <p>责任人userId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerId() {
        return this.OwnerId;
    }

    /**
     * Set <p>责任人userId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerId <p>责任人userId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerId(String OwnerId) {
        this.OwnerId = OwnerId;
    }

    /**
     * Get <p>项目id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId <p>项目id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId <p>项目id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>项目标识</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectIdent <p>项目标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectIdent() {
        return this.ProjectIdent;
    }

    /**
     * Set <p>项目标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectIdent <p>项目标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectIdent(String ProjectIdent) {
        this.ProjectIdent = ProjectIdent;
    }

    /**
     * Get <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get <p>工作流描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkFlowDesc <p>工作流描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkFlowDesc() {
        return this.WorkFlowDesc;
    }

    /**
     * Set <p>工作流描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkFlowDesc <p>工作流描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkFlowDesc(String WorkFlowDesc) {
        this.WorkFlowDesc = WorkFlowDesc;
    }

    /**
     * Get <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkFlowName <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkFlowName() {
        return this.WorkFlowName;
    }

    /**
     * Set <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkFlowName <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkFlowName(String WorkFlowName) {
        this.WorkFlowName = WorkFlowName;
    }

    /**
     * Get <p>工作流文件id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderId <p>工作流文件id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set <p>工作流文件id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderId <p>工作流文件id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get <p>工作流状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>工作流状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>工作流状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>工作流状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>工作流创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>工作流创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>工作流创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>工作流创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>最近更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime <p>最近更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>最近更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime <p>最近更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>最近更新人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyUser <p>最近更新人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyUser() {
        return this.ModifyUser;
    }

    /**
     * Set <p>最近更新人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyUser <p>最近更新人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyUser(String ModifyUser) {
        this.ModifyUser = ModifyUser;
    }

    /**
     * Get <p>工作流类型，周期cycle，手动manual</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowType <p>工作流类型，周期cycle，手动manual</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowType() {
        return this.WorkflowType;
    }

    /**
     * Set <p>工作流类型，周期cycle，手动manual</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowType <p>工作流类型，周期cycle，手动manual</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowType(String WorkflowType) {
        this.WorkflowType = WorkflowType;
    }

    /**
     * Get <p>bundle客户端绑定唯一id</p> 
     * @return BundleId <p>bundle客户端绑定唯一id</p>
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set <p>bundle客户端绑定唯一id</p>
     * @param BundleId <p>bundle客户端绑定唯一id</p>
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get <p>bundle客户端扩展信息，json格式</p> 
     * @return BundleInfo <p>bundle客户端扩展信息，json格式</p>
     */
    public String getBundleInfo() {
        return this.BundleInfo;
    }

    /**
     * Set <p>bundle客户端扩展信息，json格式</p>
     * @param BundleInfo <p>bundle客户端扩展信息，json格式</p>
     */
    public void setBundleInfo(String BundleInfo) {
        this.BundleInfo = BundleInfo;
    }

    /**
     * Get <p>引用该手动工作流的嵌套工作流任务ID列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NestedBySpTaskIds <p>引用该手动工作流的嵌套工作流任务ID列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNestedBySpTaskIds() {
        return this.NestedBySpTaskIds;
    }

    /**
     * Set <p>引用该手动工作流的嵌套工作流任务ID列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NestedBySpTaskIds <p>引用该手动工作流的嵌套工作流任务ID列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNestedBySpTaskIds(String [] NestedBySpTaskIds) {
        this.NestedBySpTaskIds = NestedBySpTaskIds;
    }

    public WorkflowExtOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowExtOpsDto(WorkflowExtOpsDto source) {
        if (source.TaskCount != null) {
            this.TaskCount = new Long(source.TaskCount);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
        if (source.WorkFlowId != null) {
            this.WorkFlowId = new String(source.WorkFlowId);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.OwnerId != null) {
            this.OwnerId = new String(source.OwnerId);
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
        if (source.WorkFlowDesc != null) {
            this.WorkFlowDesc = new String(source.WorkFlowDesc);
        }
        if (source.WorkFlowName != null) {
            this.WorkFlowName = new String(source.WorkFlowName);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.ModifyUser != null) {
            this.ModifyUser = new String(source.ModifyUser);
        }
        if (source.WorkflowType != null) {
            this.WorkflowType = new String(source.WorkflowType);
        }
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.BundleInfo != null) {
            this.BundleInfo = new String(source.BundleInfo);
        }
        if (source.NestedBySpTaskIds != null) {
            this.NestedBySpTaskIds = new String[source.NestedBySpTaskIds.length];
            for (int i = 0; i < source.NestedBySpTaskIds.length; i++) {
                this.NestedBySpTaskIds[i] = new String(source.NestedBySpTaskIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskCount", this.TaskCount);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamSimple(map, prefix + "WorkFlowId", this.WorkFlowId);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "OwnerId", this.OwnerId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectIdent", this.ProjectIdent);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "WorkFlowDesc", this.WorkFlowDesc);
        this.setParamSimple(map, prefix + "WorkFlowName", this.WorkFlowName);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "ModifyUser", this.ModifyUser);
        this.setParamSimple(map, prefix + "WorkflowType", this.WorkflowType);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BundleInfo", this.BundleInfo);
        this.setParamArraySimple(map, prefix + "NestedBySpTaskIds.", this.NestedBySpTaskIds);

    }
}

