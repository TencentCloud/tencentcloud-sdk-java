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

public class CreateVulScanTaskRequest extends AbstractModel {

    /**
    * <p>本地镜像扫描范围类型</p><p>枚举值：</p><ul><li>ALL： 全部本地镜像</li><li>NOT_SCAN： 全部已授权未扫描本地镜像</li><li>IMAGEIDS： 自选本地镜像ID</li><li>CLUSTER： 集群筛选</li></ul>
    */
    @SerializedName("LocalImageScanType")
    @Expose
    private String LocalImageScanType;

    /**
    * <p>根据已授权的本地镜像IDs扫描，优先权高于根据满足条件的已授权的本地镜像。</p>
    */
    @SerializedName("LocalImageIDs")
    @Expose
    private String [] LocalImageIDs;

    /**
    * <p>仓库镜像扫描范围类型。ALL:全部仓库镜像，NOT_SCAN：全部已授权未扫描仓库镜像，IMAGEIDS:自选仓库镜像ID</p>
    */
    @SerializedName("RegistryImageScanType")
    @Expose
    private String RegistryImageScanType;

    /**
    * <p>根据已授权的仓库镜像IDs扫描，优先权高于根据满足条件的已授权的仓库镜像。</p>
    */
    @SerializedName("RegistryImageIDs")
    @Expose
    private Long [] RegistryImageIDs;

    /**
    * <p>本地镜像重新漏洞扫描时的任务ID</p>
    */
    @SerializedName("LocalTaskID")
    @Expose
    private Long LocalTaskID;

    /**
    * <p>仓库镜像重新漏洞扫描时的任务ID</p>
    */
    @SerializedName("RegistryTaskID")
    @Expose
    private Long RegistryTaskID;

    /**
    * <p>本地镜像容器运行中</p>
    */
    @SerializedName("LocalImageContainerRunning")
    @Expose
    private Boolean LocalImageContainerRunning;

    /**
    * <p>仓库镜像容器运行中</p>
    */
    @SerializedName("RegistryImageContainerRunning")
    @Expose
    private Boolean RegistryImageContainerRunning;

    /**
    * <p>仓库镜像是否是最新</p>
    */
    @SerializedName("IsLatest")
    @Expose
    private Boolean IsLatest;

    /**
    * <p>要剔除的本地镜像id</p>
    */
    @SerializedName("ExcludeLocalImageIDs")
    @Expose
    private String [] ExcludeLocalImageIDs;

    /**
    * <p>要剔除的仓库镜像id</p>
    */
    @SerializedName("ExcludeRegistryImageIDs")
    @Expose
    private Long [] ExcludeRegistryImageIDs;

    /**
    * <p>集群id</p>
    */
    @SerializedName("LocalClusterIDs")
    @Expose
    private String [] LocalClusterIDs;

    /**
     * Get <p>本地镜像扫描范围类型</p><p>枚举值：</p><ul><li>ALL： 全部本地镜像</li><li>NOT_SCAN： 全部已授权未扫描本地镜像</li><li>IMAGEIDS： 自选本地镜像ID</li><li>CLUSTER： 集群筛选</li></ul> 
     * @return LocalImageScanType <p>本地镜像扫描范围类型</p><p>枚举值：</p><ul><li>ALL： 全部本地镜像</li><li>NOT_SCAN： 全部已授权未扫描本地镜像</li><li>IMAGEIDS： 自选本地镜像ID</li><li>CLUSTER： 集群筛选</li></ul>
     */
    public String getLocalImageScanType() {
        return this.LocalImageScanType;
    }

