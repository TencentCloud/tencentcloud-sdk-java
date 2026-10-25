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

public class UpdateModelVersionRequest extends AbstractModel {

    /**
    * <p>目录名称，必填</p>
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * <p>模式名称，必填</p>
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * <p>模型名称，必填</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>模型版本号，必填</p>
    */
    @SerializedName("ModelVersion")
    @Expose
    private Long ModelVersion;

    /**
    * <p>调用时所在workspace唯一id，必填</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>要添加的别名，可选</p>
    */
    @SerializedName("AddedAliases")
    @Expose
    private String [] AddedAliases;

    /**
    * <p>要移除的别名，可选</p>
    */
    @SerializedName("RemovedAliases")
    @Expose
    private String [] RemovedAliases;

    /**
    * <p>新注释，可选，为空表示不修改注释</p>
    */
    @SerializedName("NewComment")
    @Expose
    private String NewComment;

    /**
     * Get <p>目录名称，必填</p> 
     * @return CatalogName <p>目录名称，必填</p>
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set <p>目录名称，必填</p>
     * @param CatalogName <p>目录名称，必填</p>
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get <p>模式名称，必填</p> 
     * @return SchemaName <p>模式名称，必填</p>
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set <p>模式名称，必填</p>
     * @param SchemaName <p>模式名称，必填</p>
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get <p>模型名称，必填</p> 
     * @return ModelName <p>模型名称，必填</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>模型名称，必填</p>
     * @param ModelName <p>模型名称，必填</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>模型版本号，必填</p> 
     * @return ModelVersion <p>模型版本号，必填</p>
     */
    public Long getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set <p>模型版本号，必填</p>
     * @param ModelVersion <p>模型版本号，必填</p>
     */
    public void setModelVersion(Long ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get <p>调用时所在workspace唯一id，必填</p> 
     * @return WorkspaceId <p>调用时所在workspace唯一id，必填</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>调用时所在workspace唯一id，必填</p>
     * @param WorkspaceId <p>调用时所在workspace唯一id，必填</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>要添加的别名，可选</p> 
     * @return AddedAliases <p>要添加的别名，可选</p>
     */
    public String [] getAddedAliases() {
        return this.AddedAliases;
    }

    /**
     * Set <p>要添加的别名，可选</p>
     * @param AddedAliases <p>要添加的别名，可选</p>
     */
    public void setAddedAliases(String [] AddedAliases) {
        this.AddedAliases = AddedAliases;
    }

    /**
     * Get <p>要移除的别名，可选</p> 
     * @return RemovedAliases <p>要移除的别名，可选</p>
     */
    public String [] getRemovedAliases() {
        return this.RemovedAliases;
    }

    /**
     * Set <p>要移除的别名，可选</p>
     * @param RemovedAliases <p>要移除的别名，可选</p>
     */
    public void setRemovedAliases(String [] RemovedAliases) {
        this.RemovedAliases = RemovedAliases;
    }

    /**
     * Get <p>新注释，可选，为空表示不修改注释</p> 
     * @return NewComment <p>新注释，可选，为空表示不修改注释</p>
     */
    public String getNewComment() {
        return this.NewComment;
    }

    /**
     * Set <p>新注释，可选，为空表示不修改注释</p>
     * @param NewComment <p>新注释，可选，为空表示不修改注释</p>
     */
    public void setNewComment(String NewComment) {
        this.NewComment = NewComment;
    }

    public UpdateModelVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateModelVersionRequest(UpdateModelVersionRequest source) {
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new Long(source.ModelVersion);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.AddedAliases != null) {
            this.AddedAliases = new String[source.AddedAliases.length];
            for (int i = 0; i < source.AddedAliases.length; i++) {
                this.AddedAliases[i] = new String(source.AddedAliases[i]);
            }
        }
        if (source.RemovedAliases != null) {
            this.RemovedAliases = new String[source.RemovedAliases.length];
            for (int i = 0; i < source.RemovedAliases.length; i++) {
                this.RemovedAliases[i] = new String(source.RemovedAliases[i]);
            }
        }
        if (source.NewComment != null) {
            this.NewComment = new String(source.NewComment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamArraySimple(map, prefix + "AddedAliases.", this.AddedAliases);
        this.setParamArraySimple(map, prefix + "RemovedAliases.", this.RemovedAliases);
        this.setParamSimple(map, prefix + "NewComment", this.NewComment);

    }
}

