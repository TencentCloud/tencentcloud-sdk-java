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

public class PersonnelVisitBaseInfo extends AbstractModel {

    /**
    * 机房名称
    */
    @SerializedName("IdcName")
    @Expose
    private String IdcName;

    /**
    * 到访原因。到访原因，映射关系：DEVICE_MAINTENANCE 设备维护 DEVICE_MOVE 设备收货上下架 CHECK 盘点 OTHER 其他
    */
    @SerializedName("VisitReason")
    @Expose
    private String [] VisitReason;

    /**
    * 到访原因
    */
    @SerializedName("VisitRemark")
    @Expose
    private String VisitRemark;

    /**
    * 到访结束时间
    */
    @SerializedName("EnterStartTime")
    @Expose
    private String EnterStartTime;

    /**
    * 到访开始时间
    */
    @SerializedName("EnterEndTime")
    @Expose
    private String EnterEndTime;

    /**
    * 机房管理单元列表
    */
    @SerializedName("IdcUnitNameList")
    @Expose
    private String [] IdcUnitNameList;

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
     * Get 到访原因。到访原因，映射关系：DEVICE_MAINTENANCE 设备维护 DEVICE_MOVE 设备收货上下架 CHECK 盘点 OTHER 其他 
     * @return VisitReason 到访原因。到访原因，映射关系：DEVICE_MAINTENANCE 设备维护 DEVICE_MOVE 设备收货上下架 CHECK 盘点 OTHER 其他
     */
    public String [] getVisitReason() {
        return this.VisitReason;
    }

    /**
     * Set 到访原因。到访原因，映射关系：DEVICE_MAINTENANCE 设备维护 DEVICE_MOVE 设备收货上下架 CHECK 盘点 OTHER 其他
     * @param VisitReason 到访原因。到访原因，映射关系：DEVICE_MAINTENANCE 设备维护 DEVICE_MOVE 设备收货上下架 CHECK 盘点 OTHER 其他
     */
    public void setVisitReason(String [] VisitReason) {
        this.VisitReason = VisitReason;
    }

    /**
     * Get 到访原因 
     * @return VisitRemark 到访原因
     */
    public String getVisitRemark() {
        return this.VisitRemark;
    }

    /**
     * Set 到访原因
     * @param VisitRemark 到访原因
     */
    public void setVisitRemark(String VisitRemark) {
        this.VisitRemark = VisitRemark;
    }

    /**
     * Get 到访结束时间 
     * @return EnterStartTime 到访结束时间
     */
    public String getEnterStartTime() {
        return this.EnterStartTime;
    }

    /**
     * Set 到访结束时间
     * @param EnterStartTime 到访结束时间
     */
    public void setEnterStartTime(String EnterStartTime) {
        this.EnterStartTime = EnterStartTime;
    }

    /**
     * Get 到访开始时间 
     * @return EnterEndTime 到访开始时间
     */
    public String getEnterEndTime() {
        return this.EnterEndTime;
    }

    /**
     * Set 到访开始时间
     * @param EnterEndTime 到访开始时间
     */
    public void setEnterEndTime(String EnterEndTime) {
        this.EnterEndTime = EnterEndTime;
    }

    /**
     * Get 机房管理单元列表 
     * @return IdcUnitNameList 机房管理单元列表
     */
    public String [] getIdcUnitNameList() {
        return this.IdcUnitNameList;
    }

    /**
     * Set 机房管理单元列表
     * @param IdcUnitNameList 机房管理单元列表
     */
    public void setIdcUnitNameList(String [] IdcUnitNameList) {
        this.IdcUnitNameList = IdcUnitNameList;
    }

    public PersonnelVisitBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PersonnelVisitBaseInfo(PersonnelVisitBaseInfo source) {
        if (source.IdcName != null) {
            this.IdcName = new String(source.IdcName);
        }
        if (source.VisitReason != null) {
            this.VisitReason = new String[source.VisitReason.length];
            for (int i = 0; i < source.VisitReason.length; i++) {
                this.VisitReason[i] = new String(source.VisitReason[i]);
            }
        }
        if (source.VisitRemark != null) {
            this.VisitRemark = new String(source.VisitRemark);
        }
        if (source.EnterStartTime != null) {
            this.EnterStartTime = new String(source.EnterStartTime);
        }
        if (source.EnterEndTime != null) {
            this.EnterEndTime = new String(source.EnterEndTime);
        }
        if (source.IdcUnitNameList != null) {
            this.IdcUnitNameList = new String[source.IdcUnitNameList.length];
            for (int i = 0; i < source.IdcUnitNameList.length; i++) {
                this.IdcUnitNameList[i] = new String(source.IdcUnitNameList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdcName", this.IdcName);
        this.setParamArraySimple(map, prefix + "VisitReason.", this.VisitReason);
        this.setParamSimple(map, prefix + "VisitRemark", this.VisitRemark);
        this.setParamSimple(map, prefix + "EnterStartTime", this.EnterStartTime);
        this.setParamSimple(map, prefix + "EnterEndTime", this.EnterEndTime);
        this.setParamArraySimple(map, prefix + "IdcUnitNameList.", this.IdcUnitNameList);

    }
}

