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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAndroidInstancesAccessTokenResponse extends AbstractModel {

    /**
    * token
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * 访问信息
    */
    @SerializedName("AccessInfo")
    @Expose
    private String AccessInfo;

    /**
    * 安卓实例错误列表。列表包含有问题的安卓实例 ID，生成的 Token 对这些有问题的实例无效。
    */
    @SerializedName("AndroidInstanceErrors")
    @Expose
    private AndroidInstanceError [] AndroidInstanceErrors;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get token 
     * @return Token token
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set token
     * @param Token token
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get 访问信息 
     * @return AccessInfo 访问信息
     */
    public String getAccessInfo() {
        return this.AccessInfo;
    }

    /**
     * Set 访问信息
     * @param AccessInfo 访问信息
     */
    public void setAccessInfo(String AccessInfo) {
        this.AccessInfo = AccessInfo;
    }

    /**
     * Get 安卓实例错误列表。列表包含有问题的安卓实例 ID，生成的 Token 对这些有问题的实例无效。 
     * @return AndroidInstanceErrors 安卓实例错误列表。列表包含有问题的安卓实例 ID，生成的 Token 对这些有问题的实例无效。
     */
    public AndroidInstanceError [] getAndroidInstanceErrors() {
        return this.AndroidInstanceErrors;
    }

    /**
     * Set 安卓实例错误列表。列表包含有问题的安卓实例 ID，生成的 Token 对这些有问题的实例无效。
     * @param AndroidInstanceErrors 安卓实例错误列表。列表包含有问题的安卓实例 ID，生成的 Token 对这些有问题的实例无效。
     */
    public void setAndroidInstanceErrors(AndroidInstanceError [] AndroidInstanceErrors) {
        this.AndroidInstanceErrors = AndroidInstanceErrors;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateAndroidInstancesAccessTokenResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAndroidInstancesAccessTokenResponse(CreateAndroidInstancesAccessTokenResponse source) {
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.AccessInfo != null) {
            this.AccessInfo = new String(source.AccessInfo);
        }
        if (source.AndroidInstanceErrors != null) {
            this.AndroidInstanceErrors = new AndroidInstanceError[source.AndroidInstanceErrors.length];
            for (int i = 0; i < source.AndroidInstanceErrors.length; i++) {
                this.AndroidInstanceErrors[i] = new AndroidInstanceError(source.AndroidInstanceErrors[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "AccessInfo", this.AccessInfo);
        this.setParamArrayObj(map, prefix + "AndroidInstanceErrors.", this.AndroidInstanceErrors);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

