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

public class ScanTaskAgainRequest extends AbstractModel{

    /**
    * 模块类型 当前提供 Malware 木马 , Vul 漏洞 , Baseline 基线
    */
    @SerializedName("ModuleType")
    @Expose
    private String ModuleType;

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 自选服务器时生效，主机quuid的string数组
    */
    @SerializedName("QuuidList")
    @Expose
    private String [] QuuidList;

    /**
    * 扫描超时时长
    */
    @SerializedName("TimeoutPeriod")
    @Expose
    private Long TimeoutPeriod;

    /**
     * Get 模块类型 当前提供 Malware 木马 , Vul 漏洞 , Baseline 基线 
     * @return ModuleType 模块类型 当前提供 Malware 木马 , Vul 漏洞 , Baseline 基线
     */
    public String getModuleType() {
        return this.ModuleType;
    }

    /**
     * Set 模块类型 当前提供 Malware 木马 , Vul 漏洞 , Baseline 基线
     * @param ModuleType 模块类型 当前提供 Malware 木马 , Vul 漏洞 , Baseline 基线
     */
    public void setModuleType(String ModuleType) {
        this.ModuleType = ModuleType;
    }

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 自选服务器时生效，主机quuid的string数组 
     * @return QuuidList 自选服务器时生效，主机quuid的string数组
     */
    public String [] getQuuidList() {
        return this.QuuidList;
    }

    /**
     * Set 自选服务器时生效，主机quuid的string数组
     * @param QuuidList 自选服务器时生效，主机quuid的string数组
     */
    public void setQuuidList(String [] QuuidList) {
        this.QuuidList = QuuidList;
    }

    /**
     * Get 扫描超时时长 
     * @return TimeoutPeriod 扫描超时时长
     */
    public Long getTimeoutPeriod() {
        return this.TimeoutPeriod;
    }

    /**
     * Set 扫描超时时长
     * @param TimeoutPeriod 扫描超时时长
     */
    public void setTimeoutPeriod(Long TimeoutPeriod) {
        this.TimeoutPeriod = TimeoutPeriod;
    }

    public ScanTaskAgainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanTaskAgainRequest(ScanTaskAgainRequest source) {
        if (source.ModuleType != null) {
            this.ModuleType = new String(source.ModuleType);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.QuuidList != null) {
            this.QuuidList = new String[source.QuuidList.length];
            for (int i = 0; i < source.QuuidList.length; i++) {
                this.QuuidList[i] = new String(source.QuuidList[i]);
            }
        }
        if (source.TimeoutPeriod != null) {
            this.TimeoutPeriod = new Long(source.TimeoutPeriod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModuleType", this.ModuleType);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArraySimple(map, prefix + "QuuidList.", this.QuuidList);
        this.setParamSimple(map, prefix + "TimeoutPeriod", this.TimeoutPeriod);

    }
}

