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

public class DeleteMPSTemplateRequest extends AbstractModel {

    /**
    * <p><b>点播<a href="/document/product/266/14574">应用</a> ID。</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>需要删除的 MPS 模板的类型。取值：</p><li>AIAnalysis: 创建智能分析模板。</li><li>SmartSubtitle: 创建智能字幕模板。</li><li>SmartErase: 创建智能擦除模板。</li><li>EmbedSubtitle: 字幕压制模板。</li>
    */
    @SerializedName("TemplateType")
    @Expose
    private String TemplateType;

    /**
    * <p>MPS 任务模板唯一标识。</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
     * Get <p><b>点播<a href="/document/product/266/14574">应用</a> ID。</b></p> 
     * @return SubAppId <p><b>点播<a href="/document/product/266/14574">应用</a> ID。</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>点播<a href="/document/product/266/14574">应用</a> ID。</b></p>
     * @param SubAppId <p><b>点播<a href="/document/product/266/14574">应用</a> ID。</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>需要删除的 MPS 模板的类型。取值：</p><li>AIAnalysis: 创建智能分析模板。</li><li>SmartSubtitle: 创建智能字幕模板。</li><li>SmartErase: 创建智能擦除模板。</li><li>EmbedSubtitle: 字幕压制模板。</li> 
     * @return TemplateType <p>需要删除的 MPS 模板的类型。取值：</p><li>AIAnalysis: 创建智能分析模板。</li><li>SmartSubtitle: 创建智能字幕模板。</li><li>SmartErase: 创建智能擦除模板。</li><li>EmbedSubtitle: 字幕压制模板。</li>
     */
    public String getTemplateType() {
        return this.TemplateType;
    }

    /**
     * Set <p>需要删除的 MPS 模板的类型。取值：</p><li>AIAnalysis: 创建智能分析模板。</li><li>SmartSubtitle: 创建智能字幕模板。</li><li>SmartErase: 创建智能擦除模板。</li><li>EmbedSubtitle: 字幕压制模板。</li>
     * @param TemplateType <p>需要删除的 MPS 模板的类型。取值：</p><li>AIAnalysis: 创建智能分析模板。</li><li>SmartSubtitle: 创建智能字幕模板。</li><li>SmartErase: 创建智能擦除模板。</li><li>EmbedSubtitle: 字幕压制模板。</li>
     */
    public void setTemplateType(String TemplateType) {
        this.TemplateType = TemplateType;
    }

    /**
     * Get <p>MPS 任务模板唯一标识。</p> 
     * @return Definition <p>MPS 任务模板唯一标识。</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>MPS 任务模板唯一标识。</p>
     * @param Definition <p>MPS 任务模板唯一标识。</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    public DeleteMPSTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteMPSTemplateRequest(DeleteMPSTemplateRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.TemplateType != null) {
            this.TemplateType = new String(source.TemplateType);
        }
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "TemplateType", this.TemplateType);
        this.setParamSimple(map, prefix + "Definition", this.Definition);

    }
}

