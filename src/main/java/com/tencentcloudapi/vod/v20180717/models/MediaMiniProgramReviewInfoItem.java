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

public class MediaMiniProgramReviewInfoItem  extends AbstractModel{

    /**
    * 模板id。小程序视频发布的视频所对应的转码模板ID，为0代表原始视频。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 视频元信息。
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
    * 小程序审核视频播放地址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 小程序视频发布状态：
<li>Pass：成功。</li>
<li>Rejected：未通过。</li>
    */
    @SerializedName("ReviewResult")
    @Expose
    private String ReviewResult;

    /**
    * 小程序审核元素。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReviewSummary")
    @Expose
    private MediaMiniProgramReviewElem [] ReviewSummary;

    /**
     * 获取模板id。小程序视频发布的视频所对应的转码模板ID，为0代表原始视频。
     * @return Definition 模板id。小程序视频发布的视频所对应的转码模板ID，为0代表原始视频。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * 设置模板id。小程序视频发布的视频所对应的转码模板ID，为0代表原始视频。
     * @param Definition 模板id。小程序视频发布的视频所对应的转码模板ID，为0代表原始视频。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * 获取视频元信息。
     * @return MetaData 视频元信息。
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * 设置视频元信息。
     * @param MetaData 视频元信息。
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * 获取小程序审核视频播放地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Url 小程序审核视频播放地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * 设置小程序审核视频播放地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url 小程序审核视频播放地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * 获取小程序视频发布状态：
<li>Pass：成功。</li>
<li>Rejected：未通过。</li>
     * @return ReviewResult 小程序视频发布状态：
<li>Pass：成功。</li>
<li>Rejected：未通过。</li>
     */
    public String getReviewResult() {
        return this.ReviewResult;
    }

    /**
     * 设置小程序视频发布状态：
<li>Pass：成功。</li>
<li>Rejected：未通过。</li>
     * @param ReviewResult 小程序视频发布状态：
<li>Pass：成功。</li>
<li>Rejected：未通过。</li>
     */
    public void setReviewResult(String ReviewResult) {
        this.ReviewResult = ReviewResult;
    }

    /**
     * 获取小程序审核元素。
注意：此字段可能返回 null，表示取不到有效值。
     * @return ReviewSummary 小程序审核元素。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaMiniProgramReviewElem [] getReviewSummary() {
        return this.ReviewSummary;
    }

    /**
     * 设置小程序审核元素。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReviewSummary 小程序审核元素。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReviewSummary(MediaMiniProgramReviewElem [] ReviewSummary) {
        this.ReviewSummary = ReviewSummary;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "ReviewResult", this.ReviewResult);
        this.setParamArrayObj(map, prefix + "ReviewSummary.", this.ReviewSummary);

    }
}

