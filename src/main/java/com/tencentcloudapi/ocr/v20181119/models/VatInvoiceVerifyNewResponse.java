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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VatInvoiceVerifyNewResponse extends AbstractModel {

    /**
    * 增值税发票、购车发票、全电发票的基础要素字段信息。
    */
    @SerializedName("Invoice")
    @Expose
    private VatInvoice Invoice;

    /**
    * 机动车销售统一发票详细字段信息。
    */
    @SerializedName("VehicleInvoiceInfo")
    @Expose
    private VehicleInvoiceInfo VehicleInvoiceInfo;

    /**
    * 二手车销售统一发票详细字段信息。
    */
    @SerializedName("UsedVehicleInvoiceInfo")
    @Expose
    private UsedVehicleInvoiceInfo UsedVehicleInvoiceInfo;

    /**
    * 通行费发票详细字段信息。
    */
    @SerializedName("PassInvoiceInfoList")
    @Expose
    private PassInvoiceInfo [] PassInvoiceInfoList;

    /**
    * 全电发票（铁路电子客票）详细字段信息。

    */
    @SerializedName("ElectronicTrainTicket")
    @Expose
    private ElectronicTrainTicket ElectronicTrainTicket;

    /**
    * 全电发票（航空运输电子客票行程单）详细字段信息。
    */
    @SerializedName("ElectronicAirTransport")
    @Expose
    private ElectronicAirTransport ElectronicAirTransport;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 增值税发票、购车发票、全电发票的基础要素字段信息。 
     * @return Invoice 增值税发票、购车发票、全电发票的基础要素字段信息。
     */
    public VatInvoice getInvoice() {
        return this.Invoice;
    }

    /**
     * Set 增值税发票、购车发票、全电发票的基础要素字段信息。
     * @param Invoice 增值税发票、购车发票、全电发票的基础要素字段信息。
     */
    public void setInvoice(VatInvoice Invoice) {
        this.Invoice = Invoice;
    }

    /**
     * Get 机动车销售统一发票详细字段信息。 
     * @return VehicleInvoiceInfo 机动车销售统一发票详细字段信息。
     */
    public VehicleInvoiceInfo getVehicleInvoiceInfo() {
        return this.VehicleInvoiceInfo;
    }

    /**
     * Set 机动车销售统一发票详细字段信息。
     * @param VehicleInvoiceInfo 机动车销售统一发票详细字段信息。
     */
    public void setVehicleInvoiceInfo(VehicleInvoiceInfo VehicleInvoiceInfo) {
        this.VehicleInvoiceInfo = VehicleInvoiceInfo;
    }

    /**
     * Get 二手车销售统一发票详细字段信息。 
     * @return UsedVehicleInvoiceInfo 二手车销售统一发票详细字段信息。
     */
    public UsedVehicleInvoiceInfo getUsedVehicleInvoiceInfo() {
        return this.UsedVehicleInvoiceInfo;
    }

    /**
     * Set 二手车销售统一发票详细字段信息。
     * @param UsedVehicleInvoiceInfo 二手车销售统一发票详细字段信息。
     */
    public void setUsedVehicleInvoiceInfo(UsedVehicleInvoiceInfo UsedVehicleInvoiceInfo) {
        this.UsedVehicleInvoiceInfo = UsedVehicleInvoiceInfo;
    }

    /**
     * Get 通行费发票详细字段信息。 
     * @return PassInvoiceInfoList 通行费发票详细字段信息。
     */
    public PassInvoiceInfo [] getPassInvoiceInfoList() {
        return this.PassInvoiceInfoList;
    }

    /**
     * Set 通行费发票详细字段信息。
     * @param PassInvoiceInfoList 通行费发票详细字段信息。
     */
    public void setPassInvoiceInfoList(PassInvoiceInfo [] PassInvoiceInfoList) {
        this.PassInvoiceInfoList = PassInvoiceInfoList;
    }

    /**
     * Get 全电发票（铁路电子客票）详细字段信息。
 
     * @return ElectronicTrainTicket 全电发票（铁路电子客票）详细字段信息。

     */
    public ElectronicTrainTicket getElectronicTrainTicket() {
        return this.ElectronicTrainTicket;
    }

    /**
     * Set 全电发票（铁路电子客票）详细字段信息。

     * @param ElectronicTrainTicket 全电发票（铁路电子客票）详细字段信息。

     */
    public void setElectronicTrainTicket(ElectronicTrainTicket ElectronicTrainTicket) {
        this.ElectronicTrainTicket = ElectronicTrainTicket;
    }

    /**
     * Get 全电发票（航空运输电子客票行程单）详细字段信息。 
     * @return ElectronicAirTransport 全电发票（航空运输电子客票行程单）详细字段信息。
     */
    public ElectronicAirTransport getElectronicAirTransport() {
        return this.ElectronicAirTransport;
    }

    /**
     * Set 全电发票（航空运输电子客票行程单）详细字段信息。
     * @param ElectronicAirTransport 全电发票（航空运输电子客票行程单）详细字段信息。
     */
    public void setElectronicAirTransport(ElectronicAirTransport ElectronicAirTransport) {
        this.ElectronicAirTransport = ElectronicAirTransport;
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

    public VatInvoiceVerifyNewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VatInvoiceVerifyNewResponse(VatInvoiceVerifyNewResponse source) {
        if (source.Invoice != null) {
            this.Invoice = new VatInvoice(source.Invoice);
        }
        if (source.VehicleInvoiceInfo != null) {
            this.VehicleInvoiceInfo = new VehicleInvoiceInfo(source.VehicleInvoiceInfo);
        }
        if (source.UsedVehicleInvoiceInfo != null) {
            this.UsedVehicleInvoiceInfo = new UsedVehicleInvoiceInfo(source.UsedVehicleInvoiceInfo);
        }
        if (source.PassInvoiceInfoList != null) {
            this.PassInvoiceInfoList = new PassInvoiceInfo[source.PassInvoiceInfoList.length];
            for (int i = 0; i < source.PassInvoiceInfoList.length; i++) {
                this.PassInvoiceInfoList[i] = new PassInvoiceInfo(source.PassInvoiceInfoList[i]);
            }
        }
        if (source.ElectronicTrainTicket != null) {
            this.ElectronicTrainTicket = new ElectronicTrainTicket(source.ElectronicTrainTicket);
        }
        if (source.ElectronicAirTransport != null) {
            this.ElectronicAirTransport = new ElectronicAirTransport(source.ElectronicAirTransport);
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
        this.setParamArrayObj(map, prefix + "PassInvoiceInfoList.", this.PassInvoiceInfoList);
        this.setParamObj(map, prefix + "ElectronicTrainTicket.", this.ElectronicTrainTicket);
        this.setParamObj(map, prefix + "ElectronicAirTransport.", this.ElectronicAirTransport);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

