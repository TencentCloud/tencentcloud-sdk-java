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

public class DetectAuthResponse  extends AbstractModel{

    /**
    * 用于跳转的URL。只能于微信中打开。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 业务流水号。在获取认证信息接口中作为BizToken传入
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
     * 获取用于跳转的URL。只能于微信中打开。
     * @return Url 用于跳转的URL。只能于微信中打开。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * 设置用于跳转的URL。只能于微信中打开。
     * @param Url 用于跳转的URL。只能于微信中打开。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * 获取业务流水号。在获取认证信息接口中作为BizToken传入
     * @return BizToken 业务流水号。在获取认证信息接口中作为BizToken传入
     */
    public String getBizToken() {
        return this.BizToken;
    }

    /**
     * 设置业务流水号。在获取认证信息接口中作为BizToken传入
     * @param BizToken 业务流水号。在获取认证信息接口中作为BizToken传入
     */
    public void setBizToken(String BizToken) {
        this.BizToken = BizToken;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "BizToken", this.BizToken);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

