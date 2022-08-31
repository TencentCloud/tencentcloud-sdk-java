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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenBankProfitShareRespInfo extends AbstractModel{

    /**
    * 接收方企业ID
    */
    @SerializedName("RecvId")
    @Expose
    private String RecvId;

    /**
    * 分润金额（分）
    */
    @SerializedName("ProfitShareFee")
    @Expose
    private Long ProfitShareFee;

    /**
    * 实际分账金额
    */
    @SerializedName("RealProfitShareFee")
    @Expose
    private Long RealProfitShareFee;

    /**
    * 分账状态
    */
    @SerializedName("ProfitShareStatus")
    @Expose
    private String ProfitShareStatus;

    /**
    * 分账完成时间
    */
    @SerializedName("ProfitFinishTime")
    @Expose
    private String ProfitFinishTime;

    /**
    * 分账类型
    */
    @SerializedName("ProfitShareType")
    @Expose
    private Long ProfitShareType;

    /**
     * Get 接收方企业ID 
     * @return RecvId 接收方企业ID
     */
    public String getRecvId() {
        return this.RecvId;
    }

    /**
     * Set 接收方企业ID
     * @param RecvId 接收方企业ID
     */
    public void setRecvId(String RecvId) {
        this.RecvId = RecvId;
    }

    /**
     * Get 分润金额（分） 
     * @return ProfitShareFee 分润金额（分）
     */
    public Long getProfitShareFee() {
        return this.ProfitShareFee;
    }

    /**
     * Set 分润金额（分）
     * @param ProfitShareFee 分润金额（分）
     */
    public void setProfitShareFee(Long ProfitShareFee) {
        this.ProfitShareFee = ProfitShareFee;
    }

    /**
     * Get 实际分账金额 
     * @return RealProfitShareFee 实际分账金额
     */
    public Long getRealProfitShareFee() {
        return this.RealProfitShareFee;
    }

    /**
     * Set 实际分账金额
     * @param RealProfitShareFee 实际分账金额
     */
    public void setRealProfitShareFee(Long RealProfitShareFee) {
        this.RealProfitShareFee = RealProfitShareFee;
    }

    /**
     * Get 分账状态 
     * @return ProfitShareStatus 分账状态
     */
    public String getProfitShareStatus() {
        return this.ProfitShareStatus;
    }

    /**
     * Set 分账状态
     * @param ProfitShareStatus 分账状态
     */
    public void setProfitShareStatus(String ProfitShareStatus) {
        this.ProfitShareStatus = ProfitShareStatus;
    }

    /**
     * Get 分账完成时间 
     * @return ProfitFinishTime 分账完成时间
     */
    public String getProfitFinishTime() {
        return this.ProfitFinishTime;
    }

    /**
     * Set 分账完成时间
     * @param ProfitFinishTime 分账完成时间
     */
    public void setProfitFinishTime(String ProfitFinishTime) {
        this.ProfitFinishTime = ProfitFinishTime;
    }

    /**
     * Get 分账类型 
     * @return ProfitShareType 分账类型
     */
    public Long getProfitShareType() {
        return this.ProfitShareType;
    }

    /**
     * Set 分账类型
     * @param ProfitShareType 分账类型
     */
    public void setProfitShareType(Long ProfitShareType) {
        this.ProfitShareType = ProfitShareType;
    }

    public OpenBankProfitShareRespInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenBankProfitShareRespInfo(OpenBankProfitShareRespInfo source) {
        if (source.RecvId != null) {
            this.RecvId = new String(source.RecvId);
        }
        if (source.ProfitShareFee != null) {
            this.ProfitShareFee = new Long(source.ProfitShareFee);
        }
        if (source.RealProfitShareFee != null) {
            this.RealProfitShareFee = new Long(source.RealProfitShareFee);
        }
        if (source.ProfitShareStatus != null) {
            this.ProfitShareStatus = new String(source.ProfitShareStatus);
        }
        if (source.ProfitFinishTime != null) {
            this.ProfitFinishTime = new String(source.ProfitFinishTime);
        }
        if (source.ProfitShareType != null) {
            this.ProfitShareType = new Long(source.ProfitShareType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecvId", this.RecvId);
        this.setParamSimple(map, prefix + "ProfitShareFee", this.ProfitShareFee);
        this.setParamSimple(map, prefix + "RealProfitShareFee", this.RealProfitShareFee);
        this.setParamSimple(map, prefix + "ProfitShareStatus", this.ProfitShareStatus);
        this.setParamSimple(map, prefix + "ProfitFinishTime", this.ProfitFinishTime);
        this.setParamSimple(map, prefix + "ProfitShareType", this.ProfitShareType);

    }
}

