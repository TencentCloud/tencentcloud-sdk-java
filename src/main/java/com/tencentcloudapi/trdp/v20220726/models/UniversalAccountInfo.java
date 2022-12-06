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

public class UniversalAccountInfo extends AbstractModel{

    /**
    * 账号值：
当账户类型为1时，填入手机号，如135****3695；
当账户类型为2、3或100时，填入对应的值。
    */
    @SerializedName("AccountId")
    @Expose
    private String AccountId;

    /**
     * Get 账号值：
当账户类型为1时，填入手机号，如135****3695；
当账户类型为2、3或100时，填入对应的值。 
     * @return AccountId 账号值：
当账户类型为1时，填入手机号，如135****3695；
当账户类型为2、3或100时，填入对应的值。
     */
    public String getAccountId() {
        return this.AccountId;
    }

    /**
     * Set 账号值：
当账户类型为1时，填入手机号，如135****3695；
当账户类型为2、3或100时，填入对应的值。
     * @param AccountId 账号值：
当账户类型为1时，填入手机号，如135****3695；
当账户类型为2、3或100时，填入对应的值。
     */
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    public UniversalAccountInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UniversalAccountInfo(UniversalAccountInfo source) {
        if (source.AccountId != null) {
            this.AccountId = new String(source.AccountId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountId", this.AccountId);

    }
}

