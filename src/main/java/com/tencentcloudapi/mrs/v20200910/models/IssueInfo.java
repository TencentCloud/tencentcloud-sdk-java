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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IssueInfo extends AbstractModel{

    /**
    * 编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertNumber")
    @Expose
    private String CertNumber;

    /**
    * 签发机构
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IssuedAuthority")
    @Expose
    private String IssuedAuthority;

    /**
    * 签发日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IssuedDate")
    @Expose
    private String IssuedDate;

    /**
     * Get 编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertNumber 编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertNumber() {
        return this.CertNumber;
    }

    /**
     * Set 编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertNumber 编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertNumber(String CertNumber) {
        this.CertNumber = CertNumber;
    }

    /**
     * Get 签发机构
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IssuedAuthority 签发机构
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIssuedAuthority() {
        return this.IssuedAuthority;
    }

    /**
     * Set 签发机构
注意：此字段可能返回 null，表示取不到有效值。
     * @param IssuedAuthority 签发机构
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIssuedAuthority(String IssuedAuthority) {
        this.IssuedAuthority = IssuedAuthority;
    }

    /**
     * Get 签发日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IssuedDate 签发日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIssuedDate() {
        return this.IssuedDate;
    }

    /**
     * Set 签发日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param IssuedDate 签发日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIssuedDate(String IssuedDate) {
        this.IssuedDate = IssuedDate;
    }

    public IssueInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IssueInfo(IssueInfo source) {
        if (source.CertNumber != null) {
            this.CertNumber = new String(source.CertNumber);
        }
        if (source.IssuedAuthority != null) {
            this.IssuedAuthority = new String(source.IssuedAuthority);
        }
        if (source.IssuedDate != null) {
            this.IssuedDate = new String(source.IssuedDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertNumber", this.CertNumber);
        this.setParamSimple(map, prefix + "IssuedAuthority", this.IssuedAuthority);
        this.setParamSimple(map, prefix + "IssuedDate", this.IssuedDate);

    }
}

