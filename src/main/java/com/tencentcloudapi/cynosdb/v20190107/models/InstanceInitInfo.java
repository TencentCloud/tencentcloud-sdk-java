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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceInitInfo extends AbstractModel {

    /**
    * <p>实例cpu</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>实例内存</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>实例类型 rw/ro</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>实例个数,范围[1,15]</p>
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * <p>Serverless实例个数最小值，范围[1,15]</p>
    */
    @SerializedName("MinRoCount")
    @Expose
    private Long MinRoCount;

    /**
    * <p>Serverless实例个数最大值，范围[1,15]</p>
    */
    @SerializedName("MaxRoCount")
    @Expose
    private Long MaxRoCount;

    /**
    * <p>Serverless实例最小规格</p>
    */
    @SerializedName("MinRoCpu")
    @Expose
    private Float MinRoCpu;

    /**
    * <p>Serverless实例最大规格</p>
    */
    @SerializedName("MaxRoCpu")
    @Expose
    private Float MaxRoCpu;

    /**
    * <p>实例机器类型</p><ol><li>common，通用型。</li><li>exclusive，独享型。</li></ol>
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
     * Get <p>实例cpu</p> 
     * @return Cpu <p>实例cpu</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>实例cpu</p>
     * @param Cpu <p>实例cpu</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>实例内存</p> 
     * @return Memory <p>实例内存</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>实例内存</p>
     * @param Memory <p>实例内存</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>实例类型 rw/ro</p> 
     * @return InstanceType <p>实例类型 rw/ro</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例类型 rw/ro</p>
     * @param InstanceType <p>实例类型 rw/ro</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>实例个数,范围[1,15]</p> 
     * @return InstanceCount <p>实例个数,范围[1,15]</p>
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set <p>实例个数,范围[1,15]</p>
     * @param InstanceCount <p>实例个数,范围[1,15]</p>
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get <p>Serverless实例个数最小值，范围[1,15]</p> 
     * @return MinRoCount <p>Serverless实例个数最小值，范围[1,15]</p>
     */
    public Long getMinRoCount() {
        return this.MinRoCount;
    }

    /**
     * Set <p>Serverless实例个数最小值，范围[1,15]</p>
     * @param MinRoCount <p>Serverless实例个数最小值，范围[1,15]</p>
     */
    public void setMinRoCount(Long MinRoCount) {
        this.MinRoCount = MinRoCount;
    }

    /**
     * Get <p>Serverless实例个数最大值，范围[1,15]</p> 
     * @return MaxRoCount <p>Serverless实例个数最大值，范围[1,15]</p>
     */
    public Long getMaxRoCount() {
        return this.MaxRoCount;
    }

    /**
     * Set <p>Serverless实例个数最大值，范围[1,15]</p>
     * @param MaxRoCount <p>Serverless实例个数最大值，范围[1,15]</p>
     */
    public void setMaxRoCount(Long MaxRoCount) {
        this.MaxRoCount = MaxRoCount;
    }

    /**
     * Get <p>Serverless实例最小规格</p> 
     * @return MinRoCpu <p>Serverless实例最小规格</p>
     */
    public Float getMinRoCpu() {
        return this.MinRoCpu;
    }

    /**
     * Set <p>Serverless实例最小规格</p>
     * @param MinRoCpu <p>Serverless实例最小规格</p>
     */
    public void setMinRoCpu(Float MinRoCpu) {
        this.MinRoCpu = MinRoCpu;
    }

    /**
     * Get <p>Serverless实例最大规格</p> 
     * @return MaxRoCpu <p>Serverless实例最大规格</p>
     */
    public Float getMaxRoCpu() {
        return this.MaxRoCpu;
    }

    /**
     * Set <p>Serverless实例最大规格</p>
     * @param MaxRoCpu <p>Serverless实例最大规格</p>
     */
    public void setMaxRoCpu(Float MaxRoCpu) {
        this.MaxRoCpu = MaxRoCpu;
    }

    /**
     * Get <p>实例机器类型</p><ol><li>common，通用型。</li><li>exclusive，独享型。</li></ol> 
     * @return DeviceType <p>实例机器类型</p><ol><li>common，通用型。</li><li>exclusive，独享型。</li></ol>
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set <p>实例机器类型</p><ol><li>common，通用型。</li><li>exclusive，独享型。</li></ol>
     * @param DeviceType <p>实例机器类型</p><ol><li>common，通用型。</li><li>exclusive，独享型。</li></ol>
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    public InstanceInitInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceInitInfo(InstanceInitInfo source) {
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.MinRoCount != null) {
            this.MinRoCount = new Long(source.MinRoCount);
        }
        if (source.MaxRoCount != null) {
            this.MaxRoCount = new Long(source.MaxRoCount);
        }
        if (source.MinRoCpu != null) {
            this.MinRoCpu = new Float(source.MinRoCpu);
        }
        if (source.MaxRoCpu != null) {
            this.MaxRoCpu = new Float(source.MaxRoCpu);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "MinRoCount", this.MinRoCount);
        this.setParamSimple(map, prefix + "MaxRoCount", this.MaxRoCount);
        this.setParamSimple(map, prefix + "MinRoCpu", this.MinRoCpu);
        this.setParamSimple(map, prefix + "MaxRoCpu", this.MaxRoCpu);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);

    }
}

