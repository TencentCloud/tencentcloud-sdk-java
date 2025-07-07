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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSpecRequest extends AbstractModel {

    /**
    * 地域信息，例如"ap-guangzhou-1"
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 计费类型，PREPAID 包年包月，POSTPAID_BY_HOUR 按量计费
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 多可用区
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * 机型名称
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * 是否存算分离
    */
    @SerializedName("IsSSC")
    @Expose
    private Boolean IsSSC;

    /**
     * Get 地域信息，例如"ap-guangzhou-1" 
     * @return Zone 地域信息，例如"ap-guangzhou-1"
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 地域信息，例如"ap-guangzhou-1"
     * @param Zone 地域信息，例如"ap-guangzhou-1"
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 计费类型，PREPAID 包年包月，POSTPAID_BY_HOUR 按量计费 
     * @return PayMode 计费类型，PREPAID 包年包月，POSTPAID_BY_HOUR 按量计费
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 计费类型，PREPAID 包年包月，POSTPAID_BY_HOUR 按量计费
     * @param PayMode 计费类型，PREPAID 包年包月，POSTPAID_BY_HOUR 按量计费
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 多可用区 
     * @return Zones 多可用区
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set 多可用区
     * @param Zones 多可用区
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get 机型名称 
     * @return SpecName 机型名称
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set 机型名称
     * @param SpecName 机型名称
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get 是否存算分离 
     * @return IsSSC 是否存算分离
     */
    public Boolean getIsSSC() {
        return this.IsSSC;
    }

    /**
     * Set 是否存算分离
     * @param IsSSC 是否存算分离
     */
    public void setIsSSC(Boolean IsSSC) {
        this.IsSSC = IsSSC;
    }

    public DescribeSpecRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSpecRequest(DescribeSpecRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.IsSSC != null) {
            this.IsSSC = new Boolean(source.IsSSC);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "IsSSC", this.IsSSC);

    }
}

