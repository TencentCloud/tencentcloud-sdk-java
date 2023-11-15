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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAlarmListRes extends AbstractModel {

    /**
    * 第几页
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 总页数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalPage")
    @Expose
    private Long TotalPage;

    /**
    * 总条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalRow")
    @Expose
    private Long TotalRow;

    /**
    * 告警列表集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmInfoSet")
    @Expose
    private AlarmInfo [] AlarmInfoSet;

    /**
     * Get 第几页
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageNumber 第几页
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 第几页
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageNumber 第几页
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageSize 每页条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageSize 每页条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 总页数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalPage 总页数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalPage() {
        return this.TotalPage;
    }

    /**
     * Set 总页数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalPage 总页数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalPage(Long TotalPage) {
        this.TotalPage = TotalPage;
    }

    /**
     * Get 总条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalRow 总条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalRow() {
        return this.TotalRow;
    }

    /**
     * Set 总条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalRow 总条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalRow(Long TotalRow) {
        this.TotalRow = TotalRow;
    }

    /**
     * Get 告警列表集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmInfoSet 告警列表集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AlarmInfo [] getAlarmInfoSet() {
        return this.AlarmInfoSet;
    }

    /**
     * Set 告警列表集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmInfoSet 告警列表集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmInfoSet(AlarmInfo [] AlarmInfoSet) {
        this.AlarmInfoSet = AlarmInfoSet;
    }

    public DescribeAlarmListRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlarmListRes(DescribeAlarmListRes source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TotalPage != null) {
            this.TotalPage = new Long(source.TotalPage);
        }
        if (source.TotalRow != null) {
            this.TotalRow = new Long(source.TotalRow);
        }
        if (source.AlarmInfoSet != null) {
            this.AlarmInfoSet = new AlarmInfo[source.AlarmInfoSet.length];
            for (int i = 0; i < source.AlarmInfoSet.length; i++) {
                this.AlarmInfoSet[i] = new AlarmInfo(source.AlarmInfoSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TotalPage", this.TotalPage);
        this.setParamSimple(map, prefix + "TotalRow", this.TotalRow);
        this.setParamArrayObj(map, prefix + "AlarmInfoSet.", this.AlarmInfoSet);

    }
}

