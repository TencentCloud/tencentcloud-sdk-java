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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskAdvanceCFG extends AbstractModel {

    /**
    * 端口风险高级配置
    */
    @SerializedName("PortRisk")
    @Expose
    private PortRiskAdvanceCFGParamItem [] PortRisk;

    /**
    * 漏洞风险高级配置
    */
    @SerializedName("VulRisk")
    @Expose
    private TaskCenterVulRiskInputParam [] VulRisk;

    /**
    * 弱口令风险高级配置
    */
    @SerializedName("WeakPwdRisk")
    @Expose
    private TaskCenterWeakPwdRiskInputParam [] WeakPwdRisk;

    /**
    * 配置风险高级配置
    */
    @SerializedName("CFGRisk")
    @Expose
    private TaskCenterCFGRiskInputParam [] CFGRisk;

    /**
     * Get 端口风险高级配置 
     * @return PortRisk 端口风险高级配置
     */
    public PortRiskAdvanceCFGParamItem [] getPortRisk() {
        return this.PortRisk;
    }

    /**
     * Set 端口风险高级配置
     * @param PortRisk 端口风险高级配置
     */
    public void setPortRisk(PortRiskAdvanceCFGParamItem [] PortRisk) {
        this.PortRisk = PortRisk;
    }

    /**
     * Get 漏洞风险高级配置 
     * @return VulRisk 漏洞风险高级配置
     */
    public TaskCenterVulRiskInputParam [] getVulRisk() {
        return this.VulRisk;
    }

    /**
     * Set 漏洞风险高级配置
     * @param VulRisk 漏洞风险高级配置
     */
    public void setVulRisk(TaskCenterVulRiskInputParam [] VulRisk) {
        this.VulRisk = VulRisk;
    }

    /**
     * Get 弱口令风险高级配置 
     * @return WeakPwdRisk 弱口令风险高级配置
     */
    public TaskCenterWeakPwdRiskInputParam [] getWeakPwdRisk() {
        return this.WeakPwdRisk;
    }

    /**
     * Set 弱口令风险高级配置
     * @param WeakPwdRisk 弱口令风险高级配置
     */
    public void setWeakPwdRisk(TaskCenterWeakPwdRiskInputParam [] WeakPwdRisk) {
        this.WeakPwdRisk = WeakPwdRisk;
    }

    /**
     * Get 配置风险高级配置 
     * @return CFGRisk 配置风险高级配置
     */
    public TaskCenterCFGRiskInputParam [] getCFGRisk() {
        return this.CFGRisk;
    }

    /**
     * Set 配置风险高级配置
     * @param CFGRisk 配置风险高级配置
     */
    public void setCFGRisk(TaskCenterCFGRiskInputParam [] CFGRisk) {
        this.CFGRisk = CFGRisk;
    }

    public TaskAdvanceCFG() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskAdvanceCFG(TaskAdvanceCFG source) {
        if (source.PortRisk != null) {
            this.PortRisk = new PortRiskAdvanceCFGParamItem[source.PortRisk.length];
            for (int i = 0; i < source.PortRisk.length; i++) {
                this.PortRisk[i] = new PortRiskAdvanceCFGParamItem(source.PortRisk[i]);
            }
        }
        if (source.VulRisk != null) {
            this.VulRisk = new TaskCenterVulRiskInputParam[source.VulRisk.length];
            for (int i = 0; i < source.VulRisk.length; i++) {
                this.VulRisk[i] = new TaskCenterVulRiskInputParam(source.VulRisk[i]);
            }
        }
        if (source.WeakPwdRisk != null) {
            this.WeakPwdRisk = new TaskCenterWeakPwdRiskInputParam[source.WeakPwdRisk.length];
            for (int i = 0; i < source.WeakPwdRisk.length; i++) {
                this.WeakPwdRisk[i] = new TaskCenterWeakPwdRiskInputParam(source.WeakPwdRisk[i]);
            }
        }
        if (source.CFGRisk != null) {
            this.CFGRisk = new TaskCenterCFGRiskInputParam[source.CFGRisk.length];
            for (int i = 0; i < source.CFGRisk.length; i++) {
                this.CFGRisk[i] = new TaskCenterCFGRiskInputParam(source.CFGRisk[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "PortRisk.", this.PortRisk);
        this.setParamArrayObj(map, prefix + "VulRisk.", this.VulRisk);
        this.setParamArrayObj(map, prefix + "WeakPwdRisk.", this.WeakPwdRisk);
        this.setParamArrayObj(map, prefix + "CFGRisk.", this.CFGRisk);

    }
}

