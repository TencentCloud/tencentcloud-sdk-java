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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IaCFile extends AbstractModel {

    /**
    * <p>ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>appid</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>文件ID</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>文件名称</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>CI/CD名称</p>
    */
    @SerializedName("CICDName")
    @Expose
    private String CICDName;

    /**
    * <p>文件路径</p>
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * <p>文件类型(1:Dockerfile,2:Terraform,3:KubernetesYaml)</p>
    */
    @SerializedName("FileType")
    @Expose
    private Long FileType;

    /**
    * <p>风险总计数量</p>
    */
    @SerializedName("RiskTotalCnt")
    @Expose
    private Long RiskTotalCnt;

    /**
    * <p>风险等级数量(0:低危,1:中危,2:高危,3:严重)</p>
    */
    @SerializedName("RiskLevelCnt")
    @Expose
    private KeyValueInt [] RiskLevelCnt;

    /**
    * <p>扫描时间</p>
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
    * <p>检测状态(0:待扫描,1:检测中,2:已完成,3:检测异常)</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>扫描失败类型(0:无失败, 1:检测超时, 2:文件格式解析失败, 3:检测失败)</p>
    */
    @SerializedName("FailType")
    @Expose
    private Long FailType;

    /**
     * Get <p>ID</p> 
     * @return Id <p>ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>ID</p>
     * @param Id <p>ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>appid</p> 
     * @return AppId <p>appid</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>appid</p>
     * @param AppId <p>appid</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>文件ID</p> 
     * @return FileId <p>文件ID</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>文件ID</p>
     * @param FileId <p>文件ID</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>文件名称</p> 
     * @return FileName <p>文件名称</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>文件名称</p>
     * @param FileName <p>文件名称</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>CI/CD名称</p> 
     * @return CICDName <p>CI/CD名称</p>
     */
    public String getCICDName() {
        return this.CICDName;
    }

    /**
     * Set <p>CI/CD名称</p>
     * @param CICDName <p>CI/CD名称</p>
     */
    public void setCICDName(String CICDName) {
        this.CICDName = CICDName;
    }

    /**
     * Get <p>文件路径</p> 
     * @return FilePath <p>文件路径</p>
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set <p>文件路径</p>
     * @param FilePath <p>文件路径</p>
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get <p>文件类型(1:Dockerfile,2:Terraform,3:KubernetesYaml)</p> 
     * @return FileType <p>文件类型(1:Dockerfile,2:Terraform,3:KubernetesYaml)</p>
     */
    public Long getFileType() {
        return this.FileType;
    }

    /**
     * Set <p>文件类型(1:Dockerfile,2:Terraform,3:KubernetesYaml)</p>
     * @param FileType <p>文件类型(1:Dockerfile,2:Terraform,3:KubernetesYaml)</p>
     */
    public void setFileType(Long FileType) {
        this.FileType = FileType;
    }

    /**
     * Get <p>风险总计数量</p> 
     * @return RiskTotalCnt <p>风险总计数量</p>
     */
    public Long getRiskTotalCnt() {
        return this.RiskTotalCnt;
    }

    /**
     * Set <p>风险总计数量</p>
     * @param RiskTotalCnt <p>风险总计数量</p>
     */
    public void setRiskTotalCnt(Long RiskTotalCnt) {
        this.RiskTotalCnt = RiskTotalCnt;
    }

    /**
     * Get <p>风险等级数量(0:低危,1:中危,2:高危,3:严重)</p> 
     * @return RiskLevelCnt <p>风险等级数量(0:低危,1:中危,2:高危,3:严重)</p>
     */
    public KeyValueInt [] getRiskLevelCnt() {
        return this.RiskLevelCnt;
    }

    /**
     * Set <p>风险等级数量(0:低危,1:中危,2:高危,3:严重)</p>
     * @param RiskLevelCnt <p>风险等级数量(0:低危,1:中危,2:高危,3:严重)</p>
     */
    public void setRiskLevelCnt(KeyValueInt [] RiskLevelCnt) {
        this.RiskLevelCnt = RiskLevelCnt;
    }

    /**
     * Get <p>扫描时间</p> 
     * @return ScanTime <p>扫描时间</p>
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set <p>扫描时间</p>
     * @param ScanTime <p>扫描时间</p>
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    /**
     * Get <p>检测状态(0:待扫描,1:检测中,2:已完成,3:检测异常)</p> 
     * @return Status <p>检测状态(0:待扫描,1:检测中,2:已完成,3:检测异常)</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>检测状态(0:待扫描,1:检测中,2:已完成,3:检测异常)</p>
     * @param Status <p>检测状态(0:待扫描,1:检测中,2:已完成,3:检测异常)</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>扫描失败类型(0:无失败, 1:检测超时, 2:文件格式解析失败, 3:检测失败)</p> 
     * @return FailType <p>扫描失败类型(0:无失败, 1:检测超时, 2:文件格式解析失败, 3:检测失败)</p>
     */
    public Long getFailType() {
        return this.FailType;
    }

    /**
     * Set <p>扫描失败类型(0:无失败, 1:检测超时, 2:文件格式解析失败, 3:检测失败)</p>
     * @param FailType <p>扫描失败类型(0:无失败, 1:检测超时, 2:文件格式解析失败, 3:检测失败)</p>
     */
    public void setFailType(Long FailType) {
        this.FailType = FailType;
    }

    public IaCFile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IaCFile(IaCFile source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.CICDName != null) {
            this.CICDName = new String(source.CICDName);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.FileType != null) {
            this.FileType = new Long(source.FileType);
        }
        if (source.RiskTotalCnt != null) {
            this.RiskTotalCnt = new Long(source.RiskTotalCnt);
        }
        if (source.RiskLevelCnt != null) {
            this.RiskLevelCnt = new KeyValueInt[source.RiskLevelCnt.length];
            for (int i = 0; i < source.RiskLevelCnt.length; i++) {
                this.RiskLevelCnt[i] = new KeyValueInt(source.RiskLevelCnt[i]);
            }
        }
        if (source.ScanTime != null) {
            this.ScanTime = new String(source.ScanTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.FailType != null) {
            this.FailType = new Long(source.FailType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "CICDName", this.CICDName);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "RiskTotalCnt", this.RiskTotalCnt);
        this.setParamArrayObj(map, prefix + "RiskLevelCnt.", this.RiskLevelCnt);
        this.setParamSimple(map, prefix + "ScanTime", this.ScanTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FailType", this.FailType);

    }
}

