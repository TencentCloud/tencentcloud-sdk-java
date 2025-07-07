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

public class VatRollInvoiceOCRResponse extends AbstractModel {

    /**
    * 增值税发票（卷票）识别结果，具体内容请点击左侧链接。
    */
    @SerializedName("VatRollInvoiceInfos")
    @Expose
    private VatRollInvoiceInfo [] VatRollInvoiceInfos;

    /**
    * 图片旋转角度（角度制），文本的水平方向为0°，顺时针为正，逆时针为负。
    */
    @SerializedName("Angle")
    @Expose
    private Float Angle;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 增值税发票（卷票）识别结果，具体内容请点击左侧链接。 
     * @return VatRollInvoiceInfos 增值税发票（卷票）识别结果，具体内容请点击左侧链接。
     */
    public VatRollInvoiceInfo [] getVatRollInvoiceInfos() {
        return this.VatRollInvoiceInfos;
    }

    /**
     * Set 增值税发票（卷票）识别结果，具体内容请点击左侧链接。
     * @param VatRollInvoiceInfos 增值税发票（卷票）识别结果，具体内容请点击左侧链接。
     */
    public void setVatRollInvoiceInfos(VatRollInvoiceInfo [] VatRollInvoiceInfos) {
        this.VatRollInvoiceInfos = VatRollInvoiceInfos;
    }

    /**
     * Get 图片旋转角度（角度制），文本的水平方向为0°，顺时针为正，逆时针为负。 
     * @return Angle 图片旋转角度（角度制），文本的水平方向为0°，顺时针为正，逆时针为负。
     */
    public Float getAngle() {
        return this.Angle;
    }

    /**
     * Set 图片旋转角度（角度制），文本的水平方向为0°，顺时针为正，逆时针为负。
     * @param Angle 图片旋转角度（角度制），文本的水平方向为0°，顺时针为正，逆时针为负。
     */
    public void setAngle(Float Angle) {
        this.Angle = Angle;
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

    public VatRollInvoiceOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VatRollInvoiceOCRResponse(VatRollInvoiceOCRResponse source) {
        if (source.VatRollInvoiceInfos != null) {
            this.VatRollInvoiceInfos = new VatRollInvoiceInfo[source.VatRollInvoiceInfos.length];
            for (int i = 0; i < source.VatRollInvoiceInfos.length; i++) {
                this.VatRollInvoiceInfos[i] = new VatRollInvoiceInfo(source.VatRollInvoiceInfos[i]);
            }
        }
        if (source.Angle != null) {
            this.Angle = new Float(source.Angle);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "VatRollInvoiceInfos.", this.VatRollInvoiceInfos);
        this.setParamSimple(map, prefix + "Angle", this.Angle);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

