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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActivationLicense extends AbstractModel {

    /**
    * <p>激活码类型</p>
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * <p>支付模式</p>
    */
    @SerializedName("TotalLicenseNum")
    @Expose
    private Long TotalLicenseNum;

    /**
    * <p>计费标签项</p>
    */
    @SerializedName("UsedLicenseNum")
    @Expose
    private Long UsedLicenseNum;

    /**
    * <p>计费标识</p>
    */
    @SerializedName("Period")
    @Expose
    private String Period;

    /**
     * Get <p>激活码类型</p> 
     * @return ServiceType <p>激活码类型</p>
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set <p>激活码类型</p>
     * @param ServiceType <p>激活码类型</p>
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get <p>支付模式</p> 
     * @return TotalLicenseNum <p>支付模式</p>
     */
    public Long getTotalLicenseNum() {
        return this.TotalLicenseNum;
    }

    /**
     * Set <p>支付模式</p>
     * @param TotalLicenseNum <p>支付模式</p>
     */
    public void setTotalLicenseNum(Long TotalLicenseNum) {
        this.TotalLicenseNum = TotalLicenseNum;
    }

    /**
     * Get <p>计费标签项</p> 
     * @return UsedLicenseNum <p>计费标签项</p>
     */
    public Long getUsedLicenseNum() {
        return this.UsedLicenseNum;
    }

    /**
     * Set <p>计费标签项</p>
     * @param UsedLicenseNum <p>计费标签项</p>
     */
    public void setUsedLicenseNum(Long UsedLicenseNum) {
        this.UsedLicenseNum = UsedLicenseNum;
    }

    /**
     * Get <p>计费标识</p> 
     * @return Period <p>计费标识</p>
     */
    public String getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>计费标识</p>
     * @param Period <p>计费标识</p>
     */
    public void setPeriod(String Period) {
        this.Period = Period;
    }

    public ActivationLicense() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActivationLicense(ActivationLicense source) {
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.TotalLicenseNum != null) {
            this.TotalLicenseNum = new Long(source.TotalLicenseNum);
        }
        if (source.UsedLicenseNum != null) {
            this.UsedLicenseNum = new Long(source.UsedLicenseNum);
        }
        if (source.Period != null) {
            this.Period = new String(source.Period);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "TotalLicenseNum", this.TotalLicenseNum);
        this.setParamSimple(map, prefix + "UsedLicenseNum", this.UsedLicenseNum);
        this.setParamSimple(map, prefix + "Period", this.Period);

    }
}

