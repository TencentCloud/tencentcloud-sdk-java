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

public class ModifyProcessImageTemplateRequest extends AbstractModel {

    /**
    * 图片处理模板唯一标识。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 图片处理模板名称，长度限制：64个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 模板描述信息，长度限制256个字符。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 图片处理模板参数。
    */
    @SerializedName("ProcessImageTemplate")
    @Expose
    private ImageTaskInput ProcessImageTemplate;

    /**
     * Get 图片处理模板唯一标识。 
     * @return Definition 图片处理模板唯一标识。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 图片处理模板唯一标识。
     * @param Definition 图片处理模板唯一标识。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 图片处理模板名称，长度限制：64个字符。 
     * @return Name 图片处理模板名称，长度限制：64个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 图片处理模板名称，长度限制：64个字符。
     * @param Name 图片处理模板名称，长度限制：64个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 模板描述信息，长度限制256个字符。 
     * @return Comment 模板描述信息，长度限制256个字符。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 模板描述信息，长度限制256个字符。
     * @param Comment 模板描述信息，长度限制256个字符。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 图片处理模板参数。 
     * @return ProcessImageTemplate 图片处理模板参数。
     */
    public ImageTaskInput getProcessImageTemplate() {
        return this.ProcessImageTemplate;
    }

    /**
     * Set 图片处理模板参数。
     * @param ProcessImageTemplate 图片处理模板参数。
     */
    public void setProcessImageTemplate(ImageTaskInput ProcessImageTemplate) {
        this.ProcessImageTemplate = ProcessImageTemplate;
    }

    public ModifyProcessImageTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyProcessImageTemplateRequest(ModifyProcessImageTemplateRequest source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.ProcessImageTemplate != null) {
            this.ProcessImageTemplate = new ImageTaskInput(source.ProcessImageTemplate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "ProcessImageTemplate.", this.ProcessImageTemplate);

    }
}

