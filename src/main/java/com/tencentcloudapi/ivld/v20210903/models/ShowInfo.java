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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ShowInfo extends AbstractModel{

    /**
    * 节目日期(只在新闻有效)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 台标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Logo")
    @Expose
    private String Logo;

    /**
    * 节目名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Column")
    @Expose
    private String Column;

    /**
    * 来源信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 节目封面
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoverImageURL")
    @Expose
    private String CoverImageURL;

    /**
    * 节目内容概要列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SummarySet")
    @Expose
    private String [] SummarySet;

    /**
    * 节目片段标题列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TitleSet")
    @Expose
    private String [] TitleSet;

    /**
    * 音频识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioInfoSet")
    @Expose
    private AudioInfo [] AudioInfoSet;

    /**
    * 可视文字识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TextInfoSet")
    @Expose
    private TextInfo [] TextInfoSet;

    /**
    * 已分类人物信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClassifiedPersonInfoSet")
    @Expose
    private ClassifiedPersonInfo [] ClassifiedPersonInfoSet;

    /**
    * 文本标签列表，包含标签内容和出现信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TextTagSet")
    @Expose
    private MultiLevelTag TextTagSet;

    /**
    * 帧标签列表，包括人物信息，场景信息等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrameTagSet")
    @Expose
    private MultiLevelTag FrameTagSet;

    /**
    * 视频下载地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebMediaURL")
    @Expose
    private String WebMediaURL;

    /**
    * 媒资分类信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MediaClassifierSet")
    @Expose
    private String [] MediaClassifierSet;

    /**
    * 概要标签信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SummaryTagSet")
    @Expose
    private String [] SummaryTagSet;

    /**
     * Get 节目日期(只在新闻有效)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Date 节目日期(只在新闻有效)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 节目日期(只在新闻有效)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Date 节目日期(只在新闻有效)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 台标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Logo 台标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogo() {
        return this.Logo;
    }

    /**
     * Set 台标
注意：此字段可能返回 null，表示取不到有效值。
     * @param Logo 台标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogo(String Logo) {
        this.Logo = Logo;
    }

    /**
     * Get 节目名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Column 节目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColumn() {
        return this.Column;
    }

    /**
     * Set 节目名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Column 节目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumn(String Column) {
        this.Column = Column;
    }

    /**
     * Get 来源信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Source 来源信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 来源信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Source 来源信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 节目封面
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CoverImageURL 节目封面
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCoverImageURL() {
        return this.CoverImageURL;
    }

    /**
     * Set 节目封面
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoverImageURL 节目封面
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoverImageURL(String CoverImageURL) {
        this.CoverImageURL = CoverImageURL;
    }

    /**
     * Get 节目内容概要列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SummarySet 节目内容概要列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSummarySet() {
        return this.SummarySet;
    }

    /**
     * Set 节目内容概要列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SummarySet 节目内容概要列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSummarySet(String [] SummarySet) {
        this.SummarySet = SummarySet;
    }

    /**
     * Get 节目片段标题列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TitleSet 节目片段标题列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTitleSet() {
        return this.TitleSet;
    }

    /**
     * Set 节目片段标题列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param TitleSet 节目片段标题列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTitleSet(String [] TitleSet) {
        this.TitleSet = TitleSet;
    }

    /**
     * Get 音频识别结果列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudioInfoSet 音频识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AudioInfo [] getAudioInfoSet() {
        return this.AudioInfoSet;
    }

    /**
     * Set 音频识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioInfoSet 音频识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudioInfoSet(AudioInfo [] AudioInfoSet) {
        this.AudioInfoSet = AudioInfoSet;
    }

    /**
     * Get 可视文字识别结果列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TextInfoSet 可视文字识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TextInfo [] getTextInfoSet() {
        return this.TextInfoSet;
    }

    /**
     * Set 可视文字识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param TextInfoSet 可视文字识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTextInfoSet(TextInfo [] TextInfoSet) {
        this.TextInfoSet = TextInfoSet;
    }

    /**
     * Get 已分类人物信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClassifiedPersonInfoSet 已分类人物信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClassifiedPersonInfo [] getClassifiedPersonInfoSet() {
        return this.ClassifiedPersonInfoSet;
    }

    /**
     * Set 已分类人物信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClassifiedPersonInfoSet 已分类人物信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClassifiedPersonInfoSet(ClassifiedPersonInfo [] ClassifiedPersonInfoSet) {
        this.ClassifiedPersonInfoSet = ClassifiedPersonInfoSet;
    }

    /**
     * Get 文本标签列表，包含标签内容和出现信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TextTagSet 文本标签列表，包含标签内容和出现信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MultiLevelTag getTextTagSet() {
        return this.TextTagSet;
    }

    /**
     * Set 文本标签列表，包含标签内容和出现信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TextTagSet 文本标签列表，包含标签内容和出现信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTextTagSet(MultiLevelTag TextTagSet) {
        this.TextTagSet = TextTagSet;
    }

    /**
     * Get 帧标签列表，包括人物信息，场景信息等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrameTagSet 帧标签列表，包括人物信息，场景信息等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MultiLevelTag getFrameTagSet() {
        return this.FrameTagSet;
    }

    /**
     * Set 帧标签列表，包括人物信息，场景信息等
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrameTagSet 帧标签列表，包括人物信息，场景信息等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrameTagSet(MultiLevelTag FrameTagSet) {
        this.FrameTagSet = FrameTagSet;
    }

    /**
     * Get 视频下载地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebMediaURL 视频下载地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWebMediaURL() {
        return this.WebMediaURL;
    }

    /**
     * Set 视频下载地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebMediaURL 视频下载地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebMediaURL(String WebMediaURL) {
        this.WebMediaURL = WebMediaURL;
    }

    /**
     * Get 媒资分类信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MediaClassifierSet 媒资分类信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getMediaClassifierSet() {
        return this.MediaClassifierSet;
    }

    /**
     * Set 媒资分类信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param MediaClassifierSet 媒资分类信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMediaClassifierSet(String [] MediaClassifierSet) {
        this.MediaClassifierSet = MediaClassifierSet;
    }

    /**
     * Get 概要标签信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SummaryTagSet 概要标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSummaryTagSet() {
        return this.SummaryTagSet;
    }

    /**
     * Set 概要标签信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SummaryTagSet 概要标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSummaryTagSet(String [] SummaryTagSet) {
        this.SummaryTagSet = SummaryTagSet;
    }

    public ShowInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShowInfo(ShowInfo source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.Logo != null) {
            this.Logo = new String(source.Logo);
        }
        if (source.Column != null) {
            this.Column = new String(source.Column);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.CoverImageURL != null) {
            this.CoverImageURL = new String(source.CoverImageURL);
        }
        if (source.SummarySet != null) {
            this.SummarySet = new String[source.SummarySet.length];
            for (int i = 0; i < source.SummarySet.length; i++) {
                this.SummarySet[i] = new String(source.SummarySet[i]);
            }
        }
        if (source.TitleSet != null) {
            this.TitleSet = new String[source.TitleSet.length];
            for (int i = 0; i < source.TitleSet.length; i++) {
                this.TitleSet[i] = new String(source.TitleSet[i]);
            }
        }
        if (source.AudioInfoSet != null) {
            this.AudioInfoSet = new AudioInfo[source.AudioInfoSet.length];
            for (int i = 0; i < source.AudioInfoSet.length; i++) {
                this.AudioInfoSet[i] = new AudioInfo(source.AudioInfoSet[i]);
            }
        }
        if (source.TextInfoSet != null) {
            this.TextInfoSet = new TextInfo[source.TextInfoSet.length];
            for (int i = 0; i < source.TextInfoSet.length; i++) {
                this.TextInfoSet[i] = new TextInfo(source.TextInfoSet[i]);
            }
        }
        if (source.ClassifiedPersonInfoSet != null) {
            this.ClassifiedPersonInfoSet = new ClassifiedPersonInfo[source.ClassifiedPersonInfoSet.length];
            for (int i = 0; i < source.ClassifiedPersonInfoSet.length; i++) {
                this.ClassifiedPersonInfoSet[i] = new ClassifiedPersonInfo(source.ClassifiedPersonInfoSet[i]);
            }
        }
        if (source.TextTagSet != null) {
            this.TextTagSet = new MultiLevelTag(source.TextTagSet);
        }
        if (source.FrameTagSet != null) {
            this.FrameTagSet = new MultiLevelTag(source.FrameTagSet);
        }
        if (source.WebMediaURL != null) {
            this.WebMediaURL = new String(source.WebMediaURL);
        }
        if (source.MediaClassifierSet != null) {
            this.MediaClassifierSet = new String[source.MediaClassifierSet.length];
            for (int i = 0; i < source.MediaClassifierSet.length; i++) {
                this.MediaClassifierSet[i] = new String(source.MediaClassifierSet[i]);
            }
        }
        if (source.SummaryTagSet != null) {
            this.SummaryTagSet = new String[source.SummaryTagSet.length];
            for (int i = 0; i < source.SummaryTagSet.length; i++) {
                this.SummaryTagSet[i] = new String(source.SummaryTagSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Logo", this.Logo);
        this.setParamSimple(map, prefix + "Column", this.Column);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "CoverImageURL", this.CoverImageURL);
        this.setParamArraySimple(map, prefix + "SummarySet.", this.SummarySet);
        this.setParamArraySimple(map, prefix + "TitleSet.", this.TitleSet);
        this.setParamArrayObj(map, prefix + "AudioInfoSet.", this.AudioInfoSet);
        this.setParamArrayObj(map, prefix + "TextInfoSet.", this.TextInfoSet);
        this.setParamArrayObj(map, prefix + "ClassifiedPersonInfoSet.", this.ClassifiedPersonInfoSet);
        this.setParamObj(map, prefix + "TextTagSet.", this.TextTagSet);
        this.setParamObj(map, prefix + "FrameTagSet.", this.FrameTagSet);
        this.setParamSimple(map, prefix + "WebMediaURL", this.WebMediaURL);
        this.setParamArraySimple(map, prefix + "MediaClassifierSet.", this.MediaClassifierSet);
        this.setParamArraySimple(map, prefix + "SummaryTagSet.", this.SummaryTagSet);

    }
}

