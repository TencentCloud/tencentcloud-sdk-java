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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QuotasDesired extends AbstractModel {

    /**
    * <p>限额周期，必填。取值：d（按日）、m（按月）、lifetime（总额度）。</p>
    */
    @SerializedName("CycleUnit")
    @Expose
    private String CycleUnit;

    /**
    * <p>单周期额度（Token 数），必填，不能大于10万亿。使用字符串避免大数精度丢失。同维度若与现网不同视为升配/降配。</p>
    */
    @SerializedName("CycleCredits")
    @Expose
    private String CycleCredits;

    /**
    * <p>月度限额起始日。CycleUnit=m 时可选，1~31，默认 1。小月（如 2 月）由下游自动取该月最后一天。已有月度限额包时，更新月起始日视为周期窗口切换，会 delete 旧包后 add 新包，累计额度会重置</p>
    */
    @SerializedName("MonthStartDay")
    @Expose
    private Long MonthStartDay;

    /**
     * Get <p>限额周期，必填。取值：d（按日）、m（按月）、lifetime（总额度）。</p> 
     * @return CycleUnit <p>限额周期，必填。取值：d（按日）、m（按月）、lifetime（总额度）。</p>
     */
    public String getCycleUnit() {
        return this.CycleUnit;
    }

    /**
     * Set <p>限额周期，必填。取值：d（按日）、m（按月）、lifetime（总额度）。</p>
     * @param CycleUnit <p>限额周期，必填。取值：d（按日）、m（按月）、lifetime（总额度）。</p>
     */
    public void setCycleUnit(String CycleUnit) {
        this.CycleUnit = CycleUnit;
    }

    /**
     * Get <p>单周期额度（Token 数），必填，不能大于10万亿。使用字符串避免大数精度丢失。同维度若与现网不同视为升配/降配。</p> 
     * @return CycleCredits <p>单周期额度（Token 数），必填，不能大于10万亿。使用字符串避免大数精度丢失。同维度若与现网不同视为升配/降配。</p>
     */
    public String getCycleCredits() {
        return this.CycleCredits;
    }

    /**
     * Set <p>单周期额度（Token 数），必填，不能大于10万亿。使用字符串避免大数精度丢失。同维度若与现网不同视为升配/降配。</p>
     * @param CycleCredits <p>单周期额度（Token 数），必填，不能大于10万亿。使用字符串避免大数精度丢失。同维度若与现网不同视为升配/降配。</p>
     */
    public void setCycleCredits(String CycleCredits) {
        this.CycleCredits = CycleCredits;
    }

    /**
     * Get <p>月度限额起始日。CycleUnit=m 时可选，1~31，默认 1。小月（如 2 月）由下游自动取该月最后一天。已有月度限额包时，更新月起始日视为周期窗口切换，会 delete 旧包后 add 新包，累计额度会重置</p> 
     * @return MonthStartDay <p>月度限额起始日。CycleUnit=m 时可选，1~31，默认 1。小月（如 2 月）由下游自动取该月最后一天。已有月度限额包时，更新月起始日视为周期窗口切换，会 delete 旧包后 add 新包，累计额度会重置</p>
     */
    public Long getMonthStartDay() {
        return this.MonthStartDay;
    }

    /**
     * Set <p>月度限额起始日。CycleUnit=m 时可选，1~31，默认 1。小月（如 2 月）由下游自动取该月最后一天。已有月度限额包时，更新月起始日视为周期窗口切换，会 delete 旧包后 add 新包，累计额度会重置</p>
     * @param MonthStartDay <p>月度限额起始日。CycleUnit=m 时可选，1~31，默认 1。小月（如 2 月）由下游自动取该月最后一天。已有月度限额包时，更新月起始日视为周期窗口切换，会 delete 旧包后 add 新包，累计额度会重置</p>
     */
    public void setMonthStartDay(Long MonthStartDay) {
        this.MonthStartDay = MonthStartDay;
    }

    public QuotasDesired() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QuotasDesired(QuotasDesired source) {
        if (source.CycleUnit != null) {
            this.CycleUnit = new String(source.CycleUnit);
        }
        if (source.CycleCredits != null) {
            this.CycleCredits = new String(source.CycleCredits);
        }
        if (source.MonthStartDay != null) {
            this.MonthStartDay = new Long(source.MonthStartDay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CycleUnit", this.CycleUnit);
        this.setParamSimple(map, prefix + "CycleCredits", this.CycleCredits);
        this.setParamSimple(map, prefix + "MonthStartDay", this.MonthStartDay);

    }
}

