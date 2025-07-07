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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImageRegistryTimingScanTaskResponse extends AbstractModel {

    /**
    * 定时扫描开关
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * 定时任务扫描时间
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
    * 定时扫描间隔
    */
    @SerializedName("ScanPeriod")
    @Expose
    private Long ScanPeriod;

    /**
    * 扫描类型数组
    */
    @SerializedName("ScanType")
    @Expose
    private String [] ScanType;

    /**
    * 扫描全部镜像
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * 自定义扫描镜像
    */
    @SerializedName("Images")
    @Expose
    private ImageInfo [] Images;

    /**
    * 自动以扫描镜像Id
    */
    @SerializedName("Id")
    @Expose
    private Long [] Id;

    /**
    * 是否扫描最新版本镜像
    */
    @SerializedName("Latest")
    @Expose
    private Boolean Latest;

    /**
    * 扫描结束时间
    */
    @SerializedName("ScanEndTime")
    @Expose
    private String ScanEndTime;

    /**
    * 仓库类型 tcr,ccr,harbor	
    */
    @SerializedName("RegistryType")
    @Expose
    private String [] RegistryType;

    /**
    * 是否存在运行中的容器	
    */
    @SerializedName("ContainerRunning")
    @Expose
    private Boolean ContainerRunning;

    /**
    * 扫描范围 0全部镜像，1自选镜像，2推荐扫描镜像
    */
    @SerializedName("ScanScope")
    @Expose
    private Long ScanScope;

    /**
    * 命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String [] Namespace;

    /**
    * 排除的镜像资产id
    */
    @SerializedName("ExcludeImageAssetIds")
    @Expose
    private Long [] ExcludeImageAssetIds;

    /**
    * 最近扫描时间
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
    * 扫描结果(Success|InsufficientLicense|ImageNeedIsEmpty|InternalError)
    */
    @SerializedName("ScanResult")
    @Expose
    private String ScanResult;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 定时扫描开关 
     * @return Enable 定时扫描开关
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 定时扫描开关
     * @param Enable 定时扫描开关
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 定时任务扫描时间 
     * @return ScanTime 定时任务扫描时间
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set 定时任务扫描时间
     * @param ScanTime 定时任务扫描时间
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    /**
     * Get 定时扫描间隔 
     * @return ScanPeriod 定时扫描间隔
     */
    public Long getScanPeriod() {
        return this.ScanPeriod;
    }

    /**
     * Set 定时扫描间隔
     * @param ScanPeriod 定时扫描间隔
     */
    public void setScanPeriod(Long ScanPeriod) {
        this.ScanPeriod = ScanPeriod;
    }

    /**
     * Get 扫描类型数组 
     * @return ScanType 扫描类型数组
     */
    public String [] getScanType() {
        return this.ScanType;
    }

    /**
     * Set 扫描类型数组
     * @param ScanType 扫描类型数组
     */
    public void setScanType(String [] ScanType) {
        this.ScanType = ScanType;
    }

    /**
     * Get 扫描全部镜像 
     * @return All 扫描全部镜像
     * @deprecated
     */
    @Deprecated
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set 扫描全部镜像
     * @param All 扫描全部镜像
     * @deprecated
     */
    @Deprecated
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get 自定义扫描镜像 
     * @return Images 自定义扫描镜像
     */
    public ImageInfo [] getImages() {
        return this.Images;
    }

    /**
     * Set 自定义扫描镜像
     * @param Images 自定义扫描镜像
     */
    public void setImages(ImageInfo [] Images) {
        this.Images = Images;
    }

    /**
     * Get 自动以扫描镜像Id 
     * @return Id 自动以扫描镜像Id
     */
    public Long [] getId() {
        return this.Id;
    }

    /**
     * Set 自动以扫描镜像Id
     * @param Id 自动以扫描镜像Id
     */
    public void setId(Long [] Id) {
        this.Id = Id;
    }

    /**
     * Get 是否扫描最新版本镜像 
     * @return Latest 是否扫描最新版本镜像
     */
    public Boolean getLatest() {
        return this.Latest;
    }

    /**
     * Set 是否扫描最新版本镜像
     * @param Latest 是否扫描最新版本镜像
     */
    public void setLatest(Boolean Latest) {
        this.Latest = Latest;
    }

    /**
     * Get 扫描结束时间 
     * @return ScanEndTime 扫描结束时间
     */
    public String getScanEndTime() {
        return this.ScanEndTime;
    }

    /**
     * Set 扫描结束时间
     * @param ScanEndTime 扫描结束时间
     */
    public void setScanEndTime(String ScanEndTime) {
        this.ScanEndTime = ScanEndTime;
    }

    /**
     * Get 仓库类型 tcr,ccr,harbor	 
     * @return RegistryType 仓库类型 tcr,ccr,harbor	
     */
    public String [] getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set 仓库类型 tcr,ccr,harbor	
     * @param RegistryType 仓库类型 tcr,ccr,harbor	
     */
    public void setRegistryType(String [] RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get 是否存在运行中的容器	 
     * @return ContainerRunning 是否存在运行中的容器	
     */
    public Boolean getContainerRunning() {
        return this.ContainerRunning;
    }

    /**
     * Set 是否存在运行中的容器	
     * @param ContainerRunning 是否存在运行中的容器	
     */
    public void setContainerRunning(Boolean ContainerRunning) {
        this.ContainerRunning = ContainerRunning;
    }

    /**
     * Get 扫描范围 0全部镜像，1自选镜像，2推荐扫描镜像 
     * @return ScanScope 扫描范围 0全部镜像，1自选镜像，2推荐扫描镜像
     */
    public Long getScanScope() {
        return this.ScanScope;
    }

    /**
     * Set 扫描范围 0全部镜像，1自选镜像，2推荐扫描镜像
     * @param ScanScope 扫描范围 0全部镜像，1自选镜像，2推荐扫描镜像
     */
    public void setScanScope(Long ScanScope) {
        this.ScanScope = ScanScope;
    }

    /**
     * Get 命名空间 
     * @return Namespace 命名空间
     */
    public String [] getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
     * @param Namespace 命名空间
     */
    public void setNamespace(String [] Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 排除的镜像资产id 
     * @return ExcludeImageAssetIds 排除的镜像资产id
     */
    public Long [] getExcludeImageAssetIds() {
        return this.ExcludeImageAssetIds;
    }

    /**
     * Set 排除的镜像资产id
     * @param ExcludeImageAssetIds 排除的镜像资产id
     */
    public void setExcludeImageAssetIds(Long [] ExcludeImageAssetIds) {
        this.ExcludeImageAssetIds = ExcludeImageAssetIds;
    }

    /**
     * Get 最近扫描时间 
     * @return LastScanTime 最近扫描时间
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set 最近扫描时间
     * @param LastScanTime 最近扫描时间
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * Get 扫描结果(Success|InsufficientLicense|ImageNeedIsEmpty|InternalError) 
     * @return ScanResult 扫描结果(Success|InsufficientLicense|ImageNeedIsEmpty|InternalError)
     */
    public String getScanResult() {
        return this.ScanResult;
    }

    /**
     * Set 扫描结果(Success|InsufficientLicense|ImageNeedIsEmpty|InternalError)
     * @param ScanResult 扫描结果(Success|InsufficientLicense|ImageNeedIsEmpty|InternalError)
     */
    public void setScanResult(String ScanResult) {
        this.ScanResult = ScanResult;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeImageRegistryTimingScanTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageRegistryTimingScanTaskResponse(DescribeImageRegistryTimingScanTaskResponse source) {
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.ScanTime != null) {
            this.ScanTime = new String(source.ScanTime);
        }
        if (source.ScanPeriod != null) {
            this.ScanPeriod = new Long(source.ScanPeriod);
        }
        if (source.ScanType != null) {
            this.ScanType = new String[source.ScanType.length];
            for (int i = 0; i < source.ScanType.length; i++) {
                this.ScanType[i] = new String(source.ScanType[i]);
            }
        }
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
        if (source.Images != null) {
            this.Images = new ImageInfo[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new ImageInfo(source.Images[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new Long[source.Id.length];
            for (int i = 0; i < source.Id.length; i++) {
                this.Id[i] = new Long(source.Id[i]);
            }
        }
        if (source.Latest != null) {
            this.Latest = new Boolean(source.Latest);
        }
        if (source.ScanEndTime != null) {
            this.ScanEndTime = new String(source.ScanEndTime);
        }
        if (source.RegistryType != null) {
            this.RegistryType = new String[source.RegistryType.length];
            for (int i = 0; i < source.RegistryType.length; i++) {
                this.RegistryType[i] = new String(source.RegistryType[i]);
            }
        }
        if (source.ContainerRunning != null) {
            this.ContainerRunning = new Boolean(source.ContainerRunning);
        }
        if (source.ScanScope != null) {
            this.ScanScope = new Long(source.ScanScope);
        }
        if (source.Namespace != null) {
            this.Namespace = new String[source.Namespace.length];
            for (int i = 0; i < source.Namespace.length; i++) {
                this.Namespace[i] = new String(source.Namespace[i]);
            }
        }
        if (source.ExcludeImageAssetIds != null) {
            this.ExcludeImageAssetIds = new Long[source.ExcludeImageAssetIds.length];
            for (int i = 0; i < source.ExcludeImageAssetIds.length; i++) {
                this.ExcludeImageAssetIds[i] = new Long(source.ExcludeImageAssetIds[i]);
            }
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new String(source.LastScanTime);
        }
        if (source.ScanResult != null) {
            this.ScanResult = new String(source.ScanResult);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "ScanTime", this.ScanTime);
        this.setParamSimple(map, prefix + "ScanPeriod", this.ScanPeriod);
        this.setParamArraySimple(map, prefix + "ScanType.", this.ScanType);
        this.setParamSimple(map, prefix + "All", this.All);
        this.setParamArrayObj(map, prefix + "Images.", this.Images);
        this.setParamArraySimple(map, prefix + "Id.", this.Id);
        this.setParamSimple(map, prefix + "Latest", this.Latest);
        this.setParamSimple(map, prefix + "ScanEndTime", this.ScanEndTime);
        this.setParamArraySimple(map, prefix + "RegistryType.", this.RegistryType);
        this.setParamSimple(map, prefix + "ContainerRunning", this.ContainerRunning);
        this.setParamSimple(map, prefix + "ScanScope", this.ScanScope);
        this.setParamArraySimple(map, prefix + "Namespace.", this.Namespace);
        this.setParamArraySimple(map, prefix + "ExcludeImageAssetIds.", this.ExcludeImageAssetIds);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "ScanResult", this.ScanResult);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

