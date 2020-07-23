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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyReadOnlyGroupDetailsRequest extends AbstractModel{

    /**
    * 主实例ID，格式如：mssql-3l3fgqn7
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 只读组ID
    */
    @SerializedName("ReadOnlyGroupId")
    @Expose
    private String ReadOnlyGroupId;

    /**
    * 只读组名称，不填此参数，则不修改
    */
    @SerializedName("ReadOnlyGroupName")
    @Expose
    private String ReadOnlyGroupName;

    /**
    * 是否启动超时剔除功能,0-不开启剔除功能，1-开启剔除功能，不填此参数，则不修改
    */
    @SerializedName("IsOfflineDelay")
    @Expose
    private Long IsOfflineDelay;

    /**
    * 启动超时剔除功能后，使用的超时阈值，不填此参数，则不修改
    */
    @SerializedName("ReadOnlyMaxDelayTime")
    @Expose
    private Long ReadOnlyMaxDelayTime;

    /**
    * 启动超时剔除功能后，只读组至少保留的只读副本数，不填此参数，则不修改
    */
    @SerializedName("MinReadOnlyInGroup")
    @Expose
    private Long MinReadOnlyInGroup;

    /**
    * 只读组实例权重修改集合，不填此参数，则不修改
    */
    @SerializedName("WeightPairs")
    @Expose
    private ReadOnlyInstanceWeightPair [] WeightPairs;

    /**
    * 0-用户自定义权重（根据WeightPairs调整）,1-系统自动分配权重(WeightPairs无效)， 默认为0
    */
    @SerializedName("AutoWeight")
    @Expose
    private Long AutoWeight;

    /**
    * 0-不重新均衡负载，1-重新均衡负载，默认为0
    */
    @SerializedName("BalanceWeight")
    @Expose
    private Long BalanceWeight;

    /**
     * Get 主实例ID，格式如：mssql-3l3fgqn7 
     * @return InstanceId 主实例ID，格式如：mssql-3l3fgqn7
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 主实例ID，格式如：mssql-3l3fgqn7
     * @param InstanceId 主实例ID，格式如：mssql-3l3fgqn7
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 只读组ID 
     * @return ReadOnlyGroupId 只读组ID
     */
    public String getReadOnlyGroupId() {
        return this.ReadOnlyGroupId;
    }

    /**
     * Set 只读组ID
     * @param ReadOnlyGroupId 只读组ID
     */
    public void setReadOnlyGroupId(String ReadOnlyGroupId) {
        this.ReadOnlyGroupId = ReadOnlyGroupId;
    }

    /**
     * Get 只读组名称，不填此参数，则不修改 
     * @return ReadOnlyGroupName 只读组名称，不填此参数，则不修改
     */
    public String getReadOnlyGroupName() {
        return this.ReadOnlyGroupName;
    }

    /**
     * Set 只读组名称，不填此参数，则不修改
     * @param ReadOnlyGroupName 只读组名称，不填此参数，则不修改
     */
    public void setReadOnlyGroupName(String ReadOnlyGroupName) {
        this.ReadOnlyGroupName = ReadOnlyGroupName;
    }

    /**
     * Get 是否启动超时剔除功能,0-不开启剔除功能，1-开启剔除功能，不填此参数，则不修改 
     * @return IsOfflineDelay 是否启动超时剔除功能,0-不开启剔除功能，1-开启剔除功能，不填此参数，则不修改
     */
    public Long getIsOfflineDelay() {
        return this.IsOfflineDelay;
    }

    /**
     * Set 是否启动超时剔除功能,0-不开启剔除功能，1-开启剔除功能，不填此参数，则不修改
     * @param IsOfflineDelay 是否启动超时剔除功能,0-不开启剔除功能，1-开启剔除功能，不填此参数，则不修改
     */
    public void setIsOfflineDelay(Long IsOfflineDelay) {
        this.IsOfflineDelay = IsOfflineDelay;
    }

    /**
     * Get 启动超时剔除功能后，使用的超时阈值，不填此参数，则不修改 
     * @return ReadOnlyMaxDelayTime 启动超时剔除功能后，使用的超时阈值，不填此参数，则不修改
     */
    public Long getReadOnlyMaxDelayTime() {
        return this.ReadOnlyMaxDelayTime;
    }

    /**
     * Set 启动超时剔除功能后，使用的超时阈值，不填此参数，则不修改
     * @param ReadOnlyMaxDelayTime 启动超时剔除功能后，使用的超时阈值，不填此参数，则不修改
     */
    public void setReadOnlyMaxDelayTime(Long ReadOnlyMaxDelayTime) {
        this.ReadOnlyMaxDelayTime = ReadOnlyMaxDelayTime;
    }

    /**
     * Get 启动超时剔除功能后，只读组至少保留的只读副本数，不填此参数，则不修改 
     * @return MinReadOnlyInGroup 启动超时剔除功能后，只读组至少保留的只读副本数，不填此参数，则不修改
     */
    public Long getMinReadOnlyInGroup() {
        return this.MinReadOnlyInGroup;
    }

    /**
     * Set 启动超时剔除功能后，只读组至少保留的只读副本数，不填此参数，则不修改
     * @param MinReadOnlyInGroup 启动超时剔除功能后，只读组至少保留的只读副本数，不填此参数，则不修改
     */
    public void setMinReadOnlyInGroup(Long MinReadOnlyInGroup) {
        this.MinReadOnlyInGroup = MinReadOnlyInGroup;
    }

    /**
     * Get 只读组实例权重修改集合，不填此参数，则不修改 
     * @return WeightPairs 只读组实例权重修改集合，不填此参数，则不修改
     */
    public ReadOnlyInstanceWeightPair [] getWeightPairs() {
        return this.WeightPairs;
    }

    /**
     * Set 只读组实例权重修改集合，不填此参数，则不修改
     * @param WeightPairs 只读组实例权重修改集合，不填此参数，则不修改
     */
    public void setWeightPairs(ReadOnlyInstanceWeightPair [] WeightPairs) {
        this.WeightPairs = WeightPairs;
    }

    /**
     * Get 0-用户自定义权重（根据WeightPairs调整）,1-系统自动分配权重(WeightPairs无效)， 默认为0 
     * @return AutoWeight 0-用户自定义权重（根据WeightPairs调整）,1-系统自动分配权重(WeightPairs无效)， 默认为0
     */
    public Long getAutoWeight() {
        return this.AutoWeight;
    }

    /**
     * Set 0-用户自定义权重（根据WeightPairs调整）,1-系统自动分配权重(WeightPairs无效)， 默认为0
     * @param AutoWeight 0-用户自定义权重（根据WeightPairs调整）,1-系统自动分配权重(WeightPairs无效)， 默认为0
     */
    public void setAutoWeight(Long AutoWeight) {
        this.AutoWeight = AutoWeight;
    }

    /**
     * Get 0-不重新均衡负载，1-重新均衡负载，默认为0 
     * @return BalanceWeight 0-不重新均衡负载，1-重新均衡负载，默认为0
     */
    public Long getBalanceWeight() {
        return this.BalanceWeight;
    }

    /**
     * Set 0-不重新均衡负载，1-重新均衡负载，默认为0
     * @param BalanceWeight 0-不重新均衡负载，1-重新均衡负载，默认为0
     */
    public void setBalanceWeight(Long BalanceWeight) {
        this.BalanceWeight = BalanceWeight;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ReadOnlyGroupId", this.ReadOnlyGroupId);
        this.setParamSimple(map, prefix + "ReadOnlyGroupName", this.ReadOnlyGroupName);
        this.setParamSimple(map, prefix + "IsOfflineDelay", this.IsOfflineDelay);
        this.setParamSimple(map, prefix + "ReadOnlyMaxDelayTime", this.ReadOnlyMaxDelayTime);
        this.setParamSimple(map, prefix + "MinReadOnlyInGroup", this.MinReadOnlyInGroup);
        this.setParamArrayObj(map, prefix + "WeightPairs.", this.WeightPairs);
        this.setParamSimple(map, prefix + "AutoWeight", this.AutoWeight);
        this.setParamSimple(map, prefix + "BalanceWeight", this.BalanceWeight);

    }
}

