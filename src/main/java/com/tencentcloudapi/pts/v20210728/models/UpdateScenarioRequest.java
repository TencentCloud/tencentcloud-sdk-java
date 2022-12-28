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

public class UpdateScenarioRequest extends AbstractModel{

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
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 压测引擎类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 施压配置
    */
    @SerializedName("Load")
    @Expose
    private Load Load;

    /**
    * deprecated
    */
    @SerializedName("EncodedScripts")
    @Expose
    private String EncodedScripts;

    /**
    * deprecated
    */
    @SerializedName("Configs")
    @Expose
    private String [] Configs;

    /**
    * 测试数据集
    */
    @SerializedName("Datasets")
    @Expose
    private TestData [] Datasets;

    /**
    * deprecated
    */
    @SerializedName("Extensions")
    @Expose
    private String [] Extensions;

    /**
    * SLA规则ID
    */
    @SerializedName("SLAId")
    @Expose
    private String SLAId;

    /**
    * cron job ID
    */
    @SerializedName("CronId")
    @Expose
    private String CronId;

    /**
    * 场景状态（注：现已无需传递该参数）
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 测试脚本路径
    */
    @SerializedName("TestScripts")
    @Expose
    private ScriptInfo [] TestScripts;

    /**
    * 协议文件路径
    */
    @SerializedName("Protocols")
    @Expose
    private ProtocolInfo [] Protocols;

    /**
    * 请求文件路径
    */
    @SerializedName("RequestFiles")
    @Expose
    private FileInfo [] RequestFiles;

    /**
    * SLA 策略
    */
    @SerializedName("SLAPolicy")
    @Expose
    private SLAPolicy SLAPolicy;

    /**
    * 拓展包文件路径
    */
    @SerializedName("Plugins")
    @Expose
    private FileInfo [] Plugins;

    /**
    * 域名解析配置
    */
    @SerializedName("DomainNameConfig")
    @Expose
    private DomainNameConfig DomainNameConfig;

    /**
    * WebHook请求配置
    */
    @SerializedName("NotificationHooks")
    @Expose
    private Notification [] NotificationHooks;

    /**
    * 创建人名
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

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
     * @return Description 场景描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 场景描述
     * @param Description 场景描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 压测引擎类型 
     * @return Type 压测引擎类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 压测引擎类型
     * @param Type 压测引擎类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 施压配置 
     * @return Load 施压配置
     */
    public Load getLoad() {
        return this.Load;
    }

    /**
     * Set 施压配置
     * @param Load 施压配置
     */
    public void setLoad(Load Load) {
        this.Load = Load;
    }

    /**
     * Get deprecated 
     * @return EncodedScripts deprecated
     */
    public String getEncodedScripts() {
        return this.EncodedScripts;
    }

    /**
     * Set deprecated
     * @param EncodedScripts deprecated
     */
    public void setEncodedScripts(String EncodedScripts) {
        this.EncodedScripts = EncodedScripts;
    }

    /**
     * Get deprecated 
     * @return Configs deprecated
     */
    public String [] getConfigs() {
        return this.Configs;
    }

    /**
     * Set deprecated
     * @param Configs deprecated
     */
    public void setConfigs(String [] Configs) {
        this.Configs = Configs;
    }

    /**
     * Get 测试数据集 
     * @return Datasets 测试数据集
     */
    public TestData [] getDatasets() {
        return this.Datasets;
    }

    /**
     * Set 测试数据集
     * @param Datasets 测试数据集
     */
    public void setDatasets(TestData [] Datasets) {
        this.Datasets = Datasets;
    }

    /**
     * Get deprecated 
     * @return Extensions deprecated
     */
    public String [] getExtensions() {
        return this.Extensions;
    }

    /**
     * Set deprecated
     * @param Extensions deprecated
     */
    public void setExtensions(String [] Extensions) {
        this.Extensions = Extensions;
    }

    /**
     * Get SLA规则ID 
     * @return SLAId SLA规则ID
     */
    public String getSLAId() {
        return this.SLAId;
    }

    /**
     * Set SLA规则ID
     * @param SLAId SLA规则ID
     */
    public void setSLAId(String SLAId) {
        this.SLAId = SLAId;
    }

    /**
     * Get cron job ID 
     * @return CronId cron job ID
     */
    public String getCronId() {
        return this.CronId;
    }

    /**
     * Set cron job ID
     * @param CronId cron job ID
     */
    public void setCronId(String CronId) {
        this.CronId = CronId;
    }

    /**
     * Get 场景状态（注：现已无需传递该参数） 
     * @return Status 场景状态（注：现已无需传递该参数）
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 场景状态（注：现已无需传递该参数）
     * @param Status 场景状态（注：现已无需传递该参数）
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 测试脚本路径 
     * @return TestScripts 测试脚本路径
     */
    public ScriptInfo [] getTestScripts() {
        return this.TestScripts;
    }

