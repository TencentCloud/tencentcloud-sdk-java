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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveStreamAiAnalysisResultItem extends AbstractModel{

    /**
    * 结果的类型，取值范围：
<li>SegmentRecognition：拆条。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 拆条结果，当 Type 为
SegmentRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SegmentResultSet")
    @Expose
    private SegmentRecognitionItem [] SegmentResultSet;

    /**
     * Get 结果的类型，取值范围：
<li>SegmentRecognition：拆条。</li> 
     * @return Type 结果的类型，取值范围：
<li>SegmentRecognition：拆条。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 结果的类型，取值范围：
<li>SegmentRecognition：拆条。</li>
     * @param Type 结果的类型，取值范围：
<li>SegmentRecognition：拆条。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 拆条结果，当 Type 为
SegmentRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SegmentResultSet 拆条结果，当 Type 为
SegmentRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SegmentRecognitionItem [] getSegmentResultSet() {
        return this.SegmentResultSet;
    }

    /**
     * Set 拆条结果，当 Type 为
SegmentRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SegmentResultSet 拆条结果，当 Type 为
SegmentRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSegmentResultSet(SegmentRecognitionItem [] SegmentResultSet) {
        this.SegmentResultSet = SegmentResultSet;
    }

    public LiveStreamAiAnalysisResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveStreamAiAnalysisResultItem(LiveStreamAiAnalysisResultItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SegmentResultSet != null) {
            this.SegmentResultSet = new SegmentRecognitionItem[source.SegmentResultSet.length];
            for (int i = 0; i < source.SegmentResultSet.length; i++) {
                this.SegmentResultSet[i] = new SegmentRecognitionItem(source.SegmentResultSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "SegmentResultSet.", this.SegmentResultSet);

    }
}

