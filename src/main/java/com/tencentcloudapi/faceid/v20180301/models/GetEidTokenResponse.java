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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetEidTokenResponse extends AbstractModel{

    /**
    * 一次核身流程的标识，有效时间为600秒；
完成核身后，可用该标识获取验证结果信息。
    */
    @SerializedName("EidToken")
    @Expose
    private String EidToken;

    /**
    * 发起核身流程的URL，用于H5场景核身。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 一次核身流程的标识，有效时间为600秒；
完成核身后，可用该标识获取验证结果信息。 
     * @return EidToken 一次核身流程的标识，有效时间为600秒；
完成核身后，可用该标识获取验证结果信息。
     */
    public String getEidToken() {
        return this.EidToken;
    }

    /**
     * Set 一次核身流程的标识，有效时间为600秒；
完成核身后，可用该标识获取验证结果信息。
     * @param EidToken 一次核身流程的标识，有效时间为600秒；
完成核身后，可用该标识获取验证结果信息。
     */
    public void setEidToken(String EidToken) {
        this.EidToken = EidToken;
    }

    /**
     * Get 发起核身流程的URL，用于H5场景核身。 
     * @return Url 发起核身流程的URL，用于H5场景核身。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 发起核身流程的URL，用于H5场景核身。
     * @param Url 发起核身流程的URL，用于H5场景核身。
     */
    public void setUrl(String Url) {
        this.Url = Url;
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

    public GetEidTokenResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetEidTokenResponse(GetEidTokenResponse source) {
        if (source.EidToken != null) {
            this.EidToken = new String(source.EidToken);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EidToken", this.EidToken);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

