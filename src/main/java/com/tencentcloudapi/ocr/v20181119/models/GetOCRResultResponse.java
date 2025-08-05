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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetOCRResultResponse extends AbstractModel {

    /**
    * ocr业务类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * ocr结果
    */
    @SerializedName("OCRResult")
    @Expose
    private OCRResult OCRResult;

    /**
    * requestid 信息
    */
    @SerializedName("RequestIdInfos")
    @Expose
    private RequestIdInfo [] RequestIdInfos;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get ocr业务类型 
     * @return Type ocr业务类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set ocr业务类型
     * @param Type ocr业务类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get ocr结果 
     * @return OCRResult ocr结果
     */
    public OCRResult getOCRResult() {
        return this.OCRResult;
    }

    /**
     * Set ocr结果
     * @param OCRResult ocr结果
     */
    public void setOCRResult(OCRResult OCRResult) {
        this.OCRResult = OCRResult;
    }

    /**
     * Get requestid 信息 
     * @return RequestIdInfos requestid 信息
     */
    public RequestIdInfo [] getRequestIdInfos() {
        return this.RequestIdInfos;
    }

    /**
     * Set requestid 信息
     * @param RequestIdInfos requestid 信息
     */
    public void setRequestIdInfos(RequestIdInfo [] RequestIdInfos) {
        this.RequestIdInfos = RequestIdInfos;
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

    public GetOCRResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetOCRResultResponse(GetOCRResultResponse source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.OCRResult != null) {
            this.OCRResult = new OCRResult(source.OCRResult);
        }
        if (source.RequestIdInfos != null) {
            this.RequestIdInfos = new RequestIdInfo[source.RequestIdInfos.length];
            for (int i = 0; i < source.RequestIdInfos.length; i++) {
                this.RequestIdInfos[i] = new RequestIdInfo(source.RequestIdInfos[i]);
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
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "OCRResult.", this.OCRResult);
        this.setParamArrayObj(map, prefix + "RequestIdInfos.", this.RequestIdInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

