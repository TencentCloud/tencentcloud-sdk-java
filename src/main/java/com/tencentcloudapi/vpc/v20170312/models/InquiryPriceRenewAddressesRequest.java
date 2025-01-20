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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceRenewAddressesRequest extends AbstractModel {

    /**
    * 续费资源实例ID。
    */
    @SerializedName("AddressIds")
    @Expose
    private String [] AddressIds;

    /**
    * 包月按带宽预付费EIP的计费参数。EIP为包月按带宽预付费时，该参数必传，其余场景不需传递。
    */
    @SerializedName("AddressChargePrepaid")
    @Expose
    private AddressChargePrepaid AddressChargePrepaid;

    /**
     * Get 续费资源实例ID。 
     * @return AddressIds 续费资源实例ID。
     */
    public String [] getAddressIds() {
        return this.AddressIds;
    }

    /**
     * Set 续费资源实例ID。
     * @param AddressIds 续费资源实例ID。
     */
    public void setAddressIds(String [] AddressIds) {
        this.AddressIds = AddressIds;
    }

    /**
     * Get 包月按带宽预付费EIP的计费参数。EIP为包月按带宽预付费时，该参数必传，其余场景不需传递。 
     * @return AddressChargePrepaid 包月按带宽预付费EIP的计费参数。EIP为包月按带宽预付费时，该参数必传，其余场景不需传递。
     */
    public AddressChargePrepaid getAddressChargePrepaid() {
        return this.AddressChargePrepaid;
    }

    /**
     * Set 包月按带宽预付费EIP的计费参数。EIP为包月按带宽预付费时，该参数必传，其余场景不需传递。
     * @param AddressChargePrepaid 包月按带宽预付费EIP的计费参数。EIP为包月按带宽预付费时，该参数必传，其余场景不需传递。
     */
    public void setAddressChargePrepaid(AddressChargePrepaid AddressChargePrepaid) {
        this.AddressChargePrepaid = AddressChargePrepaid;
    }

    public InquiryPriceRenewAddressesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceRenewAddressesRequest(InquiryPriceRenewAddressesRequest source) {
        if (source.AddressIds != null) {
            this.AddressIds = new String[source.AddressIds.length];
            for (int i = 0; i < source.AddressIds.length; i++) {
                this.AddressIds[i] = new String(source.AddressIds[i]);
            }
        }
        if (source.AddressChargePrepaid != null) {
            this.AddressChargePrepaid = new AddressChargePrepaid(source.AddressChargePrepaid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AddressIds.", this.AddressIds);
        this.setParamObj(map, prefix + "AddressChargePrepaid.", this.AddressChargePrepaid);

    }
}

