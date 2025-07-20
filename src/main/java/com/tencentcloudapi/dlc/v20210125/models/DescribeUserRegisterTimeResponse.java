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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserRegisterTimeResponse extends AbstractModel {

    /**
    * 用户注册时间
    */
    @SerializedName("RegisterTime")
    @Expose
    private Long RegisterTime;

    /**
    * 是否时老用户
    */
    @SerializedName("IsOldUser")
    @Expose
    private Boolean IsOldUser;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用户注册时间 
     * @return RegisterTime 用户注册时间
     */
    public Long getRegisterTime() {
        return this.RegisterTime;
    }

    /**
     * Set 用户注册时间
     * @param RegisterTime 用户注册时间
     */
    public void setRegisterTime(Long RegisterTime) {
        this.RegisterTime = RegisterTime;
    }

    /**
     * Get 是否时老用户 
     * @return IsOldUser 是否时老用户
     */
    public Boolean getIsOldUser() {
        return this.IsOldUser;
    }

    /**
     * Set 是否时老用户
     * @param IsOldUser 是否时老用户
     */
    public void setIsOldUser(Boolean IsOldUser) {
        this.IsOldUser = IsOldUser;
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

    public DescribeUserRegisterTimeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserRegisterTimeResponse(DescribeUserRegisterTimeResponse source) {
        if (source.RegisterTime != null) {
            this.RegisterTime = new Long(source.RegisterTime);
        }
        if (source.IsOldUser != null) {
            this.IsOldUser = new Boolean(source.IsOldUser);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegisterTime", this.RegisterTime);
        this.setParamSimple(map, prefix + "IsOldUser", this.IsOldUser);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

