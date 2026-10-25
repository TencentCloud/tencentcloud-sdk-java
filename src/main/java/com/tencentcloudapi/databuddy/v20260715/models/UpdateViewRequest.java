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

public class UpdateViewRequest extends AbstractModel {

    /**
    * 数据目录名称，必填
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * 数据库名称，必填
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * View名，必填
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

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
    * 新描述，可选，为空表示不修改注释
    */
    @SerializedName("NewComment")
    @Expose
    private String NewComment;

    /**
     * Get 数据目录名称，必填 
     * @return CatalogName 数据目录名称，必填
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set 数据目录名称，必填
     * @param CatalogName 数据目录名称，必填
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get 数据库名称，必填 
     * @return SchemaName 数据库名称，必填
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set 数据库名称，必填
     * @param SchemaName 数据库名称，必填
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get View名，必填 
     * @return ViewName View名，必填
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set View名，必填
     * @param ViewName View名，必填
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
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
     * Get 新描述，可选，为空表示不修改注释 
     * @return NewComment 新描述，可选，为空表示不修改注释
     */
    public String getNewComment() {
        return this.NewComment;
    }

    /**
     * Set 新描述，可选，为空表示不修改注释
     * @param NewComment 新描述，可选，为空表示不修改注释
     */
    public void setNewComment(String NewComment) {
        this.NewComment = NewComment;
    }

    public UpdateViewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateViewRequest(UpdateViewRequest source) {
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.ViewName != null) {
            this.ViewName = new String(source.ViewName);
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
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "NewName", this.NewName);
        this.setParamSimple(map, prefix + "NewComment", this.NewComment);

    }
}

