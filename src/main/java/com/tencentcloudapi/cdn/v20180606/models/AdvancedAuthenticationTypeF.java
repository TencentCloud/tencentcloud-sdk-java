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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdvancedAuthenticationTypeF extends AbstractModel{

    /**
    * uri串中签名的字段名，字母，数字或下划线构成，同时必须以字母开头。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SignParam")
    @Expose
    private String SignParam;

    /**
    * uri串中时间的字段名，字母，数字或下划线构成，同时必须以字母开头。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeParam")
    @Expose
    private String TimeParam;

    /**
    * uri串中Transaction字段名，字母，数字或下划线构成，同时必须以字母开头。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransactionParam")
    @Expose
    private String TransactionParam;

    /**
    * 用于计算签名的主密钥，只允许字母和数字，长度6-32字节。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * 用于计算签名的备选密钥，主密钥校验失败后再次尝试备选密钥，只允许字母和数字，长度6-32字节。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupSecretKey")
    @Expose
    private String BackupSecretKey;

    /**
     * Get uri串中签名的字段名，字母，数字或下划线构成，同时必须以字母开头。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SignParam uri串中签名的字段名，字母，数字或下划线构成，同时必须以字母开头。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSignParam() {
        return this.SignParam;
    }

    /**
     * Set uri串中签名的字段名，字母，数字或下划线构成，同时必须以字母开头。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SignParam uri串中签名的字段名，字母，数字或下划线构成，同时必须以字母开头。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSignParam(String SignParam) {
        this.SignParam = SignParam;
    }

    /**
     * Get uri串中时间的字段名，字母，数字或下划线构成，同时必须以字母开头。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeParam uri串中时间的字段名，字母，数字或下划线构成，同时必须以字母开头。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeParam() {
        return this.TimeParam;
    }

    /**
     * Set uri串中时间的字段名，字母，数字或下划线构成，同时必须以字母开头。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeParam uri串中时间的字段名，字母，数字或下划线构成，同时必须以字母开头。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeParam(String TimeParam) {
        this.TimeParam = TimeParam;
    }

    /**
     * Get uri串中Transaction字段名，字母，数字或下划线构成，同时必须以字母开头。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransactionParam uri串中Transaction字段名，字母，数字或下划线构成，同时必须以字母开头。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTransactionParam() {
        return this.TransactionParam;
    }

    /**
     * Set uri串中Transaction字段名，字母，数字或下划线构成，同时必须以字母开头。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransactionParam uri串中Transaction字段名，字母，数字或下划线构成，同时必须以字母开头。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransactionParam(String TransactionParam) {
        this.TransactionParam = TransactionParam;
    }

    /**
     * Get 用于计算签名的主密钥，只允许字母和数字，长度6-32字节。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecretKey 用于计算签名的主密钥，只允许字母和数字，长度6-32字节。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set 用于计算签名的主密钥，只允许字母和数字，长度6-32字节。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecretKey 用于计算签名的主密钥，只允许字母和数字，长度6-32字节。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get 用于计算签名的备选密钥，主密钥校验失败后再次尝试备选密钥，只允许字母和数字，长度6-32字节。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupSecretKey 用于计算签名的备选密钥，主密钥校验失败后再次尝试备选密钥，只允许字母和数字，长度6-32字节。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBackupSecretKey() {
        return this.BackupSecretKey;
    }

    /**
     * Set 用于计算签名的备选密钥，主密钥校验失败后再次尝试备选密钥，只允许字母和数字，长度6-32字节。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupSecretKey 用于计算签名的备选密钥，主密钥校验失败后再次尝试备选密钥，只允许字母和数字，长度6-32字节。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupSecretKey(String BackupSecretKey) {
        this.BackupSecretKey = BackupSecretKey;
    }

    public AdvancedAuthenticationTypeF() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdvancedAuthenticationTypeF(AdvancedAuthenticationTypeF source) {
        if (source.SignParam != null) {
            this.SignParam = new String(source.SignParam);
        }
        if (source.TimeParam != null) {
            this.TimeParam = new String(source.TimeParam);
        }
        if (source.TransactionParam != null) {
            this.TransactionParam = new String(source.TransactionParam);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.BackupSecretKey != null) {
            this.BackupSecretKey = new String(source.BackupSecretKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SignParam", this.SignParam);
        this.setParamSimple(map, prefix + "TimeParam", this.TimeParam);
        this.setParamSimple(map, prefix + "TransactionParam", this.TransactionParam);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "BackupSecretKey", this.BackupSecretKey);

    }
}

