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

public class ModelVersionInfo extends AbstractModel {

    /**
    * 版本号
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 模型版本uri
    */
    @SerializedName("Uri")
    @Expose
    private String Uri;

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
    * 别名
    */
    @SerializedName("Aliases")
    @Expose
    private String [] Aliases;

    /**
    * 审计信息
    */
    @SerializedName("Audit")
    @Expose
    private Audit Audit;

    /**
    * Catalog Name
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * Schema Name
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * Model Name
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 标签列表
    */
    @SerializedName("Tags")
    @Expose
    private AssetTagVote [] Tags;

    /**
    * 资产全局唯一ID
    */
    @SerializedName("AssetGuid")
    @Expose
    private String AssetGuid;

    /**
     * Get 版本号 
     * @return Version 版本号
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 版本号
     * @param Version 版本号
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 模型版本uri 
     * @return Uri 模型版本uri
     */
    public String getUri() {
        return this.Uri;
    }

    /**
     * Set 模型版本uri
     * @param Uri 模型版本uri
     */
    public void setUri(String Uri) {
        this.Uri = Uri;
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
     * Get 别名 
     * @return Aliases 别名
     */
    public String [] getAliases() {
        return this.Aliases;
    }

    /**
     * Set 别名
     * @param Aliases 别名
     */
    public void setAliases(String [] Aliases) {
        this.Aliases = Aliases;
    }

    /**
     * Get 审计信息 
     * @return Audit 审计信息
     */
    public Audit getAudit() {
        return this.Audit;
    }

    /**
     * Set 审计信息
     * @param Audit 审计信息
     */
    public void setAudit(Audit Audit) {
        this.Audit = Audit;
    }

    /**
     * Get Catalog Name 
     * @return CatalogName Catalog Name
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set Catalog Name
     * @param CatalogName Catalog Name
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get Schema Name 
     * @return SchemaName Schema Name
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set Schema Name
     * @param SchemaName Schema Name
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get Model Name 
     * @return ModelName Model Name
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set Model Name
     * @param ModelName Model Name
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get 标签列表 
     * @return Tags 标签列表
     */
    public AssetTagVote [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签列表
     * @param Tags 标签列表
     */
    public void setTags(AssetTagVote [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 资产全局唯一ID 
     * @return AssetGuid 资产全局唯一ID
     */
    public String getAssetGuid() {
        return this.AssetGuid;
    }

    /**
     * Set 资产全局唯一ID
     * @param AssetGuid 资产全局唯一ID
     */
    public void setAssetGuid(String AssetGuid) {
        this.AssetGuid = AssetGuid;
    }

    public ModelVersionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelVersionInfo(ModelVersionInfo source) {
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Uri != null) {
            this.Uri = new String(source.Uri);
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
        if (source.Aliases != null) {
            this.Aliases = new String[source.Aliases.length];
            for (int i = 0; i < source.Aliases.length; i++) {
                this.Aliases[i] = new String(source.Aliases[i]);
            }
        }
        if (source.Audit != null) {
            this.Audit = new Audit(source.Audit);
        }
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.Tags != null) {
            this.Tags = new AssetTagVote[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new AssetTagVote(source.Tags[i]);
            }
        }
        if (source.AssetGuid != null) {
            this.AssetGuid = new String(source.AssetGuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Uri", this.Uri);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);
        this.setParamArraySimple(map, prefix + "Aliases.", this.Aliases);
        this.setParamObj(map, prefix + "Audit.", this.Audit);
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AssetGuid", this.AssetGuid);

    }
}

