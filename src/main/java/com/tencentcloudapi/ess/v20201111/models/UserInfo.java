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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserInfo extends AbstractModel {

    /**
    * <p>用户在平台中的编号（UserId）</p><p>UserId 获取方式：<a href="https://qcloudimg.tencent-cloud.cn/raw/6b054d6161b04c24855de15cb243f6bf.png" target="_blank">点击查看</a></p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>用户的来源渠道，一般不用传，特定场景根据接口说明传值</p>
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * <p>用户在渠道的编号，一般不用传，特定场景根据接口说明传值</p>
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * <p>用户真实IP，内部字段，暂未开放</p>
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * <p>用户代理IP，内部字段，暂未开放</p>
    */
    @SerializedName("ProxyIp")
    @Expose
    private String ProxyIp;

    /**
     * Get <p>用户在平台中的编号（UserId）</p><p>UserId 获取方式：<a href="https://qcloudimg.tencent-cloud.cn/raw/6b054d6161b04c24855de15cb243f6bf.png" target="_blank">点击查看</a></p> 
     * @return UserId <p>用户在平台中的编号（UserId）</p><p>UserId 获取方式：<a href="https://qcloudimg.tencent-cloud.cn/raw/6b054d6161b04c24855de15cb243f6bf.png" target="_blank">点击查看</a></p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>用户在平台中的编号（UserId）</p><p>UserId 获取方式：<a href="https://qcloudimg.tencent-cloud.cn/raw/6b054d6161b04c24855de15cb243f6bf.png" target="_blank">点击查看</a></p>
     * @param UserId <p>用户在平台中的编号（UserId）</p><p>UserId 获取方式：<a href="https://qcloudimg.tencent-cloud.cn/raw/6b054d6161b04c24855de15cb243f6bf.png" target="_blank">点击查看</a></p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>用户的来源渠道，一般不用传，特定场景根据接口说明传值</p> 
     * @return Channel <p>用户的来源渠道，一般不用传，特定场景根据接口说明传值</p>
     * @deprecated
     */
    @Deprecated
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set <p>用户的来源渠道，一般不用传，特定场景根据接口说明传值</p>
     * @param Channel <p>用户的来源渠道，一般不用传，特定场景根据接口说明传值</p>
     * @deprecated
     */
    @Deprecated
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get <p>用户在渠道的编号，一般不用传，特定场景根据接口说明传值</p> 
     * @return OpenId <p>用户在渠道的编号，一般不用传，特定场景根据接口说明传值</p>
     * @deprecated
     */
    @Deprecated
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set <p>用户在渠道的编号，一般不用传，特定场景根据接口说明传值</p>
     * @param OpenId <p>用户在渠道的编号，一般不用传，特定场景根据接口说明传值</p>
     * @deprecated
     */
    @Deprecated
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get <p>用户真实IP，内部字段，暂未开放</p> 
     * @return ClientIp <p>用户真实IP，内部字段，暂未开放</p>
     * @deprecated
     */
    @Deprecated
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set <p>用户真实IP，内部字段，暂未开放</p>
     * @param ClientIp <p>用户真实IP，内部字段，暂未开放</p>
     * @deprecated
     */
    @Deprecated
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get <p>用户代理IP，内部字段，暂未开放</p> 
     * @return ProxyIp <p>用户代理IP，内部字段，暂未开放</p>
     * @deprecated
     */
    @Deprecated
    public String getProxyIp() {
        return this.ProxyIp;
    }

    /**
     * Set <p>用户代理IP，内部字段，暂未开放</p>
     * @param ProxyIp <p>用户代理IP，内部字段，暂未开放</p>
     * @deprecated
     */
    @Deprecated
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

