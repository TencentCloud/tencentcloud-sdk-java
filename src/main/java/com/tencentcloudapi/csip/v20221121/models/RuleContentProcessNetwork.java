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

public class RuleContentProcessNetwork extends AbstractModel {

    /**
    * <p>当前进程</p>
    */
    @SerializedName("Process")
    @Expose
    private RuleContentProcessInfo Process;

    /**
    * <p>目标IP（必填）: 支持单个IP/IP范围/CIDR, 支持IPv4和IPv6</p>
    */
    @SerializedName("DstIP")
    @Expose
    private String DstIP;

    /**
    * <p>父进程</p>
    */
    @SerializedName("ParentProcess")
    @Expose
    private RuleContentProcessInfo ParentProcess;

    /**
    * <p>目标端口列表（可选）: 支持1-65535, 为空表示不限端口</p>
    */
    @SerializedName("DstPorts")
    @Expose
    private Long [] DstPorts;

    /**
     * Get <p>当前进程</p> 
     * @return Process <p>当前进程</p>
     */
    public RuleContentProcessInfo getProcess() {
        return this.Process;
    }

    /**
     * Set <p>当前进程</p>
     * @param Process <p>当前进程</p>
     */
    public void setProcess(RuleContentProcessInfo Process) {
        this.Process = Process;
    }

    /**
     * Get <p>目标IP（必填）: 支持单个IP/IP范围/CIDR, 支持IPv4和IPv6</p> 
     * @return DstIP <p>目标IP（必填）: 支持单个IP/IP范围/CIDR, 支持IPv4和IPv6</p>
     */
    public String getDstIP() {
        return this.DstIP;
    }

    /**
     * Set <p>目标IP（必填）: 支持单个IP/IP范围/CIDR, 支持IPv4和IPv6</p>
     * @param DstIP <p>目标IP（必填）: 支持单个IP/IP范围/CIDR, 支持IPv4和IPv6</p>
     */
    public void setDstIP(String DstIP) {
        this.DstIP = DstIP;
    }

    /**
     * Get <p>父进程</p> 
     * @return ParentProcess <p>父进程</p>
     */
    public RuleContentProcessInfo getParentProcess() {
        return this.ParentProcess;
    }

    /**
     * Set <p>父进程</p>
     * @param ParentProcess <p>父进程</p>
     */
    public void setParentProcess(RuleContentProcessInfo ParentProcess) {
        this.ParentProcess = ParentProcess;
    }

    /**
     * Get <p>目标端口列表（可选）: 支持1-65535, 为空表示不限端口</p> 
     * @return DstPorts <p>目标端口列表（可选）: 支持1-65535, 为空表示不限端口</p>
     */
    public Long [] getDstPorts() {
        return this.DstPorts;
    }

    /**
     * Set <p>目标端口列表（可选）: 支持1-65535, 为空表示不限端口</p>
     * @param DstPorts <p>目标端口列表（可选）: 支持1-65535, 为空表示不限端口</p>
     */
    public void setDstPorts(Long [] DstPorts) {
        this.DstPorts = DstPorts;
    }

    public RuleContentProcessNetwork() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleContentProcessNetwork(RuleContentProcessNetwork source) {
        if (source.Process != null) {
            this.Process = new RuleContentProcessInfo(source.Process);
        }
        if (source.DstIP != null) {
            this.DstIP = new String(source.DstIP);
        }
        if (source.ParentProcess != null) {
            this.ParentProcess = new RuleContentProcessInfo(source.ParentProcess);
        }
        if (source.DstPorts != null) {
            this.DstPorts = new Long[source.DstPorts.length];
            for (int i = 0; i < source.DstPorts.length; i++) {
                this.DstPorts[i] = new Long(source.DstPorts[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Process.", this.Process);
        this.setParamSimple(map, prefix + "DstIP", this.DstIP);
        this.setParamObj(map, prefix + "ParentProcess.", this.ParentProcess);
        this.setParamArraySimple(map, prefix + "DstPorts.", this.DstPorts);

    }
}

