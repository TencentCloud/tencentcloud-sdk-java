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

public class FunctionArg extends AbstractModel{

    /**
    * CPT ID
    */
    @SerializedName("CptId")
    @Expose
    private Long CptId;

    /**
    * 签发者 did
    */
    @SerializedName("Issuer")
    @Expose
    private String Issuer;

    /**
    * 过期时间
    */
    @SerializedName("ExpirationDate")
    @Expose
    private String ExpirationDate;

    /**
    * 声明
    */
    @SerializedName("ClaimJson")
    @Expose
    private String ClaimJson;

    /**
     * Get CPT ID 
     * @return CptId CPT ID
     */
    public Long getCptId() {
        return this.CptId;
    }

    /**
     * Set CPT ID
     * @param CptId CPT ID
     */
    public void setCptId(Long CptId) {
        this.CptId = CptId;
    }

    /**
     * Get 签发者 did 
     * @return Issuer 签发者 did
     */
    public String getIssuer() {
        return this.Issuer;
    }

    /**
     * Set 签发者 did
     * @param Issuer 签发者 did
     */
    public void setIssuer(String Issuer) {
        this.Issuer = Issuer;
    }

    /**
     * Get 过期时间 
     * @return ExpirationDate 过期时间
     */
    public String getExpirationDate() {
        return this.ExpirationDate;
    }

    /**
     * Set 过期时间
     * @param ExpirationDate 过期时间
     */
    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    /**
     * Get 声明 
     * @return ClaimJson 声明
     */
    public String getClaimJson() {
        return this.ClaimJson;
    }

    /**
     * Set 声明
     * @param ClaimJson 声明
     */
    public void setClaimJson(String ClaimJson) {
        this.ClaimJson = ClaimJson;
    }

    public FunctionArg() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FunctionArg(FunctionArg source) {
        if (source.CptId != null) {
            this.CptId = new Long(source.CptId);
        }
        if (source.Issuer != null) {
            this.Issuer = new String(source.Issuer);
        }
        if (source.ExpirationDate != null) {
            this.ExpirationDate = new String(source.ExpirationDate);
        }
        if (source.ClaimJson != null) {
            this.ClaimJson = new String(source.ClaimJson);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CptId", this.CptId);
        this.setParamSimple(map, prefix + "Issuer", this.Issuer);
        this.setParamSimple(map, prefix + "ExpirationDate", this.ExpirationDate);
        this.setParamSimple(map, prefix + "ClaimJson", this.ClaimJson);

    }
}

