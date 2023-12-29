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
package com.tencentcloudapi.tms.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelResult extends AbstractModel {

    /**
    * 模型检测出的违规内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 模型检测出的违规内容的位置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Positions")
    @Expose
    private Positions [] Positions;

    /**
     * Get 模型检测出的违规内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 模型检测出的违规内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 模型检测出的违规内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 模型检测出的违规内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 模型检测出的违规内容的位置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Positions 模型检测出的违规内容的位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Positions [] getPositions() {
        return this.Positions;
    }

    /**
     * Set 模型检测出的违规内容的位置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Positions 模型检测出的违规内容的位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPositions(Positions [] Positions) {
        this.Positions = Positions;
    }

    public ModelResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelResult(ModelResult source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Positions != null) {
            this.Positions = new Positions[source.Positions.length];
            for (int i = 0; i < source.Positions.length; i++) {
                this.Positions[i] = new Positions(source.Positions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamArrayObj(map, prefix + "Positions.", this.Positions);

    }
}

