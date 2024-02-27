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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnalyseBusinessDetail extends AbstractModel {

    /**
    * 产品码code
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * 产品名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessCodeName")
    @Expose
    private String BusinessCodeName;

    /**
     * Get 产品码code
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessCode 产品码code
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * Set 产品码code
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessCode 产品码code
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessCode(String BusinessCode) {
        this.BusinessCode = BusinessCode;
    }

    /**
     * Get 产品名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessCodeName 产品名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBusinessCodeName() {
        return this.BusinessCodeName;
    }

    /**
     * Set 产品名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessCodeName 产品名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessCodeName(String BusinessCodeName) {
        this.BusinessCodeName = BusinessCodeName;
    }

    public AnalyseBusinessDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnalyseBusinessDetail(AnalyseBusinessDetail source) {
        if (source.BusinessCode != null) {
            this.BusinessCode = new String(source.BusinessCode);
        }
        if (source.BusinessCodeName != null) {
            this.BusinessCodeName = new String(source.BusinessCodeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "BusinessCodeName", this.BusinessCodeName);

    }
}

