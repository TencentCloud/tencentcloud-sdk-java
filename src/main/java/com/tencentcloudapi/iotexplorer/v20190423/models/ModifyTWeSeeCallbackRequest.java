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

public class ModifyTWeSeeCallbackRequest extends AbstractModel {

    /**
    * <p>回调目标 ID</p>
    */
    @SerializedName("CallbackId")
    @Expose
    private String CallbackId;

    /**
    * <p>回调类型</p><p>枚举值：</p><ul><li>none： 不回调</li><li>http： HTTP 回调</li><li>ckafka： 投递 CKafka Topic</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>回调 URL，需要可访问并通过 Echo 校验</p>
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * <p>回调签名 token，最大长度 128</p>
    */
    @SerializedName("CallbackToken")
    @Expose
    private String CallbackToken;

    /**
    * <p>回调 CKafka 配置</p>
    */
    @SerializedName("CallbackCKafka")
    @Expose
    private SeeCallbackCKafkaConfig CallbackCKafka;

    /**
     * Get <p>回调目标 ID</p> 
     * @return CallbackId <p>回调目标 ID</p>
     */
    public String getCallbackId() {
        return this.CallbackId;
    }

    /**
     * Set <p>回调目标 ID</p>
     * @param CallbackId <p>回调目标 ID</p>
     */
    public void setCallbackId(String CallbackId) {
        this.CallbackId = CallbackId;
    }

    /**
     * Get <p>回调类型</p><p>枚举值：</p><ul><li>none： 不回调</li><li>http： HTTP 回调</li><li>ckafka： 投递 CKafka Topic</li></ul> 
     * @return Type <p>回调类型</p><p>枚举值：</p><ul><li>none： 不回调</li><li>http： HTTP 回调</li><li>ckafka： 投递 CKafka Topic</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>回调类型</p><p>枚举值：</p><ul><li>none： 不回调</li><li>http： HTTP 回调</li><li>ckafka： 投递 CKafka Topic</li></ul>
     * @param Type <p>回调类型</p><p>枚举值：</p><ul><li>none： 不回调</li><li>http： HTTP 回调</li><li>ckafka： 投递 CKafka Topic</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>回调 URL，需要可访问并通过 Echo 校验</p> 
     * @return CallbackUrl <p>回调 URL，需要可访问并通过 Echo 校验</p>
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set <p>回调 URL，需要可访问并通过 Echo 校验</p>
     * @param CallbackUrl <p>回调 URL，需要可访问并通过 Echo 校验</p>
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get <p>回调签名 token，最大长度 128</p> 
     * @return CallbackToken <p>回调签名 token，最大长度 128</p>
     */
    public String getCallbackToken() {
        return this.CallbackToken;
    }

    /**
     * Set <p>回调签名 token，最大长度 128</p>
     * @param CallbackToken <p>回调签名 token，最大长度 128</p>
     */
    public void setCallbackToken(String CallbackToken) {
        this.CallbackToken = CallbackToken;
    }

    /**
     * Get <p>回调 CKafka 配置</p> 
     * @return CallbackCKafka <p>回调 CKafka 配置</p>
     */
    public SeeCallbackCKafkaConfig getCallbackCKafka() {
        return this.CallbackCKafka;
    }

    /**
     * Set <p>回调 CKafka 配置</p>
     * @param CallbackCKafka <p>回调 CKafka 配置</p>
     */
    public void setCallbackCKafka(SeeCallbackCKafkaConfig CallbackCKafka) {
        this.CallbackCKafka = CallbackCKafka;
    }

    public ModifyTWeSeeCallbackRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTWeSeeCallbackRequest(ModifyTWeSeeCallbackRequest source) {
        if (source.CallbackId != null) {
            this.CallbackId = new String(source.CallbackId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.CallbackToken != null) {
            this.CallbackToken = new String(source.CallbackToken);
        }
        if (source.CallbackCKafka != null) {
            this.CallbackCKafka = new SeeCallbackCKafkaConfig(source.CallbackCKafka);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CallbackId", this.CallbackId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "CallbackToken", this.CallbackToken);
        this.setParamObj(map, prefix + "CallbackCKafka.", this.CallbackCKafka);

    }
}

