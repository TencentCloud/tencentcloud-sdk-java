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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Scenario extends AbstractModel{

    /**
    * 场景ID
    */
    @SerializedName("ScenarioId")
    @Expose
    private String ScenarioId;

    /**
    * 场景名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 场景描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 场景类型，如pts-http, pts-js, pts-trpc, pts-jmeter
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 场景状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 施压配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Load")
    @Expose
    private Load Load;

    /**
    * deprecated
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EncodedScripts")
    @Expose
    private String EncodedScripts;

    /**
    * deprecated
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Configs")
    @Expose
    private String [] Configs;

    /**
    * deprecated
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Extensions")
    @Expose
    private String [] Extensions;

    /**
    * 测试数据集
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Datasets")
    @Expose
    private TestData [] Datasets;

    /**
    * SLA规则的ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SLAId")
    @Expose
    private String SLAId;

    /**
    * Cron Job规则的ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CronId")
    @Expose
    private String CronId;

    /**
    * 场景创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 场景修改时间
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 项目ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * App ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 用户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 子用户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * 测试脚本信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TestScripts")
    @Expose
    private ScriptInfo [] TestScripts;

    /**
    * 协议文件信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protocols")
    @Expose
    private ProtocolInfo [] Protocols;

    /**
    * 请求文件信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestFiles")
    @Expose
    private FileInfo [] RequestFiles;

    /**
    * SLA 策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SLAPolicy")
    @Expose
    private SLAPolicy SLAPolicy;

    /**
    * 扩展包信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Plugins")
    @Expose
    private FileInfo [] Plugins;

    /**
    * 域名解析配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DomainNameConfig")
    @Expose
    private DomainNameConfig DomainNameConfig;

    /**
    * 通知事件回调
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotificationHooks")
    @Expose
    private NotificationHook [] NotificationHooks;

    /**
    * 创建人员
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 场景所在的项目的名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
     * Get 场景ID 
     * @return ScenarioId 场景ID
     */
    public String getScenarioId() {
        return this.ScenarioId;
    }

    /**
     * Set 场景ID
     * @param ScenarioId 场景ID
     */
    public void setScenarioId(String ScenarioId) {
        this.ScenarioId = ScenarioId;
    }

    /**
     * Get 场景名 
     * @return Name 场景名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 场景名
     * @param Name 场景名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 场景描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 场景描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 场景描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 场景描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 场景类型，如pts-http, pts-js, pts-trpc, pts-jmeter
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 场景类型，如pts-http, pts-js, pts-trpc, pts-jmeter
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 场景类型，如pts-http, pts-js, pts-trpc, pts-jmeter
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 场景类型，如pts-http, pts-js, pts-trpc, pts-jmeter
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 场景状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 场景状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 场景状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 场景状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 施压配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Load 施压配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Load getLoad() {
        return this.Load;
    }

    /**
     * Set 施压配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Load 施压配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoad(Load Load) {
        this.Load = Load;
    }

    /**
     * Get deprecated
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EncodedScripts deprecated
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEncodedScripts() {
        return this.EncodedScripts;
    }

    /**
     * Set deprecated
注意：此字段可能返回 null，表示取不到有效值。
     * @param EncodedScripts deprecated
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEncodedScripts(String EncodedScripts) {
        this.EncodedScripts = EncodedScripts;
    }

    /**
     * Get deprecated
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Configs deprecated
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getConfigs() {
        return this.Configs;
    }

    /**
     * Set deprecated
注意：此字段可能返回 null，表示取不到有效值。
     * @param Configs deprecated
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigs(String [] Configs) {
        this.Configs = Configs;
    }

    /**
     * Get deprecated
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Extensions deprecated
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getExtensions() {
        return this.Extensions;
    }

    /**
     * Set deprecated
注意：此字段可能返回 null，表示取不到有效值。
     * @param Extensions deprecated
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtensions(String [] Extensions) {
        this.Extensions = Extensions;
    }

    /**
     * Get 测试数据集
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Datasets 测试数据集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TestData [] getDatasets() {
        return this.Datasets;
    }

    /**
     * Set 测试数据集
注意：此字段可能返回 null，表示取不到有效值。
     * @param Datasets 测试数据集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasets(TestData [] Datasets) {
        this.Datasets = Datasets;
    }

    /**
     * Get SLA规则的ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SLAId SLA规则的ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSLAId() {
        return this.SLAId;
    }

    /**
     * Set SLA规则的ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SLAId SLA规则的ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSLAId(String SLAId) {
        this.SLAId = SLAId;
    }

    /**
     * Get Cron Job规则的ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CronId Cron Job规则的ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCronId() {
        return this.CronId;
    }

    /**
     * Set Cron Job规则的ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CronId Cron Job规则的ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCronId(String CronId) {
        this.CronId = CronId;
    }

    /**
     * Get 场景创建时间 
     * @return CreatedAt 场景创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 场景创建时间
     * @param CreatedAt 场景创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 场景修改时间 
     * @return UpdatedAt 场景修改时间
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 场景修改时间
     * @param UpdatedAt 场景修改时间
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 项目ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get App ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId App ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set App ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId App ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 用户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 子用户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubAccountUin 子用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set 子用户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubAccountUin 子用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get 测试脚本信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TestScripts 测试脚本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScriptInfo [] getTestScripts() {
        return this.TestScripts;
    }

    /**
     * Set 测试脚本信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TestScripts 测试脚本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTestScripts(ScriptInfo [] TestScripts) {
        this.TestScripts = TestScripts;
    }

    /**
     * Get 协议文件信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocols 协议文件信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProtocolInfo [] getProtocols() {
        return this.Protocols;
    }

    /**
     * Set 协议文件信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocols 协议文件信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocols(ProtocolInfo [] Protocols) {
        this.Protocols = Protocols;
    }

    /**
     * Get 请求文件信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestFiles 请求文件信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FileInfo [] getRequestFiles() {
        return this.RequestFiles;
    }

    /**
     * Set 请求文件信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestFiles 请求文件信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestFiles(FileInfo [] RequestFiles) {
        this.RequestFiles = RequestFiles;
    }

    /**
     * Get SLA 策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SLAPolicy SLA 策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SLAPolicy getSLAPolicy() {
        return this.SLAPolicy;
    }

    /**
     * Set SLA 策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param SLAPolicy SLA 策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSLAPolicy(SLAPolicy SLAPolicy) {
        this.SLAPolicy = SLAPolicy;
    }

    /**
     * Get 扩展包信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Plugins 扩展包信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FileInfo [] getPlugins() {
        return this.Plugins;
    }

    /**
     * Set 扩展包信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Plugins 扩展包信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlugins(FileInfo [] Plugins) {
        this.Plugins = Plugins;
    }

    /**
     * Get 域名解析配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DomainNameConfig 域名解析配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DomainNameConfig getDomainNameConfig() {
        return this.DomainNameConfig;
    }

    /**
     * Set 域名解析配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param DomainNameConfig 域名解析配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomainNameConfig(DomainNameConfig DomainNameConfig) {
        this.DomainNameConfig = DomainNameConfig;
    }

    /**
     * Get 通知事件回调
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotificationHooks 通知事件回调
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NotificationHook [] getNotificationHooks() {
        return this.NotificationHooks;
    }

    /**
     * Set 通知事件回调
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotificationHooks 通知事件回调
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotificationHooks(NotificationHook [] NotificationHooks) {
        this.NotificationHooks = NotificationHooks;
    }

    /**
     * Get 创建人员
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Owner 创建人员
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 创建人员
注意：此字段可能返回 null，表示取不到有效值。
     * @param Owner 创建人员
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 场景所在的项目的名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName 场景所在的项目的名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 场景所在的项目的名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName 场景所在的项目的名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    public Scenario() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Scenario(Scenario source) {
        if (source.ScenarioId != null) {
            this.ScenarioId = new String(source.ScenarioId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Load != null) {
            this.Load = new Load(source.Load);
        }
        if (source.EncodedScripts != null) {
            this.EncodedScripts = new String(source.EncodedScripts);
        }
        if (source.Configs != null) {
            this.Configs = new String[source.Configs.length];
            for (int i = 0; i < source.Configs.length; i++) {
                this.Configs[i] = new String(source.Configs[i]);
            }
        }
        if (source.Extensions != null) {
            this.Extensions = new String[source.Extensions.length];
            for (int i = 0; i < source.Extensions.length; i++) {
                this.Extensions[i] = new String(source.Extensions[i]);
            }
        }
        if (source.Datasets != null) {
            this.Datasets = new TestData[source.Datasets.length];
            for (int i = 0; i < source.Datasets.length; i++) {
                this.Datasets[i] = new TestData(source.Datasets[i]);
            }
        }
        if (source.SLAId != null) {
            this.SLAId = new String(source.SLAId);
        }
        if (source.CronId != null) {
            this.CronId = new String(source.CronId);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.TestScripts != null) {
            this.TestScripts = new ScriptInfo[source.TestScripts.length];
            for (int i = 0; i < source.TestScripts.length; i++) {
                this.TestScripts[i] = new ScriptInfo(source.TestScripts[i]);
            }
        }
        if (source.Protocols != null) {
            this.Protocols = new ProtocolInfo[source.Protocols.length];
            for (int i = 0; i < source.Protocols.length; i++) {
                this.Protocols[i] = new ProtocolInfo(source.Protocols[i]);
            }
        }
        if (source.RequestFiles != null) {
            this.RequestFiles = new FileInfo[source.RequestFiles.length];
            for (int i = 0; i < source.RequestFiles.length; i++) {
                this.RequestFiles[i] = new FileInfo(source.RequestFiles[i]);
            }
        }
        if (source.SLAPolicy != null) {
            this.SLAPolicy = new SLAPolicy(source.SLAPolicy);
        }
        if (source.Plugins != null) {
            this.Plugins = new FileInfo[source.Plugins.length];
            for (int i = 0; i < source.Plugins.length; i++) {
                this.Plugins[i] = new FileInfo(source.Plugins[i]);
            }
        }
        if (source.DomainNameConfig != null) {
            this.DomainNameConfig = new DomainNameConfig(source.DomainNameConfig);
        }
        if (source.NotificationHooks != null) {
            this.NotificationHooks = new NotificationHook[source.NotificationHooks.length];
            for (int i = 0; i < source.NotificationHooks.length; i++) {
                this.NotificationHooks[i] = new NotificationHook(source.NotificationHooks[i]);
            }
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScenarioId", this.ScenarioId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Load.", this.Load);
        this.setParamSimple(map, prefix + "EncodedScripts", this.EncodedScripts);
        this.setParamArraySimple(map, prefix + "Configs.", this.Configs);
        this.setParamArraySimple(map, prefix + "Extensions.", this.Extensions);
        this.setParamArrayObj(map, prefix + "Datasets.", this.Datasets);
        this.setParamSimple(map, prefix + "SLAId", this.SLAId);
        this.setParamSimple(map, prefix + "CronId", this.CronId);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamArrayObj(map, prefix + "TestScripts.", this.TestScripts);
        this.setParamArrayObj(map, prefix + "Protocols.", this.Protocols);
        this.setParamArrayObj(map, prefix + "RequestFiles.", this.RequestFiles);
        this.setParamObj(map, prefix + "SLAPolicy.", this.SLAPolicy);
        this.setParamArrayObj(map, prefix + "Plugins.", this.Plugins);
        this.setParamObj(map, prefix + "DomainNameConfig.", this.DomainNameConfig);
        this.setParamArrayObj(map, prefix + "NotificationHooks.", this.NotificationHooks);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);

    }
}

