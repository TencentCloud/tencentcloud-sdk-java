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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyUserRequest extends AbstractModel{

    /**
    * 用户Id，和CAM侧Uin匹配
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户描述
    */
    @SerializedName("UserDescription")
    @Expose
    private String UserDescription;

    /**
     * Get 用户Id，和CAM侧Uin匹配 
     * @return UserId 用户Id，和CAM侧Uin匹配
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户Id，和CAM侧Uin匹配
     * @param UserId 用户Id，和CAM侧Uin匹配
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户描述 
     * @return UserDescription 用户描述
     */
    public String getUserDescription() {
        return this.UserDescription;
    }

    /**
     * Set 用户描述
     * @param UserDescription 用户描述
     */
    public void setUserDescription(String UserDescription) {
        this.UserDescription = UserDescription;
    }

    public ModifyUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserRequest(ModifyUserRequest source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserDescription != null) {
            this.UserDescription = new String(source.UserDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserDescription", this.UserDescription);

    }
}

