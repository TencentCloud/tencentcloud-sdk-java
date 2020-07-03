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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosCredentials extends AbstractModel{

    /**
    * 会话Token
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionToken")
    @Expose
    private String SessionToken;

    /**
    * 临时应用ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TmpAppId")
    @Expose
    private String TmpAppId;

    /**
    * 临时调用者身份ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TmpSecretId")
    @Expose
    private String TmpSecretId;

    /**
    * 临时密钥
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TmpSecretKey")
    @Expose
    private String TmpSecretKey;

    /**
    * 过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
    * 所在域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
     * Get 会话Token
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionToken 会话Token
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionToken() {
        return this.SessionToken;
    }

    /**
     * Set 会话Token
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionToken 会话Token
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionToken(String SessionToken) {
        this.SessionToken = SessionToken;
    }

    /**
     * Get 临时应用ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TmpAppId 临时应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTmpAppId() {
        return this.TmpAppId;
    }

    /**
     * Set 临时应用ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TmpAppId 临时应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTmpAppId(String TmpAppId) {
        this.TmpAppId = TmpAppId;
    }

    /**
     * Get 临时调用者身份ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TmpSecretId 临时调用者身份ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTmpSecretId() {
        return this.TmpSecretId;
    }

    /**
     * Set 临时调用者身份ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TmpSecretId 临时调用者身份ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTmpSecretId(String TmpSecretId) {
        this.TmpSecretId = TmpSecretId;
    }

    /**
     * Get 临时密钥
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TmpSecretKey 临时密钥
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTmpSecretKey() {
        return this.TmpSecretKey;
    }

    /**
     * Set 临时密钥
注意：此字段可能返回 null，表示取不到有效值。
     * @param TmpSecretKey 临时密钥
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTmpSecretKey(String TmpSecretKey) {
        this.TmpSecretKey = TmpSecretKey;
    }

    /**
     * Get 过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpiredTime 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpiredTime 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpiredTime(Long ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get 所在域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain 所在域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 所在域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain 所在域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionToken", this.SessionToken);
        this.setParamSimple(map, prefix + "TmpAppId", this.TmpAppId);
        this.setParamSimple(map, prefix + "TmpSecretId", this.TmpSecretId);
        this.setParamSimple(map, prefix + "TmpSecretKey", this.TmpSecretKey);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "Domain", this.Domain);

    }
}

