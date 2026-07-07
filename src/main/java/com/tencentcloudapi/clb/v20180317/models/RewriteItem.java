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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RewriteItem extends AbstractModel {

    /**
    * <p>源模型名（重写规则的 key）。</p><p>特殊值 <code>default</code> 表示兜底规则（命中所有未显式列出的源模型）。</p>
    */
    @SerializedName("SourceModel")
    @Expose
    private String SourceModel;

    /**
    * <p>目标模型名（重写规则的 value）。</p>
    */
    @SerializedName("TargetModel")
    @Expose
    private String TargetModel;

    /**
     * Get <p>源模型名（重写规则的 key）。</p><p>特殊值 <code>default</code> 表示兜底规则（命中所有未显式列出的源模型）。</p> 
     * @return SourceModel <p>源模型名（重写规则的 key）。</p><p>特殊值 <code>default</code> 表示兜底规则（命中所有未显式列出的源模型）。</p>
     */
    public String getSourceModel() {
        return this.SourceModel;
    }

    /**
     * Set <p>源模型名（重写规则的 key）。</p><p>特殊值 <code>default</code> 表示兜底规则（命中所有未显式列出的源模型）。</p>
     * @param SourceModel <p>源模型名（重写规则的 key）。</p><p>特殊值 <code>default</code> 表示兜底规则（命中所有未显式列出的源模型）。</p>
     */
    public void setSourceModel(String SourceModel) {
        this.SourceModel = SourceModel;
    }

    /**
     * Get <p>目标模型名（重写规则的 value）。</p> 
     * @return TargetModel <p>目标模型名（重写规则的 value）。</p>
     */
    public String getTargetModel() {
        return this.TargetModel;
    }

    /**
     * Set <p>目标模型名（重写规则的 value）。</p>
     * @param TargetModel <p>目标模型名（重写规则的 value）。</p>
     */
    public void setTargetModel(String TargetModel) {
        this.TargetModel = TargetModel;
    }

    public RewriteItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RewriteItem(RewriteItem source) {
        if (source.SourceModel != null) {
            this.SourceModel = new String(source.SourceModel);
        }
        if (source.TargetModel != null) {
            this.TargetModel = new String(source.TargetModel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceModel", this.SourceModel);
        this.setParamSimple(map, prefix + "TargetModel", this.TargetModel);

    }
}

