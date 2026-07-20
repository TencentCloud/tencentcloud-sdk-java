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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateReleaseRequest extends AbstractModel {

    /**
    * <p>应用ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>应用分享访问控制配置</p>
    */
    @SerializedName("AppShareAccessControl")
    @Expose
    private AppShareAccessControl AppShareAccessControl;

    /**
    * <p>渠道ID列表</p>
    */
    @SerializedName("ChannelIdList")
    @Expose
    private String [] ChannelIdList;

    /**
    * <p>企业共享配置</p>
    */
    @SerializedName("CorpShareConfig")
    @Expose
    private CorpShareConfig CorpShareConfig;

    /**
    * <p>发布描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>将默认知识库中，仅调试生效的知识批量变更为&quot;调试/发布都生效&quot;</p>
    */
    @SerializedName("IsDevToRelease")
    @Expose
    private Boolean IsDevToRelease;

    /**
    * <p>是否同步发布为应用模板</p>
    */
    @SerializedName("IsPublishAsTemplate")
    @Expose
    private Boolean IsPublishAsTemplate;

    /**
     * Get <p>应用ID</p> 
     * @return AppId <p>应用ID</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用ID</p>
     * @param AppId <p>应用ID</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>应用分享访问控制配置</p> 
     * @return AppShareAccessControl <p>应用分享访问控制配置</p>
     */
    public AppShareAccessControl getAppShareAccessControl() {
        return this.AppShareAccessControl;
    }

    /**
     * Set <p>应用分享访问控制配置</p>
     * @param AppShareAccessControl <p>应用分享访问控制配置</p>
     */
    public void setAppShareAccessControl(AppShareAccessControl AppShareAccessControl) {
        this.AppShareAccessControl = AppShareAccessControl;
    }

    /**
     * Get <p>渠道ID列表</p> 
     * @return ChannelIdList <p>渠道ID列表</p>
     */
    public String [] getChannelIdList() {
        return this.ChannelIdList;
    }

    /**
     * Set <p>渠道ID列表</p>
     * @param ChannelIdList <p>渠道ID列表</p>
     */
    public void setChannelIdList(String [] ChannelIdList) {
        this.ChannelIdList = ChannelIdList;
    }

    /**
     * Get <p>企业共享配置</p> 
     * @return CorpShareConfig <p>企业共享配置</p>
     */
    public CorpShareConfig getCorpShareConfig() {
        return this.CorpShareConfig;
    }

    /**
     * Set <p>企业共享配置</p>
     * @param CorpShareConfig <p>企业共享配置</p>
     */
    public void setCorpShareConfig(CorpShareConfig CorpShareConfig) {
        this.CorpShareConfig = CorpShareConfig;
    }

    /**
     * Get <p>发布描述</p> 
     * @return Description <p>发布描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>发布描述</p>
     * @param Description <p>发布描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>将默认知识库中，仅调试生效的知识批量变更为&quot;调试/发布都生效&quot;</p> 
     * @return IsDevToRelease <p>将默认知识库中，仅调试生效的知识批量变更为&quot;调试/发布都生效&quot;</p>
     */
    public Boolean getIsDevToRelease() {
        return this.IsDevToRelease;
    }

    /**
     * Set <p>将默认知识库中，仅调试生效的知识批量变更为&quot;调试/发布都生效&quot;</p>
     * @param IsDevToRelease <p>将默认知识库中，仅调试生效的知识批量变更为&quot;调试/发布都生效&quot;</p>
     */
    public void setIsDevToRelease(Boolean IsDevToRelease) {
        this.IsDevToRelease = IsDevToRelease;
    }

    /**
     * Get <p>是否同步发布为应用模板</p> 
     * @return IsPublishAsTemplate <p>是否同步发布为应用模板</p>
     */
    public Boolean getIsPublishAsTemplate() {
        return this.IsPublishAsTemplate;
    }

    /**
     * Set <p>是否同步发布为应用模板</p>
     * @param IsPublishAsTemplate <p>是否同步发布为应用模板</p>
     */
    public void setIsPublishAsTemplate(Boolean IsPublishAsTemplate) {
        this.IsPublishAsTemplate = IsPublishAsTemplate;
    }

    public CreateReleaseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateReleaseRequest(CreateReleaseRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.AppShareAccessControl != null) {
            this.AppShareAccessControl = new AppShareAccessControl(source.AppShareAccessControl);
        }
        if (source.ChannelIdList != null) {
            this.ChannelIdList = new String[source.ChannelIdList.length];
            for (int i = 0; i < source.ChannelIdList.length; i++) {
                this.ChannelIdList[i] = new String(source.ChannelIdList[i]);
            }
        }
        if (source.CorpShareConfig != null) {
            this.CorpShareConfig = new CorpShareConfig(source.CorpShareConfig);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.IsDevToRelease != null) {
            this.IsDevToRelease = new Boolean(source.IsDevToRelease);
        }
        if (source.IsPublishAsTemplate != null) {
            this.IsPublishAsTemplate = new Boolean(source.IsPublishAsTemplate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamObj(map, prefix + "AppShareAccessControl.", this.AppShareAccessControl);
        this.setParamArraySimple(map, prefix + "ChannelIdList.", this.ChannelIdList);
        this.setParamObj(map, prefix + "CorpShareConfig.", this.CorpShareConfig);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "IsDevToRelease", this.IsDevToRelease);
        this.setParamSimple(map, prefix + "IsPublishAsTemplate", this.IsPublishAsTemplate);

    }
}

