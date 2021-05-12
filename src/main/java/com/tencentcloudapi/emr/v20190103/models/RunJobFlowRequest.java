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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunJobFlowRequest extends AbstractModel{

    /**
    * 作业名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 是否新创建集群。
true，新创建集群，则使用Instance中的参数进行集群创建。
false，使用已有集群，则通过InstanceId传入。
    */
    @SerializedName("CreateCluster")
    @Expose
    private Boolean CreateCluster;

    /**
    * 作业流程执行步骤。
    */
    @SerializedName("Steps")
    @Expose
    private Step [] Steps;

    /**
    * 作业流程正常完成时，集群的处理方式，可选择:
Terminate 销毁集群。
Reserve 保留集群。
    */
    @SerializedName("InstancePolicy")
    @Expose
    private String InstancePolicy;

    /**
    * 只有CreateCluster为true时生效，目前只支持EMR版本，例如EMR-2.2.0，不支持ClickHouse和Druid版本。
    */
    @SerializedName("ProductVersion")
    @Expose
    private String ProductVersion;

    /**
    * 只在CreateCluster为true时生效。
true 表示安装kerberos，false表示不安装kerberos。
    */
    @SerializedName("SecurityClusterFlag")
    @Expose
    private Boolean SecurityClusterFlag;

    /**
    * 只在CreateCluster为true时生效。
新建集群时，要安装的软件列表。
    */
    @SerializedName("Software")
    @Expose
    private String [] Software;

    /**
    * 引导脚本。
    */
    @SerializedName("BootstrapActions")
    @Expose
    private BootstrapAction [] BootstrapActions;

    /**
    * 指定配置创建集群。
    */
    @SerializedName("Configurations")
    @Expose
    private Configuration [] Configurations;

    /**
    * 作业日志保存地址。
    */
    @SerializedName("LogUri")
    @Expose
    private String LogUri;

    /**
    * 只在CreateCluster为false时生效。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 自定义应用角色，大数据应用访问外部服务时使用的角色，默认为"EME_QCSRole"。
    */
    @SerializedName("ApplicationRole")
    @Expose
    private String ApplicationRole;

    /**
    * 重入标签，用来可重入检查，防止在一段时间内，创建相同的流程作业。
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 只在CreateCluster为true时生效，使用该配置创建集群。
    */
    @SerializedName("Instance")
    @Expose
    private ClusterSetting Instance;

    /**
     * Get 作业名称。 
     * @return Name 作业名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 作业名称。
     * @param Name 作业名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 是否新创建集群。
true，新创建集群，则使用Instance中的参数进行集群创建。
false，使用已有集群，则通过InstanceId传入。 
     * @return CreateCluster 是否新创建集群。
true，新创建集群，则使用Instance中的参数进行集群创建。
false，使用已有集群，则通过InstanceId传入。
     */
    public Boolean getCreateCluster() {
        return this.CreateCluster;
    }

    /**
     * Set 是否新创建集群。
true，新创建集群，则使用Instance中的参数进行集群创建。
false，使用已有集群，则通过InstanceId传入。
     * @param CreateCluster 是否新创建集群。
true，新创建集群，则使用Instance中的参数进行集群创建。
false，使用已有集群，则通过InstanceId传入。
     */
    public void setCreateCluster(Boolean CreateCluster) {
        this.CreateCluster = CreateCluster;
    }

    /**
     * Get 作业流程执行步骤。 
     * @return Steps 作业流程执行步骤。
     */
    public Step [] getSteps() {
        return this.Steps;
    }

    /**
     * Set 作业流程执行步骤。
     * @param Steps 作业流程执行步骤。
     */
    public void setSteps(Step [] Steps) {
        this.Steps = Steps;
    }

    /**
     * Get 作业流程正常完成时，集群的处理方式，可选择:
Terminate 销毁集群。
Reserve 保留集群。 
     * @return InstancePolicy 作业流程正常完成时，集群的处理方式，可选择:
Terminate 销毁集群。
Reserve 保留集群。
     */
    public String getInstancePolicy() {
        return this.InstancePolicy;
    }

    /**
     * Set 作业流程正常完成时，集群的处理方式，可选择:
Terminate 销毁集群。
Reserve 保留集群。
     * @param InstancePolicy 作业流程正常完成时，集群的处理方式，可选择:
Terminate 销毁集群。
Reserve 保留集群。
     */
    public void setInstancePolicy(String InstancePolicy) {
        this.InstancePolicy = InstancePolicy;
    }

    /**
     * Get 只有CreateCluster为true时生效，目前只支持EMR版本，例如EMR-2.2.0，不支持ClickHouse和Druid版本。 
     * @return ProductVersion 只有CreateCluster为true时生效，目前只支持EMR版本，例如EMR-2.2.0，不支持ClickHouse和Druid版本。
     */
    public String getProductVersion() {
        return this.ProductVersion;
    }

    /**
     * Set 只有CreateCluster为true时生效，目前只支持EMR版本，例如EMR-2.2.0，不支持ClickHouse和Druid版本。
     * @param ProductVersion 只有CreateCluster为true时生效，目前只支持EMR版本，例如EMR-2.2.0，不支持ClickHouse和Druid版本。
     */
    public void setProductVersion(String ProductVersion) {
        this.ProductVersion = ProductVersion;
    }

    /**
     * Get 只在CreateCluster为true时生效。
true 表示安装kerberos，false表示不安装kerberos。 
     * @return SecurityClusterFlag 只在CreateCluster为true时生效。
true 表示安装kerberos，false表示不安装kerberos。
     */
    public Boolean getSecurityClusterFlag() {
        return this.SecurityClusterFlag;
    }

    /**
     * Set 只在CreateCluster为true时生效。
true 表示安装kerberos，false表示不安装kerberos。
     * @param SecurityClusterFlag 只在CreateCluster为true时生效。
true 表示安装kerberos，false表示不安装kerberos。
     */
    public void setSecurityClusterFlag(Boolean SecurityClusterFlag) {
        this.SecurityClusterFlag = SecurityClusterFlag;
    }

    /**
     * Get 只在CreateCluster为true时生效。
新建集群时，要安装的软件列表。 
     * @return Software 只在CreateCluster为true时生效。
新建集群时，要安装的软件列表。
     */
    public String [] getSoftware() {
        return this.Software;
    }

    /**
     * Set 只在CreateCluster为true时生效。
新建集群时，要安装的软件列表。
     * @param Software 只在CreateCluster为true时生效。
新建集群时，要安装的软件列表。
     */
    public void setSoftware(String [] Software) {
        this.Software = Software;
    }

    /**
     * Get 引导脚本。 
     * @return BootstrapActions 引导脚本。
     */
    public BootstrapAction [] getBootstrapActions() {
        return this.BootstrapActions;
    }

    /**
     * Set 引导脚本。
     * @param BootstrapActions 引导脚本。
     */
    public void setBootstrapActions(BootstrapAction [] BootstrapActions) {
        this.BootstrapActions = BootstrapActions;
    }

    /**
     * Get 指定配置创建集群。 
     * @return Configurations 指定配置创建集群。
     */
    public Configuration [] getConfigurations() {
        return this.Configurations;
    }

    /**
     * Set 指定配置创建集群。
     * @param Configurations 指定配置创建集群。
     */
    public void setConfigurations(Configuration [] Configurations) {
        this.Configurations = Configurations;
    }

    /**
     * Get 作业日志保存地址。 
     * @return LogUri 作业日志保存地址。
     */
    public String getLogUri() {
        return this.LogUri;
    }

    /**
     * Set 作业日志保存地址。
     * @param LogUri 作业日志保存地址。
     */
    public void setLogUri(String LogUri) {
        this.LogUri = LogUri;
    }

    /**
     * Get 只在CreateCluster为false时生效。 
     * @return InstanceId 只在CreateCluster为false时生效。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 只在CreateCluster为false时生效。
     * @param InstanceId 只在CreateCluster为false时生效。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 自定义应用角色，大数据应用访问外部服务时使用的角色，默认为"EME_QCSRole"。 
     * @return ApplicationRole 自定义应用角色，大数据应用访问外部服务时使用的角色，默认为"EME_QCSRole"。
     */
    public String getApplicationRole() {
        return this.ApplicationRole;
    }

    /**
     * Set 自定义应用角色，大数据应用访问外部服务时使用的角色，默认为"EME_QCSRole"。
     * @param ApplicationRole 自定义应用角色，大数据应用访问外部服务时使用的角色，默认为"EME_QCSRole"。
     */
    public void setApplicationRole(String ApplicationRole) {
        this.ApplicationRole = ApplicationRole;
    }

    /**
     * Get 重入标签，用来可重入检查，防止在一段时间内，创建相同的流程作业。 
     * @return ClientToken 重入标签，用来可重入检查，防止在一段时间内，创建相同的流程作业。
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 重入标签，用来可重入检查，防止在一段时间内，创建相同的流程作业。
     * @param ClientToken 重入标签，用来可重入检查，防止在一段时间内，创建相同的流程作业。
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get 只在CreateCluster为true时生效，使用该配置创建集群。 
     * @return Instance 只在CreateCluster为true时生效，使用该配置创建集群。
     */
    public ClusterSetting getInstance() {
        return this.Instance;
    }

    /**
     * Set 只在CreateCluster为true时生效，使用该配置创建集群。
     * @param Instance 只在CreateCluster为true时生效，使用该配置创建集群。
     */
    public void setInstance(ClusterSetting Instance) {
        this.Instance = Instance;
    }

    public RunJobFlowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunJobFlowRequest(RunJobFlowRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CreateCluster != null) {
            this.CreateCluster = new Boolean(source.CreateCluster);
        }
        if (source.Steps != null) {
            this.Steps = new Step[source.Steps.length];
            for (int i = 0; i < source.Steps.length; i++) {
                this.Steps[i] = new Step(source.Steps[i]);
            }
        }
        if (source.InstancePolicy != null) {
            this.InstancePolicy = new String(source.InstancePolicy);
        }
        if (source.ProductVersion != null) {
            this.ProductVersion = new String(source.ProductVersion);
        }
        if (source.SecurityClusterFlag != null) {
            this.SecurityClusterFlag = new Boolean(source.SecurityClusterFlag);
        }
        if (source.Software != null) {
            this.Software = new String[source.Software.length];
            for (int i = 0; i < source.Software.length; i++) {
                this.Software[i] = new String(source.Software[i]);
            }
        }
        if (source.BootstrapActions != null) {
            this.BootstrapActions = new BootstrapAction[source.BootstrapActions.length];
            for (int i = 0; i < source.BootstrapActions.length; i++) {
                this.BootstrapActions[i] = new BootstrapAction(source.BootstrapActions[i]);
            }
        }
        if (source.Configurations != null) {
            this.Configurations = new Configuration[source.Configurations.length];
            for (int i = 0; i < source.Configurations.length; i++) {
                this.Configurations[i] = new Configuration(source.Configurations[i]);
            }
        }
        if (source.LogUri != null) {
            this.LogUri = new String(source.LogUri);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ApplicationRole != null) {
            this.ApplicationRole = new String(source.ApplicationRole);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.Instance != null) {
            this.Instance = new ClusterSetting(source.Instance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CreateCluster", this.CreateCluster);
        this.setParamArrayObj(map, prefix + "Steps.", this.Steps);
        this.setParamSimple(map, prefix + "InstancePolicy", this.InstancePolicy);
        this.setParamSimple(map, prefix + "ProductVersion", this.ProductVersion);
        this.setParamSimple(map, prefix + "SecurityClusterFlag", this.SecurityClusterFlag);
        this.setParamArraySimple(map, prefix + "Software.", this.Software);
        this.setParamArrayObj(map, prefix + "BootstrapActions.", this.BootstrapActions);
        this.setParamArrayObj(map, prefix + "Configurations.", this.Configurations);
        this.setParamSimple(map, prefix + "LogUri", this.LogUri);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ApplicationRole", this.ApplicationRole);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamObj(map, prefix + "Instance.", this.Instance);

    }
}

