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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFlavorKingCycleBrandProvinceScanAnalysisRequest extends AbstractModel {

    /**
    * <p>企业ID</p>
    */
    @SerializedName("CorpId")
    @Expose
    private Long CorpId;

    /**
    * <p>日期类型</p>
    */
    @SerializedName("TypeDate")
    @Expose
    private String TypeDate;

    /**
    * <p>溯源ID</p>
    */
    @SerializedName("QueryDate")
    @Expose
    private String QueryDate;

    /**
     * Get <p>企业ID</p> 
     * @return CorpId <p>企业ID</p>
     */
    public Long getCorpId() {
        return this.CorpId;
    }

    /**
     * Set <p>企业ID</p>
     * @param CorpId <p>企业ID</p>
     */
    public void setCorpId(Long CorpId) {
        this.CorpId = CorpId;
    }

    /**
     * Get <p>日期类型</p> 
     * @return TypeDate <p>日期类型</p>
     */
    public String getTypeDate() {
        return this.TypeDate;
    }

    /**
     * Set <p>日期类型</p>
     * @param TypeDate <p>日期类型</p>
     */
    public void setTypeDate(String TypeDate) {
        this.TypeDate = TypeDate;
    }

    /**
     * Get <p>溯源ID</p> 
     * @return QueryDate <p>溯源ID</p>
     */
    public String getQueryDate() {
        return this.QueryDate;
    }

    /**
     * Set <p>溯源ID</p>
     * @param QueryDate <p>溯源ID</p>
     */
    public void setQueryDate(String QueryDate) {
        this.QueryDate = QueryDate;
    }

    public DescribeFlavorKingCycleBrandProvinceScanAnalysisRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFlavorKingCycleBrandProvinceScanAnalysisRequest(DescribeFlavorKingCycleBrandProvinceScanAnalysisRequest source) {
        if (source.CorpId != null) {
            this.CorpId = new Long(source.CorpId);
        }
        if (source.TypeDate != null) {
            this.TypeDate = new String(source.TypeDate);
        }
        if (source.QueryDate != null) {
            this.QueryDate = new String(source.QueryDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "TypeDate", this.TypeDate);
        this.setParamSimple(map, prefix + "QueryDate", this.QueryDate);

    }
}

