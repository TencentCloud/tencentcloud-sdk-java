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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RootCertificates extends AbstractModel{

    /**
    * 国密签名证书
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sign")
    @Expose
    private String Sign;

    /**
    * 国密加密证书
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Encrypt")
    @Expose
    private String Encrypt;

    /**
    * 标准证书
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Standard")
    @Expose
    private String Standard;

    /**
     * Get 国密签名证书
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sign 国密签名证书
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSign() {
        return this.Sign;
    }

    /**
     * Set 国密签名证书
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sign 国密签名证书
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSign(String Sign) {
        this.Sign = Sign;
    }

    /**
     * Get 国密加密证书
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Encrypt 国密加密证书
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEncrypt() {
        return this.Encrypt;
    }

    /**
     * Set 国密加密证书
注意：此字段可能返回 null，表示取不到有效值。
     * @param Encrypt 国密加密证书
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEncrypt(String Encrypt) {
        this.Encrypt = Encrypt;
    }

    /**
     * Get 标准证书
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Standard 标准证书
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStandard() {
        return this.Standard;
    }

    /**
     * Set 标准证书
注意：此字段可能返回 null，表示取不到有效值。
     * @param Standard 标准证书
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStandard(String Standard) {
        this.Standard = Standard;
    }

    public RootCertificates() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RootCertificates(RootCertificates source) {
        if (source.Sign != null) {
            this.Sign = new String(source.Sign);
        }
        if (source.Encrypt != null) {
            this.Encrypt = new String(source.Encrypt);
        }
        if (source.Standard != null) {
            this.Standard = new String(source.Standard);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Sign", this.Sign);
        this.setParamSimple(map, prefix + "Encrypt", this.Encrypt);
        this.setParamSimple(map, prefix + "Standard", this.Standard);

    }
}

