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

public class AiAnalysisTaskTagInput extends AbstractModel {

    /**
    * <p>视频智能标签模板 ID。</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>扩展参数。</p>
    */
    @SerializedName("ExtendedParameter")
    @Expose
    private String ExtendedParameter;

    /**
     * Get <p>视频智能标签模板 ID。</p> 
     * @return Definition <p>视频智能标签模板 ID。</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>视频智能标签模板 ID。</p>
     * @param Definition <p>视频智能标签模板 ID。</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>扩展参数。</p> 
     * @return ExtendedParameter <p>扩展参数。</p>
     */
    public String getExtendedParameter() {
        return this.ExtendedParameter;
    }

    /**
     * Set <p>扩展参数。</p>
     * @param ExtendedParameter <p>扩展参数。</p>
     */
    public void setExtendedParameter(String ExtendedParameter) {
        this.ExtendedParameter = ExtendedParameter;
    }

    public AiAnalysisTaskTagInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskTagInput(AiAnalysisTaskTagInput source) {
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

