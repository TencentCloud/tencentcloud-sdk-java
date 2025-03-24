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

public class ServerModel extends AbstractModel {

    /**
    * 型号名称
    */
    @SerializedName("DevModel")
    @Expose
    private String DevModel;

    /**
    * 节点数
    */
    @SerializedName("DevNode")
    @Expose
    private String DevNode;

    /**
    * 设备高度
    */
    @SerializedName("DevHeight")
    @Expose
    private String DevHeight;

    /**
    * 功耗
    */
    @SerializedName("PowerEnergy")
    @Expose
    private String PowerEnergy;

    /**
    * 电源接口型号
    */
    @SerializedName("PowerportType")
    @Expose
    private String PowerportType;

    /**
    * 电源模块数量
    */
    @SerializedName("PowermoduleNum")
    @Expose
    private String PowermoduleNum;

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
    * 网卡接口位置
    */
    @SerializedName("NetportPosition")
    @Expose
    private String NetportPosition;

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
    * 电源模块
    */
    @SerializedName("PowerModule")
    @Expose
    private String PowerModule;

    /**
    * 电源模块位置
    */
    @SerializedName("PowermodulePosition")
    @Expose
    private String PowermodulePosition;

    /**
    * 网络接口类型
    */
    @SerializedName("NetportType")
    @Expose
    private String NetportType;

    /**
    * 网卡速率
    */
    @SerializedName("NetSpeed")
    @Expose
    private String NetSpeed;

    /**
    * 0 代表在当前园区没评估过，1 代表完全满足IDC准入标准 2 代表存在托管风险 3 代表不满足IDC准入标准
    */
    @SerializedName("CheckResult")
    @Expose
    private Long CheckResult;

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
     * Get 型号名称 
     * @return DevModel 型号名称
     */
    public String getDevModel() {
        return this.DevModel;
    }

    /**
     * Set 型号名称
     * @param DevModel 型号名称
     */
    public void setDevModel(String DevModel) {
        this.DevModel = DevModel;
    }

    /**
     * Get 节点数 
     * @return DevNode 节点数
     */
    public String getDevNode() {
        return this.DevNode;
    }

    /**
     * Set 节点数
     * @param DevNode 节点数
     */
    public void setDevNode(String DevNode) {
        this.DevNode = DevNode;
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

    /**
     * Get 功耗 
     * @return PowerEnergy 功耗
     */
    public String getPowerEnergy() {
        return this.PowerEnergy;
    }

    /**
     * Set 功耗
     * @param PowerEnergy 功耗
     */
    public void setPowerEnergy(String PowerEnergy) {
        this.PowerEnergy = PowerEnergy;
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
     * Get 网卡接口位置 
     * @return NetportPosition 网卡接口位置
     */
    public String getNetportPosition() {
        return this.NetportPosition;
    }

    /**
     * Set 网卡接口位置
     * @param NetportPosition 网卡接口位置
     */
    public void setNetportPosition(String NetportPosition) {
        this.NetportPosition = NetportPosition;
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
     * Get 网络接口类型 
     * @return NetportType 网络接口类型
     */
    public String getNetportType() {
        return this.NetportType;
    }

    /**
     * Set 网络接口类型
     * @param NetportType 网络接口类型
     */
    public void setNetportType(String NetportType) {
        this.NetportType = NetportType;
    }

    /**
     * Get 网卡速率 
     * @return NetSpeed 网卡速率
     */
    public String getNetSpeed() {
        return this.NetSpeed;
    }

    /**
     * Set 网卡速率
     * @param NetSpeed 网卡速率
     */
    public void setNetSpeed(String NetSpeed) {
        this.NetSpeed = NetSpeed;
    }

    /**
     * Get 0 代表在当前园区没评估过，1 代表完全满足IDC准入标准 2 代表存在托管风险 3 代表不满足IDC准入标准 
     * @return CheckResult 0 代表在当前园区没评估过，1 代表完全满足IDC准入标准 2 代表存在托管风险 3 代表不满足IDC准入标准
     */
    public Long getCheckResult() {
        return this.CheckResult;
    }

    /**
     * Set 0 代表在当前园区没评估过，1 代表完全满足IDC准入标准 2 代表存在托管风险 3 代表不满足IDC准入标准
     * @param CheckResult 0 代表在当前园区没评估过，1 代表完全满足IDC准入标准 2 代表存在托管风险 3 代表不满足IDC准入标准
     */
    public void setCheckResult(Long CheckResult) {
        this.CheckResult = CheckResult;
    }

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

    public ServerModel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServerModel(ServerModel source) {
        if (source.DevModel != null) {
            this.DevModel = new String(source.DevModel);
        }
        if (source.DevNode != null) {
            this.DevNode = new String(source.DevNode);
        }
        if (source.DevHeight != null) {
            this.DevHeight = new String(source.DevHeight);
        }
        if (source.PowerEnergy != null) {
            this.PowerEnergy = new String(source.PowerEnergy);
        }
        if (source.PowerportType != null) {
            this.PowerportType = new String(source.PowerportType);
        }
        if (source.PowermoduleNum != null) {
            this.PowermoduleNum = new String(source.PowermoduleNum);
        }
        if (source.InwindPosition != null) {
            this.InwindPosition = new String(source.InwindPosition);
        }
        if (source.OutwindPosition != null) {
            this.OutwindPosition = new String(source.OutwindPosition);
        }
        if (source.NetportPosition != null) {
            this.NetportPosition = new String(source.NetportPosition);
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
        if (source.PowerModule != null) {
            this.PowerModule = new String(source.PowerModule);
        }
        if (source.PowermodulePosition != null) {
            this.PowermodulePosition = new String(source.PowermodulePosition);
        }
        if (source.NetportType != null) {
            this.NetportType = new String(source.NetportType);
        }
        if (source.NetSpeed != null) {
            this.NetSpeed = new String(source.NetSpeed);
        }
        if (source.CheckResult != null) {
            this.CheckResult = new Long(source.CheckResult);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DevModel", this.DevModel);
        this.setParamSimple(map, prefix + "DevNode", this.DevNode);
        this.setParamSimple(map, prefix + "DevHeight", this.DevHeight);
        this.setParamSimple(map, prefix + "PowerEnergy", this.PowerEnergy);
        this.setParamSimple(map, prefix + "PowerportType", this.PowerportType);
        this.setParamSimple(map, prefix + "PowermoduleNum", this.PowermoduleNum);
        this.setParamSimple(map, prefix + "InwindPosition", this.InwindPosition);
        this.setParamSimple(map, prefix + "OutwindPosition", this.OutwindPosition);
        this.setParamSimple(map, prefix + "NetportPosition", this.NetportPosition);
        this.setParamSimple(map, prefix + "DevWidth", this.DevWidth);
        this.setParamSimple(map, prefix + "DevDepth", this.DevDepth);
        this.setParamSimple(map, prefix + "DevWeight", this.DevWeight);
        this.setParamSimple(map, prefix + "PowerModule", this.PowerModule);
        this.setParamSimple(map, prefix + "PowermodulePosition", this.PowermodulePosition);
        this.setParamSimple(map, prefix + "NetportType", this.NetportType);
        this.setParamSimple(map, prefix + "NetSpeed", this.NetSpeed);
        this.setParamSimple(map, prefix + "CheckResult", this.CheckResult);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);

    }
}

