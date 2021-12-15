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

public class AccountGroupInfo extends AbstractModel{

    /**
    * 账号组ID。
    */
    @SerializedName("AccountGroupId")
    @Expose
    private String AccountGroupId;

    /**
    * 账号组名。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 备注。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间。
    */
    @SerializedName("CreatedDate")
    @Expose
    private String CreatedDate;

    /**
     * Get 账号组ID。 
     * @return AccountGroupId 账号组ID。
     */
    public String getAccountGroupId() {
        return this.AccountGroupId;
    }

    /**
     * Set 账号组ID。
     * @param AccountGroupId 账号组ID。
     */
    public void setAccountGroupId(String AccountGroupId) {
        this.AccountGroupId = AccountGroupId;
    }

    /**
     * Get 账号组名。 
     * @return GroupName 账号组名。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 账号组名。
     * @param GroupName 账号组名。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 备注。 
     * @return Description 备注。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 备注。
     * @param Description 备注。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 创建时间。 
     * @return CreatedDate 创建时间。
     */
    public String getCreatedDate() {
        return this.CreatedDate;
    }

    /**
     * Set 创建时间。
     * @param CreatedDate 创建时间。
     */
    public void setCreatedDate(String CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    public AccountGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccountGroupInfo(AccountGroupInfo source) {
        if (source.AccountGroupId != null) {
            this.AccountGroupId = new String(source.AccountGroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreatedDate != null) {
            this.CreatedDate = new String(source.CreatedDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountGroupId", this.AccountGroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreatedDate", this.CreatedDate);

    }
}

