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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCrossBorderFlowMonitorRequest extends AbstractModel{

    /**
    * 源地域。
    */
    @SerializedName("SourceRegion")
    @Expose
    private String SourceRegion;

    /**
    * 目的地域。
    */
    @SerializedName("DestinationRegion")
    @Expose
    private String DestinationRegion;

    /**
    * 云联网ID。
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * 云联网所属账号。
    */
    @SerializedName("CcnUin")
    @Expose
    private String CcnUin;

    /**
    * 时间粒度。单位为:秒，如60为60s的时间粒度
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 开始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 源地域。 
     * @return SourceRegion 源地域。
     */
    public String getSourceRegion() {
        return this.SourceRegion;
    }

    /**
     * Set 源地域。
     * @param SourceRegion 源地域。
     */
    public void setSourceRegion(String SourceRegion) {
        this.SourceRegion = SourceRegion;
    }

    /**
     * Get 目的地域。 
     * @return DestinationRegion 目的地域。
     */
    public String getDestinationRegion() {
        return this.DestinationRegion;
    }

    /**
     * Set 目的地域。
     * @param DestinationRegion 目的地域。
     */
    public void setDestinationRegion(String DestinationRegion) {
        this.DestinationRegion = DestinationRegion;
    }

    /**
     * Get 云联网ID。 
     * @return CcnId 云联网ID。
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set 云联网ID。
     * @param CcnId 云联网ID。
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get 云联网所属账号。 
     * @return CcnUin 云联网所属账号。
     */
    public String getCcnUin() {
        return this.CcnUin;
    }

    /**
     * Set 云联网所属账号。
     * @param CcnUin 云联网所属账号。
     */
    public void setCcnUin(String CcnUin) {
        this.CcnUin = CcnUin;
    }

    /**
     * Get 时间粒度。单位为:秒，如60为60s的时间粒度 
     * @return Period 时间粒度。单位为:秒，如60为60s的时间粒度
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 时间粒度。单位为:秒，如60为60s的时间粒度
     * @param Period 时间粒度。单位为:秒，如60为60s的时间粒度
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 开始时间。 
     * @return StartTime 开始时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间。
     * @param StartTime 开始时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间。 
     * @return EndTime 结束时间。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间。
     * @param EndTime 结束时间。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeCrossBorderFlowMonitorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCrossBorderFlowMonitorRequest(DescribeCrossBorderFlowMonitorRequest source) {
        if (source.SourceRegion != null) {
            this.SourceRegion = new String(source.SourceRegion);
        }
        if (source.DestinationRegion != null) {
            this.DestinationRegion = new String(source.DestinationRegion);
        }
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.CcnUin != null) {
            this.CcnUin = new String(source.CcnUin);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceRegion", this.SourceRegion);
        this.setParamSimple(map, prefix + "DestinationRegion", this.DestinationRegion);
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "CcnUin", this.CcnUin);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

