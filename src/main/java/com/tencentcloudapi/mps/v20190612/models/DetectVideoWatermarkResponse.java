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

public class DetectVideoWatermarkResponse extends AbstractModel {

    /**
    * <p>是否存在水印的置信度</p><p>取值范围：[0, 100]</p>
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * <p>视频中是否存在水印</p>
    */
    @SerializedName("HasWatermark")
    @Expose
    private Boolean HasWatermark;

    /**
    * <p>关于水印的一些描述性说明</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>是否存在水印的置信度</p><p>取值范围：[0, 100]</p> 
     * @return Confidence <p>是否存在水印的置信度</p><p>取值范围：[0, 100]</p>
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set <p>是否存在水印的置信度</p><p>取值范围：[0, 100]</p>
     * @param Confidence <p>是否存在水印的置信度</p><p>取值范围：[0, 100]</p>
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get <p>视频中是否存在水印</p> 
     * @return HasWatermark <p>视频中是否存在水印</p>
     */
    public Boolean getHasWatermark() {
        return this.HasWatermark;
    }

    /**
     * Set <p>视频中是否存在水印</p>
     * @param HasWatermark <p>视频中是否存在水印</p>
     */
    public void setHasWatermark(Boolean HasWatermark) {
        this.HasWatermark = HasWatermark;
    }

    /**
     * Get <p>关于水印的一些描述性说明</p> 
     * @return Description <p>关于水印的一些描述性说明</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>关于水印的一些描述性说明</p>
     * @param Description <p>关于水印的一些描述性说明</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DetectVideoWatermarkResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectVideoWatermarkResponse(DetectVideoWatermarkResponse source) {
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.HasWatermark != null) {
            this.HasWatermark = new Boolean(source.HasWatermark);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "HasWatermark", this.HasWatermark);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

