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
package com.tencentcloudapi.fwm.v20250611.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MemberInfo extends AbstractModel {

    /**
    * 成员AppId
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 成员Uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 成员昵称
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * 成员Id
    */
    @SerializedName("MemberId")
    @Expose
    private String MemberId;

    /**
     * Get 成员AppId 
     * @return AppId 成员AppId
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 成员AppId
     * @param AppId 成员AppId
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 成员Uin 
     * @return Uin 成员Uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 成员Uin
     * @param Uin 成员Uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 成员昵称 
     * @return Nickname 成员昵称
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set 成员昵称
     * @param Nickname 成员昵称
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get 成员Id 
     * @return MemberId 成员Id
     */
    public String getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 成员Id
     * @param MemberId 成员Id
     */
    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }

    public MemberInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MemberInfo(MemberInfo source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.MemberId != null) {
            this.MemberId = new String(source.MemberId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "MemberId", this.MemberId);

    }
}

