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

public class CreatePersonnelVisitWorkOrderRequest extends AbstractModel {

    /**
    * 到访人员信息
    */
    @SerializedName("PersonnelSet")
    @Expose
    private Personnel [] PersonnelSet;

    /**
    * 机房 ID
    */
    @SerializedName("IdcId")
    @Expose
    private Long IdcId;

    /**
    * 机房管理单元列表
    */
    @SerializedName("IdcUnitIdSet")
    @Expose
    private Long [] IdcUnitIdSet;

    /**
    * 到访开始时间
    */
    @SerializedName("EnterStartTime")
    @Expose
    private String EnterStartTime;

    /**
    * 到访结束时间
    */
    @SerializedName("EnterEndTime")
    @Expose
    private String EnterEndTime;

    /**
    * 到访原因，映射关系：IT_OPERATION IT运维 OTHER 其他
    */
    @SerializedName("VisitReason")
    @Expose
    private String [] VisitReason;

    /**
    * 到访说明
    */
    @SerializedName("VisitRemark")
    @Expose
    private String VisitRemark;

    /**
     * Get 到访人员信息 
     * @return PersonnelSet 到访人员信息
     */
    public Personnel [] getPersonnelSet() {
        return this.PersonnelSet;
    }

    /**
     * Set 到访人员信息
     * @param PersonnelSet 到访人员信息
     */
    public void setPersonnelSet(Personnel [] PersonnelSet) {
        this.PersonnelSet = PersonnelSet;
    }

    /**
     * Get 机房 ID 
     * @return IdcId 机房 ID
     */
    public Long getIdcId() {
        return this.IdcId;
    }

    /**
     * Set 机房 ID
     * @param IdcId 机房 ID
     */
    public void setIdcId(Long IdcId) {
        this.IdcId = IdcId;
    }

    /**
     * Get 机房管理单元列表 
     * @return IdcUnitIdSet 机房管理单元列表
     */
    public Long [] getIdcUnitIdSet() {
        return this.IdcUnitIdSet;
    }

    /**
     * Set 机房管理单元列表
     * @param IdcUnitIdSet 机房管理单元列表
     */
    public void setIdcUnitIdSet(Long [] IdcUnitIdSet) {
        this.IdcUnitIdSet = IdcUnitIdSet;
    }

    /**
     * Get 到访开始时间 
     * @return EnterStartTime 到访开始时间
     */
    public String getEnterStartTime() {
        return this.EnterStartTime;
    }

    /**
     * Set 到访开始时间
     * @param EnterStartTime 到访开始时间
     */
    public void setEnterStartTime(String EnterStartTime) {
        this.EnterStartTime = EnterStartTime;
    }

    /**
     * Get 到访结束时间 
     * @return EnterEndTime 到访结束时间
     */
    public String getEnterEndTime() {
        return this.EnterEndTime;
    }

    /**
     * Set 到访结束时间
     * @param EnterEndTime 到访结束时间
     */
    public void setEnterEndTime(String EnterEndTime) {
        this.EnterEndTime = EnterEndTime;
    }

    /**
     * Get 到访原因，映射关系：IT_OPERATION IT运维 OTHER 其他 
     * @return VisitReason 到访原因，映射关系：IT_OPERATION IT运维 OTHER 其他
     */
    public String [] getVisitReason() {
        return this.VisitReason;
    }

    /**
     * Set 到访原因，映射关系：IT_OPERATION IT运维 OTHER 其他
     * @param VisitReason 到访原因，映射关系：IT_OPERATION IT运维 OTHER 其他
     */
    public void setVisitReason(String [] VisitReason) {
        this.VisitReason = VisitReason;
    }

    /**
     * Get 到访说明 
     * @return VisitRemark 到访说明
     */
    public String getVisitRemark() {
        return this.VisitRemark;
    }

    /**
     * Set 到访说明
     * @param VisitRemark 到访说明
     */
    public void setVisitRemark(String VisitRemark) {
        this.VisitRemark = VisitRemark;
    }

    public CreatePersonnelVisitWorkOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePersonnelVisitWorkOrderRequest(CreatePersonnelVisitWorkOrderRequest source) {
        if (source.PersonnelSet != null) {
            this.PersonnelSet = new Personnel[source.PersonnelSet.length];
            for (int i = 0; i < source.PersonnelSet.length; i++) {
                this.PersonnelSet[i] = new Personnel(source.PersonnelSet[i]);
            }
        }
        if (source.IdcId != null) {
            this.IdcId = new Long(source.IdcId);
        }
        if (source.IdcUnitIdSet != null) {
            this.IdcUnitIdSet = new Long[source.IdcUnitIdSet.length];
            for (int i = 0; i < source.IdcUnitIdSet.length; i++) {
                this.IdcUnitIdSet[i] = new Long(source.IdcUnitIdSet[i]);
            }
        }
        if (source.EnterStartTime != null) {
            this.EnterStartTime = new String(source.EnterStartTime);
        }
        if (source.EnterEndTime != null) {
            this.EnterEndTime = new String(source.EnterEndTime);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "PersonnelSet.", this.PersonnelSet);
        this.setParamSimple(map, prefix + "IdcId", this.IdcId);
        this.setParamArraySimple(map, prefix + "IdcUnitIdSet.", this.IdcUnitIdSet);
        this.setParamSimple(map, prefix + "EnterStartTime", this.EnterStartTime);
        this.setParamSimple(map, prefix + "EnterEndTime", this.EnterEndTime);
        this.setParamArraySimple(map, prefix + "VisitReason.", this.VisitReason);
        this.setParamSimple(map, prefix + "VisitRemark", this.VisitRemark);

    }
}

