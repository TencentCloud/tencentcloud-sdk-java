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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteLibraDBClusterAccountsRequest extends AbstractModel {

    /**
    * 分析集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 账号
    */
    @SerializedName("Accounts")
    @Expose
    private InputAccount [] Accounts;

    /**
     * Get 分析集群id 
     * @return ClusterId 分析集群id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 分析集群id
     * @param ClusterId 分析集群id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 账号 
     * @return Accounts 账号
     */
    public InputAccount [] getAccounts() {
        return this.Accounts;
    }

    /**
     * Set 账号
     * @param Accounts 账号
     */
    public void setAccounts(InputAccount [] Accounts) {
        this.Accounts = Accounts;
    }

    public DeleteLibraDBClusterAccountsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteLibraDBClusterAccountsRequest(DeleteLibraDBClusterAccountsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Accounts != null) {
            this.Accounts = new InputAccount[source.Accounts.length];
            for (int i = 0; i < source.Accounts.length; i++) {
                this.Accounts[i] = new InputAccount(source.Accounts[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "Accounts.", this.Accounts);

    }
}

