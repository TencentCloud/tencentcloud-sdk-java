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

public class RemoveConsoleUsersRequest extends AbstractModel {

    /**
    * <p>必填，待移除的用户 UIN 列表，单次最多10个</p>
    */
    @SerializedName("UserUins")
    @Expose
    private String [] UserUins;

    /**
     * Get <p>必填，待移除的用户 UIN 列表，单次最多10个</p> 
     * @return UserUins <p>必填，待移除的用户 UIN 列表，单次最多10个</p>
     */
    public String [] getUserUins() {
        return this.UserUins;
    }

    /**
     * Set <p>必填，待移除的用户 UIN 列表，单次最多10个</p>
     * @param UserUins <p>必填，待移除的用户 UIN 列表，单次最多10个</p>
     */
    public void setUserUins(String [] UserUins) {
        this.UserUins = UserUins;
    }

    public RemoveConsoleUsersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveConsoleUsersRequest(RemoveConsoleUsersRequest source) {
        if (source.UserUins != null) {
            this.UserUins = new String[source.UserUins.length];
            for (int i = 0; i < source.UserUins.length; i++) {
                this.UserUins[i] = new String(source.UserUins[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "UserUins.", this.UserUins);

    }
}

