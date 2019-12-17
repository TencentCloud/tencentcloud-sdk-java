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

public class DetectAuthResponse extends AbstractModel{

    /**
    * 用于发起核身流程的URL，仅微信H5场景使用。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 一次核身流程的标识，有效时间为7,200秒；
完成核身后，可用该标识获取验证结果信息。
    */
    @SerializedName("BizToken")
    @Expose
    private String BizToken;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用于发起核身流程的URL，仅微信H5场景使用。 
     * @return Url 用于发起核身流程的URL，仅微信H5场景使用。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 用于发起核身流程的URL，仅微信H5场景使用。
     * @param Url 用于发起核身流程的URL，仅微信H5场景使用。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 一次核身流程的标识，有效时间为7,200秒；
完成核身后，可用该标识获取验证结果信息。 
     * @return BizToken 一次核身流程的标识，有效时间为7,200秒；
完成核身后，可用该标识获取验证结果信息。
     */
    public String getBizToken() {
        return this.BizToken;
    }

    /**
     * Set 一次核身流程的标识，有效时间为7,200秒；
完成核身后，可用该标识获取验证结果信息。
     * @param BizToken 一次核身流程的标识，有效时间为7,200秒；
完成核身后，可用该标识获取验证结果信息。
     */
    public void setBizToken(String BizToken) {
        this.BizToken = BizToken;
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
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "BizToken", this.BizToken);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

