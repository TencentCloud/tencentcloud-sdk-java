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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TRTCDataResp extends AbstractModel{

    /**
    * StatementID值，监控仪表盘下固定为0。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatementID")
    @Expose
    private Long StatementID;

    /**
    * 查询结果数据，以Columns-Values形式返回。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Series")
    @Expose
    private SeriesInfo [] Series;

    /**
    * Total值，监控仪表盘功能下固定为1。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
     * Get StatementID值，监控仪表盘下固定为0。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatementID StatementID值，监控仪表盘下固定为0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatementID() {
        return this.StatementID;
    }

    /**
     * Set StatementID值，监控仪表盘下固定为0。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatementID StatementID值，监控仪表盘下固定为0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatementID(Long StatementID) {
        this.StatementID = StatementID;
    }

    /**
     * Get 查询结果数据，以Columns-Values形式返回。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Series 查询结果数据，以Columns-Values形式返回。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SeriesInfo [] getSeries() {
        return this.Series;
    }

    /**
     * Set 查询结果数据，以Columns-Values形式返回。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Series 查询结果数据，以Columns-Values形式返回。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeries(SeriesInfo [] Series) {
        this.Series = Series;
    }

    /**
     * Get Total值，监控仪表盘功能下固定为1。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total Total值，监控仪表盘功能下固定为1。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total值，监控仪表盘功能下固定为1。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total Total值，监控仪表盘功能下固定为1。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    public TRTCDataResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TRTCDataResp(TRTCDataResp source) {
        if (source.StatementID != null) {
            this.StatementID = new Long(source.StatementID);
        }
        if (source.Series != null) {
            this.Series = new SeriesInfo[source.Series.length];
            for (int i = 0; i < source.Series.length; i++) {
                this.Series[i] = new SeriesInfo(source.Series[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StatementID", this.StatementID);
        this.setParamArrayObj(map, prefix + "Series.", this.Series);
        this.setParamSimple(map, prefix + "Total", this.Total);

    }
}

