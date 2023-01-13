/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiAnalysisTaskInput extends AbstractModel{

    /**
    * 视频内容分析模板 ID。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 扩展参数，其值为序列化的 json字符串。
注意：此参数为定制需求参数，需要线下对接。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtendedParameter")
    @Expose
    private String ExtendedParameter;

    /**
     * Get 视频内容分析模板 ID。 
     * @return Definition 视频内容分析模板 ID。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 视频内容分析模板 ID。
     * @param Definition 视频内容分析模板 ID。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 扩展参数，其值为序列化的 json字符串。
注意：此参数为定制需求参数，需要线下对接。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtendedParameter 扩展参数，其值为序列化的 json字符串。
注意：此参数为定制需求参数，需要线下对接。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtendedParameter() {
        return this.ExtendedParameter;
    }

    /**
     * Set 扩展参数，其值为序列化的 json字符串。
注意：此参数为定制需求参数，需要线下对接。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtendedParameter 扩展参数，其值为序列化的 json字符串。
注意：此参数为定制需求参数，需要线下对接。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtendedParameter(String ExtendedParameter) {
        this.ExtendedParameter = ExtendedParameter;
    }

    public AiAnalysisTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskInput(AiAnalysisTaskInput source) {
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