    /**
     * Set 测试脚本路径
     * @param TestScripts 测试脚本路径
     */
    public void setTestScripts(ScriptInfo [] TestScripts) {
        this.TestScripts = TestScripts;
    }

    /**
     * Get 协议文件路径 
     * @return Protocols 协议文件路径
     */
    public ProtocolInfo [] getProtocols() {
        return this.Protocols;
    }

    /**
     * Set 协议文件路径
     * @param Protocols 协议文件路径
     */
    public void setProtocols(ProtocolInfo [] Protocols) {
        this.Protocols = Protocols;
    }

    /**
     * Get 请求文件路径 
     * @return RequestFiles 请求文件路径
     */
    public FileInfo [] getRequestFiles() {
        return this.RequestFiles;
    }

    /**
     * Set 请求文件路径
     * @param RequestFiles 请求文件路径
     */
    public void setRequestFiles(FileInfo [] RequestFiles) {
        this.RequestFiles = RequestFiles;
    }

    /**
     * Get SLA 策略 
     * @return SLAPolicy SLA 策略
     */
    public SLAPolicy getSLAPolicy() {
        return this.SLAPolicy;
    }

    /**
     * Set SLA 策略
     * @param SLAPolicy SLA 策略
     */
    public void setSLAPolicy(SLAPolicy SLAPolicy) {
        this.SLAPolicy = SLAPolicy;
    }

    /**
     * Get 拓展包文件路径 
     * @return Plugins 拓展包文件路径
     */
    public FileInfo [] getPlugins() {
        return this.Plugins;
    }

    /**
     * Set 拓展包文件路径
     * @param Plugins 拓展包文件路径
     */
    public void setPlugins(FileInfo [] Plugins) {
        this.Plugins = Plugins;
    }

    /**
     * Get 域名解析配置 
     * @return DomainNameConfig 域名解析配置
     */
    public DomainNameConfig getDomainNameConfig() {
        return this.DomainNameConfig;
    }

    /**
     * Set 域名解析配置
     * @param DomainNameConfig 域名解析配置
     */
    public void setDomainNameConfig(DomainNameConfig DomainNameConfig) {
        this.DomainNameConfig = DomainNameConfig;
    }

    /**
     * Get WebHook请求配置 
     * @return NotificationHooks WebHook请求配置
     */
    public Notification [] getNotificationHooks() {
        return this.NotificationHooks;
    }

    /**
     * Set WebHook请求配置
     * @param NotificationHooks WebHook请求配置
     */
    public void setNotificationHooks(Notification [] NotificationHooks) {
        this.NotificationHooks = NotificationHooks;
    }

    /**
     * Get 创建人名 
     * @return Owner 创建人名
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 创建人名
     * @param Owner 创建人名
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public UpdateScenarioRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateScenarioRequest(UpdateScenarioRequest source) {
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
        if (source.Datasets != null) {
            this.Datasets = new TestData[source.Datasets.length];
            for (int i = 0; i < source.Datasets.length; i++) {
                this.Datasets[i] = new TestData(source.Datasets[i]);
            }
        }
        if (source.Extensions != null) {
            this.Extensions = new String[source.Extensions.length];
            for (int i = 0; i < source.Extensions.length; i++) {
                this.Extensions[i] = new String(source.Extensions[i]);
            }
        }
        if (source.SLAId != null) {
            this.SLAId = new String(source.SLAId);
        }
        if (source.CronId != null) {
            this.CronId = new String(source.CronId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
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
            this.NotificationHooks = new Notification[source.NotificationHooks.length];
            for (int i = 0; i < source.NotificationHooks.length; i++) {
                this.NotificationHooks[i] = new Notification(source.NotificationHooks[i]);
            }
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
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
        this.setParamObj(map, prefix + "Load.", this.Load);
        this.setParamSimple(map, prefix + "EncodedScripts", this.EncodedScripts);
        this.setParamArraySimple(map, prefix + "Configs.", this.Configs);
        this.setParamArrayObj(map, prefix + "Datasets.", this.Datasets);
        this.setParamArraySimple(map, prefix + "Extensions.", this.Extensions);
        this.setParamSimple(map, prefix + "SLAId", this.SLAId);
        this.setParamSimple(map, prefix + "CronId", this.CronId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "TestScripts.", this.TestScripts);
        this.setParamArrayObj(map, prefix + "Protocols.", this.Protocols);
        this.setParamArrayObj(map, prefix + "RequestFiles.", this.RequestFiles);
        this.setParamObj(map, prefix + "SLAPolicy.", this.SLAPolicy);
        this.setParamArrayObj(map, prefix + "Plugins.", this.Plugins);
        this.setParamObj(map, prefix + "DomainNameConfig.", this.DomainNameConfig);
        this.setParamArrayObj(map, prefix + "NotificationHooks.", this.NotificationHooks);
        this.setParamSimple(map, prefix + "Owner", this.Owner);

    }
}

