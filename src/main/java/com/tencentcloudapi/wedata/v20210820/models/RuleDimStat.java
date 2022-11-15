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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleDimStat extends AbstractModel{

    /**
    * 总数
    */
    @SerializedName("TotalCnt")
    @Expose
    private Long TotalCnt;

    /**
    * 维度统计数
    */
    @SerializedName("DimCntList")
    @Expose
    private RuleDimCnt [] DimCntList;

    /**
     * Get 总数 
     * @return TotalCnt 总数
     */
    public Long getTotalCnt() {
        return this.TotalCnt;
    }

    /**
     * Set 总数
     * @param TotalCnt 总数
     */
    public void setTotalCnt(Long TotalCnt) {
        this.TotalCnt = TotalCnt;
    }

    /**
     * Get 维度统计数 
     * @return DimCntList 维度统计数
     */
    public RuleDimCnt [] getDimCntList() {
        return this.DimCntList;
    }

    /**
     * Set 维度统计数
     * @param DimCntList 维度统计数
     */
    public void setDimCntList(RuleDimCnt [] DimCntList) {
        this.DimCntList = DimCntList;
    }

    public RuleDimStat() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleDimStat(RuleDimStat source) {
        if (source.TotalCnt != null) {
            this.TotalCnt = new Long(source.TotalCnt);
        }
        if (source.DimCntList != null) {
            this.DimCntList = new RuleDimCnt[source.DimCntList.length];
            for (int i = 0; i < source.DimCntList.length; i++) {
                this.DimCntList[i] = new RuleDimCnt(source.DimCntList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCnt", this.TotalCnt);
        this.setParamArrayObj(map, prefix + "DimCntList.", this.DimCntList);

    }
}

