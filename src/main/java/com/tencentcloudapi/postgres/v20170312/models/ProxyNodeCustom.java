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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyNodeCustom extends AbstractModel {

    /**
    * <p>该可用区下的 Proxy 节点数量</p><p>取值范围：[1, 16]</p>
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * <p>Proxy 节点所在可用区</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>Proxy 节点 CPU 核数（核）</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>Proxy 节点内存大小（MB）</p><p>单位：MB</p>
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
     * Get <p>该可用区下的 Proxy 节点数量</p><p>取值范围：[1, 16]</p> 
     * @return NodeCount <p>该可用区下的 Proxy 节点数量</p><p>取值范围：[1, 16]</p>
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set <p>该可用区下的 Proxy 节点数量</p><p>取值范围：[1, 16]</p>
     * @param NodeCount <p>该可用区下的 Proxy 节点数量</p><p>取值范围：[1, 16]</p>
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get <p>Proxy 节点所在可用区</p> 
     * @return Zone <p>Proxy 节点所在可用区</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>Proxy 节点所在可用区</p>
     * @param Zone <p>Proxy 节点所在可用区</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>Proxy 节点 CPU 核数（核）</p> 
     * @return Cpu <p>Proxy 节点 CPU 核数（核）</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>Proxy 节点 CPU 核数（核）</p>
     * @param Cpu <p>Proxy 节点 CPU 核数（核）</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>Proxy 节点内存大小（MB）</p><p>单位：MB</p> 
     * @return Mem <p>Proxy 节点内存大小（MB）</p><p>单位：MB</p>
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set <p>Proxy 节点内存大小（MB）</p><p>单位：MB</p>
     * @param Mem <p>Proxy 节点内存大小（MB）</p><p>单位：MB</p>
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    public ProxyNodeCustom() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyNodeCustom(ProxyNodeCustom source) {
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Long(source.Mem);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);

    }
}

