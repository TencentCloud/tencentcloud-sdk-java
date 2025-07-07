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

public class LiveStreamAiRecognitionResultItem extends AbstractModel {

    /**
    * 结果的类型，取值范围：
<li>FaceRecognition：人脸识别，</li>
<li>AsrWordsRecognition：语音关键词识别，</li>
<li>OcrWordsRecognition：文本关键词识别，</li>
<li>AsrFullTextRecognition：语音全文识别，</li>
<li>OcrFullTextRecognition：文本全文识别。</li>
<li>TransTextRecognition：语音翻译。</li>
<li>ObjectRecognition：目标检测。</li>
<li>TagRecognition：精彩打点。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 人脸识别结果，当 Type 为
FaceRecognition 时有效。
    */
    @SerializedName("FaceRecognitionResultSet")
    @Expose
    private LiveStreamFaceRecognitionResult [] FaceRecognitionResultSet;

    /**
    * 语音关键词识别结果，当 Type 为
AsrWordsRecognition 时有效。
    */
    @SerializedName("AsrWordsRecognitionResultSet")
    @Expose
    private LiveStreamAsrWordsRecognitionResult [] AsrWordsRecognitionResultSet;

    /**
    * 文本关键词识别结果，当 Type 为
OcrWordsRecognition 时有效。
    */
    @SerializedName("OcrWordsRecognitionResultSet")
    @Expose
    private LiveStreamOcrWordsRecognitionResult [] OcrWordsRecognitionResultSet;

    /**
    * 语音全文识别结果，当 Type 为
AsrFullTextRecognition 时有效。
    */
    @SerializedName("AsrFullTextRecognitionResultSet")
    @Expose
    private LiveStreamAsrFullTextRecognitionResult [] AsrFullTextRecognitionResultSet;

    /**
    * 文本全文识别结果，当 Type 为
OcrFullTextRecognition 时有效。
    */
    @SerializedName("OcrFullTextRecognitionResultSet")
    @Expose
    private LiveStreamOcrFullTextRecognitionResult [] OcrFullTextRecognitionResultSet;

    /**
    * 翻译结果，当Type 为 TransTextRecognition 时有效。
    */
    @SerializedName("TransTextRecognitionResultSet")
    @Expose
    private LiveStreamTransTextRecognitionResult [] TransTextRecognitionResultSet;

    /**
    * 目标检测结果，当Type为 ObjectRecognition 时有效。
    */
    @SerializedName("ObjectRecognitionResultSet")
    @Expose
    private LiveStreamObjectRecognitionResult [] ObjectRecognitionResultSet;

    /**
    * 打点结果，当Type 为 TagRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagRecognitionResultSet")
    @Expose
    private LiveStreamTagRecognitionResult [] TagRecognitionResultSet;

    /**
     * Get 结果的类型，取值范围：
<li>FaceRecognition：人脸识别，</li>
<li>AsrWordsRecognition：语音关键词识别，</li>
<li>OcrWordsRecognition：文本关键词识别，</li>
<li>AsrFullTextRecognition：语音全文识别，</li>
<li>OcrFullTextRecognition：文本全文识别。</li>
<li>TransTextRecognition：语音翻译。</li>
<li>ObjectRecognition：目标检测。</li>
<li>TagRecognition：精彩打点。</li> 
     * @return Type 结果的类型，取值范围：
<li>FaceRecognition：人脸识别，</li>
<li>AsrWordsRecognition：语音关键词识别，</li>
<li>OcrWordsRecognition：文本关键词识别，</li>
<li>AsrFullTextRecognition：语音全文识别，</li>
<li>OcrFullTextRecognition：文本全文识别。</li>
<li>TransTextRecognition：语音翻译。</li>
<li>ObjectRecognition：目标检测。</li>
<li>TagRecognition：精彩打点。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 结果的类型，取值范围：
<li>FaceRecognition：人脸识别，</li>
<li>AsrWordsRecognition：语音关键词识别，</li>
<li>OcrWordsRecognition：文本关键词识别，</li>
<li>AsrFullTextRecognition：语音全文识别，</li>
<li>OcrFullTextRecognition：文本全文识别。</li>
<li>TransTextRecognition：语音翻译。</li>
<li>ObjectRecognition：目标检测。</li>
<li>TagRecognition：精彩打点。</li>
     * @param Type 结果的类型，取值范围：
<li>FaceRecognition：人脸识别，</li>
<li>AsrWordsRecognition：语音关键词识别，</li>
<li>OcrWordsRecognition：文本关键词识别，</li>
<li>AsrFullTextRecognition：语音全文识别，</li>
<li>OcrFullTextRecognition：文本全文识别。</li>
<li>TransTextRecognition：语音翻译。</li>
<li>ObjectRecognition：目标检测。</li>
<li>TagRecognition：精彩打点。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 人脸识别结果，当 Type 为
FaceRecognition 时有效。 
     * @return FaceRecognitionResultSet 人脸识别结果，当 Type 为
FaceRecognition 时有效。
     */
    public LiveStreamFaceRecognitionResult [] getFaceRecognitionResultSet() {
        return this.FaceRecognitionResultSet;
    }

