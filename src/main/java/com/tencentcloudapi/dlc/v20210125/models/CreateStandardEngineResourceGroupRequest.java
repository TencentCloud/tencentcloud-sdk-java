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

public class CreateStandardEngineResourceGroupRequest extends AbstractModel {

    /**
    * 标准引擎资源组名称
    */
    @SerializedName("EngineResourceGroupName")
    @Expose
    private String EngineResourceGroupName;

    /**
    * 标准引擎名称
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

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
    * executor最小数量，
    */
    @SerializedName("MinExecutorNums")
    @Expose
    private Long MinExecutorNums;

    /**
    * executor最大数量
    */
    @SerializedName("MaxExecutorNums")
    @Expose
    private Long MaxExecutorNums;

    /**
    * 创建资源组后是否直接拉起，0-拉起，1-不拉起
    */
    @SerializedName("IsLaunchNow")
    @Expose
    private Long IsLaunchNow;

    /**
    * 自动挂起时间，单位分钟，取值范围在1-999（在无任务AutoPauseTime后，资源组自动挂起）
    */
    @SerializedName("AutoPauseTime")
    @Expose
    private Long AutoPauseTime;

    /**
    * 资源组静态参数，需要重启资源组生效
    */
    @SerializedName("StaticConfigPairs")
    @Expose
    private EngineResourceGroupConfigPair [] StaticConfigPairs;

    /**
    * 资源组动态参数，下一个任务生效。
    */
    @SerializedName("DynamicConfigPairs")
    @Expose
    private EngineResourceGroupConfigPair [] DynamicConfigPairs;

    /**
    * 任务并发数，默人是5个
    */
    @SerializedName("MaxConcurrency")
    @Expose
    private Long MaxConcurrency;

    /**
    * 网络配置名称
    */
    @SerializedName("NetworkConfigNames")
    @Expose
    private String [] NetworkConfigNames;

    /**
    * 自定义镜像域名
    */
    @SerializedName("PublicDomain")
    @Expose
    private String PublicDomain;

    /**
    * 自定义镜像实例id
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * AI类型资源组的框架类型，machine-learning，python，spark-ml，不填默认为machine-learning
    */
    @SerializedName("FrameType")
    @Expose
    private String FrameType;

    /**
    * 镜像类型，bulit-in：内置，custom：自定义，不填默认为bulit-in
    */
    @SerializedName("ImageType")
    @Expose
    private String ImageType;

    /**
    * 镜像名称
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 镜像id
    */
    @SerializedName("ImageVersion")
    @Expose
    private String ImageVersion;

    /**
    * AI资源组有效，资源组可用资源上限，该值需要小于引擎资源上限
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 资源组场景
    */
    @SerializedName("ResourceGroupScene")
    @Expose
    private String ResourceGroupScene;

    /**
    * 自定义镜像所在地域
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * python类型资源组python单机节点资源上限，该值要小于资源组的资源上限.small:1cu medium:2cu large:4cu xlarge:8cu 4xlarge:16cu 8xlarge:32cu 16xlarge:64cu，如果是高内存型资源，在类型前面加上m.
    */
    @SerializedName("PythonCuSpec")
    @Expose
    private String PythonCuSpec;

    /**
    * 仅SQL资源组资源配置模式，fast：快速模式，custom：自定义模式
    */
    @SerializedName("SparkSpecMode")
    @Expose
    private String SparkSpecMode;

    /**
    * 仅SQL资源组资源上限，仅用于快速模块
    */
    @SerializedName("SparkSize")
    @Expose
    private Long SparkSize;

    /**
     * Get 标准引擎资源组名称 
     * @return EngineResourceGroupName 标准引擎资源组名称
     */
    public String getEngineResourceGroupName() {
        return this.EngineResourceGroupName;
    }

    /**
     * Set 标准引擎资源组名称
     * @param EngineResourceGroupName 标准引擎资源组名称
     */
    public void setEngineResourceGroupName(String EngineResourceGroupName) {
        this.EngineResourceGroupName = EngineResourceGroupName;
    }

    /**
     * Get 标准引擎名称 
     * @return DataEngineName 标准引擎名称
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set 标准引擎名称
     * @param DataEngineName 标准引擎名称
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
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
     * Get executor最大数量 
     * @return MaxExecutorNums executor最大数量
     */
    public Long getMaxExecutorNums() {
        return this.MaxExecutorNums;
    }

