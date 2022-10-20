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

public class DescribeVulScanInfoRequest extends AbstractModel{

    /**
    * 本地镜像漏洞扫描任务ID，无则返回最近一次的漏洞任务扫描
    */
    @SerializedName("LocalTaskID")
    @Expose
    private Long LocalTaskID;

    /**
    * 仓库镜像漏洞扫描任务ID，无则返回最近一次的漏洞任务扫描
    */
    @SerializedName("RegistryTaskID")
    @Expose
    private Long RegistryTaskID;

    /**
     * Get 本地镜像漏洞扫描任务ID，无则返回最近一次的漏洞任务扫描 
     * @return LocalTaskID 本地镜像漏洞扫描任务ID，无则返回最近一次的漏洞任务扫描
     */
    public Long getLocalTaskID() {
        return this.LocalTaskID;
    }

    /**
     * Set 本地镜像漏洞扫描任务ID，无则返回最近一次的漏洞任务扫描
     * @param LocalTaskID 本地镜像漏洞扫描任务ID，无则返回最近一次的漏洞任务扫描
     */
    public void setLocalTaskID(Long LocalTaskID) {
        this.LocalTaskID = LocalTaskID;
    }

    /**
     * Get 仓库镜像漏洞扫描任务ID，无则返回最近一次的漏洞任务扫描 
     * @return RegistryTaskID 仓库镜像漏洞扫描任务ID，无则返回最近一次的漏洞任务扫描
     */
    public Long getRegistryTaskID() {
        return this.RegistryTaskID;
    }

    /**
     * Set 仓库镜像漏洞扫描任务ID，无则返回最近一次的漏洞任务扫描
     * @param RegistryTaskID 仓库镜像漏洞扫描任务ID，无则返回最近一次的漏洞任务扫描
     */
    public void setRegistryTaskID(Long RegistryTaskID) {
        this.RegistryTaskID = RegistryTaskID;
    }

    public DescribeVulScanInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulScanInfoRequest(DescribeVulScanInfoRequest source) {
        if (source.LocalTaskID != null) {
            this.LocalTaskID = new Long(source.LocalTaskID);
        }
        if (source.RegistryTaskID != null) {
            this.RegistryTaskID = new Long(source.RegistryTaskID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocalTaskID", this.LocalTaskID);
        this.setParamSimple(map, prefix + "RegistryTaskID", this.RegistryTaskID);

    }
}

