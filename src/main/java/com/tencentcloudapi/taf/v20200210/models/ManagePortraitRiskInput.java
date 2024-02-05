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
package com.tencentcloudapi.taf.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManagePortraitRiskInput extends AbstractModel {

    /**
    * 请求时间戳秒
    */
    @SerializedName("PostTime")
    @Expose
    private Long PostTime;

    /**
    * 用户公网ip（仅支持IPv4）
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
    * 渠道号
    */
    @SerializedName("Channel")
    @Expose
    private Long Channel;

    /**
     * Get 请求时间戳秒 
     * @return PostTime 请求时间戳秒
     */
    public Long getPostTime() {
        return this.PostTime;
    }

    /**
     * Set 请求时间戳秒
     * @param PostTime 请求时间戳秒
     */
    public void setPostTime(Long PostTime) {
        this.PostTime = PostTime;
    }

    /**
     * Get 用户公网ip（仅支持IPv4） 
     * @return UserIp 用户公网ip（仅支持IPv4）
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set 用户公网ip（仅支持IPv4）
     * @param UserIp 用户公网ip（仅支持IPv4）
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    /**
     * Get 渠道号 
     * @return Channel 渠道号
     */
    public Long getChannel() {
        return this.Channel;
    }

    /**
     * Set 渠道号
     * @param Channel 渠道号
     */
    public void setChannel(Long Channel) {
        this.Channel = Channel;
    }

    public ManagePortraitRiskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManagePortraitRiskInput(ManagePortraitRiskInput source) {
        if (source.PostTime != null) {
            this.PostTime = new Long(source.PostTime);
        }
        if (source.UserIp != null) {
            this.UserIp = new String(source.UserIp);
        }
        if (source.Channel != null) {
            this.Channel = new Long(source.Channel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PostTime", this.PostTime);
        this.setParamSimple(map, prefix + "UserIp", this.UserIp);
        this.setParamSimple(map, prefix + "Channel", this.Channel);

    }
}

