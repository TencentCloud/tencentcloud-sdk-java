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
package com.tencentcloudapi.trdp.v20220726.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccountInfo extends AbstractModel{

    /**
    * 用户账号类型：
1-手机号；
2-IMEI；
3-IDFA；
100-SSID类型
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
    * 通用账号信息，当AccountType为1、2、3、100时必填
    */
    @SerializedName("UniversalAccount")
    @Expose
    private UniversalAccountInfo UniversalAccount;

    /**
     * Get 用户账号类型：
1-手机号；
2-IMEI；
3-IDFA；
100-SSID类型 
     * @return AccountType 用户账号类型：
1-手机号；
2-IMEI；
3-IDFA；
100-SSID类型
     */
    public Long getAccountType() {
        return this.AccountType;
    }

    /**
     * Set 用户账号类型：
1-手机号；
2-IMEI；
3-IDFA；
100-SSID类型
     * @param AccountType 用户账号类型：
1-手机号；
2-IMEI；
3-IDFA；
100-SSID类型
     */
    public void setAccountType(Long AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get 通用账号信息，当AccountType为1、2、3、100时必填 
     * @return UniversalAccount 通用账号信息，当AccountType为1、2、3、100时必填
     */
    public UniversalAccountInfo getUniversalAccount() {
        return this.UniversalAccount;
    }

    /**
     * Set 通用账号信息，当AccountType为1、2、3、100时必填
     * @param UniversalAccount 通用账号信息，当AccountType为1、2、3、100时必填
     */
    public void setUniversalAccount(UniversalAccountInfo UniversalAccount) {
        this.UniversalAccount = UniversalAccount;
    }

    public AccountInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccountInfo(AccountInfo source) {
        if (source.AccountType != null) {
            this.AccountType = new Long(source.AccountType);
        }
        if (source.UniversalAccount != null) {
            this.UniversalAccount = new UniversalAccountInfo(source.UniversalAccount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamObj(map, prefix + "UniversalAccount.", this.UniversalAccount);

    }
}

