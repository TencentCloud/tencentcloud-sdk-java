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

public class SmartSubtitleTaskResultInput extends AbstractModel {

    /**
    * <p>智能字幕模板 ID。</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>智能字幕自定义参数，当 Definition 填 0 时有效。<br>该参数用于高度定制场景，建议您优先使用 Definition 指定智能字幕参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RawParameter")
    @Expose
    private RawSmartSubtitleParameter RawParameter;

    /**
    * <p>扩展参数。</p>
    */
    @SerializedName("UserExtPara")
    @Expose
    private String UserExtPara;

    /**
     * Get <p>智能字幕模板 ID。</p> 
     * @return Definition <p>智能字幕模板 ID。</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>智能字幕模板 ID。</p>
     * @param Definition <p>智能字幕模板 ID。</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>智能字幕自定义参数，当 Definition 填 0 时有效。<br>该参数用于高度定制场景，建议您优先使用 Definition 指定智能字幕参数。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RawParameter <p>智能字幕自定义参数，当 Definition 填 0 时有效。<br>该参数用于高度定制场景，建议您优先使用 Definition 指定智能字幕参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RawSmartSubtitleParameter getRawParameter() {
        return this.RawParameter;
    }

    /**
     * Set <p>智能字幕自定义参数，当 Definition 填 0 时有效。<br>该参数用于高度定制场景，建议您优先使用 Definition 指定智能字幕参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RawParameter <p>智能字幕自定义参数，当 Definition 填 0 时有效。<br>该参数用于高度定制场景，建议您优先使用 Definition 指定智能字幕参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRawParameter(RawSmartSubtitleParameter RawParameter) {
        this.RawParameter = RawParameter;
    }

    /**
     * Get <p>扩展参数。</p> 
     * @return UserExtPara <p>扩展参数。</p>
     */
    public String getUserExtPara() {
        return this.UserExtPara;
    }

    /**
     * Set <p>扩展参数。</p>
     * @param UserExtPara <p>扩展参数。</p>
     */
    public void setUserExtPara(String UserExtPara) {
        this.UserExtPara = UserExtPara;
    }

    public SmartSubtitleTaskResultInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartSubtitleTaskResultInput(SmartSubtitleTaskResultInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.RawParameter != null) {
            this.RawParameter = new RawSmartSubtitleParameter(source.RawParameter);
        }
        if (source.UserExtPara != null) {
            this.UserExtPara = new String(source.UserExtPara);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamObj(map, prefix + "RawParameter.", this.RawParameter);
        this.setParamSimple(map, prefix + "UserExtPara", this.UserExtPara);

    }
}

