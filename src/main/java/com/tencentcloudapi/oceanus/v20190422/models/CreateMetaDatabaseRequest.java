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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMetaDatabaseRequest extends AbstractModel {

    /**
    * 无
    */
    @SerializedName("CatalogId")
    @Expose
    private Long CatalogId;

    /**
    * 库名
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 备注
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 工作空间 SerialId
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
     * Get 无 
     * @return CatalogId 无
     */
    public Long getCatalogId() {
        return this.CatalogId;
    }

    /**
     * Set 无
     * @param CatalogId 无
     */
    public void setCatalogId(Long CatalogId) {
        this.CatalogId = CatalogId;
    }

    /**
     * Get 库名 
     * @return DatabaseName 库名
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 库名
     * @param DatabaseName 库名
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 备注 
     * @return Comment 备注
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 备注
     * @param Comment 备注
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 工作空间 SerialId 
     * @return WorkSpaceId 工作空间 SerialId
     */
    public String getWorkSpaceId() {
        return this.WorkSpaceId;
    }

    /**
     * Set 工作空间 SerialId
     * @param WorkSpaceId 工作空间 SerialId
     */
    public void setWorkSpaceId(String WorkSpaceId) {
        this.WorkSpaceId = WorkSpaceId;
    }

    public CreateMetaDatabaseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMetaDatabaseRequest(CreateMetaDatabaseRequest source) {
        if (source.CatalogId != null) {
            this.CatalogId = new Long(source.CatalogId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.WorkSpaceId != null) {
            this.WorkSpaceId = new String(source.WorkSpaceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CatalogId", this.CatalogId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "WorkSpaceId", this.WorkSpaceId);

    }
}

