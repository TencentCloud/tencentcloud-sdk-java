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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SentenceWords extends AbstractModel{

    /**
    * 词文本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Word")
    @Expose
    private String Word;

    /**
    * 在句子中的开始时间偏移量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OffsetStartMs")
    @Expose
    private Long OffsetStartMs;

    /**
    * 在句子中的结束时间偏移量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OffsetEndMs")
    @Expose
    private Long OffsetEndMs;

    /**
     * Get 词文本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Word 词文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWord() {
        return this.Word;
    }

    /**
     * Set 词文本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Word 词文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWord(String Word) {
        this.Word = Word;
    }

    /**
     * Get 在句子中的开始时间偏移量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OffsetStartMs 在句子中的开始时间偏移量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOffsetStartMs() {
        return this.OffsetStartMs;
    }

    /**
     * Set 在句子中的开始时间偏移量
注意：此字段可能返回 null，表示取不到有效值。
     * @param OffsetStartMs 在句子中的开始时间偏移量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOffsetStartMs(Long OffsetStartMs) {
        this.OffsetStartMs = OffsetStartMs;
    }

    /**
     * Get 在句子中的结束时间偏移量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OffsetEndMs 在句子中的结束时间偏移量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOffsetEndMs() {
        return this.OffsetEndMs;
    }

    /**
     * Set 在句子中的结束时间偏移量
注意：此字段可能返回 null，表示取不到有效值。
     * @param OffsetEndMs 在句子中的结束时间偏移量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOffsetEndMs(Long OffsetEndMs) {
        this.OffsetEndMs = OffsetEndMs;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Word", this.Word);
        this.setParamSimple(map, prefix + "OffsetStartMs", this.OffsetStartMs);
        this.setParamSimple(map, prefix + "OffsetEndMs", this.OffsetEndMs);

    }
}

