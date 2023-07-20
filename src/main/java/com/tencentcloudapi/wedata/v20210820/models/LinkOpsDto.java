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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LinkOpsDto extends AbstractModel{

    /**
    * 边的id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 边的key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LinkKey")
    @Expose
    private String LinkKey;

    /**
    * 边的源节点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskFrom")
    @Expose
    private String TaskFrom;

    /**
    * 边的目标节点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTo")
    @Expose
    private String TaskTo;

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
    private String Offset;

    /**
    * 边的类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LinkType")
    @Expose
    private String LinkType;

    /**
    * 工作流id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
     * Get 边的id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 边的id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 边的id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 边的id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 边的key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LinkKey 边的key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLinkKey() {
        return this.LinkKey;
    }

    /**
     * Set 边的key
注意：此字段可能返回 null，表示取不到有效值。
     * @param LinkKey 边的key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLinkKey(String LinkKey) {
        this.LinkKey = LinkKey;
    }

    /**
     * Get 边的源节点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskFrom 边的源节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskFrom() {
        return this.TaskFrom;
    }

    /**
     * Set 边的源节点
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskFrom 边的源节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskFrom(String TaskFrom) {
        this.TaskFrom = TaskFrom;
    }

    /**
     * Get 边的目标节点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTo 边的目标节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskTo() {
        return this.TaskTo;
    }

    /**
     * Set 边的目标节点
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTo 边的目标节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTo(String TaskTo) {
        this.TaskTo = TaskTo;
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
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set 父子任务之间依赖偏移量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Offset 父子任务之间依赖偏移量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 边的类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LinkType 边的类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLinkType() {
        return this.LinkType;
    }

    /**
     * Set 边的类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param LinkType 边的类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLinkType(String LinkType) {
        this.LinkType = LinkType;
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

    public LinkOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LinkOpsDto(LinkOpsDto source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.LinkKey != null) {
            this.LinkKey = new String(source.LinkKey);
        }
        if (source.TaskFrom != null) {
            this.TaskFrom = new String(source.TaskFrom);
        }
        if (source.TaskTo != null) {
            this.TaskTo = new String(source.TaskTo);
        }
        if (source.InCharge != null) {
            this.InCharge = new String(source.InCharge);
        }
        if (source.LinkDependencyType != null) {
            this.LinkDependencyType = new String(source.LinkDependencyType);
        }
        if (source.Offset != null) {
            this.Offset = new String(source.Offset);
        }
        if (source.LinkType != null) {
            this.LinkType = new String(source.LinkType);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "LinkKey", this.LinkKey);
        this.setParamSimple(map, prefix + "TaskFrom", this.TaskFrom);
        this.setParamSimple(map, prefix + "TaskTo", this.TaskTo);
        this.setParamSimple(map, prefix + "InCharge", this.InCharge);
        this.setParamSimple(map, prefix + "LinkDependencyType", this.LinkDependencyType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "LinkType", this.LinkType);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);

    }
}

