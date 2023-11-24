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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DTSParams extends AbstractModel {

    /**
    * Consumer Group Name
    */
    @SerializedName("ConsumerGroupName")
    @Expose
    private String ConsumerGroupName;

    /**
    * 账户名
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * 密码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get Consumer Group Name 
     * @return ConsumerGroupName Consumer Group Name
     */
    public String getConsumerGroupName() {
        return this.ConsumerGroupName;
    }

    /**
     * Set Consumer Group Name
     * @param ConsumerGroupName Consumer Group Name
     */
    public void setConsumerGroupName(String ConsumerGroupName) {
        this.ConsumerGroupName = ConsumerGroupName;
    }

    /**
     * Get 账户名 
     * @return Account 账户名
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set 账户名
     * @param Account 账户名
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get 密码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Password 密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 密码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Password 密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public DTSParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DTSParams(DTSParams source) {
        if (source.ConsumerGroupName != null) {
            this.ConsumerGroupName = new String(source.ConsumerGroupName);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsumerGroupName", this.ConsumerGroupName);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

