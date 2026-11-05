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

public class CreateResourceRequest extends AbstractModel {

    /**
    * <p>部署region</p>
    */
    @SerializedName("DeployRegion")
    @Expose
    private String DeployRegion;

    /**
    * <p>部署堡垒机的VpcId</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>部署堡垒机的SubnetId</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>资源类型。取值:standard/pro</p>
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
    * <p>计费周期</p>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * <p>计费时长</p>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * <p>计费模式 1预付费</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>自动续费</p>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>零信任堡垒机功能包</p><p>枚举值：</p><ul><li>0： 不开通</li><li>1： 付费版（含 20 用户 / 10Mbps 带宽）</li></ul>
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
    * <p>部署zone</p>
    */
    @SerializedName("DeployZone")
    @Expose
    private String DeployZone;

    /**
    * <p>0非试用版，1试用版</p>
    */
    @SerializedName("Trial")
    @Expose
    private Long Trial;

    /**
    * <p>是否共享clb</p><p>枚举值：</p><ul><li>0： 不共享</li><li>1： 共享</li></ul><p>默认值：0</p><p>公有云传0</p>
    */
    @SerializedName("ShareClb")
    @Expose
    private Long ShareClb;

    /**
     * Get <p>部署region</p> 
     * @return DeployRegion <p>部署region</p>
     */
    public String getDeployRegion() {
        return this.DeployRegion;
    }

    /**
     * Set <p>部署region</p>
     * @param DeployRegion <p>部署region</p>
     */
    public void setDeployRegion(String DeployRegion) {
        this.DeployRegion = DeployRegion;
    }

    /**
     * Get <p>部署堡垒机的VpcId</p> 
     * @return VpcId <p>部署堡垒机的VpcId</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>部署堡垒机的VpcId</p>
     * @param VpcId <p>部署堡垒机的VpcId</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>部署堡垒机的SubnetId</p> 
     * @return SubnetId <p>部署堡垒机的SubnetId</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>部署堡垒机的SubnetId</p>
     * @param SubnetId <p>部署堡垒机的SubnetId</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>资源类型。取值:standard/pro</p> 
     * @return ResourceEdition <p>资源类型。取值:standard/pro</p>
     */
    public String getResourceEdition() {
        return this.ResourceEdition;
    }

    /**
     * Set <p>资源类型。取值:standard/pro</p>
     * @param ResourceEdition <p>资源类型。取值:standard/pro</p>
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
     * Get <p>计费周期</p> 
     * @return TimeUnit <p>计费周期</p>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set <p>计费周期</p>
     * @param TimeUnit <p>计费周期</p>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get <p>计费时长</p> 
     * @return TimeSpan <p>计费时长</p>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set <p>计费时长</p>
     * @param TimeSpan <p>计费时长</p>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get <p>计费模式 1预付费</p> 
     * @return PayMode <p>计费模式 1预付费</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>计费模式 1预付费</p>
     * @param PayMode <p>计费模式 1预付费</p>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
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
     * Get <p>零信任堡垒机功能包</p><p>枚举值：</p><ul><li>0： 不开通</li><li>1： 付费版（含 20 用户 / 10Mbps 带宽）</li></ul> 
     * @return IOAResource <p>零信任堡垒机功能包</p><p>枚举值：</p><ul><li>0： 不开通</li><li>1： 付费版（含 20 用户 / 10Mbps 带宽）</li></ul>
     */
    public Long getIOAResource() {
        return this.IOAResource;
    }

    /**
     * Set <p>零信任堡垒机功能包</p><p>枚举值：</p><ul><li>0： 不开通</li><li>1： 付费版（含 20 用户 / 10Mbps 带宽）</li></ul>
     * @param IOAResource <p>零信任堡垒机功能包</p><p>枚举值：</p><ul><li>0： 不开通</li><li>1： 付费版（含 20 用户 / 10Mbps 带宽）</li></ul>
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

    /**
     * Get <p>部署zone</p> 
     * @return DeployZone <p>部署zone</p>
     */
    public String getDeployZone() {
        return this.DeployZone;
    }

    /**
     * Set <p>部署zone</p>
     * @param DeployZone <p>部署zone</p>
     */
    public void setDeployZone(String DeployZone) {
        this.DeployZone = DeployZone;
    }

    /**
     * Get <p>0非试用版，1试用版</p> 
     * @return Trial <p>0非试用版，1试用版</p>
     */
    public Long getTrial() {
        return this.Trial;
    }

    /**
     * Set <p>0非试用版，1试用版</p>
     * @param Trial <p>0非试用版，1试用版</p>
     */
    public void setTrial(Long Trial) {
        this.Trial = Trial;
    }

    /**
     * Get <p>是否共享clb</p><p>枚举值：</p><ul><li>0： 不共享</li><li>1： 共享</li></ul><p>默认值：0</p><p>公有云传0</p> 
     * @return ShareClb <p>是否共享clb</p><p>枚举值：</p><ul><li>0： 不共享</li><li>1： 共享</li></ul><p>默认值：0</p><p>公有云传0</p>
     */
    public Long getShareClb() {
        return this.ShareClb;
    }

    /**
     * Set <p>是否共享clb</p><p>枚举值：</p><ul><li>0： 不共享</li><li>1： 共享</li></ul><p>默认值：0</p><p>公有云传0</p>
     * @param ShareClb <p>是否共享clb</p><p>枚举值：</p><ul><li>0： 不共享</li><li>1： 共享</li></ul><p>默认值：0</p><p>公有云传0</p>
     */
    public void setShareClb(Long ShareClb) {
        this.ShareClb = ShareClb;
    }

    public CreateResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateResourceRequest(CreateResourceRequest source) {
        if (source.DeployRegion != null) {
            this.DeployRegion = new String(source.DeployRegion);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ResourceEdition != null) {
            this.ResourceEdition = new String(source.ResourceEdition);
        }
        if (source.ResourceNode != null) {
            this.ResourceNode = new Long(source.ResourceNode);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
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
        if (source.DeployZone != null) {
            this.DeployZone = new String(source.DeployZone);
        }
        if (source.Trial != null) {
            this.Trial = new Long(source.Trial);
        }
        if (source.ShareClb != null) {
            this.ShareClb = new Long(source.ShareClb);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeployRegion", this.DeployRegion);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ResourceEdition", this.ResourceEdition);
        this.setParamSimple(map, prefix + "ResourceNode", this.ResourceNode);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "IOAResource", this.IOAResource);
        this.setParamSimple(map, prefix + "PackageIOAUserCount", this.PackageIOAUserCount);
        this.setParamSimple(map, prefix + "PackageIOABandwidth", this.PackageIOABandwidth);
        this.setParamSimple(map, prefix + "DeployZone", this.DeployZone);
        this.setParamSimple(map, prefix + "Trial", this.Trial);
        this.setParamSimple(map, prefix + "ShareClb", this.ShareClb);

    }
}

