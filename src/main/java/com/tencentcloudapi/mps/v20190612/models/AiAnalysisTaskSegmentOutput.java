/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiAnalysisTaskSegmentOutput extends AbstractModel {

    /**
    * 智能拆条子片段列表。
    */
    @SerializedName("SegmentSet")
    @Expose
    private SegmentRecognitionItem [] SegmentSet;

    /**
    * 视频摘要，离线场景用。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Abstract")
    @Expose
    private String Abstract;

    /**
     * Get 智能拆条子片段列表。 
     * @return SegmentSet 智能拆条子片段列表。
     */
    public SegmentRecognitionItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set 智能拆条子片段列表。
     * @param SegmentSet 智能拆条子片段列表。
     */
    public void setSegmentSet(SegmentRecognitionItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Get 视频摘要，离线场景用。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Abstract 视频摘要，离线场景用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAbstract() {
        return this.Abstract;
    }

    /**
     * Set 视频摘要，离线场景用。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Abstract 视频摘要，离线场景用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAbstract(String Abstract) {
        this.Abstract = Abstract;
    }

    public AiAnalysisTaskSegmentOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskSegmentOutput(AiAnalysisTaskSegmentOutput source) {
        if (source.SegmentSet != null) {
            this.SegmentSet = new SegmentRecognitionItem[source.SegmentSet.length];
            for (int i = 0; i < source.SegmentSet.length; i++) {
                this.SegmentSet[i] = new SegmentRecognitionItem(source.SegmentSet[i]);
            }
        }
        if (source.Abstract != null) {
            this.Abstract = new String(source.Abstract);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);
        this.setParamSimple(map, prefix + "Abstract", this.Abstract);

    }
}

