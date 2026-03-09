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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterOption extends AbstractModel {

    /**
    * <p>计算集群可用区。</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>计算集群类型，取值范围：</p><ul><li>KUBERNETES</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>计算集群Service CIDR，不能与VPC网段重合。</p>
    */
    @SerializedName("ServiceCidr")
    @Expose
    private String ServiceCidr;

    /**
    * <p>资源配额。</p>
    */
    @SerializedName("ResourceQuota")
    @Expose
    private ResourceQuota ResourceQuota;

    /**
    * <p>限制范围。</p>
    */
    @SerializedName("LimitRange")
    @Expose
    private LimitRange LimitRange;

    /**
    * <p>系统节点池实例规格。详情参见<a href="https://cloud.tencent.com/document/product/213/11518">实例规格</a>描述</p>
    */
    @SerializedName("SystemNodeInstanceType")
    @Expose
    private String SystemNodeInstanceType;

    /**
    * <p>系统节点池实例数量。</p>
    */
    @SerializedName("SystemNodeCount")
    @Expose
    private Long SystemNodeCount;

    /**
    * <p>纳管环境自动升配</p>
    */
    @SerializedName("AutoUpgradeClusterLevel")
    @Expose
    private Boolean AutoUpgradeClusterLevel;

    /**
     * Get <p>计算集群可用区。</p> 
     * @return Zone <p>计算集群可用区。</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>计算集群可用区。</p>
     * @param Zone <p>计算集群可用区。</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>计算集群类型，取值范围：</p><ul><li>KUBERNETES</li></ul> 
     * @return Type <p>计算集群类型，取值范围：</p><ul><li>KUBERNETES</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>计算集群类型，取值范围：</p><ul><li>KUBERNETES</li></ul>
     * @param Type <p>计算集群类型，取值范围：</p><ul><li>KUBERNETES</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>计算集群Service CIDR，不能与VPC网段重合。</p> 
     * @return ServiceCidr <p>计算集群Service CIDR，不能与VPC网段重合。</p>
     */
    public String getServiceCidr() {
        return this.ServiceCidr;
    }

    /**
     * Set <p>计算集群Service CIDR，不能与VPC网段重合。</p>
     * @param ServiceCidr <p>计算集群Service CIDR，不能与VPC网段重合。</p>
     */
    public void setServiceCidr(String ServiceCidr) {
        this.ServiceCidr = ServiceCidr;
    }

    /**
     * Get <p>资源配额。</p> 
     * @return ResourceQuota <p>资源配额。</p>
     */
    public ResourceQuota getResourceQuota() {
        return this.ResourceQuota;
    }

    /**
     * Set <p>资源配额。</p>
     * @param ResourceQuota <p>资源配额。</p>
     */
    public void setResourceQuota(ResourceQuota ResourceQuota) {
        this.ResourceQuota = ResourceQuota;
    }

    /**
     * Get <p>限制范围。</p> 
     * @return LimitRange <p>限制范围。</p>
     */
    public LimitRange getLimitRange() {
        return this.LimitRange;
    }

    /**
     * Set <p>限制范围。</p>
     * @param LimitRange <p>限制范围。</p>
     */
    public void setLimitRange(LimitRange LimitRange) {
        this.LimitRange = LimitRange;
    }

    /**
     * Get <p>系统节点池实例规格。详情参见<a href="https://cloud.tencent.com/document/product/213/11518">实例规格</a>描述</p> 
     * @return SystemNodeInstanceType <p>系统节点池实例规格。详情参见<a href="https://cloud.tencent.com/document/product/213/11518">实例规格</a>描述</p>
     */
    public String getSystemNodeInstanceType() {
        return this.SystemNodeInstanceType;
    }

    /**
     * Set <p>系统节点池实例规格。详情参见<a href="https://cloud.tencent.com/document/product/213/11518">实例规格</a>描述</p>
     * @param SystemNodeInstanceType <p>系统节点池实例规格。详情参见<a href="https://cloud.tencent.com/document/product/213/11518">实例规格</a>描述</p>
     */
    public void setSystemNodeInstanceType(String SystemNodeInstanceType) {
        this.SystemNodeInstanceType = SystemNodeInstanceType;
    }

    /**
     * Get <p>系统节点池实例数量。</p> 
     * @return SystemNodeCount <p>系统节点池实例数量。</p>
     */
    public Long getSystemNodeCount() {
        return this.SystemNodeCount;
    }

    /**
     * Set <p>系统节点池实例数量。</p>
     * @param SystemNodeCount <p>系统节点池实例数量。</p>
     */
    public void setSystemNodeCount(Long SystemNodeCount) {
        this.SystemNodeCount = SystemNodeCount;
    }

    /**
     * Get <p>纳管环境自动升配</p> 
     * @return AutoUpgradeClusterLevel <p>纳管环境自动升配</p>
     */
    public Boolean getAutoUpgradeClusterLevel() {
        return this.AutoUpgradeClusterLevel;
    }

    /**
     * Set <p>纳管环境自动升配</p>
     * @param AutoUpgradeClusterLevel <p>纳管环境自动升配</p>
     */
    public void setAutoUpgradeClusterLevel(Boolean AutoUpgradeClusterLevel) {
        this.AutoUpgradeClusterLevel = AutoUpgradeClusterLevel;
    }

    public ClusterOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterOption(ClusterOption source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ServiceCidr != null) {
            this.ServiceCidr = new String(source.ServiceCidr);
        }
        if (source.ResourceQuota != null) {
            this.ResourceQuota = new ResourceQuota(source.ResourceQuota);
        }
        if (source.LimitRange != null) {
            this.LimitRange = new LimitRange(source.LimitRange);
        }
        if (source.SystemNodeInstanceType != null) {
            this.SystemNodeInstanceType = new String(source.SystemNodeInstanceType);
        }
        if (source.SystemNodeCount != null) {
            this.SystemNodeCount = new Long(source.SystemNodeCount);
        }
        if (source.AutoUpgradeClusterLevel != null) {
            this.AutoUpgradeClusterLevel = new Boolean(source.AutoUpgradeClusterLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ServiceCidr", this.ServiceCidr);
        this.setParamObj(map, prefix + "ResourceQuota.", this.ResourceQuota);
        this.setParamObj(map, prefix + "LimitRange.", this.LimitRange);
        this.setParamSimple(map, prefix + "SystemNodeInstanceType", this.SystemNodeInstanceType);
        this.setParamSimple(map, prefix + "SystemNodeCount", this.SystemNodeCount);
        this.setParamSimple(map, prefix + "AutoUpgradeClusterLevel", this.AutoUpgradeClusterLevel);

    }
}

