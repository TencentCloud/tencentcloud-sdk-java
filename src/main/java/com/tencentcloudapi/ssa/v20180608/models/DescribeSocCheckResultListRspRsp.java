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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSocCheckResultListRspRsp extends AbstractModel{

    /**
    * 具体检查项详情
    */
    @SerializedName("List")
    @Expose
    private SocCheckResult [] List;

    /**
    * 检查结果总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 低危个数
    */
    @SerializedName("LowTotal")
    @Expose
    private Long LowTotal;

    /**
    * 中危个数
    */
    @SerializedName("MiddleTotal")
    @Expose
    private Long MiddleTotal;

    /**
    * 高危个数
    */
    @SerializedName("HighTotal")
    @Expose
    private Long HighTotal;

    /**
    * 正常个数
    */
    @SerializedName("NormalTotal")
    @Expose
    private Long NormalTotal;

    /**
     * Get 具体检查项详情 
     * @return List 具体检查项详情
     */
    public SocCheckResult [] getList() {
        return this.List;
    }

    /**
     * Set 具体检查项详情
     * @param List 具体检查项详情
     */
    public void setList(SocCheckResult [] List) {
        this.List = List;
    }

    /**
     * Get 检查结果总数 
     * @return Total 检查结果总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 检查结果总数
     * @param Total 检查结果总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 低危个数 
     * @return LowTotal 低危个数
     */
    public Long getLowTotal() {
        return this.LowTotal;
    }

    /**
     * Set 低危个数
     * @param LowTotal 低危个数
     */
    public void setLowTotal(Long LowTotal) {
        this.LowTotal = LowTotal;
    }

    /**
     * Get 中危个数 
     * @return MiddleTotal 中危个数
     */
    public Long getMiddleTotal() {
        return this.MiddleTotal;
    }

    /**
     * Set 中危个数
     * @param MiddleTotal 中危个数
     */
    public void setMiddleTotal(Long MiddleTotal) {
        this.MiddleTotal = MiddleTotal;
    }

    /**
     * Get 高危个数 
     * @return HighTotal 高危个数
     */
    public Long getHighTotal() {
        return this.HighTotal;
    }

    /**
     * Set 高危个数
     * @param HighTotal 高危个数
     */
    public void setHighTotal(Long HighTotal) {
        this.HighTotal = HighTotal;
    }

    /**
     * Get 正常个数 
     * @return NormalTotal 正常个数
     */
    public Long getNormalTotal() {
        return this.NormalTotal;
    }

    /**
     * Set 正常个数
     * @param NormalTotal 正常个数
     */
    public void setNormalTotal(Long NormalTotal) {
        this.NormalTotal = NormalTotal;
    }

    public DescribeSocCheckResultListRspRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSocCheckResultListRspRsp(DescribeSocCheckResultListRspRsp source) {
        if (source.List != null) {
            this.List = new SocCheckResult[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new SocCheckResult(source.List[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.LowTotal != null) {
            this.LowTotal = new Long(source.LowTotal);
        }
        if (source.MiddleTotal != null) {
            this.MiddleTotal = new Long(source.MiddleTotal);
        }
        if (source.HighTotal != null) {
            this.HighTotal = new Long(source.HighTotal);
        }
        if (source.NormalTotal != null) {
            this.NormalTotal = new Long(source.NormalTotal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "LowTotal", this.LowTotal);
        this.setParamSimple(map, prefix + "MiddleTotal", this.MiddleTotal);
        this.setParamSimple(map, prefix + "HighTotal", this.HighTotal);
        this.setParamSimple(map, prefix + "NormalTotal", this.NormalTotal);

    }
}

