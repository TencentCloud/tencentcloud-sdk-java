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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePartnerAuthorizationLinkResponse extends AbstractModel {

    /**
    * 授权链接，以短链形式返回。短链的有效期参考回参中的 ExpiredTime。

注：

1. 非小程序和APP集成使用

2. 生成的链路后面不能再增加参数（会出现覆盖链接中已有参数导致错误）
    */
    @SerializedName("Link")
    @Expose
    private String Link;

    /**
    * 链接过期时间以 Unix 时间戳格式表示，从生成链接时间起，往后7天有效期。过期后短链将失效，无法打开。
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 授权链接，以短链形式返回。短链的有效期参考回参中的 ExpiredTime。

注：

1. 非小程序和APP集成使用

2. 生成的链路后面不能再增加参数（会出现覆盖链接中已有参数导致错误） 
     * @return Link 授权链接，以短链形式返回。短链的有效期参考回参中的 ExpiredTime。

注：

1. 非小程序和APP集成使用

2. 生成的链路后面不能再增加参数（会出现覆盖链接中已有参数导致错误）
     */
    public String getLink() {
        return this.Link;
    }

    /**
     * Set 授权链接，以短链形式返回。短链的有效期参考回参中的 ExpiredTime。

注：

1. 非小程序和APP集成使用

2. 生成的链路后面不能再增加参数（会出现覆盖链接中已有参数导致错误）
     * @param Link 授权链接，以短链形式返回。短链的有效期参考回参中的 ExpiredTime。

注：

1. 非小程序和APP集成使用

2. 生成的链路后面不能再增加参数（会出现覆盖链接中已有参数导致错误）
     */
    public void setLink(String Link) {
        this.Link = Link;
    }

    /**
     * Get 链接过期时间以 Unix 时间戳格式表示，从生成链接时间起，往后7天有效期。过期后短链将失效，无法打开。 
     * @return ExpireTime 链接过期时间以 Unix 时间戳格式表示，从生成链接时间起，往后7天有效期。过期后短链将失效，无法打开。
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 链接过期时间以 Unix 时间戳格式表示，从生成链接时间起，往后7天有效期。过期后短链将失效，无法打开。
     * @param ExpireTime 链接过期时间以 Unix 时间戳格式表示，从生成链接时间起，往后7天有效期。过期后短链将失效，无法打开。
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
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

    public CreatePartnerAuthorizationLinkResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePartnerAuthorizationLinkResponse(CreatePartnerAuthorizationLinkResponse source) {
        if (source.Link != null) {
            this.Link = new String(source.Link);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Link", this.Link);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

