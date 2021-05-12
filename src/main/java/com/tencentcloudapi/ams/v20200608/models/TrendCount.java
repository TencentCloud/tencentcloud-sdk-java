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
package com.tencentcloudapi.ams.v20200608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrendCount extends AbstractModel{

    /**
    * 总调用量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 总调用时长
    */
    @SerializedName("TotalHour")
    @Expose
    private Long TotalHour;

    /**
    * 通过量
    */
    @SerializedName("PassCount")
    @Expose
    private Long PassCount;

    /**
    * 通过时长
    */
    @SerializedName("PassHour")
    @Expose
    private Long PassHour;

    /**
    * 违规量
    */
    @SerializedName("EvilCount")
    @Expose
    private Long EvilCount;

    /**
    * 违规时长
    */
    @SerializedName("EvilHour")
    @Expose
    private Long EvilHour;

    /**
    * 疑似违规量
    */
    @SerializedName("SuspectCount")
    @Expose
    private Long SuspectCount;

    /**
    * 疑似违规时长
    */
    @SerializedName("SuspectHour")
    @Expose
    private Long SuspectHour;

    /**
    * 日期
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
     * Get 总调用量 
     * @return TotalCount 总调用量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总调用量
     * @param TotalCount 总调用量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 总调用时长 
     * @return TotalHour 总调用时长
     */
    public Long getTotalHour() {
        return this.TotalHour;
    }

    /**
     * Set 总调用时长
     * @param TotalHour 总调用时长
     */
    public void setTotalHour(Long TotalHour) {
        this.TotalHour = TotalHour;
    }

    /**
     * Get 通过量 
     * @return PassCount 通过量
     */
    public Long getPassCount() {
        return this.PassCount;
    }

    /**
     * Set 通过量
     * @param PassCount 通过量
     */
    public void setPassCount(Long PassCount) {
        this.PassCount = PassCount;
    }

    /**
     * Get 通过时长 
     * @return PassHour 通过时长
     */
    public Long getPassHour() {
        return this.PassHour;
    }

    /**
     * Set 通过时长
     * @param PassHour 通过时长
     */
    public void setPassHour(Long PassHour) {
        this.PassHour = PassHour;
    }

    /**
     * Get 违规量 
     * @return EvilCount 违规量
     */
    public Long getEvilCount() {
        return this.EvilCount;
    }

    /**
     * Set 违规量
     * @param EvilCount 违规量
     */
    public void setEvilCount(Long EvilCount) {
        this.EvilCount = EvilCount;
    }

    /**
     * Get 违规时长 
     * @return EvilHour 违规时长
     */
    public Long getEvilHour() {
        return this.EvilHour;
    }

    /**
     * Set 违规时长
     * @param EvilHour 违规时长
     */
    public void setEvilHour(Long EvilHour) {
        this.EvilHour = EvilHour;
    }

    /**
     * Get 疑似违规量 
     * @return SuspectCount 疑似违规量
     */
    public Long getSuspectCount() {
        return this.SuspectCount;
    }

    /**
     * Set 疑似违规量
     * @param SuspectCount 疑似违规量
     */
    public void setSuspectCount(Long SuspectCount) {
        this.SuspectCount = SuspectCount;
    }

    /**
     * Get 疑似违规时长 
     * @return SuspectHour 疑似违规时长
     */
    public Long getSuspectHour() {
        return this.SuspectHour;
    }

    /**
     * Set 疑似违规时长
     * @param SuspectHour 疑似违规时长
     */
    public void setSuspectHour(Long SuspectHour) {
        this.SuspectHour = SuspectHour;
    }

    /**
     * Get 日期 
     * @return Date 日期
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 日期
     * @param Date 日期
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    public TrendCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrendCount(TrendCount source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TotalHour != null) {
            this.TotalHour = new Long(source.TotalHour);
        }
        if (source.PassCount != null) {
            this.PassCount = new Long(source.PassCount);
        }
        if (source.PassHour != null) {
            this.PassHour = new Long(source.PassHour);
        }
        if (source.EvilCount != null) {
            this.EvilCount = new Long(source.EvilCount);
        }
        if (source.EvilHour != null) {
            this.EvilHour = new Long(source.EvilHour);
        }
        if (source.SuspectCount != null) {
            this.SuspectCount = new Long(source.SuspectCount);
        }
        if (source.SuspectHour != null) {
            this.SuspectHour = new Long(source.SuspectHour);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TotalHour", this.TotalHour);
        this.setParamSimple(map, prefix + "PassCount", this.PassCount);
        this.setParamSimple(map, prefix + "PassHour", this.PassHour);
        this.setParamSimple(map, prefix + "EvilCount", this.EvilCount);
        this.setParamSimple(map, prefix + "EvilHour", this.EvilHour);
        this.setParamSimple(map, prefix + "SuspectCount", this.SuspectCount);
        this.setParamSimple(map, prefix + "SuspectHour", this.SuspectHour);
        this.setParamSimple(map, prefix + "Date", this.Date);

    }
}

