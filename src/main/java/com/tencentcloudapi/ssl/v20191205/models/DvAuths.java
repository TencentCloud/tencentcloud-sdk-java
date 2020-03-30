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

public class DvAuths extends AbstractModel{

    /**
    * DV 认证密钥。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DvAuthKey")
    @Expose
    private String DvAuthKey;

    /**
    * DV 认证值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DvAuthValue")
    @Expose
    private String DvAuthValue;

    /**
    * DV 认证值域名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DvAuthDomain")
    @Expose
    private String DvAuthDomain;

    /**
    * DV 认证值路径。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DvAuthPath")
    @Expose
    private String DvAuthPath;

    /**
    * DV 认证子域名，
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DvAuthSubDomain")
    @Expose
    private String DvAuthSubDomain;

    /**
    * DV 认证类型。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DvAuthVerifyType")
    @Expose
    private String DvAuthVerifyType;

    /**
     * Get DV 认证密钥。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DvAuthKey DV 认证密钥。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDvAuthKey() {
        return this.DvAuthKey;
    }

    /**
     * Set DV 认证密钥。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DvAuthKey DV 认证密钥。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDvAuthKey(String DvAuthKey) {
        this.DvAuthKey = DvAuthKey;
    }

    /**
     * Get DV 认证值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DvAuthValue DV 认证值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDvAuthValue() {
        return this.DvAuthValue;
    }

    /**
     * Set DV 认证值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DvAuthValue DV 认证值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDvAuthValue(String DvAuthValue) {
        this.DvAuthValue = DvAuthValue;
    }

    /**
     * Get DV 认证值域名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DvAuthDomain DV 认证值域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDvAuthDomain() {
        return this.DvAuthDomain;
    }

    /**
     * Set DV 认证值域名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DvAuthDomain DV 认证值域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDvAuthDomain(String DvAuthDomain) {
        this.DvAuthDomain = DvAuthDomain;
    }

    /**
     * Get DV 认证值路径。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DvAuthPath DV 认证值路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDvAuthPath() {
        return this.DvAuthPath;
    }

    /**
     * Set DV 认证值路径。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DvAuthPath DV 认证值路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDvAuthPath(String DvAuthPath) {
        this.DvAuthPath = DvAuthPath;
    }

    /**
     * Get DV 认证子域名，
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DvAuthSubDomain DV 认证子域名，
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDvAuthSubDomain() {
        return this.DvAuthSubDomain;
    }

    /**
     * Set DV 认证子域名，
注意：此字段可能返回 null，表示取不到有效值。
     * @param DvAuthSubDomain DV 认证子域名，
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDvAuthSubDomain(String DvAuthSubDomain) {
        this.DvAuthSubDomain = DvAuthSubDomain;
    }

    /**
     * Get DV 认证类型。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DvAuthVerifyType DV 认证类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDvAuthVerifyType() {
        return this.DvAuthVerifyType;
    }

    /**
     * Set DV 认证类型。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DvAuthVerifyType DV 认证类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDvAuthVerifyType(String DvAuthVerifyType) {
        this.DvAuthVerifyType = DvAuthVerifyType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DvAuthKey", this.DvAuthKey);
        this.setParamSimple(map, prefix + "DvAuthValue", this.DvAuthValue);
        this.setParamSimple(map, prefix + "DvAuthDomain", this.DvAuthDomain);
        this.setParamSimple(map, prefix + "DvAuthPath", this.DvAuthPath);
        this.setParamSimple(map, prefix + "DvAuthSubDomain", this.DvAuthSubDomain);
        this.setParamSimple(map, prefix + "DvAuthVerifyType", this.DvAuthVerifyType);

    }
}

