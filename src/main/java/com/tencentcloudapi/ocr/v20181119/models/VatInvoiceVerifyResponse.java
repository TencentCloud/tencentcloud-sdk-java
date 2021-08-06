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

public class VatInvoiceVerifyResponse extends AbstractModel{

    /**
    * 增值税发票信息，详情请点击左侧链接。
    */
    @SerializedName("Invoice")
    @Expose
    private VatInvoice Invoice;

    /**
    * 机动车销售统一发票信息
    */
    @SerializedName("VehicleInvoiceInfo")
    @Expose
    private VehicleInvoiceInfo VehicleInvoiceInfo;

    /**
    * 二手车销售统一发票信息
    */
    @SerializedName("UsedVehicleInvoiceInfo")
    @Expose
    private UsedVehicleInvoiceInfo UsedVehicleInvoiceInfo;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 增值税发票信息，详情请点击左侧链接。 
     * @return Invoice 增值税发票信息，详情请点击左侧链接。
     */
    public VatInvoice getInvoice() {
        return this.Invoice;
    }

    /**
     * Set 增值税发票信息，详情请点击左侧链接。
     * @param Invoice 增值税发票信息，详情请点击左侧链接。
     */
    public void setInvoice(VatInvoice Invoice) {
        this.Invoice = Invoice;
    }

    /**
     * Get 机动车销售统一发票信息 
     * @return VehicleInvoiceInfo 机动车销售统一发票信息
     */
    public VehicleInvoiceInfo getVehicleInvoiceInfo() {
        return this.VehicleInvoiceInfo;
    }

    /**
     * Set 机动车销售统一发票信息
     * @param VehicleInvoiceInfo 机动车销售统一发票信息
     */
    public void setVehicleInvoiceInfo(VehicleInvoiceInfo VehicleInvoiceInfo) {
        this.VehicleInvoiceInfo = VehicleInvoiceInfo;
    }

    /**
     * Get 二手车销售统一发票信息 
     * @return UsedVehicleInvoiceInfo 二手车销售统一发票信息
     */
    public UsedVehicleInvoiceInfo getUsedVehicleInvoiceInfo() {
        return this.UsedVehicleInvoiceInfo;
    }

    /**
     * Set 二手车销售统一发票信息
     * @param UsedVehicleInvoiceInfo 二手车销售统一发票信息
     */
    public void setUsedVehicleInvoiceInfo(UsedVehicleInvoiceInfo UsedVehicleInvoiceInfo) {
        this.UsedVehicleInvoiceInfo = UsedVehicleInvoiceInfo;
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

    public VatInvoiceVerifyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VatInvoiceVerifyResponse(VatInvoiceVerifyResponse source) {
        if (source.Invoice != null) {
            this.Invoice = new VatInvoice(source.Invoice);
        }
        if (source.VehicleInvoiceInfo != null) {
            this.VehicleInvoiceInfo = new VehicleInvoiceInfo(source.VehicleInvoiceInfo);
        }
        if (source.UsedVehicleInvoiceInfo != null) {
            this.UsedVehicleInvoiceInfo = new UsedVehicleInvoiceInfo(source.UsedVehicleInvoiceInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Invoice.", this.Invoice);
        this.setParamObj(map, prefix + "VehicleInvoiceInfo.", this.VehicleInvoiceInfo);
        this.setParamObj(map, prefix + "UsedVehicleInvoiceInfo.", this.UsedVehicleInvoiceInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

