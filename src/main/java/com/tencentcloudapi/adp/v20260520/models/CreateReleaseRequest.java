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
    * 应用ID
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 渠道ID列表
    */
    @SerializedName("ChannelIdList")
    @Expose
    private String [] ChannelIdList;

    /**
    * 发布描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 将默认知识库中，仅调试生效的知识批量变更为"调试/发布都生效"
    */
    @SerializedName("IsDevToRelease")
    @Expose
    private Boolean IsDevToRelease;

    /**
    * 是否同步发布为应用模板
    */
    @SerializedName("IsPublishAsTemplate")
    @Expose
    private Boolean IsPublishAsTemplate;

    /**
     * Get 应用ID 
     * @return AppId 应用ID
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 应用ID
     * @param AppId 应用ID
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 渠道ID列表 
     * @return ChannelIdList 渠道ID列表
     */
    public String [] getChannelIdList() {
        return this.ChannelIdList;
    }

    /**
     * Set 渠道ID列表
     * @param ChannelIdList 渠道ID列表
     */
    public void setChannelIdList(String [] ChannelIdList) {
        this.ChannelIdList = ChannelIdList;
    }

    /**
     * Get 发布描述 
     * @return Description 发布描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 发布描述
     * @param Description 发布描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 将默认知识库中，仅调试生效的知识批量变更为"调试/发布都生效" 
     * @return IsDevToRelease 将默认知识库中，仅调试生效的知识批量变更为"调试/发布都生效"
     */
    public Boolean getIsDevToRelease() {
        return this.IsDevToRelease;
    }

    /**
     * Set 将默认知识库中，仅调试生效的知识批量变更为"调试/发布都生效"
     * @param IsDevToRelease 将默认知识库中，仅调试生效的知识批量变更为"调试/发布都生效"
     */
    public void setIsDevToRelease(Boolean IsDevToRelease) {
        this.IsDevToRelease = IsDevToRelease;
    }

    /**
     * Get 是否同步发布为应用模板 
     * @return IsPublishAsTemplate 是否同步发布为应用模板
     */
    public Boolean getIsPublishAsTemplate() {
        return this.IsPublishAsTemplate;
    }

    /**
     * Set 是否同步发布为应用模板
     * @param IsPublishAsTemplate 是否同步发布为应用模板
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
        if (source.ChannelIdList != null) {
            this.ChannelIdList = new String[source.ChannelIdList.length];
            for (int i = 0; i < source.ChannelIdList.length; i++) {
                this.ChannelIdList[i] = new String(source.ChannelIdList[i]);
            }
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
        this.setParamArraySimple(map, prefix + "ChannelIdList.", this.ChannelIdList);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "IsDevToRelease", this.IsDevToRelease);
        this.setParamSimple(map, prefix + "IsPublishAsTemplate", this.IsPublishAsTemplate);

    }
}

