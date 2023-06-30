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

public class DeleteGatewayVersionRequest extends AbstractModel{

    /**
    * 环境id
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 网关id
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 版本名
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * 是否删除服务
    */
    @SerializedName("IsDeleteServer")
    @Expose
    private Boolean IsDeleteServer;

    /**
    * 是否删除镜像
    */
    @SerializedName("IsDeleteImage")
    @Expose
    private Boolean IsDeleteImage;

    /**
    * 是否强制删除
    */
    @SerializedName("IsForce")
    @Expose
    private Boolean IsForce;

    /**
    * 操作记录
    */
    @SerializedName("OperatorRemark")
    @Expose
    private String OperatorRemark;

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
     * Get 网关id 
     * @return GatewayId 网关id
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关id
     * @param GatewayId 网关id
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 版本名 
     * @return VersionName 版本名
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 版本名
     * @param VersionName 版本名
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get 是否删除服务 
     * @return IsDeleteServer 是否删除服务
     */
    public Boolean getIsDeleteServer() {
        return this.IsDeleteServer;
    }

    /**
     * Set 是否删除服务
     * @param IsDeleteServer 是否删除服务
     */
    public void setIsDeleteServer(Boolean IsDeleteServer) {
        this.IsDeleteServer = IsDeleteServer;
    }

    /**
     * Get 是否删除镜像 
     * @return IsDeleteImage 是否删除镜像
     */
    public Boolean getIsDeleteImage() {
        return this.IsDeleteImage;
    }

    /**
     * Set 是否删除镜像
     * @param IsDeleteImage 是否删除镜像
     */
    public void setIsDeleteImage(Boolean IsDeleteImage) {
        this.IsDeleteImage = IsDeleteImage;
    }

    /**
     * Get 是否强制删除 
     * @return IsForce 是否强制删除
     */
    public Boolean getIsForce() {
        return this.IsForce;
    }

    /**
     * Set 是否强制删除
     * @param IsForce 是否强制删除
     */
    public void setIsForce(Boolean IsForce) {
        this.IsForce = IsForce;
    }

    /**
     * Get 操作记录 
     * @return OperatorRemark 操作记录
     */
    public String getOperatorRemark() {
        return this.OperatorRemark;
    }

    /**
     * Set 操作记录
     * @param OperatorRemark 操作记录
     */
    public void setOperatorRemark(String OperatorRemark) {
        this.OperatorRemark = OperatorRemark;
    }

    public DeleteGatewayVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteGatewayVersionRequest(DeleteGatewayVersionRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.IsDeleteServer != null) {
            this.IsDeleteServer = new Boolean(source.IsDeleteServer);
        }
        if (source.IsDeleteImage != null) {
            this.IsDeleteImage = new Boolean(source.IsDeleteImage);
        }
        if (source.IsForce != null) {
            this.IsForce = new Boolean(source.IsForce);
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
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "IsDeleteServer", this.IsDeleteServer);
        this.setParamSimple(map, prefix + "IsDeleteImage", this.IsDeleteImage);
        this.setParamSimple(map, prefix + "IsForce", this.IsForce);
        this.setParamSimple(map, prefix + "OperatorRemark", this.OperatorRemark);

    }
}

