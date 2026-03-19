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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySubtitleEmbedTemplateRequest extends AbstractModel {

    /**
    * <p>字幕压制模板唯一标识</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>字幕压制名称<br>长度限制：64 个字符。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>字幕压制模板描述信息<br>长度限制：256 个字符。</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>字幕压制相关配置</p>
    */
    @SerializedName("SubtitleEmbedConfig")
    @Expose
    private SubtitleEmbedConfig SubtitleEmbedConfig;

    /**
     * Get <p>字幕压制模板唯一标识</p> 
     * @return Definition <p>字幕压制模板唯一标识</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>字幕压制模板唯一标识</p>
     * @param Definition <p>字幕压制模板唯一标识</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>字幕压制名称<br>长度限制：64 个字符。</p> 
     * @return Name <p>字幕压制名称<br>长度限制：64 个字符。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>字幕压制名称<br>长度限制：64 个字符。</p>
     * @param Name <p>字幕压制名称<br>长度限制：64 个字符。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>字幕压制模板描述信息<br>长度限制：256 个字符。</p> 
     * @return Comment <p>字幕压制模板描述信息<br>长度限制：256 个字符。</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>字幕压制模板描述信息<br>长度限制：256 个字符。</p>
     * @param Comment <p>字幕压制模板描述信息<br>长度限制：256 个字符。</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>字幕压制相关配置</p> 
     * @return SubtitleEmbedConfig <p>字幕压制相关配置</p>
     */
    public SubtitleEmbedConfig getSubtitleEmbedConfig() {
        return this.SubtitleEmbedConfig;
    }

    /**
     * Set <p>字幕压制相关配置</p>
     * @param SubtitleEmbedConfig <p>字幕压制相关配置</p>
     */
    public void setSubtitleEmbedConfig(SubtitleEmbedConfig SubtitleEmbedConfig) {
        this.SubtitleEmbedConfig = SubtitleEmbedConfig;
    }

    public ModifySubtitleEmbedTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySubtitleEmbedTemplateRequest(ModifySubtitleEmbedTemplateRequest source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.SubtitleEmbedConfig != null) {
            this.SubtitleEmbedConfig = new SubtitleEmbedConfig(source.SubtitleEmbedConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "SubtitleEmbedConfig.", this.SubtitleEmbedConfig);

    }
}

