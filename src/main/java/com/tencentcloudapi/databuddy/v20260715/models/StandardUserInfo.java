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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StandardUserInfo extends AbstractModel {

    /**
    * 用户UIN
    */
    @SerializedName("UserUin")
    @Expose
    private String UserUin;

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 昵称
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * 0: 普通用户 1: entraId用户
    */
    @SerializedName("UserTag")
    @Expose
    private String UserTag;

    /**
     * Get 用户UIN 
     * @return UserUin 用户UIN
     */
    public String getUserUin() {
        return this.UserUin;
    }

    /**
     * Set 用户UIN
     * @param UserUin 用户UIN
     */
    public void setUserUin(String UserUin) {
        this.UserUin = UserUin;
    }

    /**
     * Get 用户名 
     * @return UserName 用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名
     * @param UserName 用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 昵称 
     * @return Nickname 昵称
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set 昵称
     * @param Nickname 昵称
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get 0: 普通用户 1: entraId用户 
     * @return UserTag 0: 普通用户 1: entraId用户
     */
    public String getUserTag() {
        return this.UserTag;
    }

    /**
     * Set 0: 普通用户 1: entraId用户
     * @param UserTag 0: 普通用户 1: entraId用户
     */
    public void setUserTag(String UserTag) {
        this.UserTag = UserTag;
    }

    public StandardUserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StandardUserInfo(StandardUserInfo source) {
        if (source.UserUin != null) {
            this.UserUin = new String(source.UserUin);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.UserTag != null) {
            this.UserTag = new String(source.UserTag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "UserTag", this.UserTag);

    }
}

