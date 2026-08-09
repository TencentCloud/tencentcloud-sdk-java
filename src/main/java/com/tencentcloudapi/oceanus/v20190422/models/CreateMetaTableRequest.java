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

public class CreateMetaTableRequest extends AbstractModel {

    /**
    * <p>Catalog Id</p>
    */
    @SerializedName("CatalogId")
    @Expose
    private Long CatalogId;

    /**
    * <p>库Id</p>
    */
    @SerializedName("DatabaseId")
    @Expose
    private Long DatabaseId;

    /**
    * <p>建表语句</p><p>参数格式：需要base64加密</p>
    */
    @SerializedName("SqlCode")
    @Expose
    private String SqlCode;

    /**
    * <p>备注</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>集群id</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>引用资源</p>
    */
    @SerializedName("ResourceRefs")
    @Expose
    private ResourceRef [] ResourceRefs;

    /**
    * <p>Flink版本</p>
    */
    @SerializedName("FlinkVersion")
    @Expose
    private String FlinkVersion;

    /**
    * <p>工作空间 SerialId</p>
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
    * <p>异步id</p>
    */
    @SerializedName("AsyncTaskId")
    @Expose
    private String AsyncTaskId;

    /**
     * Get <p>Catalog Id</p> 
     * @return CatalogId <p>Catalog Id</p>
     */
    public Long getCatalogId() {
        return this.CatalogId;
    }

    /**
     * Set <p>Catalog Id</p>
     * @param CatalogId <p>Catalog Id</p>
     */
    public void setCatalogId(Long CatalogId) {
        this.CatalogId = CatalogId;
    }

    /**
     * Get <p>库Id</p> 
     * @return DatabaseId <p>库Id</p>
     */
    public Long getDatabaseId() {
        return this.DatabaseId;
    }

    /**
     * Set <p>库Id</p>
     * @param DatabaseId <p>库Id</p>
     */
    public void setDatabaseId(Long DatabaseId) {
        this.DatabaseId = DatabaseId;
    }

    /**
     * Get <p>建表语句</p><p>参数格式：需要base64加密</p> 
     * @return SqlCode <p>建表语句</p><p>参数格式：需要base64加密</p>
     */
    public String getSqlCode() {
        return this.SqlCode;
    }

    /**
     * Set <p>建表语句</p><p>参数格式：需要base64加密</p>
     * @param SqlCode <p>建表语句</p><p>参数格式：需要base64加密</p>
     */
    public void setSqlCode(String SqlCode) {
        this.SqlCode = SqlCode;
    }

    /**
     * Get <p>备注</p> 
     * @return Comment <p>备注</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>备注</p>
     * @param Comment <p>备注</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>集群id</p> 
     * @return ClusterId <p>集群id</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群id</p>
     * @param ClusterId <p>集群id</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>引用资源</p> 
     * @return ResourceRefs <p>引用资源</p>
     */
    public ResourceRef [] getResourceRefs() {
        return this.ResourceRefs;
    }

    /**
     * Set <p>引用资源</p>
     * @param ResourceRefs <p>引用资源</p>
     */
    public void setResourceRefs(ResourceRef [] ResourceRefs) {
        this.ResourceRefs = ResourceRefs;
    }

    /**
     * Get <p>Flink版本</p> 
     * @return FlinkVersion <p>Flink版本</p>
     */
    public String getFlinkVersion() {
        return this.FlinkVersion;
    }

    /**
     * Set <p>Flink版本</p>
     * @param FlinkVersion <p>Flink版本</p>
     */
    public void setFlinkVersion(String FlinkVersion) {
        this.FlinkVersion = FlinkVersion;
    }

    /**
     * Get <p>工作空间 SerialId</p> 
     * @return WorkSpaceId <p>工作空间 SerialId</p>
     */
    public String getWorkSpaceId() {
        return this.WorkSpaceId;
    }

    /**
     * Set <p>工作空间 SerialId</p>
     * @param WorkSpaceId <p>工作空间 SerialId</p>
     */
    public void setWorkSpaceId(String WorkSpaceId) {
        this.WorkSpaceId = WorkSpaceId;
    }

    /**
     * Get <p>异步id</p> 
     * @return AsyncTaskId <p>异步id</p>
     */
    public String getAsyncTaskId() {
        return this.AsyncTaskId;
    }

    /**
     * Set <p>异步id</p>
     * @param AsyncTaskId <p>异步id</p>
     */
    public void setAsyncTaskId(String AsyncTaskId) {
        this.AsyncTaskId = AsyncTaskId;
    }

    public CreateMetaTableRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMetaTableRequest(CreateMetaTableRequest source) {
        if (source.CatalogId != null) {
            this.CatalogId = new Long(source.CatalogId);
        }
        if (source.DatabaseId != null) {
            this.DatabaseId = new Long(source.DatabaseId);
        }
        if (source.SqlCode != null) {
            this.SqlCode = new String(source.SqlCode);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ResourceRefs != null) {
            this.ResourceRefs = new ResourceRef[source.ResourceRefs.length];
            for (int i = 0; i < source.ResourceRefs.length; i++) {
                this.ResourceRefs[i] = new ResourceRef(source.ResourceRefs[i]);
            }
        }
        if (source.FlinkVersion != null) {
            this.FlinkVersion = new String(source.FlinkVersion);
        }
        if (source.WorkSpaceId != null) {
            this.WorkSpaceId = new String(source.WorkSpaceId);
        }
        if (source.AsyncTaskId != null) {
            this.AsyncTaskId = new String(source.AsyncTaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CatalogId", this.CatalogId);
        this.setParamSimple(map, prefix + "DatabaseId", this.DatabaseId);
        this.setParamSimple(map, prefix + "SqlCode", this.SqlCode);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "ResourceRefs.", this.ResourceRefs);
        this.setParamSimple(map, prefix + "FlinkVersion", this.FlinkVersion);
        this.setParamSimple(map, prefix + "WorkSpaceId", this.WorkSpaceId);
        this.setParamSimple(map, prefix + "AsyncTaskId", this.AsyncTaskId);

    }
}

