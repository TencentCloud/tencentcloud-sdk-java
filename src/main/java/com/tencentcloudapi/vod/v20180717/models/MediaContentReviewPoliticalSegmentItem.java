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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaContentReviewPoliticalSegmentItem  extends AbstractModel{

    /**
    * 嫌疑片段起始的偏移时间，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * 嫌疑片段结束的偏移时间，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * 嫌疑片段涉政分数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 嫌疑片段鉴政结果建议，取值范围：
<li>pass。</li>
<li>review。</li>
<li>block。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 涉政人物、违规图标名字。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 嫌疑片段鉴政结果标签。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 嫌疑图片 URL （图片不会永久存储，到达
 PicUrlExpireTime 时间点后图片将被删除）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 涉政人物、违规图标出现的区域坐标 (像素级)，[x1, y1, x2, y2]，即左上角坐标、右下角坐标。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AreaCoordSet")
    @Expose
    private Long [] AreaCoordSet;

    /**
    * 嫌疑图片 URL 失效时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PicUrlExpireTimeStamp")
    @Expose
    private Long PicUrlExpireTimeStamp;

    /**
     * 获取嫌疑片段起始的偏移时间，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @return StartTimeOffset 嫌疑片段起始的偏移时间，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * 设置嫌疑片段起始的偏移时间，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTimeOffset 嫌疑片段起始的偏移时间，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * 获取嫌疑片段结束的偏移时间，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @return EndTimeOffset 嫌疑片段结束的偏移时间，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * 设置嫌疑片段结束的偏移时间，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTimeOffset 嫌疑片段结束的偏移时间，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * 获取嫌疑片段涉政分数。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Confidence 嫌疑片段涉政分数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * 设置嫌疑片段涉政分数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Confidence 嫌疑片段涉政分数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * 获取嫌疑片段鉴政结果建议，取值范围：
<li>pass。</li>
<li>review。</li>
<li>block。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @return Suggestion 嫌疑片段鉴政结果建议，取值范围：
<li>pass。</li>
<li>review。</li>
<li>block。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * 设置嫌疑片段鉴政结果建议，取值范围：
<li>pass。</li>
<li>review。</li>
<li>block。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Suggestion 嫌疑片段鉴政结果建议，取值范围：
<li>pass。</li>
<li>review。</li>
<li>block。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * 获取涉政人物、违规图标名字。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Name 涉政人物、违规图标名字。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置涉政人物、违规图标名字。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 涉政人物、违规图标名字。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取嫌疑片段鉴政结果标签。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Label 嫌疑片段鉴政结果标签。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * 设置嫌疑片段鉴政结果标签。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Label 嫌疑片段鉴政结果标签。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * 获取嫌疑图片 URL （图片不会永久存储，到达
 PicUrlExpireTime 时间点后图片将被删除）。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Url 嫌疑图片 URL （图片不会永久存储，到达
 PicUrlExpireTime 时间点后图片将被删除）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * 设置嫌疑图片 URL （图片不会永久存储，到达
 PicUrlExpireTime 时间点后图片将被删除）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url 嫌疑图片 URL （图片不会永久存储，到达
 PicUrlExpireTime 时间点后图片将被删除）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * 获取涉政人物、违规图标出现的区域坐标 (像素级)，[x1, y1, x2, y2]，即左上角坐标、右下角坐标。
注意：此字段可能返回 null，表示取不到有效值。
     * @return AreaCoordSet 涉政人物、违规图标出现的区域坐标 (像素级)，[x1, y1, x2, y2]，即左上角坐标、右下角坐标。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getAreaCoordSet() {
        return this.AreaCoordSet;
    }

    /**
     * 设置涉政人物、违规图标出现的区域坐标 (像素级)，[x1, y1, x2, y2]，即左上角坐标、右下角坐标。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AreaCoordSet 涉政人物、违规图标出现的区域坐标 (像素级)，[x1, y1, x2, y2]，即左上角坐标、右下角坐标。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAreaCoordSet(Long [] AreaCoordSet) {
        this.AreaCoordSet = AreaCoordSet;
    }

    /**
     * 获取嫌疑图片 URL 失效时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
注意：此字段可能返回 null，表示取不到有效值。
     * @return PicUrlExpireTimeStamp 嫌疑图片 URL 失效时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPicUrlExpireTimeStamp() {
        return this.PicUrlExpireTimeStamp;
    }

    /**
     * 设置嫌疑图片 URL 失效时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PicUrlExpireTimeStamp 嫌疑图片 URL 失效时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPicUrlExpireTimeStamp(Long PicUrlExpireTimeStamp) {
        this.PicUrlExpireTimeStamp = PicUrlExpireTimeStamp;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamArraySimple(map, prefix + "AreaCoordSet.", this.AreaCoordSet);
        this.setParamSimple(map, prefix + "PicUrlExpireTimeStamp", this.PicUrlExpireTimeStamp);

    }
}

