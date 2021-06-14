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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetInfoResponse extends AbstractModel{

    /**
    * 主机数
    */
    @SerializedName("MachineCount")
    @Expose
    private Long MachineCount;

    /**
    * 账号数
    */
    @SerializedName("AccountCount")
    @Expose
    private Long AccountCount;

    /**
    * 端口数
    */
    @SerializedName("PortCount")
    @Expose
    private Long PortCount;

    /**
    * 进程数
    */
    @SerializedName("ProcessCount")
    @Expose
    private Long ProcessCount;

    /**
    * 软件数
    */
    @SerializedName("SoftwareCount")
    @Expose
    private Long SoftwareCount;

    /**
    * 数据库数
    */
    @SerializedName("DatabaseCount")
    @Expose
    private Long DatabaseCount;

    /**
    * Web应用数
    */
    @SerializedName("WebAppCount")
    @Expose
    private Long WebAppCount;

    /**
    * Web框架数
    */
    @SerializedName("WebFrameCount")
    @Expose
    private Long WebFrameCount;

    /**
    * Web服务数
    */
    @SerializedName("WebServiceCount")
    @Expose
    private Long WebServiceCount;

    /**
    * Web站点数
    */
    @SerializedName("WebLocationCount")
    @Expose
    private Long WebLocationCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 主机数 
     * @return MachineCount 主机数
     */
    public Long getMachineCount() {
        return this.MachineCount;
    }

    /**
     * Set 主机数
     * @param MachineCount 主机数
     */
    public void setMachineCount(Long MachineCount) {
        this.MachineCount = MachineCount;
    }

    /**
     * Get 账号数 
     * @return AccountCount 账号数
     */
    public Long getAccountCount() {
        return this.AccountCount;
    }

    /**
     * Set 账号数
     * @param AccountCount 账号数
     */
    public void setAccountCount(Long AccountCount) {
        this.AccountCount = AccountCount;
    }

    /**
     * Get 端口数 
     * @return PortCount 端口数
     */
    public Long getPortCount() {
        return this.PortCount;
    }

    /**
     * Set 端口数
     * @param PortCount 端口数
     */
    public void setPortCount(Long PortCount) {
        this.PortCount = PortCount;
    }

    /**
     * Get 进程数 
     * @return ProcessCount 进程数
     */
    public Long getProcessCount() {
        return this.ProcessCount;
    }

    /**
     * Set 进程数
     * @param ProcessCount 进程数
     */
    public void setProcessCount(Long ProcessCount) {
        this.ProcessCount = ProcessCount;
    }

    /**
     * Get 软件数 
     * @return SoftwareCount 软件数
     */
    public Long getSoftwareCount() {
        return this.SoftwareCount;
    }

    /**
     * Set 软件数
     * @param SoftwareCount 软件数
     */
    public void setSoftwareCount(Long SoftwareCount) {
        this.SoftwareCount = SoftwareCount;
    }

    /**
     * Get 数据库数 
     * @return DatabaseCount 数据库数
     */
    public Long getDatabaseCount() {
        return this.DatabaseCount;
    }

    /**
     * Set 数据库数
     * @param DatabaseCount 数据库数
     */
    public void setDatabaseCount(Long DatabaseCount) {
        this.DatabaseCount = DatabaseCount;
    }

    /**
     * Get Web应用数 
     * @return WebAppCount Web应用数
     */
    public Long getWebAppCount() {
        return this.WebAppCount;
    }

    /**
     * Set Web应用数
     * @param WebAppCount Web应用数
     */
    public void setWebAppCount(Long WebAppCount) {
        this.WebAppCount = WebAppCount;
    }

    /**
     * Get Web框架数 
     * @return WebFrameCount Web框架数
     */
    public Long getWebFrameCount() {
        return this.WebFrameCount;
    }

    /**
     * Set Web框架数
     * @param WebFrameCount Web框架数
     */
    public void setWebFrameCount(Long WebFrameCount) {
        this.WebFrameCount = WebFrameCount;
    }

    /**
     * Get Web服务数 
     * @return WebServiceCount Web服务数
     */
    public Long getWebServiceCount() {
        return this.WebServiceCount;
    }

    /**
     * Set Web服务数
     * @param WebServiceCount Web服务数
     */
    public void setWebServiceCount(Long WebServiceCount) {
        this.WebServiceCount = WebServiceCount;
    }

    /**
     * Get Web站点数 
     * @return WebLocationCount Web站点数
     */
    public Long getWebLocationCount() {
        return this.WebLocationCount;
    }

    /**
     * Set Web站点数
     * @param WebLocationCount Web站点数
     */
    public void setWebLocationCount(Long WebLocationCount) {
        this.WebLocationCount = WebLocationCount;
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

    public DescribeAssetInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetInfoResponse(DescribeAssetInfoResponse source) {
        if (source.MachineCount != null) {
            this.MachineCount = new Long(source.MachineCount);
        }
        if (source.AccountCount != null) {
            this.AccountCount = new Long(source.AccountCount);
        }
        if (source.PortCount != null) {
            this.PortCount = new Long(source.PortCount);
        }
        if (source.ProcessCount != null) {
            this.ProcessCount = new Long(source.ProcessCount);
        }
        if (source.SoftwareCount != null) {
            this.SoftwareCount = new Long(source.SoftwareCount);
        }
        if (source.DatabaseCount != null) {
            this.DatabaseCount = new Long(source.DatabaseCount);
        }
        if (source.WebAppCount != null) {
            this.WebAppCount = new Long(source.WebAppCount);
        }
        if (source.WebFrameCount != null) {
            this.WebFrameCount = new Long(source.WebFrameCount);
        }
        if (source.WebServiceCount != null) {
            this.WebServiceCount = new Long(source.WebServiceCount);
        }
        if (source.WebLocationCount != null) {
            this.WebLocationCount = new Long(source.WebLocationCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineCount", this.MachineCount);
        this.setParamSimple(map, prefix + "AccountCount", this.AccountCount);
        this.setParamSimple(map, prefix + "PortCount", this.PortCount);
        this.setParamSimple(map, prefix + "ProcessCount", this.ProcessCount);
        this.setParamSimple(map, prefix + "SoftwareCount", this.SoftwareCount);
        this.setParamSimple(map, prefix + "DatabaseCount", this.DatabaseCount);
        this.setParamSimple(map, prefix + "WebAppCount", this.WebAppCount);
        this.setParamSimple(map, prefix + "WebFrameCount", this.WebFrameCount);
        this.setParamSimple(map, prefix + "WebServiceCount", this.WebServiceCount);
        this.setParamSimple(map, prefix + "WebLocationCount", this.WebLocationCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

