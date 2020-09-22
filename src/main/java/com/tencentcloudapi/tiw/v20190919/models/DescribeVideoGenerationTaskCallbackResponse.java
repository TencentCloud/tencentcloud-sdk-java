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

public class DescribeVideoGenerationTaskCallbackResponse extends AbstractModel{

    /**
    * 录制视频生成回调地址
    */
    @SerializedName("Callback")
    @Expose
    private String Callback;

    /**
    * 录制视频生成回调鉴权密钥
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
     * Get 录制视频生成回调地址 
     * @return Callback 录制视频生成回调地址
     */
    public String getCallback() {
        return this.Callback;
    }

    /**
     * Set 录制视频生成回调地址
     * @param Callback 录制视频生成回调地址
     */
    public void setCallback(String Callback) {
        this.Callback = Callback;
    }

    /**
     * Get 录制视频生成回调鉴权密钥 
     * @return CallbackKey 录制视频生成回调鉴权密钥
     */
    public String getCallbackKey() {
        return this.CallbackKey;
    }

    /**
     * Set 录制视频生成回调鉴权密钥
     * @param CallbackKey 录制视频生成回调鉴权密钥
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Callback", this.Callback);
        this.setParamSimple(map, prefix + "CallbackKey", this.CallbackKey);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

