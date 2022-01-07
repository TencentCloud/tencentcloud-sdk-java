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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Transformation extends AbstractModel{

    /**
    * 描述如何提取数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Extraction")
    @Expose
    private Extraction Extraction;

    /**
    * 描述如何过滤数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EtlFilter")
    @Expose
    private EtlFilter EtlFilter;

    /**
    * 描述如何数据转换
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Transform")
    @Expose
    private Transform Transform;

    /**
     * Get 描述如何提取数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Extraction 描述如何提取数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Extraction getExtraction() {
        return this.Extraction;
    }

    /**
     * Set 描述如何提取数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Extraction 描述如何提取数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraction(Extraction Extraction) {
        this.Extraction = Extraction;
    }

    /**
     * Get 描述如何过滤数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EtlFilter 描述如何过滤数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EtlFilter getEtlFilter() {
        return this.EtlFilter;
    }

    /**
     * Set 描述如何过滤数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param EtlFilter 描述如何过滤数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEtlFilter(EtlFilter EtlFilter) {
        this.EtlFilter = EtlFilter;
    }

    /**
     * Get 描述如何数据转换
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Transform 描述如何数据转换
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Transform getTransform() {
        return this.Transform;
    }

    /**
     * Set 描述如何数据转换
注意：此字段可能返回 null，表示取不到有效值。
     * @param Transform 描述如何数据转换
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransform(Transform Transform) {
        this.Transform = Transform;
    }

    public Transformation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Transformation(Transformation source) {
        if (source.Extraction != null) {
            this.Extraction = new Extraction(source.Extraction);
        }
        if (source.EtlFilter != null) {
            this.EtlFilter = new EtlFilter(source.EtlFilter);
        }
        if (source.Transform != null) {
            this.Transform = new Transform(source.Transform);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Extraction.", this.Extraction);
        this.setParamObj(map, prefix + "EtlFilter.", this.EtlFilter);
        this.setParamObj(map, prefix + "Transform.", this.Transform);

    }
}

