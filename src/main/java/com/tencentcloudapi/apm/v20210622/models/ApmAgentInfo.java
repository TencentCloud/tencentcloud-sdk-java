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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApmAgentInfo extends AbstractModel {

    /**
    * Agent 下载地址
    */
    @SerializedName("AgentDownloadURL")
    @Expose
    private String AgentDownloadURL;

    /**
    * Collector 上报地址
    */
    @SerializedName("CollectorURL")
    @Expose
    private String CollectorURL;

    /**
    * Token 信息
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * 外网上报地址
    */
    @SerializedName("PublicCollectorURL")
    @Expose
    private String PublicCollectorURL;

    /**
    * 自研 VPC 上报地址
    */
    @SerializedName("InnerCollectorURL")
    @Expose
    private String InnerCollectorURL;

    /**
    * 内网上报地址( Private Link 上报地址)
    */
    @SerializedName("PrivateLinkCollectorURL")
    @Expose
    private String PrivateLinkCollectorURL;

    /**
     * Get Agent 下载地址 
     * @return AgentDownloadURL Agent 下载地址
     */
    public String getAgentDownloadURL() {
        return this.AgentDownloadURL;
    }

    /**
     * Set Agent 下载地址
     * @param AgentDownloadURL Agent 下载地址
     */
    public void setAgentDownloadURL(String AgentDownloadURL) {
        this.AgentDownloadURL = AgentDownloadURL;
    }

    /**
     * Get Collector 上报地址 
     * @return CollectorURL Collector 上报地址
     */
    public String getCollectorURL() {
        return this.CollectorURL;
    }

    /**
     * Set Collector 上报地址
     * @param CollectorURL Collector 上报地址
     */
    public void setCollectorURL(String CollectorURL) {
        this.CollectorURL = CollectorURL;
    }

    /**
     * Get Token 信息 
     * @return Token Token 信息
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set Token 信息
     * @param Token Token 信息
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get 外网上报地址 
     * @return PublicCollectorURL 外网上报地址
     */
    public String getPublicCollectorURL() {
        return this.PublicCollectorURL;
    }

    /**
     * Set 外网上报地址
     * @param PublicCollectorURL 外网上报地址
     */
    public void setPublicCollectorURL(String PublicCollectorURL) {
        this.PublicCollectorURL = PublicCollectorURL;
    }

    /**
     * Get 自研 VPC 上报地址 
     * @return InnerCollectorURL 自研 VPC 上报地址
     */
    public String getInnerCollectorURL() {
        return this.InnerCollectorURL;
    }

    /**
     * Set 自研 VPC 上报地址
     * @param InnerCollectorURL 自研 VPC 上报地址
     */
    public void setInnerCollectorURL(String InnerCollectorURL) {
        this.InnerCollectorURL = InnerCollectorURL;
    }

    /**
     * Get 内网上报地址( Private Link 上报地址) 
     * @return PrivateLinkCollectorURL 内网上报地址( Private Link 上报地址)
     */
    public String getPrivateLinkCollectorURL() {
        return this.PrivateLinkCollectorURL;
    }

    /**
     * Set 内网上报地址( Private Link 上报地址)
     * @param PrivateLinkCollectorURL 内网上报地址( Private Link 上报地址)
     */
    public void setPrivateLinkCollectorURL(String PrivateLinkCollectorURL) {
        this.PrivateLinkCollectorURL = PrivateLinkCollectorURL;
    }

    public ApmAgentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApmAgentInfo(ApmAgentInfo source) {
        if (source.AgentDownloadURL != null) {
            this.AgentDownloadURL = new String(source.AgentDownloadURL);
        }
        if (source.CollectorURL != null) {
            this.CollectorURL = new String(source.CollectorURL);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.PublicCollectorURL != null) {
            this.PublicCollectorURL = new String(source.PublicCollectorURL);
        }
        if (source.InnerCollectorURL != null) {
            this.InnerCollectorURL = new String(source.InnerCollectorURL);
        }
        if (source.PrivateLinkCollectorURL != null) {
            this.PrivateLinkCollectorURL = new String(source.PrivateLinkCollectorURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentDownloadURL", this.AgentDownloadURL);
        this.setParamSimple(map, prefix + "CollectorURL", this.CollectorURL);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "PublicCollectorURL", this.PublicCollectorURL);
        this.setParamSimple(map, prefix + "InnerCollectorURL", this.InnerCollectorURL);
        this.setParamSimple(map, prefix + "PrivateLinkCollectorURL", this.PrivateLinkCollectorURL);

    }
}

