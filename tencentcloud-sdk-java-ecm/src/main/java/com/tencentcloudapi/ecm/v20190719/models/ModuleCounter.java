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

public class ModuleCounter extends AbstractModel{

    /**
    * 运营商统计信息列表
    */
    @SerializedName("ISPCounterSet")
    @Expose
    private ISPCounter [] ISPCounterSet;

    /**
    * 省份数量
    */
    @SerializedName("ProvinceNum")
    @Expose
    private Long ProvinceNum;

    /**
    * 城市数量
    */
    @SerializedName("CityNum")
    @Expose
    private Long CityNum;

    /**
    * 节点数量
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * 实例数量
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
     * Get 运营商统计信息列表 
     * @return ISPCounterSet 运营商统计信息列表
     */
    public ISPCounter [] getISPCounterSet() {
        return this.ISPCounterSet;
    }

    /**
     * Set 运营商统计信息列表
     * @param ISPCounterSet 运营商统计信息列表
     */
    public void setISPCounterSet(ISPCounter [] ISPCounterSet) {
        this.ISPCounterSet = ISPCounterSet;
    }

    /**
     * Get 省份数量 
     * @return ProvinceNum 省份数量
     */
    public Long getProvinceNum() {
        return this.ProvinceNum;
    }

    /**
     * Set 省份数量
     * @param ProvinceNum 省份数量
     */
    public void setProvinceNum(Long ProvinceNum) {
        this.ProvinceNum = ProvinceNum;
    }

    /**
     * Get 城市数量 
     * @return CityNum 城市数量
     */
    public Long getCityNum() {
        return this.CityNum;
    }

    /**
     * Set 城市数量
     * @param CityNum 城市数量
     */
    public void setCityNum(Long CityNum) {
        this.CityNum = CityNum;
    }

    /**
     * Get 节点数量 
     * @return NodeNum 节点数量
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set 节点数量
     * @param NodeNum 节点数量
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get 实例数量 
     * @return InstanceNum 实例数量
     */
    public Long getInstanceNum() {
        return this.InstanceNum;
    }

    /**
     * Set 实例数量
     * @param InstanceNum 实例数量
     */
    public void setInstanceNum(Long InstanceNum) {
        this.InstanceNum = InstanceNum;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ISPCounterSet.", this.ISPCounterSet);
        this.setParamSimple(map, prefix + "ProvinceNum", this.ProvinceNum);
        this.setParamSimple(map, prefix + "CityNum", this.CityNum);
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "InstanceNum", this.InstanceNum);

    }
}

