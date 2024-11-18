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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtendScene extends AbstractModel {

    /**
    * 印章来源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GenerateType")
    @Expose
    private String GenerateType;

    /**
    * 印章来源类型描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GenerateTypeDesc")
    @Expose
    private String GenerateTypeDesc;

    /**
    * 印章来源logo
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GenerateTypeLogo")
    @Expose
    private String GenerateTypeLogo;

    /**
     * Get 印章来源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GenerateType 印章来源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGenerateType() {
        return this.GenerateType;
    }

    /**
     * Set 印章来源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param GenerateType 印章来源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGenerateType(String GenerateType) {
        this.GenerateType = GenerateType;
    }

    /**
     * Get 印章来源类型描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GenerateTypeDesc 印章来源类型描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGenerateTypeDesc() {
        return this.GenerateTypeDesc;
    }

    /**
     * Set 印章来源类型描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param GenerateTypeDesc 印章来源类型描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGenerateTypeDesc(String GenerateTypeDesc) {
        this.GenerateTypeDesc = GenerateTypeDesc;
    }

    /**
     * Get 印章来源logo
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GenerateTypeLogo 印章来源logo
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGenerateTypeLogo() {
        return this.GenerateTypeLogo;
    }

    /**
     * Set 印章来源logo
注意：此字段可能返回 null，表示取不到有效值。
     * @param GenerateTypeLogo 印章来源logo
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGenerateTypeLogo(String GenerateTypeLogo) {
        this.GenerateTypeLogo = GenerateTypeLogo;
    }

    public ExtendScene() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtendScene(ExtendScene source) {
        if (source.GenerateType != null) {
            this.GenerateType = new String(source.GenerateType);
        }
        if (source.GenerateTypeDesc != null) {
            this.GenerateTypeDesc = new String(source.GenerateTypeDesc);
        }
        if (source.GenerateTypeLogo != null) {
            this.GenerateTypeLogo = new String(source.GenerateTypeLogo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GenerateType", this.GenerateType);
        this.setParamSimple(map, prefix + "GenerateTypeDesc", this.GenerateTypeDesc);
        this.setParamSimple(map, prefix + "GenerateTypeLogo", this.GenerateTypeLogo);

    }
}

