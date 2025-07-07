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

public class CarInvoiceOCRResponse extends AbstractModel {

    /**
    * 购车发票识别结果，具体内容请点击左侧链接。
    */
    @SerializedName("CarInvoiceInfos")
    @Expose
    private CarInvoiceInfo [] CarInvoiceInfos;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 购车发票识别结果，具体内容请点击左侧链接。 
     * @return CarInvoiceInfos 购车发票识别结果，具体内容请点击左侧链接。
     */
    public CarInvoiceInfo [] getCarInvoiceInfos() {
        return this.CarInvoiceInfos;
    }

    /**
     * Set 购车发票识别结果，具体内容请点击左侧链接。
     * @param CarInvoiceInfos 购车发票识别结果，具体内容请点击左侧链接。
     */
    public void setCarInvoiceInfos(CarInvoiceInfo [] CarInvoiceInfos) {
        this.CarInvoiceInfos = CarInvoiceInfos;
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

    public CarInvoiceOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CarInvoiceOCRResponse(CarInvoiceOCRResponse source) {
        if (source.CarInvoiceInfos != null) {
            this.CarInvoiceInfos = new CarInvoiceInfo[source.CarInvoiceInfos.length];
            for (int i = 0; i < source.CarInvoiceInfos.length; i++) {
                this.CarInvoiceInfos[i] = new CarInvoiceInfo(source.CarInvoiceInfos[i]);
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
        this.setParamArrayObj(map, prefix + "CarInvoiceInfos.", this.CarInvoiceInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

