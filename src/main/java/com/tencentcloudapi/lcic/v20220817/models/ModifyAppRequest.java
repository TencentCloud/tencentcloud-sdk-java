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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAppRequest extends AbstractModel {

    /**
    * 低代码互动课堂的SdkAppId。
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 回调地址。
    */
    @SerializedName("Callback")
    @Expose
    private String Callback;

    /**
    * 回调key。
    */
    @SerializedName("CallbackKey")
    @Expose
    private String CallbackKey;

    /**
    * 转存id
    */
    @SerializedName("TransferId")
    @Expose
    private String TransferId;

    /**
    * 转存地址
    */
    @SerializedName("TransferUrl")
    @Expose
    private String TransferUrl;

    /**
     * Get 低代码互动课堂的SdkAppId。 
     * @return SdkAppId 低代码互动课堂的SdkAppId。
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 低代码互动课堂的SdkAppId。
     * @param SdkAppId 低代码互动课堂的SdkAppId。
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 回调地址。 
     * @return Callback 回调地址。
     */
    public String getCallback() {
        return this.Callback;
    }

    /**
     * Set 回调地址。
     * @param Callback 回调地址。
     */
    public void setCallback(String Callback) {
        this.Callback = Callback;
    }

    /**
     * Get 回调key。 
     * @return CallbackKey 回调key。
     */
    public String getCallbackKey() {
        return this.CallbackKey;
    }

    /**
     * Set 回调key。
     * @param CallbackKey 回调key。
     */
    public void setCallbackKey(String CallbackKey) {
        this.CallbackKey = CallbackKey;
    }

    /**
     * Get 转存id 
     * @return TransferId 转存id
     */
    public String getTransferId() {
        return this.TransferId;
    }

    /**
     * Set 转存id
     * @param TransferId 转存id
     */
    public void setTransferId(String TransferId) {
        this.TransferId = TransferId;
    }

    /**
     * Get 转存地址 
     * @return TransferUrl 转存地址
     */
    public String getTransferUrl() {
        return this.TransferUrl;
    }

    /**
     * Set 转存地址
     * @param TransferUrl 转存地址
     */
    public void setTransferUrl(String TransferUrl) {
        this.TransferUrl = TransferUrl;
    }

    public ModifyAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAppRequest(ModifyAppRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Callback != null) {
            this.Callback = new String(source.Callback);
        }
        if (source.CallbackKey != null) {
            this.CallbackKey = new String(source.CallbackKey);
        }
        if (source.TransferId != null) {
            this.TransferId = new String(source.TransferId);
        }
        if (source.TransferUrl != null) {
            this.TransferUrl = new String(source.TransferUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Callback", this.Callback);
        this.setParamSimple(map, prefix + "CallbackKey", this.CallbackKey);
        this.setParamSimple(map, prefix + "TransferId", this.TransferId);
        this.setParamSimple(map, prefix + "TransferUrl", this.TransferUrl);

    }
}

