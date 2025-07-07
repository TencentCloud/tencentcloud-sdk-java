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
package com.tencentcloudapi.aca.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncDictData extends AbstractModel {

    /**
    * 医院ID
    */
    @SerializedName("HospitalId")
    @Expose
    private String HospitalId;

    /**
    * 字典类型 1-给药频次 2-给药途径 3-科室 4-诊断
    */
    @SerializedName("DictType")
    @Expose
    private Long DictType;

    /**
    * 字典数据
    */
    @SerializedName("Dicts")
    @Expose
    private Dict [] Dicts;

    /**
     * Get 医院ID 
     * @return HospitalId 医院ID
     */
    public String getHospitalId() {
        return this.HospitalId;
    }

    /**
     * Set 医院ID
     * @param HospitalId 医院ID
     */
    public void setHospitalId(String HospitalId) {
        this.HospitalId = HospitalId;
    }

    /**
     * Get 字典类型 1-给药频次 2-给药途径 3-科室 4-诊断 
     * @return DictType 字典类型 1-给药频次 2-给药途径 3-科室 4-诊断
     */
    public Long getDictType() {
        return this.DictType;
    }

    /**
     * Set 字典类型 1-给药频次 2-给药途径 3-科室 4-诊断
     * @param DictType 字典类型 1-给药频次 2-给药途径 3-科室 4-诊断
     */
    public void setDictType(Long DictType) {
        this.DictType = DictType;
    }

    /**
     * Get 字典数据 
     * @return Dicts 字典数据
     */
    public Dict [] getDicts() {
        return this.Dicts;
    }

    /**
     * Set 字典数据
     * @param Dicts 字典数据
     */
    public void setDicts(Dict [] Dicts) {
        this.Dicts = Dicts;
    }

    public SyncDictData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncDictData(SyncDictData source) {
        if (source.HospitalId != null) {
            this.HospitalId = new String(source.HospitalId);
        }
        if (source.DictType != null) {
            this.DictType = new Long(source.DictType);
        }
        if (source.Dicts != null) {
            this.Dicts = new Dict[source.Dicts.length];
            for (int i = 0; i < source.Dicts.length; i++) {
                this.Dicts[i] = new Dict(source.Dicts[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HospitalId", this.HospitalId);
        this.setParamSimple(map, prefix + "DictType", this.DictType);
        this.setParamArrayObj(map, prefix + "Dicts.", this.Dicts);

    }
}

