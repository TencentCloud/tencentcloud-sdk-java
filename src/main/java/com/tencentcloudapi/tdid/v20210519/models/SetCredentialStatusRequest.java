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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetCredentialStatusRequest extends AbstractModel{

    /**
    * 凭证状态
    */
    @SerializedName("CredentialStatus")
    @Expose
    private CredentialStatus CredentialStatus;

    /**
     * Get 凭证状态 
     * @return CredentialStatus 凭证状态
     */
    public CredentialStatus getCredentialStatus() {
        return this.CredentialStatus;
    }

    /**
     * Set 凭证状态
     * @param CredentialStatus 凭证状态
     */
    public void setCredentialStatus(CredentialStatus CredentialStatus) {
        this.CredentialStatus = CredentialStatus;
    }

    public SetCredentialStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetCredentialStatusRequest(SetCredentialStatusRequest source) {
        if (source.CredentialStatus != null) {
            this.CredentialStatus = new CredentialStatus(source.CredentialStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CredentialStatus.", this.CredentialStatus);

    }
}

