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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CellContent extends AbstractModel {

    /**
    * 段落编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParagNo")
    @Expose
    private Long ParagNo;

    /**
    * 字体大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WordSize")
    @Expose
    private Long WordSize;

    /**
     * Get 段落编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParagNo 段落编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getParagNo() {
        return this.ParagNo;
    }

    /**
     * Set 段落编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParagNo 段落编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParagNo(Long ParagNo) {
        this.ParagNo = ParagNo;
    }

    /**
     * Get 字体大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WordSize 字体大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWordSize() {
        return this.WordSize;
    }

    /**
     * Set 字体大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param WordSize 字体大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWordSize(Long WordSize) {
        this.WordSize = WordSize;
    }

    public CellContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CellContent(CellContent source) {
        if (source.ParagNo != null) {
            this.ParagNo = new Long(source.ParagNo);
        }
        if (source.WordSize != null) {
            this.WordSize = new Long(source.WordSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParagNo", this.ParagNo);
        this.setParamSimple(map, prefix + "WordSize", this.WordSize);

    }
}

