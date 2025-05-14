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
        this.setParamSimple(map, prefix + "Angle", this.Angle);
        this.setParamArrayObj(map, prefix + "TransDetails.", this.TransDetails);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

