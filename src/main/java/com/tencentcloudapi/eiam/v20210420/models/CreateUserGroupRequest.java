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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUserGroupRequest extends AbstractModel{

    /**
    * 用户组昵称，长度限制：64个字符。 DisplayName是唯一的。
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 用户组备注，长度限制：512个字符。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 用户组昵称，长度限制：64个字符。 DisplayName是唯一的。 
     * @return DisplayName 用户组昵称，长度限制：64个字符。 DisplayName是唯一的。
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 用户组昵称，长度限制：64个字符。 DisplayName是唯一的。
     * @param DisplayName 用户组昵称，长度限制：64个字符。 DisplayName是唯一的。
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 用户组备注，长度限制：512个字符。 
     * @return Description 用户组备注，长度限制：512个字符。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 用户组备注，长度限制：512个字符。
     * @param Description 用户组备注，长度限制：512个字符。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateUserGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserGroupRequest(CreateUserGroupRequest source) {
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

