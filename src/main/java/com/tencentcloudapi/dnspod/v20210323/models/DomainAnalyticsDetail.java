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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainAnalyticsDetail extends AbstractModel{

    /**
    * 当前统计维度解析量小计
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
    * 按天统计时，为统计日期
    */
    @SerializedName("DateKey")
    @Expose
    private String DateKey;

    /**
    * 按小时统计时，为统计的当前时间的小时数(0-23)，例：HourKey为23时，统计周期为22点-23点的解析量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HourKey")
    @Expose
    private Long HourKey;

    /**
     * Get 当前统计维度解析量小计 
     * @return Num 当前统计维度解析量小计
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set 当前统计维度解析量小计
     * @param Num 当前统计维度解析量小计
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    /**
     * Get 按天统计时，为统计日期 
     * @return DateKey 按天统计时，为统计日期
     */
    public String getDateKey() {
        return this.DateKey;
    }

    /**
     * Set 按天统计时，为统计日期
     * @param DateKey 按天统计时，为统计日期
     */
    public void setDateKey(String DateKey) {
        this.DateKey = DateKey;
    }

    /**
     * Get 按小时统计时，为统计的当前时间的小时数(0-23)，例：HourKey为23时，统计周期为22点-23点的解析量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HourKey 按小时统计时，为统计的当前时间的小时数(0-23)，例：HourKey为23时，统计周期为22点-23点的解析量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHourKey() {
        return this.HourKey;
    }

    /**
     * Set 按小时统计时，为统计的当前时间的小时数(0-23)，例：HourKey为23时，统计周期为22点-23点的解析量
注意：此字段可能返回 null，表示取不到有效值。
     * @param HourKey 按小时统计时，为统计的当前时间的小时数(0-23)，例：HourKey为23时，统计周期为22点-23点的解析量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHourKey(Long HourKey) {
        this.HourKey = HourKey;
    }

    public DomainAnalyticsDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainAnalyticsDetail(DomainAnalyticsDetail source) {
        if (source.Num != null) {
            this.Num = new Long(source.Num);
        }
        if (source.DateKey != null) {
            this.DateKey = new String(source.DateKey);
        }
        if (source.HourKey != null) {
            this.HourKey = new Long(source.HourKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Num", this.Num);
        this.setParamSimple(map, prefix + "DateKey", this.DateKey);
        this.setParamSimple(map, prefix + "HourKey", this.HourKey);

    }
}

