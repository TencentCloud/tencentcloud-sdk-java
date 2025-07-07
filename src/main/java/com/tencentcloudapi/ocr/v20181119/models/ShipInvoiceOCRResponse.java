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

public class ShipInvoiceOCRResponse extends AbstractModel {

    /**
    * 轮船票识别结果，具体内容请点击左侧链接。
    */
    @SerializedName("ShipInvoiceInfos")
    @Expose
    private ShipInvoiceInfo [] ShipInvoiceInfos;

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
     * Get 轮船票识别结果，具体内容请点击左侧链接。 
     * @return ShipInvoiceInfos 轮船票识别结果，具体内容请点击左侧链接。
     */
    public ShipInvoiceInfo [] getShipInvoiceInfos() {
        return this.ShipInvoiceInfos;
    }

    /**
     * Set 轮船票识别结果，具体内容请点击左侧链接。
     * @param ShipInvoiceInfos 轮船票识别结果，具体内容请点击左侧链接。
     */
    public void setShipInvoiceInfos(ShipInvoiceInfo [] ShipInvoiceInfos) {
        this.ShipInvoiceInfos = ShipInvoiceInfos;
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

    public ShipInvoiceOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShipInvoiceOCRResponse(ShipInvoiceOCRResponse source) {
        if (source.ShipInvoiceInfos != null) {
            this.ShipInvoiceInfos = new ShipInvoiceInfo[source.ShipInvoiceInfos.length];
            for (int i = 0; i < source.ShipInvoiceInfos.length; i++) {
                this.ShipInvoiceInfos[i] = new ShipInvoiceInfo(source.ShipInvoiceInfos[i]);
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
        this.setParamArrayObj(map, prefix + "ShipInvoiceInfos.", this.ShipInvoiceInfos);
        this.setParamSimple(map, prefix + "Angle", this.Angle);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

