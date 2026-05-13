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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmUinUser extends AbstractModel {

    /**
    * 账号uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 用户类型。1-主账号 2-子用户
    */
    @SerializedName("UserType")
    @Expose
    private Long UserType;

    /**
     * Get 账号uin 
     * @return Uin 账号uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 账号uin
     * @param Uin 账号uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 姓名 
     * @return Name 姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名
     * @param Name 姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 用户类型。1-主账号 2-子用户 
     * @return UserType 用户类型。1-主账号 2-子用户
     */
    public Long getUserType() {
        return this.UserType;
    }

    /**
     * Set 用户类型。1-主账号 2-子用户
     * @param UserType 用户类型。1-主账号 2-子用户
     */
    public void setUserType(Long UserType) {
        this.UserType = UserType;
    }

    public DspmUinUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmUinUser(DspmUinUser source) {
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.UserType != null) {
            this.UserType = new Long(source.UserType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "UserType", this.UserType);

    }
}

