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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySecLogCleanSettingInfoRequest extends AbstractModel{

    /**
    * 触发清理的储量底线(50-99)
    */
    @SerializedName("ReservesLimit")
    @Expose
    private Long ReservesLimit;

    /**
    * 清理停止时的储量截至线(>0,小于ReservesLimit)
    */
    @SerializedName("ReservesDeadline")
    @Expose
    private Long ReservesDeadline;

    /**
    * 触发清理的存储天数(>=1)
    */
    @SerializedName("DayLimit")
    @Expose
    private Long DayLimit;

    /**
     * Get 触发清理的储量底线(50-99) 
     * @return ReservesLimit 触发清理的储量底线(50-99)
     */
    public Long getReservesLimit() {
        return this.ReservesLimit;
    }

    /**
     * Set 触发清理的储量底线(50-99)
     * @param ReservesLimit 触发清理的储量底线(50-99)
     */
    public void setReservesLimit(Long ReservesLimit) {
        this.ReservesLimit = ReservesLimit;
    }

    /**
     * Get 清理停止时的储量截至线(>0,小于ReservesLimit) 
     * @return ReservesDeadline 清理停止时的储量截至线(>0,小于ReservesLimit)
     */
    public Long getReservesDeadline() {
        return this.ReservesDeadline;
    }

    /**
     * Set 清理停止时的储量截至线(>0,小于ReservesLimit)
     * @param ReservesDeadline 清理停止时的储量截至线(>0,小于ReservesLimit)
     */
    public void setReservesDeadline(Long ReservesDeadline) {
        this.ReservesDeadline = ReservesDeadline;
    }

    /**
     * Get 触发清理的存储天数(>=1) 
     * @return DayLimit 触发清理的存储天数(>=1)
     */
    public Long getDayLimit() {
        return this.DayLimit;
    }

    /**
     * Set 触发清理的存储天数(>=1)
     * @param DayLimit 触发清理的存储天数(>=1)
     */
    public void setDayLimit(Long DayLimit) {
        this.DayLimit = DayLimit;
    }

    public ModifySecLogCleanSettingInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySecLogCleanSettingInfoRequest(ModifySecLogCleanSettingInfoRequest source) {
        if (source.ReservesLimit != null) {
            this.ReservesLimit = new Long(source.ReservesLimit);
        }
        if (source.ReservesDeadline != null) {
            this.ReservesDeadline = new Long(source.ReservesDeadline);
        }
        if (source.DayLimit != null) {
            this.DayLimit = new Long(source.DayLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReservesLimit", this.ReservesLimit);
        this.setParamSimple(map, prefix + "ReservesDeadline", this.ReservesDeadline);
        this.setParamSimple(map, prefix + "DayLimit", this.DayLimit);

    }
}