    /**
     * Set 人脸识别结果，当 Type 为
FaceRecognition 时有效。
     * @param FaceRecognitionResultSet 人脸识别结果，当 Type 为
FaceRecognition 时有效。
     */
    public void setFaceRecognitionResultSet(LiveStreamFaceRecognitionResult [] FaceRecognitionResultSet) {
        this.FaceRecognitionResultSet = FaceRecognitionResultSet;
    }

    /**
     * Get 语音关键词识别结果，当 Type 为
AsrWordsRecognition 时有效。 
     * @return AsrWordsRecognitionResultSet 语音关键词识别结果，当 Type 为
AsrWordsRecognition 时有效。
     */
    public LiveStreamAsrWordsRecognitionResult [] getAsrWordsRecognitionResultSet() {
        return this.AsrWordsRecognitionResultSet;
    }

    /**
     * Set 语音关键词识别结果，当 Type 为
AsrWordsRecognition 时有效。
     * @param AsrWordsRecognitionResultSet 语音关键词识别结果，当 Type 为
AsrWordsRecognition 时有效。
     */
    public void setAsrWordsRecognitionResultSet(LiveStreamAsrWordsRecognitionResult [] AsrWordsRecognitionResultSet) {
        this.AsrWordsRecognitionResultSet = AsrWordsRecognitionResultSet;
    }

    /**
     * Get 文本关键词识别结果，当 Type 为
OcrWordsRecognition 时有效。 
     * @return OcrWordsRecognitionResultSet 文本关键词识别结果，当 Type 为
OcrWordsRecognition 时有效。
     */
    public LiveStreamOcrWordsRecognitionResult [] getOcrWordsRecognitionResultSet() {
        return this.OcrWordsRecognitionResultSet;
    }

    /**
     * Set 文本关键词识别结果，当 Type 为
OcrWordsRecognition 时有效。
     * @param OcrWordsRecognitionResultSet 文本关键词识别结果，当 Type 为
OcrWordsRecognition 时有效。
     */
    public void setOcrWordsRecognitionResultSet(LiveStreamOcrWordsRecognitionResult [] OcrWordsRecognitionResultSet) {
        this.OcrWordsRecognitionResultSet = OcrWordsRecognitionResultSet;
    }

    /**
     * Get 语音全文识别结果，当 Type 为
AsrFullTextRecognition 时有效。 
     * @return AsrFullTextRecognitionResultSet 语音全文识别结果，当 Type 为
AsrFullTextRecognition 时有效。
     */
    public LiveStreamAsrFullTextRecognitionResult [] getAsrFullTextRecognitionResultSet() {
        return this.AsrFullTextRecognitionResultSet;
    }

    /**
     * Set 语音全文识别结果，当 Type 为
AsrFullTextRecognition 时有效。
     * @param AsrFullTextRecognitionResultSet 语音全文识别结果，当 Type 为
AsrFullTextRecognition 时有效。
     */
    public void setAsrFullTextRecognitionResultSet(LiveStreamAsrFullTextRecognitionResult [] AsrFullTextRecognitionResultSet) {
        this.AsrFullTextRecognitionResultSet = AsrFullTextRecognitionResultSet;
    }

