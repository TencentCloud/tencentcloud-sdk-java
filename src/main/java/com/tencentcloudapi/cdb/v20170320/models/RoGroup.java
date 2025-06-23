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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoGroup extends AbstractModel {

    /**
    * 只读组模式，可选值为：alone-系统自动分配只读组；allinone-新建只读组；join-使用现有只读组。
    */
    @SerializedName("RoGroupMode")
    @Expose
    private String RoGroupMode;

    /**
    * 只读组 ID。
说明：若此数据结构在购买实例操作中被使用，则当只读组模式选择 join 时，此项为必填。
    */
    @SerializedName("RoGroupId")
    @Expose
    private String RoGroupId;

    /**
    * 只读组名称。
    */
    @SerializedName("RoGroupName")
    @Expose
    private String RoGroupName;

    /**
    * 是否启用延迟超限剔除功能，启用该功能后，只读实例与主实例的延迟超过延迟阈值，只读实例将被隔离。可选值：1-启用；0-不启用。
    */
    @SerializedName("RoOfflineDelay")
    @Expose
    private Long RoOfflineDelay;

    /**
    * 延迟阈值。单位：秒。值范围：1-10000，整数。
    */
    @SerializedName("RoMaxDelayTime")
    @Expose
    private Long RoMaxDelayTime;

    /**
    * 最少实例保留个数，若购买只读实例数量小于设置数量将不做剔除。
    */
    @SerializedName("MinRoInGroup")
    @Expose
    private Long MinRoInGroup;

    /**
    * 读写权重分配模式，可选值：system-系统自动分配；custom-自定义。
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * 该字段已经废弃，无意义。查看只读实例的权重，请查看 RoInstances 字段里的 Weight 值。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 只读组中的只读实例详情。
    */
    @SerializedName("RoInstances")
    @Expose
    private RoInstanceInfo [] RoInstances;

    /**
    * 只读组的内网 IP。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 只读组的内网端口号。
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 私有网络 ID。
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 子网 ID。
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * 只读组所在的地域。
    */
    @SerializedName("RoGroupRegion")
    @Expose
    private String RoGroupRegion;

    /**
    * 只读组所在的可用区。
    */
    @SerializedName("RoGroupZone")
    @Expose
    private String RoGroupZone;

    /**
    * 延迟复制时间。单位：秒。值范围：1-259200，整数。
    */
    @SerializedName("DelayReplicationTime")
    @Expose
    private Long DelayReplicationTime;

    /**
     * Get 只读组模式，可选值为：alone-系统自动分配只读组；allinone-新建只读组；join-使用现有只读组。 
     * @return RoGroupMode 只读组模式，可选值为：alone-系统自动分配只读组；allinone-新建只读组；join-使用现有只读组。
     */
    public String getRoGroupMode() {
        return this.RoGroupMode;
    }

    /**
     * Set 只读组模式，可选值为：alone-系统自动分配只读组；allinone-新建只读组；join-使用现有只读组。
     * @param RoGroupMode 只读组模式，可选值为：alone-系统自动分配只读组；allinone-新建只读组；join-使用现有只读组。
     */
    public void setRoGroupMode(String RoGroupMode) {
        this.RoGroupMode = RoGroupMode;
    }

    /**
     * Get 只读组 ID。
说明：若此数据结构在购买实例操作中被使用，则当只读组模式选择 join 时，此项为必填。 
     * @return RoGroupId 只读组 ID。
说明：若此数据结构在购买实例操作中被使用，则当只读组模式选择 join 时，此项为必填。
     */
    public String getRoGroupId() {
        return this.RoGroupId;
    }

    /**
     * Set 只读组 ID。
说明：若此数据结构在购买实例操作中被使用，则当只读组模式选择 join 时，此项为必填。
     * @param RoGroupId 只读组 ID。
说明：若此数据结构在购买实例操作中被使用，则当只读组模式选择 join 时，此项为必填。
     */
    public void setRoGroupId(String RoGroupId) {
        this.RoGroupId = RoGroupId;
    }

    /**
     * Get 只读组名称。 
     * @return RoGroupName 只读组名称。
     */
    public String getRoGroupName() {
        return this.RoGroupName;
    }

    /**
     * Set 只读组名称。
     * @param RoGroupName 只读组名称。
     */
    public void setRoGroupName(String RoGroupName) {
        this.RoGroupName = RoGroupName;
    }

    /**
     * Get 是否启用延迟超限剔除功能，启用该功能后，只读实例与主实例的延迟超过延迟阈值，只读实例将被隔离。可选值：1-启用；0-不启用。 
     * @return RoOfflineDelay 是否启用延迟超限剔除功能，启用该功能后，只读实例与主实例的延迟超过延迟阈值，只读实例将被隔离。可选值：1-启用；0-不启用。
     */
    public Long getRoOfflineDelay() {
        return this.RoOfflineDelay;
    }

    /**
     * Set 是否启用延迟超限剔除功能，启用该功能后，只读实例与主实例的延迟超过延迟阈值，只读实例将被隔离。可选值：1-启用；0-不启用。
     * @param RoOfflineDelay 是否启用延迟超限剔除功能，启用该功能后，只读实例与主实例的延迟超过延迟阈值，只读实例将被隔离。可选值：1-启用；0-不启用。
     */
    public void setRoOfflineDelay(Long RoOfflineDelay) {
        this.RoOfflineDelay = RoOfflineDelay;
    }

    /**
     * Get 延迟阈值。单位：秒。值范围：1-10000，整数。 
     * @return RoMaxDelayTime 延迟阈值。单位：秒。值范围：1-10000，整数。
     */
    public Long getRoMaxDelayTime() {
        return this.RoMaxDelayTime;
    }

    /**
     * Set 延迟阈值。单位：秒。值范围：1-10000，整数。
     * @param RoMaxDelayTime 延迟阈值。单位：秒。值范围：1-10000，整数。
     */
    public void setRoMaxDelayTime(Long RoMaxDelayTime) {
        this.RoMaxDelayTime = RoMaxDelayTime;
    }

    /**
     * Get 最少实例保留个数，若购买只读实例数量小于设置数量将不做剔除。 
     * @return MinRoInGroup 最少实例保留个数，若购买只读实例数量小于设置数量将不做剔除。
     */
    public Long getMinRoInGroup() {
        return this.MinRoInGroup;
    }

    /**
     * Set 最少实例保留个数，若购买只读实例数量小于设置数量将不做剔除。
     * @param MinRoInGroup 最少实例保留个数，若购买只读实例数量小于设置数量将不做剔除。
     */
    public void setMinRoInGroup(Long MinRoInGroup) {
        this.MinRoInGroup = MinRoInGroup;
    }

    /**
     * Get 读写权重分配模式，可选值：system-系统自动分配；custom-自定义。 
     * @return WeightMode 读写权重分配模式，可选值：system-系统自动分配；custom-自定义。
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set 读写权重分配模式，可选值：system-系统自动分配；custom-自定义。
     * @param WeightMode 读写权重分配模式，可选值：system-系统自动分配；custom-自定义。
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Get 该字段已经废弃，无意义。查看只读实例的权重，请查看 RoInstances 字段里的 Weight 值。 
     * @return Weight 该字段已经废弃，无意义。查看只读实例的权重，请查看 RoInstances 字段里的 Weight 值。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 该字段已经废弃，无意义。查看只读实例的权重，请查看 RoInstances 字段里的 Weight 值。
     * @param Weight 该字段已经废弃，无意义。查看只读实例的权重，请查看 RoInstances 字段里的 Weight 值。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 只读组中的只读实例详情。 
     * @return RoInstances 只读组中的只读实例详情。
     */
    public RoInstanceInfo [] getRoInstances() {
        return this.RoInstances;
    }

    /**
     * Set 只读组中的只读实例详情。
     * @param RoInstances 只读组中的只读实例详情。
     */
    public void setRoInstances(RoInstanceInfo [] RoInstances) {
        this.RoInstances = RoInstances;
    }

    /**
     * Get 只读组的内网 IP。 
     * @return Vip 只读组的内网 IP。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 只读组的内网 IP。
     * @param Vip 只读组的内网 IP。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 只读组的内网端口号。 
     * @return Vport 只读组的内网端口号。
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 只读组的内网端口号。
     * @param Vport 只读组的内网端口号。
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 私有网络 ID。 
     * @return UniqVpcId 私有网络 ID。
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set 私有网络 ID。
     * @param UniqVpcId 私有网络 ID。
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 子网 ID。 
     * @return UniqSubnetId 子网 ID。
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set 子网 ID。
     * @param UniqSubnetId 子网 ID。
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get 只读组所在的地域。 
     * @return RoGroupRegion 只读组所在的地域。
     */
    public String getRoGroupRegion() {
        return this.RoGroupRegion;
    }

    /**
     * Set 只读组所在的地域。
     * @param RoGroupRegion 只读组所在的地域。
     */
    public void setRoGroupRegion(String RoGroupRegion) {
        this.RoGroupRegion = RoGroupRegion;
    }

    /**
     * Get 只读组所在的可用区。 
     * @return RoGroupZone 只读组所在的可用区。
     */
    public String getRoGroupZone() {
        return this.RoGroupZone;
    }

    /**
     * Set 只读组所在的可用区。
     * @param RoGroupZone 只读组所在的可用区。
     */
    public void setRoGroupZone(String RoGroupZone) {
        this.RoGroupZone = RoGroupZone;
    }

    /**
     * Get 延迟复制时间。单位：秒。值范围：1-259200，整数。 
     * @return DelayReplicationTime 延迟复制时间。单位：秒。值范围：1-259200，整数。
     */
    public Long getDelayReplicationTime() {
        return this.DelayReplicationTime;
    }

    /**
     * Set 延迟复制时间。单位：秒。值范围：1-259200，整数。
     * @param DelayReplicationTime 延迟复制时间。单位：秒。值范围：1-259200，整数。
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

