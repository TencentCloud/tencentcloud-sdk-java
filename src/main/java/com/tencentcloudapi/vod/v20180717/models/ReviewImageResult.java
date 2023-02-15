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

public class ReviewImageResult extends AbstractModel{

    /**
    * 图片审核的结果建议，取值范围：
<li>pass：建议通过；</li>
<li>review：建议复审；</li>
<li>block：建议封禁。</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 当 Suggestion 为 review 或 block 时有效，表示最可能的违规的标签，取值范围：
<li>Porn：色情；</li>
<li>Terror：暴力；</li>
<li>Polity：不适宜的信息；</li>
<li>Ad：广告；</li>
<li>Illegal：违法；</li>
<li>Abuse：谩骂。</li>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 当 Suggestion 为 review 或 block 时有效，表示最可能的违禁的形式，取值范围：
<li>Image：画面上的人物或图标；</li>
<li>OCR：画面上的文字。</li>
    */
    @SerializedName("Form")
    @Expose
    private String Form;

    /**
    * 有违规信息的嫌疑的视频片段列表。
<font color=red>注意</font> ：该列表最多仅展示前 10个 元素。如希望获得完整结果，请从 SegmentSetFileUrl 对应的文件中获取。
    */
    @SerializedName("SegmentSet")
    @Expose
    private ReviewImageSegmentItem [] SegmentSet;

    /**
    * 涉及违规信息的嫌疑的视频片段列表文件 URL。文件的内容为 JSON，数据结构与 SegmentSet 字段一致。 （文件不会永久存储，到达SegmentSetFileUrlExpireTime 时间点后文件将被删除）。
    */
    @SerializedName("SegmentSetFileUrl")
    @Expose
    private String SegmentSetFileUrl;

    /**
    * 涉及违规信息的嫌疑的视频片段列表文件 URL 失效时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("SegmentSetFileUrlExpireTime")
    @Expose
    private String SegmentSetFileUrlExpireTime;

    /**
     * Get 图片审核的结果建议，取值范围：
<li>pass：建议通过；</li>
<li>review：建议复审；</li>
<li>block：建议封禁。</li> 
     * @return Suggestion 图片审核的结果建议，取值范围：
<li>pass：建议通过；</li>
<li>review：建议复审；</li>
<li>block：建议封禁。</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 图片审核的结果建议，取值范围：
<li>pass：建议通过；</li>
<li>review：建议复审；</li>
<li>block：建议封禁。</li>
     * @param Suggestion 图片审核的结果建议，取值范围：
<li>pass：建议通过；</li>
<li>review：建议复审；</li>
<li>block：建议封禁。</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 当 Suggestion 为 review 或 block 时有效，表示最可能的违规的标签，取值范围：
<li>Porn：色情；</li>
<li>Terror：暴力；</li>
<li>Polity：不适宜的信息；</li>
<li>Ad：广告；</li>
<li>Illegal：违法；</li>
<li>Abuse：谩骂。</li> 
     * @return Label 当 Suggestion 为 review 或 block 时有效，表示最可能的违规的标签，取值范围：
<li>Porn：色情；</li>
<li>Terror：暴力；</li>
<li>Polity：不适宜的信息；</li>
<li>Ad：广告；</li>
<li>Illegal：违法；</li>
<li>Abuse：谩骂。</li>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 当 Suggestion 为 review 或 block 时有效，表示最可能的违规的标签，取值范围：
<li>Porn：色情；</li>
<li>Terror：暴力；</li>
<li>Polity：不适宜的信息；</li>
<li>Ad：广告；</li>
<li>Illegal：违法；</li>
<li>Abuse：谩骂。</li>
     * @param Label 当 Suggestion 为 review 或 block 时有效，表示最可能的违规的标签，取值范围：
<li>Porn：色情；</li>
<li>Terror：暴力；</li>
<li>Polity：不适宜的信息；</li>
<li>Ad：广告；</li>
<li>Illegal：违法；</li>
<li>Abuse：谩骂。</li>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 当 Suggestion 为 review 或 block 时有效，表示最可能的违禁的形式，取值范围：
<li>Image：画面上的人物或图标；</li>
<li>OCR：画面上的文字。</li> 
     * @return Form 当 Suggestion 为 review 或 block 时有效，表示最可能的违禁的形式，取值范围：
<li>Image：画面上的人物或图标；</li>
<li>OCR：画面上的文字。</li>
     */
    public String getForm() {
        return this.Form;
    }

