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

public class UpdateFunctionRequest extends AbstractModel {

    /**
    * 数据目录名称，必填
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * schema名称，必填
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * 函数名称，必填
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 调用时所在workspace唯一id，必填
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

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
     * Get schema名称，必填 
     * @return SchemaName schema名称，必填
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set schema名称，必填
     * @param SchemaName schema名称，必填
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get 函数名称，必填 
     * @return FunctionName 函数名称，必填
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set 函数名称，必填
     * @param FunctionName 函数名称，必填
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
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

    public UpdateFunctionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateFunctionRequest(UpdateFunctionRequest source) {
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
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
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "NewComment", this.NewComment);

    }
}

