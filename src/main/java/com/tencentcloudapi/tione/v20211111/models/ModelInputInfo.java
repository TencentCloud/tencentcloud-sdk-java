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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelInputInfo extends AbstractModel{

    /**
    * input数据类型
FIXED：固定
RANGE：浮动
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelInputType")
    @Expose
    private String ModelInputType;

    /**
    * input数据尺寸
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelInputDimension")
    @Expose
    private String [] ModelInputDimension;

    /**
     * Get input数据类型
FIXED：固定
RANGE：浮动
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelInputType input数据类型
FIXED：固定
RANGE：浮动
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelInputType() {
        return this.ModelInputType;
    }

    /**
     * Set input数据类型
FIXED：固定
RANGE：浮动
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelInputType input数据类型
FIXED：固定
RANGE：浮动
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelInputType(String ModelInputType) {
        this.ModelInputType = ModelInputType;
    }

    /**
     * Get input数据尺寸
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelInputDimension input数据尺寸
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getModelInputDimension() {
        return this.ModelInputDimension;
    }

    /**
     * Set input数据尺寸
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelInputDimension input数据尺寸
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelInputDimension(String [] ModelInputDimension) {
        this.ModelInputDimension = ModelInputDimension;
    }

    public ModelInputInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelInputInfo(ModelInputInfo source) {
        if (source.ModelInputType != null) {
            this.ModelInputType = new String(source.ModelInputType);
        }
        if (source.ModelInputDimension != null) {
            this.ModelInputDimension = new String[source.ModelInputDimension.length];
            for (int i = 0; i < source.ModelInputDimension.length; i++) {
                this.ModelInputDimension[i] = new String(source.ModelInputDimension[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelInputType", this.ModelInputType);
        this.setParamArraySimple(map, prefix + "ModelInputDimension.", this.ModelInputDimension);

    }
}

