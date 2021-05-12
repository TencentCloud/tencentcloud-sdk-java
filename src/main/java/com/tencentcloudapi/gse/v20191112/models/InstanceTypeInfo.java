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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceTypeInfo extends AbstractModel{

    /**
    * 类型名，例如“标准型SA1”
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * 类型，例如"SA1.SMALL1"
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * CPU，例如1核就是1
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存，例如2G就是2
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 网络收到包,例如25万PPS就是25
    */
    @SerializedName("NetworkCard")
    @Expose
    private Long NetworkCard;

    /**
     * Get 类型名，例如“标准型SA1” 
     * @return TypeName 类型名，例如“标准型SA1”
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set 类型名，例如“标准型SA1”
     * @param TypeName 类型名，例如“标准型SA1”
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get 类型，例如"SA1.SMALL1" 
     * @return InstanceType 类型，例如"SA1.SMALL1"
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 类型，例如"SA1.SMALL1"
     * @param InstanceType 类型，例如"SA1.SMALL1"
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get CPU，例如1核就是1 
     * @return Cpu CPU，例如1核就是1
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU，例如1核就是1
     * @param Cpu CPU，例如1核就是1
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存，例如2G就是2 
     * @return Memory 内存，例如2G就是2
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存，例如2G就是2
     * @param Memory 内存，例如2G就是2
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 网络收到包,例如25万PPS就是25 
     * @return NetworkCard 网络收到包,例如25万PPS就是25
     */
    public Long getNetworkCard() {
        return this.NetworkCard;
    }

    /**
     * Set 网络收到包,例如25万PPS就是25
     * @param NetworkCard 网络收到包,例如25万PPS就是25
     */
    public void setNetworkCard(Long NetworkCard) {
        this.NetworkCard = NetworkCard;
    }

    public InstanceTypeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceTypeInfo(InstanceTypeInfo source) {
        if (source.TypeName != null) {
            this.TypeName = new String(source.TypeName);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.NetworkCard != null) {
            this.NetworkCard = new Long(source.NetworkCard);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "NetworkCard", this.NetworkCard);

    }
}

