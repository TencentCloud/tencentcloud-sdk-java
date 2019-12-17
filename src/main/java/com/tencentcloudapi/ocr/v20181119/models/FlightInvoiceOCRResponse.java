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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlightInvoiceOCRResponse extends AbstractModel{

    /**
    * 机票行程单识别结果，具体内容请点击左侧链接。
    */
    @SerializedName("FlightInvoiceInfos")
    @Expose
    private FlightInvoiceInfo [] FlightInvoiceInfos;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 机票行程单识别结果，具体内容请点击左侧链接。 
     * @return FlightInvoiceInfos 机票行程单识别结果，具体内容请点击左侧链接。
     */
    public FlightInvoiceInfo [] getFlightInvoiceInfos() {
        return this.FlightInvoiceInfos;
    }

    /**
     * Set 机票行程单识别结果，具体内容请点击左侧链接。
     * @param FlightInvoiceInfos 机票行程单识别结果，具体内容请点击左侧链接。
     */
    public void setFlightInvoiceInfos(FlightInvoiceInfo [] FlightInvoiceInfos) {
        this.FlightInvoiceInfos = FlightInvoiceInfos;
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
        this.setParamArrayObj(map, prefix + "FlightInvoiceInfos.", this.FlightInvoiceInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

