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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TablePropertyScore extends AbstractModel {

    /**
    * 表ID
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * 统计日期
    */
    @SerializedName("DayTime")
    @Expose
    private String DayTime;

    /**
    * 表完整性评分
    */
    @SerializedName("Integrity")
    @Expose
    private Float Integrity;

    /**
    * 表保障性评分
    */
    @SerializedName("Safety")
    @Expose
    private Float Safety;

    /**
    * 表及时性评分
    */
    @SerializedName("Timeliness")
    @Expose
    private Float Timeliness;

    /**
    * 表稳定性评分
    */
    @SerializedName("Stability")
    @Expose
    private Float Stability;

    /**
    * 表规范性评分
    */
    @SerializedName("Normative")
    @Expose
    private Float Normative;

    /**
    * 资产评分平均分
    */
    @SerializedName("Average")
    @Expose
    private Float Average;

    /**
     * Get 表ID 
     * @return TableId 表ID
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set 表ID
     * @param TableId 表ID
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get 统计日期 
     * @return DayTime 统计日期
     */
    public String getDayTime() {
        return this.DayTime;
    }

    /**
     * Set 统计日期
     * @param DayTime 统计日期
     */
    public void setDayTime(String DayTime) {
        this.DayTime = DayTime;
    }

    /**
     * Get 表完整性评分 
     * @return Integrity 表完整性评分
     */
    public Float getIntegrity() {
        return this.Integrity;
    }

    /**
     * Set 表完整性评分
     * @param Integrity 表完整性评分
     */
    public void setIntegrity(Float Integrity) {
        this.Integrity = Integrity;
    }

    /**
     * Get 表保障性评分 
     * @return Safety 表保障性评分
     */
    public Float getSafety() {
        return this.Safety;
    }

    /**
     * Set 表保障性评分
     * @param Safety 表保障性评分
     */
    public void setSafety(Float Safety) {
        this.Safety = Safety;
    }

    /**
     * Get 表及时性评分 
     * @return Timeliness 表及时性评分
     */
    public Float getTimeliness() {
        return this.Timeliness;
    }

    /**
     * Set 表及时性评分
     * @param Timeliness 表及时性评分
     */
    public void setTimeliness(Float Timeliness) {
        this.Timeliness = Timeliness;
    }

    /**
     * Get 表稳定性评分 
     * @return Stability 表稳定性评分
     */
    public Float getStability() {
        return this.Stability;
    }

    /**
     * Set 表稳定性评分
     * @param Stability 表稳定性评分
     */
    public void setStability(Float Stability) {
        this.Stability = Stability;
    }

    /**
     * Get 表规范性评分 
     * @return Normative 表规范性评分
     */
    public Float getNormative() {
        return this.Normative;
    }

    /**
     * Set 表规范性评分
     * @param Normative 表规范性评分
     */
    public void setNormative(Float Normative) {
        this.Normative = Normative;
    }

    /**
     * Get 资产评分平均分 
     * @return Average 资产评分平均分
     */
    public Float getAverage() {
        return this.Average;
    }

    /**
     * Set 资产评分平均分
     * @param Average 资产评分平均分
     */
    public void setAverage(Float Average) {
        this.Average = Average;
    }

    public TablePropertyScore() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TablePropertyScore(TablePropertyScore source) {
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.DayTime != null) {
            this.DayTime = new String(source.DayTime);
        }
        if (source.Integrity != null) {
            this.Integrity = new Float(source.Integrity);
        }
        if (source.Safety != null) {
            this.Safety = new Float(source.Safety);
        }
        if (source.Timeliness != null) {
            this.Timeliness = new Float(source.Timeliness);
        }
        if (source.Stability != null) {
            this.Stability = new Float(source.Stability);
        }
        if (source.Normative != null) {
            this.Normative = new Float(source.Normative);
        }
        if (source.Average != null) {
            this.Average = new Float(source.Average);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "DayTime", this.DayTime);
        this.setParamSimple(map, prefix + "Integrity", this.Integrity);
        this.setParamSimple(map, prefix + "Safety", this.Safety);
        this.setParamSimple(map, prefix + "Timeliness", this.Timeliness);
        this.setParamSimple(map, prefix + "Stability", this.Stability);
        this.setParamSimple(map, prefix + "Normative", this.Normative);
        this.setParamSimple(map, prefix + "Average", this.Average);

    }
}

