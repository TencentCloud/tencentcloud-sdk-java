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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeContainerAssetSummaryResponse extends AbstractModel{

    /**
    * 容器总数
    */
    @SerializedName("ContainerTotalCnt")
    @Expose
    private Long ContainerTotalCnt;

    /**
    * 正在运行容器数量
    */
    @SerializedName("ContainerRunningCnt")
    @Expose
    private Long ContainerRunningCnt;

    /**
    * 暂停运行容器数量
    */
    @SerializedName("ContainerPauseCnt")
    @Expose
    private Long ContainerPauseCnt;

    /**
    * 停止运行容器数量
    */
    @SerializedName("ContainerStopped")
    @Expose
    private Long ContainerStopped;

    /**
    * 本地镜像数量
    */
    @SerializedName("ImageCnt")
    @Expose
    private Long ImageCnt;

    /**
    * 主机节点数量
    */
    @SerializedName("HostCnt")
    @Expose
    private Long HostCnt;

    /**
    * 主机正在运行节点数量
    */
    @SerializedName("HostRunningCnt")
    @Expose
    private Long HostRunningCnt;

    /**
    * 主机离线节点数量
    */
    @SerializedName("HostOfflineCnt")
    @Expose
    private Long HostOfflineCnt;

    /**
    * 镜像仓库数量
    */
    @SerializedName("ImageRegistryCnt")
    @Expose
    private Long ImageRegistryCnt;

    /**
    * 镜像总数
    */
    @SerializedName("ImageTotalCnt")
    @Expose
    private Long ImageTotalCnt;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 容器总数 
     * @return ContainerTotalCnt 容器总数
     */
    public Long getContainerTotalCnt() {
        return this.ContainerTotalCnt;
    }

    /**
     * Set 容器总数
     * @param ContainerTotalCnt 容器总数
     */
    public void setContainerTotalCnt(Long ContainerTotalCnt) {
        this.ContainerTotalCnt = ContainerTotalCnt;
    }

    /**
     * Get 正在运行容器数量 
     * @return ContainerRunningCnt 正在运行容器数量
     */
    public Long getContainerRunningCnt() {
        return this.ContainerRunningCnt;
    }

    /**
     * Set 正在运行容器数量
     * @param ContainerRunningCnt 正在运行容器数量
     */
    public void setContainerRunningCnt(Long ContainerRunningCnt) {
        this.ContainerRunningCnt = ContainerRunningCnt;
    }

    /**
     * Get 暂停运行容器数量 
     * @return ContainerPauseCnt 暂停运行容器数量
     */
    public Long getContainerPauseCnt() {
        return this.ContainerPauseCnt;
    }

    /**
     * Set 暂停运行容器数量
     * @param ContainerPauseCnt 暂停运行容器数量
     */
    public void setContainerPauseCnt(Long ContainerPauseCnt) {
        this.ContainerPauseCnt = ContainerPauseCnt;
    }

    /**
     * Get 停止运行容器数量 
     * @return ContainerStopped 停止运行容器数量
     */
    public Long getContainerStopped() {
        return this.ContainerStopped;
    }

    /**
     * Set 停止运行容器数量
     * @param ContainerStopped 停止运行容器数量
     */
    public void setContainerStopped(Long ContainerStopped) {
        this.ContainerStopped = ContainerStopped;
    }

    /**
     * Get 本地镜像数量 
     * @return ImageCnt 本地镜像数量
     */
    public Long getImageCnt() {
        return this.ImageCnt;
    }

    /**
     * Set 本地镜像数量
     * @param ImageCnt 本地镜像数量
     */
    public void setImageCnt(Long ImageCnt) {
        this.ImageCnt = ImageCnt;
    }

    /**
     * Get 主机节点数量 
     * @return HostCnt 主机节点数量
     */
    public Long getHostCnt() {
        return this.HostCnt;
    }

    /**
     * Set 主机节点数量
     * @param HostCnt 主机节点数量
     */
    public void setHostCnt(Long HostCnt) {
        this.HostCnt = HostCnt;
    }

    /**
     * Get 主机正在运行节点数量 
     * @return HostRunningCnt 主机正在运行节点数量
     */
    public Long getHostRunningCnt() {
        return this.HostRunningCnt;
    }

    /**
     * Set 主机正在运行节点数量
     * @param HostRunningCnt 主机正在运行节点数量
     */
    public void setHostRunningCnt(Long HostRunningCnt) {
        this.HostRunningCnt = HostRunningCnt;
    }

    /**
     * Get 主机离线节点数量 
     * @return HostOfflineCnt 主机离线节点数量
     */
    public Long getHostOfflineCnt() {
        return this.HostOfflineCnt;
    }

    /**
     * Set 主机离线节点数量
     * @param HostOfflineCnt 主机离线节点数量
     */
    public void setHostOfflineCnt(Long HostOfflineCnt) {
        this.HostOfflineCnt = HostOfflineCnt;
    }

    /**
     * Get 镜像仓库数量 
     * @return ImageRegistryCnt 镜像仓库数量
     */
    public Long getImageRegistryCnt() {
        return this.ImageRegistryCnt;
    }

    /**
     * Set 镜像仓库数量
     * @param ImageRegistryCnt 镜像仓库数量
     */
    public void setImageRegistryCnt(Long ImageRegistryCnt) {
        this.ImageRegistryCnt = ImageRegistryCnt;
    }

    /**
     * Get 镜像总数 
     * @return ImageTotalCnt 镜像总数
     */
    public Long getImageTotalCnt() {
        return this.ImageTotalCnt;
    }

    /**
     * Set 镜像总数
     * @param ImageTotalCnt 镜像总数
     */
    public void setImageTotalCnt(Long ImageTotalCnt) {
        this.ImageTotalCnt = ImageTotalCnt;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeContainerAssetSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeContainerAssetSummaryResponse(DescribeContainerAssetSummaryResponse source) {
        if (source.ContainerTotalCnt != null) {
            this.ContainerTotalCnt = new Long(source.ContainerTotalCnt);
        }
        if (source.ContainerRunningCnt != null) {
            this.ContainerRunningCnt = new Long(source.ContainerRunningCnt);
        }
        if (source.ContainerPauseCnt != null) {
            this.ContainerPauseCnt = new Long(source.ContainerPauseCnt);
        }
        if (source.ContainerStopped != null) {
            this.ContainerStopped = new Long(source.ContainerStopped);
        }
        if (source.ImageCnt != null) {
            this.ImageCnt = new Long(source.ImageCnt);
        }
        if (source.HostCnt != null) {
            this.HostCnt = new Long(source.HostCnt);
        }
        if (source.HostRunningCnt != null) {
            this.HostRunningCnt = new Long(source.HostRunningCnt);
        }
        if (source.HostOfflineCnt != null) {
            this.HostOfflineCnt = new Long(source.HostOfflineCnt);
        }
        if (source.ImageRegistryCnt != null) {
            this.ImageRegistryCnt = new Long(source.ImageRegistryCnt);
        }
        if (source.ImageTotalCnt != null) {
            this.ImageTotalCnt = new Long(source.ImageTotalCnt);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContainerTotalCnt", this.ContainerTotalCnt);
        this.setParamSimple(map, prefix + "ContainerRunningCnt", this.ContainerRunningCnt);
        this.setParamSimple(map, prefix + "ContainerPauseCnt", this.ContainerPauseCnt);
        this.setParamSimple(map, prefix + "ContainerStopped", this.ContainerStopped);
        this.setParamSimple(map, prefix + "ImageCnt", this.ImageCnt);
        this.setParamSimple(map, prefix + "HostCnt", this.HostCnt);
        this.setParamSimple(map, prefix + "HostRunningCnt", this.HostRunningCnt);
        this.setParamSimple(map, prefix + "HostOfflineCnt", this.HostOfflineCnt);
        this.setParamSimple(map, prefix + "ImageRegistryCnt", this.ImageRegistryCnt);
        this.setParamSimple(map, prefix + "ImageTotalCnt", this.ImageTotalCnt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

