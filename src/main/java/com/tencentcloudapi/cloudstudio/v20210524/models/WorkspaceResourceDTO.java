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
package com.tencentcloudapi.cloudstudio.v20210524.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkspaceResourceDTO extends AbstractModel{

    /**
    * CPU核心数
    */
    @SerializedName("CpuCoreNumber")
    @Expose
    private Long CpuCoreNumber;

    /**
    * 一般内存
    */
    @SerializedName("NormalMemory")
    @Expose
    private Long NormalMemory;

    /**
    * 系统存储
    */
    @SerializedName("SystemStorage")
    @Expose
    private Long SystemStorage;

    /**
    * 用户存储
    */
    @SerializedName("UserStorage")
    @Expose
    private Long UserStorage;

    /**
    * GPU数
    */
    @SerializedName("GpuNumber")
    @Expose
    private Long GpuNumber;

    /**
    * GPU内存
    */
    @SerializedName("GpuMemory")
    @Expose
    private Long GpuMemory;

    /**
     * Get CPU核心数 
     * @return CpuCoreNumber CPU核心数
     */
    public Long getCpuCoreNumber() {
        return this.CpuCoreNumber;
    }

    /**
     * Set CPU核心数
     * @param CpuCoreNumber CPU核心数
     */
    public void setCpuCoreNumber(Long CpuCoreNumber) {
        this.CpuCoreNumber = CpuCoreNumber;
    }

    /**
     * Get 一般内存 
     * @return NormalMemory 一般内存
     */
    public Long getNormalMemory() {
        return this.NormalMemory;
    }

    /**
     * Set 一般内存
     * @param NormalMemory 一般内存
     */
    public void setNormalMemory(Long NormalMemory) {
        this.NormalMemory = NormalMemory;
    }

    /**
     * Get 系统存储 
     * @return SystemStorage 系统存储
     */
    public Long getSystemStorage() {
        return this.SystemStorage;
    }

    /**
     * Set 系统存储
     * @param SystemStorage 系统存储
     */
    public void setSystemStorage(Long SystemStorage) {
        this.SystemStorage = SystemStorage;
    }

    /**
     * Get 用户存储 
     * @return UserStorage 用户存储
     */
    public Long getUserStorage() {
        return this.UserStorage;
    }

    /**
     * Set 用户存储
     * @param UserStorage 用户存储
     */
    public void setUserStorage(Long UserStorage) {
        this.UserStorage = UserStorage;
    }

    /**
     * Get GPU数 
     * @return GpuNumber GPU数
     */
    public Long getGpuNumber() {
        return this.GpuNumber;
    }

    /**
     * Set GPU数
     * @param GpuNumber GPU数
     */
    public void setGpuNumber(Long GpuNumber) {
        this.GpuNumber = GpuNumber;
    }

    /**
     * Get GPU内存 
     * @return GpuMemory GPU内存
     */
    public Long getGpuMemory() {
        return this.GpuMemory;
    }

    /**
     * Set GPU内存
     * @param GpuMemory GPU内存
     */
    public void setGpuMemory(Long GpuMemory) {
        this.GpuMemory = GpuMemory;
    }

    public WorkspaceResourceDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkspaceResourceDTO(WorkspaceResourceDTO source) {
        if (source.CpuCoreNumber != null) {
            this.CpuCoreNumber = new Long(source.CpuCoreNumber);
        }
        if (source.NormalMemory != null) {
            this.NormalMemory = new Long(source.NormalMemory);
        }
        if (source.SystemStorage != null) {
            this.SystemStorage = new Long(source.SystemStorage);
        }
        if (source.UserStorage != null) {
            this.UserStorage = new Long(source.UserStorage);
        }
        if (source.GpuNumber != null) {
            this.GpuNumber = new Long(source.GpuNumber);
        }
        if (source.GpuMemory != null) {
            this.GpuMemory = new Long(source.GpuMemory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CpuCoreNumber", this.CpuCoreNumber);
        this.setParamSimple(map, prefix + "NormalMemory", this.NormalMemory);
        this.setParamSimple(map, prefix + "SystemStorage", this.SystemStorage);
        this.setParamSimple(map, prefix + "UserStorage", this.UserStorage);
        this.setParamSimple(map, prefix + "GpuNumber", this.GpuNumber);
        this.setParamSimple(map, prefix + "GpuMemory", this.GpuMemory);

    }
}

