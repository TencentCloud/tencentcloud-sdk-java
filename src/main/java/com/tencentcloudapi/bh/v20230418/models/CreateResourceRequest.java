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
    * 部署region
    */
    @SerializedName("DeployRegion")
    @Expose
    private String DeployRegion;

    /**
    * 部署堡垒机的VpcId
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 部署堡垒机的SubnetId
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 资源类型。取值:standard/pro
    */
    @SerializedName("ResourceEdition")
    @Expose
    private String ResourceEdition;

    /**
    * 资源节点数
    */
    @SerializedName("ResourceNode")
    @Expose
    private Long ResourceNode;

    /**
    * 计费周期
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 计费时长
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 计费模式 1预付费
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 自动续费
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 部署zone
    */
    @SerializedName("DeployZone")
    @Expose
    private String DeployZone;

    /**
    * 0非试用版，1试用版
    */
    @SerializedName("Trial")
    @Expose
    private Long Trial;

    /**
    * 是否共享clb，0：不共享，1：共享
    */
    @SerializedName("ShareClb")
    @Expose
    private Long ShareClb;

    /**
     * Get 部署region 
     * @return DeployRegion 部署region
     */
    public String getDeployRegion() {
        return this.DeployRegion;
    }

    /**
     * Set 部署region
     * @param DeployRegion 部署region
     */
    public void setDeployRegion(String DeployRegion) {
        this.DeployRegion = DeployRegion;
    }

    /**
     * Get 部署堡垒机的VpcId 
     * @return VpcId 部署堡垒机的VpcId
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 部署堡垒机的VpcId
     * @param VpcId 部署堡垒机的VpcId
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 部署堡垒机的SubnetId 
     * @return SubnetId 部署堡垒机的SubnetId
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 部署堡垒机的SubnetId
     * @param SubnetId 部署堡垒机的SubnetId
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 资源类型。取值:standard/pro 
     * @return ResourceEdition 资源类型。取值:standard/pro
     */
    public String getResourceEdition() {
        return this.ResourceEdition;
    }

    /**
     * Set 资源类型。取值:standard/pro
     * @param ResourceEdition 资源类型。取值:standard/pro
     */
    public void setResourceEdition(String ResourceEdition) {
        this.ResourceEdition = ResourceEdition;
    }

    /**
     * Get 资源节点数 
     * @return ResourceNode 资源节点数
     */
    public Long getResourceNode() {
        return this.ResourceNode;
    }

    /**
     * Set 资源节点数
     * @param ResourceNode 资源节点数
     */
    public void setResourceNode(Long ResourceNode) {
        this.ResourceNode = ResourceNode;
    }

    /**
     * Get 计费周期 
     * @return TimeUnit 计费周期
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 计费周期
     * @param TimeUnit 计费周期
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 计费时长 
     * @return TimeSpan 计费时长
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 计费时长
     * @param TimeSpan 计费时长
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 计费模式 1预付费 
     * @return PayMode 计费模式 1预付费
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 计费模式 1预付费
     * @param PayMode 计费模式 1预付费
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 自动续费 
     * @return AutoRenewFlag 自动续费
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费
     * @param AutoRenewFlag 自动续费
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 部署zone 
     * @return DeployZone 部署zone
     */
    public String getDeployZone() {
        return this.DeployZone;
    }

    /**
     * Set 部署zone
     * @param DeployZone 部署zone
     */
    public void setDeployZone(String DeployZone) {
        this.DeployZone = DeployZone;
    }

    /**
     * Get 0非试用版，1试用版 
     * @return Trial 0非试用版，1试用版
     */
    public Long getTrial() {
        return this.Trial;
    }

    /**
     * Set 0非试用版，1试用版
     * @param Trial 0非试用版，1试用版
     */
    public void setTrial(Long Trial) {
        this.Trial = Trial;
    }

    /**
     * Get 是否共享clb，0：不共享，1：共享 
     * @return ShareClb 是否共享clb，0：不共享，1：共享
     */
    public Long getShareClb() {
        return this.ShareClb;
    }

    /**
     * Set 是否共享clb，0：不共享，1：共享
     * @param ShareClb 是否共享clb，0：不共享，1：共享
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
        this.setParamSimple(map, prefix + "DeployZone", this.DeployZone);
        this.setParamSimple(map, prefix + "Trial", this.Trial);
        this.setParamSimple(map, prefix + "ShareClb", this.ShareClb);

    }
}

