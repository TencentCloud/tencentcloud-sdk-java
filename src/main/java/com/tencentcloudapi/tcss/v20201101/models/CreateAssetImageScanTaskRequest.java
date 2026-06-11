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

public class CreateAssetImageScanTaskRequest extends AbstractModel {

    /**
    * <p>是否扫描全部镜像；全部镜像，镜像列表和根据过滤条件筛选三选一。</p>
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * <p>需要扫描的镜像列表；全部镜像，镜像列表和根据过滤条件筛选三选一。</p>
    */
    @SerializedName("Images")
    @Expose
    private String [] Images;

    /**
    * <p>扫描漏洞；漏洞，木马和风险需选其一</p>
    */
    @SerializedName("ScanVul")
    @Expose
    private Boolean ScanVul;

    /**
    * <p>扫描木马；漏洞，木马和风险需选其一</p>
    */
    @SerializedName("ScanVirus")
    @Expose
    private Boolean ScanVirus;

    /**
    * <p>扫描风险；漏洞，木马和风险需选其一</p>
    */
    @SerializedName("ScanRisk")
    @Expose
    private Boolean ScanRisk;

    /**
    * <p>根据过滤条件筛选出镜像；全部镜像，镜像列表和根据过滤条件筛选三选一。</p>
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

    /**
    * <p>根据过滤条件筛选出镜像，再排除个别镜像</p>
    */
    @SerializedName("ExcludeImageIds")
    @Expose
    private String [] ExcludeImageIds;

    /**
    * <p>镜像是否存在运行中的容器</p>
    */
    @SerializedName("ContainerRunning")
    @Expose
    private Boolean ContainerRunning;

    /**
    * <p>扫描范围 0 全部授权镜像，1自选镜像，2 推荐扫描 3:集群扫描</p><p>取值范围：[0, 3]</p><p>默认值：0</p>
    */
    @SerializedName("ScanScope")
    @Expose
    private Long ScanScope;

    /**
    * <p>任务超时时长单位秒，默认1小时</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>一键扫描任务。默认false表示非一键扫描，true一键扫描</p>
    */
    @SerializedName("IsOneClickScanningTask")
    @Expose
    private Boolean IsOneClickScanningTask;

    /**
    * <p>集群id</p>
    */
    @SerializedName("ClusterIDs")
    @Expose
    private String [] ClusterIDs;

    /**
     * Get <p>是否扫描全部镜像；全部镜像，镜像列表和根据过滤条件筛选三选一。</p> 
     * @return All <p>是否扫描全部镜像；全部镜像，镜像列表和根据过滤条件筛选三选一。</p>
     * @deprecated
     */
    @Deprecated
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set <p>是否扫描全部镜像；全部镜像，镜像列表和根据过滤条件筛选三选一。</p>
     * @param All <p>是否扫描全部镜像；全部镜像，镜像列表和根据过滤条件筛选三选一。</p>
     * @deprecated
     */
    @Deprecated
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get <p>需要扫描的镜像列表；全部镜像，镜像列表和根据过滤条件筛选三选一。</p> 
     * @return Images <p>需要扫描的镜像列表；全部镜像，镜像列表和根据过滤条件筛选三选一。</p>
     */
    public String [] getImages() {
        return this.Images;
    }

    /**
     * Set <p>需要扫描的镜像列表；全部镜像，镜像列表和根据过滤条件筛选三选一。</p>
     * @param Images <p>需要扫描的镜像列表；全部镜像，镜像列表和根据过滤条件筛选三选一。</p>
     */
    public void setImages(String [] Images) {
        this.Images = Images;
    }

    /**
     * Get <p>扫描漏洞；漏洞，木马和风险需选其一</p> 
     * @return ScanVul <p>扫描漏洞；漏洞，木马和风险需选其一</p>
     */
    public Boolean getScanVul() {
        return this.ScanVul;
    }

    /**
     * Set <p>扫描漏洞；漏洞，木马和风险需选其一</p>
     * @param ScanVul <p>扫描漏洞；漏洞，木马和风险需选其一</p>
     */
    public void setScanVul(Boolean ScanVul) {
        this.ScanVul = ScanVul;
    }

    /**
     * Get <p>扫描木马；漏洞，木马和风险需选其一</p> 
     * @return ScanVirus <p>扫描木马；漏洞，木马和风险需选其一</p>
     */
    public Boolean getScanVirus() {
        return this.ScanVirus;
    }

    /**
     * Set <p>扫描木马；漏洞，木马和风险需选其一</p>
     * @param ScanVirus <p>扫描木马；漏洞，木马和风险需选其一</p>
     */
    public void setScanVirus(Boolean ScanVirus) {
        this.ScanVirus = ScanVirus;
    }

    /**
     * Get <p>扫描风险；漏洞，木马和风险需选其一</p> 
     * @return ScanRisk <p>扫描风险；漏洞，木马和风险需选其一</p>
     */
    public Boolean getScanRisk() {
        return this.ScanRisk;
    }

    /**
     * Set <p>扫描风险；漏洞，木马和风险需选其一</p>
     * @param ScanRisk <p>扫描风险；漏洞，木马和风险需选其一</p>
     */
    public void setScanRisk(Boolean ScanRisk) {
        this.ScanRisk = ScanRisk;
    }

