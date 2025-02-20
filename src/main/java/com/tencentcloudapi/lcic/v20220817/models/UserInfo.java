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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserInfo extends AbstractModel {

    /**
    * 应用Id。
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 用户Id。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户昵称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 用户头像Url。
    */
    @SerializedName("Avatar")
    @Expose
    private String Avatar;

    /**
    * 用户在客户系统的Id
    */
    @SerializedName("OriginId")
    @Expose
    private String OriginId;

    /**
     * Get 应用Id。 
     * @return SdkAppId 应用Id。
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 应用Id。
     * @param SdkAppId 应用Id。
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 用户Id。 
     * @return UserId 用户Id。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户Id。
     * @param UserId 用户Id。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户昵称。 
     * @return Name 用户昵称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 用户昵称。
     * @param Name 用户昵称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 用户头像Url。 
     * @return Avatar 用户头像Url。
     */
    public String getAvatar() {
        return this.Avatar;
    }

    /**
     * Set 用户头像Url。
     * @param Avatar 用户头像Url。
     */
    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
    }

    /**
     * Get 用户在客户系统的Id 
     * @return OriginId 用户在客户系统的Id
     */
    public String getOriginId() {
        return this.OriginId;
    }

    /**
     * Set 用户在客户系统的Id
     * @param OriginId 用户在客户系统的Id
     */
    public void setOriginId(String OriginId) {
        this.OriginId = OriginId;
    }

    public UserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserInfo(UserInfo source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Avatar != null) {
            this.Avatar = new String(source.Avatar);
        }
        if (source.OriginId != null) {
            this.OriginId = new String(source.OriginId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Avatar", this.Avatar);
        this.setParamSimple(map, prefix + "OriginId", this.OriginId);

    }
}

