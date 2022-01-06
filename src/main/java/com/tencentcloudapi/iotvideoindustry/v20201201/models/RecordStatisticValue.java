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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordStatisticValue extends AbstractModel{

    /**
    * 期望执行时间 秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpectTimeLen")
    @Expose
    private Long ExpectTimeLen;

    /**
    * 实际执行时间 秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordTimeLen")
    @Expose
    private Long RecordTimeLen;

    /**
    * 存储大小 G
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileSize")
    @Expose
    private Float FileSize;

    /**
     * Get 期望执行时间 秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpectTimeLen 期望执行时间 秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExpectTimeLen() {
        return this.ExpectTimeLen;
    }

    /**
     * Set 期望执行时间 秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpectTimeLen 期望执行时间 秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpectTimeLen(Long ExpectTimeLen) {
        this.ExpectTimeLen = ExpectTimeLen;
    }

    /**
     * Get 实际执行时间 秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordTimeLen 实际执行时间 秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRecordTimeLen() {
        return this.RecordTimeLen;
    }

    /**
     * Set 实际执行时间 秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordTimeLen 实际执行时间 秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordTimeLen(Long RecordTimeLen) {
        this.RecordTimeLen = RecordTimeLen;
    }

    /**
     * Get 存储大小 G
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileSize 存储大小 G
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 存储大小 G
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileSize 存储大小 G
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileSize(Float FileSize) {
        this.FileSize = FileSize;
    }

    public RecordStatisticValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordStatisticValue(RecordStatisticValue source) {
        if (source.ExpectTimeLen != null) {
            this.ExpectTimeLen = new Long(source.ExpectTimeLen);
        }
        if (source.RecordTimeLen != null) {
            this.RecordTimeLen = new Long(source.RecordTimeLen);
        }
        if (source.FileSize != null) {
            this.FileSize = new Float(source.FileSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExpectTimeLen", this.ExpectTimeLen);
        this.setParamSimple(map, prefix + "RecordTimeLen", this.RecordTimeLen);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);

    }
}

