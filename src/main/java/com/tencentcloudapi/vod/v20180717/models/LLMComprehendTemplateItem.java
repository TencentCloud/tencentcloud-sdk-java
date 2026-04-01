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

public class LLMComprehendTemplateItem extends AbstractModel {

    /**
    * <p>图片异步处理模板唯一标识。</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>图片异步处理模板名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>图片异步处理模板描述信息。</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>解析级别，可选值为：</p><ul><li>Audio: 音频级解析</li><li>Video: 视频级解析</li></ul>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

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
    * <p>人脸识别解析配置</p>
    */
    @SerializedName("FaceRecognition")
    @Expose
    private LLMComprehendFaceRecognition FaceRecognition;

    /**
    * <p>模板创建时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>模板最后修改时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>图片异步处理模板唯一标识。</p> 
     * @return Definition <p>图片异步处理模板唯一标识。</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>图片异步处理模板唯一标识。</p>
     * @param Definition <p>图片异步处理模板唯一标识。</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>图片异步处理模板名称。</p> 
     * @return Name <p>图片异步处理模板名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>图片异步处理模板名称。</p>
     * @param Name <p>图片异步处理模板名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>图片异步处理模板描述信息。</p> 
     * @return Comment <p>图片异步处理模板描述信息。</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>图片异步处理模板描述信息。</p>
     * @param Comment <p>图片异步处理模板描述信息。</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

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
     * Get <p>人脸识别解析配置</p> 
     * @return FaceRecognition <p>人脸识别解析配置</p>
     */
    public LLMComprehendFaceRecognition getFaceRecognition() {
        return this.FaceRecognition;
    }

    /**
     * Set <p>人脸识别解析配置</p>
     * @param FaceRecognition <p>人脸识别解析配置</p>
     */
    public void setFaceRecognition(LLMComprehendFaceRecognition FaceRecognition) {
        this.FaceRecognition = FaceRecognition;
    }

    /**
     * Get <p>模板创建时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p> 
     * @return CreateTime <p>模板创建时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>模板创建时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     * @param CreateTime <p>模板创建时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>模板最后修改时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p> 
     * @return UpdateTime <p>模板最后修改时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>模板最后修改时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     * @param UpdateTime <p>模板最后修改时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public LLMComprehendTemplateItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LLMComprehendTemplateItem(LLMComprehendTemplateItem source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamObj(map, prefix + "Summary.", this.Summary);
        this.setParamObj(map, prefix + "Asr.", this.Asr);
        this.setParamObj(map, prefix + "FaceRecognition.", this.FaceRecognition);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

