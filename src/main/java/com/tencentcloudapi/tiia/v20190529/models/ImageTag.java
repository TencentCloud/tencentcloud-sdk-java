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

public class ImageTag extends AbstractModel {

    /**
    * 标签内容。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 置信度范围在0-100之间。值越高，表示目标为相应结果的可能性越高。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
     * Get 标签内容。 
     * @return Name 标签内容。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 标签内容。
     * @param Name 标签内容。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 置信度范围在0-100之间。值越高，表示目标为相应结果的可能性越高。 
     * @return Confidence 置信度范围在0-100之间。值越高，表示目标为相应结果的可能性越高。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 置信度范围在0-100之间。值越高，表示目标为相应结果的可能性越高。
     * @param Confidence 置信度范围在0-100之间。值越高，表示目标为相应结果的可能性越高。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    public ImageTag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageTag(ImageTag source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);

    }
}

