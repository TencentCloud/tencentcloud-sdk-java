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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserBaseInfoInstanceResponse extends AbstractModel{

    /**
    * 用户uin信息
    */
    @SerializedName("UserUin")
    @Expose
    private Long UserUin;

    /**
    * 用户APPID信息
    */
    @SerializedName("UserAppid")
    @Expose
    private Long UserAppid;

    /**
    * 系统时间戳
    */
    @SerializedName("TimeStamp")
    @Expose
    private Long TimeStamp;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用户uin信息 
     * @return UserUin 用户uin信息
     */
    public Long getUserUin() {
        return this.UserUin;
    }

    /**
     * Set 用户uin信息
     * @param UserUin 用户uin信息
     */
    public void setUserUin(Long UserUin) {
        this.UserUin = UserUin;
    }

    /**
     * Get 用户APPID信息 
     * @return UserAppid 用户APPID信息
     */
    public Long getUserAppid() {
        return this.UserAppid;
    }

    /**
     * Set 用户APPID信息
     * @param UserAppid 用户APPID信息
     */
    public void setUserAppid(Long UserAppid) {
        this.UserAppid = UserAppid;
    }

    /**
     * Get 系统时间戳 
     * @return TimeStamp 系统时间戳
     */
    public Long getTimeStamp() {
        return this.TimeStamp;
    }

    /**
     * Set 系统时间戳
     * @param TimeStamp 系统时间戳
     */
    public void setTimeStamp(Long TimeStamp) {
        this.TimeStamp = TimeStamp;
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
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);
        this.setParamSimple(map, prefix + "UserAppid", this.UserAppid);
        this.setParamSimple(map, prefix + "TimeStamp", this.TimeStamp);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

