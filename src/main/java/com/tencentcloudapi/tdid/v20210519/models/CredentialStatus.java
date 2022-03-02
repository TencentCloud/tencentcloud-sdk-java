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

public class CredentialStatus extends AbstractModel{

    /**
    * 凭证唯一id
    */
    @SerializedName("CredentialId")
    @Expose
    private String CredentialId;

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
    * 凭证摘要
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Digest")
    @Expose
    private String Digest;

    /**
    * 凭证签名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Signature")
    @Expose
    private String Signature;

    /**
    * 更新时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeStamp")
    @Expose
    private Long TimeStamp;

    /**
     * Get 凭证唯一id 
     * @return CredentialId 凭证唯一id
     */
    public String getCredentialId() {
        return this.CredentialId;
    }

    /**
     * Set 凭证唯一id
     * @param CredentialId 凭证唯一id
     */
    public void setCredentialId(String CredentialId) {
        this.CredentialId = CredentialId;
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
     * Get 凭证摘要
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Digest 凭证摘要
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDigest() {
        return this.Digest;
    }

    /**
     * Set 凭证摘要
注意：此字段可能返回 null，表示取不到有效值。
     * @param Digest 凭证摘要
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDigest(String Digest) {
        this.Digest = Digest;
    }

    /**
     * Get 凭证签名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Signature 凭证签名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSignature() {
        return this.Signature;
    }

    /**
     * Set 凭证签名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Signature 凭证签名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSignature(String Signature) {
        this.Signature = Signature;
    }

    /**
     * Get 更新时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeStamp 更新时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimeStamp() {
        return this.TimeStamp;
    }

    /**
     * Set 更新时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeStamp 更新时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeStamp(Long TimeStamp) {
        this.TimeStamp = TimeStamp;
    }

    public CredentialStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CredentialStatus(CredentialStatus source) {
        if (source.CredentialId != null) {
            this.CredentialId = new String(source.CredentialId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Issuer != null) {
            this.Issuer = new String(source.Issuer);
        }
        if (source.Digest != null) {
            this.Digest = new String(source.Digest);
        }
        if (source.Signature != null) {
            this.Signature = new String(source.Signature);
        }
        if (source.TimeStamp != null) {
            this.TimeStamp = new Long(source.TimeStamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CredentialId", this.CredentialId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Issuer", this.Issuer);
        this.setParamSimple(map, prefix + "Digest", this.Digest);
        this.setParamSimple(map, prefix + "Signature", this.Signature);
        this.setParamSimple(map, prefix + "TimeStamp", this.TimeStamp);

    }
}

