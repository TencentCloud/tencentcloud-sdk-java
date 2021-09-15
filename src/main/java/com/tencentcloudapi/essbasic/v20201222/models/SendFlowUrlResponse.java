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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendFlowUrlResponse extends AbstractModel{

    /**
    * 签署任务ID，标识每一次的流程发送
    */
    @SerializedName("SignId")
    @Expose
    private String SignId;

    /**
    * 签署链接
    */
    @SerializedName("SignUrl")
    @Expose
    private String SignUrl;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 签署任务ID，标识每一次的流程发送 
     * @return SignId 签署任务ID，标识每一次的流程发送
     */
    public String getSignId() {
        return this.SignId;
    }

    /**
     * Set 签署任务ID，标识每一次的流程发送
     * @param SignId 签署任务ID，标识每一次的流程发送
     */
    public void setSignId(String SignId) {
        this.SignId = SignId;
    }

    /**
     * Get 签署链接 
     * @return SignUrl 签署链接
     */
    public String getSignUrl() {
        return this.SignUrl;
    }

    /**
     * Set 签署链接
     * @param SignUrl 签署链接
     */
    public void setSignUrl(String SignUrl) {
        this.SignUrl = SignUrl;
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

    public SendFlowUrlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendFlowUrlResponse(SendFlowUrlResponse source) {
        if (source.SignId != null) {
            this.SignId = new String(source.SignId);
        }
        if (source.SignUrl != null) {
            this.SignUrl = new String(source.SignUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SignId", this.SignId);
        this.setParamSimple(map, prefix + "SignUrl", this.SignUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

