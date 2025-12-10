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

public class SmartSubtitleTaskTextResultOutput extends AbstractModel {

    /**
    * 识别字幕结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecognizeSubtitleResult")
    @Expose
    private SubtitleResult [] RecognizeSubtitleResult;

    /**
    * 翻译字幕结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransSubtitleResult")
    @Expose
    private SubtitleResult [] TransSubtitleResult;

    /**
    * 字幕文件存储位置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
     * Get 识别字幕结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecognizeSubtitleResult 识别字幕结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SubtitleResult [] getRecognizeSubtitleResult() {
        return this.RecognizeSubtitleResult;
    }

    /**
     * Set 识别字幕结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecognizeSubtitleResult 识别字幕结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecognizeSubtitleResult(SubtitleResult [] RecognizeSubtitleResult) {
        this.RecognizeSubtitleResult = RecognizeSubtitleResult;
    }

    /**
     * Get 翻译字幕结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransSubtitleResult 翻译字幕结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SubtitleResult [] getTransSubtitleResult() {
        return this.TransSubtitleResult;
    }

    /**
     * Set 翻译字幕结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransSubtitleResult 翻译字幕结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransSubtitleResult(SubtitleResult [] TransSubtitleResult) {
        this.TransSubtitleResult = TransSubtitleResult;
    }

    /**
     * Get 字幕文件存储位置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputStorage 字幕文件存储位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set 字幕文件存储位置
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputStorage 字幕文件存储位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    public SmartSubtitleTaskTextResultOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartSubtitleTaskTextResultOutput(SmartSubtitleTaskTextResultOutput source) {
        if (source.RecognizeSubtitleResult != null) {
            this.RecognizeSubtitleResult = new SubtitleResult[source.RecognizeSubtitleResult.length];
            for (int i = 0; i < source.RecognizeSubtitleResult.length; i++) {
                this.RecognizeSubtitleResult[i] = new SubtitleResult(source.RecognizeSubtitleResult[i]);
            }
        }
        if (source.TransSubtitleResult != null) {
            this.TransSubtitleResult = new SubtitleResult[source.TransSubtitleResult.length];
            for (int i = 0; i < source.TransSubtitleResult.length; i++) {
                this.TransSubtitleResult[i] = new SubtitleResult(source.TransSubtitleResult[i]);
            }
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RecognizeSubtitleResult.", this.RecognizeSubtitleResult);
        this.setParamArrayObj(map, prefix + "TransSubtitleResult.", this.TransSubtitleResult);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);

    }
}

