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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSGeoIPBlockConfig extends AbstractModel{

    /**
    * 区域类型，取值[
oversea(境外)
china(国内)
customized(自定义地区)
]
    */
    @SerializedName("RegionType")
    @Expose
    private String RegionType;

    /**
    * 封禁动作，取值[
drop(拦截)
trans(放行)
]
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 配置ID，配置添加成功后生成；添加新配置时不用填写此字段，修改或删除配置时需要填写配置ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 当RegionType为customized时，必须填写AreaList，且最多填写128个；
    */
    @SerializedName("AreaList")
    @Expose
    private Long [] AreaList;

    /**
     * Get 区域类型，取值[
oversea(境外)
china(国内)
customized(自定义地区)
] 
     * @return RegionType 区域类型，取值[
oversea(境外)
china(国内)
customized(自定义地区)
]
     */
    public String getRegionType() {
        return this.RegionType;
    }

    /**
     * Set 区域类型，取值[
oversea(境外)
china(国内)
customized(自定义地区)
]
     * @param RegionType 区域类型，取值[
oversea(境外)
china(国内)
customized(自定义地区)
]
     */
    public void setRegionType(String RegionType) {
        this.RegionType = RegionType;
    }

    /**
     * Get 封禁动作，取值[
drop(拦截)
trans(放行)
] 
     * @return Action 封禁动作，取值[
drop(拦截)
trans(放行)
]
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 封禁动作，取值[
drop(拦截)
trans(放行)
]
     * @param Action 封禁动作，取值[
drop(拦截)
trans(放行)
]
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 配置ID，配置添加成功后生成；添加新配置时不用填写此字段，修改或删除配置时需要填写配置ID 
     * @return Id 配置ID，配置添加成功后生成；添加新配置时不用填写此字段，修改或删除配置时需要填写配置ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 配置ID，配置添加成功后生成；添加新配置时不用填写此字段，修改或删除配置时需要填写配置ID
     * @param Id 配置ID，配置添加成功后生成；添加新配置时不用填写此字段，修改或删除配置时需要填写配置ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 当RegionType为customized时，必须填写AreaList，且最多填写128个； 
     * @return AreaList 当RegionType为customized时，必须填写AreaList，且最多填写128个；
     */
    public Long [] getAreaList() {
        return this.AreaList;
    }

    /**
     * Set 当RegionType为customized时，必须填写AreaList，且最多填写128个；
     * @param AreaList 当RegionType为customized时，必须填写AreaList，且最多填写128个；
     */
    public void setAreaList(Long [] AreaList) {
        this.AreaList = AreaList;
    }

    public DDoSGeoIPBlockConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSGeoIPBlockConfig(DDoSGeoIPBlockConfig source) {
        if (source.RegionType != null) {
            this.RegionType = new String(source.RegionType);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.AreaList != null) {
            this.AreaList = new Long[source.AreaList.length];
            for (int i = 0; i < source.AreaList.length; i++) {
                this.AreaList[i] = new Long(source.AreaList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionType", this.RegionType);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "AreaList.", this.AreaList);

    }
}

