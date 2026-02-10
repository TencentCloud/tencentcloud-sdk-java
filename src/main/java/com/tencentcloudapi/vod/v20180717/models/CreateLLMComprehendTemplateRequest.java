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

public class CreateLLMComprehendTemplateRequest extends AbstractModel {

    /**
    * 解析级别，可选值为：
- Audio: 音频级解析
- Video: 视频级解析
    */
    @SerializedName("Level")
    @Expose
    private String Level;

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
    * 分段摘要解析配置
    */
    @SerializedName("Summary")
    @Expose
    private LLMComprehendSummary Summary;

    /**
    * 文本转录解析配置
    */
    @SerializedName("Asr")
    @Expose
    private LLMComprehendAsr Asr;

    /**
     * Get 解析级别，可选值为：
- Audio: 音频级解析
- Video: 视频级解析 
     * @return Level 解析级别，可选值为：
- Audio: 音频级解析
- Video: 视频级解析
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 解析级别，可选值为：
- Audio: 音频级解析
- Video: 视频级解析
     * @param Level 解析级别，可选值为：
- Audio: 音频级解析
- Video: 视频级解析
     */
    public void setLevel(String Level) {
        this.Level = Level;
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
     * Get 分段摘要解析配置 
     * @return Summary 分段摘要解析配置
     */
    public LLMComprehendSummary getSummary() {
        return this.Summary;
    }

    /**
     * Set 分段摘要解析配置
     * @param Summary 分段摘要解析配置
     */
    public void setSummary(LLMComprehendSummary Summary) {
        this.Summary = Summary;
    }

    /**
     * Get 文本转录解析配置 
     * @return Asr 文本转录解析配置
     */
    public LLMComprehendAsr getAsr() {
        return this.Asr;
    }

    /**
     * Set 文本转录解析配置
     * @param Asr 文本转录解析配置
     */
    public void setAsr(LLMComprehendAsr Asr) {
        this.Asr = Asr;
    }

    public CreateLLMComprehendTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLLMComprehendTemplateRequest(CreateLLMComprehendTemplateRequest source) {
        if (source.Level != null) {
            this.Level = new String(source.Level);
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
        if (source.Summary != null) {
            this.Summary = new LLMComprehendSummary(source.Summary);
        }
        if (source.Asr != null) {
            this.Asr = new LLMComprehendAsr(source.Asr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "Summary.", this.Summary);
        this.setParamObj(map, prefix + "Asr.", this.Asr);

    }
}