    /**
     * Set <p>本地镜像扫描范围类型</p><p>枚举值：</p><ul><li>ALL： 全部本地镜像</li><li>NOT_SCAN： 全部已授权未扫描本地镜像</li><li>IMAGEIDS： 自选本地镜像ID</li><li>CLUSTER： 集群筛选</li></ul>
     * @param LocalImageScanType <p>本地镜像扫描范围类型</p><p>枚举值：</p><ul><li>ALL： 全部本地镜像</li><li>NOT_SCAN： 全部已授权未扫描本地镜像</li><li>IMAGEIDS： 自选本地镜像ID</li><li>CLUSTER： 集群筛选</li></ul>
     */
    public void setLocalImageScanType(String LocalImageScanType) {
        this.LocalImageScanType = LocalImageScanType;
    }

    /**
     * Get <p>根据已授权的本地镜像IDs扫描，优先权高于根据满足条件的已授权的本地镜像。</p> 
     * @return LocalImageIDs <p>根据已授权的本地镜像IDs扫描，优先权高于根据满足条件的已授权的本地镜像。</p>
     */
    public String [] getLocalImageIDs() {
        return this.LocalImageIDs;
    }

    /**
     * Set <p>根据已授权的本地镜像IDs扫描，优先权高于根据满足条件的已授权的本地镜像。</p>
     * @param LocalImageIDs <p>根据已授权的本地镜像IDs扫描，优先权高于根据满足条件的已授权的本地镜像。</p>
     */
    public void setLocalImageIDs(String [] LocalImageIDs) {
        this.LocalImageIDs = LocalImageIDs;
    }

    /**
     * Get <p>仓库镜像扫描范围类型。ALL:全部仓库镜像，NOT_SCAN：全部已授权未扫描仓库镜像，IMAGEIDS:自选仓库镜像ID</p> 
     * @return RegistryImageScanType <p>仓库镜像扫描范围类型。ALL:全部仓库镜像，NOT_SCAN：全部已授权未扫描仓库镜像，IMAGEIDS:自选仓库镜像ID</p>
     */
    public String getRegistryImageScanType() {
        return this.RegistryImageScanType;
    }

    /**
     * Set <p>仓库镜像扫描范围类型。ALL:全部仓库镜像，NOT_SCAN：全部已授权未扫描仓库镜像，IMAGEIDS:自选仓库镜像ID</p>
     * @param RegistryImageScanType <p>仓库镜像扫描范围类型。ALL:全部仓库镜像，NOT_SCAN：全部已授权未扫描仓库镜像，IMAGEIDS:自选仓库镜像ID</p>
     */
    public void setRegistryImageScanType(String RegistryImageScanType) {
        this.RegistryImageScanType = RegistryImageScanType;
    }

    /**
     * Get <p>根据已授权的仓库镜像IDs扫描，优先权高于根据满足条件的已授权的仓库镜像。</p> 
     * @return RegistryImageIDs <p>根据已授权的仓库镜像IDs扫描，优先权高于根据满足条件的已授权的仓库镜像。</p>
     */
    public Long [] getRegistryImageIDs() {
        return this.RegistryImageIDs;
    }

    /**
     * Set <p>根据已授权的仓库镜像IDs扫描，优先权高于根据满足条件的已授权的仓库镜像。</p>
     * @param RegistryImageIDs <p>根据已授权的仓库镜像IDs扫描，优先权高于根据满足条件的已授权的仓库镜像。</p>
     */
    public void setRegistryImageIDs(Long [] RegistryImageIDs) {
        this.RegistryImageIDs = RegistryImageIDs;
    }

    /**
     * Get <p>本地镜像重新漏洞扫描时的任务ID</p> 
     * @return LocalTaskID <p>本地镜像重新漏洞扫描时的任务ID</p>
     */
    public Long getLocalTaskID() {
        return this.LocalTaskID;
    }

    /**
     * Set <p>本地镜像重新漏洞扫描时的任务ID</p>
     * @param LocalTaskID <p>本地镜像重新漏洞扫描时的任务ID</p>
     */
    public void setLocalTaskID(Long LocalTaskID) {
        this.LocalTaskID = LocalTaskID;
    }

