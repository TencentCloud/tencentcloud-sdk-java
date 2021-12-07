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

public class DescribeAssetSummaryResponse extends AbstractModel{

    /**
    * 应用个数
    */
    @SerializedName("AppCnt")
    @Expose
    private Long AppCnt;

    /**
    * 容器个数
    */
    @SerializedName("ContainerCnt")
    @Expose
    private Long ContainerCnt;

    /**
    * 暂停的容器个数
    */
    @SerializedName("ContainerPause")
    @Expose
    private Long ContainerPause;

    /**
    * 运行的容器个数
    */
    @SerializedName("ContainerRunning")
    @Expose
    private Long ContainerRunning;

    /**
    * 停止运行的容器个数
    */
    @SerializedName("ContainerStop")
    @Expose
    private Long ContainerStop;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 数据库个数
    */
    @SerializedName("DbCnt")
    @Expose
    private Long DbCnt;

    /**
    * 镜像个数
    */
    @SerializedName("ImageCnt")
    @Expose
    private Long ImageCnt;

    /**
    * 主机在线个数
    */
    @SerializedName("HostOnline")
    @Expose
    private Long HostOnline;

    /**
    * 主机个数
    */
    @SerializedName("HostCnt")
    @Expose
    private Long HostCnt;

    /**
    * 有风险的镜像个数
    */
    @SerializedName("ImageHasRiskInfoCnt")
    @Expose
    private Long ImageHasRiskInfoCnt;

    /**
    * 有病毒的镜像个数
    */
    @SerializedName("ImageHasVirusCnt")
    @Expose
    private Long ImageHasVirusCnt;

    /**
    * 有漏洞的镜像个数
    */
    @SerializedName("ImageHasVulsCnt")
    @Expose
    private Long ImageHasVulsCnt;

    /**
    * 不受信任的镜像个数
    */
    @SerializedName("ImageUntrustCnt")
    @Expose
    private Long ImageUntrustCnt;

    /**
    * 监听的端口个数
    */
    @SerializedName("ListenPortCnt")
    @Expose
    private Long ListenPortCnt;

    /**
    * 进程个数
    */
    @SerializedName("ProcessCnt")
    @Expose
    private Long ProcessCnt;

    /**
    * web服务个数
    */
    @SerializedName("WebServiceCnt")
    @Expose
    private Long WebServiceCnt;

    /**
    * 最近镜像扫描时间
    */
    @SerializedName("LatestImageScanTime")
    @Expose
    private String LatestImageScanTime;

    /**
    * 风险镜像个数
    */
    @SerializedName("ImageUnsafeCnt")
    @Expose
    private Long ImageUnsafeCnt;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 应用个数 
     * @return AppCnt 应用个数
     */
    public Long getAppCnt() {
        return this.AppCnt;
    }

    /**
     * Set 应用个数
     * @param AppCnt 应用个数
     */
    public void setAppCnt(Long AppCnt) {
        this.AppCnt = AppCnt;
    }

    /**
     * Get 容器个数 
     * @return ContainerCnt 容器个数
     */
    public Long getContainerCnt() {
        return this.ContainerCnt;
    }

    /**
     * Set 容器个数
     * @param ContainerCnt 容器个数
     */
    public void setContainerCnt(Long ContainerCnt) {
        this.ContainerCnt = ContainerCnt;
    }

    /**
     * Get 暂停的容器个数 
     * @return ContainerPause 暂停的容器个数
     */
    public Long getContainerPause() {
        return this.ContainerPause;
    }

    /**
     * Set 暂停的容器个数
     * @param ContainerPause 暂停的容器个数
     */
    public void setContainerPause(Long ContainerPause) {
        this.ContainerPause = ContainerPause;
    }

    /**
     * Get 运行的容器个数 
     * @return ContainerRunning 运行的容器个数
     */
    public Long getContainerRunning() {
        return this.ContainerRunning;
    }

    /**
     * Set 运行的容器个数
     * @param ContainerRunning 运行的容器个数
     */
    public void setContainerRunning(Long ContainerRunning) {
        this.ContainerRunning = ContainerRunning;
    }

    /**
     * Get 停止运行的容器个数 
     * @return ContainerStop 停止运行的容器个数
     */
    public Long getContainerStop() {
        return this.ContainerStop;
    }

