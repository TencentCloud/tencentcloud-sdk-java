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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceHardwareInfoItem extends AbstractModel {

    /**
    * 设备ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 设备唯一标识符
    */
    @SerializedName("Mid")
    @Expose
    private String Mid;

    /**
    * OS平台 0 Windows 1 Linux 2 macOS 4 Android 5 iOS
    */
    @SerializedName("OsType")
    @Expose
    private Long OsType;

    /**
    * 终端名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 终端用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 授权状态（ 4未授权 5已授权）
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 设备所属分组ID
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 设备所属分组名
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 设备所属分组路径
    */
    @SerializedName("GroupNamePath")
    @Expose
    private String GroupNamePath;

    /**
    * 最近登录账户的姓名
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * 出口IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * MAC地址
    */
    @SerializedName("MacAddr")
    @Expose
    private String MacAddr;

    /**
    * CPU品牌型号
    */
    @SerializedName("Cpu")
    @Expose
    private String Cpu;

    /**
    * 内存信息
    */
    @SerializedName("Memory")
    @Expose
    private String Memory;

    /**
    * 硬盘信息
    */
    @SerializedName("HardDiskSize")
    @Expose
    private String HardDiskSize;

    /**
    * 显示器品牌型号
    */
    @SerializedName("Monitor")
    @Expose
    private String Monitor;

    /**
    * 终端备注名
    */
    @SerializedName("RemarkName")
    @Expose
    private String RemarkName;

    /**
     * Get 设备ID 
     * @return Id 设备ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 设备ID
     * @param Id 设备ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 设备唯一标识符 
     * @return Mid 设备唯一标识符
     */
    public String getMid() {
        return this.Mid;
    }

    /**
     * Set 设备唯一标识符
     * @param Mid 设备唯一标识符
     */
    public void setMid(String Mid) {
        this.Mid = Mid;
    }

    /**
     * Get OS平台 0 Windows 1 Linux 2 macOS 4 Android 5 iOS 
     * @return OsType OS平台 0 Windows 1 Linux 2 macOS 4 Android 5 iOS
     */
    public Long getOsType() {
        return this.OsType;
    }

    /**
     * Set OS平台 0 Windows 1 Linux 2 macOS 4 Android 5 iOS
     * @param OsType OS平台 0 Windows 1 Linux 2 macOS 4 Android 5 iOS
     */
    public void setOsType(Long OsType) {
        this.OsType = OsType;
    }

    /**
     * Get 终端名 
     * @return Name 终端名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 终端名
     * @param Name 终端名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 终端用户名 
     * @return UserName 终端用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 终端用户名
     * @param UserName 终端用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 授权状态（ 4未授权 5已授权） 
     * @return Status 授权状态（ 4未授权 5已授权）
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 授权状态（ 4未授权 5已授权）
     * @param Status 授权状态（ 4未授权 5已授权）
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 设备所属分组ID 
     * @return GroupId 设备所属分组ID
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 设备所属分组ID
     * @param GroupId 设备所属分组ID
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 设备所属分组名 
     * @return GroupName 设备所属分组名
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 设备所属分组名
     * @param GroupName 设备所属分组名
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 设备所属分组路径 
     * @return GroupNamePath 设备所属分组路径
     */
    public String getGroupNamePath() {
        return this.GroupNamePath;
    }

    /**
     * Set 设备所属分组路径
     * @param GroupNamePath 设备所属分组路径
     */
    public void setGroupNamePath(String GroupNamePath) {
        this.GroupNamePath = GroupNamePath;
    }

    /**
     * Get 最近登录账户的姓名 
     * @return AccountName 最近登录账户的姓名
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set 最近登录账户的姓名
     * @param AccountName 最近登录账户的姓名
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get 出口IP 
     * @return Ip 出口IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 出口IP
     * @param Ip 出口IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get MAC地址 
     * @return MacAddr MAC地址
     */
    public String getMacAddr() {
        return this.MacAddr;
    }

    /**
     * Set MAC地址
     * @param MacAddr MAC地址
     */
    public void setMacAddr(String MacAddr) {
        this.MacAddr = MacAddr;
    }

    /**
     * Get CPU品牌型号 
     * @return Cpu CPU品牌型号
     */
    public String getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU品牌型号
     * @param Cpu CPU品牌型号
     */
    public void setCpu(String Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存信息 
     * @return Memory 内存信息
     */
    public String getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存信息
     * @param Memory 内存信息
     */
    public void setMemory(String Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 硬盘信息 
     * @return HardDiskSize 硬盘信息
     */
    public String getHardDiskSize() {
        return this.HardDiskSize;
    }

    /**
     * Set 硬盘信息
     * @param HardDiskSize 硬盘信息
     */
    public void setHardDiskSize(String HardDiskSize) {
        this.HardDiskSize = HardDiskSize;
    }

    /**
     * Get 显示器品牌型号 
     * @return Monitor 显示器品牌型号
     */
    public String getMonitor() {
        return this.Monitor;
    }

    /**
     * Set 显示器品牌型号
     * @param Monitor 显示器品牌型号
     */
    public void setMonitor(String Monitor) {
        this.Monitor = Monitor;
    }

    /**
     * Get 终端备注名 
     * @return RemarkName 终端备注名
     */
    public String getRemarkName() {
        return this.RemarkName;
    }

    /**
     * Set 终端备注名
     * @param RemarkName 终端备注名
     */
    public void setRemarkName(String RemarkName) {
        this.RemarkName = RemarkName;
    }

    public DescribeDeviceHardwareInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceHardwareInfoItem(DescribeDeviceHardwareInfoItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Mid != null) {
            this.Mid = new String(source.Mid);
        }
        if (source.OsType != null) {
            this.OsType = new Long(source.OsType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupNamePath != null) {
            this.GroupNamePath = new String(source.GroupNamePath);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.MacAddr != null) {
            this.MacAddr = new String(source.MacAddr);
        }
        if (source.Cpu != null) {
            this.Cpu = new String(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new String(source.Memory);
        }
        if (source.HardDiskSize != null) {
            this.HardDiskSize = new String(source.HardDiskSize);
        }
        if (source.Monitor != null) {
            this.Monitor = new String(source.Monitor);
        }
        if (source.RemarkName != null) {
            this.RemarkName = new String(source.RemarkName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Mid", this.Mid);
        this.setParamSimple(map, prefix + "OsType", this.OsType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupNamePath", this.GroupNamePath);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "MacAddr", this.MacAddr);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "HardDiskSize", this.HardDiskSize);
        this.setParamSimple(map, prefix + "Monitor", this.Monitor);
        this.setParamSimple(map, prefix + "RemarkName", this.RemarkName);

    }
}

