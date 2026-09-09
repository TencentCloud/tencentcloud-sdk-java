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

public class WecomAppChannelConfig extends AbstractModel {

    /**
    * <p>回调配置</p>
    */
    @SerializedName("Callback")
    @Expose
    private CallbackConfig Callback;

    /**
    * <p>第三方企业ID</p>
    */
    @SerializedName("ThirdChannelCorpId")
    @Expose
    private String ThirdChannelCorpId;

    /**
    * <p>第三方渠道ID</p>
    */
    @SerializedName("ThirdChannelId")
    @Expose
    private String ThirdChannelId;

    /**
    * <p>企微应用ID</p>
    */
    @SerializedName("WecomAgentId")
    @Expose
    private String WecomAgentId;

    /**
    * <p>企微应用Secret</p>
    */
    @SerializedName("WecomAgentSecret")
    @Expose
    private String WecomAgentSecret;

    /**
    * <p>企业ID</p>
    */
    @SerializedName("WecomCorpId")
    @Expose
    private String WecomCorpId;

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
     * Get <p>第三方企业ID</p> 
     * @return ThirdChannelCorpId <p>第三方企业ID</p>
     */
    public String getThirdChannelCorpId() {
        return this.ThirdChannelCorpId;
    }

    /**
     * Set <p>第三方企业ID</p>
     * @param ThirdChannelCorpId <p>第三方企业ID</p>
     */
    public void setThirdChannelCorpId(String ThirdChannelCorpId) {
        this.ThirdChannelCorpId = ThirdChannelCorpId;
    }

    /**
     * Get <p>第三方渠道ID</p> 
     * @return ThirdChannelId <p>第三方渠道ID</p>
     */
    public String getThirdChannelId() {
        return this.ThirdChannelId;
    }

    /**
     * Set <p>第三方渠道ID</p>
     * @param ThirdChannelId <p>第三方渠道ID</p>
     */
    public void setThirdChannelId(String ThirdChannelId) {
        this.ThirdChannelId = ThirdChannelId;
    }

    /**
     * Get <p>企微应用ID</p> 
     * @return WecomAgentId <p>企微应用ID</p>
     */
    public String getWecomAgentId() {
        return this.WecomAgentId;
    }

    /**
     * Set <p>企微应用ID</p>
     * @param WecomAgentId <p>企微应用ID</p>
     */
    public void setWecomAgentId(String WecomAgentId) {
        this.WecomAgentId = WecomAgentId;
    }

    /**
     * Get <p>企微应用Secret</p> 
     * @return WecomAgentSecret <p>企微应用Secret</p>
     */
    public String getWecomAgentSecret() {
        return this.WecomAgentSecret;
    }

    /**
     * Set <p>企微应用Secret</p>
     * @param WecomAgentSecret <p>企微应用Secret</p>
     */
    public void setWecomAgentSecret(String WecomAgentSecret) {
        this.WecomAgentSecret = WecomAgentSecret;
    }

    /**
     * Get <p>企业ID</p> 
     * @return WecomCorpId <p>企业ID</p>
     */
    public String getWecomCorpId() {
        return this.WecomCorpId;
    }

    /**
     * Set <p>企业ID</p>
     * @param WecomCorpId <p>企业ID</p>
     */
    public void setWecomCorpId(String WecomCorpId) {
        this.WecomCorpId = WecomCorpId;
    }

    public WecomAppChannelConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WecomAppChannelConfig(WecomAppChannelConfig source) {
        if (source.Callback != null) {
            this.Callback = new CallbackConfig(source.Callback);
        }
        if (source.ThirdChannelCorpId != null) {
            this.ThirdChannelCorpId = new String(source.ThirdChannelCorpId);
        }
        if (source.ThirdChannelId != null) {
            this.ThirdChannelId = new String(source.ThirdChannelId);
        }
        if (source.WecomAgentId != null) {
            this.WecomAgentId = new String(source.WecomAgentId);
        }
        if (source.WecomAgentSecret != null) {
            this.WecomAgentSecret = new String(source.WecomAgentSecret);
        }
        if (source.WecomCorpId != null) {
            this.WecomCorpId = new String(source.WecomCorpId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Callback.", this.Callback);
        this.setParamSimple(map, prefix + "ThirdChannelCorpId", this.ThirdChannelCorpId);
        this.setParamSimple(map, prefix + "ThirdChannelId", this.ThirdChannelId);
        this.setParamSimple(map, prefix + "WecomAgentId", this.WecomAgentId);
        this.setParamSimple(map, prefix + "WecomAgentSecret", this.WecomAgentSecret);
        this.setParamSimple(map, prefix + "WecomCorpId", this.WecomCorpId);

    }
}

