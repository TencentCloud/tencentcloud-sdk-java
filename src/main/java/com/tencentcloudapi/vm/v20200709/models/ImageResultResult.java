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
package com.tencentcloudapi.vm.v20200709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageResultResult extends AbstractModel{

    /**
    * 场景
Porn 色情
Sexy 性感
Polity 政治
Illegal 违法
Abuse 谩骂
Terror 暴恐
Ad 广告
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * 是否命中
0 未命中
1 命中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HitFlag")
    @Expose
    private Long HitFlag;

    /**
    * 审核建议，可选值：
Pass 通过，
Review 建议人审，
Block 确认违规
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 子标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
    * 分数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 如果命中场景为涉政，则该数据为人物姓名列表，否则null
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
    * 图片OCR文本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 其他详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Details")
    @Expose
    private ImageResultsResultDetail [] Details;

    /**
     * Get 场景
Porn 色情
Sexy 性感
Polity 政治
Illegal 违法
Abuse 谩骂
Terror 暴恐
Ad 广告
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Scene 场景
Porn 色情
Sexy 性感
Polity 政治
Illegal 违法
Abuse 谩骂
Terror 暴恐
Ad 广告
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set 场景
Porn 色情
Sexy 性感
Polity 政治
Illegal 违法
Abuse 谩骂
Terror 暴恐
Ad 广告
注意：此字段可能返回 null，表示取不到有效值。
     * @param Scene 场景
Porn 色情
Sexy 性感
Polity 政治
Illegal 违法
Abuse 谩骂
Terror 暴恐
Ad 广告
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * Get 是否命中
0 未命中
1 命中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HitFlag 是否命中
0 未命中
1 命中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHitFlag() {
        return this.HitFlag;
    }

    /**
     * Set 是否命中
0 未命中
1 命中
注意：此字段可能返回 null，表示取不到有效值。
     * @param HitFlag 是否命中
0 未命中
1 命中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHitFlag(Long HitFlag) {
        this.HitFlag = HitFlag;
    }

    /**
     * Get 审核建议，可选值：
Pass 通过，
Review 建议人审，
Block 确认违规
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Suggestion 审核建议，可选值：
Pass 通过，
Review 建议人审，
Block 确认违规
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 审核建议，可选值：
Pass 通过，
Review 建议人审，
Block 确认违规
注意：此字段可能返回 null，表示取不到有效值。
     * @param Suggestion 审核建议，可选值：
Pass 通过，
Review 建议人审，
Block 确认违规
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Label 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Label 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 子标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubLabel 子标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set 子标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubLabel 子标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    /**
     * Get 分数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Score 分数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 分数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Score 分数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 如果命中场景为涉政，则该数据为人物姓名列表，否则null
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Names 如果命中场景为涉政，则该数据为人物姓名列表，否则null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set 如果命中场景为涉政，则该数据为人物姓名列表，否则null
注意：此字段可能返回 null，表示取不到有效值。
     * @param Names 如果命中场景为涉政，则该数据为人物姓名列表，否则null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    /**
     * Get 图片OCR文本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Text 图片OCR文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 图片OCR文本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Text 图片OCR文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 其他详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Details 其他详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageResultsResultDetail [] getDetails() {
        return this.Details;
    }

    /**
     * Set 其他详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param Details 其他详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetails(ImageResultsResultDetail [] Details) {
        this.Details = Details;
    }

    public ImageResultResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageResultResult(ImageResultResult source) {
        if (source.Scene != null) {
            this.Scene = new String(source.Scene);
        }
        if (source.HitFlag != null) {
            this.HitFlag = new Long(source.HitFlag);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.SubLabel != null) {
            this.SubLabel = new String(source.SubLabel);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.Names != null) {
            this.Names = new String[source.Names.length];
            for (int i = 0; i < source.Names.length; i++) {
                this.Names[i] = new String(source.Names[i]);
            }
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Details != null) {
            this.Details = new ImageResultsResultDetail[source.Details.length];
            for (int i = 0; i < source.Details.length; i++) {
                this.Details[i] = new ImageResultsResultDetail(source.Details[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "HitFlag", this.HitFlag);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "SubLabel", this.SubLabel);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamArraySimple(map, prefix + "Names.", this.Names);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamArrayObj(map, prefix + "Details.", this.Details);

    }
}

