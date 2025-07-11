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

public class InstancePackage extends AbstractModel {

    /**
    * 实例套餐资源id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 套餐类型
FREE: 免费版
STANDARD：标准版
ULTIMATE：旗舰版
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * 套餐过期时间
    */
    @SerializedName("CurrentDeadline")
    @Expose
    private String CurrentDeadline;

    /**
    * 套餐创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 是否过期0否1是
    */
    @SerializedName("IsExpire")
    @Expose
    private Long IsExpire;

    /**
    * 实例状态
ENABLED: 正常
DISABLED: 禁用
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 是否自动续费0不1是
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 计费项
    */
    @SerializedName("CostItemList")
    @Expose
    private CostItem [] CostItemList;

    /**
    * 最小检查间隔时间s
    */
    @SerializedName("MinCheckInterval")
    @Expose
    private Long MinCheckInterval;

    /**
    * 最小TTL s
    */
    @SerializedName("MinGlobalTtl")
    @Expose
    private Long MinGlobalTtl;

    /**
    * 流量策略类型：ALL返回全部，WEIGHT权重
    */
    @SerializedName("TrafficStrategy")
    @Expose
    private String [] TrafficStrategy;

    /**
    * 策略类型：LOCATION按地理位置调度，DELAY按延迟调度
    */
    @SerializedName("ScheduleStrategy")
    @Expose
    private String [] ScheduleStrategy;

    /**
     * Get 实例套餐资源id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceId 实例套餐资源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 实例套餐资源id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceId 实例套餐资源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

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
     * Get 实例名 
     * @return InstanceName 实例名
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名
     * @param InstanceName 实例名
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 套餐类型
FREE: 免费版
STANDARD：标准版
ULTIMATE：旗舰版 
     * @return PackageType 套餐类型
FREE: 免费版
STANDARD：标准版
ULTIMATE：旗舰版
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set 套餐类型
FREE: 免费版
STANDARD：标准版
ULTIMATE：旗舰版
     * @param PackageType 套餐类型
FREE: 免费版
STANDARD：标准版
ULTIMATE：旗舰版
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get 套餐过期时间 
     * @return CurrentDeadline 套餐过期时间
     */
    public String getCurrentDeadline() {
        return this.CurrentDeadline;
    }

    /**
     * Set 套餐过期时间
     * @param CurrentDeadline 套餐过期时间
     */
    public void setCurrentDeadline(String CurrentDeadline) {
        this.CurrentDeadline = CurrentDeadline;
    }

    /**
     * Get 套餐创建时间 
     * @return CreateTime 套餐创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 套餐创建时间
     * @param CreateTime 套餐创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 是否过期0否1是 
     * @return IsExpire 是否过期0否1是
     */
    public Long getIsExpire() {
        return this.IsExpire;
    }

    /**
     * Set 是否过期0否1是
     * @param IsExpire 是否过期0否1是
     */
    public void setIsExpire(Long IsExpire) {
        this.IsExpire = IsExpire;
    }

    /**
     * Get 实例状态
ENABLED: 正常
DISABLED: 禁用 
     * @return Status 实例状态
ENABLED: 正常
DISABLED: 禁用
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态
ENABLED: 正常
DISABLED: 禁用
     * @param Status 实例状态
ENABLED: 正常
DISABLED: 禁用
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 是否自动续费0不1是 
     * @return AutoRenewFlag 是否自动续费0不1是
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 是否自动续费0不1是
     * @param AutoRenewFlag 是否自动续费0不1是
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 计费项 
     * @return CostItemList 计费项
     */
    public CostItem [] getCostItemList() {
        return this.CostItemList;
    }

    /**
     * Set 计费项
     * @param CostItemList 计费项
     */
    public void setCostItemList(CostItem [] CostItemList) {
        this.CostItemList = CostItemList;
    }

