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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AvailableProtoStatus extends AbstractModel {

    /**
    * 售卖状态。可选值有 sale_out 售罄、saling可售、no_saling不可销售
    */
    @SerializedName("SaleStatus")
    @Expose
    private String SaleStatus;

    /**
    * 协议类型。可选值有 NFS、CIFS、TURBO
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
     * Get 售卖状态。可选值有 sale_out 售罄、saling可售、no_saling不可销售 
     * @return SaleStatus 售卖状态。可选值有 sale_out 售罄、saling可售、no_saling不可销售
     */
    public String getSaleStatus() {
        return this.SaleStatus;
    }

    /**
     * Set 售卖状态。可选值有 sale_out 售罄、saling可售、no_saling不可销售
     * @param SaleStatus 售卖状态。可选值有 sale_out 售罄、saling可售、no_saling不可销售
     */
    public void setSaleStatus(String SaleStatus) {
        this.SaleStatus = SaleStatus;
    }

    /**
     * Get 协议类型。可选值有 NFS、CIFS、TURBO 
     * @return Protocol 协议类型。可选值有 NFS、CIFS、TURBO
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议类型。可选值有 NFS、CIFS、TURBO
     * @param Protocol 协议类型。可选值有 NFS、CIFS、TURBO
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    public AvailableProtoStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AvailableProtoStatus(AvailableProtoStatus source) {
        if (source.SaleStatus != null) {
            this.SaleStatus = new String(source.SaleStatus);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SaleStatus", this.SaleStatus);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);

    }
}

