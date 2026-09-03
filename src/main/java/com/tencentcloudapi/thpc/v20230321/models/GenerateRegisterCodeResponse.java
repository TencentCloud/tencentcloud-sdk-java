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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GenerateRegisterCodeResponse extends AbstractModel {

    /**
    * <p>集群队列的注册码,用于机器注册进入队列时使用</p><p>默认值：无</p>
    */
    @SerializedName("RegisterCode")
    @Expose
    private String RegisterCode;

    /**
    * <p>注册码的过期时间, unix时间戳格式</p>
    */
    @SerializedName("ExpireAt")
    @Expose
    private Long ExpireAt;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>集群队列的注册码,用于机器注册进入队列时使用</p><p>默认值：无</p> 
     * @return RegisterCode <p>集群队列的注册码,用于机器注册进入队列时使用</p><p>默认值：无</p>
     */
    public String getRegisterCode() {
        return this.RegisterCode;
    }

    /**
     * Set <p>集群队列的注册码,用于机器注册进入队列时使用</p><p>默认值：无</p>
     * @param RegisterCode <p>集群队列的注册码,用于机器注册进入队列时使用</p><p>默认值：无</p>
     */
    public void setRegisterCode(String RegisterCode) {
        this.RegisterCode = RegisterCode;
    }

    /**
     * Get <p>注册码的过期时间, unix时间戳格式</p> 
     * @return ExpireAt <p>注册码的过期时间, unix时间戳格式</p>
     */
    public Long getExpireAt() {
        return this.ExpireAt;
    }

    /**
     * Set <p>注册码的过期时间, unix时间戳格式</p>
     * @param ExpireAt <p>注册码的过期时间, unix时间戳格式</p>
     */
    public void setExpireAt(Long ExpireAt) {
        this.ExpireAt = ExpireAt;
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

    public GenerateRegisterCodeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GenerateRegisterCodeResponse(GenerateRegisterCodeResponse source) {
        if (source.RegisterCode != null) {
            this.RegisterCode = new String(source.RegisterCode);
        }
        if (source.ExpireAt != null) {
            this.ExpireAt = new Long(source.ExpireAt);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegisterCode", this.RegisterCode);
        this.setParamSimple(map, prefix + "ExpireAt", this.ExpireAt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

