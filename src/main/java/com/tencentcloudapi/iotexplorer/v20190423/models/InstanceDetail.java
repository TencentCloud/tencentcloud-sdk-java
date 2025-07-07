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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceDetail extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例类型（0 公共实例 1 标准企业实例 2新企业实例3新公共实例）
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * 地域字母缩写
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 区域全拼
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 支持设备总数
    */
    @SerializedName("TotalDeviceNum")
    @Expose
    private Long TotalDeviceNum;

    /**
    * 已注册设备数
    */
    @SerializedName("UsedDeviceNum")
    @Expose
    private Long UsedDeviceNum;

    /**
    * 项目数
    */
    @SerializedName("ProjectNum")
    @Expose
    private Long ProjectNum;

    /**
    * 产品数
    */
    @SerializedName("ProductNum")
    @Expose
    private Long ProductNum;

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
    * 过期时间，公共实例过期时间 0001-01-01T00:00:00Z，公共实例是永久有效
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 总设备数
    */
    @SerializedName("TotalDevice")
    @Expose
    private Long TotalDevice;

    /**
    * 激活设备数
    */
    @SerializedName("ActivateDevice")
    @Expose
    private Long ActivateDevice;

    /**
    * 备注
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 实例状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 消息上下行配置TPS
    */
    @SerializedName("UpDownTPS")
    @Expose
    private Long UpDownTPS;

    /**
    * 当前消息上下行TPS
    */
    @SerializedName("UpDownCurrentTPS")
    @Expose
    private Long UpDownCurrentTPS;

    /**
    * 消息转发配置TPS
    */
    @SerializedName("ForwardTPS")
    @Expose
    private Long ForwardTPS;

    /**
    * 消息转发当前TPS
    */
    @SerializedName("ForwardCurrentTPS")
    @Expose
    private Long ForwardCurrentTPS;

    /**
    * 实例单元数
    */
    @SerializedName("CellNum")
    @Expose
    private Long CellNum;

    /**
    * 实例Tag，企业实例必传
    */
    @SerializedName("BillingTag")
    @Expose
    private String BillingTag;

    /**
    * 每日消息数
    */
    @SerializedName("EverydayFreeMessageCount")
    @Expose
    private Long EverydayFreeMessageCount;

    /**
    * 最大在线设备数
    */
    @SerializedName("MaxDeviceOnlineCount")
    @Expose
    private Long MaxDeviceOnlineCount;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例类型（0 公共实例 1 标准企业实例 2新企业实例3新公共实例） 
     * @return InstanceType 实例类型（0 公共实例 1 标准企业实例 2新企业实例3新公共实例）
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型（0 公共实例 1 标准企业实例 2新企业实例3新公共实例）
     * @param InstanceType 实例类型（0 公共实例 1 标准企业实例 2新企业实例3新公共实例）
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 地域字母缩写 
     * @return Region 地域字母缩写
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域字母缩写
     * @param Region 地域字母缩写
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 区域全拼 
     * @return ZoneId 区域全拼
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 区域全拼
     * @param ZoneId 区域全拼
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 支持设备总数 
     * @return TotalDeviceNum 支持设备总数
     */
    public Long getTotalDeviceNum() {
        return this.TotalDeviceNum;
    }

    /**
     * Set 支持设备总数
     * @param TotalDeviceNum 支持设备总数
     */
    public void setTotalDeviceNum(Long TotalDeviceNum) {
        this.TotalDeviceNum = TotalDeviceNum;
    }

    /**
     * Get 已注册设备数 
     * @return UsedDeviceNum 已注册设备数
     */
    public Long getUsedDeviceNum() {
        return this.UsedDeviceNum;
    }

    /**
     * Set 已注册设备数
     * @param UsedDeviceNum 已注册设备数
     */
    public void setUsedDeviceNum(Long UsedDeviceNum) {
        this.UsedDeviceNum = UsedDeviceNum;
    }

    /**
     * Get 项目数 
     * @return ProjectNum 项目数
     */
    public Long getProjectNum() {
        return this.ProjectNum;
    }

    /**
     * Set 项目数
     * @param ProjectNum 项目数
     */
    public void setProjectNum(Long ProjectNum) {
        this.ProjectNum = ProjectNum;
    }

    /**
     * Get 产品数 
     * @return ProductNum 产品数
     */
    public Long getProductNum() {
        return this.ProductNum;
    }

    /**
     * Set 产品数
     * @param ProductNum 产品数
     */
    public void setProductNum(Long ProductNum) {
        this.ProductNum = ProductNum;
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
     * Get 过期时间，公共实例过期时间 0001-01-01T00:00:00Z，公共实例是永久有效 
     * @return ExpireTime 过期时间，公共实例过期时间 0001-01-01T00:00:00Z，公共实例是永久有效
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间，公共实例过期时间 0001-01-01T00:00:00Z，公共实例是永久有效
     * @param ExpireTime 过期时间，公共实例过期时间 0001-01-01T00:00:00Z，公共实例是永久有效
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 总设备数 
     * @return TotalDevice 总设备数
     */
    public Long getTotalDevice() {
        return this.TotalDevice;
    }

    /**
     * Set 总设备数
     * @param TotalDevice 总设备数
     */
    public void setTotalDevice(Long TotalDevice) {
        this.TotalDevice = TotalDevice;
    }

    /**
     * Get 激活设备数 
     * @return ActivateDevice 激活设备数
     */
    public Long getActivateDevice() {
        return this.ActivateDevice;
    }

    /**
     * Set 激活设备数
     * @param ActivateDevice 激活设备数
     */
    public void setActivateDevice(Long ActivateDevice) {
        this.ActivateDevice = ActivateDevice;
    }

    /**
     * Get 备注 
     * @return Description 备注
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 备注
     * @param Description 备注
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 实例状态 
     * @return Status 实例状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态
     * @param Status 实例状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 消息上下行配置TPS 
     * @return UpDownTPS 消息上下行配置TPS
     */
    public Long getUpDownTPS() {
        return this.UpDownTPS;
    }

    /**
     * Set 消息上下行配置TPS
     * @param UpDownTPS 消息上下行配置TPS
     */
    public void setUpDownTPS(Long UpDownTPS) {
        this.UpDownTPS = UpDownTPS;
    }

    /**
     * Get 当前消息上下行TPS 
     * @return UpDownCurrentTPS 当前消息上下行TPS
     */
    public Long getUpDownCurrentTPS() {
        return this.UpDownCurrentTPS;
    }

    /**
     * Set 当前消息上下行TPS
     * @param UpDownCurrentTPS 当前消息上下行TPS
     */
    public void setUpDownCurrentTPS(Long UpDownCurrentTPS) {
        this.UpDownCurrentTPS = UpDownCurrentTPS;
    }

    /**
     * Get 消息转发配置TPS 
     * @return ForwardTPS 消息转发配置TPS
     */
    public Long getForwardTPS() {
        return this.ForwardTPS;
    }

    /**
     * Set 消息转发配置TPS
     * @param ForwardTPS 消息转发配置TPS
     */
    public void setForwardTPS(Long ForwardTPS) {
        this.ForwardTPS = ForwardTPS;
    }

    /**
     * Get 消息转发当前TPS 
     * @return ForwardCurrentTPS 消息转发当前TPS
     */
    public Long getForwardCurrentTPS() {
        return this.ForwardCurrentTPS;
    }

    /**
     * Set 消息转发当前TPS
     * @param ForwardCurrentTPS 消息转发当前TPS
     */
    public void setForwardCurrentTPS(Long ForwardCurrentTPS) {
        this.ForwardCurrentTPS = ForwardCurrentTPS;
    }

    /**
     * Get 实例单元数 
     * @return CellNum 实例单元数
     */
    public Long getCellNum() {
        return this.CellNum;
    }

    /**
     * Set 实例单元数
     * @param CellNum 实例单元数
     */
    public void setCellNum(Long CellNum) {
        this.CellNum = CellNum;
    }

    /**
     * Get 实例Tag，企业实例必传 
     * @return BillingTag 实例Tag，企业实例必传
     */
    public String getBillingTag() {
        return this.BillingTag;
    }

    /**
     * Set 实例Tag，企业实例必传
     * @param BillingTag 实例Tag，企业实例必传
     */
    public void setBillingTag(String BillingTag) {
        this.BillingTag = BillingTag;
    }

    /**
     * Get 每日消息数 
     * @return EverydayFreeMessageCount 每日消息数
     */
    public Long getEverydayFreeMessageCount() {
        return this.EverydayFreeMessageCount;
    }

    /**
     * Set 每日消息数
     * @param EverydayFreeMessageCount 每日消息数
     */
    public void setEverydayFreeMessageCount(Long EverydayFreeMessageCount) {
        this.EverydayFreeMessageCount = EverydayFreeMessageCount;
    }

    /**
     * Get 最大在线设备数 
     * @return MaxDeviceOnlineCount 最大在线设备数
     */
    public Long getMaxDeviceOnlineCount() {
        return this.MaxDeviceOnlineCount;
    }

    /**
     * Set 最大在线设备数
     * @param MaxDeviceOnlineCount 最大在线设备数
     */
    public void setMaxDeviceOnlineCount(Long MaxDeviceOnlineCount) {
        this.MaxDeviceOnlineCount = MaxDeviceOnlineCount;
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
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.TotalDeviceNum != null) {
            this.TotalDeviceNum = new Long(source.TotalDeviceNum);
        }
        if (source.UsedDeviceNum != null) {
            this.UsedDeviceNum = new Long(source.UsedDeviceNum);
        }
        if (source.ProjectNum != null) {
            this.ProjectNum = new Long(source.ProjectNum);
        }
        if (source.ProductNum != null) {
            this.ProductNum = new Long(source.ProductNum);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.TotalDevice != null) {
            this.TotalDevice = new Long(source.TotalDevice);
        }
        if (source.ActivateDevice != null) {
            this.ActivateDevice = new Long(source.ActivateDevice);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.UpDownTPS != null) {
            this.UpDownTPS = new Long(source.UpDownTPS);
        }
        if (source.UpDownCurrentTPS != null) {
            this.UpDownCurrentTPS = new Long(source.UpDownCurrentTPS);
        }
        if (source.ForwardTPS != null) {
            this.ForwardTPS = new Long(source.ForwardTPS);
        }
        if (source.ForwardCurrentTPS != null) {
            this.ForwardCurrentTPS = new Long(source.ForwardCurrentTPS);
        }
        if (source.CellNum != null) {
            this.CellNum = new Long(source.CellNum);
        }
        if (source.BillingTag != null) {
            this.BillingTag = new String(source.BillingTag);
        }
        if (source.EverydayFreeMessageCount != null) {
            this.EverydayFreeMessageCount = new Long(source.EverydayFreeMessageCount);
        }
        if (source.MaxDeviceOnlineCount != null) {
            this.MaxDeviceOnlineCount = new Long(source.MaxDeviceOnlineCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "TotalDeviceNum", this.TotalDeviceNum);
        this.setParamSimple(map, prefix + "UsedDeviceNum", this.UsedDeviceNum);
        this.setParamSimple(map, prefix + "ProjectNum", this.ProjectNum);
        this.setParamSimple(map, prefix + "ProductNum", this.ProductNum);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "TotalDevice", this.TotalDevice);
        this.setParamSimple(map, prefix + "ActivateDevice", this.ActivateDevice);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UpDownTPS", this.UpDownTPS);
        this.setParamSimple(map, prefix + "UpDownCurrentTPS", this.UpDownCurrentTPS);
        this.setParamSimple(map, prefix + "ForwardTPS", this.ForwardTPS);
        this.setParamSimple(map, prefix + "ForwardCurrentTPS", this.ForwardCurrentTPS);
        this.setParamSimple(map, prefix + "CellNum", this.CellNum);
        this.setParamSimple(map, prefix + "BillingTag", this.BillingTag);
        this.setParamSimple(map, prefix + "EverydayFreeMessageCount", this.EverydayFreeMessageCount);
        this.setParamSimple(map, prefix + "MaxDeviceOnlineCount", this.MaxDeviceOnlineCount);

    }
}

