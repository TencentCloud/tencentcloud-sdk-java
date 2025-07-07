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
package com.tencentcloudapi.sts.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssumeRoleWithSAMLResponse extends AbstractModel {

    /**
    * 对象里面包含 Token，TmpSecretId，TmpSecretKey 三元组
    */
    @SerializedName("Credentials")
    @Expose
    private Credentials Credentials;

    /**
    * 临时访问凭证的过期时间，返回 Unix 时间戳，精确到秒
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
    * 临时访问凭证的过期时间，以 ISO8601 格式的 UTC 时间表示
    */
    @SerializedName("Expiration")
    @Expose
    private String Expiration;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 对象里面包含 Token，TmpSecretId，TmpSecretKey 三元组 
     * @return Credentials 对象里面包含 Token，TmpSecretId，TmpSecretKey 三元组
     */
    public Credentials getCredentials() {
        return this.Credentials;
    }

    /**
     * Set 对象里面包含 Token，TmpSecretId，TmpSecretKey 三元组
     * @param Credentials 对象里面包含 Token，TmpSecretId，TmpSecretKey 三元组
     */
    public void setCredentials(Credentials Credentials) {
        this.Credentials = Credentials;
    }

    /**
     * Get 临时访问凭证的过期时间，返回 Unix 时间戳，精确到秒 
     * @return ExpiredTime 临时访问凭证的过期时间，返回 Unix 时间戳，精确到秒
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 临时访问凭证的过期时间，返回 Unix 时间戳，精确到秒
     * @param ExpiredTime 临时访问凭证的过期时间，返回 Unix 时间戳，精确到秒
     */
    public void setExpiredTime(Long ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get 临时访问凭证的过期时间，以 ISO8601 格式的 UTC 时间表示 
     * @return Expiration 临时访问凭证的过期时间，以 ISO8601 格式的 UTC 时间表示
     */
    public String getExpiration() {
        return this.Expiration;
    }

    /**
     * Set 临时访问凭证的过期时间，以 ISO8601 格式的 UTC 时间表示
     * @param Expiration 临时访问凭证的过期时间，以 ISO8601 格式的 UTC 时间表示
     */
    public void setExpiration(String Expiration) {
        this.Expiration = Expiration;
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

    public AssumeRoleWithSAMLResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssumeRoleWithSAMLResponse(AssumeRoleWithSAMLResponse source) {
        if (source.Credentials != null) {
            this.Credentials = new Credentials(source.Credentials);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new Long(source.ExpiredTime);
        }
        if (source.Expiration != null) {
            this.Expiration = new String(source.Expiration);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Credentials.", this.Credentials);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "Expiration", this.Expiration);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

