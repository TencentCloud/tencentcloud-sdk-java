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
package com.tencentcloudapi.youmall.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeZoneFlowGenderInfoByZoneIdResponse extends AbstractModel{

    /**
    * 集团ID
    */
    @SerializedName("CompanyId")
    @Expose
    private String CompanyId;

    /**
    * 店铺ID
    */
    @SerializedName("ShopId")
    @Expose
    private Long ShopId;

    /**
    * 区域ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 区域名称
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 男性占比
    */
    @SerializedName("MalePercent")
    @Expose
    private Float MalePercent;

    /**
    * 女性占比
    */
    @SerializedName("FemalePercent")
    @Expose
    private Float FemalePercent;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 集团ID 
     * @return CompanyId 集团ID
     */
    public String getCompanyId() {
        return this.CompanyId;
    }

    /**
     * Set 集团ID
     * @param CompanyId 集团ID
     */
    public void setCompanyId(String CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * Get 店铺ID 
     * @return ShopId 店铺ID
     */
    public Long getShopId() {
        return this.ShopId;
    }

    /**
     * Set 店铺ID
     * @param ShopId 店铺ID
     */
    public void setShopId(Long ShopId) {
        this.ShopId = ShopId;
    }

    /**
     * Get 区域ID 
     * @return ZoneId 区域ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 区域ID
     * @param ZoneId 区域ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 区域名称 
     * @return ZoneName 区域名称
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 区域名称
     * @param ZoneName 区域名称
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 男性占比 
     * @return MalePercent 男性占比
     */
    public Float getMalePercent() {
        return this.MalePercent;
    }

    /**
     * Set 男性占比
     * @param MalePercent 男性占比
     */
    public void setMalePercent(Float MalePercent) {
        this.MalePercent = MalePercent;
    }

    /**
     * Get 女性占比 
     * @return FemalePercent 女性占比
     */
    public Float getFemalePercent() {
        return this.FemalePercent;
    }

    /**
     * Set 女性占比
     * @param FemalePercent 女性占比
     */
    public void setFemalePercent(Float FemalePercent) {
        this.FemalePercent = FemalePercent;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "ShopId", this.ShopId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "MalePercent", this.MalePercent);
        this.setParamSimple(map, prefix + "FemalePercent", this.FemalePercent);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

