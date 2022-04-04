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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CrmStatisticsData extends AbstractModel{

    /**
    * 新增线索
    */
    @SerializedName("LeadCnt")
    @Expose
    private Long LeadCnt;

    /**
    * 新增建档
    */
    @SerializedName("BuildCnt")
    @Expose
    private Long BuildCnt;

    /**
    * 新增到店
    */
    @SerializedName("InvitedCnt")
    @Expose
    private Long InvitedCnt;

    /**
    * 新增下订
    */
    @SerializedName("OrderedCnt")
    @Expose
    private Long OrderedCnt;

    /**
    * 新增成交
    */
    @SerializedName("DeliveredCnt")
    @Expose
    private Long DeliveredCnt;

    /**
    * 新增战败
    */
    @SerializedName("DefeatCnt")
    @Expose
    private Long DefeatCnt;

    /**
    * 新增好友
    */
    @SerializedName("NewContactCnt")
    @Expose
    private Long NewContactCnt;

    /**
    * 统计时间, 单位：天
    */
    @SerializedName("StatisticalTime")
    @Expose
    private String StatisticalTime;

    /**
     * Get 新增线索 
     * @return LeadCnt 新增线索
     */
    public Long getLeadCnt() {
        return this.LeadCnt;
    }

    /**
     * Set 新增线索
     * @param LeadCnt 新增线索
     */
    public void setLeadCnt(Long LeadCnt) {
        this.LeadCnt = LeadCnt;
    }

    /**
     * Get 新增建档 
     * @return BuildCnt 新增建档
     */
    public Long getBuildCnt() {
        return this.BuildCnt;
    }

    /**
     * Set 新增建档
     * @param BuildCnt 新增建档
     */
    public void setBuildCnt(Long BuildCnt) {
        this.BuildCnt = BuildCnt;
    }

    /**
     * Get 新增到店 
     * @return InvitedCnt 新增到店
     */
    public Long getInvitedCnt() {
        return this.InvitedCnt;
    }

    /**
     * Set 新增到店
     * @param InvitedCnt 新增到店
     */
    public void setInvitedCnt(Long InvitedCnt) {
        this.InvitedCnt = InvitedCnt;
    }

    /**
     * Get 新增下订 
     * @return OrderedCnt 新增下订
     */
    public Long getOrderedCnt() {
        return this.OrderedCnt;
    }

    /**
     * Set 新增下订
     * @param OrderedCnt 新增下订
     */
    public void setOrderedCnt(Long OrderedCnt) {
        this.OrderedCnt = OrderedCnt;
    }

    /**
     * Get 新增成交 
     * @return DeliveredCnt 新增成交
     */
    public Long getDeliveredCnt() {
        return this.DeliveredCnt;
    }

    /**
     * Set 新增成交
     * @param DeliveredCnt 新增成交
     */
    public void setDeliveredCnt(Long DeliveredCnt) {
        this.DeliveredCnt = DeliveredCnt;
    }

    /**
     * Get 新增战败 
     * @return DefeatCnt 新增战败
     */
    public Long getDefeatCnt() {
        return this.DefeatCnt;
    }

    /**
     * Set 新增战败
     * @param DefeatCnt 新增战败
     */
    public void setDefeatCnt(Long DefeatCnt) {
        this.DefeatCnt = DefeatCnt;
    }

    /**
     * Get 新增好友 
     * @return NewContactCnt 新增好友
     */
    public Long getNewContactCnt() {
        return this.NewContactCnt;
    }

    /**
     * Set 新增好友
     * @param NewContactCnt 新增好友
     */
    public void setNewContactCnt(Long NewContactCnt) {
        this.NewContactCnt = NewContactCnt;
    }

    /**
     * Get 统计时间, 单位：天 
     * @return StatisticalTime 统计时间, 单位：天
     */
    public String getStatisticalTime() {
        return this.StatisticalTime;
    }

    /**
     * Set 统计时间, 单位：天
     * @param StatisticalTime 统计时间, 单位：天
     */
    public void setStatisticalTime(String StatisticalTime) {
        this.StatisticalTime = StatisticalTime;
    }

    public CrmStatisticsData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CrmStatisticsData(CrmStatisticsData source) {
        if (source.LeadCnt != null) {
            this.LeadCnt = new Long(source.LeadCnt);
        }
        if (source.BuildCnt != null) {
            this.BuildCnt = new Long(source.BuildCnt);
        }
        if (source.InvitedCnt != null) {
            this.InvitedCnt = new Long(source.InvitedCnt);
        }
        if (source.OrderedCnt != null) {
            this.OrderedCnt = new Long(source.OrderedCnt);
        }
        if (source.DeliveredCnt != null) {
            this.DeliveredCnt = new Long(source.DeliveredCnt);
        }
        if (source.DefeatCnt != null) {
            this.DefeatCnt = new Long(source.DefeatCnt);
        }
        if (source.NewContactCnt != null) {
            this.NewContactCnt = new Long(source.NewContactCnt);
        }
        if (source.StatisticalTime != null) {
            this.StatisticalTime = new String(source.StatisticalTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LeadCnt", this.LeadCnt);
        this.setParamSimple(map, prefix + "BuildCnt", this.BuildCnt);
        this.setParamSimple(map, prefix + "InvitedCnt", this.InvitedCnt);
        this.setParamSimple(map, prefix + "OrderedCnt", this.OrderedCnt);
        this.setParamSimple(map, prefix + "DeliveredCnt", this.DeliveredCnt);
        this.setParamSimple(map, prefix + "DefeatCnt", this.DefeatCnt);
        this.setParamSimple(map, prefix + "NewContactCnt", this.NewContactCnt);
        this.setParamSimple(map, prefix + "StatisticalTime", this.StatisticalTime);

    }
}

