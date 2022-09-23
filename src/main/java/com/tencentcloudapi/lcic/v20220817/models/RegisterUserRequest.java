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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegisterUserRequest extends AbstractModel{

    /**
    * 低代码互动课堂的SdkAppId。
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 用户名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 用户在客户系统的Id，需要在同一应用下唯一。
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
     * Get 用户名称。 
     * @return Name 用户名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 用户名称。
     * @param Name 用户名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 用户在客户系统的Id，需要在同一应用下唯一。 
     * @return OriginId 用户在客户系统的Id，需要在同一应用下唯一。
     */
    public String getOriginId() {
        return this.OriginId;
    }

    /**
     * Set 用户在客户系统的Id，需要在同一应用下唯一。
     * @param OriginId 用户在客户系统的Id，需要在同一应用下唯一。
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

