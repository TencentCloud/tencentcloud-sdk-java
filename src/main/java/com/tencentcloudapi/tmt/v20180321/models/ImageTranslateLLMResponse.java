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
package com.tencentcloudapi.tmt.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageTranslateLLMResponse extends AbstractModel {

    /**
    * <p>图片数据的Base64字符串，输出格式为JPG。</p>
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * <p>原文本主要源语言。</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>目标翻译语言。</p>
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * <p>图片中的全部原文本。</p>
    */
    @SerializedName("SourceText")
    @Expose
    private String SourceText;

    /**
    * <p>图片中全部译文。</p>
    */
    @SerializedName("TargetText")
    @Expose
    private String TargetText;

    /**
    * <p>逆时针图片角度，取值范围为0-359</p>
    */
    @SerializedName("Angle")
    @Expose
    private Float Angle;

    /**
    * <p>翻译详情信息</p>
    */
    @SerializedName("TransDetails")
    @Expose
    private TransDetail [] TransDetails;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>图片数据的Base64字符串，输出格式为JPG。</p> 
     * @return Data <p>图片数据的Base64字符串，输出格式为JPG。</p>
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set <p>图片数据的Base64字符串，输出格式为JPG。</p>
     * @param Data <p>图片数据的Base64字符串，输出格式为JPG。</p>
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * Get <p>原文本主要源语言。</p> 
     * @return Source <p>原文本主要源语言。</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>原文本主要源语言。</p>
     * @param Source <p>原文本主要源语言。</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>目标翻译语言。</p> 
     * @return Target <p>目标翻译语言。</p>
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set <p>目标翻译语言。</p>
     * @param Target <p>目标翻译语言。</p>
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get <p>图片中的全部原文本。</p> 
     * @return SourceText <p>图片中的全部原文本。</p>
     */
    public String getSourceText() {
        return this.SourceText;
    }

    /**
     * Set <p>图片中的全部原文本。</p>
     * @param SourceText <p>图片中的全部原文本。</p>
     */
    public void setSourceText(String SourceText) {
        this.SourceText = SourceText;
    }

    /**
     * Get <p>图片中全部译文。</p> 
     * @return TargetText <p>图片中全部译文。</p>
     */
    public String getTargetText() {
        return this.TargetText;
    }

    /**
     * Set <p>图片中全部译文。</p>
     * @param TargetText <p>图片中全部译文。</p>
     */
    public void setTargetText(String TargetText) {
        this.TargetText = TargetText;
    }

    /**
     * Get <p>逆时针图片角度，取值范围为0-359</p> 
     * @return Angle <p>逆时针图片角度，取值范围为0-359</p>
     */
    public Float getAngle() {
        return this.Angle;
    }

    /**
     * Set <p>逆时针图片角度，取值范围为0-359</p>
     * @param Angle <p>逆时针图片角度，取值范围为0-359</p>
     */
    public void setAngle(Float Angle) {
        this.Angle = Angle;
    }

    /**
     * Get <p>翻译详情信息</p> 
     * @return TransDetails <p>翻译详情信息</p>
     */
    public TransDetail [] getTransDetails() {
        return this.TransDetails;
    }

    /**
     * Set <p>翻译详情信息</p>
     * @param TransDetails <p>翻译详情信息</p>
     */
    public void setTransDetails(TransDetail [] TransDetails) {
        this.TransDetails = TransDetails;
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

    public ImageTranslateLLMResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageTranslateLLMResponse(ImageTranslateLLMResponse source) {
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.SourceText != null) {
            this.SourceText = new String(source.SourceText);
        }
        if (source.TargetText != null) {
            this.TargetText = new String(source.TargetText);
        }
        if (source.Angle != null) {
            this.Angle = new Float(source.Angle);
        }
        if (source.TransDetails != null) {
            this.TransDetails = new TransDetail[source.TransDetails.length];
            for (int i = 0; i < source.TransDetails.length; i++) {
                this.TransDetails[i] = new TransDetail(source.TransDetails[i]);
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
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "SourceText", this.SourceText);
        this.setParamSimple(map, prefix + "TargetText", this.TargetText);
        this.setParamSimple(map, prefix + "Angle", this.Angle);
        this.setParamArrayObj(map, prefix + "TransDetails.", this.TransDetails);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

