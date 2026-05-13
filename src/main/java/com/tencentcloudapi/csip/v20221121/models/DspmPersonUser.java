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

public class DspmPersonUser extends AbstractModel {

    /**
    * 个人id
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * 姓名
    */
    @SerializedName("PersonName")
    @Expose
    private String PersonName;

    /**
    * 手机号
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
     * Get 个人id 
     * @return PersonId 个人id
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 个人id
     * @param PersonId 个人id
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get 姓名 
     * @return PersonName 姓名
     */
    public String getPersonName() {
        return this.PersonName;
    }

    /**
     * Set 姓名
     * @param PersonName 姓名
     */
    public void setPersonName(String PersonName) {
        this.PersonName = PersonName;
    }

    /**
     * Get 手机号 
     * @return Phone 手机号
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 手机号
     * @param Phone 手机号
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public DspmPersonUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmPersonUser(DspmPersonUser source) {
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.PersonName != null) {
            this.PersonName = new String(source.PersonName);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "PersonName", this.PersonName);
        this.setParamSimple(map, prefix + "Phone", this.Phone);

    }
}

