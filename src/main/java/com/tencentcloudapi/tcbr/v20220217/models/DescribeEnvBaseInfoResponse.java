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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEnvBaseInfoResponse extends AbstractModel {

    /**
    * 环境基础信息
    */
    @SerializedName("EnvBaseInfo")
    @Expose
    private EnvBaseInfo EnvBaseInfo;

    /**
    * 是否存在
    */
    @SerializedName("IsExist")
    @Expose
    private Boolean IsExist;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 环境基础信息 
     * @return EnvBaseInfo 环境基础信息
     */
    public EnvBaseInfo getEnvBaseInfo() {
        return this.EnvBaseInfo;
    }

    /**
     * Set 环境基础信息
     * @param EnvBaseInfo 环境基础信息
     */
    public void setEnvBaseInfo(EnvBaseInfo EnvBaseInfo) {
        this.EnvBaseInfo = EnvBaseInfo;
    }

    /**
     * Get 是否存在 
     * @return IsExist 是否存在
     */
    public Boolean getIsExist() {
        return this.IsExist;
    }

    /**
     * Set 是否存在
     * @param IsExist 是否存在
     */
    public void setIsExist(Boolean IsExist) {
        this.IsExist = IsExist;
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

    public DescribeEnvBaseInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEnvBaseInfoResponse(DescribeEnvBaseInfoResponse source) {
        if (source.EnvBaseInfo != null) {
            this.EnvBaseInfo = new EnvBaseInfo(source.EnvBaseInfo);
        }
        if (source.IsExist != null) {
            this.IsExist = new Boolean(source.IsExist);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "EnvBaseInfo.", this.EnvBaseInfo);
        this.setParamSimple(map, prefix + "IsExist", this.IsExist);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

