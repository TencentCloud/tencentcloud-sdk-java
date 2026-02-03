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

public class DescribeLibraDBClusterAccountAllPrivilegesRequest extends AbstractModel {

    /**
    * 分析集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 账号
    */
    @SerializedName("Account")
    @Expose
    private InputAccount Account;

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
     * @return Account 账号
     */
    public InputAccount getAccount() {
        return this.Account;
    }

    /**
     * Set 账号
     * @param Account 账号
     */
    public void setAccount(InputAccount Account) {
        this.Account = Account;
    }

    public DescribeLibraDBClusterAccountAllPrivilegesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLibraDBClusterAccountAllPrivilegesRequest(DescribeLibraDBClusterAccountAllPrivilegesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Account != null) {
            this.Account = new InputAccount(source.Account);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamObj(map, prefix + "Account.", this.Account);

    }
}

