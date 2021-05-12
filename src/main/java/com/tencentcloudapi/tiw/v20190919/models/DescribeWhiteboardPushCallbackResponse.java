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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWhiteboardPushCallbackResponse extends AbstractModel{

    /**
    * 白板推流事件回调地址，如果未设置回调地址，该字段为空字符串
    */
    @SerializedName("Callback")
    @Expose
    private String Callback;

    /**
    * 白板推流回调鉴权密钥
    */
    @SerializedName("CallbackKey")
    @Expose
    private String CallbackKey;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 白板推流事件回调地址，如果未设置回调地址，该字段为空字符串 
     * @return Callback 白板推流事件回调地址，如果未设置回调地址，该字段为空字符串
     */
    public String getCallback() {
        return this.Callback;
    }

    /**
     * Set 白板推流事件回调地址，如果未设置回调地址，该字段为空字符串
     * @param Callback 白板推流事件回调地址，如果未设置回调地址，该字段为空字符串
     */
    public void setCallback(String Callback) {
        this.Callback = Callback;
    }

    /**
     * Get 白板推流回调鉴权密钥 
     * @return CallbackKey 白板推流回调鉴权密钥
     */
    public String getCallbackKey() {
        return this.CallbackKey;
    }

    /**
     * Set 白板推流回调鉴权密钥
     * @param CallbackKey 白板推流回调鉴权密钥
     */
    public void setCallbackKey(String CallbackKey) {
        this.CallbackKey = CallbackKey;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeWhiteboardPushCallbackResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWhiteboardPushCallbackResponse(DescribeWhiteboardPushCallbackResponse source) {
        if (source.Callback != null) {
            this.Callback = new String(source.Callback);
        }
        if (source.CallbackKey != null) {
            this.CallbackKey = new String(source.CallbackKey);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Callback", this.Callback);
        this.setParamSimple(map, prefix + "CallbackKey", this.CallbackKey);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

