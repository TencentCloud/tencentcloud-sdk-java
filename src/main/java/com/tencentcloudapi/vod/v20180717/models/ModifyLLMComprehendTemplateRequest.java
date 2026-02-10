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
    * 大模型理解模板的唯一标识
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 大模型解析模板名称，长度限制：64 个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 大模型解析模板描述信息，长度限制：256 个字符。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 解析模型，可选值为：
- Basic: 基础模型
- Pro: 优化模型
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 分段摘要解析配置
    */
    @SerializedName("Summary")
    @Expose
    private LLMComprehendSummaryForUpdate Summary;

    /**
    * 文本转录解析配置
    */
    @SerializedName("Asr")
    @Expose
    private LLMComprehendAsrForUpdate Asr;

    /**
     * Get 大模型理解模板的唯一标识 
     * @return Definition 大模型理解模板的唯一标识
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 大模型理解模板的唯一标识
     * @param Definition 大模型理解模板的唯一标识
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b> 
     * @return SubAppId <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     * @param SubAppId <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 大模型解析模板名称，长度限制：64 个字符。 
     * @return Name 大模型解析模板名称，长度限制：64 个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 大模型解析模板名称，长度限制：64 个字符。
     * @param Name 大模型解析模板名称，长度限制：64 个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 大模型解析模板描述信息，长度限制：256 个字符。 
     * @return Comment 大模型解析模板描述信息，长度限制：256 个字符。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 大模型解析模板描述信息，长度限制：256 个字符。
     * @param Comment 大模型解析模板描述信息，长度限制：256 个字符。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 解析模型，可选值为：
- Basic: 基础模型
- Pro: 优化模型 
     * @return Model 解析模型，可选值为：
- Basic: 基础模型
- Pro: 优化模型
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 解析模型，可选值为：
- Basic: 基础模型
- Pro: 优化模型
     * @param Model 解析模型，可选值为：
- Basic: 基础模型
- Pro: 优化模型
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get 分段摘要解析配置 
     * @return Summary 分段摘要解析配置
     */
    public LLMComprehendSummaryForUpdate getSummary() {
        return this.Summary;
    }

    /**
     * Set 分段摘要解析配置
     * @param Summary 分段摘要解析配置
     */
    public void setSummary(LLMComprehendSummaryForUpdate Summary) {
        this.Summary = Summary;
    }

    /**
     * Get 文本转录解析配置 
     * @return Asr 文本转录解析配置
     */
    public LLMComprehendAsrForUpdate getAsr() {
        return this.Asr;
    }

    /**
     * Set 文本转录解析配置
     * @param Asr 文本转录解析配置
     */
    public void setAsr(LLMComprehendAsrForUpdate Asr) {
        this.Asr = Asr;
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

    }
}

