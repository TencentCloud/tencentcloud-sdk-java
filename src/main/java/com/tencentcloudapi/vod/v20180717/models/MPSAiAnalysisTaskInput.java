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

public class MPSAiAnalysisTaskInput extends AbstractModel {

    /**
    * <p>视频内容分析模板 ID。</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>扩展参数，其值为序列化的 json字符串。注意：此参数为定制需求参数，参考如下：<a href="https://cloud.tencent.com/document/product/862/101530">智能檫除</a><a href="https://cloud.tencent.com/document/product/862/112098">智能拆条</a><a href="https://cloud.tencent.com/document/product/862/107280">高光集锦</a><a href="https://cloud.tencent.com/document/product/862/112112">智能横转竖</a></p>
    */
    @SerializedName("ExtendedParameter")
    @Expose
    private String ExtendedParameter;

    /**
     * Get <p>视频内容分析模板 ID。</p> 
     * @return Definition <p>视频内容分析模板 ID。</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>视频内容分析模板 ID。</p>
     * @param Definition <p>视频内容分析模板 ID。</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>扩展参数，其值为序列化的 json字符串。注意：此参数为定制需求参数，参考如下：<a href="https://cloud.tencent.com/document/product/862/101530">智能檫除</a><a href="https://cloud.tencent.com/document/product/862/112098">智能拆条</a><a href="https://cloud.tencent.com/document/product/862/107280">高光集锦</a><a href="https://cloud.tencent.com/document/product/862/112112">智能横转竖</a></p> 
     * @return ExtendedParameter <p>扩展参数，其值为序列化的 json字符串。注意：此参数为定制需求参数，参考如下：<a href="https://cloud.tencent.com/document/product/862/101530">智能檫除</a><a href="https://cloud.tencent.com/document/product/862/112098">智能拆条</a><a href="https://cloud.tencent.com/document/product/862/107280">高光集锦</a><a href="https://cloud.tencent.com/document/product/862/112112">智能横转竖</a></p>
     */
    public String getExtendedParameter() {
        return this.ExtendedParameter;
    }

    /**
     * Set <p>扩展参数，其值为序列化的 json字符串。注意：此参数为定制需求参数，参考如下：<a href="https://cloud.tencent.com/document/product/862/101530">智能檫除</a><a href="https://cloud.tencent.com/document/product/862/112098">智能拆条</a><a href="https://cloud.tencent.com/document/product/862/107280">高光集锦</a><a href="https://cloud.tencent.com/document/product/862/112112">智能横转竖</a></p>
     * @param ExtendedParameter <p>扩展参数，其值为序列化的 json字符串。注意：此参数为定制需求参数，参考如下：<a href="https://cloud.tencent.com/document/product/862/101530">智能檫除</a><a href="https://cloud.tencent.com/document/product/862/112098">智能拆条</a><a href="https://cloud.tencent.com/document/product/862/107280">高光集锦</a><a href="https://cloud.tencent.com/document/product/862/112112">智能横转竖</a></p>
     */
    public void setExtendedParameter(String ExtendedParameter) {
        this.ExtendedParameter = ExtendedParameter;
    }

    public MPSAiAnalysisTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSAiAnalysisTaskInput(MPSAiAnalysisTaskInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.ExtendedParameter != null) {
            this.ExtendedParameter = new String(source.ExtendedParameter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "ExtendedParameter", this.ExtendedParameter);

    }
}

