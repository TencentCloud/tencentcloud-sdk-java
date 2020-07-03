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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUsrTokenResponse extends AbstractModel{

    /**
    * 终端用户在IoT Video上的唯一标识ID
    */
    @SerializedName("AccessId")
    @Expose
    private String AccessId;

    /**
    * IoT Video平台的AccessToken
    */
    @SerializedName("AccessToken")
    @Expose
    private String AccessToken;

    /**
    * Token的过期时间，单位秒(UTC时间)
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 终端ID
    */
    @SerializedName("TerminalId")
    @Expose
    private String TerminalId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 终端用户在IoT Video上的唯一标识ID 
     * @return AccessId 终端用户在IoT Video上的唯一标识ID
     */
    public String getAccessId() {
        return this.AccessId;
    }

    /**
     * Set 终端用户在IoT Video上的唯一标识ID
     * @param AccessId 终端用户在IoT Video上的唯一标识ID
     */
    public void setAccessId(String AccessId) {
        this.AccessId = AccessId;
    }

    /**
     * Get IoT Video平台的AccessToken 
     * @return AccessToken IoT Video平台的AccessToken
     */
    public String getAccessToken() {
        return this.AccessToken;
    }

    /**
     * Set IoT Video平台的AccessToken
     * @param AccessToken IoT Video平台的AccessToken
     */
    public void setAccessToken(String AccessToken) {
        this.AccessToken = AccessToken;
    }

    /**
     * Get Token的过期时间，单位秒(UTC时间) 
     * @return ExpireTime Token的过期时间，单位秒(UTC时间)
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Token的过期时间，单位秒(UTC时间)
     * @param ExpireTime Token的过期时间，单位秒(UTC时间)
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 终端ID 
     * @return TerminalId 终端ID
     */
    public String getTerminalId() {
        return this.TerminalId;
    }

    /**
     * Set 终端ID
     * @param TerminalId 终端ID
     */
    public void setTerminalId(String TerminalId) {
        this.TerminalId = TerminalId;
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
        this.setParamSimple(map, prefix + "AccessId", this.AccessId);
        this.setParamSimple(map, prefix + "AccessToken", this.AccessToken);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "TerminalId", this.TerminalId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

