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

public class Instance extends AbstractModel{

    /**
    * 资源组节点id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 节点已用资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsedResource")
    @Expose
    private ResourceInfo UsedResource;

    /**
    * 节点总资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalResource")
    @Expose
    private ResourceInfo TotalResource;

    /**
    * 节点状态 
注意：此字段为枚举值
说明: 
DEPLOYING: 部署中
RUNNING: 运行中 
DEPLOY_FAILED: 部署失败
 RELEASING 释放中 
RELEASED：已释放 
EXCEPTION：异常
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * 创建人
    */
    @SerializedName("SubUin")
    @Expose
    private String SubUin;

    /**
    * 创建时间: 
注意：北京时间，比如: 2021-12-01 12:00:00
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 到期时间
注意：北京时间，比如：2021-12-11 12:00:00
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 自动续费标识
注意：此字段为枚举值
说明：
NOTIFY_AND_MANUAL_RENEW：手动续费(取消自动续费)且到期通知
NOTIFY_AND_AUTO_RENEW：自动续费且到期通知
DISABLE_NOTIFY_AND_MANUAL_RENEW：手动续费(取消自动续费)且到期不通知
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private String AutoRenewFlag;

    /**
    * 计费项ID
    */
    @SerializedName("SpecId")
    @Expose
    private String SpecId;

    /**
    * 计费项别名
    */
    @SerializedName("SpecAlias")
    @Expose
    private String SpecAlias;

    /**
     * Get 资源组节点id 
     * @return InstanceId 资源组节点id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 资源组节点id
     * @param InstanceId 资源组节点id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 节点已用资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsedResource 节点已用资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceInfo getUsedResource() {
        return this.UsedResource;
    }

    /**
     * Set 节点已用资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsedResource 节点已用资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsedResource(ResourceInfo UsedResource) {
        this.UsedResource = UsedResource;
    }

    /**
     * Get 节点总资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalResource 节点总资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceInfo getTotalResource() {
        return this.TotalResource;
    }

    /**
     * Set 节点总资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalResource 节点总资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalResource(ResourceInfo TotalResource) {
        this.TotalResource = TotalResource;
    }

    /**
     * Get 节点状态 
注意：此字段为枚举值
说明: 
DEPLOYING: 部署中
RUNNING: 运行中 
DEPLOY_FAILED: 部署失败
 RELEASING 释放中 
RELEASED：已释放 
EXCEPTION：异常
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceStatus 节点状态 
注意：此字段为枚举值
说明: 
DEPLOYING: 部署中
RUNNING: 运行中 
DEPLOY_FAILED: 部署失败
 RELEASING 释放中 
RELEASED：已释放 
EXCEPTION：异常
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 节点状态 
注意：此字段为枚举值
说明: 
DEPLOYING: 部署中
RUNNING: 运行中 
DEPLOY_FAILED: 部署失败
 RELEASING 释放中 
RELEASED：已释放 
EXCEPTION：异常
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceStatus 节点状态 
注意：此字段为枚举值
说明: 
DEPLOYING: 部署中
RUNNING: 运行中 
DEPLOY_FAILED: 部署失败
 RELEASING 释放中 
RELEASED：已释放 
EXCEPTION：异常
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get 创建人 
     * @return SubUin 创建人
     */
    public String getSubUin() {
        return this.SubUin;
    }

    /**
     * Set 创建人
     * @param SubUin 创建人
     */
    public void setSubUin(String SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get 创建时间: 
注意：北京时间，比如: 2021-12-01 12:00:00
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间: 
注意：北京时间，比如: 2021-12-01 12:00:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间: 
注意：北京时间，比如: 2021-12-01 12:00:00
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间: 
注意：北京时间，比如: 2021-12-01 12:00:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 到期时间
注意：北京时间，比如：2021-12-11 12:00:00
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 到期时间
注意：北京时间，比如：2021-12-11 12:00:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 到期时间
注意：北京时间，比如：2021-12-11 12:00:00
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 到期时间
注意：北京时间，比如：2021-12-11 12:00:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 自动续费标识
注意：此字段为枚举值
说明：
NOTIFY_AND_MANUAL_RENEW：手动续费(取消自动续费)且到期通知
NOTIFY_AND_AUTO_RENEW：自动续费且到期通知
DISABLE_NOTIFY_AND_MANUAL_RENEW：手动续费(取消自动续费)且到期不通知
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoRenewFlag 自动续费标识
注意：此字段为枚举值
说明：
NOTIFY_AND_MANUAL_RENEW：手动续费(取消自动续费)且到期通知
NOTIFY_AND_AUTO_RENEW：自动续费且到期通知
DISABLE_NOTIFY_AND_MANUAL_RENEW：手动续费(取消自动续费)且到期不通知
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费标识
注意：此字段为枚举值
说明：
NOTIFY_AND_MANUAL_RENEW：手动续费(取消自动续费)且到期通知
NOTIFY_AND_AUTO_RENEW：自动续费且到期通知
DISABLE_NOTIFY_AND_MANUAL_RENEW：手动续费(取消自动续费)且到期不通知
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoRenewFlag 自动续费标识
注意：此字段为枚举值
说明：
NOTIFY_AND_MANUAL_RENEW：手动续费(取消自动续费)且到期通知
NOTIFY_AND_AUTO_RENEW：自动续费且到期通知
DISABLE_NOTIFY_AND_MANUAL_RENEW：手动续费(取消自动续费)且到期不通知
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoRenewFlag(String AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 计费项ID 
     * @return SpecId 计费项ID
     */
    public String getSpecId() {
        return this.SpecId;
    }

    /**
     * Set 计费项ID
     * @param SpecId 计费项ID
     */
    public void setSpecId(String SpecId) {
        this.SpecId = SpecId;
    }

    /**
     * Get 计费项别名 
     * @return SpecAlias 计费项别名
     */
    public String getSpecAlias() {
        return this.SpecAlias;
    }

    /**
     * Set 计费项别名
     * @param SpecAlias 计费项别名
     */
    public void setSpecAlias(String SpecAlias) {
        this.SpecAlias = SpecAlias;
    }

    public Instance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Instance(Instance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UsedResource != null) {
            this.UsedResource = new ResourceInfo(source.UsedResource);
        }
        if (source.TotalResource != null) {
            this.TotalResource = new ResourceInfo(source.TotalResource);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.SubUin != null) {
            this.SubUin = new String(source.SubUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new String(source.AutoRenewFlag);
        }
        if (source.SpecId != null) {
            this.SpecId = new String(source.SpecId);
        }
        if (source.SpecAlias != null) {
            this.SpecAlias = new String(source.SpecAlias);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "UsedResource.", this.UsedResource);
        this.setParamObj(map, prefix + "TotalResource.", this.TotalResource);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "SpecId", this.SpecId);
        this.setParamSimple(map, prefix + "SpecAlias", this.SpecAlias);

    }
}

