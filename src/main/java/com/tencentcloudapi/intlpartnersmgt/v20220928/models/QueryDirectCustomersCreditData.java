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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryDirectCustomersCreditData extends AbstractModel{

    /**
    * 用户Uin
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * 总信用值
    */
    @SerializedName("TotalCredit")
    @Expose
    private Float TotalCredit;

    /**
    * 剩余信用值
    */
    @SerializedName("RemainingCredit")
    @Expose
    private Float RemainingCredit;

    /**
     * Get 用户Uin 
     * @return Uin 用户Uin
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set 用户Uin
     * @param Uin 用户Uin
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 总信用值 
     * @return TotalCredit 总信用值
     */
    public Float getTotalCredit() {
        return this.TotalCredit;
    }

    /**
     * Set 总信用值
     * @param TotalCredit 总信用值
     */
    public void setTotalCredit(Float TotalCredit) {
        this.TotalCredit = TotalCredit;
    }

    /**
     * Get 剩余信用值 
     * @return RemainingCredit 剩余信用值
     */
    public Float getRemainingCredit() {
        return this.RemainingCredit;
    }

    /**
     * Set 剩余信用值
     * @param RemainingCredit 剩余信用值
     */
    public void setRemainingCredit(Float RemainingCredit) {
        this.RemainingCredit = RemainingCredit;
    }

    public QueryDirectCustomersCreditData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryDirectCustomersCreditData(QueryDirectCustomersCreditData source) {
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.TotalCredit != null) {
            this.TotalCredit = new Float(source.TotalCredit);
        }
        if (source.RemainingCredit != null) {
            this.RemainingCredit = new Float(source.RemainingCredit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "TotalCredit", this.TotalCredit);
        this.setParamSimple(map, prefix + "RemainingCredit", this.RemainingCredit);

    }
}

