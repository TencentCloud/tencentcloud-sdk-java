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
package com.tencentcloudapi.vdb.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScaleUpInstanceRequest extends AbstractModel {

    /**
    * 指定需升级配置的实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 指定升级配置后的 CPU 核数。
- 节点规格可选项（CPU & 内存）必须 >= 当前配置。
- 可选择的规格信息，请参见[选择节点规格与数量](https://cloud.tencent.com/document/product/1709/113399)。
    */
    @SerializedName("Cpu")
    @Expose
    private Float Cpu;

    /**
    * 指定升级配置后的内存大小，单位为：GB。
- 节点规格可选项（CPU & 内存）必须 >= 当前配置。
- 不同实例类型对 CPU 与内存资源的配置比例有不同的要求。例如，计算型实例，CPU 与内存的分配比例要求为 1:2。CPU 被指定为 4 核，那么内存则应被指定为 8GB。节点规格的详细信息，请参见[选择节点规格与数量](https://cloud.tencent.com/document/product/1709/113399)。

    */
    @SerializedName("Memory")
    @Expose
    private Float Memory;

    /**
    * 指定升级配置后的磁盘容量。
- 单位：GB。
- 取值范围为：[10,1000]。
- 取值必须为10的倍数。
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

    /**
    * 指定垂直扩容升级节点配置的时间。
- false：默认值，指在下一个维护时间段内执行升配节点规格的任务。实例列表中“状态”列将显示“待执行配置变更”，等到维护时间窗内启动任务。维护时间的更多信息，请参见维护时间窗。
- true：立即执行升级配置的任务，请确保此时没有重大业务操作。
    */
    @SerializedName("RunNow")
    @Expose
    private Boolean RunNow;

    /**
     * Get 指定需升级配置的实例 ID。 
     * @return InstanceId 指定需升级配置的实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 指定需升级配置的实例 ID。
     * @param InstanceId 指定需升级配置的实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 指定升级配置后的 CPU 核数。
- 节点规格可选项（CPU & 内存）必须 >= 当前配置。
- 可选择的规格信息，请参见[选择节点规格与数量](https://cloud.tencent.com/document/product/1709/113399)。 
     * @return Cpu 指定升级配置后的 CPU 核数。
- 节点规格可选项（CPU & 内存）必须 >= 当前配置。
- 可选择的规格信息，请参见[选择节点规格与数量](https://cloud.tencent.com/document/product/1709/113399)。
     */
    public Float getCpu() {
        return this.Cpu;
    }

    /**
     * Set 指定升级配置后的 CPU 核数。
- 节点规格可选项（CPU & 内存）必须 >= 当前配置。
- 可选择的规格信息，请参见[选择节点规格与数量](https://cloud.tencent.com/document/product/1709/113399)。
     * @param Cpu 指定升级配置后的 CPU 核数。
- 节点规格可选项（CPU & 内存）必须 >= 当前配置。
- 可选择的规格信息，请参见[选择节点规格与数量](https://cloud.tencent.com/document/product/1709/113399)。
     */
    public void setCpu(Float Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 指定升级配置后的内存大小，单位为：GB。
- 节点规格可选项（CPU & 内存）必须 >= 当前配置。
- 不同实例类型对 CPU 与内存资源的配置比例有不同的要求。例如，计算型实例，CPU 与内存的分配比例要求为 1:2。CPU 被指定为 4 核，那么内存则应被指定为 8GB。节点规格的详细信息，请参见[选择节点规格与数量](https://cloud.tencent.com/document/product/1709/113399)。
 
     * @return Memory 指定升级配置后的内存大小，单位为：GB。
- 节点规格可选项（CPU & 内存）必须 >= 当前配置。
- 不同实例类型对 CPU 与内存资源的配置比例有不同的要求。例如，计算型实例，CPU 与内存的分配比例要求为 1:2。CPU 被指定为 4 核，那么内存则应被指定为 8GB。节点规格的详细信息，请参见[选择节点规格与数量](https://cloud.tencent.com/document/product/1709/113399)。

     */
    public Float getMemory() {
        return this.Memory;
    }

    /**
     * Set 指定升级配置后的内存大小，单位为：GB。
- 节点规格可选项（CPU & 内存）必须 >= 当前配置。
- 不同实例类型对 CPU 与内存资源的配置比例有不同的要求。例如，计算型实例，CPU 与内存的分配比例要求为 1:2。CPU 被指定为 4 核，那么内存则应被指定为 8GB。节点规格的详细信息，请参见[选择节点规格与数量](https://cloud.tencent.com/document/product/1709/113399)。

     * @param Memory 指定升级配置后的内存大小，单位为：GB。
- 节点规格可选项（CPU & 内存）必须 >= 当前配置。
- 不同实例类型对 CPU 与内存资源的配置比例有不同的要求。例如，计算型实例，CPU 与内存的分配比例要求为 1:2。CPU 被指定为 4 核，那么内存则应被指定为 8GB。节点规格的详细信息，请参见[选择节点规格与数量](https://cloud.tencent.com/document/product/1709/113399)。

     */
    public void setMemory(Float Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 指定升级配置后的磁盘容量。
- 单位：GB。
- 取值范围为：[10,1000]。
- 取值必须为10的倍数。 
     * @return StorageSize 指定升级配置后的磁盘容量。
- 单位：GB。
- 取值范围为：[10,1000]。
- 取值必须为10的倍数。
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set 指定升级配置后的磁盘容量。
- 单位：GB。
- 取值范围为：[10,1000]。
- 取值必须为10的倍数。
     * @param StorageSize 指定升级配置后的磁盘容量。
- 单位：GB。
- 取值范围为：[10,1000]。
- 取值必须为10的倍数。
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
    }

    /**
     * Get 指定垂直扩容升级节点配置的时间。
- false：默认值，指在下一个维护时间段内执行升配节点规格的任务。实例列表中“状态”列将显示“待执行配置变更”，等到维护时间窗内启动任务。维护时间的更多信息，请参见维护时间窗。
- true：立即执行升级配置的任务，请确保此时没有重大业务操作。 
     * @return RunNow 指定垂直扩容升级节点配置的时间。
- false：默认值，指在下一个维护时间段内执行升配节点规格的任务。实例列表中“状态”列将显示“待执行配置变更”，等到维护时间窗内启动任务。维护时间的更多信息，请参见维护时间窗。
- true：立即执行升级配置的任务，请确保此时没有重大业务操作。
     */
    public Boolean getRunNow() {
        return this.RunNow;
    }

    /**
     * Set 指定垂直扩容升级节点配置的时间。
- false：默认值，指在下一个维护时间段内执行升配节点规格的任务。实例列表中“状态”列将显示“待执行配置变更”，等到维护时间窗内启动任务。维护时间的更多信息，请参见维护时间窗。
- true：立即执行升级配置的任务，请确保此时没有重大业务操作。
     * @param RunNow 指定垂直扩容升级节点配置的时间。
- false：默认值，指在下一个维护时间段内执行升配节点规格的任务。实例列表中“状态”列将显示“待执行配置变更”，等到维护时间窗内启动任务。维护时间的更多信息，请参见维护时间窗。
- true：立即执行升级配置的任务，请确保此时没有重大业务操作。
     */
    public void setRunNow(Boolean RunNow) {
        this.RunNow = RunNow;
    }

    public ScaleUpInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScaleUpInstanceRequest(ScaleUpInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Cpu != null) {
            this.Cpu = new Float(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Float(source.Memory);
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
        }
        if (source.RunNow != null) {
            this.RunNow = new Boolean(source.RunNow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamSimple(map, prefix + "RunNow", this.RunNow);

    }
}

