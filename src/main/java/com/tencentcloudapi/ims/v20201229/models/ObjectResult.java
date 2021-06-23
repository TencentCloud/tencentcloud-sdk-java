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
package com.tencentcloudapi.ims.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ObjectResult extends AbstractModel{

    /**
    * 该字段用于返回实体识别出的实体场景结果，如二维码、logo、图片OCR等场景。
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * 该字段用于返回针对当前恶意标签的后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Block**：建议屏蔽，**Review** ：建议人工复审，**Pass**：建议通过
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 该字段用于返回检测结果所对应的恶意标签，表示模型推荐的审核结果，建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Normal**：正常，**Porn**：色情，**Abuse**：谩骂，**Ad**：广告，**Custom**：自定义违规；以及其他令人反感、不安全或不适宜的内容类型。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 该字段用于返回当前恶意标签下对应的子标签的检测结果，如：*Porn-SexBehavior* 等子标签。
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
    * 该字段用于返回命中当前恶意标签下子标签的分值，取值为**0-100**，如：*Porn-SexBehavior 99* 则代表相应识别内容命中色情-性行为标签的分值为99。
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 该标签用于返回所识别出的实体名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
    * 该标签用于返回所识别出实体的详细信息，如：序号、命中标签名称、位置坐标等信息，详细返回内容敬请参考相应数据结构（[ObjectDetail
](https://cloud.tencent.com/document/api/1125/53274#ObjectDetail)）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Details")
    @Expose
    private ObjectDetail [] Details;

    /**
     * Get 该字段用于返回实体识别出的实体场景结果，如二维码、logo、图片OCR等场景。 
     * @return Scene 该字段用于返回实体识别出的实体场景结果，如二维码、logo、图片OCR等场景。
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set 该字段用于返回实体识别出的实体场景结果，如二维码、logo、图片OCR等场景。
     * @param Scene 该字段用于返回实体识别出的实体场景结果，如二维码、logo、图片OCR等场景。
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * Get 该字段用于返回针对当前恶意标签的后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Block**：建议屏蔽，**Review** ：建议人工复审，**Pass**：建议通过 
     * @return Suggestion 该字段用于返回针对当前恶意标签的后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Block**：建议屏蔽，**Review** ：建议人工复审，**Pass**：建议通过
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 该字段用于返回针对当前恶意标签的后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Block**：建议屏蔽，**Review** ：建议人工复审，**Pass**：建议通过
     * @param Suggestion 该字段用于返回针对当前恶意标签的后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Block**：建议屏蔽，**Review** ：建议人工复审，**Pass**：建议通过
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 该字段用于返回检测结果所对应的恶意标签，表示模型推荐的审核结果，建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Normal**：正常，**Porn**：色情，**Abuse**：谩骂，**Ad**：广告，**Custom**：自定义违规；以及其他令人反感、不安全或不适宜的内容类型。 
     * @return Label 该字段用于返回检测结果所对应的恶意标签，表示模型推荐的审核结果，建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Normal**：正常，**Porn**：色情，**Abuse**：谩骂，**Ad**：广告，**Custom**：自定义违规；以及其他令人反感、不安全或不适宜的内容类型。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 该字段用于返回检测结果所对应的恶意标签，表示模型推荐的审核结果，建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Normal**：正常，**Porn**：色情，**Abuse**：谩骂，**Ad**：广告，**Custom**：自定义违规；以及其他令人反感、不安全或不适宜的内容类型。
     * @param Label 该字段用于返回检测结果所对应的恶意标签，表示模型推荐的审核结果，建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Normal**：正常，**Porn**：色情，**Abuse**：谩骂，**Ad**：广告，**Custom**：自定义违规；以及其他令人反感、不安全或不适宜的内容类型。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 该字段用于返回当前恶意标签下对应的子标签的检测结果，如：*Porn-SexBehavior* 等子标签。 
     * @return SubLabel 该字段用于返回当前恶意标签下对应的子标签的检测结果，如：*Porn-SexBehavior* 等子标签。
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set 该字段用于返回当前恶意标签下对应的子标签的检测结果，如：*Porn-SexBehavior* 等子标签。
     * @param SubLabel 该字段用于返回当前恶意标签下对应的子标签的检测结果，如：*Porn-SexBehavior* 等子标签。
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    /**
     * Get 该字段用于返回命中当前恶意标签下子标签的分值，取值为**0-100**，如：*Porn-SexBehavior 99* 则代表相应识别内容命中色情-性行为标签的分值为99。 
     * @return Score 该字段用于返回命中当前恶意标签下子标签的分值，取值为**0-100**，如：*Porn-SexBehavior 99* 则代表相应识别内容命中色情-性行为标签的分值为99。
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 该字段用于返回命中当前恶意标签下子标签的分值，取值为**0-100**，如：*Porn-SexBehavior 99* 则代表相应识别内容命中色情-性行为标签的分值为99。
     * @param Score 该字段用于返回命中当前恶意标签下子标签的分值，取值为**0-100**，如：*Porn-SexBehavior 99* 则代表相应识别内容命中色情-性行为标签的分值为99。
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 该标签用于返回所识别出的实体名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Names 该标签用于返回所识别出的实体名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set 该标签用于返回所识别出的实体名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Names 该标签用于返回所识别出的实体名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    /**
     * Get 该标签用于返回所识别出实体的详细信息，如：序号、命中标签名称、位置坐标等信息，详细返回内容敬请参考相应数据结构（[ObjectDetail
](https://cloud.tencent.com/document/api/1125/53274#ObjectDetail)）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Details 该标签用于返回所识别出实体的详细信息，如：序号、命中标签名称、位置坐标等信息，详细返回内容敬请参考相应数据结构（[ObjectDetail
](https://cloud.tencent.com/document/api/1125/53274#ObjectDetail)）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ObjectDetail [] getDetails() {
        return this.Details;
    }

    /**
     * Set 该标签用于返回所识别出实体的详细信息，如：序号、命中标签名称、位置坐标等信息，详细返回内容敬请参考相应数据结构（[ObjectDetail
](https://cloud.tencent.com/document/api/1125/53274#ObjectDetail)）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Details 该标签用于返回所识别出实体的详细信息，如：序号、命中标签名称、位置坐标等信息，详细返回内容敬请参考相应数据结构（[ObjectDetail
](https://cloud.tencent.com/document/api/1125/53274#ObjectDetail)）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetails(ObjectDetail [] Details) {
        this.Details = Details;
    }

    public ObjectResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ObjectResult(ObjectResult source) {
        if (source.Scene != null) {
            this.Scene = new String(source.Scene);
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
        if (source.Details != null) {
            this.Details = new ObjectDetail[source.Details.length];
            for (int i = 0; i < source.Details.length; i++) {
                this.Details[i] = new ObjectDetail(source.Details[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "SubLabel", this.SubLabel);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamArraySimple(map, prefix + "Names.", this.Names);
        this.setParamArrayObj(map, prefix + "Details.", this.Details);

    }
}

