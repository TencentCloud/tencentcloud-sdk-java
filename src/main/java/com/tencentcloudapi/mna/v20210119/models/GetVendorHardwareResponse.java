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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetVendorHardwareResponse extends AbstractModel {

    /**
    * 硬件信息列表
    */
    @SerializedName("VendorHardware")
    @Expose
    private VendorHardware [] VendorHardware;

    /**
    * 设备总数
    */
    @SerializedName("Length")
    @Expose
    private Long Length;

    /**
    * 总页数
    */
    @SerializedName("TotalPage")
    @Expose
    private Long TotalPage;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 硬件信息列表 
     * @return VendorHardware 硬件信息列表
     */
    public VendorHardware [] getVendorHardware() {
        return this.VendorHardware;
    }

    /**
     * Set 硬件信息列表
     * @param VendorHardware 硬件信息列表
     */
    public void setVendorHardware(VendorHardware [] VendorHardware) {
        this.VendorHardware = VendorHardware;
    }

    /**
     * Get 设备总数 
     * @return Length 设备总数
     */
    public Long getLength() {
        return this.Length;
    }

    /**
     * Set 设备总数
     * @param Length 设备总数
     */
    public void setLength(Long Length) {
        this.Length = Length;
    }

    /**
     * Get 总页数 
     * @return TotalPage 总页数
     */
    public Long getTotalPage() {
        return this.TotalPage;
    }

    /**
     * Set 总页数
     * @param TotalPage 总页数
     */
    public void setTotalPage(Long TotalPage) {
        this.TotalPage = TotalPage;
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

    public GetVendorHardwareResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetVendorHardwareResponse(GetVendorHardwareResponse source) {
        if (source.VendorHardware != null) {
            this.VendorHardware = new VendorHardware[source.VendorHardware.length];
            for (int i = 0; i < source.VendorHardware.length; i++) {
                this.VendorHardware[i] = new VendorHardware(source.VendorHardware[i]);
            }
        }
        if (source.Length != null) {
            this.Length = new Long(source.Length);
        }
        if (source.TotalPage != null) {
            this.TotalPage = new Long(source.TotalPage);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "VendorHardware.", this.VendorHardware);
        this.setParamSimple(map, prefix + "Length", this.Length);
        this.setParamSimple(map, prefix + "TotalPage", this.TotalPage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

