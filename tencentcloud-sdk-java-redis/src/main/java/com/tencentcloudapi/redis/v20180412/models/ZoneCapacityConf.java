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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneCapacityConf extends AbstractModel{

    /**
    * 可用区ID：如ap-guangzhou-3
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 可用区名称
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 可用区是否售罄
    */
    @SerializedName("IsSaleout")
    @Expose
    private Boolean IsSaleout;

    /**
    * 是否为默认可用区
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * 网络类型：basenet -- 基础网络；vpcnet -- VPC网络
    */
    @SerializedName("NetWorkType")
    @Expose
    private String [] NetWorkType;

    /**
    * 可用区内产品规格等信息
    */
    @SerializedName("ProductSet")
    @Expose
    private ProductConf [] ProductSet;

    /**
    * 可用区ID：如100003
    */
    @SerializedName("OldZoneId")
    @Expose
    private Long OldZoneId;

    /**
     * Get 可用区ID：如ap-guangzhou-3 
     * @return ZoneId 可用区ID：如ap-guangzhou-3
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区ID：如ap-guangzhou-3
     * @param ZoneId 可用区ID：如ap-guangzhou-3
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 可用区名称 
     * @return ZoneName 可用区名称
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 可用区名称
     * @param ZoneName 可用区名称
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 可用区是否售罄 
     * @return IsSaleout 可用区是否售罄
     */
    public Boolean getIsSaleout() {
        return this.IsSaleout;
    }

    /**
     * Set 可用区是否售罄
     * @param IsSaleout 可用区是否售罄
     */
    public void setIsSaleout(Boolean IsSaleout) {
        this.IsSaleout = IsSaleout;
    }

    /**
     * Get 是否为默认可用区 
     * @return IsDefault 是否为默认可用区
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否为默认可用区
     * @param IsDefault 是否为默认可用区
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get 网络类型：basenet -- 基础网络；vpcnet -- VPC网络 
     * @return NetWorkType 网络类型：basenet -- 基础网络；vpcnet -- VPC网络
     */
    public String [] getNetWorkType() {
        return this.NetWorkType;
    }

    /**
     * Set 网络类型：basenet -- 基础网络；vpcnet -- VPC网络
     * @param NetWorkType 网络类型：basenet -- 基础网络；vpcnet -- VPC网络
     */
    public void setNetWorkType(String [] NetWorkType) {
        this.NetWorkType = NetWorkType;
    }

    /**
     * Get 可用区内产品规格等信息 
     * @return ProductSet 可用区内产品规格等信息
     */
    public ProductConf [] getProductSet() {
        return this.ProductSet;
    }

    /**
     * Set 可用区内产品规格等信息
     * @param ProductSet 可用区内产品规格等信息
     */
    public void setProductSet(ProductConf [] ProductSet) {
        this.ProductSet = ProductSet;
    }

    /**
     * Get 可用区ID：如100003 
     * @return OldZoneId 可用区ID：如100003
     */
    public Long getOldZoneId() {
        return this.OldZoneId;
    }

    /**
     * Set 可用区ID：如100003
     * @param OldZoneId 可用区ID：如100003
     */
    public void setOldZoneId(Long OldZoneId) {
        this.OldZoneId = OldZoneId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "IsSaleout", this.IsSaleout);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamArraySimple(map, prefix + "NetWorkType.", this.NetWorkType);
        this.setParamArrayObj(map, prefix + "ProductSet.", this.ProductSet);
        this.setParamSimple(map, prefix + "OldZoneId", this.OldZoneId);

    }
}