    /**
     * Get 最小检查间隔时间s 
     * @return MinCheckInterval 最小检查间隔时间s
     */
    public Long getMinCheckInterval() {
        return this.MinCheckInterval;
    }

    /**
     * Set 最小检查间隔时间s
     * @param MinCheckInterval 最小检查间隔时间s
     */
    public void setMinCheckInterval(Long MinCheckInterval) {
        this.MinCheckInterval = MinCheckInterval;
    }

    /**
     * Get 最小TTL s 
     * @return MinGlobalTtl 最小TTL s
     */
    public Long getMinGlobalTtl() {
        return this.MinGlobalTtl;
    }

    /**
     * Set 最小TTL s
     * @param MinGlobalTtl 最小TTL s
     */
    public void setMinGlobalTtl(Long MinGlobalTtl) {
        this.MinGlobalTtl = MinGlobalTtl;
    }

    /**
     * Get 流量策略类型：ALL返回全部，WEIGHT权重 
     * @return TrafficStrategy 流量策略类型：ALL返回全部，WEIGHT权重
     */
    public String [] getTrafficStrategy() {
        return this.TrafficStrategy;
    }

    /**
     * Set 流量策略类型：ALL返回全部，WEIGHT权重
     * @param TrafficStrategy 流量策略类型：ALL返回全部，WEIGHT权重
     */
    public void setTrafficStrategy(String [] TrafficStrategy) {
        this.TrafficStrategy = TrafficStrategy;
    }

    /**
     * Get 策略类型：LOCATION按地理位置调度，DELAY按延迟调度 
     * @return ScheduleStrategy 策略类型：LOCATION按地理位置调度，DELAY按延迟调度
     */
    public String [] getScheduleStrategy() {
        return this.ScheduleStrategy;
    }

    /**
     * Set 策略类型：LOCATION按地理位置调度，DELAY按延迟调度
     * @param ScheduleStrategy 策略类型：LOCATION按地理位置调度，DELAY按延迟调度
     */
    public void setScheduleStrategy(String [] ScheduleStrategy) {
        this.ScheduleStrategy = ScheduleStrategy;
    }

    public InstancePackage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstancePackage(InstancePackage source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.CurrentDeadline != null) {
            this.CurrentDeadline = new String(source.CurrentDeadline);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.IsExpire != null) {
            this.IsExpire = new Long(source.IsExpire);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CostItemList != null) {
            this.CostItemList = new CostItem[source.CostItemList.length];
            for (int i = 0; i < source.CostItemList.length; i++) {
                this.CostItemList[i] = new CostItem(source.CostItemList[i]);
            }
        }
        if (source.MinCheckInterval != null) {
            this.MinCheckInterval = new Long(source.MinCheckInterval);
        }
        if (source.MinGlobalTtl != null) {
            this.MinGlobalTtl = new Long(source.MinGlobalTtl);
        }
        if (source.TrafficStrategy != null) {
            this.TrafficStrategy = new String[source.TrafficStrategy.length];
            for (int i = 0; i < source.TrafficStrategy.length; i++) {
                this.TrafficStrategy[i] = new String(source.TrafficStrategy[i]);
            }
        }
        if (source.ScheduleStrategy != null) {
            this.ScheduleStrategy = new String[source.ScheduleStrategy.length];
            for (int i = 0; i < source.ScheduleStrategy.length; i++) {
                this.ScheduleStrategy[i] = new String(source.ScheduleStrategy[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "CurrentDeadline", this.CurrentDeadline);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "IsExpire", this.IsExpire);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "CostItemList.", this.CostItemList);
        this.setParamSimple(map, prefix + "MinCheckInterval", this.MinCheckInterval);
        this.setParamSimple(map, prefix + "MinGlobalTtl", this.MinGlobalTtl);
        this.setParamArraySimple(map, prefix + "TrafficStrategy.", this.TrafficStrategy);
        this.setParamArraySimple(map, prefix + "ScheduleStrategy.", this.ScheduleStrategy);

    }
}

