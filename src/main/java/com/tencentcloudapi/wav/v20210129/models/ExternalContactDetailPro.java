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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExternalContactDetailPro extends AbstractModel{

    /**
    * 客户信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Customer")
    @Expose
    private ExternalContact Customer;

    /**
    * 添加了此外部联系人的企业成员信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FollowUser")
    @Expose
    private FollowUserPro [] FollowUser;

    /**
     * Get 客户信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Customer 客户信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExternalContact getCustomer() {
        return this.Customer;
    }

    /**
     * Set 客户信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Customer 客户信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomer(ExternalContact Customer) {
        this.Customer = Customer;
    }

    /**
     * Get 添加了此外部联系人的企业成员信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FollowUser 添加了此外部联系人的企业成员信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FollowUserPro [] getFollowUser() {
        return this.FollowUser;
    }

    /**
     * Set 添加了此外部联系人的企业成员信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param FollowUser 添加了此外部联系人的企业成员信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFollowUser(FollowUserPro [] FollowUser) {
        this.FollowUser = FollowUser;
    }

    public ExternalContactDetailPro() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExternalContactDetailPro(ExternalContactDetailPro source) {
        if (source.Customer != null) {
            this.Customer = new ExternalContact(source.Customer);
        }
        if (source.FollowUser != null) {
            this.FollowUser = new FollowUserPro[source.FollowUser.length];
            for (int i = 0; i < source.FollowUser.length; i++) {
                this.FollowUser[i] = new FollowUserPro(source.FollowUser[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Customer.", this.Customer);
        this.setParamArrayObj(map, prefix + "FollowUser.", this.FollowUser);

    }
}

