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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RollingUpdateApplicationByVersionRequest extends AbstractModel{

    /**
    * 应用ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 环境ID
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 更新版本，IMAGE 部署为 tag 值；JAR/WAR 部署 为 Version
    */
    @SerializedName("DeployVersion")
    @Expose
    private String DeployVersion;

    /**
    * JAR/WAR 包名，仅 JAR/WAR 部署时必填
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * 请求来源平台，含 IntelliJ，Coding
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * 部署策略，AUTO 为全自动；BETA 为小批量验证后自动；MANUAL 为全手动；
    */
    @SerializedName("DeployStrategyType")
    @Expose
    private String DeployStrategyType;

    /**
    * 发布批次数
    */
    @SerializedName("TotalBatchCount")
    @Expose
    private Long TotalBatchCount;

    /**
    * 批次间隔时间
    */
    @SerializedName("BatchInterval")
    @Expose
    private Long BatchInterval;

    /**
    * 小批量验证批次的实例数
    */
    @SerializedName("BetaBatchNum")
    @Expose
    private Long BetaBatchNum;

    /**
    * 发布过程中保障的最小可用实例数
    */
    @SerializedName("MinAvailable")
    @Expose
    private Long MinAvailable;

    /**
     * Get 应用ID 
     * @return ApplicationId 应用ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID
     * @param ApplicationId 应用ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 环境ID 
     * @return EnvironmentId 环境ID
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 环境ID
     * @param EnvironmentId 环境ID
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 更新版本，IMAGE 部署为 tag 值；JAR/WAR 部署 为 Version 
     * @return DeployVersion 更新版本，IMAGE 部署为 tag 值；JAR/WAR 部署 为 Version
     */
    public String getDeployVersion() {
        return this.DeployVersion;
    }

    /**
     * Set 更新版本，IMAGE 部署为 tag 值；JAR/WAR 部署 为 Version
     * @param DeployVersion 更新版本，IMAGE 部署为 tag 值；JAR/WAR 部署 为 Version
     */
    public void setDeployVersion(String DeployVersion) {
        this.DeployVersion = DeployVersion;
    }

    /**
     * Get JAR/WAR 包名，仅 JAR/WAR 部署时必填 
     * @return PackageName JAR/WAR 包名，仅 JAR/WAR 部署时必填
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set JAR/WAR 包名，仅 JAR/WAR 部署时必填
     * @param PackageName JAR/WAR 包名，仅 JAR/WAR 部署时必填
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get 请求来源平台，含 IntelliJ，Coding 
     * @return From 请求来源平台，含 IntelliJ，Coding
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set 请求来源平台，含 IntelliJ，Coding
     * @param From 请求来源平台，含 IntelliJ，Coding
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get 部署策略，AUTO 为全自动；BETA 为小批量验证后自动；MANUAL 为全手动； 
     * @return DeployStrategyType 部署策略，AUTO 为全自动；BETA 为小批量验证后自动；MANUAL 为全手动；
     */
    public String getDeployStrategyType() {
        return this.DeployStrategyType;
    }

    /**
     * Set 部署策略，AUTO 为全自动；BETA 为小批量验证后自动；MANUAL 为全手动；
     * @param DeployStrategyType 部署策略，AUTO 为全自动；BETA 为小批量验证后自动；MANUAL 为全手动；
     */
    public void setDeployStrategyType(String DeployStrategyType) {
        this.DeployStrategyType = DeployStrategyType;
    }

    /**
     * Get 发布批次数 
     * @return TotalBatchCount 发布批次数
     */
    public Long getTotalBatchCount() {
        return this.TotalBatchCount;
    }

    /**
     * Set 发布批次数
     * @param TotalBatchCount 发布批次数
     */
    public void setTotalBatchCount(Long TotalBatchCount) {
        this.TotalBatchCount = TotalBatchCount;
    }

    /**
     * Get 批次间隔时间 
     * @return BatchInterval 批次间隔时间
     */
    public Long getBatchInterval() {
        return this.BatchInterval;
    }

    /**
     * Set 批次间隔时间
     * @param BatchInterval 批次间隔时间
     */
    public void setBatchInterval(Long BatchInterval) {
        this.BatchInterval = BatchInterval;
    }

    /**
     * Get 小批量验证批次的实例数 
     * @return BetaBatchNum 小批量验证批次的实例数
     */
    public Long getBetaBatchNum() {
        return this.BetaBatchNum;
    }

    /**
     * Set 小批量验证批次的实例数
     * @param BetaBatchNum 小批量验证批次的实例数
     */
    public void setBetaBatchNum(Long BetaBatchNum) {
        this.BetaBatchNum = BetaBatchNum;
    }

    /**
     * Get 发布过程中保障的最小可用实例数 
     * @return MinAvailable 发布过程中保障的最小可用实例数
     */
    public Long getMinAvailable() {
        return this.MinAvailable;
    }

    /**
     * Set 发布过程中保障的最小可用实例数
     * @param MinAvailable 发布过程中保障的最小可用实例数
     */
    public void setMinAvailable(Long MinAvailable) {
        this.MinAvailable = MinAvailable;
    }

    public RollingUpdateApplicationByVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollingUpdateApplicationByVersionRequest(RollingUpdateApplicationByVersionRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.DeployVersion != null) {
            this.DeployVersion = new String(source.DeployVersion);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.DeployStrategyType != null) {
            this.DeployStrategyType = new String(source.DeployStrategyType);
        }
        if (source.TotalBatchCount != null) {
            this.TotalBatchCount = new Long(source.TotalBatchCount);
        }
        if (source.BatchInterval != null) {
            this.BatchInterval = new Long(source.BatchInterval);
        }
        if (source.BetaBatchNum != null) {
            this.BetaBatchNum = new Long(source.BetaBatchNum);
        }
        if (source.MinAvailable != null) {
            this.MinAvailable = new Long(source.MinAvailable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "DeployVersion", this.DeployVersion);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "DeployStrategyType", this.DeployStrategyType);
        this.setParamSimple(map, prefix + "TotalBatchCount", this.TotalBatchCount);
        this.setParamSimple(map, prefix + "BatchInterval", this.BatchInterval);
        this.setParamSimple(map, prefix + "BetaBatchNum", this.BetaBatchNum);
        this.setParamSimple(map, prefix + "MinAvailable", this.MinAvailable);

    }
}

