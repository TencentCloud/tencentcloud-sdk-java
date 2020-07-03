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
package com.tencentcloudapi.tiia.v20190529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectDisgustResponse extends AbstractModel{

    /**
    * 对于图片中包含恶心内容的置信度，取值[0,1]，一般超过0.5则表明可能是恶心图片。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 与图像内容最相似的恶心内容的类别，包含腐烂、密集、畸形、血腥、蛇、虫子、牙齿等。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 对于图片中包含恶心内容的置信度，取值[0,1]，一般超过0.5则表明可能是恶心图片。 
     * @return Confidence 对于图片中包含恶心内容的置信度，取值[0,1]，一般超过0.5则表明可能是恶心图片。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 对于图片中包含恶心内容的置信度，取值[0,1]，一般超过0.5则表明可能是恶心图片。
     * @param Confidence 对于图片中包含恶心内容的置信度，取值[0,1]，一般超过0.5则表明可能是恶心图片。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 与图像内容最相似的恶心内容的类别，包含腐烂、密集、畸形、血腥、蛇、虫子、牙齿等。 
     * @return Type 与图像内容最相似的恶心内容的类别，包含腐烂、密集、畸形、血腥、蛇、虫子、牙齿等。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 与图像内容最相似的恶心内容的类别，包含腐烂、密集、畸形、血腥、蛇、虫子、牙齿等。
     * @param Type 与图像内容最相似的恶心内容的类别，包含腐烂、密集、畸形、血腥、蛇、虫子、牙齿等。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

