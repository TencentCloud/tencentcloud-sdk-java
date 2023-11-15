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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdministrativeDetail extends AbstractModel {

    /**
    * 行政区域类型编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdministrativeTypeCode")
    @Expose
    private String AdministrativeTypeCode;

    /**
    * 行政区域编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdministrativeCode")
    @Expose
    private String AdministrativeCode;

    /**
    * 行政区域名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdministrativeName")
    @Expose
    private String AdministrativeName;

    /**
     * Get 行政区域类型编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdministrativeTypeCode 行政区域类型编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdministrativeTypeCode() {
        return this.AdministrativeTypeCode;
    }

    /**
     * Set 行政区域类型编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdministrativeTypeCode 行政区域类型编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdministrativeTypeCode(String AdministrativeTypeCode) {
        this.AdministrativeTypeCode = AdministrativeTypeCode;
    }

    /**
     * Get 行政区域编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdministrativeCode 行政区域编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdministrativeCode() {
        return this.AdministrativeCode;
    }

    /**
     * Set 行政区域编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdministrativeCode 行政区域编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdministrativeCode(String AdministrativeCode) {
        this.AdministrativeCode = AdministrativeCode;
    }

    /**
     * Get 行政区域名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdministrativeName 行政区域名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdministrativeName() {
        return this.AdministrativeName;
    }

    /**
     * Set 行政区域名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdministrativeName 行政区域名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdministrativeName(String AdministrativeName) {
        this.AdministrativeName = AdministrativeName;
    }

    public AdministrativeDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdministrativeDetail(AdministrativeDetail source) {
        if (source.AdministrativeTypeCode != null) {
            this.AdministrativeTypeCode = new String(source.AdministrativeTypeCode);
        }
        if (source.AdministrativeCode != null) {
            this.AdministrativeCode = new String(source.AdministrativeCode);
        }
        if (source.AdministrativeName != null) {
            this.AdministrativeName = new String(source.AdministrativeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AdministrativeTypeCode", this.AdministrativeTypeCode);
        this.setParamSimple(map, prefix + "AdministrativeCode", this.AdministrativeCode);
        this.setParamSimple(map, prefix + "AdministrativeName", this.AdministrativeName);

    }
}

