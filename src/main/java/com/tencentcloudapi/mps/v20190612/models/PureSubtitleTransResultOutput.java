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

public class PureSubtitleTransResultOutput extends AbstractModel {

    /**
    * 字幕文件存储位置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * 多语言翻译的结果集合
    */
    @SerializedName("SubtitleResults")
    @Expose
    private SubtitleTransResultItem [] SubtitleResults;

    /**
     * Get 字幕文件存储位置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputStorage 字幕文件存储位置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set 字幕文件存储位置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputStorage 字幕文件存储位置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get 多语言翻译的结果集合 
     * @return SubtitleResults 多语言翻译的结果集合
     */
    public SubtitleTransResultItem [] getSubtitleResults() {
        return this.SubtitleResults;
    }

    /**
     * Set 多语言翻译的结果集合
     * @param SubtitleResults 多语言翻译的结果集合
     */
    public void setSubtitleResults(SubtitleTransResultItem [] SubtitleResults) {
        this.SubtitleResults = SubtitleResults;
    }

    public PureSubtitleTransResultOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PureSubtitleTransResultOutput(PureSubtitleTransResultOutput source) {
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.SubtitleResults != null) {
            this.SubtitleResults = new SubtitleTransResultItem[source.SubtitleResults.length];
            for (int i = 0; i < source.SubtitleResults.length; i++) {
                this.SubtitleResults[i] = new SubtitleTransResultItem(source.SubtitleResults[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamArrayObj(map, prefix + "SubtitleResults.", this.SubtitleResults);

    }
}

