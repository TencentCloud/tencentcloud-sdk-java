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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiRecognitionResult extends AbstractModel {

    /**
    * 任务的类型，取值范围：
<li>FaceRecognition：人脸识别，</li>
<li>AsrWordsRecognition：语音关键词识别，</li>
<li>OcrWordsRecognition：文本关键词识别，</li>
<li>AsrFullTextRecognition：语音全文识别，</li>
<li>AsrTranslateRecognition：语音翻译识别，</li>
<li>OcrFullTextRecognition：文本全文识别，</li>
<li>HeadTailRecognition：视频片头片尾识别，</li>
<li>ObjectRecognition：物体识别。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 视频片头片尾识别结果，当 Type 为
 HeadTailRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeadTailTask")
    @Expose
    private AiRecognitionTaskHeadTailResult HeadTailTask;

    /**
    * 视频拆条识别结果，当 Type 为
 SegmentRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SegmentTask")
    @Expose
    private AiRecognitionTaskSegmentResult SegmentTask;

    /**
    * 人脸识别结果，当 Type 为 
 FaceRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FaceTask")
    @Expose
    private AiRecognitionTaskFaceResult FaceTask;

    /**
    * 语音关键词识别结果，当 Type 为
 AsrWordsRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AsrWordsTask")
    @Expose
    private AiRecognitionTaskAsrWordsResult AsrWordsTask;

    /**
    * 语音全文识别结果，当 Type 为
 AsrFullTextRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AsrFullTextTask")
    @Expose
    private AiRecognitionTaskAsrFullTextResult AsrFullTextTask;

    /**
    * 语音翻译结果，当 Type 为 AsrTranslateRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AsrTranslateTask")
    @Expose
    private AiRecognitionTaskAsrTranslateResult AsrTranslateTask;

    /**
    * 文本关键词识别结果，当 Type 为
 OcrWordsRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrWordsTask")
    @Expose
    private AiRecognitionTaskOcrWordsResult OcrWordsTask;

    /**
    * 文本全文识别结果，当 Type 为
 OcrFullTextRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrFullTextTask")
    @Expose
    private AiRecognitionTaskOcrFullTextResult OcrFullTextTask;

    /**
    * 物体识别结果，当 Type 为
 ObjectRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectTask")
    @Expose
    private AiRecognitionTaskObjectResult ObjectTask;

    /**
     * Get 任务的类型，取值范围：
<li>FaceRecognition：人脸识别，</li>
<li>AsrWordsRecognition：语音关键词识别，</li>
<li>OcrWordsRecognition：文本关键词识别，</li>
<li>AsrFullTextRecognition：语音全文识别，</li>
<li>AsrTranslateRecognition：语音翻译识别，</li>
<li>OcrFullTextRecognition：文本全文识别，</li>
<li>HeadTailRecognition：视频片头片尾识别，</li>
<li>ObjectRecognition：物体识别。</li> 
     * @return Type 任务的类型，取值范围：
<li>FaceRecognition：人脸识别，</li>
<li>AsrWordsRecognition：语音关键词识别，</li>
<li>OcrWordsRecognition：文本关键词识别，</li>
<li>AsrFullTextRecognition：语音全文识别，</li>
<li>AsrTranslateRecognition：语音翻译识别，</li>
<li>OcrFullTextRecognition：文本全文识别，</li>
<li>HeadTailRecognition：视频片头片尾识别，</li>
<li>ObjectRecognition：物体识别。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 任务的类型，取值范围：
<li>FaceRecognition：人脸识别，</li>
<li>AsrWordsRecognition：语音关键词识别，</li>
<li>OcrWordsRecognition：文本关键词识别，</li>
<li>AsrFullTextRecognition：语音全文识别，</li>
<li>AsrTranslateRecognition：语音翻译识别，</li>
<li>OcrFullTextRecognition：文本全文识别，</li>
<li>HeadTailRecognition：视频片头片尾识别，</li>
<li>ObjectRecognition：物体识别。</li>
     * @param Type 任务的类型，取值范围：
<li>FaceRecognition：人脸识别，</li>
<li>AsrWordsRecognition：语音关键词识别，</li>
<li>OcrWordsRecognition：文本关键词识别，</li>
<li>AsrFullTextRecognition：语音全文识别，</li>
<li>AsrTranslateRecognition：语音翻译识别，</li>
<li>OcrFullTextRecognition：文本全文识别，</li>
<li>HeadTailRecognition：视频片头片尾识别，</li>
<li>ObjectRecognition：物体识别。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 视频片头片尾识别结果，当 Type 为
 HeadTailRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeadTailTask 视频片头片尾识别结果，当 Type 为
 HeadTailRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiRecognitionTaskHeadTailResult getHeadTailTask() {
        return this.HeadTailTask;
    }

    /**
     * Set 视频片头片尾识别结果，当 Type 为
 HeadTailRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeadTailTask 视频片头片尾识别结果，当 Type 为
 HeadTailRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeadTailTask(AiRecognitionTaskHeadTailResult HeadTailTask) {
        this.HeadTailTask = HeadTailTask;
    }

    /**
     * Get 视频拆条识别结果，当 Type 为
 SegmentRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SegmentTask 视频拆条识别结果，当 Type 为
 SegmentRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiRecognitionTaskSegmentResult getSegmentTask() {
        return this.SegmentTask;
    }

    /**
     * Set 视频拆条识别结果，当 Type 为
 SegmentRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SegmentTask 视频拆条识别结果，当 Type 为
 SegmentRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSegmentTask(AiRecognitionTaskSegmentResult SegmentTask) {
        this.SegmentTask = SegmentTask;
    }

    /**
     * Get 人脸识别结果，当 Type 为 
 FaceRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FaceTask 人脸识别结果，当 Type 为 
 FaceRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiRecognitionTaskFaceResult getFaceTask() {
        return this.FaceTask;
    }

    /**
     * Set 人脸识别结果，当 Type 为 
 FaceRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FaceTask 人脸识别结果，当 Type 为 
 FaceRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFaceTask(AiRecognitionTaskFaceResult FaceTask) {
        this.FaceTask = FaceTask;
    }

    /**
     * Get 语音关键词识别结果，当 Type 为
 AsrWordsRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AsrWordsTask 语音关键词识别结果，当 Type 为
 AsrWordsRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiRecognitionTaskAsrWordsResult getAsrWordsTask() {
        return this.AsrWordsTask;
    }

    /**
     * Set 语音关键词识别结果，当 Type 为
 AsrWordsRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AsrWordsTask 语音关键词识别结果，当 Type 为
 AsrWordsRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAsrWordsTask(AiRecognitionTaskAsrWordsResult AsrWordsTask) {
        this.AsrWordsTask = AsrWordsTask;
    }

    /**
     * Get 语音全文识别结果，当 Type 为
 AsrFullTextRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AsrFullTextTask 语音全文识别结果，当 Type 为
 AsrFullTextRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiRecognitionTaskAsrFullTextResult getAsrFullTextTask() {
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
    public void setAsrFullTextTask(AiRecognitionTaskAsrFullTextResult AsrFullTextTask) {
        this.AsrFullTextTask = AsrFullTextTask;
    }

    /**
     * Get 语音翻译结果，当 Type 为 AsrTranslateRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AsrTranslateTask 语音翻译结果，当 Type 为 AsrTranslateRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiRecognitionTaskAsrTranslateResult getAsrTranslateTask() {
        return this.AsrTranslateTask;
    }

    /**
     * Set 语音翻译结果，当 Type 为 AsrTranslateRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AsrTranslateTask 语音翻译结果，当 Type 为 AsrTranslateRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAsrTranslateTask(AiRecognitionTaskAsrTranslateResult AsrTranslateTask) {
        this.AsrTranslateTask = AsrTranslateTask;
    }

    /**
     * Get 文本关键词识别结果，当 Type 为
 OcrWordsRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrWordsTask 文本关键词识别结果，当 Type 为
 OcrWordsRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiRecognitionTaskOcrWordsResult getOcrWordsTask() {
        return this.OcrWordsTask;
    }

    /**
     * Set 文本关键词识别结果，当 Type 为
 OcrWordsRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrWordsTask 文本关键词识别结果，当 Type 为
 OcrWordsRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrWordsTask(AiRecognitionTaskOcrWordsResult OcrWordsTask) {
        this.OcrWordsTask = OcrWordsTask;
    }

    /**
     * Get 文本全文识别结果，当 Type 为
 OcrFullTextRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrFullTextTask 文本全文识别结果，当 Type 为
 OcrFullTextRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiRecognitionTaskOcrFullTextResult getOcrFullTextTask() {
        return this.OcrFullTextTask;
    }

    /**
     * Set 文本全文识别结果，当 Type 为
 OcrFullTextRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrFullTextTask 文本全文识别结果，当 Type 为
 OcrFullTextRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrFullTextTask(AiRecognitionTaskOcrFullTextResult OcrFullTextTask) {
        this.OcrFullTextTask = OcrFullTextTask;
    }

    /**
     * Get 物体识别结果，当 Type 为
 ObjectRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectTask 物体识别结果，当 Type 为
 ObjectRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiRecognitionTaskObjectResult getObjectTask() {
        return this.ObjectTask;
    }

    /**
     * Set 物体识别结果，当 Type 为
 ObjectRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectTask 物体识别结果，当 Type 为
 ObjectRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectTask(AiRecognitionTaskObjectResult ObjectTask) {
        this.ObjectTask = ObjectTask;
    }

    public AiRecognitionResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiRecognitionResult(AiRecognitionResult source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.HeadTailTask != null) {
            this.HeadTailTask = new AiRecognitionTaskHeadTailResult(source.HeadTailTask);
        }
        if (source.SegmentTask != null) {
            this.SegmentTask = new AiRecognitionTaskSegmentResult(source.SegmentTask);
        }
        if (source.FaceTask != null) {
            this.FaceTask = new AiRecognitionTaskFaceResult(source.FaceTask);
        }
        if (source.AsrWordsTask != null) {
            this.AsrWordsTask = new AiRecognitionTaskAsrWordsResult(source.AsrWordsTask);
        }
        if (source.AsrFullTextTask != null) {
            this.AsrFullTextTask = new AiRecognitionTaskAsrFullTextResult(source.AsrFullTextTask);
        }
        if (source.AsrTranslateTask != null) {
            this.AsrTranslateTask = new AiRecognitionTaskAsrTranslateResult(source.AsrTranslateTask);
        }
        if (source.OcrWordsTask != null) {
            this.OcrWordsTask = new AiRecognitionTaskOcrWordsResult(source.OcrWordsTask);
        }
        if (source.OcrFullTextTask != null) {
            this.OcrFullTextTask = new AiRecognitionTaskOcrFullTextResult(source.OcrFullTextTask);
        }
        if (source.ObjectTask != null) {
            this.ObjectTask = new AiRecognitionTaskObjectResult(source.ObjectTask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "HeadTailTask.", this.HeadTailTask);
        this.setParamObj(map, prefix + "SegmentTask.", this.SegmentTask);
        this.setParamObj(map, prefix + "FaceTask.", this.FaceTask);
        this.setParamObj(map, prefix + "AsrWordsTask.", this.AsrWordsTask);
        this.setParamObj(map, prefix + "AsrFullTextTask.", this.AsrFullTextTask);
        this.setParamObj(map, prefix + "AsrTranslateTask.", this.AsrTranslateTask);
        this.setParamObj(map, prefix + "OcrWordsTask.", this.OcrWordsTask);
        this.setParamObj(map, prefix + "OcrFullTextTask.", this.OcrFullTextTask);
        this.setParamObj(map, prefix + "ObjectTask.", this.ObjectTask);

    }
}

