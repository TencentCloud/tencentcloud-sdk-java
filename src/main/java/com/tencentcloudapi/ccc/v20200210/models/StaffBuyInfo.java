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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StaffBuyInfo extends AbstractModel{

    /**
    * 购买坐席数量
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
    * 购买时间戳
    */
    @SerializedName("BuyTime")
    @Expose
    private Long BuyTime;

    /**
    * 截至时间戳
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get 购买坐席数量 
     * @return Num 购买坐席数量
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set 购买坐席数量
     * @param Num 购买坐席数量
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    /**
     * Get 购买时间戳 
     * @return BuyTime 购买时间戳
     */
    public Long getBuyTime() {
        return this.BuyTime;
    }

    /**
     * Set 购买时间戳
     * @param BuyTime 购买时间戳
     */
    public void setBuyTime(Long BuyTime) {
        this.BuyTime = BuyTime;
    }

    /**
     * Get 截至时间戳 
     * @return EndTime 截至时间戳
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 截至时间戳
     * @param EndTime 截至时间戳
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public StaffBuyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StaffBuyInfo(StaffBuyInfo source) {
        if (source.Num != null) {
            this.Num = new Long(source.Num);
        }
        if (source.BuyTime != null) {
            this.BuyTime = new Long(source.BuyTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Num", this.Num);
        this.setParamSimple(map, prefix + "BuyTime", this.BuyTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

