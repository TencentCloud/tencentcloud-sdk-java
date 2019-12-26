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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceDataDiskMountSetting extends AbstractModel{

    /**
    * CVM实例类型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 数据盘挂载信息
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * CVM实例所属可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get CVM实例类型 
     * @return InstanceType CVM实例类型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set CVM实例类型
     * @param InstanceType CVM实例类型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 数据盘挂载信息 
     * @return DataDisks 数据盘挂载信息
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set 数据盘挂载信息
     * @param DataDisks 数据盘挂载信息
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get CVM实例所属可用区 
     * @return Zone CVM实例所属可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set CVM实例所属可用区
     * @param Zone CVM实例所属可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

