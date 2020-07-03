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
package com.tencentcloudapi.bizlive.v20190313.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegisterIMRequest extends AbstractModel{

    /**
    * 用户昵称
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * 用户唯一ID，建议采用用户小程序OpenID加盐形式
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户头像URL
    */
    @SerializedName("HeadImgUrl")
    @Expose
    private String HeadImgUrl;

    /**
    * 用户身份，默认值：0，表示无特殊身份
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
     * Get 用户昵称 
     * @return Nickname 用户昵称
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set 用户昵称
     * @param Nickname 用户昵称
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get 用户唯一ID，建议采用用户小程序OpenID加盐形式 
     * @return UserId 用户唯一ID，建议采用用户小程序OpenID加盐形式
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户唯一ID，建议采用用户小程序OpenID加盐形式
     * @param UserId 用户唯一ID，建议采用用户小程序OpenID加盐形式
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户头像URL 
     * @return HeadImgUrl 用户头像URL
     */
    public String getHeadImgUrl() {
        return this.HeadImgUrl;
    }

    /**
     * Set 用户头像URL
     * @param HeadImgUrl 用户头像URL
     */
    public void setHeadImgUrl(String HeadImgUrl) {
        this.HeadImgUrl = HeadImgUrl;
    }

    /**
     * Get 用户身份，默认值：0，表示无特殊身份 
     * @return Level 用户身份，默认值：0，表示无特殊身份
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 用户身份，默认值：0，表示无特殊身份
     * @param Level 用户身份，默认值：0，表示无特殊身份
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "HeadImgUrl", this.HeadImgUrl);
        this.setParamSimple(map, prefix + "Level", this.Level);

    }
}

