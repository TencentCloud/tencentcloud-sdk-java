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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PodChargeInfo extends AbstractModel {

    /**
    * Pod计费开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Pod的Uid
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * Pod的CPU
    */
    @SerializedName("Cpu")
    @Expose
    private Float Cpu;

    /**
    * Pod的内存
    */
    @SerializedName("Memory")
    @Expose
    private Float Memory;

    /**
    * Pod类型：intel、amd、v100、t4、a10\*gnv4、a10\*gnv4v等。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Pod是GPU时，表示GPU卡数
    */
    @SerializedName("Gpu")
    @Expose
    private String Gpu;

    /**
    * 计费类型
PREPAID：Pod调度到包月超级节点
POSTPAID_BY_HOUR：按量计费
RESERVED_INSTANCE：上个周期被预留券抵扣
SPOT：竞价实例
TPOD：特惠实例
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Pod名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get Pod计费开始时间 
     * @return StartTime Pod计费开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Pod计费开始时间
     * @param StartTime Pod计费开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Pod的Uid 
     * @return Uid Pod的Uid
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set Pod的Uid
     * @param Uid Pod的Uid
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get Pod的CPU 
     * @return Cpu Pod的CPU
     */
    public Float getCpu() {
        return this.Cpu;
    }

    /**
     * Set Pod的CPU
     * @param Cpu Pod的CPU
     */
    public void setCpu(Float Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Pod的内存 
     * @return Memory Pod的内存
     */
    public Float getMemory() {
        return this.Memory;
    }

    /**
     * Set Pod的内存
     * @param Memory Pod的内存
     */
    public void setMemory(Float Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Pod类型：intel、amd、v100、t4、a10\*gnv4、a10\*gnv4v等。 
     * @return Type Pod类型：intel、amd、v100、t4、a10\*gnv4、a10\*gnv4v等。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Pod类型：intel、amd、v100、t4、a10\*gnv4、a10\*gnv4v等。
     * @param Type Pod类型：intel、amd、v100、t4、a10\*gnv4、a10\*gnv4v等。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Pod是GPU时，表示GPU卡数 
     * @return Gpu Pod是GPU时，表示GPU卡数
     */
    public String getGpu() {
        return this.Gpu;
    }

    /**
     * Set Pod是GPU时，表示GPU卡数
     * @param Gpu Pod是GPU时，表示GPU卡数
     */
    public void setGpu(String Gpu) {
        this.Gpu = Gpu;
    }

    /**
     * Get 计费类型
PREPAID：Pod调度到包月超级节点
POSTPAID_BY_HOUR：按量计费
RESERVED_INSTANCE：上个周期被预留券抵扣
SPOT：竞价实例
TPOD：特惠实例 
     * @return ChargeType 计费类型
PREPAID：Pod调度到包月超级节点
POSTPAID_BY_HOUR：按量计费
RESERVED_INSTANCE：上个周期被预留券抵扣
SPOT：竞价实例
TPOD：特惠实例
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 计费类型
PREPAID：Pod调度到包月超级节点
POSTPAID_BY_HOUR：按量计费
RESERVED_INSTANCE：上个周期被预留券抵扣
SPOT：竞价实例
TPOD：特惠实例
     * @param ChargeType 计费类型
PREPAID：Pod调度到包月超级节点
POSTPAID_BY_HOUR：按量计费
RESERVED_INSTANCE：上个周期被预留券抵扣
SPOT：竞价实例
TPOD：特惠实例
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 命名空间 
     * @return Namespace 命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
     * @param Namespace 命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Pod名称 
     * @return Name Pod名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Pod名称
     * @param Name Pod名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public PodChargeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PodChargeInfo(PodChargeInfo source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Uid != null) {
            this.Uid = new String(source.Uid);
        }
        if (source.Cpu != null) {
            this.Cpu = new Float(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Float(source.Memory);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Gpu != null) {
            this.Gpu = new String(source.Gpu);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Gpu", this.Gpu);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

