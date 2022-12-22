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
package com.tencentcloudapi.anicloud.v20220923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GoodsDetail extends AbstractModel{

    /**
    * 按照四层接入的产品需要传入产品标签,例如:p_cvm
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * 四层定义的子产品标签,例如:sp_cvm_s1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubProductCode")
    @Expose
    private String SubProductCode;

    /**
    * 资源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String [] Type;

    /**
    * 资源数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
     * Get 按照四层接入的产品需要传入产品标签,例如:p_cvm
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductCode 按照四层接入的产品需要传入产品标签,例如:p_cvm
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set 按照四层接入的产品需要传入产品标签,例如:p_cvm
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductCode 按照四层接入的产品需要传入产品标签,例如:p_cvm
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get 四层定义的子产品标签,例如:sp_cvm_s1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubProductCode 四层定义的子产品标签,例如:sp_cvm_s1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubProductCode() {
        return this.SubProductCode;
    }

    /**
     * Set 四层定义的子产品标签,例如:sp_cvm_s1
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubProductCode 四层定义的子产品标签,例如:sp_cvm_s1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubProductCode(String SubProductCode) {
        this.SubProductCode = SubProductCode;
    }

    /**
     * Get 资源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 资源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getType() {
        return this.Type;
    }

    /**
     * Set 资源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 资源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String [] Type) {
        this.Type = Type;
    }

    /**
     * Get 资源数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GoodsNum 资源数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 资源数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param GoodsNum 资源数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    public GoodsDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GoodsDetail(GoodsDetail source) {
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.SubProductCode != null) {
            this.SubProductCode = new String(source.SubProductCode);
        }
        if (source.Type != null) {
            this.Type = new String[source.Type.length];
            for (int i = 0; i < source.Type.length; i++) {
                this.Type[i] = new String(source.Type[i]);
            }
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "SubProductCode", this.SubProductCode);
        this.setParamArraySimple(map, prefix + "Type.", this.Type);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);

    }
}

