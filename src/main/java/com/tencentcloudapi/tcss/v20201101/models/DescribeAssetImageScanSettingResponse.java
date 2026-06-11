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

public class DescribeAssetImageScanSettingResponse extends AbstractModel {

    /**
    * <p>开关</p>
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * <p>扫描时刻(完整时间;后端按0时区解析时分秒)</p>
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
    * <p>扫描间隔</p>
    */
    @SerializedName("ScanPeriod")
    @Expose
    private Long ScanPeriod;

    /**
    * <p>扫描木马</p>
    */
    @SerializedName("ScanVirus")
    @Expose
    private Boolean ScanVirus;

    /**
    * <p>扫描敏感信息</p>
    */
    @SerializedName("ScanRisk")
    @Expose
    private Boolean ScanRisk;

    /**
    * <p>扫描漏洞</p>
    */
    @SerializedName("ScanVul")
    @Expose
    private Boolean ScanVul;

    /**
    * <p>扫描全部镜像</p>
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * <p>自定义扫描镜像</p>
    */
    @SerializedName("Images")
    @Expose
    private String [] Images;

    /**
    * <p>镜像是否存在运行中的容器</p>
    */
    @SerializedName("ContainerRunning")
    @Expose
    private Boolean ContainerRunning;

    /**
    * <p>扫描范围 0 全部授权镜像，1自选镜像，2 推荐扫描 3:集群筛选扫描</p>
    */
    @SerializedName("ScanScope")
    @Expose
    private Long ScanScope;

    /**
    * <p>扫描结束时间 02:00 时分</p>
    */
    @SerializedName("ScanEndTime")
    @Expose
    private String ScanEndTime;

    /**
    * <p>排除的扫描镜像</p>
    */
    @SerializedName("ExcludeImages")
    @Expose
    private String [] ExcludeImages;

    /**
    * <p>最后一次扫描时间</p>
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
    * <p>扫描结果(Success|InsufficientLicense|ImageNeedIsEmpty|InternalError)</p>
    */
    @SerializedName("ScanResult")
    @Expose
    private String ScanResult;

    /**
    * <p>集群id</p>
    */
    @SerializedName("ClusterIDs")
    @Expose
    private String [] ClusterIDs;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>开关</p> 
     * @return Enable <p>开关</p>
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>开关</p>
     * @param Enable <p>开关</p>
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>扫描时刻(完整时间;后端按0时区解析时分秒)</p> 
     * @return ScanTime <p>扫描时刻(完整时间;后端按0时区解析时分秒)</p>
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set <p>扫描时刻(完整时间;后端按0时区解析时分秒)</p>
     * @param ScanTime <p>扫描时刻(完整时间;后端按0时区解析时分秒)</p>
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    /**
     * Get <p>扫描间隔</p> 
     * @return ScanPeriod <p>扫描间隔</p>
     */
    public Long getScanPeriod() {
        return this.ScanPeriod;
    }

    /**
     * Set <p>扫描间隔</p>
     * @param ScanPeriod <p>扫描间隔</p>
     */
    public void setScanPeriod(Long ScanPeriod) {
        this.ScanPeriod = ScanPeriod;
    }

    /**
     * Get <p>扫描木马</p> 
     * @return ScanVirus <p>扫描木马</p>
     */
    public Boolean getScanVirus() {
        return this.ScanVirus;
    }

    /**
     * Set <p>扫描木马</p>
     * @param ScanVirus <p>扫描木马</p>
     */
    public void setScanVirus(Boolean ScanVirus) {
        this.ScanVirus = ScanVirus;
    }

    /**
     * Get <p>扫描敏感信息</p> 
     * @return ScanRisk <p>扫描敏感信息</p>
     */
    public Boolean getScanRisk() {
        return this.ScanRisk;
    }

    /**
     * Set <p>扫描敏感信息</p>
     * @param ScanRisk <p>扫描敏感信息</p>
     */
    public void setScanRisk(Boolean ScanRisk) {
        this.ScanRisk = ScanRisk;
    }

    /**
     * Get <p>扫描漏洞</p> 
     * @return ScanVul <p>扫描漏洞</p>
     */
    public Boolean getScanVul() {
        return this.ScanVul;
    }

    /**
     * Set <p>扫描漏洞</p>
     * @param ScanVul <p>扫描漏洞</p>
     */
    public void setScanVul(Boolean ScanVul) {
        this.ScanVul = ScanVul;
    }

    /**
     * Get <p>扫描全部镜像</p> 
     * @return All <p>扫描全部镜像</p>
     * @deprecated
     */
    @Deprecated
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set <p>扫描全部镜像</p>
     * @param All <p>扫描全部镜像</p>
     * @deprecated
     */
    @Deprecated
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get <p>自定义扫描镜像</p> 
     * @return Images <p>自定义扫描镜像</p>
     */
    public String [] getImages() {
        return this.Images;
    }

    /**
     * Set <p>自定义扫描镜像</p>
     * @param Images <p>自定义扫描镜像</p>
     */
    public void setImages(String [] Images) {
        this.Images = Images;
    }

    /**
     * Get <p>镜像是否存在运行中的容器</p> 
     * @return ContainerRunning <p>镜像是否存在运行中的容器</p>
     */
    public Boolean getContainerRunning() {
        return this.ContainerRunning;
    }

    /**
     * Set <p>镜像是否存在运行中的容器</p>
     * @param ContainerRunning <p>镜像是否存在运行中的容器</p>
     */
    public void setContainerRunning(Boolean ContainerRunning) {
        this.ContainerRunning = ContainerRunning;
    }

