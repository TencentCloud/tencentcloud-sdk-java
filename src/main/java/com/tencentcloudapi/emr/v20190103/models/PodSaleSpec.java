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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PodSaleSpec extends AbstractModel{

    /**
    * 可售卖的资源规格，仅为以下值:"TASK","CORE","MASTER","ROUTER"。
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * Cpu核数。
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存数量，单位为GB。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 该规格资源可申请的最大数量。
    */
    @SerializedName("Number")
    @Expose
    private Long Number;

    /**
     * Get 可售卖的资源规格，仅为以下值:"TASK","CORE","MASTER","ROUTER"。 
     * @return NodeType 可售卖的资源规格，仅为以下值:"TASK","CORE","MASTER","ROUTER"。
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 可售卖的资源规格，仅为以下值:"TASK","CORE","MASTER","ROUTER"。
     * @param NodeType 可售卖的资源规格，仅为以下值:"TASK","CORE","MASTER","ROUTER"。
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get Cpu核数。 
     * @return Cpu Cpu核数。
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Cpu核数。
     * @param Cpu Cpu核数。
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存数量，单位为GB。 
     * @return Memory 内存数量，单位为GB。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存数量，单位为GB。
     * @param Memory 内存数量，单位为GB。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 该规格资源可申请的最大数量。 
     * @return Number 该规格资源可申请的最大数量。
     */
    public Long getNumber() {
        return this.Number;
    }

    /**
     * Set 该规格资源可申请的最大数量。
     * @param Number 该规格资源可申请的最大数量。
     */
    public void setNumber(Long Number) {
        this.Number = Number;
    }

    public PodSaleSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PodSaleSpec(PodSaleSpec source) {
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Number != null) {
            this.Number = new Long(source.Number);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Number", this.Number);

    }
}

