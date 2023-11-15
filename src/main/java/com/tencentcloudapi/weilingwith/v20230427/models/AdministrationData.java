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

public class AdministrationData extends AbstractModel {

    /**
    * 行政区划编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdministrationCode")
    @Expose
    private String AdministrationCode;

    /**
    * 行政区划名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdministrationName")
    @Expose
    private String AdministrationName;

    /**
     * Get 行政区划编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdministrationCode 行政区划编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdministrationCode() {
        return this.AdministrationCode;
    }

    /**
     * Set 行政区划编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdministrationCode 行政区划编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdministrationCode(String AdministrationCode) {
        this.AdministrationCode = AdministrationCode;
    }

    /**
     * Get 行政区划名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdministrationName 行政区划名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdministrationName() {
        return this.AdministrationName;
    }

    /**
     * Set 行政区划名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdministrationName 行政区划名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdministrationName(String AdministrationName) {
        this.AdministrationName = AdministrationName;
    }

    public AdministrationData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdministrationData(AdministrationData source) {
        if (source.AdministrationCode != null) {
            this.AdministrationCode = new String(source.AdministrationCode);
        }
        if (source.AdministrationName != null) {
            this.AdministrationName = new String(source.AdministrationName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AdministrationCode", this.AdministrationCode);
        this.setParamSimple(map, prefix + "AdministrationName", this.AdministrationName);

    }
}

