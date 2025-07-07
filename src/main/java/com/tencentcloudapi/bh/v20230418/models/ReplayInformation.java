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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReplayInformation extends AbstractModel {

    /**
    * 令牌
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * 会话开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 回放链接
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 回放类型 ，默认0， 1-rfb 2-mp4 3-ssh
    */
    @SerializedName("ReplayType")
    @Expose
    private Long ReplayType;

    /**
     * Get 令牌 
     * @return Token 令牌
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set 令牌
     * @param Token 令牌
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get 会话开始时间 
     * @return StartTime 会话开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 会话开始时间
     * @param StartTime 会话开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 回放链接 
     * @return Address 回放链接
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 回放链接
     * @param Address 回放链接
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 回放类型 ，默认0， 1-rfb 2-mp4 3-ssh 
     * @return ReplayType 回放类型 ，默认0， 1-rfb 2-mp4 3-ssh
     */
    public Long getReplayType() {
        return this.ReplayType;
    }

    /**
     * Set 回放类型 ，默认0， 1-rfb 2-mp4 3-ssh
     * @param ReplayType 回放类型 ，默认0， 1-rfb 2-mp4 3-ssh
     */
    public void setReplayType(Long ReplayType) {
        this.ReplayType = ReplayType;
    }

    public ReplayInformation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplayInformation(ReplayInformation source) {
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.ReplayType != null) {
            this.ReplayType = new Long(source.ReplayType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "ReplayType", this.ReplayType);

    }
}

