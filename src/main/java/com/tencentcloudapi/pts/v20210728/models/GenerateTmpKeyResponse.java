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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GenerateTmpKeyResponse extends AbstractModel{

    /**
    * 临时访问凭证获取时刻的时间戳（单位秒）
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 临时访问凭证超时 时刻的时间戳（单位秒）
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
    * 临时访问凭证
    */
    @SerializedName("Credentials")
    @Expose
    private Credentials Credentials;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 临时访问凭证获取时刻的时间戳（单位秒） 
     * @return StartTime 临时访问凭证获取时刻的时间戳（单位秒）
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 临时访问凭证获取时刻的时间戳（单位秒）
     * @param StartTime 临时访问凭证获取时刻的时间戳（单位秒）
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 临时访问凭证超时 时刻的时间戳（单位秒） 
     * @return ExpiredTime 临时访问凭证超时 时刻的时间戳（单位秒）
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 临时访问凭证超时 时刻的时间戳（单位秒）
     * @param ExpiredTime 临时访问凭证超时 时刻的时间戳（单位秒）
     */
    public void setExpiredTime(Long ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get 临时访问凭证 
     * @return Credentials 临时访问凭证
     */
    public Credentials getCredentials() {
        return this.Credentials;
    }

    /**
     * Set 临时访问凭证
     * @param Credentials 临时访问凭证
     */
    public void setCredentials(Credentials Credentials) {
        this.Credentials = Credentials;
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

    public GenerateTmpKeyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GenerateTmpKeyResponse(GenerateTmpKeyResponse source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new Long(source.ExpiredTime);
        }
        if (source.Credentials != null) {
            this.Credentials = new Credentials(source.Credentials);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamObj(map, prefix + "Credentials.", this.Credentials);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