    /**
     * Get <p>仓库镜像重新漏洞扫描时的任务ID</p> 
     * @return RegistryTaskID <p>仓库镜像重新漏洞扫描时的任务ID</p>
     */
    public Long getRegistryTaskID() {
        return this.RegistryTaskID;
    }

    /**
     * Set <p>仓库镜像重新漏洞扫描时的任务ID</p>
     * @param RegistryTaskID <p>仓库镜像重新漏洞扫描时的任务ID</p>
     */
    public void setRegistryTaskID(Long RegistryTaskID) {
        this.RegistryTaskID = RegistryTaskID;
    }

    /**
     * Get <p>本地镜像容器运行中</p> 
     * @return LocalImageContainerRunning <p>本地镜像容器运行中</p>
     */
    public Boolean getLocalImageContainerRunning() {
        return this.LocalImageContainerRunning;
    }

    /**
     * Set <p>本地镜像容器运行中</p>
     * @param LocalImageContainerRunning <p>本地镜像容器运行中</p>
     */
    public void setLocalImageContainerRunning(Boolean LocalImageContainerRunning) {
        this.LocalImageContainerRunning = LocalImageContainerRunning;
    }

    /**
     * Get <p>仓库镜像容器运行中</p> 
     * @return RegistryImageContainerRunning <p>仓库镜像容器运行中</p>
     */
    public Boolean getRegistryImageContainerRunning() {
        return this.RegistryImageContainerRunning;
    }

    /**
     * Set <p>仓库镜像容器运行中</p>
     * @param RegistryImageContainerRunning <p>仓库镜像容器运行中</p>
     */
    public void setRegistryImageContainerRunning(Boolean RegistryImageContainerRunning) {
        this.RegistryImageContainerRunning = RegistryImageContainerRunning;
    }

    /**
     * Get <p>仓库镜像是否是最新</p> 
     * @return IsLatest <p>仓库镜像是否是最新</p>
     */
    public Boolean getIsLatest() {
        return this.IsLatest;
    }

    /**
     * Set <p>仓库镜像是否是最新</p>
     * @param IsLatest <p>仓库镜像是否是最新</p>
     */
    public void setIsLatest(Boolean IsLatest) {
        this.IsLatest = IsLatest;
    }

    /**
     * Get <p>要剔除的本地镜像id</p> 
     * @return ExcludeLocalImageIDs <p>要剔除的本地镜像id</p>
     */
    public String [] getExcludeLocalImageIDs() {
        return this.ExcludeLocalImageIDs;
    }

    /**
     * Set <p>要剔除的本地镜像id</p>
     * @param ExcludeLocalImageIDs <p>要剔除的本地镜像id</p>
     */
    public void setExcludeLocalImageIDs(String [] ExcludeLocalImageIDs) {
        this.ExcludeLocalImageIDs = ExcludeLocalImageIDs;
    }

    /**
     * Get <p>要剔除的仓库镜像id</p> 
     * @return ExcludeRegistryImageIDs <p>要剔除的仓库镜像id</p>
     */
    public Long [] getExcludeRegistryImageIDs() {
        return this.ExcludeRegistryImageIDs;
    }

    /**
     * Set <p>要剔除的仓库镜像id</p>
     * @param ExcludeRegistryImageIDs <p>要剔除的仓库镜像id</p>
     */
    public void setExcludeRegistryImageIDs(Long [] ExcludeRegistryImageIDs) {
        this.ExcludeRegistryImageIDs = ExcludeRegistryImageIDs;
    }

    /**
     * Get <p>集群id</p> 
     * @return LocalClusterIDs <p>集群id</p>
     */
    public String [] getLocalClusterIDs() {
        return this.LocalClusterIDs;
    }

    /**
     * Set <p>集群id</p>
     * @param LocalClusterIDs <p>集群id</p>
     */
    public void setLocalClusterIDs(String [] LocalClusterIDs) {
        this.LocalClusterIDs = LocalClusterIDs;
    }

