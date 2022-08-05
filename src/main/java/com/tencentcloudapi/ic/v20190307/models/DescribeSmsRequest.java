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
package com.tencentcloudapi.ic.v20190307.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSmsRequest extends AbstractModel{

    /**
    * 应用ID
    */
    @SerializedName("Sdkappid")
    @Expose
    private Long Sdkappid;

    /**
    * 卡片ID
    */
    @SerializedName("Iccid")
    @Expose
    private String Iccid;

    /**
    * 卡片号码
    */
    @SerializedName("Msisdn")
    @Expose
    private String Msisdn;

    /**
    * 短信类型
    */
    @SerializedName("SmsType")
    @Expose
    private Long SmsType;

    /**
    * 开始时间  YYYY-MM-DD HH:mm:ss
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 结束时间  YYYY-MM-DD HH:mm:ss
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 小于200
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 应用ID 
     * @return Sdkappid 应用ID
     */
    public Long getSdkappid() {
        return this.Sdkappid;
    }

    /**
     * Set 应用ID
     * @param Sdkappid 应用ID
     */
    public void setSdkappid(Long Sdkappid) {
        this.Sdkappid = Sdkappid;
    }

    /**
     * Get 卡片ID 
     * @return Iccid 卡片ID
     */
    public String getIccid() {
        return this.Iccid;
    }

    /**
     * Set 卡片ID
     * @param Iccid 卡片ID
     */
    public void setIccid(String Iccid) {
        this.Iccid = Iccid;
    }

    /**
     * Get 卡片号码 
     * @return Msisdn 卡片号码
     */
    public String getMsisdn() {
        return this.Msisdn;
    }

    /**
     * Set 卡片号码
     * @param Msisdn 卡片号码
     */
    public void setMsisdn(String Msisdn) {
        this.Msisdn = Msisdn;
    }

    /**
     * Get 短信类型 
     * @return SmsType 短信类型
     */
    public Long getSmsType() {
        return this.SmsType;
    }

    /**
     * Set 短信类型
     * @param SmsType 短信类型
     */
    public void setSmsType(Long SmsType) {
        this.SmsType = SmsType;
    }

    /**
     * Get 开始时间  YYYY-MM-DD HH:mm:ss 
     * @return BeginTime 开始时间  YYYY-MM-DD HH:mm:ss
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 开始时间  YYYY-MM-DD HH:mm:ss
     * @param BeginTime 开始时间  YYYY-MM-DD HH:mm:ss
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 结束时间  YYYY-MM-DD HH:mm:ss 
     * @return EndTime 结束时间  YYYY-MM-DD HH:mm:ss
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间  YYYY-MM-DD HH:mm:ss
     * @param EndTime 结束时间  YYYY-MM-DD HH:mm:ss
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 小于200 
     * @return Limit 小于200
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 小于200
     * @param Limit 小于200
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeSmsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSmsRequest(DescribeSmsRequest source) {
        if (source.Sdkappid != null) {
            this.Sdkappid = new Long(source.Sdkappid);
        }
        if (source.Iccid != null) {
            this.Iccid = new String(source.Iccid);
        }
        if (source.Msisdn != null) {
            this.Msisdn = new String(source.Msisdn);
        }
        if (source.SmsType != null) {
            this.SmsType = new Long(source.SmsType);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Sdkappid", this.Sdkappid);
        this.setParamSimple(map, prefix + "Iccid", this.Iccid);
        this.setParamSimple(map, prefix + "Msisdn", this.Msisdn);
        this.setParamSimple(map, prefix + "SmsType", this.SmsType);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