    /**
     * Get <p>根据过滤条件筛选出镜像；全部镜像，镜像列表和根据过滤条件筛选三选一。</p> 
     * @return Filters <p>根据过滤条件筛选出镜像；全部镜像，镜像列表和根据过滤条件筛选三选一。</p>
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>根据过滤条件筛选出镜像；全部镜像，镜像列表和根据过滤条件筛选三选一。</p>
     * @param Filters <p>根据过滤条件筛选出镜像；全部镜像，镜像列表和根据过滤条件筛选三选一。</p>
     */
    public void setFilters(AssetFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>根据过滤条件筛选出镜像，再排除个别镜像</p> 
     * @return ExcludeImageIds <p>根据过滤条件筛选出镜像，再排除个别镜像</p>
     */
    public String [] getExcludeImageIds() {
        return this.ExcludeImageIds;
    }

    /**
     * Set <p>根据过滤条件筛选出镜像，再排除个别镜像</p>
     * @param ExcludeImageIds <p>根据过滤条件筛选出镜像，再排除个别镜像</p>
     */
    public void setExcludeImageIds(String [] ExcludeImageIds) {
        this.ExcludeImageIds = ExcludeImageIds;
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
     * Get <p>扫描范围 0 全部授权镜像，1自选镜像，2 推荐扫描 3:集群扫描</p><p>取值范围：[0, 3]</p><p>默认值：0</p> 
     * @return ScanScope <p>扫描范围 0 全部授权镜像，1自选镜像，2 推荐扫描 3:集群扫描</p><p>取值范围：[0, 3]</p><p>默认值：0</p>
     */
    public Long getScanScope() {
        return this.ScanScope;
    }

    /**
     * Set <p>扫描范围 0 全部授权镜像，1自选镜像，2 推荐扫描 3:集群扫描</p><p>取值范围：[0, 3]</p><p>默认值：0</p>
     * @param ScanScope <p>扫描范围 0 全部授权镜像，1自选镜像，2 推荐扫描 3:集群扫描</p><p>取值范围：[0, 3]</p><p>默认值：0</p>
     */
    public void setScanScope(Long ScanScope) {
        this.ScanScope = ScanScope;
    }

    /**
     * Get <p>任务超时时长单位秒，默认1小时</p> 
     * @return Timeout <p>任务超时时长单位秒，默认1小时</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>任务超时时长单位秒，默认1小时</p>
     * @param Timeout <p>任务超时时长单位秒，默认1小时</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>一键扫描任务。默认false表示非一键扫描，true一键扫描</p> 
     * @return IsOneClickScanningTask <p>一键扫描任务。默认false表示非一键扫描，true一键扫描</p>
     */
    public Boolean getIsOneClickScanningTask() {
        return this.IsOneClickScanningTask;
    }

    /**
     * Set <p>一键扫描任务。默认false表示非一键扫描，true一键扫描</p>
     * @param IsOneClickScanningTask <p>一键扫描任务。默认false表示非一键扫描，true一键扫描</p>
     */
    public void setIsOneClickScanningTask(Boolean IsOneClickScanningTask) {
        this.IsOneClickScanningTask = IsOneClickScanningTask;
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

    public CreateAssetImageScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAssetImageScanTaskRequest(CreateAssetImageScanTaskRequest source) {
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
        if (source.Images != null) {
            this.Images = new String[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new String(source.Images[i]);
            }
        }
        if (source.ScanVul != null) {
            this.ScanVul = new Boolean(source.ScanVul);
        }
        if (source.ScanVirus != null) {
            this.ScanVirus = new Boolean(source.ScanVirus);
        }
        if (source.ScanRisk != null) {
            this.ScanRisk = new Boolean(source.ScanRisk);
        }
        if (source.Filters != null) {
            this.Filters = new AssetFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AssetFilters(source.Filters[i]);
            }
        }
        if (source.ExcludeImageIds != null) {
            this.ExcludeImageIds = new String[source.ExcludeImageIds.length];
            for (int i = 0; i < source.ExcludeImageIds.length; i++) {
                this.ExcludeImageIds[i] = new String(source.ExcludeImageIds[i]);
            }
        }
        if (source.ContainerRunning != null) {
            this.ContainerRunning = new Boolean(source.ContainerRunning);
        }
        if (source.ScanScope != null) {
            this.ScanScope = new Long(source.ScanScope);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.IsOneClickScanningTask != null) {
            this.IsOneClickScanningTask = new Boolean(source.IsOneClickScanningTask);
        }
        if (source.ClusterIDs != null) {
            this.ClusterIDs = new String[source.ClusterIDs.length];
            for (int i = 0; i < source.ClusterIDs.length; i++) {
                this.ClusterIDs[i] = new String(source.ClusterIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "All", this.All);
        this.setParamArraySimple(map, prefix + "Images.", this.Images);
        this.setParamSimple(map, prefix + "ScanVul", this.ScanVul);
        this.setParamSimple(map, prefix + "ScanVirus", this.ScanVirus);
        this.setParamSimple(map, prefix + "ScanRisk", this.ScanRisk);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "ExcludeImageIds.", this.ExcludeImageIds);
        this.setParamSimple(map, prefix + "ContainerRunning", this.ContainerRunning);
        this.setParamSimple(map, prefix + "ScanScope", this.ScanScope);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "IsOneClickScanningTask", this.IsOneClickScanningTask);
        this.setParamArraySimple(map, prefix + "ClusterIDs.", this.ClusterIDs);

    }
}

