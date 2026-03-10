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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnableKeysRequest extends AbstractModel {

    /**
    * 需要批量启用的CMK Id 列表， CMK数量最大支持100
    */
    @SerializedName("KeyIds")
    @Expose
    private String [] KeyIds;

    /**
    * 可信服务成员账号信息,当前账号时管理员或者委派管理员时有效。
    */
    @SerializedName("MemberAccount")
    @Expose
    private MemberAccount MemberAccount;

    /**
     * Get 需要批量启用的CMK Id 列表， CMK数量最大支持100 
     * @return KeyIds 需要批量启用的CMK Id 列表， CMK数量最大支持100
     */
    public String [] getKeyIds() {
        return this.KeyIds;
    }

    /**
     * Set 需要批量启用的CMK Id 列表， CMK数量最大支持100
     * @param KeyIds 需要批量启用的CMK Id 列表， CMK数量最大支持100
     */
    public void setKeyIds(String [] KeyIds) {
        this.KeyIds = KeyIds;
    }

    /**
     * Get 可信服务成员账号信息,当前账号时管理员或者委派管理员时有效。 
     * @return MemberAccount 可信服务成员账号信息,当前账号时管理员或者委派管理员时有效。
     */
    public MemberAccount getMemberAccount() {
        return this.MemberAccount;
    }

    /**
     * Set 可信服务成员账号信息,当前账号时管理员或者委派管理员时有效。
     * @param MemberAccount 可信服务成员账号信息,当前账号时管理员或者委派管理员时有效。
     */
    public void setMemberAccount(MemberAccount MemberAccount) {
        this.MemberAccount = MemberAccount;
    }

    public EnableKeysRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnableKeysRequest(EnableKeysRequest source) {
        if (source.KeyIds != null) {
            this.KeyIds = new String[source.KeyIds.length];
            for (int i = 0; i < source.KeyIds.length; i++) {
                this.KeyIds[i] = new String(source.KeyIds[i]);
            }
        }
        if (source.MemberAccount != null) {
            this.MemberAccount = new MemberAccount(source.MemberAccount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "KeyIds.", this.KeyIds);
        this.setParamObj(map, prefix + "MemberAccount.", this.MemberAccount);

    }
}

