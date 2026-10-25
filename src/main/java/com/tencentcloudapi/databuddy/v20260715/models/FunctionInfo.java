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

public class FunctionInfo extends AbstractModel {

    /**
    * <p>函数名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 函数类型，取值如JAVA、SCALA、PYTHON、SQL等
    */
    @SerializedName("FunctionType")
    @Expose
    private String FunctionType;

    /**
    * 引擎类型，取值如SPARK、HIVE、PRESTO等
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * <p>类名</p>
    */
    @SerializedName("ClassName")
    @Expose
    private String ClassName;

    /**
    * <p>函数依赖的资源</p>
    */
    @SerializedName("Resources")
    @Expose
    private FunctionResource [] Resources;

    /**
    * <p>描述</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>属性</p>
    */
    @SerializedName("Properties")
    @Expose
    private KVPair [] Properties;

    /**
    * <p>审计信息</p>
    */
    @SerializedName("Audit")
    @Expose
    private Audit Audit;

    /**
    * <p>owner信息</p>
    */
    @SerializedName("MetaOwner")
    @Expose
    private MetaOwner MetaOwner;

    /**
    * <p>资产全局唯一ID</p>
    */
    @SerializedName("AssetGuid")
    @Expose
    private String AssetGuid;

    /**
    * <p>当前用户对该实体的权限信息</p>
    */
    @SerializedName("PermissionDetail")
    @Expose
    private PermissionDetail PermissionDetail;

    /**
    * <p>标签信息列表。注意：仅当请求中 FetchTags=true 时返回，默认不返回</p>
    */
    @SerializedName("Tags")
    @Expose
    private CommonTagInfo [] Tags;

    /**
     * Get <p>函数名</p> 
     * @return Name <p>函数名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>函数名</p>
     * @param Name <p>函数名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 函数类型，取值如JAVA、SCALA、PYTHON、SQL等 
     * @return FunctionType 函数类型，取值如JAVA、SCALA、PYTHON、SQL等
     */
    public String getFunctionType() {
        return this.FunctionType;
    }

    /**
     * Set 函数类型，取值如JAVA、SCALA、PYTHON、SQL等
     * @param FunctionType 函数类型，取值如JAVA、SCALA、PYTHON、SQL等
     */
    public void setFunctionType(String FunctionType) {
        this.FunctionType = FunctionType;
    }

    /**
     * Get 引擎类型，取值如SPARK、HIVE、PRESTO等 
     * @return EngineType 引擎类型，取值如SPARK、HIVE、PRESTO等
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set 引擎类型，取值如SPARK、HIVE、PRESTO等
     * @param EngineType 引擎类型，取值如SPARK、HIVE、PRESTO等
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get <p>类名</p> 
     * @return ClassName <p>类名</p>
     */
    public String getClassName() {
        return this.ClassName;
    }

    /**
     * Set <p>类名</p>
     * @param ClassName <p>类名</p>
     */
    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    /**
     * Get <p>函数依赖的资源</p> 
     * @return Resources <p>函数依赖的资源</p>
     */
    public FunctionResource [] getResources() {
        return this.Resources;
    }

    /**
     * Set <p>函数依赖的资源</p>
     * @param Resources <p>函数依赖的资源</p>
     */
    public void setResources(FunctionResource [] Resources) {
        this.Resources = Resources;
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
     * Get <p>属性</p> 
     * @return Properties <p>属性</p>
     */
    public KVPair [] getProperties() {
        return this.Properties;
    }

    /**
     * Set <p>属性</p>
     * @param Properties <p>属性</p>
     */
    public void setProperties(KVPair [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get <p>审计信息</p> 
     * @return Audit <p>审计信息</p>
     */
    public Audit getAudit() {
        return this.Audit;
    }

    /**
     * Set <p>审计信息</p>
     * @param Audit <p>审计信息</p>
     */
    public void setAudit(Audit Audit) {
        this.Audit = Audit;
    }

    /**
     * Get <p>owner信息</p> 
     * @return MetaOwner <p>owner信息</p>
     */
    public MetaOwner getMetaOwner() {
        return this.MetaOwner;
    }

    /**
     * Set <p>owner信息</p>
     * @param MetaOwner <p>owner信息</p>
     */
    public void setMetaOwner(MetaOwner MetaOwner) {
        this.MetaOwner = MetaOwner;
    }

    /**
     * Get <p>资产全局唯一ID</p> 
     * @return AssetGuid <p>资产全局唯一ID</p>
     */
    public String getAssetGuid() {
        return this.AssetGuid;
    }

    /**
     * Set <p>资产全局唯一ID</p>
     * @param AssetGuid <p>资产全局唯一ID</p>
     */
    public void setAssetGuid(String AssetGuid) {
        this.AssetGuid = AssetGuid;
    }

    /**
     * Get <p>当前用户对该实体的权限信息</p> 
     * @return PermissionDetail <p>当前用户对该实体的权限信息</p>
     */
    public PermissionDetail getPermissionDetail() {
        return this.PermissionDetail;
    }

    /**
     * Set <p>当前用户对该实体的权限信息</p>
     * @param PermissionDetail <p>当前用户对该实体的权限信息</p>
     */
    public void setPermissionDetail(PermissionDetail PermissionDetail) {
        this.PermissionDetail = PermissionDetail;
    }

    /**
     * Get <p>标签信息列表。注意：仅当请求中 FetchTags=true 时返回，默认不返回</p> 
     * @return Tags <p>标签信息列表。注意：仅当请求中 FetchTags=true 时返回，默认不返回</p>
     */
    public CommonTagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签信息列表。注意：仅当请求中 FetchTags=true 时返回，默认不返回</p>
     * @param Tags <p>标签信息列表。注意：仅当请求中 FetchTags=true 时返回，默认不返回</p>
     */
    public void setTags(CommonTagInfo [] Tags) {
        this.Tags = Tags;
    }

    public FunctionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FunctionInfo(FunctionInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.FunctionType != null) {
            this.FunctionType = new String(source.FunctionType);
        }
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
        if (source.ClassName != null) {
            this.ClassName = new String(source.ClassName);
        }
        if (source.Resources != null) {
            this.Resources = new FunctionResource[source.Resources.length];
            for (int i = 0; i < source.Resources.length; i++) {
                this.Resources[i] = new FunctionResource(source.Resources[i]);
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
        if (source.Audit != null) {
            this.Audit = new Audit(source.Audit);
        }
        if (source.MetaOwner != null) {
            this.MetaOwner = new MetaOwner(source.MetaOwner);
        }
        if (source.AssetGuid != null) {
            this.AssetGuid = new String(source.AssetGuid);
        }
        if (source.PermissionDetail != null) {
            this.PermissionDetail = new PermissionDetail(source.PermissionDetail);
        }
        if (source.Tags != null) {
            this.Tags = new CommonTagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new CommonTagInfo(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "FunctionType", this.FunctionType);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamSimple(map, prefix + "ClassName", this.ClassName);
        this.setParamArrayObj(map, prefix + "Resources.", this.Resources);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);
        this.setParamObj(map, prefix + "Audit.", this.Audit);
        this.setParamObj(map, prefix + "MetaOwner.", this.MetaOwner);
        this.setParamSimple(map, prefix + "AssetGuid", this.AssetGuid);
        this.setParamObj(map, prefix + "PermissionDetail.", this.PermissionDetail);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

