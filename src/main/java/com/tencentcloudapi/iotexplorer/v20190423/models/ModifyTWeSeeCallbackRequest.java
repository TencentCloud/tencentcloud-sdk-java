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
    * 回调目标 ID，格式为 `callback-` + 8 位小写字母数字
    */
    @SerializedName("CallbackId")
    @Expose
    private String CallbackId;

    /**
    * 回调 URL，需要可访问并通过 Echo 校验
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 回调类型。当前仅支持：`http`
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 回调签名 token，最大长度 128
    */
    @SerializedName("CallbackToken")
    @Expose
    private String CallbackToken;

    /**
     * Get 回调目标 ID，格式为 `callback-` + 8 位小写字母数字 
     * @return CallbackId 回调目标 ID，格式为 `callback-` + 8 位小写字母数字
     */
    public String getCallbackId() {
        return this.CallbackId;
    }

    /**
     * Set 回调目标 ID，格式为 `callback-` + 8 位小写字母数字
     * @param CallbackId 回调目标 ID，格式为 `callback-` + 8 位小写字母数字
     */
    public void setCallbackId(String CallbackId) {
        this.CallbackId = CallbackId;
    }

    /**
     * Get 回调 URL，需要可访问并通过 Echo 校验 
     * @return CallbackUrl 回调 URL，需要可访问并通过 Echo 校验
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 回调 URL，需要可访问并通过 Echo 校验
     * @param CallbackUrl 回调 URL，需要可访问并通过 Echo 校验
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 回调类型。当前仅支持：`http` 
     * @return Type 回调类型。当前仅支持：`http`
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 回调类型。当前仅支持：`http`
     * @param Type 回调类型。当前仅支持：`http`
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 回调签名 token，最大长度 128 
     * @return CallbackToken 回调签名 token，最大长度 128
     */
    public String getCallbackToken() {
        return this.CallbackToken;
    }

    /**
     * Set 回调签名 token，最大长度 128
     * @param CallbackToken 回调签名 token，最大长度 128
     */
    public void setCallbackToken(String CallbackToken) {
        this.CallbackToken = CallbackToken;
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
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CallbackToken != null) {
            this.CallbackToken = new String(source.CallbackToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CallbackId", this.CallbackId);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CallbackToken", this.CallbackToken);

    }
}

