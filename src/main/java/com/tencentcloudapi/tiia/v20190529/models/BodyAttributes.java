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
package com.tencentcloudapi.tiia.v20190529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BodyAttributes extends AbstractModel {

    /**
    * 属性值。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 置信度，取值0-1之间。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 属性名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 属性值。 
     * @return Label 属性值。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 属性值。
     * @param Label 属性值。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 置信度，取值0-1之间。 
     * @return Confidence 置信度，取值0-1之间。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 置信度，取值0-1之间。
     * @param Confidence 置信度，取值0-1之间。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 属性名称。 
     * @return Name 属性名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 属性名称。
     * @param Name 属性名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public BodyAttributes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BodyAttributes(BodyAttributes source) {
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

