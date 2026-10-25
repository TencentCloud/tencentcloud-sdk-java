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

public class UpdateModelRequest extends AbstractModel {

    /**
    * 目录名称，必填
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * 模式名称，必填
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * 模型名称，必填
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 调用时所在workspace唯一id，必填
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * 新名称，可选，为空表示不修改名称
    */
    @SerializedName("NewName")
    @Expose
    private String NewName;

    /**
    * 新注释，可选，为空表示不修改注释
    */
    @SerializedName("NewComment")
    @Expose
    private String NewComment;

    /**
     * Get 目录名称，必填 
     * @return CatalogName 目录名称，必填
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set 目录名称，必填
     * @param CatalogName 目录名称，必填
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get 模式名称，必填 
     * @return SchemaName 模式名称，必填
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set 模式名称，必填
     * @param SchemaName 模式名称，必填
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get 模型名称，必填 
     * @return ModelName 模型名称，必填
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 模型名称，必填
     * @param ModelName 模型名称，必填
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get 调用时所在workspace唯一id，必填 
     * @return WorkspaceId 调用时所在workspace唯一id，必填
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 调用时所在workspace唯一id，必填
     * @param WorkspaceId 调用时所在workspace唯一id，必填
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get 新名称，可选，为空表示不修改名称 
     * @return NewName 新名称，可选，为空表示不修改名称
     */
    public String getNewName() {
        return this.NewName;
    }

    /**
     * Set 新名称，可选，为空表示不修改名称
     * @param NewName 新名称，可选，为空表示不修改名称
     */
    public void setNewName(String NewName) {
        this.NewName = NewName;
    }

    /**
     * Get 新注释，可选，为空表示不修改注释 
     * @return NewComment 新注释，可选，为空表示不修改注释
     */
    public String getNewComment() {
        return this.NewComment;
    }

    /**
     * Set 新注释，可选，为空表示不修改注释
     * @param NewComment 新注释，可选，为空表示不修改注释
     */
    public void setNewComment(String NewComment) {
        this.NewComment = NewComment;
    }

    public UpdateModelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateModelRequest(UpdateModelRequest source) {
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.NewName != null) {
            this.NewName = new String(source.NewName);
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
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "NewName", this.NewName);
        this.setParamSimple(map, prefix + "NewComment", this.NewComment);

    }
}

