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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetDeviceModel extends AbstractModel {

    /**
    * 版本号
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 型号和版本的组合名称
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * 型号名
    */
    @SerializedName("DevModel")
    @Expose
    private String DevModel;

    /**
    * 宽度
    */
    @SerializedName("DevWidth")
    @Expose
    private String DevWidth;

    /**
    * 深度
    */
    @SerializedName("DevDepth")
    @Expose
    private String DevDepth;

    /**
    * 重量
    */
    @SerializedName("DevWeight")
    @Expose
    private String DevWeight;

    /**
    * 是否携带挂耳
    */
    @SerializedName("MountEar")
    @Expose
    private String MountEar;

    /**
    * 是否符合CCC认证
    */
    @SerializedName("AccordCCC")
    @Expose
    private String AccordCCC;

    /**
    * 是否通过入网许可认证
    */
    @SerializedName("PassNetwork")
    @Expose
    private String PassNetwork;

    /**
    * 电源接口型号
    */
    @SerializedName("PowerportType")
    @Expose
    private String PowerportType;

    /**
    * 电源模块
    */
    @SerializedName("PowerModule")
    @Expose
    private String PowerModule;

    /**
    * 电源模块数量
    */
    @SerializedName("PowermoduleNum")
    @Expose
    private String PowermoduleNum;

    /**
    * 电源模块位置
    */
    @SerializedName("PowermodulePosition")
    @Expose
    private String PowermodulePosition;

    /**
    * 高压直流自适应
    */
    @SerializedName("HighVoltageAdapt")
    @Expose
    private String HighVoltageAdapt;

    /**
    * 实际工作功耗(W)
    */
    @SerializedName("PowerEnergy")
    @Expose
    private String PowerEnergy;

    /**
    * 进风口位置
    */
    @SerializedName("InwindPosition")
    @Expose
    private String InwindPosition;

    /**
    * 出风口位置
    */
    @SerializedName("OutwindPosition")
    @Expose
    private String OutwindPosition;

    /**
    * 业务端口位置
    */
    @SerializedName("BusinessPortPosition")
    @Expose
    private String BusinessPortPosition;

    /**
    * 带有理线器
    */
    @SerializedName("LineManager")
    @Expose
    private String LineManager;

    /**
    * 0 代表在当前园区没评估过，1 代表完全满足IDC准入标准  2 代表存在托管风险  3 代表不满足IDC准入标准
    */
    @SerializedName("CheckResult")
    @Expose
    private Long CheckResult;

    /**
    * 设备高度
    */
    @SerializedName("DevHeight")
    @Expose
    private String DevHeight;

    /**
     * Get 版本号 
     * @return Version 版本号
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 版本号
     * @param Version 版本号
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 型号和版本的组合名称 
     * @return ModelVersion 型号和版本的组合名称
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set 型号和版本的组合名称
     * @param ModelVersion 型号和版本的组合名称
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get 型号名 
     * @return DevModel 型号名
     */
    public String getDevModel() {
        return this.DevModel;
    }

    /**
     * Set 型号名
     * @param DevModel 型号名
     */
    public void setDevModel(String DevModel) {
        this.DevModel = DevModel;
    }

    /**
     * Get 宽度 
     * @return DevWidth 宽度
     */
    public String getDevWidth() {
        return this.DevWidth;
    }

    /**
     * Set 宽度
     * @param DevWidth 宽度
     */
    public void setDevWidth(String DevWidth) {
        this.DevWidth = DevWidth;
    }

    /**
     * Get 深度 
     * @return DevDepth 深度
     */
    public String getDevDepth() {
        return this.DevDepth;
    }

    /**
     * Set 深度
     * @param DevDepth 深度
     */
    public void setDevDepth(String DevDepth) {
        this.DevDepth = DevDepth;
    }

    /**
     * Get 重量 
     * @return DevWeight 重量
     */
    public String getDevWeight() {
        return this.DevWeight;
    }

    /**
     * Set 重量
     * @param DevWeight 重量
     */
    public void setDevWeight(String DevWeight) {
        this.DevWeight = DevWeight;
    }

    /**
     * Get 是否携带挂耳 
     * @return MountEar 是否携带挂耳
     */
    public String getMountEar() {
        return this.MountEar;
    }

    /**
     * Set 是否携带挂耳
     * @param MountEar 是否携带挂耳
     */
    public void setMountEar(String MountEar) {
        this.MountEar = MountEar;
    }

    /**
     * Get 是否符合CCC认证 
     * @return AccordCCC 是否符合CCC认证
     */
    public String getAccordCCC() {
        return this.AccordCCC;
    }

    /**
     * Set 是否符合CCC认证
     * @param AccordCCC 是否符合CCC认证
     */
    public void setAccordCCC(String AccordCCC) {
        this.AccordCCC = AccordCCC;
    }

    /**
     * Get 是否通过入网许可认证 
     * @return PassNetwork 是否通过入网许可认证
     */
    public String getPassNetwork() {
        return this.PassNetwork;
    }

    /**
     * Set 是否通过入网许可认证
     * @param PassNetwork 是否通过入网许可认证
     */
    public void setPassNetwork(String PassNetwork) {
        this.PassNetwork = PassNetwork;
    }

    /**
     * Get 电源接口型号 
     * @return PowerportType 电源接口型号
     */
    public String getPowerportType() {
        return this.PowerportType;
    }

    /**
     * Set 电源接口型号
     * @param PowerportType 电源接口型号
     */
    public void setPowerportType(String PowerportType) {
        this.PowerportType = PowerportType;
    }

    /**
     * Get 电源模块 
     * @return PowerModule 电源模块
     */
    public String getPowerModule() {
        return this.PowerModule;
    }

    /**
     * Set 电源模块
     * @param PowerModule 电源模块
     */
    public void setPowerModule(String PowerModule) {
        this.PowerModule = PowerModule;
    }

    /**
     * Get 电源模块数量 
     * @return PowermoduleNum 电源模块数量
     */
    public String getPowermoduleNum() {
        return this.PowermoduleNum;
    }

    /**
     * Set 电源模块数量
     * @param PowermoduleNum 电源模块数量
     */
    public void setPowermoduleNum(String PowermoduleNum) {
        this.PowermoduleNum = PowermoduleNum;
    }

    /**
     * Get 电源模块位置 
     * @return PowermodulePosition 电源模块位置
     */
    public String getPowermodulePosition() {
        return this.PowermodulePosition;
    }

    /**
     * Set 电源模块位置
     * @param PowermodulePosition 电源模块位置
     */
    public void setPowermodulePosition(String PowermodulePosition) {
        this.PowermodulePosition = PowermodulePosition;
    }

    /**
     * Get 高压直流自适应 
     * @return HighVoltageAdapt 高压直流自适应
     */
    public String getHighVoltageAdapt() {
        return this.HighVoltageAdapt;
    }

    /**
     * Set 高压直流自适应
     * @param HighVoltageAdapt 高压直流自适应
     */
    public void setHighVoltageAdapt(String HighVoltageAdapt) {
        this.HighVoltageAdapt = HighVoltageAdapt;
    }

    /**
     * Get 实际工作功耗(W) 
     * @return PowerEnergy 实际工作功耗(W)
     */
    public String getPowerEnergy() {
        return this.PowerEnergy;
    }

    /**
     * Set 实际工作功耗(W)
     * @param PowerEnergy 实际工作功耗(W)
     */
    public void setPowerEnergy(String PowerEnergy) {
        this.PowerEnergy = PowerEnergy;
    }

    /**
     * Get 进风口位置 
     * @return InwindPosition 进风口位置
     */
    public String getInwindPosition() {
        return this.InwindPosition;
    }

    /**
     * Set 进风口位置
     * @param InwindPosition 进风口位置
     */
    public void setInwindPosition(String InwindPosition) {
        this.InwindPosition = InwindPosition;
    }

    /**
     * Get 出风口位置 
     * @return OutwindPosition 出风口位置
     */
    public String getOutwindPosition() {
        return this.OutwindPosition;
    }

    /**
     * Set 出风口位置
     * @param OutwindPosition 出风口位置
     */
    public void setOutwindPosition(String OutwindPosition) {
        this.OutwindPosition = OutwindPosition;
    }

    /**
     * Get 业务端口位置 
     * @return BusinessPortPosition 业务端口位置
     */
    public String getBusinessPortPosition() {
        return this.BusinessPortPosition;
    }

    /**
     * Set 业务端口位置
     * @param BusinessPortPosition 业务端口位置
     */
    public void setBusinessPortPosition(String BusinessPortPosition) {
        this.BusinessPortPosition = BusinessPortPosition;
    }

    /**
     * Get 带有理线器 
     * @return LineManager 带有理线器
     */
    public String getLineManager() {
        return this.LineManager;
    }

    /**
     * Set 带有理线器
     * @param LineManager 带有理线器
     */
    public void setLineManager(String LineManager) {
        this.LineManager = LineManager;
    }

    /**
     * Get 0 代表在当前园区没评估过，1 代表完全满足IDC准入标准  2 代表存在托管风险  3 代表不满足IDC准入标准 
     * @return CheckResult 0 代表在当前园区没评估过，1 代表完全满足IDC准入标准  2 代表存在托管风险  3 代表不满足IDC准入标准
     */
    public Long getCheckResult() {
        return this.CheckResult;
    }

    /**
     * Set 0 代表在当前园区没评估过，1 代表完全满足IDC准入标准  2 代表存在托管风险  3 代表不满足IDC准入标准
     * @param CheckResult 0 代表在当前园区没评估过，1 代表完全满足IDC准入标准  2 代表存在托管风险  3 代表不满足IDC准入标准
     */
    public void setCheckResult(Long CheckResult) {
        this.CheckResult = CheckResult;
    }

    /**
     * Get 设备高度 
     * @return DevHeight 设备高度
     */
    public String getDevHeight() {
        return this.DevHeight;
    }

    /**
     * Set 设备高度
     * @param DevHeight 设备高度
     */
    public void setDevHeight(String DevHeight) {
        this.DevHeight = DevHeight;
    }

    public NetDeviceModel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetDeviceModel(NetDeviceModel source) {
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
        if (source.DevModel != null) {
            this.DevModel = new String(source.DevModel);
        }
        if (source.DevWidth != null) {
            this.DevWidth = new String(source.DevWidth);
        }
        if (source.DevDepth != null) {
            this.DevDepth = new String(source.DevDepth);
        }
        if (source.DevWeight != null) {
            this.DevWeight = new String(source.DevWeight);
        }
        if (source.MountEar != null) {
            this.MountEar = new String(source.MountEar);
        }
        if (source.AccordCCC != null) {
            this.AccordCCC = new String(source.AccordCCC);
        }
        if (source.PassNetwork != null) {
            this.PassNetwork = new String(source.PassNetwork);
        }
        if (source.PowerportType != null) {
            this.PowerportType = new String(source.PowerportType);
        }
        if (source.PowerModule != null) {
            this.PowerModule = new String(source.PowerModule);
        }
        if (source.PowermoduleNum != null) {
            this.PowermoduleNum = new String(source.PowermoduleNum);
        }
        if (source.PowermodulePosition != null) {
            this.PowermodulePosition = new String(source.PowermodulePosition);
        }
        if (source.HighVoltageAdapt != null) {
            this.HighVoltageAdapt = new String(source.HighVoltageAdapt);
        }
        if (source.PowerEnergy != null) {
            this.PowerEnergy = new String(source.PowerEnergy);
        }
        if (source.InwindPosition != null) {
            this.InwindPosition = new String(source.InwindPosition);
        }
        if (source.OutwindPosition != null) {
            this.OutwindPosition = new String(source.OutwindPosition);
        }
        if (source.BusinessPortPosition != null) {
            this.BusinessPortPosition = new String(source.BusinessPortPosition);
        }
        if (source.LineManager != null) {
            this.LineManager = new String(source.LineManager);
        }
        if (source.CheckResult != null) {
            this.CheckResult = new Long(source.CheckResult);
        }
        if (source.DevHeight != null) {
            this.DevHeight = new String(source.DevHeight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamSimple(map, prefix + "DevModel", this.DevModel);
        this.setParamSimple(map, prefix + "DevWidth", this.DevWidth);
        this.setParamSimple(map, prefix + "DevDepth", this.DevDepth);
        this.setParamSimple(map, prefix + "DevWeight", this.DevWeight);
        this.setParamSimple(map, prefix + "MountEar", this.MountEar);
        this.setParamSimple(map, prefix + "AccordCCC", this.AccordCCC);
        this.setParamSimple(map, prefix + "PassNetwork", this.PassNetwork);
        this.setParamSimple(map, prefix + "PowerportType", this.PowerportType);
        this.setParamSimple(map, prefix + "PowerModule", this.PowerModule);
        this.setParamSimple(map, prefix + "PowermoduleNum", this.PowermoduleNum);
        this.setParamSimple(map, prefix + "PowermodulePosition", this.PowermodulePosition);
        this.setParamSimple(map, prefix + "HighVoltageAdapt", this.HighVoltageAdapt);
        this.setParamSimple(map, prefix + "PowerEnergy", this.PowerEnergy);
        this.setParamSimple(map, prefix + "InwindPosition", this.InwindPosition);
        this.setParamSimple(map, prefix + "OutwindPosition", this.OutwindPosition);
        this.setParamSimple(map, prefix + "BusinessPortPosition", this.BusinessPortPosition);
        this.setParamSimple(map, prefix + "LineManager", this.LineManager);
        this.setParamSimple(map, prefix + "CheckResult", this.CheckResult);
        this.setParamSimple(map, prefix + "DevHeight", this.DevHeight);

    }
}

