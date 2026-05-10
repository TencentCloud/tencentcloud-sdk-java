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

public class MPSSmartEraseTaskInput extends AbstractModel {

    /**
    * <p>智能擦除模板id。</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>智能擦除自定义参数，当 Definition 填 0 时有效。 该参数用于高度定制场景，建议您优先使用 Definition 指定智能擦除参数。</p>
    */
    @SerializedName("RawParameter")
    @Expose
    private MPSRawSmartEraseParameter RawParameter;

    /**
    * <p>智能擦除自定义参数，当 Definition 不填 0 时有效。 当填写了该结构中的部分擦除参数时，将使用填写的参数覆盖智能擦除模板中的参数。 该参数用于高度定制场景，建议您仅使用 Definition 指定智能擦除参数。</p>
    */
    @SerializedName("OverrideParameter")
    @Expose
    private MPSOverrideEraseParameter OverrideParameter;

    /**
     * Get <p>智能擦除模板id。</p> 
     * @return Definition <p>智能擦除模板id。</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>智能擦除模板id。</p>
     * @param Definition <p>智能擦除模板id。</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>智能擦除自定义参数，当 Definition 填 0 时有效。 该参数用于高度定制场景，建议您优先使用 Definition 指定智能擦除参数。</p> 
     * @return RawParameter <p>智能擦除自定义参数，当 Definition 填 0 时有效。 该参数用于高度定制场景，建议您优先使用 Definition 指定智能擦除参数。</p>
     */
    public MPSRawSmartEraseParameter getRawParameter() {
        return this.RawParameter;
    }

    /**
     * Set <p>智能擦除自定义参数，当 Definition 填 0 时有效。 该参数用于高度定制场景，建议您优先使用 Definition 指定智能擦除参数。</p>
     * @param RawParameter <p>智能擦除自定义参数，当 Definition 填 0 时有效。 该参数用于高度定制场景，建议您优先使用 Definition 指定智能擦除参数。</p>
     */
    public void setRawParameter(MPSRawSmartEraseParameter RawParameter) {
        this.RawParameter = RawParameter;
    }

    /**
     * Get <p>智能擦除自定义参数，当 Definition 不填 0 时有效。 当填写了该结构中的部分擦除参数时，将使用填写的参数覆盖智能擦除模板中的参数。 该参数用于高度定制场景，建议您仅使用 Definition 指定智能擦除参数。</p> 
     * @return OverrideParameter <p>智能擦除自定义参数，当 Definition 不填 0 时有效。 当填写了该结构中的部分擦除参数时，将使用填写的参数覆盖智能擦除模板中的参数。 该参数用于高度定制场景，建议您仅使用 Definition 指定智能擦除参数。</p>
     */
    public MPSOverrideEraseParameter getOverrideParameter() {
        return this.OverrideParameter;
    }

    /**
     * Set <p>智能擦除自定义参数，当 Definition 不填 0 时有效。 当填写了该结构中的部分擦除参数时，将使用填写的参数覆盖智能擦除模板中的参数。 该参数用于高度定制场景，建议您仅使用 Definition 指定智能擦除参数。</p>
     * @param OverrideParameter <p>智能擦除自定义参数，当 Definition 不填 0 时有效。 当填写了该结构中的部分擦除参数时，将使用填写的参数覆盖智能擦除模板中的参数。 该参数用于高度定制场景，建议您仅使用 Definition 指定智能擦除参数。</p>
     */
    public void setOverrideParameter(MPSOverrideEraseParameter OverrideParameter) {
        this.OverrideParameter = OverrideParameter;
    }

    public MPSSmartEraseTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSSmartEraseTaskInput(MPSSmartEraseTaskInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.RawParameter != null) {
            this.RawParameter = new MPSRawSmartEraseParameter(source.RawParameter);
        }
        if (source.OverrideParameter != null) {
            this.OverrideParameter = new MPSOverrideEraseParameter(source.OverrideParameter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamObj(map, prefix + "RawParameter.", this.RawParameter);
        this.setParamObj(map, prefix + "OverrideParameter.", this.OverrideParameter);

    }
}

