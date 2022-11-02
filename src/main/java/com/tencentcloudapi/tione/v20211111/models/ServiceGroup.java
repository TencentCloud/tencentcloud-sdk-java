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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceGroup extends AbstractModel{

    /**
    * 服务组id
    */
    @SerializedName("ServiceGroupId")
    @Expose
    private String ServiceGroupId;

    /**
    * 服务组名
    */
    @SerializedName("ServiceGroupName")
    @Expose
    private String ServiceGroupName;

    /**
    * 创建者
    */
    @SerializedName("CreatedBy")
    @Expose
    private String CreatedBy;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 主账号
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 服务组下服务总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceCount")
    @Expose
    private Long ServiceCount;

    /**
    * 服务组下在运行的服务数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunningServiceCount")
    @Expose
    private Long RunningServiceCount;

    /**
    * 服务描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Services")
    @Expose
    private Service [] Services;

    /**
    * 服务组状态，与服务一致
 CREATING 创建中
     CREATE_FAILED 创建失败
     Normal	正常运行中
     Stopped  已停止
     Stopping 停止中
     Abnormal 异常
     Pending 启动中
     Waiting 就绪中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 服务组标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 服务组下最高版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestVersion")
    @Expose
    private String LatestVersion;

    /**
    * 服务的业务状态
CREATING 创建中
     CREATE_FAILED 创建失败
     ARREARS_STOP 因欠费被强制停止
     BILLING 计费中
     WHITELIST_USING 白名单试用中
     WHITELIST_STOP 白名单额度不足
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessStatus")
    @Expose
    private String BusinessStatus;

    /**
    * 服务的计费信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillingInfo")
    @Expose
    private String BillingInfo;

    /**
    * 服务的创建来源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateSource")
    @Expose
    private String CreateSource;

    /**
    * 服务组的权重更新状态 
UPDATING 更新中
     UPDATED 更新成功
     UPDATE_FAILED 更新失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WeightUpdateStatus")
    @Expose
    private String WeightUpdateStatus;

    /**
     * Get 服务组id 
     * @return ServiceGroupId 服务组id
     */
    public String getServiceGroupId() {
        return this.ServiceGroupId;
    }

    /**
     * Set 服务组id
     * @param ServiceGroupId 服务组id
     */
    public void setServiceGroupId(String ServiceGroupId) {
        this.ServiceGroupId = ServiceGroupId;
    }

    /**
     * Get 服务组名 
     * @return ServiceGroupName 服务组名
     */
    public String getServiceGroupName() {
        return this.ServiceGroupName;
    }

    /**
     * Set 服务组名
     * @param ServiceGroupName 服务组名
     */
    public void setServiceGroupName(String ServiceGroupName) {
        this.ServiceGroupName = ServiceGroupName;
    }

    /**
     * Get 创建者 
     * @return CreatedBy 创建者
     */
    public String getCreatedBy() {
        return this.CreatedBy;
    }

    /**
     * Set 创建者
     * @param CreatedBy 创建者
     */
    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 主账号 
     * @return Uin 主账号
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 主账号
     * @param Uin 主账号
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 服务组下服务总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceCount 服务组下服务总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getServiceCount() {
        return this.ServiceCount;
    }

    /**
     * Set 服务组下服务总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceCount 服务组下服务总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceCount(Long ServiceCount) {
        this.ServiceCount = ServiceCount;
    }

    /**
     * Get 服务组下在运行的服务数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunningServiceCount 服务组下在运行的服务数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRunningServiceCount() {
        return this.RunningServiceCount;
    }

    /**
     * Set 服务组下在运行的服务数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunningServiceCount 服务组下在运行的服务数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunningServiceCount(Long RunningServiceCount) {
        this.RunningServiceCount = RunningServiceCount;
    }

    /**
     * Get 服务描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Services 服务描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Service [] getServices() {
        return this.Services;
    }

    /**
     * Set 服务描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Services 服务描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServices(Service [] Services) {
        this.Services = Services;
    }

    /**
     * Get 服务组状态，与服务一致
 CREATING 创建中
     CREATE_FAILED 创建失败
     Normal	正常运行中
     Stopped  已停止
     Stopping 停止中
     Abnormal 异常
     Pending 启动中
     Waiting 就绪中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 服务组状态，与服务一致
 CREATING 创建中
     CREATE_FAILED 创建失败
     Normal	正常运行中
     Stopped  已停止
     Stopping 停止中
     Abnormal 异常
     Pending 启动中
     Waiting 就绪中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 服务组状态，与服务一致
 CREATING 创建中
     CREATE_FAILED 创建失败
     Normal	正常运行中
     Stopped  已停止
     Stopping 停止中
     Abnormal 异常
     Pending 启动中
     Waiting 就绪中
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 服务组状态，与服务一致
 CREATING 创建中
     CREATE_FAILED 创建失败
     Normal	正常运行中
     Stopped  已停止
     Stopping 停止中
     Abnormal 异常
     Pending 启动中
     Waiting 就绪中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 服务组标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 服务组标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 服务组标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 服务组标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 服务组下最高版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestVersion 服务组下最高版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestVersion() {
        return this.LatestVersion;
    }

    /**
     * Set 服务组下最高版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestVersion 服务组下最高版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestVersion(String LatestVersion) {
        this.LatestVersion = LatestVersion;
    }

    /**
     * Get 服务的业务状态
CREATING 创建中
     CREATE_FAILED 创建失败
     ARREARS_STOP 因欠费被强制停止
     BILLING 计费中
     WHITELIST_USING 白名单试用中
     WHITELIST_STOP 白名单额度不足
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessStatus 服务的业务状态
CREATING 创建中
     CREATE_FAILED 创建失败
     ARREARS_STOP 因欠费被强制停止
     BILLING 计费中
     WHITELIST_USING 白名单试用中
     WHITELIST_STOP 白名单额度不足
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBusinessStatus() {
        return this.BusinessStatus;
    }

    /**
     * Set 服务的业务状态
CREATING 创建中
     CREATE_FAILED 创建失败
     ARREARS_STOP 因欠费被强制停止
     BILLING 计费中
     WHITELIST_USING 白名单试用中
     WHITELIST_STOP 白名单额度不足
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessStatus 服务的业务状态
CREATING 创建中
     CREATE_FAILED 创建失败
     ARREARS_STOP 因欠费被强制停止
     BILLING 计费中
     WHITELIST_USING 白名单试用中
     WHITELIST_STOP 白名单额度不足
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessStatus(String BusinessStatus) {
        this.BusinessStatus = BusinessStatus;
    }

    /**
     * Get 服务的计费信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BillingInfo 服务的计费信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBillingInfo() {
        return this.BillingInfo;
    }

    /**
     * Set 服务的计费信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param BillingInfo 服务的计费信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillingInfo(String BillingInfo) {
        this.BillingInfo = BillingInfo;
    }

    /**
     * Get 服务的创建来源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateSource 服务的创建来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateSource() {
        return this.CreateSource;
    }

    /**
     * Set 服务的创建来源
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateSource 服务的创建来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateSource(String CreateSource) {
        this.CreateSource = CreateSource;
    }

    /**
     * Get 服务组的权重更新状态 
UPDATING 更新中
     UPDATED 更新成功
     UPDATE_FAILED 更新失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WeightUpdateStatus 服务组的权重更新状态 
UPDATING 更新中
     UPDATED 更新成功
     UPDATE_FAILED 更新失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWeightUpdateStatus() {
        return this.WeightUpdateStatus;
    }

    /**
     * Set 服务组的权重更新状态 
UPDATING 更新中
     UPDATED 更新成功
     UPDATE_FAILED 更新失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param WeightUpdateStatus 服务组的权重更新状态 
UPDATING 更新中
     UPDATED 更新成功
     UPDATE_FAILED 更新失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeightUpdateStatus(String WeightUpdateStatus) {
        this.WeightUpdateStatus = WeightUpdateStatus;
    }

    public ServiceGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceGroup(ServiceGroup source) {
        if (source.ServiceGroupId != null) {
            this.ServiceGroupId = new String(source.ServiceGroupId);
        }
        if (source.ServiceGroupName != null) {
            this.ServiceGroupName = new String(source.ServiceGroupName);
        }
        if (source.CreatedBy != null) {
            this.CreatedBy = new String(source.CreatedBy);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.ServiceCount != null) {
            this.ServiceCount = new Long(source.ServiceCount);
        }
        if (source.RunningServiceCount != null) {
            this.RunningServiceCount = new Long(source.RunningServiceCount);
        }
        if (source.Services != null) {
            this.Services = new Service[source.Services.length];
            for (int i = 0; i < source.Services.length; i++) {
                this.Services[i] = new Service(source.Services[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.LatestVersion != null) {
            this.LatestVersion = new String(source.LatestVersion);
        }
        if (source.BusinessStatus != null) {
            this.BusinessStatus = new String(source.BusinessStatus);
        }
        if (source.BillingInfo != null) {
            this.BillingInfo = new String(source.BillingInfo);
        }
        if (source.CreateSource != null) {
            this.CreateSource = new String(source.CreateSource);
        }
        if (source.WeightUpdateStatus != null) {
            this.WeightUpdateStatus = new String(source.WeightUpdateStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceGroupId", this.ServiceGroupId);
        this.setParamSimple(map, prefix + "ServiceGroupName", this.ServiceGroupName);
        this.setParamSimple(map, prefix + "CreatedBy", this.CreatedBy);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "ServiceCount", this.ServiceCount);
        this.setParamSimple(map, prefix + "RunningServiceCount", this.RunningServiceCount);
        this.setParamArrayObj(map, prefix + "Services.", this.Services);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "LatestVersion", this.LatestVersion);
        this.setParamSimple(map, prefix + "BusinessStatus", this.BusinessStatus);
        this.setParamSimple(map, prefix + "BillingInfo", this.BillingInfo);
        this.setParamSimple(map, prefix + "CreateSource", this.CreateSource);
        this.setParamSimple(map, prefix + "WeightUpdateStatus", this.WeightUpdateStatus);

    }
}

