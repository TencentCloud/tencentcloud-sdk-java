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

public class CreateModelVersionRequest extends AbstractModel {

    /**
    * <p>数据目录名称</p>
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * <p>schema名称</p>
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * <p>模型名称</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>地址</p>
    */
    @SerializedName("Uri")
    @Expose
    private String Uri;

    /**
    * <p>调用时所在workspace唯一id</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>别名列表</p>
    */
    @SerializedName("Aliases")
    @Expose
    private String [] Aliases;

    /**
    * <p>描述</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>扩展信息</p>
    */
    @SerializedName("Properties")
    @Expose
    private KVPair [] Properties;

    /**
     * Get <p>数据目录名称</p> 
     * @return CatalogName <p>数据目录名称</p>
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set <p>数据目录名称</p>
     * @param CatalogName <p>数据目录名称</p>
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get <p>schema名称</p> 
     * @return SchemaName <p>schema名称</p>
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set <p>schema名称</p>
     * @param SchemaName <p>schema名称</p>
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get <p>模型名称</p> 
     * @return ModelName <p>模型名称</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>模型名称</p>
     * @param ModelName <p>模型名称</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>地址</p> 
     * @return Uri <p>地址</p>
     */
    public String getUri() {
        return this.Uri;
    }

    /**
     * Set <p>地址</p>
     * @param Uri <p>地址</p>
     */
    public void setUri(String Uri) {
        this.Uri = Uri;
    }

    /**
     * Get <p>调用时所在workspace唯一id</p> 
     * @return WorkspaceId <p>调用时所在workspace唯一id</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>调用时所在workspace唯一id</p>
     * @param WorkspaceId <p>调用时所在workspace唯一id</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>别名列表</p> 
     * @return Aliases <p>别名列表</p>
     */
    public String [] getAliases() {
        return this.Aliases;
    }

    /**
     * Set <p>别名列表</p>
     * @param Aliases <p>别名列表</p>
     */
    public void setAliases(String [] Aliases) {
        this.Aliases = Aliases;
    }

    /**
     * Get <p>描述</p> 
     * @return Comment <p>描述</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>描述</p>
     * @param Comment <p>描述</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>扩展信息</p> 
     * @return Properties <p>扩展信息</p>
     */
    public KVPair [] getProperties() {
        return this.Properties;
    }

    /**
     * Set <p>扩展信息</p>
     * @param Properties <p>扩展信息</p>
     */
    public void setProperties(KVPair [] Properties) {
        this.Properties = Properties;
    }

    public CreateModelVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateModelVersionRequest(CreateModelVersionRequest source) {
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.Uri != null) {
            this.Uri = new String(source.Uri);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.Aliases != null) {
            this.Aliases = new String[source.Aliases.length];
            for (int i = 0; i < source.Aliases.length; i++) {
                this.Aliases[i] = new String(source.Aliases[i]);
            }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "Uri", this.Uri);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamArraySimple(map, prefix + "Aliases.", this.Aliases);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);

    }
}

