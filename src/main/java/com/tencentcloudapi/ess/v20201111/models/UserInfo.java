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

public class UserInfo extends AbstractModel{

    /**
    * 用户在平台的编号
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户的来源渠道
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * 用户在渠道的编号
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 用户真实IP
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * 用户代理IP
    */
    @SerializedName("ProxyIp")
    @Expose
    private String ProxyIp;

    /**
     * Get 用户在平台的编号 
     * @return UserId 用户在平台的编号
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户在平台的编号
     * @param UserId 用户在平台的编号
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户的来源渠道 
     * @return Channel 用户的来源渠道
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set 用户的来源渠道
     * @param Channel 用户的来源渠道
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get 用户在渠道的编号 
     * @return OpenId 用户在渠道的编号
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 用户在渠道的编号
     * @param OpenId 用户在渠道的编号
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 用户真实IP 
     * @return ClientIp 用户真实IP
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set 用户真实IP
     * @param ClientIp 用户真实IP
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get 用户代理IP 
     * @return ProxyIp 用户代理IP
     */
    public String getProxyIp() {
        return this.ProxyIp;
    }

    /**
     * Set 用户代理IP
     * @param ProxyIp 用户代理IP
     */
    public void setProxyIp(String ProxyIp) {
        this.ProxyIp = ProxyIp;
    }

    public UserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserInfo(UserInfo source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
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
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "ProxyIp", this.ProxyIp);

    }
}

