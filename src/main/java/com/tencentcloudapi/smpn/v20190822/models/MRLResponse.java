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
package com.tencentcloudapi.smpn.v20190822.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MRLResponse extends AbstractModel{

    /**
    * 骚扰电话恶意标记等级
    */
    @SerializedName("DisturbLevel")
    @Expose
    private Long DisturbLevel;

    /**
    * 房产中介恶意标记等级
    */
    @SerializedName("HouseAgentLevel")
    @Expose
    private Long HouseAgentLevel;

    /**
    * 保险理财恶意标记等级
    */
    @SerializedName("InsuranceLevel")
    @Expose
    private Long InsuranceLevel;

    /**
    * 广告推销恶意标记等级
    */
    @SerializedName("SalesLevel")
    @Expose
    private Long SalesLevel;

    /**
    * 诈骗电话恶意标记等级
    */
    @SerializedName("CheatLevel")
    @Expose
    private Long CheatLevel;

    /**
     * Get 骚扰电话恶意标记等级 
     * @return DisturbLevel 骚扰电话恶意标记等级
     */
    public Long getDisturbLevel() {
        return this.DisturbLevel;
    }

    /**
     * Set 骚扰电话恶意标记等级
     * @param DisturbLevel 骚扰电话恶意标记等级
     */
    public void setDisturbLevel(Long DisturbLevel) {
        this.DisturbLevel = DisturbLevel;
    }

    /**
     * Get 房产中介恶意标记等级 
     * @return HouseAgentLevel 房产中介恶意标记等级
     */
    public Long getHouseAgentLevel() {
        return this.HouseAgentLevel;
    }

    /**
     * Set 房产中介恶意标记等级
     * @param HouseAgentLevel 房产中介恶意标记等级
     */
    public void setHouseAgentLevel(Long HouseAgentLevel) {
        this.HouseAgentLevel = HouseAgentLevel;
    }

    /**
     * Get 保险理财恶意标记等级 
     * @return InsuranceLevel 保险理财恶意标记等级
     */
    public Long getInsuranceLevel() {
        return this.InsuranceLevel;
    }

    /**
     * Set 保险理财恶意标记等级
     * @param InsuranceLevel 保险理财恶意标记等级
     */
    public void setInsuranceLevel(Long InsuranceLevel) {
        this.InsuranceLevel = InsuranceLevel;
    }

    /**
     * Get 广告推销恶意标记等级 
     * @return SalesLevel 广告推销恶意标记等级
     */
    public Long getSalesLevel() {
        return this.SalesLevel;
    }

    /**
     * Set 广告推销恶意标记等级
     * @param SalesLevel 广告推销恶意标记等级
     */
    public void setSalesLevel(Long SalesLevel) {
        this.SalesLevel = SalesLevel;
    }

    /**
     * Get 诈骗电话恶意标记等级 
     * @return CheatLevel 诈骗电话恶意标记等级
     */
    public Long getCheatLevel() {
        return this.CheatLevel;
    }

    /**
     * Set 诈骗电话恶意标记等级
     * @param CheatLevel 诈骗电话恶意标记等级
     */
    public void setCheatLevel(Long CheatLevel) {
        this.CheatLevel = CheatLevel;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisturbLevel", this.DisturbLevel);
        this.setParamSimple(map, prefix + "HouseAgentLevel", this.HouseAgentLevel);
        this.setParamSimple(map, prefix + "InsuranceLevel", this.InsuranceLevel);
        this.setParamSimple(map, prefix + "SalesLevel", this.SalesLevel);
        this.setParamSimple(map, prefix + "CheatLevel", this.CheatLevel);

    }
}

