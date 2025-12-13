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
package com.tencentcloudapi.dbs.v20211108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupPeriod extends AbstractModel {

    /**
    * 全量备份频率。目前仅支持"Weekly" - 每星期
    */
    @SerializedName("PeriodType")
    @Expose
    private String PeriodType;

    /**
    * 全量备份周期。取值范围为：["Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"]。
    */
    @SerializedName("Day")
    @Expose
    private String [] Day;

    /**
     * Get 全量备份频率。目前仅支持"Weekly" - 每星期 
     * @return PeriodType 全量备份频率。目前仅支持"Weekly" - 每星期
     */
    public String getPeriodType() {
        return this.PeriodType;
    }

    /**
     * Set 全量备份频率。目前仅支持"Weekly" - 每星期
     * @param PeriodType 全量备份频率。目前仅支持"Weekly" - 每星期
     */
    public void setPeriodType(String PeriodType) {
        this.PeriodType = PeriodType;
    }

    /**
     * Get 全量备份周期。取值范围为：["Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"]。 
     * @return Day 全量备份周期。取值范围为：["Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"]。
     */
    public String [] getDay() {
        return this.Day;
    }

    /**
     * Set 全量备份周期。取值范围为：["Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"]。
     * @param Day 全量备份周期。取值范围为：["Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"]。
     */
    public void setDay(String [] Day) {
        this.Day = Day;
    }

    public BackupPeriod() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupPeriod(BackupPeriod source) {
        if (source.PeriodType != null) {
            this.PeriodType = new String(source.PeriodType);
        }
        if (source.Day != null) {
            this.Day = new String[source.Day.length];
            for (int i = 0; i < source.Day.length; i++) {
                this.Day[i] = new String(source.Day[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PeriodType", this.PeriodType);
        this.setParamArraySimple(map, prefix + "Day.", this.Day);

    }
}

