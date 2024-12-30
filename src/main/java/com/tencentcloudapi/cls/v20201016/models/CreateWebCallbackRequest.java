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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateWebCallbackRequest extends AbstractModel {

    /**
    * 通知内容名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 渠道类型。

WeCom:企业微信;DingTalk:钉钉;Lark:飞书;Http:自定义回调。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Webhook地址。
    */
    @SerializedName("Webhook")
    @Expose
    private String Webhook;

    /**
    * 请求方式。 支持POST、PUT。

当Type为Http时，必填。
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 秘钥。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
     * Get 通知内容名称。 
     * @return Name 通知内容名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 通知内容名称。
     * @param Name 通知内容名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 渠道类型。

WeCom:企业微信;DingTalk:钉钉;Lark:飞书;Http:自定义回调。 
     * @return Type 渠道类型。

WeCom:企业微信;DingTalk:钉钉;Lark:飞书;Http:自定义回调。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 渠道类型。

WeCom:企业微信;DingTalk:钉钉;Lark:飞书;Http:自定义回调。
     * @param Type 渠道类型。

WeCom:企业微信;DingTalk:钉钉;Lark:飞书;Http:自定义回调。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Webhook地址。 
     * @return Webhook Webhook地址。
     */
    public String getWebhook() {
        return this.Webhook;
    }

    /**
     * Set Webhook地址。
     * @param Webhook Webhook地址。
     */
    public void setWebhook(String Webhook) {
        this.Webhook = Webhook;
    }

    /**
     * Get 请求方式。 支持POST、PUT。

当Type为Http时，必填。 
     * @return Method 请求方式。 支持POST、PUT。

当Type为Http时，必填。
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 请求方式。 支持POST、PUT。

当Type为Http时，必填。
     * @param Method 请求方式。 支持POST、PUT。

当Type为Http时，必填。
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 秘钥。 
     * @return Key 秘钥。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 秘钥。
     * @param Key 秘钥。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    public CreateWebCallbackRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateWebCallbackRequest(CreateWebCallbackRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Webhook != null) {
            this.Webhook = new String(source.Webhook);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Webhook", this.Webhook);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Key", this.Key);

    }
}

