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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyResourceRequest extends AbstractModel {

    /**
    * <p>需要开通服务的资源ID</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>实例版本</p>
    */
    @SerializedName("ResourceEdition")
    @Expose
    private String ResourceEdition;

    /**
    * <p>资源节点数</p>
    */
    @SerializedName("ResourceNode")
    @Expose
    private Long ResourceNode;

    /**
    * <p>自动续费</p>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>带宽扩展包个数(4M)</p>
    */
    @SerializedName("PackageBandwidth")
    @Expose
    private Long PackageBandwidth;

    /**
    * <p>授权点数扩展包个数(50点)</p>
    */
    @SerializedName("PackageNode")
    @Expose
    private Long PackageNode;

    /**
    * <p>日志投递</p>
    */
    @SerializedName("LogDelivery")
    @Expose
    private Long LogDelivery;

    /**
    * <p>零信任堡垒机功能包</p><p>枚举值：</p><ul><li>0： 不开通</li><li>1： 付费版（含 20 用户 / 10Mbps 带宽）</li></ul><p>默认值：0</p>
    */
    @SerializedName("IOAResource")
    @Expose
    private Long IOAResource;

    /**
    * <p>零信任用户扩展包，1 个 = 20 用户</p><p>取值范围：[0, 999]</p>
    */
    @SerializedName("PackageIOAUserCount")
    @Expose
    private Long PackageIOAUserCount;

    /**
    * <p>零信任带宽扩展包，1 个 = 4Mbps</p><p>取值范围：[0, 509]</p>
    */
    @SerializedName("PackageIOABandwidth")
    @Expose
    private Long PackageIOABandwidth;

    /**
     * Get <p>需要开通服务的资源ID</p> 
     * @return ResourceId <p>需要开通服务的资源ID</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>需要开通服务的资源ID</p>
     * @param ResourceId <p>需要开通服务的资源ID</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>状态</p> 
     * @return Status <p>状态</p>
     * @deprecated
     */
    @Deprecated
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态</p>
     * @param Status <p>状态</p>
     * @deprecated
     */
    @Deprecated
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>实例版本</p> 
     * @return ResourceEdition <p>实例版本</p>
     */
    public String getResourceEdition() {
        return this.ResourceEdition;
    }

    /**
     * Set <p>实例版本</p>
     * @param ResourceEdition <p>实例版本</p>
     */
    public void setResourceEdition(String ResourceEdition) {
        this.ResourceEdition = ResourceEdition;
    }

    /**
     * Get <p>资源节点数</p> 
     * @return ResourceNode <p>资源节点数</p>
     */
    public Long getResourceNode() {
        return this.ResourceNode;
    }

    /**
     * Set <p>资源节点数</p>
     * @param ResourceNode <p>资源节点数</p>
     */
    public void setResourceNode(Long ResourceNode) {
        this.ResourceNode = ResourceNode;
    }

    /**
     * Get <p>自动续费</p> 
     * @return AutoRenewFlag <p>自动续费</p>
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>自动续费</p>
     * @param AutoRenewFlag <p>自动续费</p>
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>带宽扩展包个数(4M)</p> 
     * @return PackageBandwidth <p>带宽扩展包个数(4M)</p>
     */
    public Long getPackageBandwidth() {
        return this.PackageBandwidth;
    }

    /**
     * Set <p>带宽扩展包个数(4M)</p>
     * @param PackageBandwidth <p>带宽扩展包个数(4M)</p>
     */
    public void setPackageBandwidth(Long PackageBandwidth) {
        this.PackageBandwidth = PackageBandwidth;
    }

    /**
     * Get <p>授权点数扩展包个数(50点)</p> 
     * @return PackageNode <p>授权点数扩展包个数(50点)</p>
     */
    public Long getPackageNode() {
        return this.PackageNode;
    }

    /**
     * Set <p>授权点数扩展包个数(50点)</p>
     * @param PackageNode <p>授权点数扩展包个数(50点)</p>
     */
    public void setPackageNode(Long PackageNode) {
        this.PackageNode = PackageNode;
    }

    /**
     * Get <p>日志投递</p> 
     * @return LogDelivery <p>日志投递</p>
     */
    public Long getLogDelivery() {
        return this.LogDelivery;
    }

    /**
     * Set <p>日志投递</p>
     * @param LogDelivery <p>日志投递</p>
     */
    public void setLogDelivery(Long LogDelivery) {
        this.LogDelivery = LogDelivery;
    }

    /**
     * Get <p>零信任堡垒机功能包</p><p>枚举值：</p><ul><li>0： 不开通</li><li>1： 付费版（含 20 用户 / 10Mbps 带宽）</li></ul><p>默认值：0</p> 
     * @return IOAResource <p>零信任堡垒机功能包</p><p>枚举值：</p><ul><li>0： 不开通</li><li>1： 付费版（含 20 用户 / 10Mbps 带宽）</li></ul><p>默认值：0</p>
     */
    public Long getIOAResource() {
        return this.IOAResource;
    }

    /**
     * Set <p>零信任堡垒机功能包</p><p>枚举值：</p><ul><li>0： 不开通</li><li>1： 付费版（含 20 用户 / 10Mbps 带宽）</li></ul><p>默认值：0</p>
     * @param IOAResource <p>零信任堡垒机功能包</p><p>枚举值：</p><ul><li>0： 不开通</li><li>1： 付费版（含 20 用户 / 10Mbps 带宽）</li></ul><p>默认值：0</p>
     */
    public void setIOAResource(Long IOAResource) {
        this.IOAResource = IOAResource;
    }

    /**
     * Get <p>零信任用户扩展包，1 个 = 20 用户</p><p>取值范围：[0, 999]</p> 
     * @return PackageIOAUserCount <p>零信任用户扩展包，1 个 = 20 用户</p><p>取值范围：[0, 999]</p>
     */
    public Long getPackageIOAUserCount() {
        return this.PackageIOAUserCount;
    }

    /**
     * Set <p>零信任用户扩展包，1 个 = 20 用户</p><p>取值范围：[0, 999]</p>
     * @param PackageIOAUserCount <p>零信任用户扩展包，1 个 = 20 用户</p><p>取值范围：[0, 999]</p>
     */
    public void setPackageIOAUserCount(Long PackageIOAUserCount) {
        this.PackageIOAUserCount = PackageIOAUserCount;
    }

    /**
     * Get <p>零信任带宽扩展包，1 个 = 4Mbps</p><p>取值范围：[0, 509]</p> 
     * @return PackageIOABandwidth <p>零信任带宽扩展包，1 个 = 4Mbps</p><p>取值范围：[0, 509]</p>
     */
    public Long getPackageIOABandwidth() {
        return this.PackageIOABandwidth;
    }

    /**
     * Set <p>零信任带宽扩展包，1 个 = 4Mbps</p><p>取值范围：[0, 509]</p>
     * @param PackageIOABandwidth <p>零信任带宽扩展包，1 个 = 4Mbps</p><p>取值范围：[0, 509]</p>
     */
    public void setPackageIOABandwidth(Long PackageIOABandwidth) {
        this.PackageIOABandwidth = PackageIOABandwidth;
    }

    public ModifyResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyResourceRequest(ModifyResourceRequest source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ResourceEdition != null) {
            this.ResourceEdition = new String(source.ResourceEdition);
        }
        if (source.ResourceNode != null) {
            this.ResourceNode = new Long(source.ResourceNode);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.PackageBandwidth != null) {
            this.PackageBandwidth = new Long(source.PackageBandwidth);
        }
        if (source.PackageNode != null) {
            this.PackageNode = new Long(source.PackageNode);
        }
        if (source.LogDelivery != null) {
            this.LogDelivery = new Long(source.LogDelivery);
        }
        if (source.IOAResource != null) {
            this.IOAResource = new Long(source.IOAResource);
        }
        if (source.PackageIOAUserCount != null) {
            this.PackageIOAUserCount = new Long(source.PackageIOAUserCount);
        }
        if (source.PackageIOABandwidth != null) {
            this.PackageIOABandwidth = new Long(source.PackageIOABandwidth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ResourceEdition", this.ResourceEdition);
        this.setParamSimple(map, prefix + "ResourceNode", this.ResourceNode);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "PackageBandwidth", this.PackageBandwidth);
        this.setParamSimple(map, prefix + "PackageNode", this.PackageNode);
        this.setParamSimple(map, prefix + "LogDelivery", this.LogDelivery);
        this.setParamSimple(map, prefix + "IOAResource", this.IOAResource);
        this.setParamSimple(map, prefix + "PackageIOAUserCount", this.PackageIOAUserCount);
        this.setParamSimple(map, prefix + "PackageIOABandwidth", this.PackageIOABandwidth);

    }
}

