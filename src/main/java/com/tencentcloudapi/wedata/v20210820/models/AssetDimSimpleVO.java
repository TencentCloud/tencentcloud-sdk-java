/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetDimSimpleVO extends AbstractModel {

    /**
    * ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DimName")
    @Expose
    private String DimName;

    /**
    * 编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DimCode")
    @Expose
    private String DimCode;

    /**
     * Get ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DimName 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDimName() {
        return this.DimName;
    }

    /**
     * Set 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DimName 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDimName(String DimName) {
        this.DimName = DimName;
    }

    /**
     * Get 编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DimCode 编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDimCode() {
        return this.DimCode;
    }

    /**
     * Set 编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param DimCode 编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDimCode(String DimCode) {
        this.DimCode = DimCode;
    }

    public AssetDimSimpleVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetDimSimpleVO(AssetDimSimpleVO source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.DimName != null) {
            this.DimName = new String(source.DimName);
        }
        if (source.DimCode != null) {
            this.DimCode = new String(source.DimCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "DimName", this.DimName);
        this.setParamSimple(map, prefix + "DimCode", this.DimCode);

    }
}

