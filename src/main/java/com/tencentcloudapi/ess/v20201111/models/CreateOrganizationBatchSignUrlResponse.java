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

public class CreateOrganizationBatchSignUrlResponse extends AbstractModel {

    /**
    * 批量签署入口链接，用户可使用这个链接跳转到控制台页面对合同进行签署操作。
    */
    @SerializedName("SignUrl")
    @Expose
    private String SignUrl;

    /**
    * 链接过期截止时间，格式为Unix标准时间戳（秒），默认为7天后截止。
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
     * Get 批量签署入口链接，用户可使用这个链接跳转到控制台页面对合同进行签署操作。 
     * @return SignUrl 批量签署入口链接，用户可使用这个链接跳转到控制台页面对合同进行签署操作。
     */
    public String getSignUrl() {
        return this.SignUrl;
    }

    /**
     * Set 批量签署入口链接，用户可使用这个链接跳转到控制台页面对合同进行签署操作。
     * @param SignUrl 批量签署入口链接，用户可使用这个链接跳转到控制台页面对合同进行签署操作。
     */
    public void setSignUrl(String SignUrl) {
        this.SignUrl = SignUrl;
    }

    /**
     * Get 链接过期截止时间，格式为Unix标准时间戳（秒），默认为7天后截止。 
     * @return ExpiredTime 链接过期截止时间，格式为Unix标准时间戳（秒），默认为7天后截止。
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 链接过期截止时间，格式为Unix标准时间戳（秒），默认为7天后截止。
     * @param ExpiredTime 链接过期截止时间，格式为Unix标准时间戳（秒），默认为7天后截止。
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

    public CreateOrganizationBatchSignUrlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOrganizationBatchSignUrlResponse(CreateOrganizationBatchSignUrlResponse source) {
        if (source.SignUrl != null) {
            this.SignUrl = new String(source.SignUrl);
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
        this.setParamSimple(map, prefix + "SignUrl", this.SignUrl);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

