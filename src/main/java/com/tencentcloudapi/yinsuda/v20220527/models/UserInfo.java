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
package com.tencentcloudapi.yinsuda.v20220527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserInfo extends AbstractModel{

    /**
    * 应用名称。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 用户标识。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 直播会员详细信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LiveVipUserInfo")
    @Expose
    private LiveVipUserInfo LiveVipUserInfo;

    /**
    * 用户类型
<li>Normal：普通用户</li>
<li>LiveVip：直播会员用户</li>
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
     * Get 应用名称。 
     * @return AppName 应用名称。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 应用名称。
     * @param AppName 应用名称。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 用户标识。 
     * @return UserId 用户标识。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户标识。
     * @param UserId 用户标识。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 直播会员详细信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LiveVipUserInfo 直播会员详细信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LiveVipUserInfo getLiveVipUserInfo() {
        return this.LiveVipUserInfo;
    }

    /**
     * Set 直播会员详细信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LiveVipUserInfo 直播会员详细信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLiveVipUserInfo(LiveVipUserInfo LiveVipUserInfo) {
        this.LiveVipUserInfo = LiveVipUserInfo;
    }

    /**
     * Get 用户类型
<li>Normal：普通用户</li>
<li>LiveVip：直播会员用户</li> 
     * @return UserType 用户类型
<li>Normal：普通用户</li>
<li>LiveVip：直播会员用户</li>
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set 用户类型
<li>Normal：普通用户</li>
<li>LiveVip：直播会员用户</li>
     * @param UserType 用户类型
<li>Normal：普通用户</li>
<li>LiveVip：直播会员用户</li>
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    public UserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserInfo(UserInfo source) {
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.LiveVipUserInfo != null) {
            this.LiveVipUserInfo = new LiveVipUserInfo(source.LiveVipUserInfo);
        }
        if (source.UserType != null) {
            this.UserType = new String(source.UserType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamObj(map, prefix + "LiveVipUserInfo.", this.LiveVipUserInfo);
        this.setParamSimple(map, prefix + "UserType", this.UserType);

    }
}

