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
package com.tencentcloudapi.tmt.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageTranslateLLMResponse extends AbstractModel {

    /**
    * 图片数据的Base64字符串，输出格式为JPG。

    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * 原文本主要源语言。
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 目标翻译语言。
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * 图片中的全部原文本。
    */
    @SerializedName("SourceText")
    @Expose
    private String SourceText;

    /**
    * 图片中全部译文。
    */
    @SerializedName("TargetText")
    @Expose
    private String TargetText;

    /**
    * 逆时针图片角度，取值范围为0-359
    */
    @SerializedName("Angle")
    @Expose
    private Float Angle;

    /**
    * 翻译详情信息
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
     * Get 图片数据的Base64字符串，输出格式为JPG。
 
     * @return Data 图片数据的Base64字符串，输出格式为JPG。

     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set 图片数据的Base64字符串，输出格式为JPG。

     * @param Data 图片数据的Base64字符串，输出格式为JPG。

     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * Get 原文本主要源语言。 
     * @return Source 原文本主要源语言。
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 原文本主要源语言。
     * @param Source 原文本主要源语言。
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 目标翻译语言。 
     * @return Target 目标翻译语言。
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 目标翻译语言。
     * @param Target 目标翻译语言。
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get 图片中的全部原文本。 
     * @return SourceText 图片中的全部原文本。
     */
    public String getSourceText() {
        return this.SourceText;
    }

    /**
     * Set 图片中的全部原文本。
     * @param SourceText 图片中的全部原文本。
     */
    public void setSourceText(String SourceText) {
        this.SourceText = SourceText;
    }

    /**
     * Get 图片中全部译文。 
     * @return TargetText 图片中全部译文。
     */
    public String getTargetText() {
        return this.TargetText;
    }

    /**
     * Set 图片中全部译文。
     * @param TargetText 图片中全部译文。
     */
    public void setTargetText(String TargetText) {
        this.TargetText = TargetText;
    }

    /**
     * Get 逆时针图片角度，取值范围为0-359 
     * @return Angle 逆时针图片角度，取值范围为0-359
     */
    public Float getAngle() {
        return this.Angle;
    }

    /**
     * Set 逆时针图片角度，取值范围为0-359
     * @param Angle 逆时针图片角度，取值范围为0-359
     */
    public void setAngle(Float Angle) {
        this.Angle = Angle;
    }

    /**
     * Get 翻译详情信息 
     * @return TransDetails 翻译详情信息
     */
    public TransDetail [] getTransDetails() {
        return this.TransDetails;
    }

    /**
     * Set 翻译详情信息
     * @param TransDetails 翻译详情信息
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

