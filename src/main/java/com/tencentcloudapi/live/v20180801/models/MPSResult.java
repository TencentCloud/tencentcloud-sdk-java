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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MPSResult extends AbstractModel{

    /**
    * 智能语音识别结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AiAsrResults")
    @Expose
    private String [] AiAsrResults;

    /**
    * 智能文字识别结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AiOcrResults")
    @Expose
    private String [] AiOcrResults;

    /**
     * Get 智能语音识别结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AiAsrResults 智能语音识别结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAiAsrResults() {
        return this.AiAsrResults;
    }

    /**
     * Set 智能语音识别结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param AiAsrResults 智能语音识别结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAiAsrResults(String [] AiAsrResults) {
        this.AiAsrResults = AiAsrResults;
    }

    /**
     * Get 智能文字识别结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AiOcrResults 智能文字识别结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAiOcrResults() {
        return this.AiOcrResults;
    }

    /**
     * Set 智能文字识别结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param AiOcrResults 智能文字识别结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAiOcrResults(String [] AiOcrResults) {
        this.AiOcrResults = AiOcrResults;
    }

    public MPSResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSResult(MPSResult source) {
        if (source.AiAsrResults != null) {
            this.AiAsrResults = new String[source.AiAsrResults.length];
            for (int i = 0; i < source.AiAsrResults.length; i++) {
                this.AiAsrResults[i] = new String(source.AiAsrResults[i]);
            }
        }
        if (source.AiOcrResults != null) {
            this.AiOcrResults = new String[source.AiOcrResults.length];
            for (int i = 0; i < source.AiOcrResults.length; i++) {
                this.AiOcrResults[i] = new String(source.AiOcrResults[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AiAsrResults.", this.AiAsrResults);
        this.setParamArraySimple(map, prefix + "AiOcrResults.", this.AiOcrResults);

    }
}

