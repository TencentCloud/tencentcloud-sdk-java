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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAccountParamsRequest extends AbstractModel{

    /**
    * 集群id，不超过32个字符
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 账号信息
    */
    @SerializedName("Account")
    @Expose
    private InputAccount Account;

    /**
    * 数据库表权限数组,当前仅支持参数：max_user_connections
    */
    @SerializedName("AccountParams")
    @Expose
    private AccountParam [] AccountParams;

    /**
     * Get 集群id，不超过32个字符 
     * @return ClusterId 集群id，不超过32个字符
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id，不超过32个字符
     * @param ClusterId 集群id，不超过32个字符
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 账号信息 
     * @return Account 账号信息
     */
    public InputAccount getAccount() {
        return this.Account;
    }

    /**
     * Set 账号信息
     * @param Account 账号信息
     */
    public void setAccount(InputAccount Account) {
        this.Account = Account;
    }

    /**
     * Get 数据库表权限数组,当前仅支持参数：max_user_connections 
     * @return AccountParams 数据库表权限数组,当前仅支持参数：max_user_connections
     */
    public AccountParam [] getAccountParams() {
        return this.AccountParams;
    }

    /**
     * Set 数据库表权限数组,当前仅支持参数：max_user_connections
     * @param AccountParams 数据库表权限数组,当前仅支持参数：max_user_connections
     */
    public void setAccountParams(AccountParam [] AccountParams) {
        this.AccountParams = AccountParams;
    }

    public ModifyAccountParamsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAccountParamsRequest(ModifyAccountParamsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Account != null) {
            this.Account = new InputAccount(source.Account);
        }
        if (source.AccountParams != null) {
            this.AccountParams = new AccountParam[source.AccountParams.length];
            for (int i = 0; i < source.AccountParams.length; i++) {
                this.AccountParams[i] = new AccountParam(source.AccountParams[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamObj(map, prefix + "Account.", this.Account);
        this.setParamArrayObj(map, prefix + "AccountParams.", this.AccountParams);

    }
}

