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

public class CreateLibraDBClusterAccountsRequest extends AbstractModel {

    /**
    * 分析集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 账户信息
    */
    @SerializedName("Accounts")
    @Expose
    private NewAccount [] Accounts;

    /**
    * 加密方式
    */
    @SerializedName("EncryptMethod")
    @Expose
    private String EncryptMethod;

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
     * Get 账户信息 
     * @return Accounts 账户信息
     */
    public NewAccount [] getAccounts() {
        return this.Accounts;
    }

    /**
     * Set 账户信息
     * @param Accounts 账户信息
     */
    public void setAccounts(NewAccount [] Accounts) {
        this.Accounts = Accounts;
    }

    /**
     * Get 加密方式 
     * @return EncryptMethod 加密方式
     */
    public String getEncryptMethod() {
        return this.EncryptMethod;
    }

    /**
     * Set 加密方式
     * @param EncryptMethod 加密方式
     */
    public void setEncryptMethod(String EncryptMethod) {
        this.EncryptMethod = EncryptMethod;
    }

    public CreateLibraDBClusterAccountsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLibraDBClusterAccountsRequest(CreateLibraDBClusterAccountsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Accounts != null) {
            this.Accounts = new NewAccount[source.Accounts.length];
            for (int i = 0; i < source.Accounts.length; i++) {
                this.Accounts[i] = new NewAccount(source.Accounts[i]);
            }
        }
        if (source.EncryptMethod != null) {
            this.EncryptMethod = new String(source.EncryptMethod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "Accounts.", this.Accounts);
        this.setParamSimple(map, prefix + "EncryptMethod", this.EncryptMethod);

    }
}

