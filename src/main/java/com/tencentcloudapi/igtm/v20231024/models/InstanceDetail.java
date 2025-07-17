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

public class InstanceDetail extends AbstractModel {

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
    * 业务域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Cname域名接入方式
CUSTOM: 自定义接入域名
SYSTEM: 系统接入域名
    */
    @SerializedName("AccessType")
    @Expose
    private String AccessType;

    /**
    * 接入子域名	
    */
    @SerializedName("AccessSubDomain")
    @Expose
    private String AccessSubDomain;

    /**
    * 接入域名	
    */
    @SerializedName("AccessDomain")
    @Expose
    private String AccessDomain;

    /**
    * 解析生效时间
    */
    @SerializedName("GlobalTtl")
    @Expose
    private Long GlobalTtl;

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
    * 实例运行状态
NORMAL: 健康
FAULTY: 有风险
DOWN: 宕机
UNKNOWN: 未知
    */
    @SerializedName("WorkingStatus")
    @Expose
    private String WorkingStatus;

    /**
    * 实例状态，ENABLED: 正常；DISABLED: 禁用
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * cname是否接入：true已接入；false未接入
    */
    @SerializedName("IsCnameConfigured")
    @Expose
    private Boolean IsCnameConfigured;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 策略数量
    */
    @SerializedName("StrategyNum")
    @Expose
    private Long StrategyNum;

    /**
    * 绑定地址池个数
    */
    @SerializedName("AddressPoolNum")
    @Expose
    private Long AddressPoolNum;

    /**
    * 绑定监控器数量
    */
    @SerializedName("MonitorNum")
    @Expose
    private Long MonitorNum;

    /**
    * 实例绑定套餐资源id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 订阅事件列表
    */
    @SerializedName("NotifyEventSet")
    @Expose
    private String [] NotifyEventSet;

