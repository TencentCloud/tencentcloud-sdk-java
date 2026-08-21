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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCSIPRaspLicenseBindsRequest extends AbstractModel {

    /**
    * <p>资源ID（指定绑定到哪个订单）</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>授权类型。枚举值：rasp(RASP) / enterprise_hp(旗舰版)。为空默认 rasp</p>
    */
    @SerializedName("LicenseType")
    @Expose
    private String LicenseType;

    /**
    * <p>资产类型。枚举值：host(主机) / cluster(容器节点) / eks(EKS超级节点)。为空默认 host</p>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>待绑定的实例ID列表（IsAll=true时可不传）</p>
    */
    @SerializedName("InstanceIDs")
    @Expose
    private String [] InstanceIDs;

    /**
    * <p>是否绑定全部未绑定机器（true时自动算差集）</p>
    */
    @SerializedName("IsAll")
    @Expose
    private Boolean IsAll;

    /**
     * Get <p>资源ID（指定绑定到哪个订单）</p> 
     * @return ResourceId <p>资源ID（指定绑定到哪个订单）</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源ID（指定绑定到哪个订单）</p>
     * @param ResourceId <p>资源ID（指定绑定到哪个订单）</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>授权类型。枚举值：rasp(RASP) / enterprise_hp(旗舰版)。为空默认 rasp</p> 
     * @return LicenseType <p>授权类型。枚举值：rasp(RASP) / enterprise_hp(旗舰版)。为空默认 rasp</p>
     */
    public String getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set <p>授权类型。枚举值：rasp(RASP) / enterprise_hp(旗舰版)。为空默认 rasp</p>
     * @param LicenseType <p>授权类型。枚举值：rasp(RASP) / enterprise_hp(旗舰版)。为空默认 rasp</p>
     */
    public void setLicenseType(String LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get <p>资产类型。枚举值：host(主机) / cluster(容器节点) / eks(EKS超级节点)。为空默认 host</p> 
     * @return AssetType <p>资产类型。枚举值：host(主机) / cluster(容器节点) / eks(EKS超级节点)。为空默认 host</p>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>资产类型。枚举值：host(主机) / cluster(容器节点) / eks(EKS超级节点)。为空默认 host</p>
     * @param AssetType <p>资产类型。枚举值：host(主机) / cluster(容器节点) / eks(EKS超级节点)。为空默认 host</p>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get <p>待绑定的实例ID列表（IsAll=true时可不传）</p> 
     * @return InstanceIDs <p>待绑定的实例ID列表（IsAll=true时可不传）</p>
     */
    public String [] getInstanceIDs() {
        return this.InstanceIDs;
    }

    /**
     * Set <p>待绑定的实例ID列表（IsAll=true时可不传）</p>
     * @param InstanceIDs <p>待绑定的实例ID列表（IsAll=true时可不传）</p>
     */
    public void setInstanceIDs(String [] InstanceIDs) {
        this.InstanceIDs = InstanceIDs;
    }

    /**
     * Get <p>是否绑定全部未绑定机器（true时自动算差集）</p> 
     * @return IsAll <p>是否绑定全部未绑定机器（true时自动算差集）</p>
     */
    public Boolean getIsAll() {
        return this.IsAll;
    }

    /**
     * Set <p>是否绑定全部未绑定机器（true时自动算差集）</p>
     * @param IsAll <p>是否绑定全部未绑定机器（true时自动算差集）</p>
     */
    public void setIsAll(Boolean IsAll) {
        this.IsAll = IsAll;
    }

    public ModifyCSIPRaspLicenseBindsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCSIPRaspLicenseBindsRequest(ModifyCSIPRaspLicenseBindsRequest source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.LicenseType != null) {
            this.LicenseType = new String(source.LicenseType);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.InstanceIDs != null) {
            this.InstanceIDs = new String[source.InstanceIDs.length];
            for (int i = 0; i < source.InstanceIDs.length; i++) {
                this.InstanceIDs[i] = new String(source.InstanceIDs[i]);
            }
        }
        if (source.IsAll != null) {
            this.IsAll = new Boolean(source.IsAll);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamArraySimple(map, prefix + "InstanceIDs.", this.InstanceIDs);
        this.setParamSimple(map, prefix + "IsAll", this.IsAll);

    }
}

