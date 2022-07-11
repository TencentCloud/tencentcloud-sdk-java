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
package com.tencentcloudapi.irp.v20220324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserIdInfo extends AbstractModel{

    /**
    * 用户id类型
    */
    @SerializedName("UserIdType")
    @Expose
    private Long UserIdType;

    /**
    * 用户id
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
     * Get 用户id类型 
     * @return UserIdType 用户id类型
     */
    public Long getUserIdType() {
        return this.UserIdType;
    }

    /**
     * Set 用户id类型
     * @param UserIdType 用户id类型
     */
    public void setUserIdType(Long UserIdType) {
        this.UserIdType = UserIdType;
    }

    /**
     * Get 用户id 
     * @return UserId 用户id
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户id
     * @param UserId 用户id
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public UserIdInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserIdInfo(UserIdInfo source) {
        if (source.UserIdType != null) {
            this.UserIdType = new Long(source.UserIdType);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserIdType", this.UserIdType);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

