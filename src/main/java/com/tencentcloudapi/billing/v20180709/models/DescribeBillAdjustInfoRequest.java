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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillAdjustInfoRequest extends AbstractModel {

    /**
    * <p>格式：yyyy-MM<br>账单月份，month和timeFrom&amp;timeTo必传一个，如果有传timeFrom&amp;timeTo则month字段无效</p>
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * <p>格式：yyyy-MM-dd<br>开始时间，month和timeFrom&amp;timeTo必传一个，如果有该字段则month字段无效。timeFrom和timeTo必须一起传，且为相同月份，不支持跨月查询，查询结果是整月数据</p>
    */
    @SerializedName("TimeFrom")
    @Expose
    private String TimeFrom;

    /**
    * <p>格式：yyyy-MM-dd<br>截止时间，month和timeFrom&amp;timeTo必传一个，如果有该字段则month字段无效。timeFrom和timeTo必须一起传，且为相同月份，不支持跨月查询，查询结果是整月数据</p>
    */
    @SerializedName("TimeTo")
    @Expose
    private String TimeTo;

    /**
    * <p>支付者的账号 ID（账号 ID 是用户在腾讯云的唯一账号标识），默认查询本账号账单，如集团管理账号需查询成员账号自付的账单，该字段需入参成员账号UIN</p>
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
     * Get <p>格式：yyyy-MM<br>账单月份，month和timeFrom&amp;timeTo必传一个，如果有传timeFrom&amp;timeTo则month字段无效</p> 
     * @return Month <p>格式：yyyy-MM<br>账单月份，month和timeFrom&amp;timeTo必传一个，如果有传timeFrom&amp;timeTo则month字段无效</p>
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set <p>格式：yyyy-MM<br>账单月份，month和timeFrom&amp;timeTo必传一个，如果有传timeFrom&amp;timeTo则month字段无效</p>
     * @param Month <p>格式：yyyy-MM<br>账单月份，month和timeFrom&amp;timeTo必传一个，如果有传timeFrom&amp;timeTo则month字段无效</p>
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get <p>格式：yyyy-MM-dd<br>开始时间，month和timeFrom&amp;timeTo必传一个，如果有该字段则month字段无效。timeFrom和timeTo必须一起传，且为相同月份，不支持跨月查询，查询结果是整月数据</p> 
     * @return TimeFrom <p>格式：yyyy-MM-dd<br>开始时间，month和timeFrom&amp;timeTo必传一个，如果有该字段则month字段无效。timeFrom和timeTo必须一起传，且为相同月份，不支持跨月查询，查询结果是整月数据</p>
     */
    public String getTimeFrom() {
        return this.TimeFrom;
    }

    /**
     * Set <p>格式：yyyy-MM-dd<br>开始时间，month和timeFrom&amp;timeTo必传一个，如果有该字段则month字段无效。timeFrom和timeTo必须一起传，且为相同月份，不支持跨月查询，查询结果是整月数据</p>
     * @param TimeFrom <p>格式：yyyy-MM-dd<br>开始时间，month和timeFrom&amp;timeTo必传一个，如果有该字段则month字段无效。timeFrom和timeTo必须一起传，且为相同月份，不支持跨月查询，查询结果是整月数据</p>
     */
    public void setTimeFrom(String TimeFrom) {
        this.TimeFrom = TimeFrom;
    }

    /**
     * Get <p>格式：yyyy-MM-dd<br>截止时间，month和timeFrom&amp;timeTo必传一个，如果有该字段则month字段无效。timeFrom和timeTo必须一起传，且为相同月份，不支持跨月查询，查询结果是整月数据</p> 
     * @return TimeTo <p>格式：yyyy-MM-dd<br>截止时间，month和timeFrom&amp;timeTo必传一个，如果有该字段则month字段无效。timeFrom和timeTo必须一起传，且为相同月份，不支持跨月查询，查询结果是整月数据</p>
     */
    public String getTimeTo() {
        return this.TimeTo;
    }

    /**
     * Set <p>格式：yyyy-MM-dd<br>截止时间，month和timeFrom&amp;timeTo必传一个，如果有该字段则month字段无效。timeFrom和timeTo必须一起传，且为相同月份，不支持跨月查询，查询结果是整月数据</p>
     * @param TimeTo <p>格式：yyyy-MM-dd<br>截止时间，month和timeFrom&amp;timeTo必传一个，如果有该字段则month字段无效。timeFrom和timeTo必须一起传，且为相同月份，不支持跨月查询，查询结果是整月数据</p>
     */
    public void setTimeTo(String TimeTo) {
        this.TimeTo = TimeTo;
    }

    /**
     * Get <p>支付者的账号 ID（账号 ID 是用户在腾讯云的唯一账号标识），默认查询本账号账单，如集团管理账号需查询成员账号自付的账单，该字段需入参成员账号UIN</p> 
     * @return PayerUin <p>支付者的账号 ID（账号 ID 是用户在腾讯云的唯一账号标识），默认查询本账号账单，如集团管理账号需查询成员账号自付的账单，该字段需入参成员账号UIN</p>
     */
    public String getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set <p>支付者的账号 ID（账号 ID 是用户在腾讯云的唯一账号标识），默认查询本账号账单，如集团管理账号需查询成员账号自付的账单，该字段需入参成员账号UIN</p>
     * @param PayerUin <p>支付者的账号 ID（账号 ID 是用户在腾讯云的唯一账号标识），默认查询本账号账单，如集团管理账号需查询成员账号自付的账单，该字段需入参成员账号UIN</p>
     */
    public void setPayerUin(String PayerUin) {
        this.PayerUin = PayerUin;
    }

    public DescribeBillAdjustInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillAdjustInfoRequest(DescribeBillAdjustInfoRequest source) {
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.TimeFrom != null) {
            this.TimeFrom = new String(source.TimeFrom);
        }
        if (source.TimeTo != null) {
            this.TimeTo = new String(source.TimeTo);
        }
        if (source.PayerUin != null) {
            this.PayerUin = new String(source.PayerUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamSimple(map, prefix + "TimeFrom", this.TimeFrom);
        this.setParamSimple(map, prefix + "TimeTo", this.TimeTo);
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);

    }
}