    /**
     * Set 当 Suggestion 为 review 或 block 时有效，表示最可能的违禁的形式，取值范围：
<li>Image：画面上的人物或图标；</li>
<li>OCR：画面上的文字。</li>
     * @param Form 当 Suggestion 为 review 或 block 时有效，表示最可能的违禁的形式，取值范围：
<li>Image：画面上的人物或图标；</li>
<li>OCR：画面上的文字。</li>
     */
    public void setForm(String Form) {
        this.Form = Form;
    }

    /**
     * Get 有违规信息的嫌疑的视频片段列表。
<font color=red>注意</font> ：该列表最多仅展示前 10个 元素。如希望获得完整结果，请从 SegmentSetFileUrl 对应的文件中获取。 
     * @return SegmentSet 有违规信息的嫌疑的视频片段列表。
<font color=red>注意</font> ：该列表最多仅展示前 10个 元素。如希望获得完整结果，请从 SegmentSetFileUrl 对应的文件中获取。
     */
    public ReviewImageSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set 有违规信息的嫌疑的视频片段列表。
<font color=red>注意</font> ：该列表最多仅展示前 10个 元素。如希望获得完整结果，请从 SegmentSetFileUrl 对应的文件中获取。
     * @param SegmentSet 有违规信息的嫌疑的视频片段列表。
<font color=red>注意</font> ：该列表最多仅展示前 10个 元素。如希望获得完整结果，请从 SegmentSetFileUrl 对应的文件中获取。
     */
    public void setSegmentSet(ReviewImageSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Get 涉及违规信息的嫌疑的视频片段列表文件 URL。文件的内容为 JSON，数据结构与 SegmentSet 字段一致。 （文件不会永久存储，到达SegmentSetFileUrlExpireTime 时间点后文件将被删除）。 
     * @return SegmentSetFileUrl 涉及违规信息的嫌疑的视频片段列表文件 URL。文件的内容为 JSON，数据结构与 SegmentSet 字段一致。 （文件不会永久存储，到达SegmentSetFileUrlExpireTime 时间点后文件将被删除）。
     */
    public String getSegmentSetFileUrl() {
        return this.SegmentSetFileUrl;
    }

    /**
     * Set 涉及违规信息的嫌疑的视频片段列表文件 URL。文件的内容为 JSON，数据结构与 SegmentSet 字段一致。 （文件不会永久存储，到达SegmentSetFileUrlExpireTime 时间点后文件将被删除）。
     * @param SegmentSetFileUrl 涉及违规信息的嫌疑的视频片段列表文件 URL。文件的内容为 JSON，数据结构与 SegmentSet 字段一致。 （文件不会永久存储，到达SegmentSetFileUrlExpireTime 时间点后文件将被删除）。
     */
    public void setSegmentSetFileUrl(String SegmentSetFileUrl) {
        this.SegmentSetFileUrl = SegmentSetFileUrl;
    }

    /**
     * Get 涉及违规信息的嫌疑的视频片段列表文件 URL 失效时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return SegmentSetFileUrlExpireTime 涉及违规信息的嫌疑的视频片段列表文件 URL 失效时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getSegmentSetFileUrlExpireTime() {
        return this.SegmentSetFileUrlExpireTime;
    }

    /**
     * Set 涉及违规信息的嫌疑的视频片段列表文件 URL 失效时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param SegmentSetFileUrlExpireTime 涉及违规信息的嫌疑的视频片段列表文件 URL 失效时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setSegmentSetFileUrlExpireTime(String SegmentSetFileUrlExpireTime) {
        this.SegmentSetFileUrlExpireTime = SegmentSetFileUrlExpireTime;
    }

    public ReviewImageResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReviewImageResult(ReviewImageResult source) {
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Form != null) {
            this.Form = new String(source.Form);
        }
        if (source.SegmentSet != null) {
            this.SegmentSet = new ReviewImageSegmentItem[source.SegmentSet.length];
            for (int i = 0; i < source.SegmentSet.length; i++) {
                this.SegmentSet[i] = new ReviewImageSegmentItem(source.SegmentSet[i]);
            }
        }
        if (source.SegmentSetFileUrl != null) {
            this.SegmentSetFileUrl = new String(source.SegmentSetFileUrl);
        }
        if (source.SegmentSetFileUrlExpireTime != null) {
            this.SegmentSetFileUrlExpireTime = new String(source.SegmentSetFileUrlExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Form", this.Form);
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);
        this.setParamSimple(map, prefix + "SegmentSetFileUrl", this.SegmentSetFileUrl);
        this.setParamSimple(map, prefix + "SegmentSetFileUrlExpireTime", this.SegmentSetFileUrlExpireTime);

    }
}