    /**
     * Set 停止运行的容器个数
     * @param ContainerStop 停止运行的容器个数
     */
    public void setContainerStop(Long ContainerStop) {
        this.ContainerStop = ContainerStop;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 数据库个数 
     * @return DbCnt 数据库个数
     */
    public Long getDbCnt() {
        return this.DbCnt;
    }

    /**
     * Set 数据库个数
     * @param DbCnt 数据库个数
     */
    public void setDbCnt(Long DbCnt) {
        this.DbCnt = DbCnt;
    }

    /**
     * Get 镜像个数 
     * @return ImageCnt 镜像个数
     */
    public Long getImageCnt() {
        return this.ImageCnt;
    }

    /**
     * Set 镜像个数
     * @param ImageCnt 镜像个数
     */
    public void setImageCnt(Long ImageCnt) {
        this.ImageCnt = ImageCnt;
    }

    /**
     * Get 主机在线个数 
     * @return HostOnline 主机在线个数
     */
    public Long getHostOnline() {
        return this.HostOnline;
    }

    /**
     * Set 主机在线个数
     * @param HostOnline 主机在线个数
     */
    public void setHostOnline(Long HostOnline) {
        this.HostOnline = HostOnline;
    }

    /**
     * Get 主机个数 
     * @return HostCnt 主机个数
     */
    public Long getHostCnt() {
        return this.HostCnt;
    }

    /**
     * Set 主机个数
     * @param HostCnt 主机个数
     */
    public void setHostCnt(Long HostCnt) {
        this.HostCnt = HostCnt;
    }

    /**
     * Get 有风险的镜像个数 
     * @return ImageHasRiskInfoCnt 有风险的镜像个数
     */
    public Long getImageHasRiskInfoCnt() {
        return this.ImageHasRiskInfoCnt;
    }

    /**
     * Set 有风险的镜像个数
     * @param ImageHasRiskInfoCnt 有风险的镜像个数
     */
    public void setImageHasRiskInfoCnt(Long ImageHasRiskInfoCnt) {
        this.ImageHasRiskInfoCnt = ImageHasRiskInfoCnt;
    }

    /**
     * Get 有病毒的镜像个数 
     * @return ImageHasVirusCnt 有病毒的镜像个数
     */
    public Long getImageHasVirusCnt() {
        return this.ImageHasVirusCnt;
    }

    /**
     * Set 有病毒的镜像个数
     * @param ImageHasVirusCnt 有病毒的镜像个数
     */
    public void setImageHasVirusCnt(Long ImageHasVirusCnt) {
        this.ImageHasVirusCnt = ImageHasVirusCnt;
    }

    /**
     * Get 有漏洞的镜像个数 
     * @return ImageHasVulsCnt 有漏洞的镜像个数
     */
    public Long getImageHasVulsCnt() {
        return this.ImageHasVulsCnt;
    }

    /**
     * Set 有漏洞的镜像个数
     * @param ImageHasVulsCnt 有漏洞的镜像个数
     */
    public void setImageHasVulsCnt(Long ImageHasVulsCnt) {
        this.ImageHasVulsCnt = ImageHasVulsCnt;
    }

    /**
     * Get 不受信任的镜像个数 
     * @return ImageUntrustCnt 不受信任的镜像个数
     */
    public Long getImageUntrustCnt() {
        return this.ImageUntrustCnt;
    }

    /**
     * Set 不受信任的镜像个数
     * @param ImageUntrustCnt 不受信任的镜像个数
     */
    public void setImageUntrustCnt(Long ImageUntrustCnt) {
        this.ImageUntrustCnt = ImageUntrustCnt;
    }

    /**
     * Get 监听的端口个数 
     * @return ListenPortCnt 监听的端口个数
     */
    public Long getListenPortCnt() {
        return this.ListenPortCnt;
    }

    /**
     * Set 监听的端口个数
     * @param ListenPortCnt 监听的端口个数
     */
    public void setListenPortCnt(Long ListenPortCnt) {
        this.ListenPortCnt = ListenPortCnt;
    }

    /**
     * Get 进程个数 
     * @return ProcessCnt 进程个数
     */
    public Long getProcessCnt() {
        return this.ProcessCnt;
    }

    /**
     * Set 进程个数
     * @param ProcessCnt 进程个数
     */
    public void setProcessCnt(Long ProcessCnt) {
        this.ProcessCnt = ProcessCnt;
    }

    /**
     * Get web服务个数 
     * @return WebServiceCnt web服务个数
     */
    public Long getWebServiceCnt() {
        return this.WebServiceCnt;
    }

    /**
     * Set web服务个数
     * @param WebServiceCnt web服务个数
     */
    public void setWebServiceCnt(Long WebServiceCnt) {
        this.WebServiceCnt = WebServiceCnt;
    }

    /**
     * Get 最近镜像扫描时间 
     * @return LatestImageScanTime 最近镜像扫描时间
     */
    public String getLatestImageScanTime() {
        return this.LatestImageScanTime;
    }

    /**
     * Set 最近镜像扫描时间
     * @param LatestImageScanTime 最近镜像扫描时间
     */
    public void setLatestImageScanTime(String LatestImageScanTime) {
        this.LatestImageScanTime = LatestImageScanTime;
    }

    /**
     * Get 风险镜像个数 
     * @return ImageUnsafeCnt 风险镜像个数
     */
    public Long getImageUnsafeCnt() {
        return this.ImageUnsafeCnt;
    }

    /**
     * Set 风险镜像个数
     * @param ImageUnsafeCnt 风险镜像个数
     */
    public void setImageUnsafeCnt(Long ImageUnsafeCnt) {
        this.ImageUnsafeCnt = ImageUnsafeCnt;
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

    public DescribeAssetSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetSummaryResponse(DescribeAssetSummaryResponse source) {
        if (source.AppCnt != null) {
            this.AppCnt = new Long(source.AppCnt);
        }
        if (source.ContainerCnt != null) {
            this.ContainerCnt = new Long(source.ContainerCnt);
        }
        if (source.ContainerPause != null) {
            this.ContainerPause = new Long(source.ContainerPause);
        }
        if (source.ContainerRunning != null) {
            this.ContainerRunning = new Long(source.ContainerRunning);
        }
        if (source.ContainerStop != null) {
            this.ContainerStop = new Long(source.ContainerStop);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DbCnt != null) {
            this.DbCnt = new Long(source.DbCnt);
        }
        if (source.ImageCnt != null) {
            this.ImageCnt = new Long(source.ImageCnt);
        }
        if (source.HostOnline != null) {
            this.HostOnline = new Long(source.HostOnline);
        }
        if (source.HostCnt != null) {
            this.HostCnt = new Long(source.HostCnt);
        }
        if (source.ImageHasRiskInfoCnt != null) {
            this.ImageHasRiskInfoCnt = new Long(source.ImageHasRiskInfoCnt);
        }
        if (source.ImageHasVirusCnt != null) {
            this.ImageHasVirusCnt = new Long(source.ImageHasVirusCnt);
        }
        if (source.ImageHasVulsCnt != null) {
            this.ImageHasVulsCnt = new Long(source.ImageHasVulsCnt);
        }
        if (source.ImageUntrustCnt != null) {
            this.ImageUntrustCnt = new Long(source.ImageUntrustCnt);
        }
        if (source.ListenPortCnt != null) {
            this.ListenPortCnt = new Long(source.ListenPortCnt);
        }
        if (source.ProcessCnt != null) {
            this.ProcessCnt = new Long(source.ProcessCnt);
        }
        if (source.WebServiceCnt != null) {
            this.WebServiceCnt = new Long(source.WebServiceCnt);
        }
        if (source.LatestImageScanTime != null) {
            this.LatestImageScanTime = new String(source.LatestImageScanTime);
        }
        if (source.ImageUnsafeCnt != null) {
            this.ImageUnsafeCnt = new Long(source.ImageUnsafeCnt);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppCnt", this.AppCnt);
        this.setParamSimple(map, prefix + "ContainerCnt", this.ContainerCnt);
        this.setParamSimple(map, prefix + "ContainerPause", this.ContainerPause);
        this.setParamSimple(map, prefix + "ContainerRunning", this.ContainerRunning);
        this.setParamSimple(map, prefix + "ContainerStop", this.ContainerStop);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DbCnt", this.DbCnt);
        this.setParamSimple(map, prefix + "ImageCnt", this.ImageCnt);
        this.setParamSimple(map, prefix + "HostOnline", this.HostOnline);
        this.setParamSimple(map, prefix + "HostCnt", this.HostCnt);
        this.setParamSimple(map, prefix + "ImageHasRiskInfoCnt", this.ImageHasRiskInfoCnt);
        this.setParamSimple(map, prefix + "ImageHasVirusCnt", this.ImageHasVirusCnt);
        this.setParamSimple(map, prefix + "ImageHasVulsCnt", this.ImageHasVulsCnt);
        this.setParamSimple(map, prefix + "ImageUntrustCnt", this.ImageUntrustCnt);
        this.setParamSimple(map, prefix + "ListenPortCnt", this.ListenPortCnt);
        this.setParamSimple(map, prefix + "ProcessCnt", this.ProcessCnt);
        this.setParamSimple(map, prefix + "WebServiceCnt", this.WebServiceCnt);
        this.setParamSimple(map, prefix + "LatestImageScanTime", this.LatestImageScanTime);
        this.setParamSimple(map, prefix + "ImageUnsafeCnt", this.ImageUnsafeCnt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

