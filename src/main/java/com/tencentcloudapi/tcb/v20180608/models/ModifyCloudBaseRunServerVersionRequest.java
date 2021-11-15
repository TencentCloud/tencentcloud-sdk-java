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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCloudBaseRunServerVersionRequest extends AbstractModel{

    /**
    * 环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 服务名称
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
    * 版本名称
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * 环境变量
    */
    @SerializedName("EnvParams")
    @Expose
    private String EnvParams;

    /**
    * 最小副本数
    */
    @SerializedName("MinNum")
    @Expose
    private String MinNum;

    /**
    * 最大副本数
    */
    @SerializedName("MaxNum")
    @Expose
    private String MaxNum;

    /**
    * 端口
    */
    @SerializedName("ContainerPort")
    @Expose
    private String ContainerPort;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 日志采集路径
    */
    @SerializedName("CustomLogs")
    @Expose
    private String CustomLogs;

    /**
    * 是否重设备注
    */
    @SerializedName("IsResetRemark")
    @Expose
    private Boolean IsResetRemark;

    /**
    * 修改基础信息
    */
    @SerializedName("BasicModify")
    @Expose
    private Boolean BasicModify;

    /**
    * 操作备注
    */
    @SerializedName("OperatorRemark")
    @Expose
    private String OperatorRemark;

    /**
     * Get 环境ID 
     * @return EnvId 环境ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境ID
     * @param EnvId 环境ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 服务名称 
     * @return ServerName 服务名称
     */
    public String getServerName() {
        return this.ServerName;
    }

    /**
     * Set 服务名称
     * @param ServerName 服务名称
     */
    public void setServerName(String ServerName) {
        this.ServerName = ServerName;
    }

    /**
     * Get 版本名称 
     * @return VersionName 版本名称
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 版本名称
     * @param VersionName 版本名称
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get 环境变量 
     * @return EnvParams 环境变量
     */
    public String getEnvParams() {
        return this.EnvParams;
    }

    /**
     * Set 环境变量
     * @param EnvParams 环境变量
     */
    public void setEnvParams(String EnvParams) {
        this.EnvParams = EnvParams;
    }

    /**
     * Get 最小副本数 
     * @return MinNum 最小副本数
     */
    public String getMinNum() {
        return this.MinNum;
    }

    /**
     * Set 最小副本数
     * @param MinNum 最小副本数
     */
    public void setMinNum(String MinNum) {
        this.MinNum = MinNum;
    }

    /**
     * Get 最大副本数 
     * @return MaxNum 最大副本数
     */
    public String getMaxNum() {
        return this.MaxNum;
    }

    /**
     * Set 最大副本数
     * @param MaxNum 最大副本数
     */
    public void setMaxNum(String MaxNum) {
        this.MaxNum = MaxNum;
    }

    /**
     * Get 端口 
     * @return ContainerPort 端口
     */
    public String getContainerPort() {
        return this.ContainerPort;
    }

    /**
     * Set 端口
     * @param ContainerPort 端口
     */
    public void setContainerPort(String ContainerPort) {
        this.ContainerPort = ContainerPort;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 日志采集路径 
     * @return CustomLogs 日志采集路径
     */
    public String getCustomLogs() {
        return this.CustomLogs;
    }

    /**
     * Set 日志采集路径
     * @param CustomLogs 日志采集路径
     */
    public void setCustomLogs(String CustomLogs) {
        this.CustomLogs = CustomLogs;
    }

    /**
     * Get 是否重设备注 
     * @return IsResetRemark 是否重设备注
     */
    public Boolean getIsResetRemark() {
        return this.IsResetRemark;
    }

    /**
     * Set 是否重设备注
     * @param IsResetRemark 是否重设备注
     */
    public void setIsResetRemark(Boolean IsResetRemark) {
        this.IsResetRemark = IsResetRemark;
    }

    /**
     * Get 修改基础信息 
     * @return BasicModify 修改基础信息
     */
    public Boolean getBasicModify() {
        return this.BasicModify;
    }

    /**
     * Set 修改基础信息
     * @param BasicModify 修改基础信息
     */
    public void setBasicModify(Boolean BasicModify) {
        this.BasicModify = BasicModify;
    }

    /**
     * Get 操作备注 
     * @return OperatorRemark 操作备注
     */
    public String getOperatorRemark() {
        return this.OperatorRemark;
    }

    /**
     * Set 操作备注
     * @param OperatorRemark 操作备注
     */
    public void setOperatorRemark(String OperatorRemark) {
        this.OperatorRemark = OperatorRemark;
    }

    public ModifyCloudBaseRunServerVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCloudBaseRunServerVersionRequest(ModifyCloudBaseRunServerVersionRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.ServerName != null) {
            this.ServerName = new String(source.ServerName);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.EnvParams != null) {
            this.EnvParams = new String(source.EnvParams);
        }
        if (source.MinNum != null) {
            this.MinNum = new String(source.MinNum);
        }
        if (source.MaxNum != null) {
            this.MaxNum = new String(source.MaxNum);
        }
        if (source.ContainerPort != null) {
            this.ContainerPort = new String(source.ContainerPort);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CustomLogs != null) {
            this.CustomLogs = new String(source.CustomLogs);
        }
        if (source.IsResetRemark != null) {
            this.IsResetRemark = new Boolean(source.IsResetRemark);
        }
        if (source.BasicModify != null) {
            this.BasicModify = new Boolean(source.BasicModify);
        }
        if (source.OperatorRemark != null) {
            this.OperatorRemark = new String(source.OperatorRemark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "ServerName", this.ServerName);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "EnvParams", this.EnvParams);
        this.setParamSimple(map, prefix + "MinNum", this.MinNum);
        this.setParamSimple(map, prefix + "MaxNum", this.MaxNum);
        this.setParamSimple(map, prefix + "ContainerPort", this.ContainerPort);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CustomLogs", this.CustomLogs);
        this.setParamSimple(map, prefix + "IsResetRemark", this.IsResetRemark);
        this.setParamSimple(map, prefix + "BasicModify", this.BasicModify);
        this.setParamSimple(map, prefix + "OperatorRemark", this.OperatorRemark);

    }
}

