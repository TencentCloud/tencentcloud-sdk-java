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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoGroup extends AbstractModel {

    /**
    * <p>只读组模式，可选值为：alone-系统自动分配只读组；allinone-新建只读组；join-使用现有只读组。</p>
    */
    @SerializedName("RoGroupMode")
    @Expose
    private String RoGroupMode;

    /**
    * <p>只读组 ID。<br>说明：若此数据结构在购买实例操作中被使用，则当只读组模式选择 join 时，此项为必填。</p>
    */
    @SerializedName("RoGroupId")
    @Expose
    private String RoGroupId;

    /**
    * <p>只读组名称。</p>
    */
    @SerializedName("RoGroupName")
    @Expose
    private String RoGroupName;

    /**
    * <p>是否启用延迟超限剔除功能，启用该功能后，只读实例与主实例的延迟超过延迟阈值，只读实例将被隔离。可选值：1-启用；0-不启用。</p>
    */
    @SerializedName("RoOfflineDelay")
    @Expose
    private Long RoOfflineDelay;

    /**
    * <p>延迟阈值。单位：秒。值范围：1-10000，整数。</p>
    */
    @SerializedName("RoMaxDelayTime")
    @Expose
    private Long RoMaxDelayTime;

    /**
    * <p>最少实例保留个数，若购买只读实例数量小于设置数量将不做剔除。</p>
    */
    @SerializedName("MinRoInGroup")
    @Expose
    private Long MinRoInGroup;

    /**
    * <p>读写权重分配模式，可选值：system-系统自动分配；custom-自定义。</p>
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * <p>该字段已经废弃，无意义。查看只读实例的权重，请查看 RoInstances 字段里的 Weight 值。</p>
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * <p>只读组中的只读实例详情。</p>
    */
    @SerializedName("RoInstances")
    @Expose
    private RoInstanceInfo [] RoInstances;

    /**
    * <p>只读组的内网 IP。</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>只读组的内网端口号。</p>
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * <p>私有网络 ID。</p>
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * <p>子网 ID。</p>
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * <p>只读组所在的地域。</p>
    */
    @SerializedName("RoGroupRegion")
    @Expose
    private String RoGroupRegion;

    /**
    * <p>只读组所在的可用区。</p>
    */
    @SerializedName("RoGroupZone")
    @Expose
    private String RoGroupZone;

    /**
    * <p>延迟复制时间。单位：秒。值范围：1-259200，整数。</p>
    */
    @SerializedName("DelayReplicationTime")
    @Expose
    private Long DelayReplicationTime;

    /**
     * Get <p>只读组模式，可选值为：alone-系统自动分配只读组；allinone-新建只读组；join-使用现有只读组。</p> 
     * @return RoGroupMode <p>只读组模式，可选值为：alone-系统自动分配只读组；allinone-新建只读组；join-使用现有只读组。</p>
     */
    public String getRoGroupMode() {
        return this.RoGroupMode;
    }

    /**
     * Set <p>只读组模式，可选值为：alone-系统自动分配只读组；allinone-新建只读组；join-使用现有只读组。</p>
     * @param RoGroupMode <p>只读组模式，可选值为：alone-系统自动分配只读组；allinone-新建只读组；join-使用现有只读组。</p>
     */
    public void setRoGroupMode(String RoGroupMode) {
        this.RoGroupMode = RoGroupMode;
    }

    /**
     * Get <p>只读组 ID。<br>说明：若此数据结构在购买实例操作中被使用，则当只读组模式选择 join 时，此项为必填。</p> 
     * @return RoGroupId <p>只读组 ID。<br>说明：若此数据结构在购买实例操作中被使用，则当只读组模式选择 join 时，此项为必填。</p>
     */
    public String getRoGroupId() {
        return this.RoGroupId;
    }

    /**
     * Set <p>只读组 ID。<br>说明：若此数据结构在购买实例操作中被使用，则当只读组模式选择 join 时，此项为必填。</p>
     * @param RoGroupId <p>只读组 ID。<br>说明：若此数据结构在购买实例操作中被使用，则当只读组模式选择 join 时，此项为必填。</p>
     */
    public void setRoGroupId(String RoGroupId) {
        this.RoGroupId = RoGroupId;
    }

    /**
     * Get <p>只读组名称。</p> 
     * @return RoGroupName <p>只读组名称。</p>
     */
    public String getRoGroupName() {
        return this.RoGroupName;
    }

    /**
     * Set <p>只读组名称。</p>
     * @param RoGroupName <p>只读组名称。</p>
     */
    public void setRoGroupName(String RoGroupName) {
        this.RoGroupName = RoGroupName;
    }

    /**
     * Get <p>是否启用延迟超限剔除功能，启用该功能后，只读实例与主实例的延迟超过延迟阈值，只读实例将被隔离。可选值：1-启用；0-不启用。</p> 
     * @return RoOfflineDelay <p>是否启用延迟超限剔除功能，启用该功能后，只读实例与主实例的延迟超过延迟阈值，只读实例将被隔离。可选值：1-启用；0-不启用。</p>
     */
    public Long getRoOfflineDelay() {
        return this.RoOfflineDelay;
    }

    /**
     * Set <p>是否启用延迟超限剔除功能，启用该功能后，只读实例与主实例的延迟超过延迟阈值，只读实例将被隔离。可选值：1-启用；0-不启用。</p>
     * @param RoOfflineDelay <p>是否启用延迟超限剔除功能，启用该功能后，只读实例与主实例的延迟超过延迟阈值，只读实例将被隔离。可选值：1-启用；0-不启用。</p>
     */
    public void setRoOfflineDelay(Long RoOfflineDelay) {
        this.RoOfflineDelay = RoOfflineDelay;
    }

    /**
     * Get <p>延迟阈值。单位：秒。值范围：1-10000，整数。</p> 
     * @return RoMaxDelayTime <p>延迟阈值。单位：秒。值范围：1-10000，整数。</p>
     */
    public Long getRoMaxDelayTime() {
        return this.RoMaxDelayTime;
    }

    /**
     * Set <p>延迟阈值。单位：秒。值范围：1-10000，整数。</p>
     * @param RoMaxDelayTime <p>延迟阈值。单位：秒。值范围：1-10000，整数。</p>
     */
    public void setRoMaxDelayTime(Long RoMaxDelayTime) {
        this.RoMaxDelayTime = RoMaxDelayTime;
    }

    /**
     * Get <p>最少实例保留个数，若购买只读实例数量小于设置数量将不做剔除。</p> 
     * @return MinRoInGroup <p>最少实例保留个数，若购买只读实例数量小于设置数量将不做剔除。</p>
     */
    public Long getMinRoInGroup() {
        return this.MinRoInGroup;
    }

    /**
     * Set <p>最少实例保留个数，若购买只读实例数量小于设置数量将不做剔除。</p>
     * @param MinRoInGroup <p>最少实例保留个数，若购买只读实例数量小于设置数量将不做剔除。</p>
     */
    public void setMinRoInGroup(Long MinRoInGroup) {
        this.MinRoInGroup = MinRoInGroup;
    }

    /**
     * Get <p>读写权重分配模式，可选值：system-系统自动分配；custom-自定义。</p> 
     * @return WeightMode <p>读写权重分配模式，可选值：system-系统自动分配；custom-自定义。</p>
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set <p>读写权重分配模式，可选值：system-系统自动分配；custom-自定义。</p>
     * @param WeightMode <p>读写权重分配模式，可选值：system-系统自动分配；custom-自定义。</p>
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Get <p>该字段已经废弃，无意义。查看只读实例的权重，请查看 RoInstances 字段里的 Weight 值。</p> 
     * @return Weight <p>该字段已经废弃，无意义。查看只读实例的权重，请查看 RoInstances 字段里的 Weight 值。</p>
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set <p>该字段已经废弃，无意义。查看只读实例的权重，请查看 RoInstances 字段里的 Weight 值。</p>
     * @param Weight <p>该字段已经废弃，无意义。查看只读实例的权重，请查看 RoInstances 字段里的 Weight 值。</p>
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get <p>只读组中的只读实例详情。</p> 
     * @return RoInstances <p>只读组中的只读实例详情。</p>
     */
    public RoInstanceInfo [] getRoInstances() {
        return this.RoInstances;
    }

    /**
     * Set <p>只读组中的只读实例详情。</p>
     * @param RoInstances <p>只读组中的只读实例详情。</p>
     */
    public void setRoInstances(RoInstanceInfo [] RoInstances) {
        this.RoInstances = RoInstances;
    }

    /**
     * Get <p>只读组的内网 IP。</p> 
     * @return Vip <p>只读组的内网 IP。</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>只读组的内网 IP。</p>
     * @param Vip <p>只读组的内网 IP。</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>只读组的内网端口号。</p> 
     * @return Vport <p>只读组的内网端口号。</p>
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set <p>只读组的内网端口号。</p>
     * @param Vport <p>只读组的内网端口号。</p>
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get <p>私有网络 ID。</p> 
     * @return UniqVpcId <p>私有网络 ID。</p>
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set <p>私有网络 ID。</p>
     * @param UniqVpcId <p>私有网络 ID。</p>
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get <p>子网 ID。</p> 
     * @return UniqSubnetId <p>子网 ID。</p>
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set <p>子网 ID。</p>
     * @param UniqSubnetId <p>子网 ID。</p>
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get <p>只读组所在的地域。</p> 
     * @return RoGroupRegion <p>只读组所在的地域。</p>
     */
    public String getRoGroupRegion() {
        return this.RoGroupRegion;
    }

    /**
     * Set <p>只读组所在的地域。</p>
     * @param RoGroupRegion <p>只读组所在的地域。</p>
     */
    public void setRoGroupRegion(String RoGroupRegion) {
        this.RoGroupRegion = RoGroupRegion;
    }

    /**
     * Get <p>只读组所在的可用区。</p> 
     * @return RoGroupZone <p>只读组所在的可用区。</p>
     */
    public String getRoGroupZone() {
        return this.RoGroupZone;
    }

    /**
     * Set <p>只读组所在的可用区。</p>
     * @param RoGroupZone <p>只读组所在的可用区。</p>
     */
    public void setRoGroupZone(String RoGroupZone) {
        this.RoGroupZone = RoGroupZone;
    }

    /**
     * Get <p>延迟复制时间。单位：秒。值范围：1-259200，整数。</p> 
     * @return DelayReplicationTime <p>延迟复制时间。单位：秒。值范围：1-259200，整数。</p>
     */
    public Long getDelayReplicationTime() {
        return this.DelayReplicationTime;
    }

    /**
     * Set <p>延迟复制时间。单位：秒。值范围：1-259200，整数。</p>
     * @param DelayReplicationTime <p>延迟复制时间。单位：秒。值范围：1-259200，整数。</p>
     */
    public void setDelayReplicationTime(Long DelayReplicationTime) {
        this.DelayReplicationTime = DelayReplicationTime;
    }

    public RoGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoGroup(RoGroup source) {
        if (source.RoGroupMode != null) {
            this.RoGroupMode = new String(source.RoGroupMode);
        }
        if (source.RoGroupId != null) {
            this.RoGroupId = new String(source.RoGroupId);
        }
        if (source.RoGroupName != null) {
            this.RoGroupName = new String(source.RoGroupName);
        }
        if (source.RoOfflineDelay != null) {
            this.RoOfflineDelay = new Long(source.RoOfflineDelay);
        }
        if (source.RoMaxDelayTime != null) {
            this.RoMaxDelayTime = new Long(source.RoMaxDelayTime);
        }
        if (source.MinRoInGroup != null) {
            this.MinRoInGroup = new Long(source.MinRoInGroup);
        }
        if (source.WeightMode != null) {
            this.WeightMode = new String(source.WeightMode);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.RoInstances != null) {
            this.RoInstances = new RoInstanceInfo[source.RoInstances.length];
            for (int i = 0; i < source.RoInstances.length; i++) {
                this.RoInstances[i] = new RoInstanceInfo(source.RoInstances[i]);
            }
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.RoGroupRegion != null) {
            this.RoGroupRegion = new String(source.RoGroupRegion);
        }
        if (source.RoGroupZone != null) {
            this.RoGroupZone = new String(source.RoGroupZone);
        }
        if (source.DelayReplicationTime != null) {
            this.DelayReplicationTime = new Long(source.DelayReplicationTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoGroupMode", this.RoGroupMode);
        this.setParamSimple(map, prefix + "RoGroupId", this.RoGroupId);
        this.setParamSimple(map, prefix + "RoGroupName", this.RoGroupName);
        this.setParamSimple(map, prefix + "RoOfflineDelay", this.RoOfflineDelay);
        this.setParamSimple(map, prefix + "RoMaxDelayTime", this.RoMaxDelayTime);
        this.setParamSimple(map, prefix + "MinRoInGroup", this.MinRoInGroup);
        this.setParamSimple(map, prefix + "WeightMode", this.WeightMode);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamArrayObj(map, prefix + "RoInstances.", this.RoInstances);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "RoGroupRegion", this.RoGroupRegion);
        this.setParamSimple(map, prefix + "RoGroupZone", this.RoGroupZone);
        this.setParamSimple(map, prefix + "DelayReplicationTime", this.DelayReplicationTime);

    }
}

