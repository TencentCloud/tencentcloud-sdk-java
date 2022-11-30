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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserInfo extends AbstractModel{

    /**
    * 渠道平台自定义，对渠道子客企业员的唯一标识。一个OpenId在一个子客企业内唯一对应一个真实员工，不可在其他子客企业内重复使用。（例如，可以使用经办人企业名+员工身份证的hash值，需要渠道平台保存），最大64位字符串
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 内部参数，暂未开放使用
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * 内部参数，暂未开放使用
    */
    @SerializedName("CustomUserId")
    @Expose
    private String CustomUserId;

    /**
    * 内部参数，暂未开放使用
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * 内部参数，暂未开放使用
    */
    @SerializedName("ProxyIp")
    @Expose
    private String ProxyIp;

    /**
     * Get 渠道平台自定义，对渠道子客企业员的唯一标识。一个OpenId在一个子客企业内唯一对应一个真实员工，不可在其他子客企业内重复使用。（例如，可以使用经办人企业名+员工身份证的hash值，需要渠道平台保存），最大64位字符串 
     * @return OpenId 渠道平台自定义，对渠道子客企业员的唯一标识。一个OpenId在一个子客企业内唯一对应一个真实员工，不可在其他子客企业内重复使用。（例如，可以使用经办人企业名+员工身份证的hash值，需要渠道平台保存），最大64位字符串
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 渠道平台自定义，对渠道子客企业员的唯一标识。一个OpenId在一个子客企业内唯一对应一个真实员工，不可在其他子客企业内重复使用。（例如，可以使用经办人企业名+员工身份证的hash值，需要渠道平台保存），最大64位字符串
     * @param OpenId 渠道平台自定义，对渠道子客企业员的唯一标识。一个OpenId在一个子客企业内唯一对应一个真实员工，不可在其他子客企业内重复使用。（例如，可以使用经办人企业名+员工身份证的hash值，需要渠道平台保存），最大64位字符串
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 内部参数，暂未开放使用 
     * @return Channel 内部参数，暂未开放使用
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set 内部参数，暂未开放使用
     * @param Channel 内部参数，暂未开放使用
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get 内部参数，暂未开放使用 
     * @return CustomUserId 内部参数，暂未开放使用
     */
    public String getCustomUserId() {
        return this.CustomUserId;
    }

    /**
     * Set 内部参数，暂未开放使用
     * @param CustomUserId 内部参数，暂未开放使用
     */
    public void setCustomUserId(String CustomUserId) {
        this.CustomUserId = CustomUserId;
    }

    /**
     * Get 内部参数，暂未开放使用 
     * @return ClientIp 内部参数，暂未开放使用
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set 内部参数，暂未开放使用
     * @param ClientIp 内部参数，暂未开放使用
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get 内部参数，暂未开放使用 
     * @return ProxyIp 内部参数，暂未开放使用
     */
    public String getProxyIp() {
        return this.ProxyIp;
    }

    /**
     * Set 内部参数，暂未开放使用
     * @param ProxyIp 内部参数，暂未开放使用
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
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.CustomUserId != null) {
            this.CustomUserId = new String(source.CustomUserId);
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
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "CustomUserId", this.CustomUserId);
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "ProxyIp", this.ProxyIp);

    }
}

