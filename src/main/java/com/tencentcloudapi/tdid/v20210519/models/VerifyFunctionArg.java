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

public class VerifyFunctionArg extends AbstractModel{

    /**
    * CPT ID
    */
    @SerializedName("CptId")
    @Expose
    private Long CptId;

    /**
    * issuer did
    */
    @SerializedName("Issuer")
    @Expose
    private String Issuer;

    /**
    * 过期时间
    */
    @SerializedName("ExpirationDate")
    @Expose
    private Long ExpirationDate;

    /**
    * 声明
    */
    @SerializedName("ClaimJson")
    @Expose
    private String ClaimJson;

    /**
    * 颁发时间
    */
    @SerializedName("IssuanceDate")
    @Expose
    private Long IssuanceDate;

    /**
    * context值
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * id值
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 签名值
    */
    @SerializedName("Proof")
    @Expose
    private Proof Proof;

    /**
    * type值
    */
    @SerializedName("Type")
    @Expose
    private String [] Type;

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
     * Get issuer did 
     * @return Issuer issuer did
     */
    public String getIssuer() {
        return this.Issuer;
    }

    /**
     * Set issuer did
     * @param Issuer issuer did
     */
    public void setIssuer(String Issuer) {
        this.Issuer = Issuer;
    }

    /**
     * Get 过期时间 
     * @return ExpirationDate 过期时间
     */
    public Long getExpirationDate() {
        return this.ExpirationDate;
    }

    /**
     * Set 过期时间
     * @param ExpirationDate 过期时间
     */
    public void setExpirationDate(Long ExpirationDate) {
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
     * Get 颁发时间 
     * @return IssuanceDate 颁发时间
     */
    public Long getIssuanceDate() {
        return this.IssuanceDate;
    }

    /**
     * Set 颁发时间
     * @param IssuanceDate 颁发时间
     */
    public void setIssuanceDate(Long IssuanceDate) {
        this.IssuanceDate = IssuanceDate;
    }

    /**
     * Get context值 
     * @return Context context值
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set context值
     * @param Context context值
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get id值 
     * @return Id id值
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set id值
     * @param Id id值
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 签名值 
     * @return Proof 签名值
     */
    public Proof getProof() {
        return this.Proof;
    }

    /**
     * Set 签名值
     * @param Proof 签名值
     */
    public void setProof(Proof Proof) {
        this.Proof = Proof;
    }

    /**
     * Get type值 
     * @return Type type值
     */
    public String [] getType() {
        return this.Type;
    }

    /**
     * Set type值
     * @param Type type值
     */
    public void setType(String [] Type) {
        this.Type = Type;
    }

    public VerifyFunctionArg() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyFunctionArg(VerifyFunctionArg source) {
        if (source.CptId != null) {
            this.CptId = new Long(source.CptId);
        }
        if (source.Issuer != null) {
            this.Issuer = new String(source.Issuer);
        }
        if (source.ExpirationDate != null) {
            this.ExpirationDate = new Long(source.ExpirationDate);
        }
        if (source.ClaimJson != null) {
            this.ClaimJson = new String(source.ClaimJson);
        }
        if (source.IssuanceDate != null) {
            this.IssuanceDate = new Long(source.IssuanceDate);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Proof != null) {
            this.Proof = new Proof(source.Proof);
        }
        if (source.Type != null) {
            this.Type = new String[source.Type.length];
            for (int i = 0; i < source.Type.length; i++) {
                this.Type[i] = new String(source.Type[i]);
            }
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
        this.setParamSimple(map, prefix + "IssuanceDate", this.IssuanceDate);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamObj(map, prefix + "Proof.", this.Proof);
        this.setParamArraySimple(map, prefix + "Type.", this.Type);

    }
}

