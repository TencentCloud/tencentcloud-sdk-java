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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PublicApplication extends AbstractModel {

    /**
    * <p>应用ID。</p>
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * <p>名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>类型。</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>应用标记</p><p>枚举值：</p><ul><li>SUB_APP： 子应用</li><li>APP_COLLECTION： 合集</li><li>STANDALONE_APP： 独立应用</li></ul>
    */
    @SerializedName("AppGroupType")
    @Expose
    private String AppGroupType;

    /**
    * <p>Nextflow版本</p>
    */
    @SerializedName("NextflowVersion")
    @Expose
    private String [] NextflowVersion;

    /**
    * <p>应用分类</p>
    */
    @SerializedName("AppTags")
    @Expose
    private ToolRepoTag [] AppTags;

    /**
    * <p>应用标识</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
     * Get <p>应用ID。</p> 
     * @return ApplicationId <p>应用ID。</p>
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set <p>应用ID。</p>
     * @param ApplicationId <p>应用ID。</p>
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get <p>名称。</p> 
     * @return Name <p>名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名称。</p>
     * @param Name <p>名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>类型。</p> 
     * @return Type <p>类型。</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>类型。</p>
     * @param Type <p>类型。</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>应用标记</p><p>枚举值：</p><ul><li>SUB_APP： 子应用</li><li>APP_COLLECTION： 合集</li><li>STANDALONE_APP： 独立应用</li></ul> 
     * @return AppGroupType <p>应用标记</p><p>枚举值：</p><ul><li>SUB_APP： 子应用</li><li>APP_COLLECTION： 合集</li><li>STANDALONE_APP： 独立应用</li></ul>
     */
    public String getAppGroupType() {
        return this.AppGroupType;
    }

    /**
     * Set <p>应用标记</p><p>枚举值：</p><ul><li>SUB_APP： 子应用</li><li>APP_COLLECTION： 合集</li><li>STANDALONE_APP： 独立应用</li></ul>
     * @param AppGroupType <p>应用标记</p><p>枚举值：</p><ul><li>SUB_APP： 子应用</li><li>APP_COLLECTION： 合集</li><li>STANDALONE_APP： 独立应用</li></ul>
     */
    public void setAppGroupType(String AppGroupType) {
        this.AppGroupType = AppGroupType;
    }

    /**
     * Get <p>Nextflow版本</p> 
     * @return NextflowVersion <p>Nextflow版本</p>
     */
    public String [] getNextflowVersion() {
        return this.NextflowVersion;
    }

    /**
     * Set <p>Nextflow版本</p>
     * @param NextflowVersion <p>Nextflow版本</p>
     */
    public void setNextflowVersion(String [] NextflowVersion) {
        this.NextflowVersion = NextflowVersion;
    }

    /**
     * Get <p>应用分类</p> 
     * @return AppTags <p>应用分类</p>
     */
    public ToolRepoTag [] getAppTags() {
        return this.AppTags;
    }

    /**
     * Set <p>应用分类</p>
     * @param AppTags <p>应用分类</p>
     */
    public void setAppTags(ToolRepoTag [] AppTags) {
        this.AppTags = AppTags;
    }

    /**
     * Get <p>应用标识</p> 
     * @return AppId <p>应用标识</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用标识</p>
     * @param AppId <p>应用标识</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    public PublicApplication() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PublicApplication(PublicApplication source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.AppGroupType != null) {
            this.AppGroupType = new String(source.AppGroupType);
        }
        if (source.NextflowVersion != null) {
            this.NextflowVersion = new String[source.NextflowVersion.length];
            for (int i = 0; i < source.NextflowVersion.length; i++) {
                this.NextflowVersion[i] = new String(source.NextflowVersion[i]);
            }
        }
        if (source.AppTags != null) {
            this.AppTags = new ToolRepoTag[source.AppTags.length];
            for (int i = 0; i < source.AppTags.length; i++) {
                this.AppTags[i] = new ToolRepoTag(source.AppTags[i]);
            }
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AppGroupType", this.AppGroupType);
        this.setParamArraySimple(map, prefix + "NextflowVersion.", this.NextflowVersion);
        this.setParamArrayObj(map, prefix + "AppTags.", this.AppTags);
        this.setParamSimple(map, prefix + "AppId", this.AppId);

    }
}