    /**
     * Set executor最大数量
     * @param MaxExecutorNums executor最大数量
     */
    public void setMaxExecutorNums(Long MaxExecutorNums) {
        this.MaxExecutorNums = MaxExecutorNums;
    }

    /**
     * Get 创建资源组后是否直接拉起，0-拉起，1-不拉起 
     * @return IsLaunchNow 创建资源组后是否直接拉起，0-拉起，1-不拉起
     */
    public Long getIsLaunchNow() {
        return this.IsLaunchNow;
    }

    /**
     * Set 创建资源组后是否直接拉起，0-拉起，1-不拉起
     * @param IsLaunchNow 创建资源组后是否直接拉起，0-拉起，1-不拉起
     */
    public void setIsLaunchNow(Long IsLaunchNow) {
        this.IsLaunchNow = IsLaunchNow;
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
     * Get 资源组静态参数，需要重启资源组生效 
     * @return StaticConfigPairs 资源组静态参数，需要重启资源组生效
     */
    public EngineResourceGroupConfigPair [] getStaticConfigPairs() {
        return this.StaticConfigPairs;
    }

    /**
     * Set 资源组静态参数，需要重启资源组生效
     * @param StaticConfigPairs 资源组静态参数，需要重启资源组生效
     */
    public void setStaticConfigPairs(EngineResourceGroupConfigPair [] StaticConfigPairs) {
        this.StaticConfigPairs = StaticConfigPairs;
    }

    /**
     * Get 资源组动态参数，下一个任务生效。 
     * @return DynamicConfigPairs 资源组动态参数，下一个任务生效。
     */
    public EngineResourceGroupConfigPair [] getDynamicConfigPairs() {
        return this.DynamicConfigPairs;
    }

    /**
     * Set 资源组动态参数，下一个任务生效。
     * @param DynamicConfigPairs 资源组动态参数，下一个任务生效。
     */
    public void setDynamicConfigPairs(EngineResourceGroupConfigPair [] DynamicConfigPairs) {
        this.DynamicConfigPairs = DynamicConfigPairs;
    }

    /**
     * Get 任务并发数，默人是5个 
     * @return MaxConcurrency 任务并发数，默人是5个
     */
    public Long getMaxConcurrency() {
        return this.MaxConcurrency;
    }

    /**
     * Set 任务并发数，默人是5个
     * @param MaxConcurrency 任务并发数，默人是5个
     */
    public void setMaxConcurrency(Long MaxConcurrency) {
        this.MaxConcurrency = MaxConcurrency;
    }

    /**
     * Get 网络配置名称 
     * @return NetworkConfigNames 网络配置名称
     */
    public String [] getNetworkConfigNames() {
        return this.NetworkConfigNames;
    }

    /**
     * Set 网络配置名称
     * @param NetworkConfigNames 网络配置名称
     */
    public void setNetworkConfigNames(String [] NetworkConfigNames) {
        this.NetworkConfigNames = NetworkConfigNames;
    }

    /**
     * Get 自定义镜像域名 
     * @return PublicDomain 自定义镜像域名
     */
    public String getPublicDomain() {
        return this.PublicDomain;
    }

    /**
     * Set 自定义镜像域名
     * @param PublicDomain 自定义镜像域名
     */
    public void setPublicDomain(String PublicDomain) {
        this.PublicDomain = PublicDomain;
    }

    /**
     * Get 自定义镜像实例id 
     * @return RegistryId 自定义镜像实例id
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 自定义镜像实例id
     * @param RegistryId 自定义镜像实例id
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get AI类型资源组的框架类型，machine-learning，python，spark-ml，不填默认为machine-learning 
     * @return FrameType AI类型资源组的框架类型，machine-learning，python，spark-ml，不填默认为machine-learning
     */
    public String getFrameType() {
        return this.FrameType;
    }

    /**
     * Set AI类型资源组的框架类型，machine-learning，python，spark-ml，不填默认为machine-learning
     * @param FrameType AI类型资源组的框架类型，machine-learning，python，spark-ml，不填默认为machine-learning
     */
    public void setFrameType(String FrameType) {
        this.FrameType = FrameType;
    }

    /**
     * Get 镜像类型，bulit-in：内置，custom：自定义，不填默认为bulit-in 
     * @return ImageType 镜像类型，bulit-in：内置，custom：自定义，不填默认为bulit-in
     */
    public String getImageType() {
        return this.ImageType;
    }

    /**
     * Set 镜像类型，bulit-in：内置，custom：自定义，不填默认为bulit-in
     * @param ImageType 镜像类型，bulit-in：内置，custom：自定义，不填默认为bulit-in
     */
    public void setImageType(String ImageType) {
        this.ImageType = ImageType;
    }

    /**
     * Get 镜像名称 
     * @return ImageName 镜像名称
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 镜像名称
     * @param ImageName 镜像名称
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get 镜像id 
     * @return ImageVersion 镜像id
     */
    public String getImageVersion() {
        return this.ImageVersion;
    }

    /**
     * Set 镜像id
     * @param ImageVersion 镜像id
     */
    public void setImageVersion(String ImageVersion) {
        this.ImageVersion = ImageVersion;
    }

    /**
     * Get AI资源组有效，资源组可用资源上限，该值需要小于引擎资源上限 
     * @return Size AI资源组有效，资源组可用资源上限，该值需要小于引擎资源上限
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set AI资源组有效，资源组可用资源上限，该值需要小于引擎资源上限
     * @param Size AI资源组有效，资源组可用资源上限，该值需要小于引擎资源上限
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 资源组场景 
     * @return ResourceGroupScene 资源组场景
     */
    public String getResourceGroupScene() {
        return this.ResourceGroupScene;
    }

    /**
     * Set 资源组场景
     * @param ResourceGroupScene 资源组场景
     */
    public void setResourceGroupScene(String ResourceGroupScene) {
        this.ResourceGroupScene = ResourceGroupScene;
    }

    /**
     * Get 自定义镜像所在地域 
     * @return RegionName 自定义镜像所在地域
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 自定义镜像所在地域
     * @param RegionName 自定义镜像所在地域
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get python类型资源组python单机节点资源上限，该值要小于资源组的资源上限.small:1cu medium:2cu large:4cu xlarge:8cu 4xlarge:16cu 8xlarge:32cu 16xlarge:64cu，如果是高内存型资源，在类型前面加上m. 
     * @return PythonCuSpec python类型资源组python单机节点资源上限，该值要小于资源组的资源上限.small:1cu medium:2cu large:4cu xlarge:8cu 4xlarge:16cu 8xlarge:32cu 16xlarge:64cu，如果是高内存型资源，在类型前面加上m.
     */
    public String getPythonCuSpec() {
        return this.PythonCuSpec;
    }

    /**
     * Set python类型资源组python单机节点资源上限，该值要小于资源组的资源上限.small:1cu medium:2cu large:4cu xlarge:8cu 4xlarge:16cu 8xlarge:32cu 16xlarge:64cu，如果是高内存型资源，在类型前面加上m.
     * @param PythonCuSpec python类型资源组python单机节点资源上限，该值要小于资源组的资源上限.small:1cu medium:2cu large:4cu xlarge:8cu 4xlarge:16cu 8xlarge:32cu 16xlarge:64cu，如果是高内存型资源，在类型前面加上m.
     */
    public void setPythonCuSpec(String PythonCuSpec) {
        this.PythonCuSpec = PythonCuSpec;
    }

    /**
     * Get 仅SQL资源组资源配置模式，fast：快速模式，custom：自定义模式 
     * @return SparkSpecMode 仅SQL资源组资源配置模式，fast：快速模式，custom：自定义模式
     */
    public String getSparkSpecMode() {
        return this.SparkSpecMode;
    }

    /**
     * Set 仅SQL资源组资源配置模式，fast：快速模式，custom：自定义模式
     * @param SparkSpecMode 仅SQL资源组资源配置模式，fast：快速模式，custom：自定义模式
     */
    public void setSparkSpecMode(String SparkSpecMode) {
        this.SparkSpecMode = SparkSpecMode;
    }

    /**
     * Get 仅SQL资源组资源上限，仅用于快速模块 
     * @return SparkSize 仅SQL资源组资源上限，仅用于快速模块
     */
    public Long getSparkSize() {
        return this.SparkSize;
    }

    /**
     * Set 仅SQL资源组资源上限，仅用于快速模块
     * @param SparkSize 仅SQL资源组资源上限，仅用于快速模块
     */
    public void setSparkSize(Long SparkSize) {
        this.SparkSize = SparkSize;
    }

    public CreateStandardEngineResourceGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStandardEngineResourceGroupRequest(CreateStandardEngineResourceGroupRequest source) {
        if (source.EngineResourceGroupName != null) {
            this.EngineResourceGroupName = new String(source.EngineResourceGroupName);
        }
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
        }
        if (source.AutoLaunch != null) {
            this.AutoLaunch = new Long(source.AutoLaunch);
        }
        if (source.AutoPause != null) {
            this.AutoPause = new Long(source.AutoPause);
        }
        if (source.DriverCuSpec != null) {
            this.DriverCuSpec = new String(source.DriverCuSpec);
        }
        if (source.ExecutorCuSpec != null) {
            this.ExecutorCuSpec = new String(source.ExecutorCuSpec);
        }
        if (source.MinExecutorNums != null) {
            this.MinExecutorNums = new Long(source.MinExecutorNums);
        }
        if (source.MaxExecutorNums != null) {
            this.MaxExecutorNums = new Long(source.MaxExecutorNums);
        }
        if (source.IsLaunchNow != null) {
            this.IsLaunchNow = new Long(source.IsLaunchNow);
        }
        if (source.AutoPauseTime != null) {
            this.AutoPauseTime = new Long(source.AutoPauseTime);
        }
        if (source.StaticConfigPairs != null) {
            this.StaticConfigPairs = new EngineResourceGroupConfigPair[source.StaticConfigPairs.length];
            for (int i = 0; i < source.StaticConfigPairs.length; i++) {
                this.StaticConfigPairs[i] = new EngineResourceGroupConfigPair(source.StaticConfigPairs[i]);
            }
        }
        if (source.DynamicConfigPairs != null) {
            this.DynamicConfigPairs = new EngineResourceGroupConfigPair[source.DynamicConfigPairs.length];
            for (int i = 0; i < source.DynamicConfigPairs.length; i++) {
                this.DynamicConfigPairs[i] = new EngineResourceGroupConfigPair(source.DynamicConfigPairs[i]);
            }
        }
        if (source.MaxConcurrency != null) {
            this.MaxConcurrency = new Long(source.MaxConcurrency);
        }
        if (source.NetworkConfigNames != null) {
            this.NetworkConfigNames = new String[source.NetworkConfigNames.length];
            for (int i = 0; i < source.NetworkConfigNames.length; i++) {
                this.NetworkConfigNames[i] = new String(source.NetworkConfigNames[i]);
            }
        }
        if (source.PublicDomain != null) {
            this.PublicDomain = new String(source.PublicDomain);
        }
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
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
        if (source.ResourceGroupScene != null) {
            this.ResourceGroupScene = new String(source.ResourceGroupScene);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EngineResourceGroupName", this.EngineResourceGroupName);
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);
        this.setParamSimple(map, prefix + "AutoLaunch", this.AutoLaunch);
        this.setParamSimple(map, prefix + "AutoPause", this.AutoPause);
        this.setParamSimple(map, prefix + "DriverCuSpec", this.DriverCuSpec);
        this.setParamSimple(map, prefix + "ExecutorCuSpec", this.ExecutorCuSpec);
        this.setParamSimple(map, prefix + "MinExecutorNums", this.MinExecutorNums);
        this.setParamSimple(map, prefix + "MaxExecutorNums", this.MaxExecutorNums);
        this.setParamSimple(map, prefix + "IsLaunchNow", this.IsLaunchNow);
        this.setParamSimple(map, prefix + "AutoPauseTime", this.AutoPauseTime);
        this.setParamArrayObj(map, prefix + "StaticConfigPairs.", this.StaticConfigPairs);
        this.setParamArrayObj(map, prefix + "DynamicConfigPairs.", this.DynamicConfigPairs);
        this.setParamSimple(map, prefix + "MaxConcurrency", this.MaxConcurrency);
        this.setParamArraySimple(map, prefix + "NetworkConfigNames.", this.NetworkConfigNames);
        this.setParamSimple(map, prefix + "PublicDomain", this.PublicDomain);
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "FrameType", this.FrameType);
        this.setParamSimple(map, prefix + "ImageType", this.ImageType);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageVersion", this.ImageVersion);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "ResourceGroupScene", this.ResourceGroupScene);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "PythonCuSpec", this.PythonCuSpec);
        this.setParamSimple(map, prefix + "SparkSpecMode", this.SparkSpecMode);
        this.setParamSimple(map, prefix + "SparkSize", this.SparkSize);

    }
}

