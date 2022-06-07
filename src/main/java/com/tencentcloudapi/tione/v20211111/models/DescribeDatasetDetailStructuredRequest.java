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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatasetDetailStructuredRequest extends AbstractModel{

    /**
    * 数据集ID
    */
    @SerializedName("DatasetId")
    @Expose
    private String DatasetId;

    /**
    * 偏移值
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数据条数，默认20，目前最大支持2000条数据
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 数据集ID 
     * @return DatasetId 数据集ID
     */
    public String getDatasetId() {
        return this.DatasetId;
    }

    /**
     * Set 数据集ID
     * @param DatasetId 数据集ID
     */
    public void setDatasetId(String DatasetId) {
        this.DatasetId = DatasetId;
    }

    /**
     * Get 偏移值 
     * @return Offset 偏移值
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移值
     * @param Offset 偏移值
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数据条数，默认20，目前最大支持2000条数据 
     * @return Limit 返回数据条数，默认20，目前最大支持2000条数据
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数据条数，默认20，目前最大支持2000条数据
     * @param Limit 返回数据条数，默认20，目前最大支持2000条数据
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeDatasetDetailStructuredRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatasetDetailStructuredRequest(DescribeDatasetDetailStructuredRequest source) {
        if (source.DatasetId != null) {
            this.DatasetId = new String(source.DatasetId);
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
        this.setParamSimple(map, prefix + "DatasetId", this.DatasetId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

