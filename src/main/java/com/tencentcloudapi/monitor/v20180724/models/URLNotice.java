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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class URLNotice extends AbstractModel{

    /**
    * 回调 url（限长256字符）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("URL")
    @Expose
    private String URL;

    /**
    * 是否通过验证 0=否 1=是
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsValid")
    @Expose
    private Long IsValid;

    /**
    * 验证码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValidationCode")
    @Expose
    private String ValidationCode;

    /**
    * 通知开始时间 一天开始的秒数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 通知结束时间 一天开始的秒数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 通知周期 1-7表示周一到周日
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Weekday")
    @Expose
    private Long [] Weekday;

    /**
     * Get 回调 url（限长256字符）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return URL 回调 url（限长256字符）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getURL() {
        return this.URL;
    }

    /**
     * Set 回调 url（限长256字符）
注意：此字段可能返回 null，表示取不到有效值。
     * @param URL 回调 url（限长256字符）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     * Get 是否通过验证 0=否 1=是
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsValid 是否通过验证 0=否 1=是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsValid() {
        return this.IsValid;
    }

    /**
     * Set 是否通过验证 0=否 1=是
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsValid 是否通过验证 0=否 1=是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsValid(Long IsValid) {
        this.IsValid = IsValid;
    }

    /**
     * Get 验证码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValidationCode 验证码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValidationCode() {
        return this.ValidationCode;
    }

    /**
     * Set 验证码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValidationCode 验证码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValidationCode(String ValidationCode) {
        this.ValidationCode = ValidationCode;
    }

    /**
     * Get 通知开始时间 一天开始的秒数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 通知开始时间 一天开始的秒数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 通知开始时间 一天开始的秒数
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 通知开始时间 一天开始的秒数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 通知结束时间 一天开始的秒数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 通知结束时间 一天开始的秒数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 通知结束时间 一天开始的秒数
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 通知结束时间 一天开始的秒数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 通知周期 1-7表示周一到周日
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Weekday 通知周期 1-7表示周一到周日
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getWeekday() {
        return this.Weekday;
    }

    /**
     * Set 通知周期 1-7表示周一到周日
注意：此字段可能返回 null，表示取不到有效值。
     * @param Weekday 通知周期 1-7表示周一到周日
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeekday(Long [] Weekday) {
        this.Weekday = Weekday;
    }

    public URLNotice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public URLNotice(URLNotice source) {
        if (source.URL != null) {
            this.URL = new String(source.URL);
        }
        if (source.IsValid != null) {
            this.IsValid = new Long(source.IsValid);
        }
        if (source.ValidationCode != null) {
            this.ValidationCode = new String(source.ValidationCode);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Weekday != null) {
            this.Weekday = new Long[source.Weekday.length];
            for (int i = 0; i < source.Weekday.length; i++) {
                this.Weekday[i] = new Long(source.Weekday[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "URL", this.URL);
        this.setParamSimple(map, prefix + "IsValid", this.IsValid);
        this.setParamSimple(map, prefix + "ValidationCode", this.ValidationCode);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "Weekday.", this.Weekday);

    }
}

