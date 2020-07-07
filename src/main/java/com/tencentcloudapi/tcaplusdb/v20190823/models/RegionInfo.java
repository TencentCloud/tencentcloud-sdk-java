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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionInfo extends AbstractModel{

    /**
    * 地域Ap-Code
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 地域缩写
    */
    @SerializedName("RegionAbbr")
    @Expose
    private String RegionAbbr;

    /**
    * 地域ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 是否支持ipv6，0:不支持，1:支持
    */
    @SerializedName("Ipv6Enable")
    @Expose
    private Long Ipv6Enable;

    /**
     * Get 地域Ap-Code 
     * @return RegionName 地域Ap-Code
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 地域Ap-Code
     * @param RegionName 地域Ap-Code
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 地域缩写 
     * @return RegionAbbr 地域缩写
     */
    public String getRegionAbbr() {
        return this.RegionAbbr;
    }

    /**
     * Set 地域缩写
     * @param RegionAbbr 地域缩写
     */
    public void setRegionAbbr(String RegionAbbr) {
        this.RegionAbbr = RegionAbbr;
    }

    /**
     * Get 地域ID 
     * @return RegionId 地域ID
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域ID
     * @param RegionId 地域ID
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 是否支持ipv6，0:不支持，1:支持 
     * @return Ipv6Enable 是否支持ipv6，0:不支持，1:支持
     */
    public Long getIpv6Enable() {
        return this.Ipv6Enable;
    }

    /**
     * Set 是否支持ipv6，0:不支持，1:支持
     * @param Ipv6Enable 是否支持ipv6，0:不支持，1:支持
     */
    public void setIpv6Enable(Long Ipv6Enable) {
        this.Ipv6Enable = Ipv6Enable;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionAbbr", this.RegionAbbr);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "Ipv6Enable", this.Ipv6Enable);

    }
}

