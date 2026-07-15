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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TalkWebhookTool extends AbstractModel {

    /**
    * Webhook工具名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Webhook工具描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 工具参数JSON Schema，JSON对象字符串，必须为type=object
    */
    @SerializedName("Parameters")
    @Expose
    private String Parameters;

    /**
    * Webhook HTTP端点配置
    */
    @SerializedName("Endpoint")
    @Expose
    private TalkWebhookEndpoint Endpoint;

    /**
    * 必填参数名列表，必须存在于Parameters.properties中
    */
    @SerializedName("Required")
    @Expose
    private String [] Required;

    /**
    * Webhook鉴权配置
    */
    @SerializedName("Auth")
    @Expose
    private TalkWebhookAuth Auth;

    /**
     * Get Webhook工具名称 
     * @return Name Webhook工具名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Webhook工具名称
     * @param Name Webhook工具名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Webhook工具描述 
     * @return Description Webhook工具描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Webhook工具描述
     * @param Description Webhook工具描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 工具参数JSON Schema，JSON对象字符串，必须为type=object 
     * @return Parameters 工具参数JSON Schema，JSON对象字符串，必须为type=object
     */
    public String getParameters() {
        return this.Parameters;
    }

    /**
     * Set 工具参数JSON Schema，JSON对象字符串，必须为type=object
     * @param Parameters 工具参数JSON Schema，JSON对象字符串，必须为type=object
     */
    public void setParameters(String Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get Webhook HTTP端点配置 
     * @return Endpoint Webhook HTTP端点配置
     */
    public TalkWebhookEndpoint getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set Webhook HTTP端点配置
     * @param Endpoint Webhook HTTP端点配置
     */
    public void setEndpoint(TalkWebhookEndpoint Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get 必填参数名列表，必须存在于Parameters.properties中 
     * @return Required 必填参数名列表，必须存在于Parameters.properties中
     */
    public String [] getRequired() {
        return this.Required;
    }

    /**
     * Set 必填参数名列表，必须存在于Parameters.properties中
     * @param Required 必填参数名列表，必须存在于Parameters.properties中
     */
    public void setRequired(String [] Required) {
        this.Required = Required;
    }

    /**
     * Get Webhook鉴权配置 
     * @return Auth Webhook鉴权配置
     */
    public TalkWebhookAuth getAuth() {
        return this.Auth;
    }

    /**
     * Set Webhook鉴权配置
     * @param Auth Webhook鉴权配置
     */
    public void setAuth(TalkWebhookAuth Auth) {
        this.Auth = Auth;
    }

    public TalkWebhookTool() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TalkWebhookTool(TalkWebhookTool source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Parameters != null) {
            this.Parameters = new String(source.Parameters);
        }
        if (source.Endpoint != null) {
            this.Endpoint = new TalkWebhookEndpoint(source.Endpoint);
        }
        if (source.Required != null) {
            this.Required = new String[source.Required.length];
            for (int i = 0; i < source.Required.length; i++) {
                this.Required[i] = new String(source.Required[i]);
            }
        }
        if (source.Auth != null) {
            this.Auth = new TalkWebhookAuth(source.Auth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Parameters", this.Parameters);
        this.setParamObj(map, prefix + "Endpoint.", this.Endpoint);
        this.setParamArraySimple(map, prefix + "Required.", this.Required);
        this.setParamObj(map, prefix + "Auth.", this.Auth);

    }
}

