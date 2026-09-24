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
package com.tencentcloudapi.tdai.v20250717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentMemInfo extends AbstractModel {

    /**
    * <p>Memory实例ID</p>
    */
    @SerializedName("MemInstanceId")
    @Expose
    private String MemInstanceId;

    /**
    * <p>1=active, 0=disabled（软删/关闭/下线历史行）</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>0=待安装,1=成功,2=失败待重试,3=开启中,4=关闭中/已关闭</p>
    */
    @SerializedName("InstallStatus")
    @Expose
    private Long InstallStatus;

    /**
    * <p>creating/online/isolated/error/</p>
    */
    @SerializedName("MemStatus")
    @Expose
    private String MemStatus;

    /**
     * Get <p>Memory实例ID</p> 
     * @return MemInstanceId <p>Memory实例ID</p>
     */
    public String getMemInstanceId() {
        return this.MemInstanceId;
    }

    /**
     * Set <p>Memory实例ID</p>
     * @param MemInstanceId <p>Memory实例ID</p>
     */
    public void setMemInstanceId(String MemInstanceId) {
        this.MemInstanceId = MemInstanceId;
    }

    /**
     * Get <p>1=active, 0=disabled（软删/关闭/下线历史行）</p> 
     * @return Status <p>1=active, 0=disabled（软删/关闭/下线历史行）</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>1=active, 0=disabled（软删/关闭/下线历史行）</p>
     * @param Status <p>1=active, 0=disabled（软删/关闭/下线历史行）</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>0=待安装,1=成功,2=失败待重试,3=开启中,4=关闭中/已关闭</p> 
     * @return InstallStatus <p>0=待安装,1=成功,2=失败待重试,3=开启中,4=关闭中/已关闭</p>
     */
    public Long getInstallStatus() {
        return this.InstallStatus;
    }

    /**
     * Set <p>0=待安装,1=成功,2=失败待重试,3=开启中,4=关闭中/已关闭</p>
     * @param InstallStatus <p>0=待安装,1=成功,2=失败待重试,3=开启中,4=关闭中/已关闭</p>
     */
    public void setInstallStatus(Long InstallStatus) {
        this.InstallStatus = InstallStatus;
    }

    /**
     * Get <p>creating/online/isolated/error/</p> 
     * @return MemStatus <p>creating/online/isolated/error/</p>
     */
    public String getMemStatus() {
        return this.MemStatus;
    }

    /**
     * Set <p>creating/online/isolated/error/</p>
     * @param MemStatus <p>creating/online/isolated/error/</p>
     */
    public void setMemStatus(String MemStatus) {
        this.MemStatus = MemStatus;
    }

    public AgentMemInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentMemInfo(AgentMemInfo source) {
        if (source.MemInstanceId != null) {
            this.MemInstanceId = new String(source.MemInstanceId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.InstallStatus != null) {
            this.InstallStatus = new Long(source.InstallStatus);
        }
        if (source.MemStatus != null) {
            this.MemStatus = new String(source.MemStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MemInstanceId", this.MemInstanceId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InstallStatus", this.InstallStatus);
        this.setParamSimple(map, prefix + "MemStatus", this.MemStatus);

    }
}

