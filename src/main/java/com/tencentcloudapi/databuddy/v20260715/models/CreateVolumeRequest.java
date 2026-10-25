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

public class CreateVolumeRequest extends AbstractModel {

    /**
    * catalog 信息
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * schema 信息
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * 数据卷名称
    */
    @SerializedName("VolumeName")
    @Expose
    private String VolumeName;

    /**
    * 调用时所在workspace唯一id
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * 描述信息
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 扩展参数
    */
    @SerializedName("Properties")
    @Expose
    private KVPair [] Properties;

    /**
    * 存储位置
    */
    @SerializedName("StorageLocation")
    @Expose
    private String StorageLocation;

    /**
    * 数据卷类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get catalog 信息 
     * @return CatalogName catalog 信息
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set catalog 信息
     * @param CatalogName catalog 信息
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get schema 信息 
     * @return SchemaName schema 信息
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set schema 信息
     * @param SchemaName schema 信息
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get 数据卷名称 
     * @return VolumeName 数据卷名称
     */
    public String getVolumeName() {
        return this.VolumeName;
    }

    /**
     * Set 数据卷名称
     * @param VolumeName 数据卷名称
     */
    public void setVolumeName(String VolumeName) {
        this.VolumeName = VolumeName;
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

    /**
     * Get 描述信息 
     * @return Comment 描述信息
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 描述信息
     * @param Comment 描述信息
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 扩展参数 
     * @return Properties 扩展参数
     */
    public KVPair [] getProperties() {
        return this.Properties;
    }

    /**
     * Set 扩展参数
     * @param Properties 扩展参数
     */
    public void setProperties(KVPair [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get 存储位置 
     * @return StorageLocation 存储位置
     */
    public String getStorageLocation() {
        return this.StorageLocation;
    }

    /**
     * Set 存储位置
     * @param StorageLocation 存储位置
     */
    public void setStorageLocation(String StorageLocation) {
        this.StorageLocation = StorageLocation;
    }

    /**
     * Get 数据卷类型 
     * @return Type 数据卷类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 数据卷类型
     * @param Type 数据卷类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public CreateVolumeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVolumeRequest(CreateVolumeRequest source) {
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.VolumeName != null) {
            this.VolumeName = new String(source.VolumeName);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Properties != null) {
            this.Properties = new KVPair[source.Properties.length];
            for (int i = 0; i < source.Properties.length; i++) {
                this.Properties[i] = new KVPair(source.Properties[i]);
            }
        }
        if (source.StorageLocation != null) {
            this.StorageLocation = new String(source.StorageLocation);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "VolumeName", this.VolumeName);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);
        this.setParamSimple(map, prefix + "StorageLocation", this.StorageLocation);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

