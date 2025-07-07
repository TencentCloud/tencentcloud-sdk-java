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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductStatusInfo extends AbstractModel {

    /**
    * 防护状态，1未防护，2防护中，3试用中，4已过期
    */
    @SerializedName("FWUserStatus")
    @Expose
    private Long FWUserStatus;

    /**
    * 是否可以申请试用，true可以申请
    */
    @SerializedName("CanApplyTrial")
    @Expose
    private Boolean CanApplyTrial;

    /**
    * 无法试用原因，可试用为空
    */
    @SerializedName("CanNotApplyReason")
    @Expose
    private String CanNotApplyReason;

    /**
    * 上次试用结束时间（不存在试用记录则为空）
    */
    @SerializedName("LastTrialTime")
    @Expose
    private String LastTrialTime;

    /**
     * Get 防护状态，1未防护，2防护中，3试用中，4已过期 
     * @return FWUserStatus 防护状态，1未防护，2防护中，3试用中，4已过期
     */
    public Long getFWUserStatus() {
        return this.FWUserStatus;
    }

    /**
     * Set 防护状态，1未防护，2防护中，3试用中，4已过期
     * @param FWUserStatus 防护状态，1未防护，2防护中，3试用中，4已过期
     */
    public void setFWUserStatus(Long FWUserStatus) {
        this.FWUserStatus = FWUserStatus;
    }

    /**
     * Get 是否可以申请试用，true可以申请 
     * @return CanApplyTrial 是否可以申请试用，true可以申请
     */
    public Boolean getCanApplyTrial() {
        return this.CanApplyTrial;
    }

    /**
     * Set 是否可以申请试用，true可以申请
     * @param CanApplyTrial 是否可以申请试用，true可以申请
     */
    public void setCanApplyTrial(Boolean CanApplyTrial) {
        this.CanApplyTrial = CanApplyTrial;
    }

    /**
     * Get 无法试用原因，可试用为空 
     * @return CanNotApplyReason 无法试用原因，可试用为空
     */
    public String getCanNotApplyReason() {
        return this.CanNotApplyReason;
    }

    /**
     * Set 无法试用原因，可试用为空
     * @param CanNotApplyReason 无法试用原因，可试用为空
     */
    public void setCanNotApplyReason(String CanNotApplyReason) {
        this.CanNotApplyReason = CanNotApplyReason;
    }

    /**
     * Get 上次试用结束时间（不存在试用记录则为空） 
     * @return LastTrialTime 上次试用结束时间（不存在试用记录则为空）
     */
    public String getLastTrialTime() {
        return this.LastTrialTime;
    }

    /**
     * Set 上次试用结束时间（不存在试用记录则为空）
     * @param LastTrialTime 上次试用结束时间（不存在试用记录则为空）
     */
    public void setLastTrialTime(String LastTrialTime) {
        this.LastTrialTime = LastTrialTime;
    }

    public ProductStatusInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProductStatusInfo(ProductStatusInfo source) {
        if (source.FWUserStatus != null) {
            this.FWUserStatus = new Long(source.FWUserStatus);
        }
        if (source.CanApplyTrial != null) {
            this.CanApplyTrial = new Boolean(source.CanApplyTrial);
        }
        if (source.CanNotApplyReason != null) {
            this.CanNotApplyReason = new String(source.CanNotApplyReason);
        }
        if (source.LastTrialTime != null) {
            this.LastTrialTime = new String(source.LastTrialTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FWUserStatus", this.FWUserStatus);
        this.setParamSimple(map, prefix + "CanApplyTrial", this.CanApplyTrial);
        this.setParamSimple(map, prefix + "CanNotApplyReason", this.CanNotApplyReason);
        this.setParamSimple(map, prefix + "LastTrialTime", this.LastTrialTime);

    }
}

