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

public class RemoveAccountFromAccountGroupRequest extends AbstractModel{

    /**
    * 账号组ID
    */
    @SerializedName("AccountGroupId")
    @Expose
    private String AccountGroupId;

    /**
    * 需要移除账号ID列表。
    */
    @SerializedName("AccountIds")
    @Expose
    private String [] AccountIds;

    /**
     * Get 账号组ID 
     * @return AccountGroupId 账号组ID
     */
    public String getAccountGroupId() {
        return this.AccountGroupId;
    }

    /**
     * Set 账号组ID
     * @param AccountGroupId 账号组ID
     */
    public void setAccountGroupId(String AccountGroupId) {
        this.AccountGroupId = AccountGroupId;
    }

    /**
     * Get 需要移除账号ID列表。 
     * @return AccountIds 需要移除账号ID列表。
     */
    public String [] getAccountIds() {
        return this.AccountIds;
    }

    /**
     * Set 需要移除账号ID列表。
     * @param AccountIds 需要移除账号ID列表。
     */
    public void setAccountIds(String [] AccountIds) {
        this.AccountIds = AccountIds;
    }

    public RemoveAccountFromAccountGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveAccountFromAccountGroupRequest(RemoveAccountFromAccountGroupRequest source) {
        if (source.AccountGroupId != null) {
            this.AccountGroupId = new String(source.AccountGroupId);
        }
        if (source.AccountIds != null) {
            this.AccountIds = new String[source.AccountIds.length];
            for (int i = 0; i < source.AccountIds.length; i++) {
                this.AccountIds[i] = new String(source.AccountIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountGroupId", this.AccountGroupId);
        this.setParamArraySimple(map, prefix + "AccountIds.", this.AccountIds);

    }
}

