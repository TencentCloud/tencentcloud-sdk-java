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

public class DevTokenInfo extends AbstractModel{

    /**
    * 客户的终端用户在IotVideo上的唯一标识id
    */
    @SerializedName("AccessId")
    @Expose
    private String AccessId;

    /**
    * 设备TID
    */
    @SerializedName("Tid")
    @Expose
    private String Tid;

    /**
    * IotVideo平台的accessToken
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
     * Get 客户的终端用户在IotVideo上的唯一标识id 
     * @return AccessId 客户的终端用户在IotVideo上的唯一标识id
     */
    public String getAccessId() {
        return this.AccessId;
    }

    /**
     * Set 客户的终端用户在IotVideo上的唯一标识id
     * @param AccessId 客户的终端用户在IotVideo上的唯一标识id
     */
    public void setAccessId(String AccessId) {
        this.AccessId = AccessId;
    }

    /**
     * Get 设备TID 
     * @return Tid 设备TID
     */
    public String getTid() {
        return this.Tid;
    }

    /**
     * Set 设备TID
     * @param Tid 设备TID
     */
    public void setTid(String Tid) {
        this.Tid = Tid;
    }

    /**
     * Get IotVideo平台的accessToken 
     * @return AccessToken IotVideo平台的accessToken
     */
    public String getAccessToken() {
        return this.AccessToken;
    }

    /**
     * Set IotVideo平台的accessToken
     * @param AccessToken IotVideo平台的accessToken
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessId", this.AccessId);
        this.setParamSimple(map, prefix + "Tid", this.Tid);
        this.setParamSimple(map, prefix + "AccessToken", this.AccessToken);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

