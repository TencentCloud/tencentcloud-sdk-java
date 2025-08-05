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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StandardEngineResourceGroupInfo extends AbstractModel {

    /**
    * 标准引擎资源组ID
    */
    @SerializedName("EngineResourceGroupId")
    @Expose
    private String EngineResourceGroupId;

    /**
    * 标准引擎资源组名称，支持1-50个英文、汉字、数字、连接线-或下划线_
    */
    @SerializedName("EngineResourceGroupName")
    @Expose
    private String EngineResourceGroupName;

    /**
    * 创建者
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 资源组 状态，-1--删除、0--启动中、2--运行、3--暂停、4--暂停中、7--切换引擎中、8--配置修改中。9--资源组重启中，10--因为变配导致资源组启动、11--因为隔离导致资源组挂起、12- 资源配置下发中、 13-接入点隔离导致资源组挂起中
    */
    @SerializedName("ResourceGroupState")
    @Expose
    private Long ResourceGroupState;

    /**
    * 自动启动，（任务提交自动拉起资源组）0-自动启动，1-不自动启动
    */
    @SerializedName("AutoLaunch")
    @Expose
    private Long AutoLaunch;

    /**
    * 自动挂起资源组。0-自动挂起，1-不自动挂起
    */
    @SerializedName("AutoPause")
    @Expose
    private Long AutoPause;

    /**
    * 自动挂起时间，单位分钟，取值范围在1-999（在无任务AutoPauseTime后，资源组自动挂起）
    */
    @SerializedName("AutoPauseTime")
    @Expose
    private Long AutoPauseTime;

    /**
    * driver的cu规格：
当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu），内存型cu为cpu：men=1:8，m.small（1cu内存型）、m.medium（2cu内存型）、m.large（4cu内存型）、m.xlarge（8cu内存型）
    */
    @SerializedName("DriverCuSpec")
    @Expose
    private String DriverCuSpec;

    /**
    * executor的cu规格：
当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu），内存型cu为cpu：men=1:8，m.small（1cu内存型）、m.medium（2cu内存型）、m.large（4cu内存型）、m.xlarge（8cu内存型）
    */
    @SerializedName("ExecutorCuSpec")
    @Expose
    private String ExecutorCuSpec;

    /**
    * 任务并发数
    */
    @SerializedName("MaxConcurrency")
    @Expose
    private Long MaxConcurrency;

    /**
    * executor最小数量，
    */
    @SerializedName("MinExecutorNums")
    @Expose
    private Long MinExecutorNums;

    /**
    * executor最大数量，
    */
    @SerializedName("MaxExecutorNums")
    @Expose
    private Long MaxExecutorNums;

    /**
    * 创建时间戳
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 更新时间戳
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 是否待重启，作为有资源参数，静态参数修改未重启生效的标识；0-- 不需要重启、1--因为资源参数待重启、2--因静态参数重启、3--因资源和静态参数而待重启、4--因网络配置而待重启、5--因网络配置和资源配置而待重启、6--因网络配置和静态参数而待重启、7--因网络配置，资源参数和静态参数而待重启、
    */
    @SerializedName("NeedRestart")
    @Expose
    private Long NeedRestart;

    /**
    * 绑定的引擎名称
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
    * 绑定的引擎ID
    */
    @SerializedName("DataEngineId")
    @Expose
    private String DataEngineId;

    /**
    * 绑定的引擎状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataEngineState")
    @Expose
    private Long DataEngineState;

    /**
    * 接入点ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessPointId")
    @Expose
    private String AccessPointId;

    /**
    * 接入点名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessPointName")
    @Expose
    private String AccessPointName;

    /**
    * 接入点状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessPointState")
    @Expose
    private Long AccessPointState;

    /**
    * 资源组类型，console/ default
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupType")
    @Expose
    private String ResourceGroupType;

    /**
    * 引擎网络ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineNetworkId")
    @Expose
    private String EngineNetworkId;

    /**
    * 网络配置名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkConfigNames")
    @Expose
    private String [] NetworkConfigNames;

    /**
    * AI类型资源组的框架类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrameType")
    @Expose
    private String FrameType;

    /**
    * AI类型资源组的镜像类型，内置：bulit-in，自定义：custom
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageType")
    @Expose
    private String ImageType;

    /**
    * 镜像名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 镜像id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageVersion")
    @Expose
    private String ImageVersion;

    /**
    * AI资源组的可用资源上限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 是否是默认资源组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * 资源组场景
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupScene")
    @Expose
    private String ResourceGroupScene;

    /**
    * python类型资源组python单机节点资源上限，该值要小于资源组的资源上限.small:1cu medium:2cu large:4cu xlarge:8cu 4xlarge:16cu 8xlarge:32cu 16xlarge:64cu，如果是高内存型资源，在类型前面加上m.
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PythonCuSpec")
    @Expose
    private String PythonCuSpec;

    /**
    * Spark类型资源组资源配置模式，fast：快速模式，custom：自定义模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SparkSpecMode")
    @Expose
    private String SparkSpecMode;

    /**
    * Spark类型资源组资源上限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SparkSize")
    @Expose
    private Long SparkSize;

    /**
    * Spark类型资源组资源最小值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SparkMinSize")
    @Expose
    private Long SparkMinSize;

    /**
    * 自定义镜像容器镜像服务domain 名称
    */
    @SerializedName("PublicDomain")
    @Expose
    private String PublicDomain;

    /**
    * 自定义镜像容器镜像服务tcr实例id
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 容器镜像服务tcr所在地域
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 资源组启动耗时
    */
    @SerializedName("LaunchTime")
    @Expose
    private String LaunchTime;

    /**
     * Get 标准引擎资源组ID 
     * @return EngineResourceGroupId 标准引擎资源组ID
     */
    public String getEngineResourceGroupId() {
        return this.EngineResourceGroupId;
    }

    /**
     * Set 标准引擎资源组ID
     * @param EngineResourceGroupId 标准引擎资源组ID
     */
    public void setEngineResourceGroupId(String EngineResourceGroupId) {
        this.EngineResourceGroupId = EngineResourceGroupId;
    }

    /**
     * Get 标准引擎资源组名称，支持1-50个英文、汉字、数字、连接线-或下划线_ 
     * @return EngineResourceGroupName 标准引擎资源组名称，支持1-50个英文、汉字、数字、连接线-或下划线_
     */
    public String getEngineResourceGroupName() {
        return this.EngineResourceGroupName;
    }

    /**
     * Set 标准引擎资源组名称，支持1-50个英文、汉字、数字、连接线-或下划线_
     * @param EngineResourceGroupName 标准引擎资源组名称，支持1-50个英文、汉字、数字、连接线-或下划线_
     */
    public void setEngineResourceGroupName(String EngineResourceGroupName) {
        this.EngineResourceGroupName = EngineResourceGroupName;
    }

    /**
     * Get 创建者 
     * @return Creator 创建者
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建者
     * @param Creator 创建者
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 资源组 状态，-1--删除、0--启动中、2--运行、3--暂停、4--暂停中、7--切换引擎中、8--配置修改中。9--资源组重启中，10--因为变配导致资源组启动、11--因为隔离导致资源组挂起、12- 资源配置下发中、 13-接入点隔离导致资源组挂起中 
     * @return ResourceGroupState 资源组 状态，-1--删除、0--启动中、2--运行、3--暂停、4--暂停中、7--切换引擎中、8--配置修改中。9--资源组重启中，10--因为变配导致资源组启动、11--因为隔离导致资源组挂起、12- 资源配置下发中、 13-接入点隔离导致资源组挂起中
     */
    public Long getResourceGroupState() {
        return this.ResourceGroupState;
    }

    /**
     * Set 资源组 状态，-1--删除、0--启动中、2--运行、3--暂停、4--暂停中、7--切换引擎中、8--配置修改中。9--资源组重启中，10--因为变配导致资源组启动、11--因为隔离导致资源组挂起、12- 资源配置下发中、 13-接入点隔离导致资源组挂起中
     * @param ResourceGroupState 资源组 状态，-1--删除、0--启动中、2--运行、3--暂停、4--暂停中、7--切换引擎中、8--配置修改中。9--资源组重启中，10--因为变配导致资源组启动、11--因为隔离导致资源组挂起、12- 资源配置下发中、 13-接入点隔离导致资源组挂起中
     */
    public void setResourceGroupState(Long ResourceGroupState) {
        this.ResourceGroupState = ResourceGroupState;
    }

    /**
     * Get 自动启动，（任务提交自动拉起资源组）0-自动启动，1-不自动启动 
     * @return AutoLaunch 自动启动，（任务提交自动拉起资源组）0-自动启动，1-不自动启动
     */
    public Long getAutoLaunch() {
        return this.AutoLaunch;
    }

    /**
     * Set 自动启动，（任务提交自动拉起资源组）0-自动启动，1-不自动启动
     * @param AutoLaunch 自动启动，（任务提交自动拉起资源组）0-自动启动，1-不自动启动
     */
    public void setAutoLaunch(Long AutoLaunch) {
        this.AutoLaunch = AutoLaunch;
    }

    /**
     * Get 自动挂起资源组。0-自动挂起，1-不自动挂起 
     * @return AutoPause 自动挂起资源组。0-自动挂起，1-不自动挂起
     */
    public Long getAutoPause() {
        return this.AutoPause;
    }

    /**
     * Set 自动挂起资源组。0-自动挂起，1-不自动挂起
     * @param AutoPause 自动挂起资源组。0-自动挂起，1-不自动挂起
     */
    public void setAutoPause(Long AutoPause) {
        this.AutoPause = AutoPause;
    }

    /**
     * Get 自动挂起时间，单位分钟，取值范围在1-999（在无任务AutoPauseTime后，资源组自动挂起） 
     * @return AutoPauseTime 自动挂起时间，单位分钟，取值范围在1-999（在无任务AutoPauseTime后，资源组自动挂起）
     */
    public Long getAutoPauseTime() {
        return this.AutoPauseTime;
    }

    /**
     * Set 自动挂起时间，单位分钟，取值范围在1-999（在无任务AutoPauseTime后，资源组自动挂起）
     * @param AutoPauseTime 自动挂起时间，单位分钟，取值范围在1-999（在无任务AutoPauseTime后，资源组自动挂起）
     */
    public void setAutoPauseTime(Long AutoPauseTime) {
        this.AutoPauseTime = AutoPauseTime;
    }

    /**
     * Get driver的cu规格：
当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu），内存型cu为cpu：men=1:8，m.small（1cu内存型）、m.medium（2cu内存型）、m.large（4cu内存型）、m.xlarge（8cu内存型） 
     * @return DriverCuSpec driver的cu规格：
当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu），内存型cu为cpu：men=1:8，m.small（1cu内存型）、m.medium（2cu内存型）、m.large（4cu内存型）、m.xlarge（8cu内存型）
     */
    public String getDriverCuSpec() {
        return this.DriverCuSpec;
    }

    /**
     * Set driver的cu规格：
当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu），内存型cu为cpu：men=1:8，m.small（1cu内存型）、m.medium（2cu内存型）、m.large（4cu内存型）、m.xlarge（8cu内存型）
     * @param DriverCuSpec driver的cu规格：
当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu），内存型cu为cpu：men=1:8，m.small（1cu内存型）、m.medium（2cu内存型）、m.large（4cu内存型）、m.xlarge（8cu内存型）
     */
    public void setDriverCuSpec(String DriverCuSpec) {
        this.DriverCuSpec = DriverCuSpec;
    }

    /**
     * Get executor的cu规格：
当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu），内存型cu为cpu：men=1:8，m.small（1cu内存型）、m.medium（2cu内存型）、m.large（4cu内存型）、m.xlarge（8cu内存型） 
     * @return ExecutorCuSpec executor的cu规格：
当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu），内存型cu为cpu：men=1:8，m.small（1cu内存型）、m.medium（2cu内存型）、m.large（4cu内存型）、m.xlarge（8cu内存型）
     */
    public String getExecutorCuSpec() {
        return this.ExecutorCuSpec;
    }

    /**
     * Set executor的cu规格：
当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu），内存型cu为cpu：men=1:8，m.small（1cu内存型）、m.medium（2cu内存型）、m.large（4cu内存型）、m.xlarge（8cu内存型）
     * @param ExecutorCuSpec executor的cu规格：
当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu），内存型cu为cpu：men=1:8，m.small（1cu内存型）、m.medium（2cu内存型）、m.large（4cu内存型）、m.xlarge（8cu内存型）
     */
    public void setExecutorCuSpec(String ExecutorCuSpec) {
        this.ExecutorCuSpec = ExecutorCuSpec;
    }

    /**
     * Get 任务并发数 
     * @return MaxConcurrency 任务并发数
     */
    public Long getMaxConcurrency() {
        return this.MaxConcurrency;
    }

    /**
     * Set 任务并发数
     * @param MaxConcurrency 任务并发数
     */
    public void setMaxConcurrency(Long MaxConcurrency) {
        this.MaxConcurrency = MaxConcurrency;
    }

    /**
     * Get executor最小数量， 
     * @return MinExecutorNums executor最小数量，
     */
    public Long getMinExecutorNums() {
        return this.MinExecutorNums;
    }

    /**
     * Set executor最小数量，
     * @param MinExecutorNums executor最小数量，
     */
    public void setMinExecutorNums(Long MinExecutorNums) {
        this.MinExecutorNums = MinExecutorNums;
    }

    /**
     * Get executor最大数量， 
     * @return MaxExecutorNums executor最大数量，
     */
    public Long getMaxExecutorNums() {
        return this.MaxExecutorNums;
    }

    /**
     * Set executor最大数量，
     * @param MaxExecutorNums executor最大数量，
     */
    public void setMaxExecutorNums(Long MaxExecutorNums) {
        this.MaxExecutorNums = MaxExecutorNums;
    }

    /**
     * Get 创建时间戳 
     * @return CreateTime 创建时间戳
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间戳
     * @param CreateTime 创建时间戳
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间戳 
     * @return UpdateTime 更新时间戳
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间戳
     * @param UpdateTime 更新时间戳
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 是否待重启，作为有资源参数，静态参数修改未重启生效的标识；0-- 不需要重启、1--因为资源参数待重启、2--因静态参数重启、3--因资源和静态参数而待重启、4--因网络配置而待重启、5--因网络配置和资源配置而待重启、6--因网络配置和静态参数而待重启、7--因网络配置，资源参数和静态参数而待重启、 
     * @return NeedRestart 是否待重启，作为有资源参数，静态参数修改未重启生效的标识；0-- 不需要重启、1--因为资源参数待重启、2--因静态参数重启、3--因资源和静态参数而待重启、4--因网络配置而待重启、5--因网络配置和资源配置而待重启、6--因网络配置和静态参数而待重启、7--因网络配置，资源参数和静态参数而待重启、
     */
    public Long getNeedRestart() {
        return this.NeedRestart;
    }

    /**
     * Set 是否待重启，作为有资源参数，静态参数修改未重启生效的标识；0-- 不需要重启、1--因为资源参数待重启、2--因静态参数重启、3--因资源和静态参数而待重启、4--因网络配置而待重启、5--因网络配置和资源配置而待重启、6--因网络配置和静态参数而待重启、7--因网络配置，资源参数和静态参数而待重启、
     * @param NeedRestart 是否待重启，作为有资源参数，静态参数修改未重启生效的标识；0-- 不需要重启、1--因为资源参数待重启、2--因静态参数重启、3--因资源和静态参数而待重启、4--因网络配置而待重启、5--因网络配置和资源配置而待重启、6--因网络配置和静态参数而待重启、7--因网络配置，资源参数和静态参数而待重启、
     */
    public void setNeedRestart(Long NeedRestart) {
        this.NeedRestart = NeedRestart;
    }

    /**
     * Get 绑定的引擎名称 
     * @return DataEngineName 绑定的引擎名称
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set 绑定的引擎名称
     * @param DataEngineName 绑定的引擎名称
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    /**
     * Get 绑定的引擎ID 
     * @return DataEngineId 绑定的引擎ID
     */
    public String getDataEngineId() {
        return this.DataEngineId;
    }

    /**
     * Set 绑定的引擎ID
     * @param DataEngineId 绑定的引擎ID
     */
    public void setDataEngineId(String DataEngineId) {
        this.DataEngineId = DataEngineId;
    }

    /**
     * Get 绑定的引擎状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataEngineState 绑定的引擎状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDataEngineState() {
        return this.DataEngineState;
    }

    /**
     * Set 绑定的引擎状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataEngineState 绑定的引擎状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataEngineState(Long DataEngineState) {
        this.DataEngineState = DataEngineState;
    }

    /**
     * Get 接入点ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessPointId 接入点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccessPointId() {
        return this.AccessPointId;
    }

    /**
     * Set 接入点ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessPointId 接入点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessPointId(String AccessPointId) {
        this.AccessPointId = AccessPointId;
    }

    /**
     * Get 接入点名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessPointName 接入点名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccessPointName() {
        return this.AccessPointName;
    }

    /**
     * Set 接入点名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessPointName 接入点名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessPointName(String AccessPointName) {
        this.AccessPointName = AccessPointName;
    }

    /**
     * Get 接入点状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessPointState 接入点状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAccessPointState() {
        return this.AccessPointState;
    }

    /**
     * Set 接入点状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessPointState 接入点状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessPointState(Long AccessPointState) {
        this.AccessPointState = AccessPointState;
    }

    /**
     * Get 资源组类型，console/ default
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupType 资源组类型，console/ default
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupType() {
        return this.ResourceGroupType;
    }

    /**
     * Set 资源组类型，console/ default
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupType 资源组类型，console/ default
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupType(String ResourceGroupType) {
        this.ResourceGroupType = ResourceGroupType;
    }

    /**
     * Get 引擎网络ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineNetworkId 引擎网络ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineNetworkId() {
        return this.EngineNetworkId;
    }

    /**
     * Set 引擎网络ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineNetworkId 引擎网络ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineNetworkId(String EngineNetworkId) {
        this.EngineNetworkId = EngineNetworkId;
    }

    /**
     * Get 网络配置名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetworkConfigNames 网络配置名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNetworkConfigNames() {
        return this.NetworkConfigNames;
    }

    /**
     * Set 网络配置名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkConfigNames 网络配置名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkConfigNames(String [] NetworkConfigNames) {
        this.NetworkConfigNames = NetworkConfigNames;
    }

    /**
     * Get AI类型资源组的框架类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrameType AI类型资源组的框架类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFrameType() {
        return this.FrameType;
    }

    /**
     * Set AI类型资源组的框架类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrameType AI类型资源组的框架类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrameType(String FrameType) {
        this.FrameType = FrameType;
    }

    /**
     * Get AI类型资源组的镜像类型，内置：bulit-in，自定义：custom
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageType AI类型资源组的镜像类型，内置：bulit-in，自定义：custom
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageType() {
        return this.ImageType;
    }

    /**
     * Set AI类型资源组的镜像类型，内置：bulit-in，自定义：custom
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageType AI类型资源组的镜像类型，内置：bulit-in，自定义：custom
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageType(String ImageType) {
        this.ImageType = ImageType;
    }

    /**
     * Get 镜像名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageName 镜像名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 镜像名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageName 镜像名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get 镜像id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageVersion 镜像id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageVersion() {
        return this.ImageVersion;
    }

    /**
     * Set 镜像id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageVersion 镜像id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageVersion(String ImageVersion) {
        this.ImageVersion = ImageVersion;
    }

    /**
     * Get AI资源组的可用资源上限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Size AI资源组的可用资源上限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set AI资源组的可用资源上限
注意：此字段可能返回 null，表示取不到有效值。
     * @param Size AI资源组的可用资源上限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 是否是默认资源组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDefault 是否是默认资源组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否是默认资源组
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDefault 是否是默认资源组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get 资源组场景
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupScene 资源组场景
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupScene() {
        return this.ResourceGroupScene;
    }

    /**
     * Set 资源组场景
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupScene 资源组场景
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupScene(String ResourceGroupScene) {
        this.ResourceGroupScene = ResourceGroupScene;
    }

    /**
     * Get python类型资源组python单机节点资源上限，该值要小于资源组的资源上限.small:1cu medium:2cu large:4cu xlarge:8cu 4xlarge:16cu 8xlarge:32cu 16xlarge:64cu，如果是高内存型资源，在类型前面加上m.
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PythonCuSpec python类型资源组python单机节点资源上限，该值要小于资源组的资源上限.small:1cu medium:2cu large:4cu xlarge:8cu 4xlarge:16cu 8xlarge:32cu 16xlarge:64cu，如果是高内存型资源，在类型前面加上m.
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPythonCuSpec() {
        return this.PythonCuSpec;
    }

    /**
     * Set python类型资源组python单机节点资源上限，该值要小于资源组的资源上限.small:1cu medium:2cu large:4cu xlarge:8cu 4xlarge:16cu 8xlarge:32cu 16xlarge:64cu，如果是高内存型资源，在类型前面加上m.
注意：此字段可能返回 null，表示取不到有效值。
     * @param PythonCuSpec python类型资源组python单机节点资源上限，该值要小于资源组的资源上限.small:1cu medium:2cu large:4cu xlarge:8cu 4xlarge:16cu 8xlarge:32cu 16xlarge:64cu，如果是高内存型资源，在类型前面加上m.
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPythonCuSpec(String PythonCuSpec) {
        this.PythonCuSpec = PythonCuSpec;
    }

    /**
     * Get Spark类型资源组资源配置模式，fast：快速模式，custom：自定义模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SparkSpecMode Spark类型资源组资源配置模式，fast：快速模式，custom：自定义模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSparkSpecMode() {
        return this.SparkSpecMode;
    }

    /**
     * Set Spark类型资源组资源配置模式，fast：快速模式，custom：自定义模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param SparkSpecMode Spark类型资源组资源配置模式，fast：快速模式，custom：自定义模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSparkSpecMode(String SparkSpecMode) {
        this.SparkSpecMode = SparkSpecMode;
    }

    /**
     * Get Spark类型资源组资源上限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SparkSize Spark类型资源组资源上限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSparkSize() {
        return this.SparkSize;
    }

    /**
     * Set Spark类型资源组资源上限
注意：此字段可能返回 null，表示取不到有效值。
     * @param SparkSize Spark类型资源组资源上限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSparkSize(Long SparkSize) {
        this.SparkSize = SparkSize;
    }

    /**
     * Get Spark类型资源组资源最小值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SparkMinSize Spark类型资源组资源最小值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSparkMinSize() {
        return this.SparkMinSize;
    }

    /**
     * Set Spark类型资源组资源最小值
注意：此字段可能返回 null，表示取不到有效值。
     * @param SparkMinSize Spark类型资源组资源最小值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSparkMinSize(Long SparkMinSize) {
        this.SparkMinSize = SparkMinSize;
    }

    /**
     * Get 自定义镜像容器镜像服务domain 名称 
     * @return PublicDomain 自定义镜像容器镜像服务domain 名称
     */
    public String getPublicDomain() {
        return this.PublicDomain;
    }

    /**
     * Set 自定义镜像容器镜像服务domain 名称
     * @param PublicDomain 自定义镜像容器镜像服务domain 名称
     */
    public void setPublicDomain(String PublicDomain) {
        this.PublicDomain = PublicDomain;
    }

    /**
     * Get 自定义镜像容器镜像服务tcr实例id 
     * @return RegistryId 自定义镜像容器镜像服务tcr实例id
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 自定义镜像容器镜像服务tcr实例id
     * @param RegistryId 自定义镜像容器镜像服务tcr实例id
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 容器镜像服务tcr所在地域 
     * @return RegionName 容器镜像服务tcr所在地域
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 容器镜像服务tcr所在地域
     * @param RegionName 容器镜像服务tcr所在地域
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 资源组启动耗时 
     * @return LaunchTime 资源组启动耗时
     */
    public String getLaunchTime() {
        return this.LaunchTime;
    }

    /**
     * Set 资源组启动耗时
     * @param LaunchTime 资源组启动耗时
     */
    public void setLaunchTime(String LaunchTime) {
        this.LaunchTime = LaunchTime;
    }

    public StandardEngineResourceGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StandardEngineResourceGroupInfo(StandardEngineResourceGroupInfo source) {
        if (source.EngineResourceGroupId != null) {
            this.EngineResourceGroupId = new String(source.EngineResourceGroupId);
        }
        if (source.EngineResourceGroupName != null) {
            this.EngineResourceGroupName = new String(source.EngineResourceGroupName);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.ResourceGroupState != null) {
            this.ResourceGroupState = new Long(source.ResourceGroupState);
        }
        if (source.AutoLaunch != null) {
            this.AutoLaunch = new Long(source.AutoLaunch);
        }
        if (source.AutoPause != null) {
            this.AutoPause = new Long(source.AutoPause);
        }
        if (source.AutoPauseTime != null) {
            this.AutoPauseTime = new Long(source.AutoPauseTime);
        }
        if (source.DriverCuSpec != null) {
            this.DriverCuSpec = new String(source.DriverCuSpec);
        }
        if (source.ExecutorCuSpec != null) {
            this.ExecutorCuSpec = new String(source.ExecutorCuSpec);
        }
        if (source.MaxConcurrency != null) {
            this.MaxConcurrency = new Long(source.MaxConcurrency);
        }
        if (source.MinExecutorNums != null) {
            this.MinExecutorNums = new Long(source.MinExecutorNums);
        }
        if (source.MaxExecutorNums != null) {
            this.MaxExecutorNums = new Long(source.MaxExecutorNums);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.NeedRestart != null) {
            this.NeedRestart = new Long(source.NeedRestart);
        }
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
        }
        if (source.DataEngineId != null) {
            this.DataEngineId = new String(source.DataEngineId);
        }
        if (source.DataEngineState != null) {
            this.DataEngineState = new Long(source.DataEngineState);
        }
        if (source.AccessPointId != null) {
            this.AccessPointId = new String(source.AccessPointId);
        }
        if (source.AccessPointName != null) {
            this.AccessPointName = new String(source.AccessPointName);
        }
        if (source.AccessPointState != null) {
            this.AccessPointState = new Long(source.AccessPointState);
        }
        if (source.ResourceGroupType != null) {
            this.ResourceGroupType = new String(source.ResourceGroupType);
        }
        if (source.EngineNetworkId != null) {
            this.EngineNetworkId = new String(source.EngineNetworkId);
        }
        if (source.NetworkConfigNames != null) {
            this.NetworkConfigNames = new String[source.NetworkConfigNames.length];
            for (int i = 0; i < source.NetworkConfigNames.length; i++) {
                this.NetworkConfigNames[i] = new String(source.NetworkConfigNames[i]);
            }
        }
        if (source.FrameType != null) {
            this.FrameType = new String(source.FrameType);
        }
        if (source.ImageType != null) {
            this.ImageType = new String(source.ImageType);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ImageVersion != null) {
            this.ImageVersion = new String(source.ImageVersion);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
        if (source.ResourceGroupScene != null) {
            this.ResourceGroupScene = new String(source.ResourceGroupScene);
        }
        if (source.PythonCuSpec != null) {
            this.PythonCuSpec = new String(source.PythonCuSpec);
        }
        if (source.SparkSpecMode != null) {
            this.SparkSpecMode = new String(source.SparkSpecMode);
        }
        if (source.SparkSize != null) {
            this.SparkSize = new Long(source.SparkSize);
        }
        if (source.SparkMinSize != null) {
            this.SparkMinSize = new Long(source.SparkMinSize);
        }
        if (source.PublicDomain != null) {
            this.PublicDomain = new String(source.PublicDomain);
        }
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.LaunchTime != null) {
            this.LaunchTime = new String(source.LaunchTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EngineResourceGroupId", this.EngineResourceGroupId);
        this.setParamSimple(map, prefix + "EngineResourceGroupName", this.EngineResourceGroupName);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "ResourceGroupState", this.ResourceGroupState);
        this.setParamSimple(map, prefix + "AutoLaunch", this.AutoLaunch);
        this.setParamSimple(map, prefix + "AutoPause", this.AutoPause);
        this.setParamSimple(map, prefix + "AutoPauseTime", this.AutoPauseTime);
        this.setParamSimple(map, prefix + "DriverCuSpec", this.DriverCuSpec);
        this.setParamSimple(map, prefix + "ExecutorCuSpec", this.ExecutorCuSpec);
        this.setParamSimple(map, prefix + "MaxConcurrency", this.MaxConcurrency);
        this.setParamSimple(map, prefix + "MinExecutorNums", this.MinExecutorNums);
        this.setParamSimple(map, prefix + "MaxExecutorNums", this.MaxExecutorNums);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "NeedRestart", this.NeedRestart);
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);
        this.setParamSimple(map, prefix + "DataEngineId", this.DataEngineId);
        this.setParamSimple(map, prefix + "DataEngineState", this.DataEngineState);
        this.setParamSimple(map, prefix + "AccessPointId", this.AccessPointId);
        this.setParamSimple(map, prefix + "AccessPointName", this.AccessPointName);
        this.setParamSimple(map, prefix + "AccessPointState", this.AccessPointState);
        this.setParamSimple(map, prefix + "ResourceGroupType", this.ResourceGroupType);
        this.setParamSimple(map, prefix + "EngineNetworkId", this.EngineNetworkId);
        this.setParamArraySimple(map, prefix + "NetworkConfigNames.", this.NetworkConfigNames);
        this.setParamSimple(map, prefix + "FrameType", this.FrameType);
        this.setParamSimple(map, prefix + "ImageType", this.ImageType);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageVersion", this.ImageVersion);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "ResourceGroupScene", this.ResourceGroupScene);
        this.setParamSimple(map, prefix + "PythonCuSpec", this.PythonCuSpec);
        this.setParamSimple(map, prefix + "SparkSpecMode", this.SparkSpecMode);
        this.setParamSimple(map, prefix + "SparkSize", this.SparkSize);
        this.setParamSimple(map, prefix + "SparkMinSize", this.SparkMinSize);
        this.setParamSimple(map, prefix + "PublicDomain", this.PublicDomain);
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "LaunchTime", this.LaunchTime);

    }
}

