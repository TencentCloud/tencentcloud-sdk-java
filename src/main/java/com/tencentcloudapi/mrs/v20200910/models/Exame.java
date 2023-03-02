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

public class Exame extends AbstractModel{

    /**
    * 结论段落
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OverView")
    @Expose
    private ResultInfo [] OverView;

    /**
    * 异常与建议段落
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Abnormality")
    @Expose
    private ResultInfo [] Abnormality;

    /**
     * Get 结论段落
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OverView 结论段落
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResultInfo [] getOverView() {
        return this.OverView;
    }

    /**
     * Set 结论段落
注意：此字段可能返回 null，表示取不到有效值。
     * @param OverView 结论段落
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOverView(ResultInfo [] OverView) {
        this.OverView = OverView;
    }

    /**
     * Get 异常与建议段落
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Abnormality 异常与建议段落
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResultInfo [] getAbnormality() {
        return this.Abnormality;
    }

    /**
     * Set 异常与建议段落
注意：此字段可能返回 null，表示取不到有效值。
     * @param Abnormality 异常与建议段落
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAbnormality(ResultInfo [] Abnormality) {
        this.Abnormality = Abnormality;
    }

    public Exame() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Exame(Exame source) {
        if (source.OverView != null) {
            this.OverView = new ResultInfo[source.OverView.length];
            for (int i = 0; i < source.OverView.length; i++) {
                this.OverView[i] = new ResultInfo(source.OverView[i]);
            }
        }
        if (source.Abnormality != null) {
            this.Abnormality = new ResultInfo[source.Abnormality.length];
            for (int i = 0; i < source.Abnormality.length; i++) {
                this.Abnormality[i] = new ResultInfo(source.Abnormality[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "OverView.", this.OverView);
        this.setParamArrayObj(map, prefix + "Abnormality.", this.Abnormality);

    }
}

