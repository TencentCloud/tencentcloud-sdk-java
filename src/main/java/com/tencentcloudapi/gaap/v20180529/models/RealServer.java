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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RealServer extends AbstractModel{

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
    * 是否在封禁黑名单中，其中：0表示不在黑名单中，1表示在黑名单中。
    */
    @SerializedName("InBanBlacklist")
    @Expose
    private Long InBanBlacklist;

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
     * Get 是否在封禁黑名单中，其中：0表示不在黑名单中，1表示在黑名单中。 
     * @return InBanBlacklist 是否在封禁黑名单中，其中：0表示不在黑名单中，1表示在黑名单中。
     */
    public Long getInBanBlacklist() {
        return this.InBanBlacklist;
    }

    /**
     * Set 是否在封禁黑名单中，其中：0表示不在黑名单中，1表示在黑名单中。
     * @param InBanBlacklist 是否在封禁黑名单中，其中：0表示不在黑名单中，1表示在黑名单中。
     */
    public void setInBanBlacklist(Long InBanBlacklist) {
        this.InBanBlacklist = InBanBlacklist;
    }

    public RealServer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RealServer(RealServer source) {
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
        if (source.InBanBlacklist != null) {
            this.InBanBlacklist = new Long(source.InBanBlacklist);
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
        this.setParamSimple(map, prefix + "InBanBlacklist", this.InBanBlacklist);

    }
}

