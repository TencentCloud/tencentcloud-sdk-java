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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePriceRunInstanceRequest extends AbstractModel{

    /**
    * 实例的机型信息
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 系统盘信息
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * 实例个数
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 数据盘信息
    */
    @SerializedName("DataDisk")
    @Expose
    private DataDisk [] DataDisk;

    /**
     * Get 实例的机型信息 
     * @return InstanceType 实例的机型信息
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例的机型信息
     * @param InstanceType 实例的机型信息
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 系统盘信息 
     * @return SystemDisk 系统盘信息
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set 系统盘信息
     * @param SystemDisk 系统盘信息
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get 实例个数 
     * @return InstanceCount 实例个数
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 实例个数
     * @param InstanceCount 实例个数
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get 数据盘信息 
     * @return DataDisk 数据盘信息
     */
    public DataDisk [] getDataDisk() {
        return this.DataDisk;
    }

    /**
     * Set 数据盘信息
     * @param DataDisk 数据盘信息
     */
    public void setDataDisk(DataDisk [] DataDisk) {
        this.DataDisk = DataDisk;
    }

    public DescribePriceRunInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePriceRunInstanceRequest(DescribePriceRunInstanceRequest source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new SystemDisk(source.SystemDisk);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.DataDisk != null) {
            this.DataDisk = new DataDisk[source.DataDisk.length];
            for (int i = 0; i < source.DataDisk.length; i++) {
                this.DataDisk[i] = new DataDisk(source.DataDisk[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamArrayObj(map, prefix + "DataDisk.", this.DataDisk);

    }
}

