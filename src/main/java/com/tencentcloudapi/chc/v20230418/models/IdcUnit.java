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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IdcUnit extends AbstractModel {

    /**
    * 机房管理单元 ID
    */
    @SerializedName("IdcUnitId")
    @Expose
    private Long IdcUnitId;

    /**
    * 机房管理单元名称
    */
    @SerializedName("IdcUnitName")
    @Expose
    private String IdcUnitName;

    /**
    * 围笼列表
    */
    @SerializedName("CageSet")
    @Expose
    private Cage [] CageSet;

    /**
     * Get 机房管理单元 ID 
     * @return IdcUnitId 机房管理单元 ID
     */
    public Long getIdcUnitId() {
        return this.IdcUnitId;
    }

    /**
     * Set 机房管理单元 ID
     * @param IdcUnitId 机房管理单元 ID
     */
    public void setIdcUnitId(Long IdcUnitId) {
        this.IdcUnitId = IdcUnitId;
    }

    /**
     * Get 机房管理单元名称 
     * @return IdcUnitName 机房管理单元名称
     */
    public String getIdcUnitName() {
        return this.IdcUnitName;
    }

    /**
     * Set 机房管理单元名称
     * @param IdcUnitName 机房管理单元名称
     */
    public void setIdcUnitName(String IdcUnitName) {
        this.IdcUnitName = IdcUnitName;
    }

    /**
     * Get 围笼列表 
     * @return CageSet 围笼列表
     */
    public Cage [] getCageSet() {
        return this.CageSet;
    }

    /**
     * Set 围笼列表
     * @param CageSet 围笼列表
     */
    public void setCageSet(Cage [] CageSet) {
        this.CageSet = CageSet;
    }

    public IdcUnit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IdcUnit(IdcUnit source) {
        if (source.IdcUnitId != null) {
            this.IdcUnitId = new Long(source.IdcUnitId);
        }
        if (source.IdcUnitName != null) {
            this.IdcUnitName = new String(source.IdcUnitName);
        }
        if (source.CageSet != null) {
            this.CageSet = new Cage[source.CageSet.length];
            for (int i = 0; i < source.CageSet.length; i++) {
                this.CageSet[i] = new Cage(source.CageSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdcUnitId", this.IdcUnitId);
        this.setParamSimple(map, prefix + "IdcUnitName", this.IdcUnitName);
        this.setParamArrayObj(map, prefix + "CageSet.", this.CageSet);

    }
}

