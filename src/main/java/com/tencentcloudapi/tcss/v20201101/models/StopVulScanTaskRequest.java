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

public class StopVulScanTaskRequest extends AbstractModel{

    /**
    * 本地镜像漏洞扫描任务ID
    */
    @SerializedName("LocalTaskID")
    @Expose
    private Long LocalTaskID;

    /**
    * 本地镜像ID，无则全部
    */
    @SerializedName("LocalImageIDs")
    @Expose
    private String [] LocalImageIDs;

    /**
    * 仓库镜像ID，无则全部
    */
    @SerializedName("RegistryImageIDs")
    @Expose
    private Long [] RegistryImageIDs;

    /**
    * 仓库镜像漏洞扫描任务ID
    */
    @SerializedName("RegistryTaskID")
    @Expose
    private Long RegistryTaskID;

    /**
     * Get 本地镜像漏洞扫描任务ID 
     * @return LocalTaskID 本地镜像漏洞扫描任务ID
     */
    public Long getLocalTaskID() {
        return this.LocalTaskID;
    }

    /**
     * Set 本地镜像漏洞扫描任务ID
     * @param LocalTaskID 本地镜像漏洞扫描任务ID
     */
    public void setLocalTaskID(Long LocalTaskID) {
        this.LocalTaskID = LocalTaskID;
    }

    /**
     * Get 本地镜像ID，无则全部 
     * @return LocalImageIDs 本地镜像ID，无则全部
     */
    public String [] getLocalImageIDs() {
        return this.LocalImageIDs;
    }

    /**
     * Set 本地镜像ID，无则全部
     * @param LocalImageIDs 本地镜像ID，无则全部
     */
    public void setLocalImageIDs(String [] LocalImageIDs) {
        this.LocalImageIDs = LocalImageIDs;
    }

    /**
     * Get 仓库镜像ID，无则全部 
     * @return RegistryImageIDs 仓库镜像ID，无则全部
     */
    public Long [] getRegistryImageIDs() {
        return this.RegistryImageIDs;
    }

    /**
     * Set 仓库镜像ID，无则全部
     * @param RegistryImageIDs 仓库镜像ID，无则全部
     */
    public void setRegistryImageIDs(Long [] RegistryImageIDs) {
        this.RegistryImageIDs = RegistryImageIDs;
    }

    /**
     * Get 仓库镜像漏洞扫描任务ID 
     * @return RegistryTaskID 仓库镜像漏洞扫描任务ID
     */
    public Long getRegistryTaskID() {
        return this.RegistryTaskID;
    }

    /**
     * Set 仓库镜像漏洞扫描任务ID
     * @param RegistryTaskID 仓库镜像漏洞扫描任务ID
     */
    public void setRegistryTaskID(Long RegistryTaskID) {
        this.RegistryTaskID = RegistryTaskID;
    }

    public StopVulScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StopVulScanTaskRequest(StopVulScanTaskRequest source) {
        if (source.LocalTaskID != null) {
            this.LocalTaskID = new Long(source.LocalTaskID);
        }
        if (source.LocalImageIDs != null) {
            this.LocalImageIDs = new String[source.LocalImageIDs.length];
            for (int i = 0; i < source.LocalImageIDs.length; i++) {
                this.LocalImageIDs[i] = new String(source.LocalImageIDs[i]);
            }
        }
        if (source.RegistryImageIDs != null) {
            this.RegistryImageIDs = new Long[source.RegistryImageIDs.length];
            for (int i = 0; i < source.RegistryImageIDs.length; i++) {
                this.RegistryImageIDs[i] = new Long(source.RegistryImageIDs[i]);
            }
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
        this.setParamArraySimple(map, prefix + "LocalImageIDs.", this.LocalImageIDs);
        this.setParamArraySimple(map, prefix + "RegistryImageIDs.", this.RegistryImageIDs);
        this.setParamSimple(map, prefix + "RegistryTaskID", this.RegistryTaskID);

    }
}

