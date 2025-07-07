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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudRunServersRequest extends AbstractModel {

    /**
    * 环境Id
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 默认为9， 最大为30
不传或传0时 取默认9
大于30时取30
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 不传或传0时 会默认为1
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * 服务名
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
    * 服务类型：function | container
    */
    @SerializedName("ServerType")
    @Expose
    private String ServerType;

    /**
     * Get 环境Id 
     * @return EnvId 环境Id
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境Id
     * @param EnvId 环境Id
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 默认为9， 最大为30
不传或传0时 取默认9
大于30时取30 
     * @return PageSize 默认为9， 最大为30
不传或传0时 取默认9
大于30时取30
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 默认为9， 最大为30
不传或传0时 取默认9
大于30时取30
     * @param PageSize 默认为9， 最大为30
不传或传0时 取默认9
大于30时取30
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 不传或传0时 会默认为1 
     * @return PageNum 不传或传0时 会默认为1
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 不传或传0时 会默认为1
     * @param PageNum 不传或传0时 会默认为1
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get 服务名 
     * @return ServerName 服务名
     */
    public String getServerName() {
        return this.ServerName;
    }

    /**
     * Set 服务名
     * @param ServerName 服务名
     */
    public void setServerName(String ServerName) {
        this.ServerName = ServerName;
    }

    /**
     * Get 服务类型：function | container 
     * @return ServerType 服务类型：function | container
     */
    public String getServerType() {
        return this.ServerType;
    }

    /**
     * Set 服务类型：function | container
     * @param ServerType 服务类型：function | container
     */
    public void setServerType(String ServerType) {
        this.ServerType = ServerType;
    }

    public DescribeCloudRunServersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudRunServersRequest(DescribeCloudRunServersRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.ServerName != null) {
            this.ServerName = new String(source.ServerName);
        }
        if (source.ServerType != null) {
            this.ServerType = new String(source.ServerType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "ServerName", this.ServerName);
        this.setParamSimple(map, prefix + "ServerType", this.ServerType);

    }
}

