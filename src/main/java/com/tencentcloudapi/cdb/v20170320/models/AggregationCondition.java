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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AggregationCondition extends AbstractModel{

    /**
    * 聚合字段。目前仅支持host-源IP、user-用户名、dbName-数据库名、sqlType-sql类型。
    */
    @SerializedName("AggregationField")
    @Expose
    private String AggregationField;

    /**
    * 偏移量。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 该聚合字段下要返回聚合桶的数量，最大100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 聚合字段。目前仅支持host-源IP、user-用户名、dbName-数据库名、sqlType-sql类型。 
     * @return AggregationField 聚合字段。目前仅支持host-源IP、user-用户名、dbName-数据库名、sqlType-sql类型。
     */
    public String getAggregationField() {
        return this.AggregationField;
    }

    /**
     * Set 聚合字段。目前仅支持host-源IP、user-用户名、dbName-数据库名、sqlType-sql类型。
     * @param AggregationField 聚合字段。目前仅支持host-源IP、user-用户名、dbName-数据库名、sqlType-sql类型。
     */
    public void setAggregationField(String AggregationField) {
        this.AggregationField = AggregationField;
    }

    /**
     * Get 偏移量。 
     * @return Offset 偏移量。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量。
     * @param Offset 偏移量。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 该聚合字段下要返回聚合桶的数量，最大100。 
     * @return Limit 该聚合字段下要返回聚合桶的数量，最大100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 该聚合字段下要返回聚合桶的数量，最大100。
     * @param Limit 该聚合字段下要返回聚合桶的数量，最大100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public AggregationCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AggregationCondition(AggregationCondition source) {
        if (source.AggregationField != null) {
            this.AggregationField = new String(source.AggregationField);
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
        this.setParamSimple(map, prefix + "AggregationField", this.AggregationField);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

