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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoGroup  extends AbstractModel{

    /**
    * 只读组模式，可选值为：alone-系统自动分配只读组；allinone-新建只读组；join-使用现有只读组
    */
    @SerializedName("RoGroupMode")
    @Expose
    private String RoGroupMode;

    /**
    * 只读组ID
    */
    @SerializedName("RoGroupId")
    @Expose
    private String RoGroupId;

    /**
    * 只读组名称
    */
    @SerializedName("RoGroupName")
    @Expose
    private String RoGroupName;

    /**
    * 是否启用延迟超限剔除功能，启用该功能后，只读实例与主实例的延迟超过延迟阈值，只读实例将被隔离。可选值：1-启用；0-不启用
    */
    @SerializedName("RoOfflineDelay")
    @Expose
    private Integer RoOfflineDelay;

    /**
    * 延迟阈值
    */
    @SerializedName("RoMaxDelayTime")
    @Expose
    private Integer RoMaxDelayTime;

    /**
    * 最少实例保留个数，若购买只读实例数量小于设置数量将不做剔除
    */
    @SerializedName("MinRoInGroup")
    @Expose
    private Integer MinRoInGroup;

    /**
    * 读写权重分配模式，可选值：system-系统自动分配；custom-自定义
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * 权重值
    */
    @SerializedName("Weight")
    @Expose
    private Integer Weight;

    /**
    * 只读组中的只读实例详情
    */
    @SerializedName("RoInstances")
    @Expose
    private RoInstanceInfo [] RoInstances;

    /**
    * 只读组的内网IP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 只读组的内网端口号
    */
    @SerializedName("Vport")
    @Expose
    private Integer Vport;

    /**
     * 获取只读组模式，可选值为：alone-系统自动分配只读组；allinone-新建只读组；join-使用现有只读组
     * @return RoGroupMode 只读组模式，可选值为：alone-系统自动分配只读组；allinone-新建只读组；join-使用现有只读组
     */
    public String getRoGroupMode() {
        return this.RoGroupMode;
    }

    /**
     * 设置只读组模式，可选值为：alone-系统自动分配只读组；allinone-新建只读组；join-使用现有只读组
     * @param RoGroupMode 只读组模式，可选值为：alone-系统自动分配只读组；allinone-新建只读组；join-使用现有只读组
     */
    public void setRoGroupMode(String RoGroupMode) {
        this.RoGroupMode = RoGroupMode;
    }

    /**
     * 获取只读组ID
     * @return RoGroupId 只读组ID
     */
    public String getRoGroupId() {
        return this.RoGroupId;
    }

    /**
     * 设置只读组ID
     * @param RoGroupId 只读组ID
     */
    public void setRoGroupId(String RoGroupId) {
        this.RoGroupId = RoGroupId;
    }

    /**
     * 获取只读组名称
     * @return RoGroupName 只读组名称
     */
    public String getRoGroupName() {
        return this.RoGroupName;
    }

    /**
     * 设置只读组名称
     * @param RoGroupName 只读组名称
     */
    public void setRoGroupName(String RoGroupName) {
        this.RoGroupName = RoGroupName;
    }

    /**
     * 获取是否启用延迟超限剔除功能，启用该功能后，只读实例与主实例的延迟超过延迟阈值，只读实例将被隔离。可选值：1-启用；0-不启用
     * @return RoOfflineDelay 是否启用延迟超限剔除功能，启用该功能后，只读实例与主实例的延迟超过延迟阈值，只读实例将被隔离。可选值：1-启用；0-不启用
     */
    public Integer getRoOfflineDelay() {
        return this.RoOfflineDelay;
    }

    /**
     * 设置是否启用延迟超限剔除功能，启用该功能后，只读实例与主实例的延迟超过延迟阈值，只读实例将被隔离。可选值：1-启用；0-不启用
     * @param RoOfflineDelay 是否启用延迟超限剔除功能，启用该功能后，只读实例与主实例的延迟超过延迟阈值，只读实例将被隔离。可选值：1-启用；0-不启用
     */
    public void setRoOfflineDelay(Integer RoOfflineDelay) {
        this.RoOfflineDelay = RoOfflineDelay;
    }

    /**
     * 获取延迟阈值
     * @return RoMaxDelayTime 延迟阈值
     */
    public Integer getRoMaxDelayTime() {
        return this.RoMaxDelayTime;
    }

    /**
     * 设置延迟阈值
     * @param RoMaxDelayTime 延迟阈值
     */
    public void setRoMaxDelayTime(Integer RoMaxDelayTime) {
        this.RoMaxDelayTime = RoMaxDelayTime;
    }

    /**
     * 获取最少实例保留个数，若购买只读实例数量小于设置数量将不做剔除
     * @return MinRoInGroup 最少实例保留个数，若购买只读实例数量小于设置数量将不做剔除
     */
    public Integer getMinRoInGroup() {
        return this.MinRoInGroup;
    }

    /**
     * 设置最少实例保留个数，若购买只读实例数量小于设置数量将不做剔除
     * @param MinRoInGroup 最少实例保留个数，若购买只读实例数量小于设置数量将不做剔除
     */
    public void setMinRoInGroup(Integer MinRoInGroup) {
        this.MinRoInGroup = MinRoInGroup;
    }

    /**
     * 获取读写权重分配模式，可选值：system-系统自动分配；custom-自定义
     * @return WeightMode 读写权重分配模式，可选值：system-系统自动分配；custom-自定义
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * 设置读写权重分配模式，可选值：system-系统自动分配；custom-自定义
     * @param WeightMode 读写权重分配模式，可选值：system-系统自动分配；custom-自定义
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * 获取权重值
     * @return Weight 权重值
     */
    public Integer getWeight() {
        return this.Weight;
    }

    /**
     * 设置权重值
     * @param Weight 权重值
     */
    public void setWeight(Integer Weight) {
        this.Weight = Weight;
    }

    /**
     * 获取只读组中的只读实例详情
     * @return RoInstances 只读组中的只读实例详情
     */
    public RoInstanceInfo [] getRoInstances() {
        return this.RoInstances;
    }

    /**
     * 设置只读组中的只读实例详情
     * @param RoInstances 只读组中的只读实例详情
     */
    public void setRoInstances(RoInstanceInfo [] RoInstances) {
        this.RoInstances = RoInstances;
    }

    /**
     * 获取只读组的内网IP
     * @return Vip 只读组的内网IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * 设置只读组的内网IP
     * @param Vip 只读组的内网IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * 获取只读组的内网端口号
     * @return Vport 只读组的内网端口号
     */
    public Integer getVport() {
        return this.Vport;
    }

    /**
     * 设置只读组的内网端口号
     * @param Vport 只读组的内网端口号
     */
    public void setVport(Integer Vport) {
        this.Vport = Vport;
    }

    /**
     * 内部实现，用户禁止调用
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

    }
}

