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

public class TaskLinkDsDTO extends AbstractModel {

    /**
    * TaskTo信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTo")
    @Expose
    private String TaskTo;

    /**
    * TaskFrom信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskFrom")
    @Expose
    private String TaskFrom;

    /**
    * LinkType信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LinkType")
    @Expose
    private String LinkType;

    /**
    * key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LinkKey")
    @Expose
    private String LinkKey;

    /**
    * LinkId信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 责任人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
    * 父子任务之间的依赖关系
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LinkDependencyType")
    @Expose
    private String LinkDependencyType;

    /**
    * 父子任务之间依赖偏移量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 工作流id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 实体任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealFromTaskId")
    @Expose
    private String RealFromTaskId;

    /**
    * 实体任务名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealFromTaskName")
    @Expose
    private String RealFromTaskName;

    /**
    * 实体任务所属工作流
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealFromWorkflowId")
    @Expose
    private String RealFromWorkflowId;

    /**
    * 实体任务所属工作流名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealFromWorkflowName")
    @Expose
    private String RealFromWorkflowName;

    /**
    * 实体任务所属项目id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealProjectId")
    @Expose
    private String RealProjectId;

    /**
    * 实体任务所属项目标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealProjectIdent")
    @Expose
    private String RealProjectIdent;

    /**
    * 实体任务所属项目名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealProjectName")
    @Expose
    private String RealProjectName;

    /**
     * Get TaskTo信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTo TaskTo信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskTo() {
        return this.TaskTo;
    }

    /**
     * Set TaskTo信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTo TaskTo信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTo(String TaskTo) {
        this.TaskTo = TaskTo;
    }

    /**
     * Get TaskFrom信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskFrom TaskFrom信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskFrom() {
        return this.TaskFrom;
    }

    /**
     * Set TaskFrom信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskFrom TaskFrom信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskFrom(String TaskFrom) {
        this.TaskFrom = TaskFrom;
    }

    /**
     * Get LinkType信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LinkType LinkType信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLinkType() {
        return this.LinkType;
    }

    /**
     * Set LinkType信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param LinkType LinkType信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLinkType(String LinkType) {
        this.LinkType = LinkType;
    }

    /**
     * Get key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LinkKey key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLinkKey() {
        return this.LinkKey;
    }

    /**
     * Set key
注意：此字段可能返回 null，表示取不到有效值。
     * @param LinkKey key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLinkKey(String LinkKey) {
        this.LinkKey = LinkKey;
    }

    /**
     * Get LinkId信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id LinkId信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set LinkId信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id LinkId信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
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
     * Get 父子任务之间的依赖关系
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LinkDependencyType 父子任务之间的依赖关系
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLinkDependencyType() {
        return this.LinkDependencyType;
    }

    /**
     * Set 父子任务之间的依赖关系
注意：此字段可能返回 null，表示取不到有效值。
     * @param LinkDependencyType 父子任务之间的依赖关系
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLinkDependencyType(String LinkDependencyType) {
        this.LinkDependencyType = LinkDependencyType;
    }

    /**
     * Get 父子任务之间依赖偏移量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Offset 父子任务之间依赖偏移量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 父子任务之间依赖偏移量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Offset 父子任务之间依赖偏移量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
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
     * Get 实体任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealFromTaskId 实体任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRealFromTaskId() {
        return this.RealFromTaskId;
    }

    /**
     * Set 实体任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealFromTaskId 实体任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealFromTaskId(String RealFromTaskId) {
        this.RealFromTaskId = RealFromTaskId;
    }

    /**
     * Get 实体任务名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealFromTaskName 实体任务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRealFromTaskName() {
        return this.RealFromTaskName;
    }

    /**
     * Set 实体任务名
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealFromTaskName 实体任务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealFromTaskName(String RealFromTaskName) {
        this.RealFromTaskName = RealFromTaskName;
    }

    /**
     * Get 实体任务所属工作流
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealFromWorkflowId 实体任务所属工作流
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRealFromWorkflowId() {
        return this.RealFromWorkflowId;
    }

    /**
     * Set 实体任务所属工作流
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealFromWorkflowId 实体任务所属工作流
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealFromWorkflowId(String RealFromWorkflowId) {
        this.RealFromWorkflowId = RealFromWorkflowId;
    }

    /**
     * Get 实体任务所属工作流名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealFromWorkflowName 实体任务所属工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRealFromWorkflowName() {
        return this.RealFromWorkflowName;
    }

    /**
     * Set 实体任务所属工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealFromWorkflowName 实体任务所属工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealFromWorkflowName(String RealFromWorkflowName) {
        this.RealFromWorkflowName = RealFromWorkflowName;
    }

    /**
     * Get 实体任务所属项目id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealProjectId 实体任务所属项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRealProjectId() {
        return this.RealProjectId;
    }

    /**
     * Set 实体任务所属项目id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealProjectId 实体任务所属项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealProjectId(String RealProjectId) {
        this.RealProjectId = RealProjectId;
    }

    /**
     * Get 实体任务所属项目标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealProjectIdent 实体任务所属项目标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRealProjectIdent() {
        return this.RealProjectIdent;
    }

    /**
     * Set 实体任务所属项目标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealProjectIdent 实体任务所属项目标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealProjectIdent(String RealProjectIdent) {
        this.RealProjectIdent = RealProjectIdent;
    }

    /**
     * Get 实体任务所属项目名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealProjectName 实体任务所属项目名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRealProjectName() {
        return this.RealProjectName;
    }

    /**
     * Set 实体任务所属项目名
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealProjectName 实体任务所属项目名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealProjectName(String RealProjectName) {
        this.RealProjectName = RealProjectName;
    }

    public TaskLinkDsDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskLinkDsDTO(TaskLinkDsDTO source) {
        if (source.TaskTo != null) {
            this.TaskTo = new String(source.TaskTo);
        }
        if (source.TaskFrom != null) {
            this.TaskFrom = new String(source.TaskFrom);
        }
        if (source.LinkType != null) {
            this.LinkType = new String(source.LinkType);
        }
        if (source.LinkKey != null) {
            this.LinkKey = new String(source.LinkKey);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.InCharge != null) {
            this.InCharge = new String(source.InCharge);
        }
        if (source.LinkDependencyType != null) {
            this.LinkDependencyType = new String(source.LinkDependencyType);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.RealFromTaskId != null) {
            this.RealFromTaskId = new String(source.RealFromTaskId);
        }
        if (source.RealFromTaskName != null) {
            this.RealFromTaskName = new String(source.RealFromTaskName);
        }
        if (source.RealFromWorkflowId != null) {
            this.RealFromWorkflowId = new String(source.RealFromWorkflowId);
        }
        if (source.RealFromWorkflowName != null) {
            this.RealFromWorkflowName = new String(source.RealFromWorkflowName);
        }
        if (source.RealProjectId != null) {
            this.RealProjectId = new String(source.RealProjectId);
        }
        if (source.RealProjectIdent != null) {
            this.RealProjectIdent = new String(source.RealProjectIdent);
        }
        if (source.RealProjectName != null) {
            this.RealProjectName = new String(source.RealProjectName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskTo", this.TaskTo);
        this.setParamSimple(map, prefix + "TaskFrom", this.TaskFrom);
        this.setParamSimple(map, prefix + "LinkType", this.LinkType);
        this.setParamSimple(map, prefix + "LinkKey", this.LinkKey);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "InCharge", this.InCharge);
        this.setParamSimple(map, prefix + "LinkDependencyType", this.LinkDependencyType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "RealFromTaskId", this.RealFromTaskId);
        this.setParamSimple(map, prefix + "RealFromTaskName", this.RealFromTaskName);
        this.setParamSimple(map, prefix + "RealFromWorkflowId", this.RealFromWorkflowId);
        this.setParamSimple(map, prefix + "RealFromWorkflowName", this.RealFromWorkflowName);
        this.setParamSimple(map, prefix + "RealProjectId", this.RealProjectId);
        this.setParamSimple(map, prefix + "RealProjectIdent", this.RealProjectIdent);
        this.setParamSimple(map, prefix + "RealProjectName", this.RealProjectName);

    }
}

