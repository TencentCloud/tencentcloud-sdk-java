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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterAttributeRequest extends AbstractModel {

    /**
    * <p>集群ID</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/457/31862">DescribeClusters</a></p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>集群所属项目</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>集群名称,字符长度50</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>集群描述</p>
    */
    @SerializedName("ClusterDesc")
    @Expose
    private String ClusterDesc;

    /**
    * <p>集群等级，等级类型：L20、L50、L100、L200、L500、L1000、L3000、L5000</p>
    */
    @SerializedName("ClusterLevel")
    @Expose
    private String ClusterLevel;

    /**
    * <p>自动变配集群等级</p>
    */
    @SerializedName("AutoUpgradeClusterLevel")
    @Expose
    private AutoUpgradeClusterLevel AutoUpgradeClusterLevel;

    /**
    * <p>是否开启QGPU共享</p>
    */
    @SerializedName("QGPUShareEnable")
    @Expose
    private Boolean QGPUShareEnable;

    /**
    * <p>集群属性</p>
    */
    @SerializedName("ClusterProperty")
    @Expose
    private ClusterProperty ClusterProperty;

    /**
    * <p>集群是否启用高可用模式。用于指导跨可用区资源打散等高可用策略的执行</p>
    */
    @SerializedName("IsHighAvailability")
    @Expose
    private Boolean IsHighAvailability;

    /**
    * <p>集群安全模式配置</p>
    */
    @SerializedName("SecurityModeConfig")
    @Expose
    private SecurityModeConfig SecurityModeConfig;

    /**
     * Get <p>集群ID</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/457/31862">DescribeClusters</a></p> 
     * @return ClusterId <p>集群ID</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/457/31862">DescribeClusters</a></p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/457/31862">DescribeClusters</a></p>
     * @param ClusterId <p>集群ID</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/457/31862">DescribeClusters</a></p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>集群所属项目</p> 
     * @return ProjectId <p>集群所属项目</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>集群所属项目</p>
     * @param ProjectId <p>集群所属项目</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>集群名称,字符长度50</p> 
     * @return ClusterName <p>集群名称,字符长度50</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群名称,字符长度50</p>
     * @param ClusterName <p>集群名称,字符长度50</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>集群描述</p> 
     * @return ClusterDesc <p>集群描述</p>
     */
    public String getClusterDesc() {
        return this.ClusterDesc;
    }

    /**
     * Set <p>集群描述</p>
     * @param ClusterDesc <p>集群描述</p>
     */
    public void setClusterDesc(String ClusterDesc) {
        this.ClusterDesc = ClusterDesc;
    }

    /**
     * Get <p>集群等级，等级类型：L20、L50、L100、L200、L500、L1000、L3000、L5000</p> 
     * @return ClusterLevel <p>集群等级，等级类型：L20、L50、L100、L200、L500、L1000、L3000、L5000</p>
     */
    public String getClusterLevel() {
        return this.ClusterLevel;
    }

    /**
     * Set <p>集群等级，等级类型：L20、L50、L100、L200、L500、L1000、L3000、L5000</p>
     * @param ClusterLevel <p>集群等级，等级类型：L20、L50、L100、L200、L500、L1000、L3000、L5000</p>
     */
    public void setClusterLevel(String ClusterLevel) {
        this.ClusterLevel = ClusterLevel;
    }

    /**
     * Get <p>自动变配集群等级</p> 
     * @return AutoUpgradeClusterLevel <p>自动变配集群等级</p>
     */
    public AutoUpgradeClusterLevel getAutoUpgradeClusterLevel() {
        return this.AutoUpgradeClusterLevel;
    }

    /**
     * Set <p>自动变配集群等级</p>
     * @param AutoUpgradeClusterLevel <p>自动变配集群等级</p>
     */
    public void setAutoUpgradeClusterLevel(AutoUpgradeClusterLevel AutoUpgradeClusterLevel) {
        this.AutoUpgradeClusterLevel = AutoUpgradeClusterLevel;
    }

    /**
     * Get <p>是否开启QGPU共享</p> 
     * @return QGPUShareEnable <p>是否开启QGPU共享</p>
     */
    public Boolean getQGPUShareEnable() {
        return this.QGPUShareEnable;
    }

    /**
     * Set <p>是否开启QGPU共享</p>
     * @param QGPUShareEnable <p>是否开启QGPU共享</p>
     */
    public void setQGPUShareEnable(Boolean QGPUShareEnable) {
        this.QGPUShareEnable = QGPUShareEnable;
    }

    /**
     * Get <p>集群属性</p> 
     * @return ClusterProperty <p>集群属性</p>
     */
    public ClusterProperty getClusterProperty() {
        return this.ClusterProperty;
    }

    /**
     * Set <p>集群属性</p>
     * @param ClusterProperty <p>集群属性</p>
     */
    public void setClusterProperty(ClusterProperty ClusterProperty) {
        this.ClusterProperty = ClusterProperty;
    }

    /**
     * Get <p>集群是否启用高可用模式。用于指导跨可用区资源打散等高可用策略的执行</p> 
     * @return IsHighAvailability <p>集群是否启用高可用模式。用于指导跨可用区资源打散等高可用策略的执行</p>
     */
    public Boolean getIsHighAvailability() {
        return this.IsHighAvailability;
    }

    /**
     * Set <p>集群是否启用高可用模式。用于指导跨可用区资源打散等高可用策略的执行</p>
     * @param IsHighAvailability <p>集群是否启用高可用模式。用于指导跨可用区资源打散等高可用策略的执行</p>
     */
    public void setIsHighAvailability(Boolean IsHighAvailability) {
        this.IsHighAvailability = IsHighAvailability;
    }

    /**
     * Get <p>集群安全模式配置</p> 
     * @return SecurityModeConfig <p>集群安全模式配置</p>
     */
    public SecurityModeConfig getSecurityModeConfig() {
        return this.SecurityModeConfig;
    }

    /**
     * Set <p>集群安全模式配置</p>
     * @param SecurityModeConfig <p>集群安全模式配置</p>
     */
    public void setSecurityModeConfig(SecurityModeConfig SecurityModeConfig) {
        this.SecurityModeConfig = SecurityModeConfig;
    }

    public ModifyClusterAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterAttributeRequest(ModifyClusterAttributeRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterDesc != null) {
            this.ClusterDesc = new String(source.ClusterDesc);
        }
        if (source.ClusterLevel != null) {
            this.ClusterLevel = new String(source.ClusterLevel);
        }
        if (source.AutoUpgradeClusterLevel != null) {
            this.AutoUpgradeClusterLevel = new AutoUpgradeClusterLevel(source.AutoUpgradeClusterLevel);
        }
        if (source.QGPUShareEnable != null) {
            this.QGPUShareEnable = new Boolean(source.QGPUShareEnable);
        }
        if (source.ClusterProperty != null) {
            this.ClusterProperty = new ClusterProperty(source.ClusterProperty);
        }
        if (source.IsHighAvailability != null) {
            this.IsHighAvailability = new Boolean(source.IsHighAvailability);
        }
        if (source.SecurityModeConfig != null) {
            this.SecurityModeConfig = new SecurityModeConfig(source.SecurityModeConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterDesc", this.ClusterDesc);
        this.setParamSimple(map, prefix + "ClusterLevel", this.ClusterLevel);
        this.setParamObj(map, prefix + "AutoUpgradeClusterLevel.", this.AutoUpgradeClusterLevel);
        this.setParamSimple(map, prefix + "QGPUShareEnable", this.QGPUShareEnable);
        this.setParamObj(map, prefix + "ClusterProperty.", this.ClusterProperty);
        this.setParamSimple(map, prefix + "IsHighAvailability", this.IsHighAvailability);
        this.setParamObj(map, prefix + "SecurityModeConfig.", this.SecurityModeConfig);

    }
}

