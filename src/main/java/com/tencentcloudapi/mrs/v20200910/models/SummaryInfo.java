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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SummaryInfo extends AbstractModel{

    /**
    * 诊断结论文本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Text")
    @Expose
    private BaseInfo Text;

    /**
    * 诊断结论详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Infos")
    @Expose
    private DetailInformation [] Infos;

    /**
     * Get 诊断结论文本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Text 诊断结论文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseInfo getText() {
        return this.Text;
    }

    /**
     * Set 诊断结论文本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Text 诊断结论文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setText(BaseInfo Text) {
        this.Text = Text;
    }

    /**
     * Get 诊断结论详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Infos 诊断结论详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetailInformation [] getInfos() {
        return this.Infos;
    }

    /**
     * Set 诊断结论详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param Infos 诊断结论详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInfos(DetailInformation [] Infos) {
        this.Infos = Infos;
    }

    public SummaryInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SummaryInfo(SummaryInfo source) {
        if (source.Text != null) {
            this.Text = new BaseInfo(source.Text);
        }
        if (source.Infos != null) {
            this.Infos = new DetailInformation[source.Infos.length];
            for (int i = 0; i < source.Infos.length; i++) {
                this.Infos[i] = new DetailInformation(source.Infos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Text.", this.Text);
        this.setParamArrayObj(map, prefix + "Infos.", this.Infos);

    }
}

