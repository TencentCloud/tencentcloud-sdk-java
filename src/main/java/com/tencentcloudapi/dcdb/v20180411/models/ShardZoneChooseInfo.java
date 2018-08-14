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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ShardZoneChooseInfo  extends AbstractModel{

    /**
    * 主可用区
    */
    @SerializedName("MasterZone")
    @Expose
    private ZonesInfo MasterZone;

    /**
    * 可选的从可用区
    */
    @SerializedName("SlaveZones")
    @Expose
    private ZonesInfo [] SlaveZones;

    /**
     * 获取主可用区
     * @return MasterZone 主可用区
     */
    public ZonesInfo getMasterZone() {
        return this.MasterZone;
    }

    /**
     * 设置主可用区
     * @param MasterZone 主可用区
     */
    public void setMasterZone(ZonesInfo MasterZone) {
        this.MasterZone = MasterZone;
    }

    /**
     * 获取可选的从可用区
     * @return SlaveZones 可选的从可用区
     */
    public ZonesInfo [] getSlaveZones() {
        return this.SlaveZones;
    }

    /**
     * 设置可选的从可用区
     * @param SlaveZones 可选的从可用区
     */
    public void setSlaveZones(ZonesInfo [] SlaveZones) {
        this.SlaveZones = SlaveZones;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "MasterZone.", this.MasterZone);
        this.setParamArrayObj(map, prefix + "SlaveZones.", this.SlaveZones);

    }
}

