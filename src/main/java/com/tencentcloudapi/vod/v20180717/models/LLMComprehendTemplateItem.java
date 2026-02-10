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
    * 图片异步处理模板唯一标识。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 图片异步处理模板名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 图片异步处理模板描述信息。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 解析级别，可选值为：
- Audio: 音频级解析
- Video: 视频级解析
    */
    @SerializedName("Level")
    @Expose
    private String Level;

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
    * 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 图片异步处理模板唯一标识。 
     * @return Definition 图片异步处理模板唯一标识。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 图片异步处理模板唯一标识。
     * @param Definition 图片异步处理模板唯一标识。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 图片异步处理模板名称。 
     * @return Name 图片异步处理模板名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 图片异步处理模板名称。
     * @param Name 图片异步处理模板名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 图片异步处理模板描述信息。 
     * @return Comment 图片异步处理模板描述信息。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 图片异步处理模板描述信息。
     * @param Comment 图片异步处理模板描述信息。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

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

    /**
     * Get 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return UpdateTime 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param UpdateTime 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
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
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

