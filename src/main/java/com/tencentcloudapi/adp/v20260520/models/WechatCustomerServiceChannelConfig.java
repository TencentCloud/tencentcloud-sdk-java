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

public class WechatCustomerServiceChannelConfig extends AbstractModel {

    /**
    * <p>企业微信应用Secret</p>
    */
    @SerializedName("AgentSecret")
    @Expose
    private String AgentSecret;

    /**
    * <p>头像URL</p>
    */
    @SerializedName("Avatar")
    @Expose
    private String Avatar;

    /**
    * <p>回调配置</p>
    */
    @SerializedName("Callback")
    @Expose
    private CallbackConfig Callback;

    /**
    * <p>客服账号ID</p>
    */
    @SerializedName("CustomerServiceId")
    @Expose
    private String CustomerServiceId;

    /**
    * <p>客服账号名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>客服形象二维码URL</p>
    */
    @SerializedName("ShareCodeUrl")
    @Expose
    private String ShareCodeUrl;

    /**
    * <p>企业微信企业ID</p>
    */
    @SerializedName("WecomCorpId")
    @Expose
    private String WecomCorpId;

    /**
     * Get <p>企业微信应用Secret</p> 
     * @return AgentSecret <p>企业微信应用Secret</p>
     */
    public String getAgentSecret() {
        return this.AgentSecret;
    }

    /**
     * Set <p>企业微信应用Secret</p>
     * @param AgentSecret <p>企业微信应用Secret</p>
     */
    public void setAgentSecret(String AgentSecret) {
        this.AgentSecret = AgentSecret;
    }

    /**
     * Get <p>头像URL</p> 
     * @return Avatar <p>头像URL</p>
     */
    public String getAvatar() {
        return this.Avatar;
    }

    /**
     * Set <p>头像URL</p>
     * @param Avatar <p>头像URL</p>
     */
    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
    }

    /**
     * Get <p>回调配置</p> 
     * @return Callback <p>回调配置</p>
     */
    public CallbackConfig getCallback() {
        return this.Callback;
    }

    /**
     * Set <p>回调配置</p>
     * @param Callback <p>回调配置</p>
     */
    public void setCallback(CallbackConfig Callback) {
        this.Callback = Callback;
    }

    /**
     * Get <p>客服账号ID</p> 
     * @return CustomerServiceId <p>客服账号ID</p>
     */
    public String getCustomerServiceId() {
        return this.CustomerServiceId;
    }

    /**
     * Set <p>客服账号ID</p>
     * @param CustomerServiceId <p>客服账号ID</p>
     */
    public void setCustomerServiceId(String CustomerServiceId) {
        this.CustomerServiceId = CustomerServiceId;
    }

    /**
     * Get <p>客服账号名称</p> 
     * @return Name <p>客服账号名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>客服账号名称</p>
     * @param Name <p>客服账号名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>客服形象二维码URL</p> 
     * @return ShareCodeUrl <p>客服形象二维码URL</p>
     */
    public String getShareCodeUrl() {
        return this.ShareCodeUrl;
    }

    /**
     * Set <p>客服形象二维码URL</p>
     * @param ShareCodeUrl <p>客服形象二维码URL</p>
     */
    public void setShareCodeUrl(String ShareCodeUrl) {
        this.ShareCodeUrl = ShareCodeUrl;
    }

    /**
     * Get <p>企业微信企业ID</p> 
     * @return WecomCorpId <p>企业微信企业ID</p>
     */
    public String getWecomCorpId() {
        return this.WecomCorpId;
    }

    /**
     * Set <p>企业微信企业ID</p>
     * @param WecomCorpId <p>企业微信企业ID</p>
     */
    public void setWecomCorpId(String WecomCorpId) {
        this.WecomCorpId = WecomCorpId;
    }

    public WechatCustomerServiceChannelConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WechatCustomerServiceChannelConfig(WechatCustomerServiceChannelConfig source) {
        if (source.AgentSecret != null) {
            this.AgentSecret = new String(source.AgentSecret);
        }
        if (source.Avatar != null) {
            this.Avatar = new String(source.Avatar);
        }
        if (source.Callback != null) {
            this.Callback = new CallbackConfig(source.Callback);
        }
        if (source.CustomerServiceId != null) {
            this.CustomerServiceId = new String(source.CustomerServiceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ShareCodeUrl != null) {
            this.ShareCodeUrl = new String(source.ShareCodeUrl);
        }
        if (source.WecomCorpId != null) {
            this.WecomCorpId = new String(source.WecomCorpId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentSecret", this.AgentSecret);
        this.setParamSimple(map, prefix + "Avatar", this.Avatar);
        this.setParamObj(map, prefix + "Callback.", this.Callback);
        this.setParamSimple(map, prefix + "CustomerServiceId", this.CustomerServiceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ShareCodeUrl", this.ShareCodeUrl);
        this.setParamSimple(map, prefix + "WecomCorpId", this.WecomCorpId);

    }
}

