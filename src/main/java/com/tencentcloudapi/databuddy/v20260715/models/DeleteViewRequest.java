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

public class DeleteViewRequest extends AbstractModel {

    /**
    * 数据目录名
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * 数据库名
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * View名称
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * 调用时所在workspace唯一id
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
     * Get 数据目录名 
     * @return CatalogName 数据目录名
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set 数据目录名
     * @param CatalogName 数据目录名
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get 数据库名 
     * @return SchemaName 数据库名
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set 数据库名
     * @param SchemaName 数据库名
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get View名称 
     * @return ViewName View名称
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set View名称
     * @param ViewName View名称
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get 调用时所在workspace唯一id 
     * @return WorkspaceId 调用时所在workspace唯一id
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 调用时所在workspace唯一id
     * @param WorkspaceId 调用时所在workspace唯一id
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    public DeleteViewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteViewRequest(DeleteViewRequest source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);

    }
}

