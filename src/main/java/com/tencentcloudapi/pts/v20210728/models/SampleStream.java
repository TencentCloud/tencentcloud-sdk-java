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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SampleStream extends AbstractModel{

    /**
    * labels描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * 指标采样数组
    */
    @SerializedName("Values")
    @Expose
    private SamplePair [] Values;

    /**
    * 指标序列名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get labels描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Labels labels描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set labels描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Labels labels描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 指标采样数组 
     * @return Values 指标采样数组
     */
    public SamplePair [] getValues() {
        return this.Values;
    }

    /**
     * Set 指标采样数组
     * @param Values 指标采样数组
     */
    public void setValues(SamplePair [] Values) {
        this.Values = Values;
    }

    /**
     * Get 指标序列名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 指标序列名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 指标序列名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 指标序列名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public SampleStream() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SampleStream(SampleStream source) {
        if (source.Labels != null) {
            this.Labels = new Label[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new Label(source.Labels[i]);
            }
        }
        if (source.Values != null) {
            this.Values = new SamplePair[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new SamplePair(source.Values[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

