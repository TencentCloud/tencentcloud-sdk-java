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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeployGroupRequest extends AbstractModel{

    /**
    * 部署组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 程序包ID
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * 部署组启动参数
    */
    @SerializedName("StartupParameters")
    @Expose
    private String StartupParameters;

    /**
    * 部署应用描述信息
    */
    @SerializedName("DeployDesc")
    @Expose
    private String DeployDesc;

    /**
    * 是否允许强制启动
    */
    @SerializedName("ForceStart")
    @Expose
    private Boolean ForceStart;

    /**
    * 是否开启健康检查
    */
    @SerializedName("EnableHealthCheck")
    @Expose
    private Boolean EnableHealthCheck;

    /**
    * 开启健康检查时，配置健康检查
    */
    @SerializedName("HealthCheckSettings")
    @Expose
    private HealthCheckSettings HealthCheckSettings;

    /**
    * 部署方式，0表示快速更新，1表示滚动更新
    */
    @SerializedName("UpdateType")
    @Expose
    private Long UpdateType;

    /**
    * 是否启用beta批次
    */
    @SerializedName("DeployBetaEnable")
    @Expose
    private Boolean DeployBetaEnable;

    /**
    * 滚动发布每个批次参与的实例比率
    */
    @SerializedName("DeployBatch")
    @Expose
    private Float [] DeployBatch;

    /**
    * 滚动发布的执行方式
    */
    @SerializedName("DeployExeMode")
    @Expose
    private String DeployExeMode;

    /**
    * 滚动发布每个批次的时间间隔
    */
    @SerializedName("DeployWaitTime")
    @Expose
    private Long DeployWaitTime;

    /**
    * 启动脚本 base64编码
    */
    @SerializedName("StartScript")
    @Expose
    private String StartScript;

    /**
    * 停止脚本 base64编码
    */
    @SerializedName("StopScript")
    @Expose
    private String StopScript;

    /**
    * 是否进行增量部署，默认为false，全量更新
    */
    @SerializedName("IncrementalDeployment")
    @Expose
    private Boolean IncrementalDeployment;

    /**
    * JDK名称: konaJDK或openJDK
    */
    @SerializedName("JdkName")
    @Expose
    private String JdkName;

    /**
    * JDK版本: 8或11 (openJDK只支持8)
    */
    @SerializedName("JdkVersion")
    @Expose
    private String JdkVersion;

    /**
     * Get 部署组ID 
     * @return GroupId 部署组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 部署组ID
     * @param GroupId 部署组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 程序包ID 
     * @return PkgId 程序包ID
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * Set 程序包ID
     * @param PkgId 程序包ID
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
    }

    /**
     * Get 部署组启动参数 
     * @return StartupParameters 部署组启动参数
     */
    public String getStartupParameters() {
        return this.StartupParameters;
    }

    /**
     * Set 部署组启动参数
     * @param StartupParameters 部署组启动参数
     */
    public void setStartupParameters(String StartupParameters) {
        this.StartupParameters = StartupParameters;
    }

    /**
     * Get 部署应用描述信息 
     * @return DeployDesc 部署应用描述信息
     */
    public String getDeployDesc() {
        return this.DeployDesc;
    }

    /**
     * Set 部署应用描述信息
     * @param DeployDesc 部署应用描述信息
     */
    public void setDeployDesc(String DeployDesc) {
        this.DeployDesc = DeployDesc;
    }

    /**
     * Get 是否允许强制启动 
     * @return ForceStart 是否允许强制启动
     */
    public Boolean getForceStart() {
        return this.ForceStart;
    }

    /**
     * Set 是否允许强制启动
     * @param ForceStart 是否允许强制启动
     */
    public void setForceStart(Boolean ForceStart) {
        this.ForceStart = ForceStart;
    }

    /**
     * Get 是否开启健康检查 
     * @return EnableHealthCheck 是否开启健康检查
     */
    public Boolean getEnableHealthCheck() {
        return this.EnableHealthCheck;
    }

    /**
     * Set 是否开启健康检查
     * @param EnableHealthCheck 是否开启健康检查
     */
    public void setEnableHealthCheck(Boolean EnableHealthCheck) {
        this.EnableHealthCheck = EnableHealthCheck;
    }

    /**
     * Get 开启健康检查时，配置健康检查 
     * @return HealthCheckSettings 开启健康检查时，配置健康检查
     */
    public HealthCheckSettings getHealthCheckSettings() {
        return this.HealthCheckSettings;
    }

    /**
     * Set 开启健康检查时，配置健康检查
     * @param HealthCheckSettings 开启健康检查时，配置健康检查
     */
    public void setHealthCheckSettings(HealthCheckSettings HealthCheckSettings) {
        this.HealthCheckSettings = HealthCheckSettings;
    }

    /**
     * Get 部署方式，0表示快速更新，1表示滚动更新 
     * @return UpdateType 部署方式，0表示快速更新，1表示滚动更新
     */
    public Long getUpdateType() {
        return this.UpdateType;
    }

    /**
     * Set 部署方式，0表示快速更新，1表示滚动更新
     * @param UpdateType 部署方式，0表示快速更新，1表示滚动更新
     */
    public void setUpdateType(Long UpdateType) {
        this.UpdateType = UpdateType;
    }

    /**
     * Get 是否启用beta批次 
     * @return DeployBetaEnable 是否启用beta批次
     */
    public Boolean getDeployBetaEnable() {
        return this.DeployBetaEnable;
    }

    /**
     * Set 是否启用beta批次
     * @param DeployBetaEnable 是否启用beta批次
     */
    public void setDeployBetaEnable(Boolean DeployBetaEnable) {
        this.DeployBetaEnable = DeployBetaEnable;
    }

    /**
     * Get 滚动发布每个批次参与的实例比率 
     * @return DeployBatch 滚动发布每个批次参与的实例比率
     */
    public Float [] getDeployBatch() {
        return this.DeployBatch;
    }

    /**
     * Set 滚动发布每个批次参与的实例比率
     * @param DeployBatch 滚动发布每个批次参与的实例比率
     */
    public void setDeployBatch(Float [] DeployBatch) {
        this.DeployBatch = DeployBatch;
    }

    /**
     * Get 滚动发布的执行方式 
     * @return DeployExeMode 滚动发布的执行方式
     */
    public String getDeployExeMode() {
        return this.DeployExeMode;
    }

    /**
     * Set 滚动发布的执行方式
     * @param DeployExeMode 滚动发布的执行方式
     */
    public void setDeployExeMode(String DeployExeMode) {
        this.DeployExeMode = DeployExeMode;
    }

    /**
     * Get 滚动发布每个批次的时间间隔 
     * @return DeployWaitTime 滚动发布每个批次的时间间隔
     */
    public Long getDeployWaitTime() {
        return this.DeployWaitTime;
    }

    /**
     * Set 滚动发布每个批次的时间间隔
     * @param DeployWaitTime 滚动发布每个批次的时间间隔
     */
    public void setDeployWaitTime(Long DeployWaitTime) {
        this.DeployWaitTime = DeployWaitTime;
    }

    /**
     * Get 启动脚本 base64编码 
     * @return StartScript 启动脚本 base64编码
     */
    public String getStartScript() {
        return this.StartScript;
    }

    /**
     * Set 启动脚本 base64编码
     * @param StartScript 启动脚本 base64编码
     */
    public void setStartScript(String StartScript) {
        this.StartScript = StartScript;
    }

    /**
     * Get 停止脚本 base64编码 
     * @return StopScript 停止脚本 base64编码
     */
    public String getStopScript() {
        return this.StopScript;
    }

    /**
     * Set 停止脚本 base64编码
     * @param StopScript 停止脚本 base64编码
     */
    public void setStopScript(String StopScript) {
        this.StopScript = StopScript;
    }

    /**
     * Get 是否进行增量部署，默认为false，全量更新 
     * @return IncrementalDeployment 是否进行增量部署，默认为false，全量更新
     */
    public Boolean getIncrementalDeployment() {
        return this.IncrementalDeployment;
    }

    /**
     * Set 是否进行增量部署，默认为false，全量更新
     * @param IncrementalDeployment 是否进行增量部署，默认为false，全量更新
     */
    public void setIncrementalDeployment(Boolean IncrementalDeployment) {
        this.IncrementalDeployment = IncrementalDeployment;
    }

    /**
     * Get JDK名称: konaJDK或openJDK 
     * @return JdkName JDK名称: konaJDK或openJDK
     */
    public String getJdkName() {
        return this.JdkName;
    }

    /**
     * Set JDK名称: konaJDK或openJDK
     * @param JdkName JDK名称: konaJDK或openJDK
     */
    public void setJdkName(String JdkName) {
        this.JdkName = JdkName;
    }

    /**
     * Get JDK版本: 8或11 (openJDK只支持8) 
     * @return JdkVersion JDK版本: 8或11 (openJDK只支持8)
     */
    public String getJdkVersion() {
        return this.JdkVersion;
    }

    /**
     * Set JDK版本: 8或11 (openJDK只支持8)
     * @param JdkVersion JDK版本: 8或11 (openJDK只支持8)
     */
    public void setJdkVersion(String JdkVersion) {
        this.JdkVersion = JdkVersion;
    }

    public DeployGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeployGroupRequest(DeployGroupRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.PkgId != null) {
            this.PkgId = new String(source.PkgId);
        }
        if (source.StartupParameters != null) {
            this.StartupParameters = new String(source.StartupParameters);
        }
        if (source.DeployDesc != null) {
            this.DeployDesc = new String(source.DeployDesc);
        }
        if (source.ForceStart != null) {
            this.ForceStart = new Boolean(source.ForceStart);
        }
        if (source.EnableHealthCheck != null) {
            this.EnableHealthCheck = new Boolean(source.EnableHealthCheck);
        }
        if (source.HealthCheckSettings != null) {
            this.HealthCheckSettings = new HealthCheckSettings(source.HealthCheckSettings);
        }
        if (source.UpdateType != null) {
            this.UpdateType = new Long(source.UpdateType);
        }
        if (source.DeployBetaEnable != null) {
            this.DeployBetaEnable = new Boolean(source.DeployBetaEnable);
        }
        if (source.DeployBatch != null) {
            this.DeployBatch = new Float[source.DeployBatch.length];
            for (int i = 0; i < source.DeployBatch.length; i++) {
                this.DeployBatch[i] = new Float(source.DeployBatch[i]);
            }
        }
        if (source.DeployExeMode != null) {
            this.DeployExeMode = new String(source.DeployExeMode);
        }
        if (source.DeployWaitTime != null) {
            this.DeployWaitTime = new Long(source.DeployWaitTime);
        }
        if (source.StartScript != null) {
            this.StartScript = new String(source.StartScript);
        }
        if (source.StopScript != null) {
            this.StopScript = new String(source.StopScript);
        }
        if (source.IncrementalDeployment != null) {
            this.IncrementalDeployment = new Boolean(source.IncrementalDeployment);
        }
        if (source.JdkName != null) {
            this.JdkName = new String(source.JdkName);
        }
        if (source.JdkVersion != null) {
            this.JdkVersion = new String(source.JdkVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);
        this.setParamSimple(map, prefix + "StartupParameters", this.StartupParameters);
        this.setParamSimple(map, prefix + "DeployDesc", this.DeployDesc);
        this.setParamSimple(map, prefix + "ForceStart", this.ForceStart);
        this.setParamSimple(map, prefix + "EnableHealthCheck", this.EnableHealthCheck);
        this.setParamObj(map, prefix + "HealthCheckSettings.", this.HealthCheckSettings);
        this.setParamSimple(map, prefix + "UpdateType", this.UpdateType);
        this.setParamSimple(map, prefix + "DeployBetaEnable", this.DeployBetaEnable);
        this.setParamArraySimple(map, prefix + "DeployBatch.", this.DeployBatch);
        this.setParamSimple(map, prefix + "DeployExeMode", this.DeployExeMode);
        this.setParamSimple(map, prefix + "DeployWaitTime", this.DeployWaitTime);
        this.setParamSimple(map, prefix + "StartScript", this.StartScript);
        this.setParamSimple(map, prefix + "StopScript", this.StopScript);
        this.setParamSimple(map, prefix + "IncrementalDeployment", this.IncrementalDeployment);
        this.setParamSimple(map, prefix + "JdkName", this.JdkName);
        this.setParamSimple(map, prefix + "JdkVersion", this.JdkVersion);

    }
}

