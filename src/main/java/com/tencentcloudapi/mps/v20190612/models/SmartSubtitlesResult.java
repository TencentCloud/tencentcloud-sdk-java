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

public class SmartSubtitlesResult extends AbstractModel {

    /**
    * 任务的类型，取值范围： 
<li>AsrFullTextRecognition：语音全文识别，</li> 
<li>TransTextRecognition：语音翻译。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 语音全文识别结果，当 Type 为
 AsrFullTextRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AsrFullTextTask")
    @Expose
    private SmartSubtitleTaskAsrFullTextResult AsrFullTextTask;

    /**
    * 翻译结果，当 Type 为

TransTextRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransTextTask")
    @Expose
    private SmartSubtitleTaskTransTextResult TransTextTask;

    /**
     * Get 任务的类型，取值范围： 
<li>AsrFullTextRecognition：语音全文识别，</li> 
<li>TransTextRecognition：语音翻译。</li> 
     * @return Type 任务的类型，取值范围： 
<li>AsrFullTextRecognition：语音全文识别，</li> 
<li>TransTextRecognition：语音翻译。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 任务的类型，取值范围： 
<li>AsrFullTextRecognition：语音全文识别，</li> 
<li>TransTextRecognition：语音翻译。</li>
     * @param Type 任务的类型，取值范围： 
<li>AsrFullTextRecognition：语音全文识别，</li> 
<li>TransTextRecognition：语音翻译。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 语音全文识别结果，当 Type 为
 AsrFullTextRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AsrFullTextTask 语音全文识别结果，当 Type 为
 AsrFullTextRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SmartSubtitleTaskAsrFullTextResult getAsrFullTextTask() {
        return this.AsrFullTextTask;
    }

    /**
     * Set 语音全文识别结果，当 Type 为
 AsrFullTextRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AsrFullTextTask 语音全文识别结果，当 Type 为
 AsrFullTextRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAsrFullTextTask(SmartSubtitleTaskAsrFullTextResult AsrFullTextTask) {
        this.AsrFullTextTask = AsrFullTextTask;
    }

    /**
     * Get 翻译结果，当 Type 为

TransTextRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransTextTask 翻译结果，当 Type 为

TransTextRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SmartSubtitleTaskTransTextResult getTransTextTask() {
        return this.TransTextTask;
    }

    /**
     * Set 翻译结果，当 Type 为

TransTextRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransTextTask 翻译结果，当 Type 为

TransTextRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransTextTask(SmartSubtitleTaskTransTextResult TransTextTask) {
        this.TransTextTask = TransTextTask;
    }

    public SmartSubtitlesResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartSubtitlesResult(SmartSubtitlesResult source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.AsrFullTextTask != null) {
            this.AsrFullTextTask = new SmartSubtitleTaskAsrFullTextResult(source.AsrFullTextTask);
        }
        if (source.TransTextTask != null) {
            this.TransTextTask = new SmartSubtitleTaskTransTextResult(source.TransTextTask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "AsrFullTextTask.", this.AsrFullTextTask);
        this.setParamObj(map, prefix + "TransTextTask.", this.TransTextTask);

    }
}