    /**
     * Get 文本全文识别结果，当 Type 为
OcrFullTextRecognition 时有效。 
     * @return OcrFullTextRecognitionResultSet 文本全文识别结果，当 Type 为
OcrFullTextRecognition 时有效。
     */
    public LiveStreamOcrFullTextRecognitionResult [] getOcrFullTextRecognitionResultSet() {
        return this.OcrFullTextRecognitionResultSet;
    }

    /**
     * Set 文本全文识别结果，当 Type 为
OcrFullTextRecognition 时有效。
     * @param OcrFullTextRecognitionResultSet 文本全文识别结果，当 Type 为
OcrFullTextRecognition 时有效。
     */
    public void setOcrFullTextRecognitionResultSet(LiveStreamOcrFullTextRecognitionResult [] OcrFullTextRecognitionResultSet) {
        this.OcrFullTextRecognitionResultSet = OcrFullTextRecognitionResultSet;
    }

    /**
     * Get 翻译结果，当Type 为 TransTextRecognition 时有效。 
     * @return TransTextRecognitionResultSet 翻译结果，当Type 为 TransTextRecognition 时有效。
     */
    public LiveStreamTransTextRecognitionResult [] getTransTextRecognitionResultSet() {
        return this.TransTextRecognitionResultSet;
    }

    /**
     * Set 翻译结果，当Type 为 TransTextRecognition 时有效。
     * @param TransTextRecognitionResultSet 翻译结果，当Type 为 TransTextRecognition 时有效。
     */
    public void setTransTextRecognitionResultSet(LiveStreamTransTextRecognitionResult [] TransTextRecognitionResultSet) {
        this.TransTextRecognitionResultSet = TransTextRecognitionResultSet;
    }

    /**
     * Get 目标检测结果，当Type为 ObjectRecognition 时有效。 
     * @return ObjectRecognitionResultSet 目标检测结果，当Type为 ObjectRecognition 时有效。
     */
    public LiveStreamObjectRecognitionResult [] getObjectRecognitionResultSet() {
        return this.ObjectRecognitionResultSet;
    }

    /**
     * Set 目标检测结果，当Type为 ObjectRecognition 时有效。
     * @param ObjectRecognitionResultSet 目标检测结果，当Type为 ObjectRecognition 时有效。
     */
    public void setObjectRecognitionResultSet(LiveStreamObjectRecognitionResult [] ObjectRecognitionResultSet) {
        this.ObjectRecognitionResultSet = ObjectRecognitionResultSet;
    }

