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

public class GetFederationTokenResponse  extends AbstractModel{

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
    private Integer ExpiredTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取临时证书
     * @return Credentials 临时证书
     */
    public Credentials getCredentials() {
        return this.Credentials;
    }

    /**
     * 设置临时证书
     * @param Credentials 临时证书
     */
    public void setCredentials(Credentials Credentials) {
        this.Credentials = Credentials;
    }

    /**
     * 获取临时证书有效的时间，返回 Unix 时间戳，精确到秒
     * @return ExpiredTime 临时证书有效的时间，返回 Unix 时间戳，精确到秒
     */
    public Integer getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * 设置临时证书有效的时间，返回 Unix 时间戳，精确到秒
     * @param ExpiredTime 临时证书有效的时间，返回 Unix 时间戳，精确到秒
     */
    public void setExpiredTime(Integer ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Credentials.", this.Credentials);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

