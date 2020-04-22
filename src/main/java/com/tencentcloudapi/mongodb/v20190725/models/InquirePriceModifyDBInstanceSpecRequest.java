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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquirePriceModifyDBInstanceSpecRequest extends AbstractModel{

    /**
    * 实例ID，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 变更配置后实例内存大小，单位：GB。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 变更配置后实例磁盘大小，单位：GB。
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
     * Get 实例ID，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同。 
     * @return InstanceId 实例ID，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同。
     * @param InstanceId 实例ID，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 变更配置后实例内存大小，单位：GB。 
     * @return Memory 变更配置后实例内存大小，单位：GB。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 变更配置后实例内存大小，单位：GB。
     * @param Memory 变更配置后实例内存大小，单位：GB。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 变更配置后实例磁盘大小，单位：GB。 
     * @return Volume 变更配置后实例磁盘大小，单位：GB。
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set 变更配置后实例磁盘大小，单位：GB。
     * @param Volume 变更配置后实例磁盘大小，单位：GB。
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);

    }
}

