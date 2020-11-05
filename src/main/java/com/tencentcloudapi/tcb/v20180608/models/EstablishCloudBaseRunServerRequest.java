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

public class EstablishCloudBaseRunServerRequest extends AbstractModel{

    /**
    * 环境id
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 服务名称
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 是否开通外网访问
    */
    @SerializedName("IsPublic")
    @Expose
    private Boolean IsPublic;

    /**
    * 镜像仓库
    */
    @SerializedName("ImageRepo")
    @Expose
    private String ImageRepo;

    /**
    * 服务描述
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * es信息
    */
    @SerializedName("EsInfo")
    @Expose
    private CloudBaseEsInfo EsInfo;

    /**
    * 日志类型; es/cls
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
     * Get 环境id 
     * @return EnvId 环境id
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境id
     * @param EnvId 环境id
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 服务名称 
     * @return ServiceName 服务名称
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 服务名称
     * @param ServiceName 服务名称
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 是否开通外网访问 
     * @return IsPublic 是否开通外网访问
     */
    public Boolean getIsPublic() {
        return this.IsPublic;
    }

    /**
     * Set 是否开通外网访问
     * @param IsPublic 是否开通外网访问
     */
    public void setIsPublic(Boolean IsPublic) {
        this.IsPublic = IsPublic;
    }

    /**
     * Get 镜像仓库 
     * @return ImageRepo 镜像仓库
     */
    public String getImageRepo() {
        return this.ImageRepo;
    }

    /**
     * Set 镜像仓库
     * @param ImageRepo 镜像仓库
     */
    public void setImageRepo(String ImageRepo) {
        this.ImageRepo = ImageRepo;
    }

    /**
     * Get 服务描述 
     * @return Remark 服务描述
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 服务描述
     * @param Remark 服务描述
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get es信息 
     * @return EsInfo es信息
     */
    public CloudBaseEsInfo getEsInfo() {
        return this.EsInfo;
    }

    /**
     * Set es信息
     * @param EsInfo es信息
     */
    public void setEsInfo(CloudBaseEsInfo EsInfo) {
        this.EsInfo = EsInfo;
    }

    /**
     * Get 日志类型; es/cls 
     * @return LogType 日志类型; es/cls
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 日志类型; es/cls
     * @param LogType 日志类型; es/cls
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "IsPublic", this.IsPublic);
        this.setParamSimple(map, prefix + "ImageRepo", this.ImageRepo);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamObj(map, prefix + "EsInfo.", this.EsInfo);
        this.setParamSimple(map, prefix + "LogType", this.LogType);

    }
}

