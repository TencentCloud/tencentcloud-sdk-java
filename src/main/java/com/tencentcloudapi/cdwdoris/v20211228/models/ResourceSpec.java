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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceSpec extends AbstractModel {

    /**
    * <p>规格名称，例如“SCH1&quot;</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>cpu核数</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>内存大小，单位G</p>
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * <p>分类标记，STANDARD/BIGDATA/HIGHIO分别表示标准型/大数据型/高IO</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>系统盘描述信息</p>
    */
    @SerializedName("SystemDisk")
    @Expose
    private DiskSpec SystemDisk;

    /**
    * <p>数据盘描述信息</p>
    */
    @SerializedName("DataDisk")
    @Expose
    private DiskSpec DataDisk;

    /**
    * <p>最大节点数目限制</p>
    */
    @SerializedName("MaxNodeSize")
    @Expose
    private Long MaxNodeSize;

    /**
    * <p>是否可用，false代表售罄</p>
    */
    @SerializedName("Available")
    @Expose
    private Boolean Available;

    /**
    * <p>规格描述信息</p>
    */
    @SerializedName("ComputeSpecDesc")
    @Expose
    private String ComputeSpecDesc;

    /**
    * <p>cvm库存</p>
    */
    @SerializedName("InstanceQuota")
    @Expose
    private Long InstanceQuota;

    /**
    * <p>计算组ID自定义后缀。1到8位小写字母、数字或连字符，首尾须为字母或数字；不传则随机生成8位后缀。最终计算组ID格式为实例ID-后缀，同时作为内核计算组名</p>
    */
    @SerializedName("ComputeGroupSuffix")
    @Expose
    private String ComputeGroupSuffix;

    /**
     * Get <p>规格名称，例如“SCH1&quot;</p> 
     * @return Name <p>规格名称，例如“SCH1&quot;</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>规格名称，例如“SCH1&quot;</p>
     * @param Name <p>规格名称，例如“SCH1&quot;</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>cpu核数</p> 
     * @return Cpu <p>cpu核数</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>cpu核数</p>
     * @param Cpu <p>cpu核数</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>内存大小，单位G</p> 
     * @return Mem <p>内存大小，单位G</p>
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set <p>内存大小，单位G</p>
     * @param Mem <p>内存大小，单位G</p>
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get <p>分类标记，STANDARD/BIGDATA/HIGHIO分别表示标准型/大数据型/高IO</p> 
     * @return Type <p>分类标记，STANDARD/BIGDATA/HIGHIO分别表示标准型/大数据型/高IO</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>分类标记，STANDARD/BIGDATA/HIGHIO分别表示标准型/大数据型/高IO</p>
     * @param Type <p>分类标记，STANDARD/BIGDATA/HIGHIO分别表示标准型/大数据型/高IO</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>系统盘描述信息</p> 
     * @return SystemDisk <p>系统盘描述信息</p>
     */
    public DiskSpec getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set <p>系统盘描述信息</p>
     * @param SystemDisk <p>系统盘描述信息</p>
     */
    public void setSystemDisk(DiskSpec SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get <p>数据盘描述信息</p> 
     * @return DataDisk <p>数据盘描述信息</p>
     */
    public DiskSpec getDataDisk() {
        return this.DataDisk;
    }

    /**
     * Set <p>数据盘描述信息</p>
     * @param DataDisk <p>数据盘描述信息</p>
     */
    public void setDataDisk(DiskSpec DataDisk) {
        this.DataDisk = DataDisk;
    }

    /**
     * Get <p>最大节点数目限制</p> 
     * @return MaxNodeSize <p>最大节点数目限制</p>
     */
    public Long getMaxNodeSize() {
        return this.MaxNodeSize;
    }

    /**
     * Set <p>最大节点数目限制</p>
     * @param MaxNodeSize <p>最大节点数目限制</p>
     */
    public void setMaxNodeSize(Long MaxNodeSize) {
        this.MaxNodeSize = MaxNodeSize;
    }

    /**
     * Get <p>是否可用，false代表售罄</p> 
     * @return Available <p>是否可用，false代表售罄</p>
     */
    public Boolean getAvailable() {
        return this.Available;
    }

    /**
     * Set <p>是否可用，false代表售罄</p>
     * @param Available <p>是否可用，false代表售罄</p>
     */
    public void setAvailable(Boolean Available) {
        this.Available = Available;
    }

    /**
     * Get <p>规格描述信息</p> 
     * @return ComputeSpecDesc <p>规格描述信息</p>
     */
    public String getComputeSpecDesc() {
        return this.ComputeSpecDesc;
    }

    /**
     * Set <p>规格描述信息</p>
     * @param ComputeSpecDesc <p>规格描述信息</p>
     */
    public void setComputeSpecDesc(String ComputeSpecDesc) {
        this.ComputeSpecDesc = ComputeSpecDesc;
    }

    /**
     * Get <p>cvm库存</p> 
     * @return InstanceQuota <p>cvm库存</p>
     */
    public Long getInstanceQuota() {
        return this.InstanceQuota;
    }

    /**
     * Set <p>cvm库存</p>
     * @param InstanceQuota <p>cvm库存</p>
     */
    public void setInstanceQuota(Long InstanceQuota) {
        this.InstanceQuota = InstanceQuota;
    }

    /**
     * Get <p>计算组ID自定义后缀。1到8位小写字母、数字或连字符，首尾须为字母或数字；不传则随机生成8位后缀。最终计算组ID格式为实例ID-后缀，同时作为内核计算组名</p> 
     * @return ComputeGroupSuffix <p>计算组ID自定义后缀。1到8位小写字母、数字或连字符，首尾须为字母或数字；不传则随机生成8位后缀。最终计算组ID格式为实例ID-后缀，同时作为内核计算组名</p>
     */
    public String getComputeGroupSuffix() {
        return this.ComputeGroupSuffix;
    }

    /**
     * Set <p>计算组ID自定义后缀。1到8位小写字母、数字或连字符，首尾须为字母或数字；不传则随机生成8位后缀。最终计算组ID格式为实例ID-后缀，同时作为内核计算组名</p>
     * @param ComputeGroupSuffix <p>计算组ID自定义后缀。1到8位小写字母、数字或连字符，首尾须为字母或数字；不传则随机生成8位后缀。最终计算组ID格式为实例ID-后缀，同时作为内核计算组名</p>
     */
    public void setComputeGroupSuffix(String ComputeGroupSuffix) {
        this.ComputeGroupSuffix = ComputeGroupSuffix;
    }

    public ResourceSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceSpec(ResourceSpec source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Long(source.Mem);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new DiskSpec(source.SystemDisk);
        }
        if (source.DataDisk != null) {
            this.DataDisk = new DiskSpec(source.DataDisk);
        }
        if (source.MaxNodeSize != null) {
            this.MaxNodeSize = new Long(source.MaxNodeSize);
        }
        if (source.Available != null) {
            this.Available = new Boolean(source.Available);
        }
        if (source.ComputeSpecDesc != null) {
            this.ComputeSpecDesc = new String(source.ComputeSpecDesc);
        }
        if (source.InstanceQuota != null) {
            this.InstanceQuota = new Long(source.InstanceQuota);
        }
        if (source.ComputeGroupSuffix != null) {
            this.ComputeGroupSuffix = new String(source.ComputeGroupSuffix);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamObj(map, prefix + "DataDisk.", this.DataDisk);
        this.setParamSimple(map, prefix + "MaxNodeSize", this.MaxNodeSize);
        this.setParamSimple(map, prefix + "Available", this.Available);
        this.setParamSimple(map, prefix + "ComputeSpecDesc", this.ComputeSpecDesc);
        this.setParamSimple(map, prefix + "InstanceQuota", this.InstanceQuota);
        this.setParamSimple(map, prefix + "ComputeGroupSuffix", this.ComputeGroupSuffix);

    }
}

