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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserMediaStream extends AbstractModel{

    /**
    * TRTC用户参数。
    */
    @SerializedName("UserInfo")
    @Expose
    private MixUserInfo UserInfo;

    /**
    * 主辅路流类型，0为摄像头，1为屏幕分享，不填默认为0。
    */
    @SerializedName("StreamType")
    @Expose
    private Long StreamType;

    /**
     * Get TRTC用户参数。 
     * @return UserInfo TRTC用户参数。
     */
    public MixUserInfo getUserInfo() {
        return this.UserInfo;
    }

    /**
     * Set TRTC用户参数。
     * @param UserInfo TRTC用户参数。
     */
    public void setUserInfo(MixUserInfo UserInfo) {
        this.UserInfo = UserInfo;
    }

    /**
     * Get 主辅路流类型，0为摄像头，1为屏幕分享，不填默认为0。 
     * @return StreamType 主辅路流类型，0为摄像头，1为屏幕分享，不填默认为0。
     */
    public Long getStreamType() {
        return this.StreamType;
    }

    /**
     * Set 主辅路流类型，0为摄像头，1为屏幕分享，不填默认为0。
     * @param StreamType 主辅路流类型，0为摄像头，1为屏幕分享，不填默认为0。
     */
    public void setStreamType(Long StreamType) {
        this.StreamType = StreamType;
    }

    public UserMediaStream() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserMediaStream(UserMediaStream source) {
        if (source.UserInfo != null) {
            this.UserInfo = new MixUserInfo(source.UserInfo);
        }
        if (source.StreamType != null) {
            this.StreamType = new Long(source.StreamType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "UserInfo.", this.UserInfo);
        this.setParamSimple(map, prefix + "StreamType", this.StreamType);

    }
}