    /**
    * 实例创建时间
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * 实例更新时间
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
     * Get 业务域名 
     * @return Domain 业务域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 业务域名
     * @param Domain 业务域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Cname域名接入方式
CUSTOM: 自定义接入域名
SYSTEM: 系统接入域名 
     * @return AccessType Cname域名接入方式
CUSTOM: 自定义接入域名
SYSTEM: 系统接入域名
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set Cname域名接入方式
CUSTOM: 自定义接入域名
SYSTEM: 系统接入域名
     * @param AccessType Cname域名接入方式
CUSTOM: 自定义接入域名
SYSTEM: 系统接入域名
     */
    public void setAccessType(String AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get 接入子域名	 
     * @return AccessSubDomain 接入子域名	
     */
    public String getAccessSubDomain() {
        return this.AccessSubDomain;
    }

    /**
     * Set 接入子域名	
     * @param AccessSubDomain 接入子域名	
     */
    public void setAccessSubDomain(String AccessSubDomain) {
        this.AccessSubDomain = AccessSubDomain;
    }

    /**
     * Get 接入域名	 
     * @return AccessDomain 接入域名	
     */
    public String getAccessDomain() {
        return this.AccessDomain;
    }

    /**
     * Set 接入域名	
     * @param AccessDomain 接入域名	
     */
    public void setAccessDomain(String AccessDomain) {
        this.AccessDomain = AccessDomain;
    }

    /**
     * Get 解析生效时间 
     * @return GlobalTtl 解析生效时间
     */
    public Long getGlobalTtl() {
        return this.GlobalTtl;
    }

    /**
     * Set 解析生效时间
     * @param GlobalTtl 解析生效时间
     */
    public void setGlobalTtl(Long GlobalTtl) {
        this.GlobalTtl = GlobalTtl;
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
     * Get 实例运行状态
NORMAL: 健康
FAULTY: 有风险
DOWN: 宕机
UNKNOWN: 未知 
     * @return WorkingStatus 实例运行状态
NORMAL: 健康
FAULTY: 有风险
DOWN: 宕机
UNKNOWN: 未知
     */
    public String getWorkingStatus() {
        return this.WorkingStatus;
    }

    /**
     * Set 实例运行状态
NORMAL: 健康
FAULTY: 有风险
DOWN: 宕机
UNKNOWN: 未知
     * @param WorkingStatus 实例运行状态
NORMAL: 健康
FAULTY: 有风险
DOWN: 宕机
UNKNOWN: 未知
     */
    public void setWorkingStatus(String WorkingStatus) {
        this.WorkingStatus = WorkingStatus;
    }

    /**
     * Get 实例状态，ENABLED: 正常；DISABLED: 禁用 
     * @return Status 实例状态，ENABLED: 正常；DISABLED: 禁用
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态，ENABLED: 正常；DISABLED: 禁用
     * @param Status 实例状态，ENABLED: 正常；DISABLED: 禁用
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get cname是否接入：true已接入；false未接入 
     * @return IsCnameConfigured cname是否接入：true已接入；false未接入
     */
    public Boolean getIsCnameConfigured() {
        return this.IsCnameConfigured;
    }

    /**
     * Set cname是否接入：true已接入；false未接入
     * @param IsCnameConfigured cname是否接入：true已接入；false未接入
     */
    public void setIsCnameConfigured(Boolean IsCnameConfigured) {
        this.IsCnameConfigured = IsCnameConfigured;
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
     * Get 策略数量 
     * @return StrategyNum 策略数量
     */
    public Long getStrategyNum() {
        return this.StrategyNum;
    }

    /**
     * Set 策略数量
     * @param StrategyNum 策略数量
     */
    public void setStrategyNum(Long StrategyNum) {
        this.StrategyNum = StrategyNum;
    }

    /**
     * Get 绑定地址池个数 
     * @return AddressPoolNum 绑定地址池个数
     */
    public Long getAddressPoolNum() {
        return this.AddressPoolNum;
    }

    /**
     * Set 绑定地址池个数
     * @param AddressPoolNum 绑定地址池个数
     */
    public void setAddressPoolNum(Long AddressPoolNum) {
        this.AddressPoolNum = AddressPoolNum;
    }

    /**
     * Get 绑定监控器数量 
     * @return MonitorNum 绑定监控器数量
     */
    public Long getMonitorNum() {
        return this.MonitorNum;
    }

    /**
     * Set 绑定监控器数量
     * @param MonitorNum 绑定监控器数量
     */
    public void setMonitorNum(Long MonitorNum) {
        this.MonitorNum = MonitorNum;
    }

    /**
     * Get 实例绑定套餐资源id 
     * @return ResourceId 实例绑定套餐资源id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 实例绑定套餐资源id
     * @param ResourceId 实例绑定套餐资源id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 订阅事件列表 
     * @return NotifyEventSet 订阅事件列表
     */
    public String [] getNotifyEventSet() {
        return this.NotifyEventSet;
    }

    /**
     * Set 订阅事件列表
     * @param NotifyEventSet 订阅事件列表
     */
    public void setNotifyEventSet(String [] NotifyEventSet) {
        this.NotifyEventSet = NotifyEventSet;
    }

    /**
     * Get 实例创建时间 
     * @return CreatedOn 实例创建时间
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 实例创建时间
     * @param CreatedOn 实例创建时间
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 实例更新时间 
     * @return UpdatedOn 实例更新时间
     */
    public String getUpdatedOn() {
        return this.UpdatedOn;
    }

    /**
     * Set 实例更新时间
     * @param UpdatedOn 实例更新时间
     */
    public void setUpdatedOn(String UpdatedOn) {
        this.UpdatedOn = UpdatedOn;
    }

    public InstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceDetail(InstanceDetail source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.AccessType != null) {
            this.AccessType = new String(source.AccessType);
        }
        if (source.AccessSubDomain != null) {
            this.AccessSubDomain = new String(source.AccessSubDomain);
        }
        if (source.AccessDomain != null) {
            this.AccessDomain = new String(source.AccessDomain);
        }
        if (source.GlobalTtl != null) {
            this.GlobalTtl = new Long(source.GlobalTtl);
        }
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.WorkingStatus != null) {
            this.WorkingStatus = new String(source.WorkingStatus);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.IsCnameConfigured != null) {
            this.IsCnameConfigured = new Boolean(source.IsCnameConfigured);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.StrategyNum != null) {
            this.StrategyNum = new Long(source.StrategyNum);
        }
        if (source.AddressPoolNum != null) {
            this.AddressPoolNum = new Long(source.AddressPoolNum);
        }
        if (source.MonitorNum != null) {
            this.MonitorNum = new Long(source.MonitorNum);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.NotifyEventSet != null) {
            this.NotifyEventSet = new String[source.NotifyEventSet.length];
            for (int i = 0; i < source.NotifyEventSet.length; i++) {
                this.NotifyEventSet[i] = new String(source.NotifyEventSet[i]);
            }
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
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "AccessSubDomain", this.AccessSubDomain);
        this.setParamSimple(map, prefix + "AccessDomain", this.AccessDomain);
        this.setParamSimple(map, prefix + "GlobalTtl", this.GlobalTtl);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "WorkingStatus", this.WorkingStatus);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsCnameConfigured", this.IsCnameConfigured);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "StrategyNum", this.StrategyNum);
        this.setParamSimple(map, prefix + "AddressPoolNum", this.AddressPoolNum);
        this.setParamSimple(map, prefix + "MonitorNum", this.MonitorNum);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamArraySimple(map, prefix + "NotifyEventSet.", this.NotifyEventSet);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "UpdatedOn", this.UpdatedOn);

    }
}

