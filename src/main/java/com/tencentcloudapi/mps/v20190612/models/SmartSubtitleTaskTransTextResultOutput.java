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

public class SmartSubtitleTaskTransTextResultOutput extends AbstractModel {

    /**
    * 翻译片段列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SegmentSet")
    @Expose
    private SmartSubtitleTaskTransTextSegmentItem [] SegmentSet;

    /**
    * 字幕文件地址。
    */
    @SerializedName("SubtitlePath")
    @Expose
    private String SubtitlePath;

    /**
     * Get 翻译片段列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SegmentSet 翻译片段列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SmartSubtitleTaskTransTextSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set 翻译片段列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SegmentSet 翻译片段列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSegmentSet(SmartSubtitleTaskTransTextSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Get 字幕文件地址。 
     * @return SubtitlePath 字幕文件地址。
     */
    public String getSubtitlePath() {
        return this.SubtitlePath;
    }

    /**
     * Set 字幕文件地址。
     * @param SubtitlePath 字幕文件地址。
     */
    public void setSubtitlePath(String SubtitlePath) {
        this.SubtitlePath = SubtitlePath;
    }

    public SmartSubtitleTaskTransTextResultOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartSubtitleTaskTransTextResultOutput(SmartSubtitleTaskTransTextResultOutput source) {
        if (source.SegmentSet != null) {
            this.SegmentSet = new SmartSubtitleTaskTransTextSegmentItem[source.SegmentSet.length];
            for (int i = 0; i < source.SegmentSet.length; i++) {
                this.SegmentSet[i] = new SmartSubtitleTaskTransTextSegmentItem(source.SegmentSet[i]);
            }
        }
        if (source.SubtitlePath != null) {
            this.SubtitlePath = new String(source.SubtitlePath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);
        this.setParamSimple(map, prefix + "SubtitlePath", this.SubtitlePath);

    }
}

