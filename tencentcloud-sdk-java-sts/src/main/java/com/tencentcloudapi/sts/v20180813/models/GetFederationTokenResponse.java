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
package com.tencentcloudapi.sts.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetFederationTokenResponse extends AbstractModel{

    /**
    * 临时证书
    */
    @SerializedName("Credentials")
    @Expose
    private Credentials Credentials;

    /**
    * 临时证书有效的时间，返回 Unix 时间戳，精确到秒
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
    * 证书有效的时间，以 iso8601 格式的 UTC 时间表示
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Expiration")
    @Expose
    private String Expiration;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 临时证书 
     * @return Credentials 临时证书
     */
    public Credentials getCredentials() {
        return this.Credentials;
    }

    /**
     * Set 临时证书
     * @param Credentials 临时证书
     */
    public void setCredentials(Credentials Credentials) {
        this.Credentials = Credentials;
    }

    /**
     * Get 临时证书有效的时间，返回 Unix 时间戳，精确到秒 
     * @return ExpiredTime 临时证书有效的时间，返回 Unix 时间戳，精确到秒
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 临时证书有效的时间，返回 Unix 时间戳，精确到秒
     * @param ExpiredTime 临时证书有效的时间，返回 Unix 时间戳，精确到秒
     */
    public void setExpiredTime(Long ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get 证书有效的时间，以 iso8601 格式的 UTC 时间表示
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Expiration 证书有效的时间，以 iso8601 格式的 UTC 时间表示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpiration() {
        return this.Expiration;
    }

    /**
     * Set 证书有效的时间，以 iso8601 格式的 UTC 时间表示
注意：此字段可能返回 null，表示取不到有效值。
     * @param Expiration 证书有效的时间，以 iso8601 格式的 UTC 时间表示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpiration(String Expiration) {
        this.Expiration = Expiration;
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
        this.setParamObj(map, prefix + "Credentials.", this.Credentials);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "Expiration", this.Expiration);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

