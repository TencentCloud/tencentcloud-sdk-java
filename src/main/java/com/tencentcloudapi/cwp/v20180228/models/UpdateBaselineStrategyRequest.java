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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateBaselineStrategyRequest extends AbstractModel{

    /**
    * 策略id
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
    * 策略名称
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * 检测周期
    */
    @SerializedName("ScanCycle")
    @Expose
    private Long ScanCycle;

    /**
    * 定期检测时间，该时间下发扫描
    */
    @SerializedName("ScanAt")
    @Expose
    private String ScanAt;

    /**
    * 该策略下选择的基线id数组
    */
    @SerializedName("CategoryIds")
    @Expose
    private String [] CategoryIds;

    /**
    * 扫描范围是否全部服务器, 1:是  0:否, 为1则为全部专业版主机
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * 云主机类型：
cvm：腾讯云服务器
bm：裸金属
ecm：边缘计算主机
lh:轻量应用服务器
other:混合云机器
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * 主机地域 ap-guangzhou
    */
    @SerializedName("RegionCode")
    @Expose
    private String RegionCode;

    /**
    * 主机id数组
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

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
     * Get 检测周期 
     * @return ScanCycle 检测周期
     */
    public Long getScanCycle() {
        return this.ScanCycle;
    }

    /**
     * Set 检测周期
     * @param ScanCycle 检测周期
     */
    public void setScanCycle(Long ScanCycle) {
        this.ScanCycle = ScanCycle;
    }

    /**
     * Get 定期检测时间，该时间下发扫描 
     * @return ScanAt 定期检测时间，该时间下发扫描
     */
    public String getScanAt() {
        return this.ScanAt;
    }

    /**
     * Set 定期检测时间，该时间下发扫描
     * @param ScanAt 定期检测时间，该时间下发扫描
     */
    public void setScanAt(String ScanAt) {
        this.ScanAt = ScanAt;
    }

    /**
     * Get 该策略下选择的基线id数组 
     * @return CategoryIds 该策略下选择的基线id数组
     */
    public String [] getCategoryIds() {
        return this.CategoryIds;
    }

    /**
     * Set 该策略下选择的基线id数组
     * @param CategoryIds 该策略下选择的基线id数组
     */
    public void setCategoryIds(String [] CategoryIds) {
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
     * Get 云主机类型：
cvm：腾讯云服务器
bm：裸金属
ecm：边缘计算主机
lh:轻量应用服务器
other:混合云机器 
     * @return MachineType 云主机类型：
cvm：腾讯云服务器
bm：裸金属
ecm：边缘计算主机
lh:轻量应用服务器
other:混合云机器
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set 云主机类型：
cvm：腾讯云服务器
bm：裸金属
ecm：边缘计算主机
lh:轻量应用服务器
other:混合云机器
     * @param MachineType 云主机类型：
cvm：腾讯云服务器
bm：裸金属
ecm：边缘计算主机
lh:轻量应用服务器
other:混合云机器
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get 主机地域 ap-guangzhou 
     * @return RegionCode 主机地域 ap-guangzhou
     */
    public String getRegionCode() {
        return this.RegionCode;
    }

    /**
     * Set 主机地域 ap-guangzhou
     * @param RegionCode 主机地域 ap-guangzhou
     */
    public void setRegionCode(String RegionCode) {
        this.RegionCode = RegionCode;
    }

    /**
     * Get 主机id数组 
     * @return Quuids 主机id数组
     */
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set 主机id数组
     * @param Quuids 主机id数组
     */
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    public UpdateBaselineStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateBaselineStrategyRequest(UpdateBaselineStrategyRequest source) {
        if (source.StrategyId != null) {
            this.StrategyId = new Long(source.StrategyId);
        }
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.ScanCycle != null) {
            this.ScanCycle = new Long(source.ScanCycle);
        }
        if (source.ScanAt != null) {
            this.ScanAt = new String(source.ScanAt);
        }
        if (source.CategoryIds != null) {
            this.CategoryIds = new String[source.CategoryIds.length];
            for (int i = 0; i < source.CategoryIds.length; i++) {
                this.CategoryIds[i] = new String(source.CategoryIds[i]);
            }
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Long(source.IsGlobal);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.RegionCode != null) {
            this.RegionCode = new String(source.RegionCode);
        }
        if (source.Quuids != null) {
            this.Quuids = new String[source.Quuids.length];
            for (int i = 0; i < source.Quuids.length; i++) {
                this.Quuids[i] = new String(source.Quuids[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
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

