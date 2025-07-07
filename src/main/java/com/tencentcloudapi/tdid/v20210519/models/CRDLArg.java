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

public class CRDLArg extends AbstractModel {

    /**
    * CPT ID
    */
    @SerializedName("CPTId")
    @Expose
    private Long CPTId;

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
    * 凭证类型
    */
    @SerializedName("Type")
    @Expose
    private String [] Type;

    /**
    * 多方签名的用户did
    */
    @SerializedName("Parties")
    @Expose
    private String [] Parties;

    /**
     * Get CPT ID 
     * @return CPTId CPT ID
     */
    public Long getCPTId() {
        return this.CPTId;
    }

    /**
     * Set CPT ID
     * @param CPTId CPT ID
     */
    public void setCPTId(Long CPTId) {
        this.CPTId = CPTId;
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

    /**
     * Get 凭证类型 
     * @return Type 凭证类型
     */
    public String [] getType() {
        return this.Type;
    }

    /**
     * Set 凭证类型
     * @param Type 凭证类型
     */
    public void setType(String [] Type) {
        this.Type = Type;
    }

    /**
     * Get 多方签名的用户did 
     * @return Parties 多方签名的用户did
     */
    public String [] getParties() {
        return this.Parties;
    }

    /**
     * Set 多方签名的用户did
     * @param Parties 多方签名的用户did
     */
    public void setParties(String [] Parties) {
        this.Parties = Parties;
    }

    public CRDLArg() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CRDLArg(CRDLArg source) {
        if (source.CPTId != null) {
            this.CPTId = new Long(source.CPTId);
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
        if (source.Type != null) {
            this.Type = new String[source.Type.length];
            for (int i = 0; i < source.Type.length; i++) {
                this.Type[i] = new String(source.Type[i]);
            }
        }
        if (source.Parties != null) {
            this.Parties = new String[source.Parties.length];
            for (int i = 0; i < source.Parties.length; i++) {
                this.Parties[i] = new String(source.Parties[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CPTId", this.CPTId);
        this.setParamSimple(map, prefix + "Issuer", this.Issuer);
        this.setParamSimple(map, prefix + "ExpirationDate", this.ExpirationDate);
        this.setParamSimple(map, prefix + "ClaimJson", this.ClaimJson);
        this.setParamArraySimple(map, prefix + "Type.", this.Type);
        this.setParamArraySimple(map, prefix + "Parties.", this.Parties);

    }
}

