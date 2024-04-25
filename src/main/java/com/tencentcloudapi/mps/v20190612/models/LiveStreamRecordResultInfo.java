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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveStreamRecordResultInfo extends AbstractModel {

    /**
    * 录制是否结束。
0：录制未结束，返回单个文件结果
1：录制结束，返回所有录制文件结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordOver")
    @Expose
    private Long RecordOver;

    /**
    * 文件列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileResults")
    @Expose
    private LiveRecordFile [] FileResults;

    /**
     * Get 录制是否结束。
0：录制未结束，返回单个文件结果
1：录制结束，返回所有录制文件结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordOver 录制是否结束。
0：录制未结束，返回单个文件结果
1：录制结束，返回所有录制文件结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRecordOver() {
        return this.RecordOver;
    }

    /**
     * Set 录制是否结束。
0：录制未结束，返回单个文件结果
1：录制结束，返回所有录制文件结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordOver 录制是否结束。
0：录制未结束，返回单个文件结果
1：录制结束，返回所有录制文件结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordOver(Long RecordOver) {
        this.RecordOver = RecordOver;
    }

    /**
     * Get 文件列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileResults 文件列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LiveRecordFile [] getFileResults() {
        return this.FileResults;
    }

    /**
     * Set 文件列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileResults 文件列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileResults(LiveRecordFile [] FileResults) {
        this.FileResults = FileResults;
    }

    public LiveStreamRecordResultInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveStreamRecordResultInfo(LiveStreamRecordResultInfo source) {
        if (source.RecordOver != null) {
            this.RecordOver = new Long(source.RecordOver);
        }
        if (source.FileResults != null) {
            this.FileResults = new LiveRecordFile[source.FileResults.length];
            for (int i = 0; i < source.FileResults.length; i++) {
                this.FileResults[i] = new LiveRecordFile(source.FileResults[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordOver", this.RecordOver);
        this.setParamArrayObj(map, prefix + "FileResults.", this.FileResults);

    }
}