    /**
     * Get 打点结果，当Type 为 TagRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagRecognitionResultSet 打点结果，当Type 为 TagRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LiveStreamTagRecognitionResult [] getTagRecognitionResultSet() {
        return this.TagRecognitionResultSet;
    }

    /**
     * Set 打点结果，当Type 为 TagRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagRecognitionResultSet 打点结果，当Type 为 TagRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagRecognitionResultSet(LiveStreamTagRecognitionResult [] TagRecognitionResultSet) {
        this.TagRecognitionResultSet = TagRecognitionResultSet;
    }

    public LiveStreamAiRecognitionResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveStreamAiRecognitionResultItem(LiveStreamAiRecognitionResultItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.FaceRecognitionResultSet != null) {
            this.FaceRecognitionResultSet = new LiveStreamFaceRecognitionResult[source.FaceRecognitionResultSet.length];
            for (int i = 0; i < source.FaceRecognitionResultSet.length; i++) {
                this.FaceRecognitionResultSet[i] = new LiveStreamFaceRecognitionResult(source.FaceRecognitionResultSet[i]);
            }
        }
        if (source.AsrWordsRecognitionResultSet != null) {
            this.AsrWordsRecognitionResultSet = new LiveStreamAsrWordsRecognitionResult[source.AsrWordsRecognitionResultSet.length];
            for (int i = 0; i < source.AsrWordsRecognitionResultSet.length; i++) {
                this.AsrWordsRecognitionResultSet[i] = new LiveStreamAsrWordsRecognitionResult(source.AsrWordsRecognitionResultSet[i]);
            }
        }
        if (source.OcrWordsRecognitionResultSet != null) {
            this.OcrWordsRecognitionResultSet = new LiveStreamOcrWordsRecognitionResult[source.OcrWordsRecognitionResultSet.length];
            for (int i = 0; i < source.OcrWordsRecognitionResultSet.length; i++) {
                this.OcrWordsRecognitionResultSet[i] = new LiveStreamOcrWordsRecognitionResult(source.OcrWordsRecognitionResultSet[i]);
            }
        }
        if (source.AsrFullTextRecognitionResultSet != null) {
            this.AsrFullTextRecognitionResultSet = new LiveStreamAsrFullTextRecognitionResult[source.AsrFullTextRecognitionResultSet.length];
            for (int i = 0; i < source.AsrFullTextRecognitionResultSet.length; i++) {
                this.AsrFullTextRecognitionResultSet[i] = new LiveStreamAsrFullTextRecognitionResult(source.AsrFullTextRecognitionResultSet[i]);
            }
        }
        if (source.OcrFullTextRecognitionResultSet != null) {
            this.OcrFullTextRecognitionResultSet = new LiveStreamOcrFullTextRecognitionResult[source.OcrFullTextRecognitionResultSet.length];
            for (int i = 0; i < source.OcrFullTextRecognitionResultSet.length; i++) {
                this.OcrFullTextRecognitionResultSet[i] = new LiveStreamOcrFullTextRecognitionResult(source.OcrFullTextRecognitionResultSet[i]);
            }
        }
        if (source.TransTextRecognitionResultSet != null) {
            this.TransTextRecognitionResultSet = new LiveStreamTransTextRecognitionResult[source.TransTextRecognitionResultSet.length];
            for (int i = 0; i < source.TransTextRecognitionResultSet.length; i++) {
                this.TransTextRecognitionResultSet[i] = new LiveStreamTransTextRecognitionResult(source.TransTextRecognitionResultSet[i]);
            }
        }
        if (source.ObjectRecognitionResultSet != null) {
            this.ObjectRecognitionResultSet = new LiveStreamObjectRecognitionResult[source.ObjectRecognitionResultSet.length];
            for (int i = 0; i < source.ObjectRecognitionResultSet.length; i++) {
                this.ObjectRecognitionResultSet[i] = new LiveStreamObjectRecognitionResult(source.ObjectRecognitionResultSet[i]);
            }
        }
        if (source.TagRecognitionResultSet != null) {
            this.TagRecognitionResultSet = new LiveStreamTagRecognitionResult[source.TagRecognitionResultSet.length];
            for (int i = 0; i < source.TagRecognitionResultSet.length; i++) {
                this.TagRecognitionResultSet[i] = new LiveStreamTagRecognitionResult(source.TagRecognitionResultSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "FaceRecognitionResultSet.", this.FaceRecognitionResultSet);
        this.setParamArrayObj(map, prefix + "AsrWordsRecognitionResultSet.", this.AsrWordsRecognitionResultSet);
        this.setParamArrayObj(map, prefix + "OcrWordsRecognitionResultSet.", this.OcrWordsRecognitionResultSet);
        this.setParamArrayObj(map, prefix + "AsrFullTextRecognitionResultSet.", this.AsrFullTextRecognitionResultSet);
        this.setParamArrayObj(map, prefix + "OcrFullTextRecognitionResultSet.", this.OcrFullTextRecognitionResultSet);
        this.setParamArrayObj(map, prefix + "TransTextRecognitionResultSet.", this.TransTextRecognitionResultSet);
        this.setParamArrayObj(map, prefix + "ObjectRecognitionResultSet.", this.ObjectRecognitionResultSet);
        this.setParamArrayObj(map, prefix + "TagRecognitionResultSet.", this.TagRecognitionResultSet);

    }
}

