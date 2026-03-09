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
    * <p>解析级别，可选值为：</p><ul><li>Audio: 音频级解析</li><li>Video: 视频级解析</li></ul>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

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
    * <p>分段摘要解析配置</p>
    */
    @SerializedName("Summary")
    @Expose
    private LLMComprehendSummary Summary;

    /**
    * <p>文本转录解析配置</p>
    */
    @SerializedName("Asr")
    @Expose
    private LLMComprehendAsr Asr;

    /**
    * <p>人脸识别配置</p>
    */
    @SerializedName("FaceRecognition")
    @Expose
    private LLMComprehendFaceRecognition FaceRecognition;

    /**
     * Get <p>解析级别，可选值为：</p><ul><li>Audio: 音频级解析</li><li>Video: 视频级解析</li></ul> 
     * @return Level <p>解析级别，可选值为：</p><ul><li>Audio: 音频级解析</li><li>Video: 视频级解析</li></ul>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set <p>解析级别，可选值为：</p><ul><li>Audio: 音频级解析</li><li>Video: 视频级解析</li></ul>
     * @param Level <p>解析级别，可选值为：</p><ul><li>Audio: 音频级解析</li><li>Video: 视频级解析</li></ul>
     */
    public void setLevel(String Level) {
        this.Level = Level;
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
     * Get <p>分段摘要解析配置</p> 
     * @return Summary <p>分段摘要解析配置</p>
     */
    public LLMComprehendSummary getSummary() {
        return this.Summary;
    }

    /**
     * Set <p>分段摘要解析配置</p>
     * @param Summary <p>分段摘要解析配置</p>
     */
    public void setSummary(LLMComprehendSummary Summary) {
        this.Summary = Summary;
    }

    /**
     * Get <p>文本转录解析配置</p> 
     * @return Asr <p>文本转录解析配置</p>
     */
    public LLMComprehendAsr getAsr() {
        return this.Asr;
    }

    /**
     * Set <p>文本转录解析配置</p>
     * @param Asr <p>文本转录解析配置</p>
     */
    public void setAsr(LLMComprehendAsr Asr) {
        this.Asr = Asr;
    }

    /**
     * Get <p>人脸识别配置</p> 
     * @return FaceRecognition <p>人脸识别配置</p>
     */
    public LLMComprehendFaceRecognition getFaceRecognition() {
        return this.FaceRecognition;
    }

    /**
     * Set <p>人脸识别配置</p>
     * @param FaceRecognition <p>人脸识别配置</p>
     */
    public void setFaceRecognition(LLMComprehendFaceRecognition FaceRecognition) {
        this.FaceRecognition = FaceRecognition;
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
        if (source.FaceRecognition != null) {
            this.FaceRecognition = new LLMComprehendFaceRecognition(source.FaceRecognition);
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
        this.setParamObj(map, prefix + "FaceRecognition.", this.FaceRecognition);

    }
}

