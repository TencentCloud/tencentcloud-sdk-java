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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Idc extends AbstractModel {

    /**
    * 机房名称
    */
    @SerializedName("IdcName")
    @Expose
    private String IdcName;

    /**
    * 机房ID
    */
    @SerializedName("IdcId")
    @Expose
    private Long IdcId;

    /**
    * 机房管理单元详情列表
    */
    @SerializedName("IdcUnitSet")
    @Expose
    private IdcUnit [] IdcUnitSet;

    /**
     * Get 机房名称 
     * @return IdcName 机房名称
     */
    public String getIdcName() {
        return this.IdcName;
    }

    /**
     * Set 机房名称
     * @param IdcName 机房名称
     */
    public void setIdcName(String IdcName) {
        this.IdcName = IdcName;
    }

    /**
     * Get 机房ID 
     * @return IdcId 机房ID
     */
    public Long getIdcId() {
        return this.IdcId;
    }

    /**
     * Set 机房ID
     * @param IdcId 机房ID
     */
    public void setIdcId(Long IdcId) {
        this.IdcId = IdcId;
    }

    /**
     * Get 机房管理单元详情列表 
     * @return IdcUnitSet 机房管理单元详情列表
     */
    public IdcUnit [] getIdcUnitSet() {
        return this.IdcUnitSet;
    }

    /**
     * Set 机房管理单元详情列表
     * @param IdcUnitSet 机房管理单元详情列表
     */
    public void setIdcUnitSet(IdcUnit [] IdcUnitSet) {
        this.IdcUnitSet = IdcUnitSet;
    }

    public Idc() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Idc(Idc source) {
        if (source.IdcName != null) {
            this.IdcName = new String(source.IdcName);
        }
        if (source.IdcId != null) {
            this.IdcId = new Long(source.IdcId);
        }
        if (source.IdcUnitSet != null) {
            this.IdcUnitSet = new IdcUnit[source.IdcUnitSet.length];
            for (int i = 0; i < source.IdcUnitSet.length; i++) {
                this.IdcUnitSet[i] = new IdcUnit(source.IdcUnitSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdcName", this.IdcName);
        this.setParamSimple(map, prefix + "IdcId", this.IdcId);
        this.setParamArrayObj(map, prefix + "IdcUnitSet.", this.IdcUnitSet);

    }
}

