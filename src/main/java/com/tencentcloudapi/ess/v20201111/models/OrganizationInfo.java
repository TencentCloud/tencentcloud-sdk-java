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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrganizationInfo extends AbstractModel{

    /**
    * 机构在平台的编号，内部字段，暂未开放
    */
    @SerializedName("OrganizationId")
    @Expose
    private String OrganizationId;

    /**
    * 用户渠道，内部字段，暂未开放
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * 用户在渠道的机构编号，内部字段，暂未开放
    */
    @SerializedName("OrganizationOpenId")
    @Expose
    private String OrganizationOpenId;

    /**
    * 用户真实的IP，内部字段，暂未开放
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * 机构的代理IP，内部字段，暂未开放
    */
    @SerializedName("ProxyIp")
    @Expose
    private String ProxyIp;

    /**
     * Get 机构在平台的编号，内部字段，暂未开放 
     * @return OrganizationId 机构在平台的编号，内部字段，暂未开放
     * @deprecated
     */
    @Deprecated
    public String getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set 机构在平台的编号，内部字段，暂未开放
     * @param OrganizationId 机构在平台的编号，内部字段，暂未开放
     * @deprecated
     */
    @Deprecated
    public void setOrganizationId(String OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    /**
     * Get 用户渠道，内部字段，暂未开放 
     * @return Channel 用户渠道，内部字段，暂未开放
     * @deprecated
     */
    @Deprecated
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set 用户渠道，内部字段，暂未开放
     * @param Channel 用户渠道，内部字段，暂未开放
     * @deprecated
     */
    @Deprecated
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get 用户在渠道的机构编号，内部字段，暂未开放 
     * @return OrganizationOpenId 用户在渠道的机构编号，内部字段，暂未开放
     * @deprecated
     */
    @Deprecated
    public String getOrganizationOpenId() {
        return this.OrganizationOpenId;
    }

    /**
     * Set 用户在渠道的机构编号，内部字段，暂未开放
     * @param OrganizationOpenId 用户在渠道的机构编号，内部字段，暂未开放
     * @deprecated
     */
    @Deprecated
    public void setOrganizationOpenId(String OrganizationOpenId) {
        this.OrganizationOpenId = OrganizationOpenId;
    }

    /**
     * Get 用户真实的IP，内部字段，暂未开放 
     * @return ClientIp 用户真实的IP，内部字段，暂未开放
     * @deprecated
     */
    @Deprecated
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set 用户真实的IP，内部字段，暂未开放
     * @param ClientIp 用户真实的IP，内部字段，暂未开放
     * @deprecated
     */
    @Deprecated
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get 机构的代理IP，内部字段，暂未开放 
     * @return ProxyIp 机构的代理IP，内部字段，暂未开放
     * @deprecated
     */
    @Deprecated
    public String getProxyIp() {
        return this.ProxyIp;
    }

    /**
     * Set 机构的代理IP，内部字段，暂未开放
     * @param ProxyIp 机构的代理IP，内部字段，暂未开放
     * @deprecated
     */
    @Deprecated
    public void setProxyIp(String ProxyIp) {
        this.ProxyIp = ProxyIp;
    }

    public OrganizationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrganizationInfo(OrganizationInfo source) {
        if (source.OrganizationId != null) {
            this.OrganizationId = new String(source.OrganizationId);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.OrganizationOpenId != null) {
            this.OrganizationOpenId = new String(source.OrganizationOpenId);
        }
        if (source.ClientIp != null) {
            this.ClientIp = new String(source.ClientIp);
        }
        if (source.ProxyIp != null) {
            this.ProxyIp = new String(source.ProxyIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrganizationId", this.OrganizationId);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "OrganizationOpenId", this.OrganizationOpenId);
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "ProxyIp", this.ProxyIp);

    }
}

