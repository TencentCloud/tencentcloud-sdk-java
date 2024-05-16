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
package com.tencentcloudapi.vtc.v20240223.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AsrTimestamps extends AbstractModel {

    /**
    * 文本片段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartMs")
    @Expose
    private Long StartMs;

    /**
    * 结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndMs")
    @Expose
    private Long EndMs;

    /**
     * Get 文本片段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Text 文本片段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 文本片段
注意：此字段可能返回 null，表示取不到有效值。
     * @param Text 文本片段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartMs 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartMs() {
        return this.StartMs;
    }

    /**
     * Set 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartMs 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartMs(Long StartMs) {
        this.StartMs = StartMs;
    }

    /**
     * Get 结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndMs 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEndMs() {
        return this.EndMs;
    }

    /**
     * Set 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndMs 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndMs(Long EndMs) {
        this.EndMs = EndMs;
    }

    public AsrTimestamps() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsrTimestamps(AsrTimestamps source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.StartMs != null) {
            this.StartMs = new Long(source.StartMs);
        }
        if (source.EndMs != null) {
            this.EndMs = new Long(source.EndMs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "StartMs", this.StartMs);
        this.setParamSimple(map, prefix + "EndMs", this.EndMs);

    }
}

