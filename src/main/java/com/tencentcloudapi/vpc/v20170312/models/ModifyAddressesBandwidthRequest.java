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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAddressesBandwidthRequest extends AbstractModel{

    /**
    * EIP唯一标识ID列表，形如'eip-xxxx'
    */
    @SerializedName("AddressIds")
    @Expose
    private String [] AddressIds;

    /**
    * 调整带宽目标值
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * 包月带宽起始时间(已废弃，输入无效)
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 包月带宽结束时间(已废弃，输入无效)
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get EIP唯一标识ID列表，形如'eip-xxxx' 
     * @return AddressIds EIP唯一标识ID列表，形如'eip-xxxx'
     */
    public String [] getAddressIds() {
        return this.AddressIds;
    }

    /**
     * Set EIP唯一标识ID列表，形如'eip-xxxx'
     * @param AddressIds EIP唯一标识ID列表，形如'eip-xxxx'
     */
    public void setAddressIds(String [] AddressIds) {
        this.AddressIds = AddressIds;
    }

    /**
     * Get 调整带宽目标值 
     * @return InternetMaxBandwidthOut 调整带宽目标值
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set 调整带宽目标值
     * @param InternetMaxBandwidthOut 调整带宽目标值
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get 包月带宽起始时间(已废弃，输入无效) 
     * @return StartTime 包月带宽起始时间(已废弃，输入无效)
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 包月带宽起始时间(已废弃，输入无效)
     * @param StartTime 包月带宽起始时间(已废弃，输入无效)
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 包月带宽结束时间(已废弃，输入无效) 
     * @return EndTime 包月带宽结束时间(已废弃，输入无效)
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 包月带宽结束时间(已废弃，输入无效)
     * @param EndTime 包月带宽结束时间(已废弃，输入无效)
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public ModifyAddressesBandwidthRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAddressesBandwidthRequest(ModifyAddressesBandwidthRequest source) {
        if (source.AddressIds != null) {
            this.AddressIds = new String[source.AddressIds.length];
            for (int i = 0; i < source.AddressIds.length; i++) {
                this.AddressIds[i] = new String(source.AddressIds[i]);
            }
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AddressIds.", this.AddressIds);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