    /**
     * Get <p>扫描范围 0 全部授权镜像，1自选镜像，2 推荐扫描 3:集群筛选扫描</p> 
     * @return ScanScope <p>扫描范围 0 全部授权镜像，1自选镜像，2 推荐扫描 3:集群筛选扫描</p>
     */
    public Long getScanScope() {
        return this.ScanScope;
    }

    /**
     * Set <p>扫描范围 0 全部授权镜像，1自选镜像，2 推荐扫描 3:集群筛选扫描</p>
     * @param ScanScope <p>扫描范围 0 全部授权镜像，1自选镜像，2 推荐扫描 3:集群筛选扫描</p>
     */
    public void setScanScope(Long ScanScope) {
        this.ScanScope = ScanScope;
    }

    /**
     * Get <p>扫描结束时间 02:00 时分</p> 
     * @return ScanEndTime <p>扫描结束时间 02:00 时分</p>
     */
    public String getScanEndTime() {
        return this.ScanEndTime;
    }

    /**
     * Set <p>扫描结束时间 02:00 时分</p>
     * @param ScanEndTime <p>扫描结束时间 02:00 时分</p>
     */
    public void setScanEndTime(String ScanEndTime) {
        this.ScanEndTime = ScanEndTime;
    }

    /**
     * Get <p>排除的扫描镜像</p> 
     * @return ExcludeImages <p>排除的扫描镜像</p>
     */
    public String [] getExcludeImages() {
        return this.ExcludeImages;
    }

    /**
     * Set <p>排除的扫描镜像</p>
     * @param ExcludeImages <p>排除的扫描镜像</p>
     */
    public void setExcludeImages(String [] ExcludeImages) {
        this.ExcludeImages = ExcludeImages;
    }

    /**
     * Get <p>最后一次扫描时间</p> 
     * @return LastScanTime <p>最后一次扫描时间</p>
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set <p>最后一次扫描时间</p>
     * @param LastScanTime <p>最后一次扫描时间</p>
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * Get <p>扫描结果(Success|InsufficientLicense|ImageNeedIsEmpty|InternalError)</p> 
     * @return ScanResult <p>扫描结果(Success|InsufficientLicense|ImageNeedIsEmpty|InternalError)</p>
     */
    public String getScanResult() {
        return this.ScanResult;
    }

    /**
     * Set <p>扫描结果(Success|InsufficientLicense|ImageNeedIsEmpty|InternalError)</p>
     * @param ScanResult <p>扫描结果(Success|InsufficientLicense|ImageNeedIsEmpty|InternalError)</p>
     */
    public void setScanResult(String ScanResult) {
        this.ScanResult = ScanResult;
    }

    /**
     * Get <p>集群id</p> 
     * @return ClusterIDs <p>集群id</p>
     */
    public String [] getClusterIDs() {
        return this.ClusterIDs;
    }

    /**
     * Set <p>集群id</p>
     * @param ClusterIDs <p>集群id</p>
     */
    public void setClusterIDs(String [] ClusterIDs) {
        this.ClusterIDs = ClusterIDs;
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

    public DescribeAssetImageScanSettingResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetImageScanSettingResponse(DescribeAssetImageScanSettingResponse source) {
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.ScanTime != null) {
            this.ScanTime = new String(source.ScanTime);
        }
        if (source.ScanPeriod != null) {
            this.ScanPeriod = new Long(source.ScanPeriod);
        }
        if (source.ScanVirus != null) {
            this.ScanVirus = new Boolean(source.ScanVirus);
        }
        if (source.ScanRisk != null) {
            this.ScanRisk = new Boolean(source.ScanRisk);
        }
        if (source.ScanVul != null) {
            this.ScanVul = new Boolean(source.ScanVul);
        }
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
        if (source.Images != null) {
            this.Images = new String[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new String(source.Images[i]);
            }
        }
        if (source.ContainerRunning != null) {
            this.ContainerRunning = new Boolean(source.ContainerRunning);
        }
        if (source.ScanScope != null) {
            this.ScanScope = new Long(source.ScanScope);
        }
        if (source.ScanEndTime != null) {
            this.ScanEndTime = new String(source.ScanEndTime);
        }
        if (source.ExcludeImages != null) {
            this.ExcludeImages = new String[source.ExcludeImages.length];
            for (int i = 0; i < source.ExcludeImages.length; i++) {
                this.ExcludeImages[i] = new String(source.ExcludeImages[i]);
            }
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new String(source.LastScanTime);
        }
        if (source.ScanResult != null) {
            this.ScanResult = new String(source.ScanResult);
        }
        if (source.ClusterIDs != null) {
            this.ClusterIDs = new String[source.ClusterIDs.length];
            for (int i = 0; i < source.ClusterIDs.length; i++) {
                this.ClusterIDs[i] = new String(source.ClusterIDs[i]);
            }
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
        this.setParamSimple(map, prefix + "ScanVirus", this.ScanVirus);
        this.setParamSimple(map, prefix + "ScanRisk", this.ScanRisk);
        this.setParamSimple(map, prefix + "ScanVul", this.ScanVul);
        this.setParamSimple(map, prefix + "All", this.All);
        this.setParamArraySimple(map, prefix + "Images.", this.Images);
        this.setParamSimple(map, prefix + "ContainerRunning", this.ContainerRunning);
        this.setParamSimple(map, prefix + "ScanScope", this.ScanScope);
        this.setParamSimple(map, prefix + "ScanEndTime", this.ScanEndTime);
        this.setParamArraySimple(map, prefix + "ExcludeImages.", this.ExcludeImages);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "ScanResult", this.ScanResult);
        this.setParamArraySimple(map, prefix + "ClusterIDs.", this.ClusterIDs);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

