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

public class DeleteCloudBaseRunServerVersionRequest extends AbstractModel{

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
    * 是否删除服务，只有最后一个版本的时候，才生效。
    */
    @SerializedName("IsDeleteServer")
    @Expose
    private Boolean IsDeleteServer;

    /**
    * 只有删除服务的时候，才会起作用
    */
    @SerializedName("IsDeleteImage")
    @Expose
    private Boolean IsDeleteImage;

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
     * Get 是否删除服务，只有最后一个版本的时候，才生效。 
     * @return IsDeleteServer 是否删除服务，只有最后一个版本的时候，才生效。
     */
    public Boolean getIsDeleteServer() {
        return this.IsDeleteServer;
    }

    /**
     * Set 是否删除服务，只有最后一个版本的时候，才生效。
     * @param IsDeleteServer 是否删除服务，只有最后一个版本的时候，才生效。
     */
    public void setIsDeleteServer(Boolean IsDeleteServer) {
        this.IsDeleteServer = IsDeleteServer;
    }

    /**
     * Get 只有删除服务的时候，才会起作用 
     * @return IsDeleteImage 只有删除服务的时候，才会起作用
     */
    public Boolean getIsDeleteImage() {
        return this.IsDeleteImage;
    }

    /**
     * Set 只有删除服务的时候，才会起作用
     * @param IsDeleteImage 只有删除服务的时候，才会起作用
     */
    public void setIsDeleteImage(Boolean IsDeleteImage) {
        this.IsDeleteImage = IsDeleteImage;
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

    public DeleteCloudBaseRunServerVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCloudBaseRunServerVersionRequest(DeleteCloudBaseRunServerVersionRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.ServerName != null) {
            this.ServerName = new String(source.ServerName);
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
        this.setParamSimple(map, prefix + "IsDeleteServer", this.IsDeleteServer);
        this.setParamSimple(map, prefix + "IsDeleteImage", this.IsDeleteImage);
        this.setParamSimple(map, prefix + "OperatorRemark", this.OperatorRemark);

    }
}

