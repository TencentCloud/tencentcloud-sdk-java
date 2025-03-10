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
package com.tencentcloudapi.partners.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClientIncreaseInfoList extends AbstractModel {

    /**
    * 客户UIN
    */
    @SerializedName("ClientUin")
    @Expose
    private String ClientUin;

    /**
    * 是否参与增量政策，
Y：是，N：否
    */
    @SerializedName("IsJoinIncrease")
    @Expose
    private String IsJoinIncrease;

    /**
    * 增量考核关联时间
    */
    @SerializedName("IncreaseUseAssociateDate")
    @Expose
    private String IncreaseUseAssociateDate;

    /**
    * 参与增量考核的原始客户等级
    */
    @SerializedName("TLevel")
    @Expose
    private String TLevel;

    /**
    * 增量考核目标,分
    */
    @SerializedName("IncreaseGoal")
    @Expose
    private String IncreaseGoal;

    /**
    * 完成订单金额,分
    */
    @SerializedName("TotalBaseAmt")
    @Expose
    private String TotalBaseAmt;

    /**
     * Get 客户UIN 
     * @return ClientUin 客户UIN
     */
    public String getClientUin() {
        return this.ClientUin;
    }

    /**
     * Set 客户UIN
     * @param ClientUin 客户UIN
     */
    public void setClientUin(String ClientUin) {
        this.ClientUin = ClientUin;
    }

    /**
     * Get 是否参与增量政策，
Y：是，N：否 
     * @return IsJoinIncrease 是否参与增量政策，
Y：是，N：否
     */
    public String getIsJoinIncrease() {
        return this.IsJoinIncrease;
    }

    /**
     * Set 是否参与增量政策，
Y：是，N：否
     * @param IsJoinIncrease 是否参与增量政策，
Y：是，N：否
     */
    public void setIsJoinIncrease(String IsJoinIncrease) {
        this.IsJoinIncrease = IsJoinIncrease;
    }

    /**
     * Get 增量考核关联时间 
     * @return IncreaseUseAssociateDate 增量考核关联时间
     */
    public String getIncreaseUseAssociateDate() {
        return this.IncreaseUseAssociateDate;
    }

    /**
     * Set 增量考核关联时间
     * @param IncreaseUseAssociateDate 增量考核关联时间
     */
    public void setIncreaseUseAssociateDate(String IncreaseUseAssociateDate) {
        this.IncreaseUseAssociateDate = IncreaseUseAssociateDate;
    }

    /**
     * Get 参与增量考核的原始客户等级 
     * @return TLevel 参与增量考核的原始客户等级
     */
    public String getTLevel() {
        return this.TLevel;
    }

    /**
     * Set 参与增量考核的原始客户等级
     * @param TLevel 参与增量考核的原始客户等级
     */
    public void setTLevel(String TLevel) {
        this.TLevel = TLevel;
    }

    /**
     * Get 增量考核目标,分 
     * @return IncreaseGoal 增量考核目标,分
     */
    public String getIncreaseGoal() {
        return this.IncreaseGoal;
    }

    /**
     * Set 增量考核目标,分
     * @param IncreaseGoal 增量考核目标,分
     */
    public void setIncreaseGoal(String IncreaseGoal) {
        this.IncreaseGoal = IncreaseGoal;
    }

    /**
     * Get 完成订单金额,分 
     * @return TotalBaseAmt 完成订单金额,分
     */
    public String getTotalBaseAmt() {
        return this.TotalBaseAmt;
    }

    /**
     * Set 完成订单金额,分
     * @param TotalBaseAmt 完成订单金额,分
     */
    public void setTotalBaseAmt(String TotalBaseAmt) {
        this.TotalBaseAmt = TotalBaseAmt;
    }

    public ClientIncreaseInfoList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClientIncreaseInfoList(ClientIncreaseInfoList source) {
        if (source.ClientUin != null) {
            this.ClientUin = new String(source.ClientUin);
        }
        if (source.IsJoinIncrease != null) {
            this.IsJoinIncrease = new String(source.IsJoinIncrease);
        }
        if (source.IncreaseUseAssociateDate != null) {
            this.IncreaseUseAssociateDate = new String(source.IncreaseUseAssociateDate);
        }
        if (source.TLevel != null) {
            this.TLevel = new String(source.TLevel);
        }
        if (source.IncreaseGoal != null) {
            this.IncreaseGoal = new String(source.IncreaseGoal);
        }
        if (source.TotalBaseAmt != null) {
            this.TotalBaseAmt = new String(source.TotalBaseAmt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientUin", this.ClientUin);
        this.setParamSimple(map, prefix + "IsJoinIncrease", this.IsJoinIncrease);
        this.setParamSimple(map, prefix + "IncreaseUseAssociateDate", this.IncreaseUseAssociateDate);
        this.setParamSimple(map, prefix + "TLevel", this.TLevel);
        this.setParamSimple(map, prefix + "IncreaseGoal", this.IncreaseGoal);
        this.setParamSimple(map, prefix + "TotalBaseAmt", this.TotalBaseAmt);

    }
}

