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

public class BandwidthPackage extends AbstractModel{

    /**
    * 带宽包唯一标识Id
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
    * 带宽包类型，包括'BGP','SINGLEISP','ANYCAST'
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * 带宽包计费类型，包括'TOP5_POSTPAID_BY_MONTH'和'PERCENT95_POSTPAID_BY_MONTH'
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 带宽包名称
    */
    @SerializedName("BandwidthPackageName")
    @Expose
    private String BandwidthPackageName;

    /**
    * 带宽包创建时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 带宽包状态，包括'CREATING','CREATED','DELETING','DELETED'
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 带宽包资源信息
    */
    @SerializedName("ResourceSet")
    @Expose
    private Resource [] ResourceSet;

    /**
    * 带宽包限速大小。单位：Mbps，-1表示不限速。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
     * Get 带宽包唯一标识Id 
     * @return BandwidthPackageId 带宽包唯一标识Id
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set 带宽包唯一标识Id
     * @param BandwidthPackageId 带宽包唯一标识Id
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    /**
     * Get 带宽包类型，包括'BGP','SINGLEISP','ANYCAST' 
     * @return NetworkType 带宽包类型，包括'BGP','SINGLEISP','ANYCAST'
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set 带宽包类型，包括'BGP','SINGLEISP','ANYCAST'
     * @param NetworkType 带宽包类型，包括'BGP','SINGLEISP','ANYCAST'
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get 带宽包计费类型，包括'TOP5_POSTPAID_BY_MONTH'和'PERCENT95_POSTPAID_BY_MONTH' 
     * @return ChargeType 带宽包计费类型，包括'TOP5_POSTPAID_BY_MONTH'和'PERCENT95_POSTPAID_BY_MONTH'
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 带宽包计费类型，包括'TOP5_POSTPAID_BY_MONTH'和'PERCENT95_POSTPAID_BY_MONTH'
     * @param ChargeType 带宽包计费类型，包括'TOP5_POSTPAID_BY_MONTH'和'PERCENT95_POSTPAID_BY_MONTH'
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 带宽包名称 
     * @return BandwidthPackageName 带宽包名称
     */
    public String getBandwidthPackageName() {
        return this.BandwidthPackageName;
    }

    /**
     * Set 带宽包名称
     * @param BandwidthPackageName 带宽包名称
     */
    public void setBandwidthPackageName(String BandwidthPackageName) {
        this.BandwidthPackageName = BandwidthPackageName;
    }

    /**
     * Get 带宽包创建时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。 
     * @return CreatedTime 带宽包创建时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 带宽包创建时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
     * @param CreatedTime 带宽包创建时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 带宽包状态，包括'CREATING','CREATED','DELETING','DELETED' 
     * @return Status 带宽包状态，包括'CREATING','CREATED','DELETING','DELETED'
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 带宽包状态，包括'CREATING','CREATED','DELETING','DELETED'
     * @param Status 带宽包状态，包括'CREATING','CREATED','DELETING','DELETED'
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 带宽包资源信息 
     * @return ResourceSet 带宽包资源信息
     */
    public Resource [] getResourceSet() {
        return this.ResourceSet;
    }

    /**
     * Set 带宽包资源信息
     * @param ResourceSet 带宽包资源信息
     */
    public void setResourceSet(Resource [] ResourceSet) {
        this.ResourceSet = ResourceSet;
    }

    /**
     * Get 带宽包限速大小。单位：Mbps，-1表示不限速。 
     * @return Bandwidth 带宽包限速大小。单位：Mbps，-1表示不限速。
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 带宽包限速大小。单位：Mbps，-1表示不限速。
     * @param Bandwidth 带宽包限速大小。单位：Mbps，-1表示不限速。
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "BandwidthPackageName", this.BandwidthPackageName);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "ResourceSet.", this.ResourceSet);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);

    }
}

