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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DimensionInstance extends AbstractModel {

    /**
    * 实例的维度组合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Dimensions")
    @Expose
    private DimensionOpt [] Dimensions;

    /**
     * Get 实例的维度组合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Dimensions 实例的维度组合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DimensionOpt [] getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set 实例的维度组合
注意：此字段可能返回 null，表示取不到有效值。
     * @param Dimensions 实例的维度组合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDimensions(DimensionOpt [] Dimensions) {
        this.Dimensions = Dimensions;
    }

    public DimensionInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DimensionInstance(DimensionInstance source) {
        if (source.Dimensions != null) {
            this.Dimensions = new DimensionOpt[source.Dimensions.length];
            for (int i = 0; i < source.Dimensions.length; i++) {
                this.Dimensions[i] = new DimensionOpt(source.Dimensions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Dimensions.", this.Dimensions);

    }
}

