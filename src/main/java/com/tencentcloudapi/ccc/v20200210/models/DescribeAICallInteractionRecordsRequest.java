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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAICallInteractionRecordsRequest extends AbstractModel {

    /**
    * <p>应用 ID，可以查看 https://console.cloud.tencent.com/ccc。</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>查询的会话SessionID</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
     * Get <p>应用 ID，可以查看 https://console.cloud.tencent.com/ccc。</p> 
     * @return SdkAppId <p>应用 ID，可以查看 https://console.cloud.tencent.com/ccc。</p>
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>应用 ID，可以查看 https://console.cloud.tencent.com/ccc。</p>
     * @param SdkAppId <p>应用 ID，可以查看 https://console.cloud.tencent.com/ccc。</p>
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get <p>查询的会话SessionID</p> 
     * @return SessionId <p>查询的会话SessionID</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>查询的会话SessionID</p>
     * @param SessionId <p>查询的会话SessionID</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    public DescribeAICallInteractionRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAICallInteractionRecordsRequest(DescribeAICallInteractionRecordsRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);

    }
}

