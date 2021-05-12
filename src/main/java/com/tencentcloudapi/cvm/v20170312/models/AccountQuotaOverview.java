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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccountQuotaOverview extends AbstractModel{

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 配额数据
    */
    @SerializedName("AccountQuota")
    @Expose
    private AccountQuota AccountQuota;

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 配额数据 
     * @return AccountQuota 配额数据
     */
    public AccountQuota getAccountQuota() {
        return this.AccountQuota;
    }

    /**
     * Set 配额数据
     * @param AccountQuota 配额数据
     */
    public void setAccountQuota(AccountQuota AccountQuota) {
        this.AccountQuota = AccountQuota;
    }

    public AccountQuotaOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccountQuotaOverview(AccountQuotaOverview source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.AccountQuota != null) {
            this.AccountQuota = new AccountQuota(source.AccountQuota);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamObj(map, prefix + "AccountQuota.", this.AccountQuota);

    }
}

