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

public class EnableDataKeyRequest extends AbstractModel {

    /**
    * 数据密钥唯一标识符
    */
    @SerializedName("DataKeyId")
    @Expose
    private String DataKeyId;

    /**
    * 可信服务成员账号信息,当前账号时管理员或者委派管理员时有效。
    */
    @SerializedName("MemberAccount")
    @Expose
    private MemberAccount MemberAccount;

    /**
     * Get 数据密钥唯一标识符 
     * @return DataKeyId 数据密钥唯一标识符
     */
    public String getDataKeyId() {
        return this.DataKeyId;
    }

    /**
     * Set 数据密钥唯一标识符
     * @param DataKeyId 数据密钥唯一标识符
     */
    public void setDataKeyId(String DataKeyId) {
        this.DataKeyId = DataKeyId;
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

    public EnableDataKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnableDataKeyRequest(EnableDataKeyRequest source) {
        if (source.DataKeyId != null) {
            this.DataKeyId = new String(source.DataKeyId);
        }
        if (source.MemberAccount != null) {
            this.MemberAccount = new MemberAccount(source.MemberAccount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataKeyId", this.DataKeyId);
        this.setParamObj(map, prefix + "MemberAccount.", this.MemberAccount);

    }
}

