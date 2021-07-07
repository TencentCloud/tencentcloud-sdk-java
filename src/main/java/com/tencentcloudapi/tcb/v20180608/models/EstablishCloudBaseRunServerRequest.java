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
    * 操作备注
    */
    @SerializedName("OperatorRemark")
    @Expose
    private String OperatorRemark;

    /**
    * 来源方（默认值：qcloud，微信侧来源miniapp)
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * vpc信息
    */
    @SerializedName("VpcInfo")
    @Expose
    private CloudBaseRunVpcInfo VpcInfo;

    /**
    * 0/1=允许公网访问;2=关闭公网访问
    */
    @SerializedName("PublicAccess")
    @Expose
    private Long PublicAccess;

    /**
    * OA PUBLIC MINIAPP VPC
    */
    @SerializedName("OpenAccessTypes")
    @Expose
    private String [] OpenAccessTypes;

    /**
    * 是否创建Path 0未传默认创建 1创建 2不创建
    */
    @SerializedName("IsCreatePath")
    @Expose
    private Long IsCreatePath;

    /**
    * 指定创建路径（如不存在，则创建。存在，则忽略）
    */
    @SerializedName("ServerPath")
    @Expose
    private String ServerPath;

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

    /**
     * Get 来源方（默认值：qcloud，微信侧来源miniapp) 
     * @return Source 来源方（默认值：qcloud，微信侧来源miniapp)
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 来源方（默认值：qcloud，微信侧来源miniapp)
     * @param Source 来源方（默认值：qcloud，微信侧来源miniapp)
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get vpc信息 
     * @return VpcInfo vpc信息
     */
    public CloudBaseRunVpcInfo getVpcInfo() {
        return this.VpcInfo;
    }

    /**
     * Set vpc信息
     * @param VpcInfo vpc信息
     */
    public void setVpcInfo(CloudBaseRunVpcInfo VpcInfo) {
        this.VpcInfo = VpcInfo;
    }

    /**
     * Get 0/1=允许公网访问;2=关闭公网访问 
     * @return PublicAccess 0/1=允许公网访问;2=关闭公网访问
     */
    public Long getPublicAccess() {
        return this.PublicAccess;
    }

    /**
     * Set 0/1=允许公网访问;2=关闭公网访问
     * @param PublicAccess 0/1=允许公网访问;2=关闭公网访问
     */
    public void setPublicAccess(Long PublicAccess) {
        this.PublicAccess = PublicAccess;
    }

    /**
     * Get OA PUBLIC MINIAPP VPC 
     * @return OpenAccessTypes OA PUBLIC MINIAPP VPC
     */
    public String [] getOpenAccessTypes() {
        return this.OpenAccessTypes;
    }

    /**
     * Set OA PUBLIC MINIAPP VPC
     * @param OpenAccessTypes OA PUBLIC MINIAPP VPC
     */
    public void setOpenAccessTypes(String [] OpenAccessTypes) {
        this.OpenAccessTypes = OpenAccessTypes;
    }

    /**
     * Get 是否创建Path 0未传默认创建 1创建 2不创建 
     * @return IsCreatePath 是否创建Path 0未传默认创建 1创建 2不创建
     */
    public Long getIsCreatePath() {
        return this.IsCreatePath;
    }

    /**
     * Set 是否创建Path 0未传默认创建 1创建 2不创建
     * @param IsCreatePath 是否创建Path 0未传默认创建 1创建 2不创建
     */
    public void setIsCreatePath(Long IsCreatePath) {
        this.IsCreatePath = IsCreatePath;
    }

    /**
     * Get 指定创建路径（如不存在，则创建。存在，则忽略） 
     * @return ServerPath 指定创建路径（如不存在，则创建。存在，则忽略）
     */
    public String getServerPath() {
        return this.ServerPath;
    }

    /**
     * Set 指定创建路径（如不存在，则创建。存在，则忽略）
     * @param ServerPath 指定创建路径（如不存在，则创建。存在，则忽略）
     */
    public void setServerPath(String ServerPath) {
        this.ServerPath = ServerPath;
    }

    public EstablishCloudBaseRunServerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EstablishCloudBaseRunServerRequest(EstablishCloudBaseRunServerRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.IsPublic != null) {
            this.IsPublic = new Boolean(source.IsPublic);
        }
        if (source.ImageRepo != null) {
            this.ImageRepo = new String(source.ImageRepo);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.EsInfo != null) {
            this.EsInfo = new CloudBaseEsInfo(source.EsInfo);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.OperatorRemark != null) {
            this.OperatorRemark = new String(source.OperatorRemark);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.VpcInfo != null) {
            this.VpcInfo = new CloudBaseRunVpcInfo(source.VpcInfo);
        }
        if (source.PublicAccess != null) {
            this.PublicAccess = new Long(source.PublicAccess);
        }
        if (source.OpenAccessTypes != null) {
            this.OpenAccessTypes = new String[source.OpenAccessTypes.length];
            for (int i = 0; i < source.OpenAccessTypes.length; i++) {
                this.OpenAccessTypes[i] = new String(source.OpenAccessTypes[i]);
            }
        }
        if (source.IsCreatePath != null) {
            this.IsCreatePath = new Long(source.IsCreatePath);
        }
        if (source.ServerPath != null) {
            this.ServerPath = new String(source.ServerPath);
        }
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
        this.setParamSimple(map, prefix + "OperatorRemark", this.OperatorRemark);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamObj(map, prefix + "VpcInfo.", this.VpcInfo);
        this.setParamSimple(map, prefix + "PublicAccess", this.PublicAccess);
        this.setParamArraySimple(map, prefix + "OpenAccessTypes.", this.OpenAccessTypes);
        this.setParamSimple(map, prefix + "IsCreatePath", this.IsCreatePath);
        this.setParamSimple(map, prefix + "ServerPath", this.ServerPath);

    }
}

