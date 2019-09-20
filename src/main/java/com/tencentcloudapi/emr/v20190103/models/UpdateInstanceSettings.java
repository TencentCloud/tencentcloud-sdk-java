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

public class UpdateInstanceSettings  extends AbstractModel{

    /**
    * 内存容量，单位为G
    */
    @SerializedName("Memory")
    @Expose
    private Integer Memory;

    /**
    * CPU核数
    */
    @SerializedName("CPUCores")
    @Expose
    private Integer CPUCores;

    /**
    * 机器资源ID（EMR测资源标识）
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * 获取内存容量，单位为G
     * @return Memory 内存容量，单位为G
     */
    public Integer getMemory() {
        return this.Memory;
    }

    /**
     * 设置内存容量，单位为G
     * @param Memory 内存容量，单位为G
     */
    public void setMemory(Integer Memory) {
        this.Memory = Memory;
    }

    /**
     * 获取CPU核数
     * @return CPUCores CPU核数
     */
    public Integer getCPUCores() {
        return this.CPUCores;
    }

    /**
     * 设置CPU核数
     * @param CPUCores CPU核数
     */
    public void setCPUCores(Integer CPUCores) {
        this.CPUCores = CPUCores;
    }

    /**
     * 获取机器资源ID（EMR测资源标识）
     * @return ResourceId 机器资源ID（EMR测资源标识）
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * 设置机器资源ID（EMR测资源标识）
     * @param ResourceId 机器资源ID（EMR测资源标识）
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "CPUCores", this.CPUCores);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

