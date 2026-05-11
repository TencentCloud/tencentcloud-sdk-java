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

public class DetectVideoSubtitleAreaResponse extends AbstractModel {

    /**
    * <p>视频宽度</p><p>单位：px</p>
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * <p>视频高度</p><p>单位：px</p>
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * <p>识别到的字幕框，识别不到结果为空</p>
    */
    @SerializedName("Result")
    @Expose
    private SubtitleArea [] Result;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>视频宽度</p><p>单位：px</p> 
     * @return Width <p>视频宽度</p><p>单位：px</p>
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set <p>视频宽度</p><p>单位：px</p>
     * @param Width <p>视频宽度</p><p>单位：px</p>
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get <p>视频高度</p><p>单位：px</p> 
     * @return Height <p>视频高度</p><p>单位：px</p>
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set <p>视频高度</p><p>单位：px</p>
     * @param Height <p>视频高度</p><p>单位：px</p>
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get <p>识别到的字幕框，识别不到结果为空</p> 
     * @return Result <p>识别到的字幕框，识别不到结果为空</p>
     */
    public SubtitleArea [] getResult() {
        return this.Result;
    }

    /**
     * Set <p>识别到的字幕框，识别不到结果为空</p>
     * @param Result <p>识别到的字幕框，识别不到结果为空</p>
     */
    public void setResult(SubtitleArea [] Result) {
        this.Result = Result;
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

    public DetectVideoSubtitleAreaResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectVideoSubtitleAreaResponse(DetectVideoSubtitleAreaResponse source) {
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Result != null) {
            this.Result = new SubtitleArea[source.Result.length];
            for (int i = 0; i < source.Result.length; i++) {
                this.Result[i] = new SubtitleArea(source.Result[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamArrayObj(map, prefix + "Result.", this.Result);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

