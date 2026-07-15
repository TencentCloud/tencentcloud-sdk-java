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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryZoneResourceRequest extends AbstractModel {

    /**
    * 要检查的可用区
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * 操作类型（create数据节点创建，masterCreate专用主节点创建，scaleUp数据节点纵向扩容，masterAdd添加专用主节点，masterScaleUp专用主节点纵向扩容）
    */
    @SerializedName("OptType")
    @Expose
    private String OptType;

    /**
    * 实例ID(变配检查需要传递)
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 集群部署方式
<li>0, 单可用区部署</li>
<li>1, 多可用区部署</li>
    */
    @SerializedName("DeployMode")
    @Expose
    private Long DeployMode;

    /**
    * 计费类型<li>PREPAID：预付费，即包年包月</li><li>POSTPAID_BY_HOUR：按小时后付费</li>
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * ES版本号如5.6.4，6.4.3，6.8.2，7.5.1
    */
    @SerializedName("EsVersion")
    @Expose
    private String EsVersion;

    /**
    * cdcId，使用cdc子网时传递
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
     * Get 要检查的可用区 
     * @return Zones 要检查的可用区
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set 要检查的可用区
     * @param Zones 要检查的可用区
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get 操作类型（create数据节点创建，masterCreate专用主节点创建，scaleUp数据节点纵向扩容，masterAdd添加专用主节点，masterScaleUp专用主节点纵向扩容） 
     * @return OptType 操作类型（create数据节点创建，masterCreate专用主节点创建，scaleUp数据节点纵向扩容，masterAdd添加专用主节点，masterScaleUp专用主节点纵向扩容）
     */
    public String getOptType() {
        return this.OptType;
    }

    /**
     * Set 操作类型（create数据节点创建，masterCreate专用主节点创建，scaleUp数据节点纵向扩容，masterAdd添加专用主节点，masterScaleUp专用主节点纵向扩容）
     * @param OptType 操作类型（create数据节点创建，masterCreate专用主节点创建，scaleUp数据节点纵向扩容，masterAdd添加专用主节点，masterScaleUp专用主节点纵向扩容）
     */
    public void setOptType(String OptType) {
        this.OptType = OptType;
    }

    /**
     * Get 实例ID(变配检查需要传递) 
     * @return InstanceId 实例ID(变配检查需要传递)
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID(变配检查需要传递)
     * @param InstanceId 实例ID(变配检查需要传递)
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 集群部署方式
<li>0, 单可用区部署</li>
<li>1, 多可用区部署</li> 
     * @return DeployMode 集群部署方式
<li>0, 单可用区部署</li>
<li>1, 多可用区部署</li>
     */
    public Long getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set 集群部署方式
<li>0, 单可用区部署</li>
<li>1, 多可用区部署</li>
     * @param DeployMode 集群部署方式
<li>0, 单可用区部署</li>
<li>1, 多可用区部署</li>
     */
    public void setDeployMode(Long DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get 计费类型<li>PREPAID：预付费，即包年包月</li><li>POSTPAID_BY_HOUR：按小时后付费</li> 
     * @return ChargeType 计费类型<li>PREPAID：预付费，即包年包月</li><li>POSTPAID_BY_HOUR：按小时后付费</li>
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 计费类型<li>PREPAID：预付费，即包年包月</li><li>POSTPAID_BY_HOUR：按小时后付费</li>
     * @param ChargeType 计费类型<li>PREPAID：预付费，即包年包月</li><li>POSTPAID_BY_HOUR：按小时后付费</li>
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get ES版本号如5.6.4，6.4.3，6.8.2，7.5.1 
     * @return EsVersion ES版本号如5.6.4，6.4.3，6.8.2，7.5.1
     */
    public String getEsVersion() {
        return this.EsVersion;
    }

    /**
     * Set ES版本号如5.6.4，6.4.3，6.8.2，7.5.1
     * @param EsVersion ES版本号如5.6.4，6.4.3，6.8.2，7.5.1
     */
    public void setEsVersion(String EsVersion) {
        this.EsVersion = EsVersion;
    }

    /**
     * Get cdcId，使用cdc子网时传递 
     * @return CdcId cdcId，使用cdc子网时传递
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set cdcId，使用cdc子网时传递
     * @param CdcId cdcId，使用cdc子网时传递
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    public QueryZoneResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryZoneResourceRequest(QueryZoneResourceRequest source) {
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.OptType != null) {
            this.OptType = new String(source.OptType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DeployMode != null) {
            this.DeployMode = new Long(source.DeployMode);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.EsVersion != null) {
            this.EsVersion = new String(source.EsVersion);
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "OptType", this.OptType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "EsVersion", this.EsVersion);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);

    }
}

