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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaAiAnalysisDescriptionItem extends AbstractModel {

    /**
    * 智能描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 智能描述的可信度，取值范围是 0 到 100。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 智能描述标题
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 智能描述关键词
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
    * 分段结果。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Paragraphs")
    @Expose
    private AiParagraphInfo [] Paragraphs;

    /**
    * 摘要思维导图地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MindMapUrl")
    @Expose
    private String MindMapUrl;

    /**
     * Get 智能描述。 
     * @return Description 智能描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 智能描述。
     * @param Description 智能描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 智能描述的可信度，取值范围是 0 到 100。 
     * @return Confidence 智能描述的可信度，取值范围是 0 到 100。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 智能描述的可信度，取值范围是 0 到 100。
     * @param Confidence 智能描述的可信度，取值范围是 0 到 100。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 智能描述标题 
     * @return Title 智能描述标题
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 智能描述标题
     * @param Title 智能描述标题
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 智能描述关键词 
     * @return Keywords 智能描述关键词
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set 智能描述关键词
     * @param Keywords 智能描述关键词
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get 分段结果。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Paragraphs 分段结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiParagraphInfo [] getParagraphs() {
        return this.Paragraphs;
    }

    /**
     * Set 分段结果。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Paragraphs 分段结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParagraphs(AiParagraphInfo [] Paragraphs) {
        this.Paragraphs = Paragraphs;
    }

    /**
     * Get 摘要思维导图地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MindMapUrl 摘要思维导图地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMindMapUrl() {
        return this.MindMapUrl;
    }

    /**
     * Set 摘要思维导图地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param MindMapUrl 摘要思维导图地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMindMapUrl(String MindMapUrl) {
        this.MindMapUrl = MindMapUrl;
    }

    public MediaAiAnalysisDescriptionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaAiAnalysisDescriptionItem(MediaAiAnalysisDescriptionItem source) {
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Keywords != null) {
            this.Keywords = new String[source.Keywords.length];
            for (int i = 0; i < source.Keywords.length; i++) {
                this.Keywords[i] = new String(source.Keywords[i]);
            }
        }
        if (source.Paragraphs != null) {
            this.Paragraphs = new AiParagraphInfo[source.Paragraphs.length];
            for (int i = 0; i < source.Paragraphs.length; i++) {
                this.Paragraphs[i] = new AiParagraphInfo(source.Paragraphs[i]);
            }
        }
        if (source.MindMapUrl != null) {
            this.MindMapUrl = new String(source.MindMapUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);
        this.setParamArrayObj(map, prefix + "Paragraphs.", this.Paragraphs);
        this.setParamSimple(map, prefix + "MindMapUrl", this.MindMapUrl);

    }
}

