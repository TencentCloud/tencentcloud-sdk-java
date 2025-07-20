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
package com.tencentcloudapi.igtm.v20231024.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Strategy extends AbstractModel {

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 策略名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 地址来源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Source")
    @Expose
    private Source [] Source;

    /**
    * 策略id
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
    * 健康状态：ok健康、warn风险、down故障
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 生效的主力池id，null则为未知
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActivateMainPoolId")
    @Expose
    private Long ActivateMainPoolId;

    /**
    * 当前生效地址池所在级数，为0则代表兜底生效，null则为未知
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActivateLevel")
    @Expose
    private Long ActivateLevel;

    /**
    * 当前生效地址池集合类型：main主力；fallback兜底
    */
    @SerializedName("ActivePoolType")
    @Expose
    private String ActivePoolType;

    /**
    * 当前生效地址池流量策略：all解析所有；weight负载均衡
    */
    @SerializedName("ActiveTrafficStrategy")
    @Expose
    private String ActiveTrafficStrategy;

    /**
    * 监控器数量
    */
    @SerializedName("MonitorNum")
    @Expose
    private Long MonitorNum;

    /**
    * 是否开启：ENABLED开启；DISABLED关闭
    */
    @SerializedName("IsEnabled")
    @Expose
    private String IsEnabled;

    /**
    * 是否保留线路：enabled保留，disabled不保留，只保留默认线路
    */
    @SerializedName("KeepDomainRecords")
    @Expose
    private String KeepDomainRecords;

    /**
    * 调度模式：AUTO默认；PAUSE仅暂停不切换
    */
    @SerializedName("SwitchPoolType")
    @Expose
    private String SwitchPoolType;

    /**
    * 创建时间
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * 更新时间
    */
    @SerializedName("UpdatedOn")
    @Expose
    private String UpdatedOn;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 策略名 
     * @return Name 策略名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 策略名
     * @param Name 策略名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 地址来源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Source 地址来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Source [] getSource() {
        return this.Source;
    }

    /**
     * Set 地址来源
注意：此字段可能返回 null，表示取不到有效值。
     * @param Source 地址来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSource(Source [] Source) {
        this.Source = Source;
    }

    /**
     * Get 策略id 
     * @return StrategyId 策略id
     */
    public Long getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set 策略id
     * @param StrategyId 策略id
     */
    public void setStrategyId(Long StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get 健康状态：ok健康、warn风险、down故障 
     * @return Status 健康状态：ok健康、warn风险、down故障
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 健康状态：ok健康、warn风险、down故障
     * @param Status 健康状态：ok健康、warn风险、down故障
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 生效的主力池id，null则为未知
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActivateMainPoolId 生效的主力池id，null则为未知
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getActivateMainPoolId() {
        return this.ActivateMainPoolId;
    }

    /**
     * Set 生效的主力池id，null则为未知
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActivateMainPoolId 生效的主力池id，null则为未知
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActivateMainPoolId(Long ActivateMainPoolId) {
        this.ActivateMainPoolId = ActivateMainPoolId;
    }

    /**
     * Get 当前生效地址池所在级数，为0则代表兜底生效，null则为未知
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActivateLevel 当前生效地址池所在级数，为0则代表兜底生效，null则为未知
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getActivateLevel() {
        return this.ActivateLevel;
    }

    /**
     * Set 当前生效地址池所在级数，为0则代表兜底生效，null则为未知
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActivateLevel 当前生效地址池所在级数，为0则代表兜底生效，null则为未知
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActivateLevel(Long ActivateLevel) {
        this.ActivateLevel = ActivateLevel;
    }

    /**
     * Get 当前生效地址池集合类型：main主力；fallback兜底 
     * @return ActivePoolType 当前生效地址池集合类型：main主力；fallback兜底
     */
    public String getActivePoolType() {
        return this.ActivePoolType;
    }

    /**
     * Set 当前生效地址池集合类型：main主力；fallback兜底
     * @param ActivePoolType 当前生效地址池集合类型：main主力；fallback兜底
     */
    public void setActivePoolType(String ActivePoolType) {
        this.ActivePoolType = ActivePoolType;
    }

    /**
     * Get 当前生效地址池流量策略：all解析所有；weight负载均衡 
     * @return ActiveTrafficStrategy 当前生效地址池流量策略：all解析所有；weight负载均衡
     */
    public String getActiveTrafficStrategy() {
        return this.ActiveTrafficStrategy;
    }

    /**
     * Set 当前生效地址池流量策略：all解析所有；weight负载均衡
     * @param ActiveTrafficStrategy 当前生效地址池流量策略：all解析所有；weight负载均衡
     */
    public void setActiveTrafficStrategy(String ActiveTrafficStrategy) {
        this.ActiveTrafficStrategy = ActiveTrafficStrategy;
    }

    /**
     * Get 监控器数量 
     * @return MonitorNum 监控器数量
     */
    public Long getMonitorNum() {
        return this.MonitorNum;
    }

    /**
     * Set 监控器数量
     * @param MonitorNum 监控器数量
     */
    public void setMonitorNum(Long MonitorNum) {
        this.MonitorNum = MonitorNum;
    }

    /**
     * Get 是否开启：ENABLED开启；DISABLED关闭 
     * @return IsEnabled 是否开启：ENABLED开启；DISABLED关闭
     */
    public String getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set 是否开启：ENABLED开启；DISABLED关闭
     * @param IsEnabled 是否开启：ENABLED开启；DISABLED关闭
     */
    public void setIsEnabled(String IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get 是否保留线路：enabled保留，disabled不保留，只保留默认线路 
     * @return KeepDomainRecords 是否保留线路：enabled保留，disabled不保留，只保留默认线路
     */
    public String getKeepDomainRecords() {
        return this.KeepDomainRecords;
    }

    /**
     * Set 是否保留线路：enabled保留，disabled不保留，只保留默认线路
     * @param KeepDomainRecords 是否保留线路：enabled保留，disabled不保留，只保留默认线路
     */
    public void setKeepDomainRecords(String KeepDomainRecords) {
        this.KeepDomainRecords = KeepDomainRecords;
    }

    /**
     * Get 调度模式：AUTO默认；PAUSE仅暂停不切换 
     * @return SwitchPoolType 调度模式：AUTO默认；PAUSE仅暂停不切换
     */
    public String getSwitchPoolType() {
        return this.SwitchPoolType;
    }

    /**
     * Set 调度模式：AUTO默认；PAUSE仅暂停不切换
     * @param SwitchPoolType 调度模式：AUTO默认；PAUSE仅暂停不切换
     */
    public void setSwitchPoolType(String SwitchPoolType) {
        this.SwitchPoolType = SwitchPoolType;
    }

    /**
     * Get 创建时间 
     * @return CreatedOn 创建时间
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 创建时间
     * @param CreatedOn 创建时间
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 更新时间 
     * @return UpdatedOn 更新时间
     */
    public String getUpdatedOn() {
        return this.UpdatedOn;
    }

    /**
     * Set 更新时间
     * @param UpdatedOn 更新时间
     */
    public void setUpdatedOn(String UpdatedOn) {
        this.UpdatedOn = UpdatedOn;
    }

    public Strategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Strategy(Strategy source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Source != null) {
            this.Source = new Source[source.Source.length];
            for (int i = 0; i < source.Source.length; i++) {
                this.Source[i] = new Source(source.Source[i]);
            }
        }
        if (source.StrategyId != null) {
            this.StrategyId = new Long(source.StrategyId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ActivateMainPoolId != null) {
            this.ActivateMainPoolId = new Long(source.ActivateMainPoolId);
        }
        if (source.ActivateLevel != null) {
            this.ActivateLevel = new Long(source.ActivateLevel);
        }
        if (source.ActivePoolType != null) {
            this.ActivePoolType = new String(source.ActivePoolType);
        }
        if (source.ActiveTrafficStrategy != null) {
            this.ActiveTrafficStrategy = new String(source.ActiveTrafficStrategy);
        }
        if (source.MonitorNum != null) {
            this.MonitorNum = new Long(source.MonitorNum);
        }
        if (source.IsEnabled != null) {
            this.IsEnabled = new String(source.IsEnabled);
        }
        if (source.KeepDomainRecords != null) {
            this.KeepDomainRecords = new String(source.KeepDomainRecords);
        }
        if (source.SwitchPoolType != null) {
            this.SwitchPoolType = new String(source.SwitchPoolType);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.UpdatedOn != null) {
            this.UpdatedOn = new String(source.UpdatedOn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Source.", this.Source);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ActivateMainPoolId", this.ActivateMainPoolId);
        this.setParamSimple(map, prefix + "ActivateLevel", this.ActivateLevel);
        this.setParamSimple(map, prefix + "ActivePoolType", this.ActivePoolType);
        this.setParamSimple(map, prefix + "ActiveTrafficStrategy", this.ActiveTrafficStrategy);
        this.setParamSimple(map, prefix + "MonitorNum", this.MonitorNum);
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamSimple(map, prefix + "KeepDomainRecords", this.KeepDomainRecords);
        this.setParamSimple(map, prefix + "SwitchPoolType", this.SwitchPoolType);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "UpdatedOn", this.UpdatedOn);

    }
}

