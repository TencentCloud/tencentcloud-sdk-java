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

public class CredentialState extends AbstractModel {

    /**
    * 凭证唯一id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 凭证状态（0：吊销；1：有效）
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 凭证颁发者Did
    */
    @SerializedName("Issuer")
    @Expose
    private String Issuer;

    /**
    * VC摘要，对应凭证Proof的vcDigest字段
    */
    @SerializedName("VCDigest")
    @Expose
    private String VCDigest;

    /**
    * 交易摘要，对应凭证Proof的txDigest字段 
    */
    @SerializedName("TXDigest")
    @Expose
    private String TXDigest;

    /**
    * 颁布凭证的UTC时间戳
    */
    @SerializedName("IssueTime")
    @Expose
    private Long IssueTime;

    /**
    * 凭证过期的UTC时间戳
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 凭证模板id
    */
    @SerializedName("CPTId")
    @Expose
    private Long CPTId;

    /**
    * 凭证签名
    */
    @SerializedName("Signature")
    @Expose
    private String Signature;

    /**
    * 元数据摘要
    */
    @SerializedName("MetaDigest")
    @Expose
    private String MetaDigest;

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
     * @return Status 凭证状态（0：吊销；1：有效）
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 凭证状态（0：吊销；1：有效）
     * @param Status 凭证状态（0：吊销；1：有效）
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 凭证颁发者Did 
     * @return Issuer 凭证颁发者Did
     */
    public String getIssuer() {
        return this.Issuer;
    }

    /**
     * Set 凭证颁发者Did
     * @param Issuer 凭证颁发者Did
     */
    public void setIssuer(String Issuer) {
        this.Issuer = Issuer;
    }

    /**
     * Get VC摘要，对应凭证Proof的vcDigest字段 
     * @return VCDigest VC摘要，对应凭证Proof的vcDigest字段
     */
    public String getVCDigest() {
        return this.VCDigest;
    }

    /**
     * Set VC摘要，对应凭证Proof的vcDigest字段
     * @param VCDigest VC摘要，对应凭证Proof的vcDigest字段
     */
    public void setVCDigest(String VCDigest) {
        this.VCDigest = VCDigest;
    }

    /**
     * Get 交易摘要，对应凭证Proof的txDigest字段  
     * @return TXDigest 交易摘要，对应凭证Proof的txDigest字段 
     */
    public String getTXDigest() {
        return this.TXDigest;
    }

    /**
     * Set 交易摘要，对应凭证Proof的txDigest字段 
     * @param TXDigest 交易摘要，对应凭证Proof的txDigest字段 
     */
    public void setTXDigest(String TXDigest) {
        this.TXDigest = TXDigest;
    }

    /**
     * Get 颁布凭证的UTC时间戳 
     * @return IssueTime 颁布凭证的UTC时间戳
     */
    public Long getIssueTime() {
        return this.IssueTime;
    }

    /**
     * Set 颁布凭证的UTC时间戳
     * @param IssueTime 颁布凭证的UTC时间戳
     */
    public void setIssueTime(Long IssueTime) {
        this.IssueTime = IssueTime;
    }

    /**
     * Get 凭证过期的UTC时间戳 
     * @return ExpireTime 凭证过期的UTC时间戳
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 凭证过期的UTC时间戳
     * @param ExpireTime 凭证过期的UTC时间戳
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 凭证模板id 
     * @return CPTId 凭证模板id
     */
    public Long getCPTId() {
        return this.CPTId;
    }

    /**
     * Set 凭证模板id
     * @param CPTId 凭证模板id
     */
    public void setCPTId(Long CPTId) {
        this.CPTId = CPTId;
    }

    /**
     * Get 凭证签名 
     * @return Signature 凭证签名
     */
    public String getSignature() {
        return this.Signature;
    }

    /**
     * Set 凭证签名
     * @param Signature 凭证签名
     */
    public void setSignature(String Signature) {
        this.Signature = Signature;
    }

    /**
     * Get 元数据摘要 
     * @return MetaDigest 元数据摘要
     */
    public String getMetaDigest() {
        return this.MetaDigest;
    }

    /**
     * Set 元数据摘要
     * @param MetaDigest 元数据摘要
     */
    public void setMetaDigest(String MetaDigest) {
        this.MetaDigest = MetaDigest;
    }

    public CredentialState() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CredentialState(CredentialState source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Issuer != null) {
            this.Issuer = new String(source.Issuer);
        }
        if (source.VCDigest != null) {
            this.VCDigest = new String(source.VCDigest);
        }
        if (source.TXDigest != null) {
            this.TXDigest = new String(source.TXDigest);
        }
        if (source.IssueTime != null) {
            this.IssueTime = new Long(source.IssueTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.CPTId != null) {
            this.CPTId = new Long(source.CPTId);
        }
        if (source.Signature != null) {
            this.Signature = new String(source.Signature);
        }
        if (source.MetaDigest != null) {
            this.MetaDigest = new String(source.MetaDigest);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Issuer", this.Issuer);
        this.setParamSimple(map, prefix + "VCDigest", this.VCDigest);
        this.setParamSimple(map, prefix + "TXDigest", this.TXDigest);
        this.setParamSimple(map, prefix + "IssueTime", this.IssueTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "CPTId", this.CPTId);
        this.setParamSimple(map, prefix + "Signature", this.Signature);
        this.setParamSimple(map, prefix + "MetaDigest", this.MetaDigest);

    }
}

