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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class McuUserInfoParams extends AbstractModel {

    /**
    * 用户参数。
    */
    @SerializedName("UserInfo")
    @Expose
    private MixUserInfo UserInfo;

    /**
    * 混音的音量调整：取值范围是0到100，100为原始上行音量，不填默认为100，值越小则音量越低。
注：该参数只在音量白名单下配置生效，其他场景配置无效。
    */
    @SerializedName("SoundLevel")
    @Expose
    private Long SoundLevel;

    /**
     * Get 用户参数。 
     * @return UserInfo 用户参数。
     */
    public MixUserInfo getUserInfo() {
        return this.UserInfo;
    }

    /**
     * Set 用户参数。
     * @param UserInfo 用户参数。
     */
    public void setUserInfo(MixUserInfo UserInfo) {
        this.UserInfo = UserInfo;
    }

    /**
     * Get 混音的音量调整：取值范围是0到100，100为原始上行音量，不填默认为100，值越小则音量越低。
注：该参数只在音量白名单下配置生效，其他场景配置无效。 
     * @return SoundLevel 混音的音量调整：取值范围是0到100，100为原始上行音量，不填默认为100，值越小则音量越低。
注：该参数只在音量白名单下配置生效，其他场景配置无效。
     */
    public Long getSoundLevel() {
        return this.SoundLevel;
    }

    /**
     * Set 混音的音量调整：取值范围是0到100，100为原始上行音量，不填默认为100，值越小则音量越低。
注：该参数只在音量白名单下配置生效，其他场景配置无效。
     * @param SoundLevel 混音的音量调整：取值范围是0到100，100为原始上行音量，不填默认为100，值越小则音量越低。
注：该参数只在音量白名单下配置生效，其他场景配置无效。
     */
    public void setSoundLevel(Long SoundLevel) {
        this.SoundLevel = SoundLevel;
    }

    public McuUserInfoParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McuUserInfoParams(McuUserInfoParams source) {
        if (source.UserInfo != null) {
            this.UserInfo = new MixUserInfo(source.UserInfo);
        }
        if (source.SoundLevel != null) {
            this.SoundLevel = new Long(source.SoundLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "UserInfo.", this.UserInfo);
        this.setParamSimple(map, prefix + "SoundLevel", this.SoundLevel);

    }
}

