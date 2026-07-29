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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudAppCosInfoRequest extends AbstractModel {

    /**
    * 环境id
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 服务名
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 部署类型
    */
    @SerializedName("DeployType")
    @Expose
    private String DeployType;

    /**
    * 时间戳
    */
    @SerializedName("UnixTimestamp")
    @Expose
    private String UnixTimestamp;

    /**
    * 文件后缀
    */
    @SerializedName("Suffix")
    @Expose
    private String Suffix;

    /**
    * 是否需要下载
    */
    @SerializedName("NeedDownload")
    @Expose
    private Boolean NeedDownload;

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
     * Get 服务名 
     * @return ServiceName 服务名
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 服务名
     * @param ServiceName 服务名
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 部署类型 
     * @return DeployType 部署类型
     */
    public String getDeployType() {
        return this.DeployType;
    }

    /**
     * Set 部署类型
     * @param DeployType 部署类型
     */
    public void setDeployType(String DeployType) {
        this.DeployType = DeployType;
    }

    /**
     * Get 时间戳 
     * @return UnixTimestamp 时间戳
     */
    public String getUnixTimestamp() {
        return this.UnixTimestamp;
    }

    /**
     * Set 时间戳
     * @param UnixTimestamp 时间戳
     */
    public void setUnixTimestamp(String UnixTimestamp) {
        this.UnixTimestamp = UnixTimestamp;
    }

    /**
     * Get 文件后缀 
     * @return Suffix 文件后缀
     */
    public String getSuffix() {
        return this.Suffix;
    }

    /**
     * Set 文件后缀
     * @param Suffix 文件后缀
     */
    public void setSuffix(String Suffix) {
        this.Suffix = Suffix;
    }

    /**
     * Get 是否需要下载 
     * @return NeedDownload 是否需要下载
     */
    public Boolean getNeedDownload() {
        return this.NeedDownload;
    }

    /**
     * Set 是否需要下载
     * @param NeedDownload 是否需要下载
     */
    public void setNeedDownload(Boolean NeedDownload) {
        this.NeedDownload = NeedDownload;
    }

    public DescribeCloudAppCosInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudAppCosInfoRequest(DescribeCloudAppCosInfoRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.DeployType != null) {
            this.DeployType = new String(source.DeployType);
        }
        if (source.UnixTimestamp != null) {
            this.UnixTimestamp = new String(source.UnixTimestamp);
        }
        if (source.Suffix != null) {
            this.Suffix = new String(source.Suffix);
        }
        if (source.NeedDownload != null) {
            this.NeedDownload = new Boolean(source.NeedDownload);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "DeployType", this.DeployType);
        this.setParamSimple(map, prefix + "UnixTimestamp", this.UnixTimestamp);
        this.setParamSimple(map, prefix + "Suffix", this.Suffix);
        this.setParamSimple(map, prefix + "NeedDownload", this.NeedDownload);

    }
}