    public CreateVulScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVulScanTaskRequest(CreateVulScanTaskRequest source) {
        if (source.LocalImageScanType != null) {
            this.LocalImageScanType = new String(source.LocalImageScanType);
        }
        if (source.LocalImageIDs != null) {
            this.LocalImageIDs = new String[source.LocalImageIDs.length];
            for (int i = 0; i < source.LocalImageIDs.length; i++) {
                this.LocalImageIDs[i] = new String(source.LocalImageIDs[i]);
            }
        }
        if (source.RegistryImageScanType != null) {
            this.RegistryImageScanType = new String(source.RegistryImageScanType);
        }
        if (source.RegistryImageIDs != null) {
            this.RegistryImageIDs = new Long[source.RegistryImageIDs.length];
            for (int i = 0; i < source.RegistryImageIDs.length; i++) {
                this.RegistryImageIDs[i] = new Long(source.RegistryImageIDs[i]);
            }
        }
        if (source.LocalTaskID != null) {
            this.LocalTaskID = new Long(source.LocalTaskID);
        }
        if (source.RegistryTaskID != null) {
            this.RegistryTaskID = new Long(source.RegistryTaskID);
        }
        if (source.LocalImageContainerRunning != null) {
            this.LocalImageContainerRunning = new Boolean(source.LocalImageContainerRunning);
        }
        if (source.RegistryImageContainerRunning != null) {
            this.RegistryImageContainerRunning = new Boolean(source.RegistryImageContainerRunning);
        }
        if (source.IsLatest != null) {
            this.IsLatest = new Boolean(source.IsLatest);
        }
        if (source.ExcludeLocalImageIDs != null) {
            this.ExcludeLocalImageIDs = new String[source.ExcludeLocalImageIDs.length];
            for (int i = 0; i < source.ExcludeLocalImageIDs.length; i++) {
                this.ExcludeLocalImageIDs[i] = new String(source.ExcludeLocalImageIDs[i]);
            }
        }
        if (source.ExcludeRegistryImageIDs != null) {
            this.ExcludeRegistryImageIDs = new Long[source.ExcludeRegistryImageIDs.length];
            for (int i = 0; i < source.ExcludeRegistryImageIDs.length; i++) {
                this.ExcludeRegistryImageIDs[i] = new Long(source.ExcludeRegistryImageIDs[i]);
            }
        }
        if (source.LocalClusterIDs != null) {
            this.LocalClusterIDs = new String[source.LocalClusterIDs.length];
            for (int i = 0; i < source.LocalClusterIDs.length; i++) {
                this.LocalClusterIDs[i] = new String(source.LocalClusterIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocalImageScanType", this.LocalImageScanType);
        this.setParamArraySimple(map, prefix + "LocalImageIDs.", this.LocalImageIDs);
        this.setParamSimple(map, prefix + "RegistryImageScanType", this.RegistryImageScanType);
        this.setParamArraySimple(map, prefix + "RegistryImageIDs.", this.RegistryImageIDs);
        this.setParamSimple(map, prefix + "LocalTaskID", this.LocalTaskID);
        this.setParamSimple(map, prefix + "RegistryTaskID", this.RegistryTaskID);
        this.setParamSimple(map, prefix + "LocalImageContainerRunning", this.LocalImageContainerRunning);
        this.setParamSimple(map, prefix + "RegistryImageContainerRunning", this.RegistryImageContainerRunning);
        this.setParamSimple(map, prefix + "IsLatest", this.IsLatest);
        this.setParamArraySimple(map, prefix + "ExcludeLocalImageIDs.", this.ExcludeLocalImageIDs);
        this.setParamArraySimple(map, prefix + "ExcludeRegistryImageIDs.", this.ExcludeRegistryImageIDs);
        this.setParamArraySimple(map, prefix + "LocalClusterIDs.", this.LocalClusterIDs);

    }
}

