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

public class ModifyPGInstanceSpecRequest extends AbstractModel {

    /**
    * <p>环境 id</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>cpu 核数</p><p>单位：核数</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>内存容量</p><p>单位：GB</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>磁盘容量</p><p>单位：GB</p>
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * <p>类型</p><p>枚举值：</p><ul><li>0： 立即执行</li><li>1： 指定时间执行</li><li>2： 维护时间执行</li></ul>
    */
    @SerializedName("SwitchTag")
    @Expose
    private Long SwitchTag;

    /**
    * <p>SwitchTag=1 时，启动时间</p><p>参数格式：YYYY-MM-dd HH:mm:ss</p>
    */
    @SerializedName("SwitchStartTime")
    @Expose
    private String SwitchStartTime;

    /**
    * <p>SwitchTag=1 时结束时间</p><p>参数格式：YYYY-MM-dd HH:mm:ss</p>
    */
    @SerializedName("SwitchEndTime")
    @Expose
    private String SwitchEndTime;

    /**
    * <p>预检</p>
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
     * Get <p>环境 id</p> 
     * @return EnvId <p>环境 id</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>环境 id</p>
     * @param EnvId <p>环境 id</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get <p>cpu 核数</p><p>单位：核数</p> 
     * @return Cpu <p>cpu 核数</p><p>单位：核数</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>cpu 核数</p><p>单位：核数</p>
     * @param Cpu <p>cpu 核数</p><p>单位：核数</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>内存容量</p><p>单位：GB</p> 
     * @return Memory <p>内存容量</p><p>单位：GB</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>内存容量</p><p>单位：GB</p>
     * @param Memory <p>内存容量</p><p>单位：GB</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>磁盘容量</p><p>单位：GB</p> 
     * @return Storage <p>磁盘容量</p><p>单位：GB</p>
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>磁盘容量</p><p>单位：GB</p>
     * @param Storage <p>磁盘容量</p><p>单位：GB</p>
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>类型</p><p>枚举值：</p><ul><li>0： 立即执行</li><li>1： 指定时间执行</li><li>2： 维护时间执行</li></ul> 
     * @return SwitchTag <p>类型</p><p>枚举值：</p><ul><li>0： 立即执行</li><li>1： 指定时间执行</li><li>2： 维护时间执行</li></ul>
     */
    public Long getSwitchTag() {
        return this.SwitchTag;
    }

    /**
     * Set <p>类型</p><p>枚举值：</p><ul><li>0： 立即执行</li><li>1： 指定时间执行</li><li>2： 维护时间执行</li></ul>
     * @param SwitchTag <p>类型</p><p>枚举值：</p><ul><li>0： 立即执行</li><li>1： 指定时间执行</li><li>2： 维护时间执行</li></ul>
     */
    public void setSwitchTag(Long SwitchTag) {
        this.SwitchTag = SwitchTag;
    }

    /**
     * Get <p>SwitchTag=1 时，启动时间</p><p>参数格式：YYYY-MM-dd HH:mm:ss</p> 
     * @return SwitchStartTime <p>SwitchTag=1 时，启动时间</p><p>参数格式：YYYY-MM-dd HH:mm:ss</p>
     */
    public String getSwitchStartTime() {
        return this.SwitchStartTime;
    }

    /**
     * Set <p>SwitchTag=1 时，启动时间</p><p>参数格式：YYYY-MM-dd HH:mm:ss</p>
     * @param SwitchStartTime <p>SwitchTag=1 时，启动时间</p><p>参数格式：YYYY-MM-dd HH:mm:ss</p>
     */
    public void setSwitchStartTime(String SwitchStartTime) {
        this.SwitchStartTime = SwitchStartTime;
    }

    /**
     * Get <p>SwitchTag=1 时结束时间</p><p>参数格式：YYYY-MM-dd HH:mm:ss</p> 
     * @return SwitchEndTime <p>SwitchTag=1 时结束时间</p><p>参数格式：YYYY-MM-dd HH:mm:ss</p>
     */
    public String getSwitchEndTime() {
        return this.SwitchEndTime;
    }

    /**
     * Set <p>SwitchTag=1 时结束时间</p><p>参数格式：YYYY-MM-dd HH:mm:ss</p>
     * @param SwitchEndTime <p>SwitchTag=1 时结束时间</p><p>参数格式：YYYY-MM-dd HH:mm:ss</p>
     */
    public void setSwitchEndTime(String SwitchEndTime) {
        this.SwitchEndTime = SwitchEndTime;
    }

    /**
     * Get <p>预检</p> 
     * @return DryRun <p>预检</p>
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set <p>预检</p>
     * @param DryRun <p>预检</p>
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    public ModifyPGInstanceSpecRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPGInstanceSpecRequest(ModifyPGInstanceSpecRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.SwitchTag != null) {
            this.SwitchTag = new Long(source.SwitchTag);
        }
        if (source.SwitchStartTime != null) {
            this.SwitchStartTime = new String(source.SwitchStartTime);
        }
        if (source.SwitchEndTime != null) {
            this.SwitchEndTime = new String(source.SwitchEndTime);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "SwitchTag", this.SwitchTag);
        this.setParamSimple(map, prefix + "SwitchStartTime", this.SwitchStartTime);
        this.setParamSimple(map, prefix + "SwitchEndTime", this.SwitchEndTime);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);

    }
}

