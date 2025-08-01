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

public class UpdateStandardEngineResourceGroupResourceInfoRequest extends AbstractModel {

    /**
    * 引擎资源组名称
    */
    @SerializedName("EngineResourceGroupName")
    @Expose
    private String EngineResourceGroupName;

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
    * 是否立即重启资源组生效，0--立即生效，1--只保持不重启生效
    */
    @SerializedName("IsEffectiveNow")
    @Expose
    private Long IsEffectiveNow;

    /**
    * AI资源组资源上限
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 镜像类型，内置镜像：built-in，自定义镜像：custom
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
    * 镜像版本，镜像id
    */
    @SerializedName("ImageVersion")
    @Expose
    private String ImageVersion;

    /**
    * 框架类型
    */
    @SerializedName("FrameType")
    @Expose
    private String FrameType;

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
    * 自定义镜像所属地域
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
    * 仅SQL资源组资源上限，仅用于快速模式
    */
    @SerializedName("SparkSize")
    @Expose
    private Long SparkSize;

    /**
     * Get 引擎资源组名称 
     * @return EngineResourceGroupName 引擎资源组名称
     */
    public String getEngineResourceGroupName() {
        return this.EngineResourceGroupName;
    }

    /**
     * Set 引擎资源组名称
     * @param EngineResourceGroupName 引擎资源组名称
     */
    public void setEngineResourceGroupName(String EngineResourceGroupName) {
        this.EngineResourceGroupName = EngineResourceGroupName;
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
     * Get 是否立即重启资源组生效，0--立即生效，1--只保持不重启生效 
     * @return IsEffectiveNow 是否立即重启资源组生效，0--立即生效，1--只保持不重启生效
     */
    public Long getIsEffectiveNow() {
        return this.IsEffectiveNow;
    }

    /**
     * Set 是否立即重启资源组生效，0--立即生效，1--只保持不重启生效
     * @param IsEffectiveNow 是否立即重启资源组生效，0--立即生效，1--只保持不重启生效
     */
    public void setIsEffectiveNow(Long IsEffectiveNow) {
        this.IsEffectiveNow = IsEffectiveNow;
    }

    /**
     * Get AI资源组资源上限 
     * @return Size AI资源组资源上限
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set AI资源组资源上限
     * @param Size AI资源组资源上限
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 镜像类型，内置镜像：built-in，自定义镜像：custom 
     * @return ImageType 镜像类型，内置镜像：built-in，自定义镜像：custom
     */
    public String getImageType() {
        return this.ImageType;
    }

    /**
     * Set 镜像类型，内置镜像：built-in，自定义镜像：custom
     * @param ImageType 镜像类型，内置镜像：built-in，自定义镜像：custom
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
     * Get 镜像版本，镜像id 
     * @return ImageVersion 镜像版本，镜像id
     */
    public String getImageVersion() {
        return this.ImageVersion;
    }

    /**
     * Set 镜像版本，镜像id
     * @param ImageVersion 镜像版本，镜像id
     */
    public void setImageVersion(String ImageVersion) {
        this.ImageVersion = ImageVersion;
    }

    /**
     * Get 框架类型 
     * @return FrameType 框架类型
     */
    public String getFrameType() {
        return this.FrameType;
    }

    /**
     * Set 框架类型
     * @param FrameType 框架类型
     */
    public void setFrameType(String FrameType) {
        this.FrameType = FrameType;
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
     * Get 自定义镜像所属地域 
     * @return RegionName 自定义镜像所属地域
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 自定义镜像所属地域
     * @param RegionName 自定义镜像所属地域
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
     * Get 仅SQL资源组资源上限，仅用于快速模式 
     * @return SparkSize 仅SQL资源组资源上限，仅用于快速模式
     */
    public Long getSparkSize() {
        return this.SparkSize;
    }

    /**
     * Set 仅SQL资源组资源上限，仅用于快速模式
     * @param SparkSize 仅SQL资源组资源上限，仅用于快速模式
     */
    public void setSparkSize(Long SparkSize) {
        this.SparkSize = SparkSize;
    }

    public UpdateStandardEngineResourceGroupResourceInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateStandardEngineResourceGroupResourceInfoRequest(UpdateStandardEngineResourceGroupResourceInfoRequest source) {
        if (source.EngineResourceGroupName != null) {
            this.EngineResourceGroupName = new String(source.EngineResourceGroupName);
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
        if (source.IsEffectiveNow != null) {
            this.IsEffectiveNow = new Long(source.IsEffectiveNow);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
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
        if (source.FrameType != null) {
            this.FrameType = new String(source.FrameType);
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
        this.setParamSimple(map, prefix + "DriverCuSpec", this.DriverCuSpec);
        this.setParamSimple(map, prefix + "ExecutorCuSpec", this.ExecutorCuSpec);
        this.setParamSimple(map, prefix + "MinExecutorNums", this.MinExecutorNums);
        this.setParamSimple(map, prefix + "MaxExecutorNums", this.MaxExecutorNums);
        this.setParamSimple(map, prefix + "IsEffectiveNow", this.IsEffectiveNow);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "ImageType", this.ImageType);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageVersion", this.ImageVersion);
        this.setParamSimple(map, prefix + "FrameType", this.FrameType);
        this.setParamSimple(map, prefix + "PublicDomain", this.PublicDomain);
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "PythonCuSpec", this.PythonCuSpec);
        this.setParamSimple(map, prefix + "SparkSpecMode", this.SparkSpecMode);
        this.setParamSimple(map, prefix + "SparkSize", this.SparkSize);

    }
}

