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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLLMComprehendTemplateRequest extends AbstractModel {

    /**
    * <p>大模型理解模板的唯一标识</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>大模型解析模板名称，长度限制：64 个字符。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>大模型解析模板描述信息，长度限制：256 个字符。</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>解析模型，可选值为：</p><ul><li>Basic: 基础模型</li><li>Pro: 优化模型</li></ul>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>分段摘要解析配置</p>
    */
    @SerializedName("Summary")
    @Expose
    private LLMComprehendSummaryForUpdate Summary;

    /**
    * <p>文本转录解析配置</p>
    */
    @SerializedName("Asr")
    @Expose
    private LLMComprehendAsrForUpdate Asr;

    /**
    * <p>人脸识别配置</p>
    */
    @SerializedName("FaceRecognition")
    @Expose
    private LLMComprehendFaceRecognitionForUpdate FaceRecognition;

    /**
     * Get <p>大模型理解模板的唯一标识</p> 
     * @return Definition <p>大模型理解模板的唯一标识</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>大模型理解模板的唯一标识</p>
     * @param Definition <p>大模型理解模板的唯一标识</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p> 
     * @return SubAppId <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     * @param SubAppId <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>大模型解析模板名称，长度限制：64 个字符。</p> 
     * @return Name <p>大模型解析模板名称，长度限制：64 个字符。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>大模型解析模板名称，长度限制：64 个字符。</p>
     * @param Name <p>大模型解析模板名称，长度限制：64 个字符。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>大模型解析模板描述信息，长度限制：256 个字符。</p> 
     * @return Comment <p>大模型解析模板描述信息，长度限制：256 个字符。</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>大模型解析模板描述信息，长度限制：256 个字符。</p>
     * @param Comment <p>大模型解析模板描述信息，长度限制：256 个字符。</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>解析模型，可选值为：</p><ul><li>Basic: 基础模型</li><li>Pro: 优化模型</li></ul> 
     * @return Model <p>解析模型，可选值为：</p><ul><li>Basic: 基础模型</li><li>Pro: 优化模型</li></ul>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>解析模型，可选值为：</p><ul><li>Basic: 基础模型</li><li>Pro: 优化模型</li></ul>
     * @param Model <p>解析模型，可选值为：</p><ul><li>Basic: 基础模型</li><li>Pro: 优化模型</li></ul>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>分段摘要解析配置</p> 
     * @return Summary <p>分段摘要解析配置</p>
     */
    public LLMComprehendSummaryForUpdate getSummary() {
        return this.Summary;
    }

    /**
     * Set <p>分段摘要解析配置</p>
     * @param Summary <p>分段摘要解析配置</p>
     */
    public void setSummary(LLMComprehendSummaryForUpdate Summary) {
        this.Summary = Summary;
    }

    /**
     * Get <p>文本转录解析配置</p> 
     * @return Asr <p>文本转录解析配置</p>
     */
    public LLMComprehendAsrForUpdate getAsr() {
        return this.Asr;
    }

    /**
     * Set <p>文本转录解析配置</p>
     * @param Asr <p>文本转录解析配置</p>
     */
    public void setAsr(LLMComprehendAsrForUpdate Asr) {
        this.Asr = Asr;
    }

    /**
     * Get <p>人脸识别配置</p> 
     * @return FaceRecognition <p>人脸识别配置</p>
     */
    public LLMComprehendFaceRecognitionForUpdate getFaceRecognition() {
        return this.FaceRecognition;
    }

    /**
     * Set <p>人脸识别配置</p>
     * @param FaceRecognition <p>人脸识别配置</p>
     */
    public void setFaceRecognition(LLMComprehendFaceRecognitionForUpdate FaceRecognition) {
        this.FaceRecognition = FaceRecognition;
    }

    public ModifyLLMComprehendTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLLMComprehendTemplateRequest(ModifyLLMComprehendTemplateRequest source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Summary != null) {
            this.Summary = new LLMComprehendSummaryForUpdate(source.Summary);
        }
        if (source.Asr != null) {
            this.Asr = new LLMComprehendAsrForUpdate(source.Asr);
        }
        if (source.FaceRecognition != null) {
            this.FaceRecognition = new LLMComprehendFaceRecognitionForUpdate(source.FaceRecognition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamObj(map, prefix + "Summary.", this.Summary);
        this.setParamObj(map, prefix + "Asr.", this.Asr);
        this.setParamObj(map, prefix + "FaceRecognition.", this.FaceRecognition);

    }
}

