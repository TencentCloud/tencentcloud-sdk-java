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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveStreamAiReviewImagePoliticalResult  extends AbstractModel{

    /**
    * 嫌疑片段起始的 PTS 时间，单位：秒。
    */
    @SerializedName("StartPtsTime")
    @Expose
    private Float StartPtsTime;

    /**
    * 嫌疑片段结束的 PTS 时间，单位：秒。
    */
    @SerializedName("EndPtsTime")
    @Expose
    private Float EndPtsTime;

    /**
    * 嫌疑片段涉政分数。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 嫌疑片段鉴黄结果建议，取值范围：
<li>pass</li>
<li>review</li>
<li>block</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 视频鉴政结果标签，取值范围：
<li>politician：政治人物。</li>
<li>violation_photo：违规图标。</li>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 涉政人物、违规图标名字。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 涉政人物、违规图标出现的区域坐标 (像素级)，[x1, y1, x2, y2]，即左上角坐标、右下角坐标。
    */
    @SerializedName("AreaCoordSet")
    @Expose
    private Long [] AreaCoordSet;

    /**
    * 嫌疑图片 URL （图片不会永久存储，到达
PicUrlExpireTime 时间点后图片将被删除）。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 嫌疑图片 URL 失效时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
    */
    @SerializedName("PicUrlExpireTime")
    @Expose
    private String PicUrlExpireTime;

    /**
     * 获取嫌疑片段起始的 PTS 时间，单位：秒。
     * @return StartPtsTime 嫌疑片段起始的 PTS 时间，单位：秒。
     */
    public Float getStartPtsTime() {
        return this.StartPtsTime;
    }

    /**
     * 设置嫌疑片段起始的 PTS 时间，单位：秒。
     * @param StartPtsTime 嫌疑片段起始的 PTS 时间，单位：秒。
     */
    public void setStartPtsTime(Float StartPtsTime) {
        this.StartPtsTime = StartPtsTime;
    }

    /**
     * 获取嫌疑片段结束的 PTS 时间，单位：秒。
     * @return EndPtsTime 嫌疑片段结束的 PTS 时间，单位：秒。
     */
    public Float getEndPtsTime() {
        return this.EndPtsTime;
    }

    /**
     * 设置嫌疑片段结束的 PTS 时间，单位：秒。
     * @param EndPtsTime 嫌疑片段结束的 PTS 时间，单位：秒。
     */
    public void setEndPtsTime(Float EndPtsTime) {
        this.EndPtsTime = EndPtsTime;
    }

    /**
     * 获取嫌疑片段涉政分数。
     * @return Confidence 嫌疑片段涉政分数。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * 设置嫌疑片段涉政分数。
     * @param Confidence 嫌疑片段涉政分数。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * 获取嫌疑片段鉴黄结果建议，取值范围：
<li>pass</li>
<li>review</li>
<li>block</li>
     * @return Suggestion 嫌疑片段鉴黄结果建议，取值范围：
<li>pass</li>
<li>review</li>
<li>block</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * 设置嫌疑片段鉴黄结果建议，取值范围：
<li>pass</li>
<li>review</li>
<li>block</li>
     * @param Suggestion 嫌疑片段鉴黄结果建议，取值范围：
<li>pass</li>
<li>review</li>
<li>block</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * 获取视频鉴政结果标签，取值范围：
<li>politician：政治人物。</li>
<li>violation_photo：违规图标。</li>
     * @return Label 视频鉴政结果标签，取值范围：
<li>politician：政治人物。</li>
<li>violation_photo：违规图标。</li>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * 设置视频鉴政结果标签，取值范围：
<li>politician：政治人物。</li>
<li>violation_photo：违规图标。</li>
     * @param Label 视频鉴政结果标签，取值范围：
<li>politician：政治人物。</li>
<li>violation_photo：违规图标。</li>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * 获取涉政人物、违规图标名字。
     * @return Name 涉政人物、违规图标名字。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置涉政人物、违规图标名字。
     * @param Name 涉政人物、违规图标名字。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取涉政人物、违规图标出现的区域坐标 (像素级)，[x1, y1, x2, y2]，即左上角坐标、右下角坐标。
     * @return AreaCoordSet 涉政人物、违规图标出现的区域坐标 (像素级)，[x1, y1, x2, y2]，即左上角坐标、右下角坐标。
     */
    public Long [] getAreaCoordSet() {
        return this.AreaCoordSet;
    }

    /**
     * 设置涉政人物、违规图标出现的区域坐标 (像素级)，[x1, y1, x2, y2]，即左上角坐标、右下角坐标。
     * @param AreaCoordSet 涉政人物、违规图标出现的区域坐标 (像素级)，[x1, y1, x2, y2]，即左上角坐标、右下角坐标。
     */
    public void setAreaCoordSet(Long [] AreaCoordSet) {
        this.AreaCoordSet = AreaCoordSet;
    }

    /**
     * 获取嫌疑图片 URL （图片不会永久存储，到达
PicUrlExpireTime 时间点后图片将被删除）。
     * @return Url 嫌疑图片 URL （图片不会永久存储，到达
PicUrlExpireTime 时间点后图片将被删除）。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * 设置嫌疑图片 URL （图片不会永久存储，到达
PicUrlExpireTime 时间点后图片将被删除）。
     * @param Url 嫌疑图片 URL （图片不会永久存储，到达
PicUrlExpireTime 时间点后图片将被删除）。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * 获取嫌疑图片 URL 失效时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @return PicUrlExpireTime 嫌疑图片 URL 失效时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public String getPicUrlExpireTime() {
        return this.PicUrlExpireTime;
    }

    /**
     * 设置嫌疑图片 URL 失效时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @param PicUrlExpireTime 嫌疑图片 URL 失效时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public void setPicUrlExpireTime(String PicUrlExpireTime) {
        this.PicUrlExpireTime = PicUrlExpireTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartPtsTime", this.StartPtsTime);
        this.setParamSimple(map, prefix + "EndPtsTime", this.EndPtsTime);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "AreaCoordSet.", this.AreaCoordSet);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "PicUrlExpireTime", this.PicUrlExpireTime);

    }
}

