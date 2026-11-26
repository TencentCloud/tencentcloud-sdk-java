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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DocParseConfig extends AbstractModel {

    /**
    * <p>内容过滤配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContentFilter")
    @Expose
    private ContentFilter ContentFilter;

    /**
    * <p>文档解析策略：1=OCR解析 2=智能解析 3=MLLM解析；不传默认智能解析<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>DOC_PARSE_STRATEGY_UNKNOWN</td><td>0</td><td>未指定，走服务端默认（智能解析）</td></tr><tr><td>DOC_PARSE_STRATEGY_OCR</td><td>1</td><td>OCR 解析</td></tr><tr><td>DOC_PARSE_STRATEGY_SMART</td><td>2</td><td>智能解析（按图片类型自动选择：数据图/思维导图/架构图/流程图用 MLLM，其他图片用 OCR）</td></tr><tr><td>DOC_PARSE_STRATEGY_MLLM</td><td>3</td><td>MLLM 解析</td></tr></tbody></table></p>
    */
    @SerializedName("ParseStrategy")
    @Expose
    private Long ParseStrategy;

    /**
    * <p>分割规则</p>
    */
    @SerializedName("SplitRule")
    @Expose
    private String SplitRule;

    /**
     * Get <p>内容过滤配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContentFilter <p>内容过滤配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ContentFilter getContentFilter() {
        return this.ContentFilter;
    }

    /**
     * Set <p>内容过滤配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContentFilter <p>内容过滤配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContentFilter(ContentFilter ContentFilter) {
        this.ContentFilter = ContentFilter;
    }

    /**
     * Get <p>文档解析策略：1=OCR解析 2=智能解析 3=MLLM解析；不传默认智能解析<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>DOC_PARSE_STRATEGY_UNKNOWN</td><td>0</td><td>未指定，走服务端默认（智能解析）</td></tr><tr><td>DOC_PARSE_STRATEGY_OCR</td><td>1</td><td>OCR 解析</td></tr><tr><td>DOC_PARSE_STRATEGY_SMART</td><td>2</td><td>智能解析（按图片类型自动选择：数据图/思维导图/架构图/流程图用 MLLM，其他图片用 OCR）</td></tr><tr><td>DOC_PARSE_STRATEGY_MLLM</td><td>3</td><td>MLLM 解析</td></tr></tbody></table></p> 
     * @return ParseStrategy <p>文档解析策略：1=OCR解析 2=智能解析 3=MLLM解析；不传默认智能解析<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>DOC_PARSE_STRATEGY_UNKNOWN</td><td>0</td><td>未指定，走服务端默认（智能解析）</td></tr><tr><td>DOC_PARSE_STRATEGY_OCR</td><td>1</td><td>OCR 解析</td></tr><tr><td>DOC_PARSE_STRATEGY_SMART</td><td>2</td><td>智能解析（按图片类型自动选择：数据图/思维导图/架构图/流程图用 MLLM，其他图片用 OCR）</td></tr><tr><td>DOC_PARSE_STRATEGY_MLLM</td><td>3</td><td>MLLM 解析</td></tr></tbody></table></p>
     */
    public Long getParseStrategy() {
        return this.ParseStrategy;
    }

    /**
     * Set <p>文档解析策略：1=OCR解析 2=智能解析 3=MLLM解析；不传默认智能解析<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>DOC_PARSE_STRATEGY_UNKNOWN</td><td>0</td><td>未指定，走服务端默认（智能解析）</td></tr><tr><td>DOC_PARSE_STRATEGY_OCR</td><td>1</td><td>OCR 解析</td></tr><tr><td>DOC_PARSE_STRATEGY_SMART</td><td>2</td><td>智能解析（按图片类型自动选择：数据图/思维导图/架构图/流程图用 MLLM，其他图片用 OCR）</td></tr><tr><td>DOC_PARSE_STRATEGY_MLLM</td><td>3</td><td>MLLM 解析</td></tr></tbody></table></p>
     * @param ParseStrategy <p>文档解析策略：1=OCR解析 2=智能解析 3=MLLM解析；不传默认智能解析<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>DOC_PARSE_STRATEGY_UNKNOWN</td><td>0</td><td>未指定，走服务端默认（智能解析）</td></tr><tr><td>DOC_PARSE_STRATEGY_OCR</td><td>1</td><td>OCR 解析</td></tr><tr><td>DOC_PARSE_STRATEGY_SMART</td><td>2</td><td>智能解析（按图片类型自动选择：数据图/思维导图/架构图/流程图用 MLLM，其他图片用 OCR）</td></tr><tr><td>DOC_PARSE_STRATEGY_MLLM</td><td>3</td><td>MLLM 解析</td></tr></tbody></table></p>
     */
    public void setParseStrategy(Long ParseStrategy) {
        this.ParseStrategy = ParseStrategy;
    }

    /**
     * Get <p>分割规则</p> 
     * @return SplitRule <p>分割规则</p>
     */
    public String getSplitRule() {
        return this.SplitRule;
    }

    /**
     * Set <p>分割规则</p>
     * @param SplitRule <p>分割规则</p>
     */
    public void setSplitRule(String SplitRule) {
        this.SplitRule = SplitRule;
    }

    public DocParseConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocParseConfig(DocParseConfig source) {
        if (source.ContentFilter != null) {
            this.ContentFilter = new ContentFilter(source.ContentFilter);
        }
        if (source.ParseStrategy != null) {
            this.ParseStrategy = new Long(source.ParseStrategy);
        }
        if (source.SplitRule != null) {
            this.SplitRule = new String(source.SplitRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ContentFilter.", this.ContentFilter);
        this.setParamSimple(map, prefix + "ParseStrategy", this.ParseStrategy);
        this.setParamSimple(map, prefix + "SplitRule", this.SplitRule);

    }
}

