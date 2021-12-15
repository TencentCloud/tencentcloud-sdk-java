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

public class ListUsersInOrgNodeSearchCriteria extends AbstractModel{

    /**
    * 用户名，长度限制：64个字符。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 用户手机号。
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 用户邮箱。
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 用户状态，取值 NORMAL （正常）、FREEZE （已冻结）、LOCKED （已锁定）或 NOT_ENABLED （未启用）。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 用户创建时间，遵循 ISO 8601 标准。
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * 用户上次更新时间。
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private String LastUpdateTime;

    /**
    * 名称匹配搜索，匹配范围包括：用户名称、用户手机号。
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Get 用户名，长度限制：64个字符。 
     * @return UserName 用户名，长度限制：64个字符。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名，长度限制：64个字符。
     * @param UserName 用户名，长度限制：64个字符。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 用户手机号。 
     * @return Phone 用户手机号。
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 用户手机号。
     * @param Phone 用户手机号。
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 用户邮箱。 
     * @return Email 用户邮箱。
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 用户邮箱。
     * @param Email 用户邮箱。
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 用户状态，取值 NORMAL （正常）、FREEZE （已冻结）、LOCKED （已锁定）或 NOT_ENABLED （未启用）。 
     * @return Status 用户状态，取值 NORMAL （正常）、FREEZE （已冻结）、LOCKED （已锁定）或 NOT_ENABLED （未启用）。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 用户状态，取值 NORMAL （正常）、FREEZE （已冻结）、LOCKED （已锁定）或 NOT_ENABLED （未启用）。
     * @param Status 用户状态，取值 NORMAL （正常）、FREEZE （已冻结）、LOCKED （已锁定）或 NOT_ENABLED （未启用）。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 用户创建时间，遵循 ISO 8601 标准。 
     * @return CreationTime 用户创建时间，遵循 ISO 8601 标准。
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 用户创建时间，遵循 ISO 8601 标准。
     * @param CreationTime 用户创建时间，遵循 ISO 8601 标准。
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 用户上次更新时间。 
     * @return LastUpdateTime 用户上次更新时间。
     */
    public String getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set 用户上次更新时间。
     * @param LastUpdateTime 用户上次更新时间。
     */
    public void setLastUpdateTime(String LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * Get 名称匹配搜索，匹配范围包括：用户名称、用户手机号。 
     * @return Keyword 名称匹配搜索，匹配范围包括：用户名称、用户手机号。
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 名称匹配搜索，匹配范围包括：用户名称、用户手机号。
     * @param Keyword 名称匹配搜索，匹配范围包括：用户名称、用户手机号。
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public ListUsersInOrgNodeSearchCriteria() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListUsersInOrgNodeSearchCriteria(ListUsersInOrgNodeSearchCriteria source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new String(source.LastUpdateTime);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

