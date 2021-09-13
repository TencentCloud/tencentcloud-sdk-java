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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrivateDNSAccount extends AbstractModel{

    /**
    * 主账号Uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 主账号名称
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * 用户昵称
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
     * Get 主账号Uin 
     * @return Uin 主账号Uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 主账号Uin
     * @param Uin 主账号Uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 主账号名称 
     * @return Account 主账号名称
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set 主账号名称
     * @param Account 主账号名称
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get 用户昵称 
     * @return Nickname 用户昵称
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set 用户昵称
     * @param Nickname 用户昵称
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    public PrivateDNSAccount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrivateDNSAccount(PrivateDNSAccount source) {
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);

    }
}

