/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindRealServerInfo extends AbstractModel {

    /**
    * 源站的IP或域名
    */
    @SerializedName("RealServerIP")
    @Expose
    private String RealServerIP;

    /**
    * 源站ID
    */
    @SerializedName("RealServerId")
    @Expose
    private String RealServerId;

    /**
    * 源站名称
    */
    @SerializedName("RealServerName")
    @Expose
    private String RealServerName;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 标签列表
    */
    @SerializedName("TagSet")
    @Expose
    private TagPair [] TagSet;

    /**
     * Get 源站的IP或域名 
     * @return RealServerIP 源站的IP或域名
     */
    public String getRealServerIP() {
        return this.RealServerIP;
    }

    /**
     * Set 源站的IP或域名
     * @param RealServerIP 源站的IP或域名
     */
    public void setRealServerIP(String RealServerIP) {
        this.RealServerIP = RealServerIP;
    }

    /**
     * Get 源站ID 
     * @return RealServerId 源站ID
     */
    public String getRealServerId() {
        return this.RealServerId;
    }

    /**
     * Set 源站ID
     * @param RealServerId 源站ID
     */
    public void setRealServerId(String RealServerId) {
        this.RealServerId = RealServerId;
    }

    /**
     * Get 源站名称 
     * @return RealServerName 源站名称
     */
    public String getRealServerName() {
        return this.RealServerName;
    }

    /**
     * Set 源站名称
     * @param RealServerName 源站名称
     */
    public void setRealServerName(String RealServerName) {
        this.RealServerName = RealServerName;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 标签列表 
     * @return TagSet 标签列表
     */
    public TagPair [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 标签列表
     * @param TagSet 标签列表
     */
    public void setTagSet(TagPair [] TagSet) {
        this.TagSet = TagSet;
    }

    public BindRealServerInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindRealServerInfo(BindRealServerInfo source) {
        if (source.RealServerIP != null) {
            this.RealServerIP = new String(source.RealServerIP);
        }
        if (source.RealServerId != null) {
            this.RealServerId = new String(source.RealServerId);
        }
        if (source.RealServerName != null) {
            this.RealServerName = new String(source.RealServerName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.TagSet != null) {
            this.TagSet = new TagPair[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new TagPair(source.TagSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RealServerIP", this.RealServerIP);
        this.setParamSimple(map, prefix + "RealServerId", this.RealServerId);
        this.setParamSimple(map, prefix + "RealServerName", this.RealServerName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}

