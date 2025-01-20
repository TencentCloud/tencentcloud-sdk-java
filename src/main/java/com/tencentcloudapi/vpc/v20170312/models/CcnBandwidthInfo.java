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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CcnBandwidthInfo extends AbstractModel {

    /**
    * 带宽所属的云联网ID。
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * 实例的创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 实例的过期时间
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * 带宽实例的唯一ID。
    */
    @SerializedName("RegionFlowControlId")
    @Expose
    private String RegionFlowControlId;

    /**
    * 带宽是否自动续费的标记。
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * 描述带宽的地域和限速上限信息。在地域间限速的情况下才会返回参数，出口限速模式不返回。
    */
    @SerializedName("CcnRegionBandwidthLimit")
    @Expose
    private CcnRegionBandwidthLimit CcnRegionBandwidthLimit;

    /**
    * 云市场实例ID。
    */
    @SerializedName("MarketId")
    @Expose
    private String MarketId;

    /**
    * 资源绑定的标签列表
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * `true表示`Qos默认带宽；`false`表示非Qos默认带宽；
    */
    @SerializedName("DefaultQosBandwidthFlag")
    @Expose
    private Boolean DefaultQosBandwidthFlag;

    /**
    * 服务等级信息。
    */
    @SerializedName("QosLevel")
    @Expose
    private String QosLevel;

    /**
     * Get 带宽所属的云联网ID。 
     * @return CcnId 带宽所属的云联网ID。
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set 带宽所属的云联网ID。
     * @param CcnId 带宽所属的云联网ID。
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get 实例的创建时间。 
     * @return CreatedTime 实例的创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 实例的创建时间。
     * @param CreatedTime 实例的创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 实例的过期时间 
     * @return ExpiredTime 实例的过期时间
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 实例的过期时间
     * @param ExpiredTime 实例的过期时间
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get 带宽实例的唯一ID。 
     * @return RegionFlowControlId 带宽实例的唯一ID。
     */
    public String getRegionFlowControlId() {
        return this.RegionFlowControlId;
    }

    /**
     * Set 带宽实例的唯一ID。
     * @param RegionFlowControlId 带宽实例的唯一ID。
     */
    public void setRegionFlowControlId(String RegionFlowControlId) {
        this.RegionFlowControlId = RegionFlowControlId;
    }

    /**
     * Get 带宽是否自动续费的标记。 
     * @return RenewFlag 带宽是否自动续费的标记。
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 带宽是否自动续费的标记。
     * @param RenewFlag 带宽是否自动续费的标记。
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 描述带宽的地域和限速上限信息。在地域间限速的情况下才会返回参数，出口限速模式不返回。 
     * @return CcnRegionBandwidthLimit 描述带宽的地域和限速上限信息。在地域间限速的情况下才会返回参数，出口限速模式不返回。
     */
    public CcnRegionBandwidthLimit getCcnRegionBandwidthLimit() {
        return this.CcnRegionBandwidthLimit;
    }

    /**
     * Set 描述带宽的地域和限速上限信息。在地域间限速的情况下才会返回参数，出口限速模式不返回。
     * @param CcnRegionBandwidthLimit 描述带宽的地域和限速上限信息。在地域间限速的情况下才会返回参数，出口限速模式不返回。
     */
    public void setCcnRegionBandwidthLimit(CcnRegionBandwidthLimit CcnRegionBandwidthLimit) {
        this.CcnRegionBandwidthLimit = CcnRegionBandwidthLimit;
    }

    /**
     * Get 云市场实例ID。 
     * @return MarketId 云市场实例ID。
     */
    public String getMarketId() {
        return this.MarketId;
    }

    /**
     * Set 云市场实例ID。
     * @param MarketId 云市场实例ID。
     */
    public void setMarketId(String MarketId) {
        this.MarketId = MarketId;
    }

    /**
     * Get 资源绑定的标签列表 
     * @return TagSet 资源绑定的标签列表
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 资源绑定的标签列表
     * @param TagSet 资源绑定的标签列表
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get `true表示`Qos默认带宽；`false`表示非Qos默认带宽； 
     * @return DefaultQosBandwidthFlag `true表示`Qos默认带宽；`false`表示非Qos默认带宽；
     */
    public Boolean getDefaultQosBandwidthFlag() {
        return this.DefaultQosBandwidthFlag;
    }

    /**
     * Set `true表示`Qos默认带宽；`false`表示非Qos默认带宽；
     * @param DefaultQosBandwidthFlag `true表示`Qos默认带宽；`false`表示非Qos默认带宽；
     */
    public void setDefaultQosBandwidthFlag(Boolean DefaultQosBandwidthFlag) {
        this.DefaultQosBandwidthFlag = DefaultQosBandwidthFlag;
    }

    /**
     * Get 服务等级信息。 
     * @return QosLevel 服务等级信息。
     */
    public String getQosLevel() {
        return this.QosLevel;
    }

    /**
     * Set 服务等级信息。
     * @param QosLevel 服务等级信息。
     */
    public void setQosLevel(String QosLevel) {
        this.QosLevel = QosLevel;
    }

    public CcnBandwidthInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CcnBandwidthInfo(CcnBandwidthInfo source) {
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.RegionFlowControlId != null) {
            this.RegionFlowControlId = new String(source.RegionFlowControlId);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.CcnRegionBandwidthLimit != null) {
            this.CcnRegionBandwidthLimit = new CcnRegionBandwidthLimit(source.CcnRegionBandwidthLimit);
        }
        if (source.MarketId != null) {
            this.MarketId = new String(source.MarketId);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
        if (source.DefaultQosBandwidthFlag != null) {
            this.DefaultQosBandwidthFlag = new Boolean(source.DefaultQosBandwidthFlag);
        }
        if (source.QosLevel != null) {
            this.QosLevel = new String(source.QosLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "RegionFlowControlId", this.RegionFlowControlId);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamObj(map, prefix + "CcnRegionBandwidthLimit.", this.CcnRegionBandwidthLimit);
        this.setParamSimple(map, prefix + "MarketId", this.MarketId);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "DefaultQosBandwidthFlag", this.DefaultQosBandwidthFlag);
        this.setParamSimple(map, prefix + "QosLevel", this.QosLevel);

    }
}

