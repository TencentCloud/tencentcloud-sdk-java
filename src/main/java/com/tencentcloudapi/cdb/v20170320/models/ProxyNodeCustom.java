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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyNodeCustom extends AbstractModel{

    /**
    * 节点个数
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * CPU核数
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存大小
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get 节点个数 
     * @return NodeCount 节点个数
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set 节点个数
     * @param NodeCount 节点个数
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get CPU核数 
     * @return Cpu CPU核数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU核数
     * @param Cpu CPU核数
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存大小 
     * @return Mem 内存大小
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set 内存大小
     * @param Mem 内存大小
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
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
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Long(source.Mem);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

