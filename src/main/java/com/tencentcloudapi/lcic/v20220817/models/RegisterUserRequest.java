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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegisterUserRequest extends AbstractModel {

    /**
    * 低代码互动课堂的SdkAppId。
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 对应用户昵称。对应修改用户信息下“nickname“字段，在修改用户信息时，可以对该字段进行调整，从而更改用户的昵称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 用户在客户系统的Id，需要在同一应用下唯一。入参为空时默认赋值为UserId。
    */
    @SerializedName("OriginId")
    @Expose
    private String OriginId;

    /**
    * 用户头像。
    */
    @SerializedName("Avatar")
    @Expose
    private String Avatar;

    /**
     * Get 低代码互动课堂的SdkAppId。 
     * @return SdkAppId 低代码互动课堂的SdkAppId。
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 低代码互动课堂的SdkAppId。
     * @param SdkAppId 低代码互动课堂的SdkAppId。
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 对应用户昵称。对应修改用户信息下“nickname“字段，在修改用户信息时，可以对该字段进行调整，从而更改用户的昵称。 
     * @return Name 对应用户昵称。对应修改用户信息下“nickname“字段，在修改用户信息时，可以对该字段进行调整，从而更改用户的昵称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 对应用户昵称。对应修改用户信息下“nickname“字段，在修改用户信息时，可以对该字段进行调整，从而更改用户的昵称。
     * @param Name 对应用户昵称。对应修改用户信息下“nickname“字段，在修改用户信息时，可以对该字段进行调整，从而更改用户的昵称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 用户在客户系统的Id，需要在同一应用下唯一。入参为空时默认赋值为UserId。 
     * @return OriginId 用户在客户系统的Id，需要在同一应用下唯一。入参为空时默认赋值为UserId。
     */
    public String getOriginId() {
        return this.OriginId;
    }

    /**
     * Set 用户在客户系统的Id，需要在同一应用下唯一。入参为空时默认赋值为UserId。
     * @param OriginId 用户在客户系统的Id，需要在同一应用下唯一。入参为空时默认赋值为UserId。
     */
    public void setOriginId(String OriginId) {
        this.OriginId = OriginId;
    }

    /**
     * Get 用户头像。 
     * @return Avatar 用户头像。
     */
    public String getAvatar() {
        return this.Avatar;
    }

    /**
     * Set 用户头像。
     * @param Avatar 用户头像。
     */
    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
    }

    public RegisterUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegisterUserRequest(RegisterUserRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.OriginId != null) {
            this.OriginId = new String(source.OriginId);
        }
        if (source.Avatar != null) {
            this.Avatar = new String(source.Avatar);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "OriginId", this.OriginId);
        this.setParamSimple(map, prefix + "Avatar", this.Avatar);

    }
}

