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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CredentialStatusInfo extends AbstractModel {

    /**
    * 凭证唯一id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 凭证状态（0：吊销；1：有效）
    */
    @SerializedName("Issuer")
    @Expose
    private String Issuer;

    /**
    * 凭证颁发者Did
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 凭证唯一id 
     * @return Id 凭证唯一id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 凭证唯一id
     * @param Id 凭证唯一id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 凭证状态（0：吊销；1：有效） 
     * @return Issuer 凭证状态（0：吊销；1：有效）
     */
    public String getIssuer() {
        return this.Issuer;
    }

    /**
     * Set 凭证状态（0：吊销；1：有效）
     * @param Issuer 凭证状态（0：吊销；1：有效）
     */
    public void setIssuer(String Issuer) {
        this.Issuer = Issuer;
    }

    /**
     * Get 凭证颁发者Did 
     * @return Status 凭证颁发者Did
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 凭证颁发者Did
     * @param Status 凭证颁发者Did
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public CredentialStatusInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CredentialStatusInfo(CredentialStatusInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Issuer != null) {
            this.Issuer = new String(source.Issuer);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Issuer", this.Issuer);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

