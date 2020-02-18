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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceTypeOptions extends AbstractModel{

    /**
    * CPU核数。
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * 内存值，单位GB。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 实例机型类别，可选参数：“ALL”、“GENERAL”、“GENERAL_2”、“GENERAL_3”、“COMPUTE”、“COMPUTE_2”和“COMPUTE_3”。默认值“ALL”。
    */
    @SerializedName("InstanceCategories")
    @Expose
    private String [] InstanceCategories;

    /**
     * Get CPU核数。 
     * @return CPU CPU核数。
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set CPU核数。
     * @param CPU CPU核数。
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get 内存值，单位GB。 
     * @return Memory 内存值，单位GB。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存值，单位GB。
     * @param Memory 内存值，单位GB。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 实例机型类别，可选参数：“ALL”、“GENERAL”、“GENERAL_2”、“GENERAL_3”、“COMPUTE”、“COMPUTE_2”和“COMPUTE_3”。默认值“ALL”。 
     * @return InstanceCategories 实例机型类别，可选参数：“ALL”、“GENERAL”、“GENERAL_2”、“GENERAL_3”、“COMPUTE”、“COMPUTE_2”和“COMPUTE_3”。默认值“ALL”。
     */
    public String [] getInstanceCategories() {
        return this.InstanceCategories;
    }

    /**
     * Set 实例机型类别，可选参数：“ALL”、“GENERAL”、“GENERAL_2”、“GENERAL_3”、“COMPUTE”、“COMPUTE_2”和“COMPUTE_3”。默认值“ALL”。
     * @param InstanceCategories 实例机型类别，可选参数：“ALL”、“GENERAL”、“GENERAL_2”、“GENERAL_3”、“COMPUTE”、“COMPUTE_2”和“COMPUTE_3”。默认值“ALL”。
     */
    public void setInstanceCategories(String [] InstanceCategories) {
        this.InstanceCategories = InstanceCategories;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamArraySimple(map, prefix + "InstanceCategories.", this.InstanceCategories);

    }
}

