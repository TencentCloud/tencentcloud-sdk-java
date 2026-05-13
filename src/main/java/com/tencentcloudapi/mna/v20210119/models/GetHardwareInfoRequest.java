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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetHardwareInfoRequest extends AbstractModel {

    /**
    * 厂商名称
    */
    @SerializedName("Vendor")
    @Expose
    private String Vendor;

    /**
    * 设备SN序列号
    */
    @SerializedName("SN")
    @Expose
    private String SN;

    /**
     * Get 厂商名称 
     * @return Vendor 厂商名称
     */
    public String getVendor() {
        return this.Vendor;
    }

    /**
     * Set 厂商名称
     * @param Vendor 厂商名称
     */
    public void setVendor(String Vendor) {
        this.Vendor = Vendor;
    }

    /**
     * Get 设备SN序列号 
     * @return SN 设备SN序列号
     */
    public String getSN() {
        return this.SN;
    }

    /**
     * Set 设备SN序列号
     * @param SN 设备SN序列号
     */
    public void setSN(String SN) {
        this.SN = SN;
    }

    public GetHardwareInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetHardwareInfoRequest(GetHardwareInfoRequest source) {
        if (source.Vendor != null) {
            this.Vendor = new String(source.Vendor);
        }
        if (source.SN != null) {
            this.SN = new String(source.SN);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Vendor", this.Vendor);
        this.setParamSimple(map, prefix + "SN", this.SN);

    }
}

