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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SealInfo extends AbstractModel{

    /**
    * 印章ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SealId")
    @Expose
    private String SealId;

    /**
    * 印章类型。LEGAL_PERSON_SEAL: 法定代表人章；
ORGANIZATIONSEAL：企业印章；
OFFICIAL：企业公章；
CONTRACT：合同专用章
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SealType")
    @Expose
    private String SealType;

    /**
    * 印章名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SealName")
    @Expose
    private String SealName;

    /**
     * Get 印章ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SealId 印章ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSealId() {
        return this.SealId;
    }

    /**
     * Set 印章ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SealId 印章ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSealId(String SealId) {
        this.SealId = SealId;
    }

    /**
     * Get 印章类型。LEGAL_PERSON_SEAL: 法定代表人章；
ORGANIZATIONSEAL：企业印章；
OFFICIAL：企业公章；
CONTRACT：合同专用章
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SealType 印章类型。LEGAL_PERSON_SEAL: 法定代表人章；
ORGANIZATIONSEAL：企业印章；
OFFICIAL：企业公章；
CONTRACT：合同专用章
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSealType() {
        return this.SealType;
    }

    /**
     * Set 印章类型。LEGAL_PERSON_SEAL: 法定代表人章；
ORGANIZATIONSEAL：企业印章；
OFFICIAL：企业公章；
CONTRACT：合同专用章
注意：此字段可能返回 null，表示取不到有效值。
     * @param SealType 印章类型。LEGAL_PERSON_SEAL: 法定代表人章；
ORGANIZATIONSEAL：企业印章；
OFFICIAL：企业公章；
CONTRACT：合同专用章
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSealType(String SealType) {
        this.SealType = SealType;
    }

    /**
     * Get 印章名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SealName 印章名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSealName() {
        return this.SealName;
    }

    /**
     * Set 印章名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SealName 印章名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSealName(String SealName) {
        this.SealName = SealName;
    }

    public SealInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SealInfo(SealInfo source) {
        if (source.SealId != null) {
            this.SealId = new String(source.SealId);
        }
        if (source.SealType != null) {
            this.SealType = new String(source.SealType);
        }
        if (source.SealName != null) {
            this.SealName = new String(source.SealName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SealId", this.SealId);
        this.setParamSimple(map, prefix + "SealType", this.SealType);
        this.setParamSimple(map, prefix + "SealName", this.SealName);

    }
}

