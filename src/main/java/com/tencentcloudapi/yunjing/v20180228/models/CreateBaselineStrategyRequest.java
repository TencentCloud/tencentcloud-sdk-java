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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBaselineStrategyRequest extends AbstractModel{

    /**
    * 策略名称
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * 检测周期, 表示每隔多少天进行检测.示例: 2, 表示每2天进行检测一次.
    */
    @SerializedName("ScanCycle")
    @Expose
    private Long ScanCycle;

    /**
    * 定期检测时间，该时间下发扫描. 示例:“22:00”, 表示在22:00下发检测
    */
    @SerializedName("ScanAt")
    @Expose
    private String ScanAt;

    /**
    * 该策略下选择的基线id数组. 示例: [1,3,5,7]
    */
    @SerializedName("CategoryIds")
    @Expose
    private Long [] CategoryIds;

    /**
    * 扫描范围是否全部服务器, 1:是  0:否, 为1则为全部专业版主机
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * 云主机类型：“CVM”：虚拟主机，"BMS"：裸金属，"ECM"：边缘计算主机
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * 主机地域. 示例: "ap-bj"
    */
    @SerializedName("RegionCode")
    @Expose
    private String RegionCode;

    /**
    * 主机id数组. 示例: ["quuid1","quuid2"]
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

    /**
     * Get 策略名称 
     * @return StrategyName 策略名称
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set 策略名称
     * @param StrategyName 策略名称
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get 检测周期, 表示每隔多少天进行检测.示例: 2, 表示每2天进行检测一次. 
     * @return ScanCycle 检测周期, 表示每隔多少天进行检测.示例: 2, 表示每2天进行检测一次.
     */
    public Long getScanCycle() {
        return this.ScanCycle;
    }

    /**
     * Set 检测周期, 表示每隔多少天进行检测.示例: 2, 表示每2天进行检测一次.
     * @param ScanCycle 检测周期, 表示每隔多少天进行检测.示例: 2, 表示每2天进行检测一次.
     */
    public void setScanCycle(Long ScanCycle) {
        this.ScanCycle = ScanCycle;
    }

    /**
     * Get 定期检测时间，该时间下发扫描. 示例:“22:00”, 表示在22:00下发检测 
     * @return ScanAt 定期检测时间，该时间下发扫描. 示例:“22:00”, 表示在22:00下发检测
     */
    public String getScanAt() {
        return this.ScanAt;
    }

    /**
     * Set 定期检测时间，该时间下发扫描. 示例:“22:00”, 表示在22:00下发检测
     * @param ScanAt 定期检测时间，该时间下发扫描. 示例:“22:00”, 表示在22:00下发检测
     */
    public void setScanAt(String ScanAt) {
        this.ScanAt = ScanAt;
    }

    /**
     * Get 该策略下选择的基线id数组. 示例: [1,3,5,7] 
     * @return CategoryIds 该策略下选择的基线id数组. 示例: [1,3,5,7]
     */
    public Long [] getCategoryIds() {
        return this.CategoryIds;
    }

    /**
     * Set 该策略下选择的基线id数组. 示例: [1,3,5,7]
     * @param CategoryIds 该策略下选择的基线id数组. 示例: [1,3,5,7]
     */
    public void setCategoryIds(Long [] CategoryIds) {
        this.CategoryIds = CategoryIds;
    }

    /**
     * Get 扫描范围是否全部服务器, 1:是  0:否, 为1则为全部专业版主机 
     * @return IsGlobal 扫描范围是否全部服务器, 1:是  0:否, 为1则为全部专业版主机
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set 扫描范围是否全部服务器, 1:是  0:否, 为1则为全部专业版主机
     * @param IsGlobal 扫描范围是否全部服务器, 1:是  0:否, 为1则为全部专业版主机
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get 云主机类型：“CVM”：虚拟主机，"BMS"：裸金属，"ECM"：边缘计算主机 
     * @return MachineType 云主机类型：“CVM”：虚拟主机，"BMS"：裸金属，"ECM"：边缘计算主机
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set 云主机类型：“CVM”：虚拟主机，"BMS"：裸金属，"ECM"：边缘计算主机
     * @param MachineType 云主机类型：“CVM”：虚拟主机，"BMS"：裸金属，"ECM"：边缘计算主机
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get 主机地域. 示例: "ap-bj" 
     * @return RegionCode 主机地域. 示例: "ap-bj"
     */
    public String getRegionCode() {
        return this.RegionCode;
    }

    /**
     * Set 主机地域. 示例: "ap-bj"
     * @param RegionCode 主机地域. 示例: "ap-bj"
     */
    public void setRegionCode(String RegionCode) {
        this.RegionCode = RegionCode;
    }

    /**
     * Get 主机id数组. 示例: ["quuid1","quuid2"] 
     * @return Quuids 主机id数组. 示例: ["quuid1","quuid2"]
     */
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set 主机id数组. 示例: ["quuid1","quuid2"]
     * @param Quuids 主机id数组. 示例: ["quuid1","quuid2"]
     */
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "ScanCycle", this.ScanCycle);
        this.setParamSimple(map, prefix + "ScanAt", this.ScanAt);
        this.setParamArraySimple(map, prefix + "CategoryIds.", this.CategoryIds);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "RegionCode", this.RegionCode);
        this.setParamArraySimple(map, prefix + "Quuids.", this.Quuids);

    }
}

