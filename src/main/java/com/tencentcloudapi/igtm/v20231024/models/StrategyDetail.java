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

public class StrategyDetail extends AbstractModel {

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 策略id
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
    * 策略名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 线路
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Source")
    @Expose
    private Source [] Source;

    /**
    * 主力地址池集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MainAddressPoolSet")
    @Expose
    private MainAddressPool [] MainAddressPoolSet;

    /**
    * 兜底地址池id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FallbackAddressPoolSet")
    @Expose
    private MainAddressPool [] FallbackAddressPoolSet;

    /**
    * 是否保留线路：enabled保留，disabled不保留，只保留默认线路
    */
    @SerializedName("KeepDomainRecords")
    @Expose
    private String KeepDomainRecords;

    /**
    * 生效主力地址池id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActivateMainPoolId")
    @Expose
    private Long ActivateMainPoolId;

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
    * 调度模式：AUTO默认；PAUSE仅暂停不切换
    */
    @SerializedName("SwitchPoolType")
    @Expose
    private String SwitchPoolType;

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
     * Get 线路
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Source 线路
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Source [] getSource() {
        return this.Source;
    }

    /**
     * Set 线路
注意：此字段可能返回 null，表示取不到有效值。
     * @param Source 线路
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSource(Source [] Source) {
        this.Source = Source;
    }

    /**
     * Get 主力地址池集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MainAddressPoolSet 主力地址池集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MainAddressPool [] getMainAddressPoolSet() {
        return this.MainAddressPoolSet;
    }

    /**
     * Set 主力地址池集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param MainAddressPoolSet 主力地址池集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMainAddressPoolSet(MainAddressPool [] MainAddressPoolSet) {
        this.MainAddressPoolSet = MainAddressPoolSet;
    }

    /**
     * Get 兜底地址池id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FallbackAddressPoolSet 兜底地址池id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MainAddressPool [] getFallbackAddressPoolSet() {
        return this.FallbackAddressPoolSet;
    }

    /**
     * Set 兜底地址池id
注意：此字段可能返回 null，表示取不到有效值。
     * @param FallbackAddressPoolSet 兜底地址池id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFallbackAddressPoolSet(MainAddressPool [] FallbackAddressPoolSet) {
        this.FallbackAddressPoolSet = FallbackAddressPoolSet;
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
     * Get 生效主力地址池id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActivateMainPoolId 生效主力地址池id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getActivateMainPoolId() {
        return this.ActivateMainPoolId;
    }

    /**
     * Set 生效主力地址池id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActivateMainPoolId 生效主力地址池id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActivateMainPoolId(Long ActivateMainPoolId) {
        this.ActivateMainPoolId = ActivateMainPoolId;
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

    public StrategyDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StrategyDetail(StrategyDetail source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StrategyId != null) {
            this.StrategyId = new Long(source.StrategyId);
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
        if (source.MainAddressPoolSet != null) {
            this.MainAddressPoolSet = new MainAddressPool[source.MainAddressPoolSet.length];
            for (int i = 0; i < source.MainAddressPoolSet.length; i++) {
                this.MainAddressPoolSet[i] = new MainAddressPool(source.MainAddressPoolSet[i]);
            }
        }
        if (source.FallbackAddressPoolSet != null) {
            this.FallbackAddressPoolSet = new MainAddressPool[source.FallbackAddressPoolSet.length];
            for (int i = 0; i < source.FallbackAddressPoolSet.length; i++) {
                this.FallbackAddressPoolSet[i] = new MainAddressPool(source.FallbackAddressPoolSet[i]);
            }
        }
        if (source.KeepDomainRecords != null) {
            this.KeepDomainRecords = new String(source.KeepDomainRecords);
        }
        if (source.ActivateMainPoolId != null) {
            this.ActivateMainPoolId = new Long(source.ActivateMainPoolId);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.UpdatedOn != null) {
            this.UpdatedOn = new String(source.UpdatedOn);
        }
        if (source.SwitchPoolType != null) {
            this.SwitchPoolType = new String(source.SwitchPoolType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Source.", this.Source);
        this.setParamArrayObj(map, prefix + "MainAddressPoolSet.", this.MainAddressPoolSet);
        this.setParamArrayObj(map, prefix + "FallbackAddressPoolSet.", this.FallbackAddressPoolSet);
        this.setParamSimple(map, prefix + "KeepDomainRecords", this.KeepDomainRecords);
        this.setParamSimple(map, prefix + "ActivateMainPoolId", this.ActivateMainPoolId);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "UpdatedOn", this.UpdatedOn);
        this.setParamSimple(map, prefix + "SwitchPoolType", this.SwitchPoolType);

    }
}

