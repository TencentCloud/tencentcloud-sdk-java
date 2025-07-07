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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetCredentialStateRequest extends AbstractModel {

    /**
    * 凭证唯一Id
    */
    @SerializedName("CredentialId")
    @Expose
    private String CredentialId;

    /**
    * 用户应用Id
    */
    @SerializedName("DAPId")
    @Expose
    private Long DAPId;

    /**
     * Get 凭证唯一Id 
     * @return CredentialId 凭证唯一Id
     */
    public String getCredentialId() {
        return this.CredentialId;
    }

    /**
     * Set 凭证唯一Id
     * @param CredentialId 凭证唯一Id
     */
    public void setCredentialId(String CredentialId) {
        this.CredentialId = CredentialId;
    }

    /**
     * Get 用户应用Id 
     * @return DAPId 用户应用Id
     */
    public Long getDAPId() {
        return this.DAPId;
    }

    /**
     * Set 用户应用Id
     * @param DAPId 用户应用Id
     */
    public void setDAPId(Long DAPId) {
        this.DAPId = DAPId;
    }

    public GetCredentialStateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetCredentialStateRequest(GetCredentialStateRequest source) {
        if (source.CredentialId != null) {
            this.CredentialId = new String(source.CredentialId);
        }
        if (source.DAPId != null) {
            this.DAPId = new Long(source.DAPId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CredentialId", this.CredentialId);
        this.setParamSimple(map, prefix + "DAPId", this.DAPId);

    }
}

