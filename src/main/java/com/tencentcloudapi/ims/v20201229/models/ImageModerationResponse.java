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
package com.tencentcloudapi.ims.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageModerationResponse extends AbstractModel {

    /**
    * <p>该字段用于返回Label标签下的后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：<strong>Block</strong>：建议屏蔽，<strong>Review</strong> ：建议人工复审，<strong>Pass</strong>：建议通过</p>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * <p>该字段用于返回检测结果（LabelResults）中所对应的<strong>优先级最高的恶意标签</strong>，表示模型推荐的审核结果，建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值标签示例：<strong>Normal</strong>：正常，<strong>Porn</strong>：色情，<strong>Abuse</strong>：谩骂，<strong>Ad</strong>：广告；（说明：文档仅示例了部分风险类型，更多返回类型请以实际值为准或<a href="https://console.cloud.tencent.com/workorder/category">提交工单</a>进行咨询）。</p>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * <p>该字段用于返回检测结果所命中优先级最高的恶意标签下的子标签名称，如：<em>色情--性行为</em>；若未命中任何子标签则返回空字符串。</p>
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
    * <p>该字段用于返回当前标签（Label）下的置信度，取值范围：0（<strong>置信度最低</strong>）-100（<strong>置信度最高</strong> ），越高代表图片越有可能属于当前返回的标签；如：<em>色情 99</em>，则表明该图片非常有可能属于色情内容；<em>色情 0</em>，则表明该图片不属于色情内容。</p>
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * <p>该字段用于返回分类检测模型的详细检测结果；表示模型推荐的审核结果，建议您按照业务所需，对不同违规类型与建议值进行处理。详细返回值信息可参阅对应的数据结构（LabelResults）描述。</p><p>返回值标签示例：Normal:正常，Porn:色情，Abuse:谩骂，Ad:广告（说明：文档仅示例了部分风险类型，更多返回类型请以实际值为准或<a href="https://console.cloud.tencent.com/workorder/category">提交工单</a>进行咨询）<br>注意：此字段可能返回 null，表示取不到有效值。</p>
    */
    @SerializedName("LabelResults")
    @Expose
    private LabelResult [] LabelResults;

    /**
    * <p>该字段用于返回物体检测模型的详细检测结果；包括：实体、广告台标、二维码等内容命中的标签名称、标签分数、坐标信息、场景识别结果、建议操作等内容审核信息；详细返回值信息可参阅对应的数据结构（ObjectResults）描述。</p>
    */
    @SerializedName("ObjectResults")
    @Expose
    private ObjectResult [] ObjectResults;

    /**
    * <p>该字段用于返回OCR文本识别的详细检测结果；包括：文本坐标信息、文本识别结果、建议操作等内容审核信息；详细返回值信息可参阅对应的数据结构（OcrResults）描述。</p>
    */
    @SerializedName("OcrResults")
    @Expose
    private OcrResult [] OcrResults;

    /**
    * <p>该字段用于返回基于图片风险库（风险黑库与正常白库）识别的结果,详细返回值信息可参阅对应的数据结构（LibResults）描述。<br>备注：图片风险库目前<strong>暂不支持自定义库</strong>。</p>
    */
    @SerializedName("LibResults")
    @Expose
    private LibResult [] LibResults;

    /**
    * <p>该字段用于返回检测对象对应请求参数中的DataId。</p>
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * <p>该字段用于返回检测对象对应请求参数中的BizType。</p>
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * <p>该字段用于返回根据您的需求配置的额外附加信息（Extra），如未配置则默认返回值为空。<br>备注：不同客户或Biztype下返回信息不同，如需配置该字段请提交工单咨询或联系售后专员处理。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * <p>该字段用于返回检测对象对应的MD5校验值，以方便校验文件完整性。</p>
    */
    @SerializedName("FileMD5")
    @Expose
    private String FileMD5;

    /**
    * <p>该字段用于返回仅识别图片元素的模型结果；包括：场景模型命中的标签、置信度和位置信息</p>
    */
    @SerializedName("RecognitionResults")
    @Expose
    private RecognitionResult [] RecognitionResults;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>该字段用于返回Label标签下的后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：<strong>Block</strong>：建议屏蔽，<strong>Review</strong> ：建议人工复审，<strong>Pass</strong>：建议通过</p> 
     * @return Suggestion <p>该字段用于返回Label标签下的后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：<strong>Block</strong>：建议屏蔽，<strong>Review</strong> ：建议人工复审，<strong>Pass</strong>：建议通过</p>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set <p>该字段用于返回Label标签下的后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：<strong>Block</strong>：建议屏蔽，<strong>Review</strong> ：建议人工复审，<strong>Pass</strong>：建议通过</p>
     * @param Suggestion <p>该字段用于返回Label标签下的后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：<strong>Block</strong>：建议屏蔽，<strong>Review</strong> ：建议人工复审，<strong>Pass</strong>：建议通过</p>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get <p>该字段用于返回检测结果（LabelResults）中所对应的<strong>优先级最高的恶意标签</strong>，表示模型推荐的审核结果，建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值标签示例：<strong>Normal</strong>：正常，<strong>Porn</strong>：色情，<strong>Abuse</strong>：谩骂，<strong>Ad</strong>：广告；（说明：文档仅示例了部分风险类型，更多返回类型请以实际值为准或<a href="https://console.cloud.tencent.com/workorder/category">提交工单</a>进行咨询）。</p> 
     * @return Label <p>该字段用于返回检测结果（LabelResults）中所对应的<strong>优先级最高的恶意标签</strong>，表示模型推荐的审核结果，建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值标签示例：<strong>Normal</strong>：正常，<strong>Porn</strong>：色情，<strong>Abuse</strong>：谩骂，<strong>Ad</strong>：广告；（说明：文档仅示例了部分风险类型，更多返回类型请以实际值为准或<a href="https://console.cloud.tencent.com/workorder/category">提交工单</a>进行咨询）。</p>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set <p>该字段用于返回检测结果（LabelResults）中所对应的<strong>优先级最高的恶意标签</strong>，表示模型推荐的审核结果，建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值标签示例：<strong>Normal</strong>：正常，<strong>Porn</strong>：色情，<strong>Abuse</strong>：谩骂，<strong>Ad</strong>：广告；（说明：文档仅示例了部分风险类型，更多返回类型请以实际值为准或<a href="https://console.cloud.tencent.com/workorder/category">提交工单</a>进行咨询）。</p>
     * @param Label <p>该字段用于返回检测结果（LabelResults）中所对应的<strong>优先级最高的恶意标签</strong>，表示模型推荐的审核结果，建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值标签示例：<strong>Normal</strong>：正常，<strong>Porn</strong>：色情，<strong>Abuse</strong>：谩骂，<strong>Ad</strong>：广告；（说明：文档仅示例了部分风险类型，更多返回类型请以实际值为准或<a href="https://console.cloud.tencent.com/workorder/category">提交工单</a>进行咨询）。</p>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get <p>该字段用于返回检测结果所命中优先级最高的恶意标签下的子标签名称，如：<em>色情--性行为</em>；若未命中任何子标签则返回空字符串。</p> 
     * @return SubLabel <p>该字段用于返回检测结果所命中优先级最高的恶意标签下的子标签名称，如：<em>色情--性行为</em>；若未命中任何子标签则返回空字符串。</p>
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set <p>该字段用于返回检测结果所命中优先级最高的恶意标签下的子标签名称，如：<em>色情--性行为</em>；若未命中任何子标签则返回空字符串。</p>
     * @param SubLabel <p>该字段用于返回检测结果所命中优先级最高的恶意标签下的子标签名称，如：<em>色情--性行为</em>；若未命中任何子标签则返回空字符串。</p>
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    /**
     * Get <p>该字段用于返回当前标签（Label）下的置信度，取值范围：0（<strong>置信度最低</strong>）-100（<strong>置信度最高</strong> ），越高代表图片越有可能属于当前返回的标签；如：<em>色情 99</em>，则表明该图片非常有可能属于色情内容；<em>色情 0</em>，则表明该图片不属于色情内容。</p> 
     * @return Score <p>该字段用于返回当前标签（Label）下的置信度，取值范围：0（<strong>置信度最低</strong>）-100（<strong>置信度最高</strong> ），越高代表图片越有可能属于当前返回的标签；如：<em>色情 99</em>，则表明该图片非常有可能属于色情内容；<em>色情 0</em>，则表明该图片不属于色情内容。</p>
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set <p>该字段用于返回当前标签（Label）下的置信度，取值范围：0（<strong>置信度最低</strong>）-100（<strong>置信度最高</strong> ），越高代表图片越有可能属于当前返回的标签；如：<em>色情 99</em>，则表明该图片非常有可能属于色情内容；<em>色情 0</em>，则表明该图片不属于色情内容。</p>
     * @param Score <p>该字段用于返回当前标签（Label）下的置信度，取值范围：0（<strong>置信度最低</strong>）-100（<strong>置信度最高</strong> ），越高代表图片越有可能属于当前返回的标签；如：<em>色情 99</em>，则表明该图片非常有可能属于色情内容；<em>色情 0</em>，则表明该图片不属于色情内容。</p>
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get <p>该字段用于返回分类检测模型的详细检测结果；表示模型推荐的审核结果，建议您按照业务所需，对不同违规类型与建议值进行处理。详细返回值信息可参阅对应的数据结构（LabelResults）描述。</p><p>返回值标签示例：Normal:正常，Porn:色情，Abuse:谩骂，Ad:广告（说明：文档仅示例了部分风险类型，更多返回类型请以实际值为准或<a href="https://console.cloud.tencent.com/workorder/category">提交工单</a>进行咨询）<br>注意：此字段可能返回 null，表示取不到有效值。</p> 
     * @return LabelResults <p>该字段用于返回分类检测模型的详细检测结果；表示模型推荐的审核结果，建议您按照业务所需，对不同违规类型与建议值进行处理。详细返回值信息可参阅对应的数据结构（LabelResults）描述。</p><p>返回值标签示例：Normal:正常，Porn:色情，Abuse:谩骂，Ad:广告（说明：文档仅示例了部分风险类型，更多返回类型请以实际值为准或<a href="https://console.cloud.tencent.com/workorder/category">提交工单</a>进行咨询）<br>注意：此字段可能返回 null，表示取不到有效值。</p>
     */
    public LabelResult [] getLabelResults() {
        return this.LabelResults;
    }

    /**
     * Set <p>该字段用于返回分类检测模型的详细检测结果；表示模型推荐的审核结果，建议您按照业务所需，对不同违规类型与建议值进行处理。详细返回值信息可参阅对应的数据结构（LabelResults）描述。</p><p>返回值标签示例：Normal:正常，Porn:色情，Abuse:谩骂，Ad:广告（说明：文档仅示例了部分风险类型，更多返回类型请以实际值为准或<a href="https://console.cloud.tencent.com/workorder/category">提交工单</a>进行咨询）<br>注意：此字段可能返回 null，表示取不到有效值。</p>
     * @param LabelResults <p>该字段用于返回分类检测模型的详细检测结果；表示模型推荐的审核结果，建议您按照业务所需，对不同违规类型与建议值进行处理。详细返回值信息可参阅对应的数据结构（LabelResults）描述。</p><p>返回值标签示例：Normal:正常，Porn:色情，Abuse:谩骂，Ad:广告（说明：文档仅示例了部分风险类型，更多返回类型请以实际值为准或<a href="https://console.cloud.tencent.com/workorder/category">提交工单</a>进行咨询）<br>注意：此字段可能返回 null，表示取不到有效值。</p>
     */
    public void setLabelResults(LabelResult [] LabelResults) {
        this.LabelResults = LabelResults;
    }

    /**
     * Get <p>该字段用于返回物体检测模型的详细检测结果；包括：实体、广告台标、二维码等内容命中的标签名称、标签分数、坐标信息、场景识别结果、建议操作等内容审核信息；详细返回值信息可参阅对应的数据结构（ObjectResults）描述。</p> 
     * @return ObjectResults <p>该字段用于返回物体检测模型的详细检测结果；包括：实体、广告台标、二维码等内容命中的标签名称、标签分数、坐标信息、场景识别结果、建议操作等内容审核信息；详细返回值信息可参阅对应的数据结构（ObjectResults）描述。</p>
     */
    public ObjectResult [] getObjectResults() {
        return this.ObjectResults;
    }

    /**
     * Set <p>该字段用于返回物体检测模型的详细检测结果；包括：实体、广告台标、二维码等内容命中的标签名称、标签分数、坐标信息、场景识别结果、建议操作等内容审核信息；详细返回值信息可参阅对应的数据结构（ObjectResults）描述。</p>
     * @param ObjectResults <p>该字段用于返回物体检测模型的详细检测结果；包括：实体、广告台标、二维码等内容命中的标签名称、标签分数、坐标信息、场景识别结果、建议操作等内容审核信息；详细返回值信息可参阅对应的数据结构（ObjectResults）描述。</p>
     */
    public void setObjectResults(ObjectResult [] ObjectResults) {
        this.ObjectResults = ObjectResults;
    }

    /**
     * Get <p>该字段用于返回OCR文本识别的详细检测结果；包括：文本坐标信息、文本识别结果、建议操作等内容审核信息；详细返回值信息可参阅对应的数据结构（OcrResults）描述。</p> 
     * @return OcrResults <p>该字段用于返回OCR文本识别的详细检测结果；包括：文本坐标信息、文本识别结果、建议操作等内容审核信息；详细返回值信息可参阅对应的数据结构（OcrResults）描述。</p>
     */
    public OcrResult [] getOcrResults() {
        return this.OcrResults;
    }

    /**
     * Set <p>该字段用于返回OCR文本识别的详细检测结果；包括：文本坐标信息、文本识别结果、建议操作等内容审核信息；详细返回值信息可参阅对应的数据结构（OcrResults）描述。</p>
     * @param OcrResults <p>该字段用于返回OCR文本识别的详细检测结果；包括：文本坐标信息、文本识别结果、建议操作等内容审核信息；详细返回值信息可参阅对应的数据结构（OcrResults）描述。</p>
     */
    public void setOcrResults(OcrResult [] OcrResults) {
        this.OcrResults = OcrResults;
    }

    /**
     * Get <p>该字段用于返回基于图片风险库（风险黑库与正常白库）识别的结果,详细返回值信息可参阅对应的数据结构（LibResults）描述。<br>备注：图片风险库目前<strong>暂不支持自定义库</strong>。</p> 
     * @return LibResults <p>该字段用于返回基于图片风险库（风险黑库与正常白库）识别的结果,详细返回值信息可参阅对应的数据结构（LibResults）描述。<br>备注：图片风险库目前<strong>暂不支持自定义库</strong>。</p>
     */
    public LibResult [] getLibResults() {
        return this.LibResults;
    }

    /**
     * Set <p>该字段用于返回基于图片风险库（风险黑库与正常白库）识别的结果,详细返回值信息可参阅对应的数据结构（LibResults）描述。<br>备注：图片风险库目前<strong>暂不支持自定义库</strong>。</p>
     * @param LibResults <p>该字段用于返回基于图片风险库（风险黑库与正常白库）识别的结果,详细返回值信息可参阅对应的数据结构（LibResults）描述。<br>备注：图片风险库目前<strong>暂不支持自定义库</strong>。</p>
     */
    public void setLibResults(LibResult [] LibResults) {
        this.LibResults = LibResults;
    }

    /**
     * Get <p>该字段用于返回检测对象对应请求参数中的DataId。</p> 
     * @return DataId <p>该字段用于返回检测对象对应请求参数中的DataId。</p>
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set <p>该字段用于返回检测对象对应请求参数中的DataId。</p>
     * @param DataId <p>该字段用于返回检测对象对应请求参数中的DataId。</p>
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get <p>该字段用于返回检测对象对应请求参数中的BizType。</p> 
     * @return BizType <p>该字段用于返回检测对象对应请求参数中的BizType。</p>
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set <p>该字段用于返回检测对象对应请求参数中的BizType。</p>
     * @param BizType <p>该字段用于返回检测对象对应请求参数中的BizType。</p>
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get <p>该字段用于返回根据您的需求配置的额外附加信息（Extra），如未配置则默认返回值为空。<br>备注：不同客户或Biztype下返回信息不同，如需配置该字段请提交工单咨询或联系售后专员处理。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Extra <p>该字段用于返回根据您的需求配置的额外附加信息（Extra），如未配置则默认返回值为空。<br>备注：不同客户或Biztype下返回信息不同，如需配置该字段请提交工单咨询或联系售后专员处理。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set <p>该字段用于返回根据您的需求配置的额外附加信息（Extra），如未配置则默认返回值为空。<br>备注：不同客户或Biztype下返回信息不同，如需配置该字段请提交工单咨询或联系售后专员处理。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Extra <p>该字段用于返回根据您的需求配置的额外附加信息（Extra），如未配置则默认返回值为空。<br>备注：不同客户或Biztype下返回信息不同，如需配置该字段请提交工单咨询或联系售后专员处理。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get <p>该字段用于返回检测对象对应的MD5校验值，以方便校验文件完整性。</p> 
     * @return FileMD5 <p>该字段用于返回检测对象对应的MD5校验值，以方便校验文件完整性。</p>
     */
    public String getFileMD5() {
        return this.FileMD5;
    }

    /**
     * Set <p>该字段用于返回检测对象对应的MD5校验值，以方便校验文件完整性。</p>
     * @param FileMD5 <p>该字段用于返回检测对象对应的MD5校验值，以方便校验文件完整性。</p>
     */
    public void setFileMD5(String FileMD5) {
        this.FileMD5 = FileMD5;
    }

    /**
     * Get <p>该字段用于返回仅识别图片元素的模型结果；包括：场景模型命中的标签、置信度和位置信息</p> 
     * @return RecognitionResults <p>该字段用于返回仅识别图片元素的模型结果；包括：场景模型命中的标签、置信度和位置信息</p>
     */
    public RecognitionResult [] getRecognitionResults() {
        return this.RecognitionResults;
    }

    /**
     * Set <p>该字段用于返回仅识别图片元素的模型结果；包括：场景模型命中的标签、置信度和位置信息</p>
     * @param RecognitionResults <p>该字段用于返回仅识别图片元素的模型结果；包括：场景模型命中的标签、置信度和位置信息</p>
     */
    public void setRecognitionResults(RecognitionResult [] RecognitionResults) {
        this.RecognitionResults = RecognitionResults;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ImageModerationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageModerationResponse(ImageModerationResponse source) {
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
        if (source.LabelResults != null) {
            this.LabelResults = new LabelResult[source.LabelResults.length];
            for (int i = 0; i < source.LabelResults.length; i++) {
                this.LabelResults[i] = new LabelResult(source.LabelResults[i]);
            }
        }
        if (source.ObjectResults != null) {
            this.ObjectResults = new ObjectResult[source.ObjectResults.length];
            for (int i = 0; i < source.ObjectResults.length; i++) {
                this.ObjectResults[i] = new ObjectResult(source.ObjectResults[i]);
            }
        }
        if (source.OcrResults != null) {
            this.OcrResults = new OcrResult[source.OcrResults.length];
            for (int i = 0; i < source.OcrResults.length; i++) {
                this.OcrResults[i] = new OcrResult(source.OcrResults[i]);
            }
        }
        if (source.LibResults != null) {
            this.LibResults = new LibResult[source.LibResults.length];
            for (int i = 0; i < source.LibResults.length; i++) {
                this.LibResults[i] = new LibResult(source.LibResults[i]);
            }
        }
        if (source.DataId != null) {
            this.DataId = new String(source.DataId);
        }
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
        }
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
        if (source.FileMD5 != null) {
            this.FileMD5 = new String(source.FileMD5);
        }
        if (source.RecognitionResults != null) {
            this.RecognitionResults = new RecognitionResult[source.RecognitionResults.length];
            for (int i = 0; i < source.RecognitionResults.length; i++) {
                this.RecognitionResults[i] = new RecognitionResult(source.RecognitionResults[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "SubLabel", this.SubLabel);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamArrayObj(map, prefix + "LabelResults.", this.LabelResults);
        this.setParamArrayObj(map, prefix + "ObjectResults.", this.ObjectResults);
        this.setParamArrayObj(map, prefix + "OcrResults.", this.OcrResults);
        this.setParamArrayObj(map, prefix + "LibResults.", this.LibResults);
        this.setParamSimple(map, prefix + "DataId", this.DataId);
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "Extra", this.Extra);
        this.setParamSimple(map, prefix + "FileMD5", this.FileMD5);
        this.setParamArrayObj(map, prefix + "RecognitionResults.", this.RecognitionResults);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

