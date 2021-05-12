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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CcnInfo extends AbstractModel{

    /**
    * 云联网所属账号
    */
    @SerializedName("AccountId")
    @Expose
    private String AccountId;

    /**
    * 云联网id
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
     * Get 云联网所属账号 
     * @return AccountId 云联网所属账号
     */
    public String getAccountId() {
        return this.AccountId;
    }

    /**
     * Set 云联网所属账号
     * @param AccountId 云联网所属账号
     */
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    /**
     * Get 云联网id 
     * @return CcnId 云联网id
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set 云联网id
     * @param CcnId 云联网id
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    public CcnInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CcnInfo(CcnInfo source) {
        if (source.AccountId != null) {
            this.AccountId = new String(source.AccountId);
        }
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountId", this.AccountId);
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);

    }
}

