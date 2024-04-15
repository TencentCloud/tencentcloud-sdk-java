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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOrganizationAuthUrlResponse extends AbstractModel {

    /**
    * “H5”-H5长连接
"SHORT_H5"- H5短链
"APP"-小程序
"PC"-PC浏览器
链接有效期统一30天
    */
    @SerializedName("AuthUrl")
    @Expose
    private String AuthUrl;

    /**
    * 链接过期时间戳
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get “H5”-H5长连接
"SHORT_H5"- H5短链
"APP"-小程序
"PC"-PC浏览器
链接有效期统一30天 
     * @return AuthUrl “H5”-H5长连接
"SHORT_H5"- H5短链
"APP"-小程序
"PC"-PC浏览器
链接有效期统一30天
     */
    public String getAuthUrl() {
        return this.AuthUrl;
    }

    /**
     * Set “H5”-H5长连接
"SHORT_H5"- H5短链
"APP"-小程序
"PC"-PC浏览器
链接有效期统一30天
     * @param AuthUrl “H5”-H5长连接
"SHORT_H5"- H5短链
"APP"-小程序
"PC"-PC浏览器
链接有效期统一30天
     */
    public void setAuthUrl(String AuthUrl) {
        this.AuthUrl = AuthUrl;
    }

    /**
     * Get 链接过期时间戳 
     * @return ExpiredTime 链接过期时间戳
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 链接过期时间戳
     * @param ExpiredTime 链接过期时间戳
     */
    public void setExpiredTime(Long ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
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

    public CreateOrganizationAuthUrlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOrganizationAuthUrlResponse(CreateOrganizationAuthUrlResponse source) {
        if (source.AuthUrl != null) {
            this.AuthUrl = new String(source.AuthUrl);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new Long(source.ExpiredTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuthUrl", this.AuthUrl);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

