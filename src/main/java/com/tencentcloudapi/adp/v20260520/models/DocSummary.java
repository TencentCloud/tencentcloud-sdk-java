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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DocSummary extends AbstractModel {

    /**
    * <p>所属分类路径（包含分类 ID、从根节点开始的分类 ID 路径和分类名称路径）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CategoryPath")
    @Expose
    private CategoryPath CategoryPath;

    /**
    * <p>文档 ID</p>
    */
    @SerializedName("DocId")
    @Expose
    private String DocId;

    /**
    * <p>知识生效范围（聚合生效作用域 + 标签条件）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KnowledgeScope")
    @Expose
    private KnowledgeScope KnowledgeScope;

    /**
    * <p>生命周期信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Lifecycle")
    @Expose
    private DocLifecycle Lifecycle;

    /**
    * <p>元信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Metadata")
    @Expose
    private DocMetadata Metadata;

    /**
    * <p>操作者信息（聚合修改人 + 操作权限）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperatorInfo")
    @Expose
    private DocOperator OperatorInfo;

    /**
    * <p>任务状态信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskStatus")
    @Expose
    private DocTaskStatus TaskStatus;

    /**
     * Get <p>所属分类路径（包含分类 ID、从根节点开始的分类 ID 路径和分类名称路径）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CategoryPath <p>所属分类路径（包含分类 ID、从根节点开始的分类 ID 路径和分类名称路径）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CategoryPath getCategoryPath() {
        return this.CategoryPath;
    }

    /**
     * Set <p>所属分类路径（包含分类 ID、从根节点开始的分类 ID 路径和分类名称路径）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CategoryPath <p>所属分类路径（包含分类 ID、从根节点开始的分类 ID 路径和分类名称路径）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategoryPath(CategoryPath CategoryPath) {
        this.CategoryPath = CategoryPath;
    }

    /**
     * Get <p>文档 ID</p> 
     * @return DocId <p>文档 ID</p>
     */
    public String getDocId() {
        return this.DocId;
    }

    /**
     * Set <p>文档 ID</p>
     * @param DocId <p>文档 ID</p>
     */
    public void setDocId(String DocId) {
        this.DocId = DocId;
    }

    /**
     * Get <p>知识生效范围（聚合生效作用域 + 标签条件）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KnowledgeScope <p>知识生效范围（聚合生效作用域 + 标签条件）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KnowledgeScope getKnowledgeScope() {
        return this.KnowledgeScope;
    }

    /**
     * Set <p>知识生效范围（聚合生效作用域 + 标签条件）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KnowledgeScope <p>知识生效范围（聚合生效作用域 + 标签条件）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKnowledgeScope(KnowledgeScope KnowledgeScope) {
        this.KnowledgeScope = KnowledgeScope;
    }

    /**
     * Get <p>生命周期信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Lifecycle <p>生命周期信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DocLifecycle getLifecycle() {
        return this.Lifecycle;
    }

    /**
     * Set <p>生命周期信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Lifecycle <p>生命周期信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLifecycle(DocLifecycle Lifecycle) {
        this.Lifecycle = Lifecycle;
    }

    /**
     * Get <p>元信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Metadata <p>元信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DocMetadata getMetadata() {
        return this.Metadata;
    }

    /**
     * Set <p>元信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Metadata <p>元信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetadata(DocMetadata Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get <p>操作者信息（聚合修改人 + 操作权限）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperatorInfo <p>操作者信息（聚合修改人 + 操作权限）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DocOperator getOperatorInfo() {
        return this.OperatorInfo;
    }

    /**
     * Set <p>操作者信息（聚合修改人 + 操作权限）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperatorInfo <p>操作者信息（聚合修改人 + 操作权限）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperatorInfo(DocOperator OperatorInfo) {
        this.OperatorInfo = OperatorInfo;
    }

    /**
     * Get <p>任务状态信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskStatus <p>任务状态信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DocTaskStatus getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set <p>任务状态信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskStatus <p>任务状态信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskStatus(DocTaskStatus TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    public DocSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocSummary(DocSummary source) {
        if (source.CategoryPath != null) {
            this.CategoryPath = new CategoryPath(source.CategoryPath);
        }
        if (source.DocId != null) {
            this.DocId = new String(source.DocId);
        }
        if (source.KnowledgeScope != null) {
            this.KnowledgeScope = new KnowledgeScope(source.KnowledgeScope);
        }
        if (source.Lifecycle != null) {
            this.Lifecycle = new DocLifecycle(source.Lifecycle);
        }
        if (source.Metadata != null) {
            this.Metadata = new DocMetadata(source.Metadata);
        }
        if (source.OperatorInfo != null) {
            this.OperatorInfo = new DocOperator(source.OperatorInfo);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new DocTaskStatus(source.TaskStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CategoryPath.", this.CategoryPath);
        this.setParamSimple(map, prefix + "DocId", this.DocId);
        this.setParamObj(map, prefix + "KnowledgeScope.", this.KnowledgeScope);
        this.setParamObj(map, prefix + "Lifecycle.", this.Lifecycle);
        this.setParamObj(map, prefix + "Metadata.", this.Metadata);
        this.setParamObj(map, prefix + "OperatorInfo.", this.OperatorInfo);
        this.setParamObj(map, prefix + "TaskStatus.", this.TaskStatus);

    }
}

