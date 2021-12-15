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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ThirdPartyAccountInfo extends AbstractModel{

    /**
    * 第三方账号代码。"2"代表企业微信。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountCode")
    @Expose
    private String AccountCode;

    /**
    * 账号对应的用户名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
     * Get 第三方账号代码。"2"代表企业微信。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountCode 第三方账号代码。"2"代表企业微信。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountCode() {
        return this.AccountCode;
    }

    /**
     * Set 第三方账号代码。"2"代表企业微信。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountCode 第三方账号代码。"2"代表企业微信。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountCode(String AccountCode) {
        this.AccountCode = AccountCode;
    }

    /**
     * Get 账号对应的用户名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountName 账号对应的用户名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set 账号对应的用户名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountName 账号对应的用户名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    public ThirdPartyAccountInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ThirdPartyAccountInfo(ThirdPartyAccountInfo source) {
        if (source.AccountCode != null) {
            this.AccountCode = new String(source.AccountCode);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountCode", this.AccountCode);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);

    }
}

