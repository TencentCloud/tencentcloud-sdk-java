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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDomainPriceListRequest extends AbstractModel{

    /**
    * 查询价格的后缀列表。默认则为全部后缀
    */
    @SerializedName("TldList")
    @Expose
    private String [] TldList;

    /**
    * 查询购买的年份，默认会列出所有年份的价格
    */
    @SerializedName("Year")
    @Expose
    private Long [] Year;

    /**
    * 域名的购买类型：new  新购，renew 续费，redem 赎回，tran 转入
    */
    @SerializedName("Operation")
    @Expose
    private String [] Operation;

    /**
     * Get 查询价格的后缀列表。默认则为全部后缀 
     * @return TldList 查询价格的后缀列表。默认则为全部后缀
     */
    public String [] getTldList() {
        return this.TldList;
    }

    /**
     * Set 查询价格的后缀列表。默认则为全部后缀
     * @param TldList 查询价格的后缀列表。默认则为全部后缀
     */
    public void setTldList(String [] TldList) {
        this.TldList = TldList;
    }

    /**
     * Get 查询购买的年份，默认会列出所有年份的价格 
     * @return Year 查询购买的年份，默认会列出所有年份的价格
     */
    public Long [] getYear() {
        return this.Year;
    }

    /**
     * Set 查询购买的年份，默认会列出所有年份的价格
     * @param Year 查询购买的年份，默认会列出所有年份的价格
     */
    public void setYear(Long [] Year) {
        this.Year = Year;
    }

    /**
     * Get 域名的购买类型：new  新购，renew 续费，redem 赎回，tran 转入 
     * @return Operation 域名的购买类型：new  新购，renew 续费，redem 赎回，tran 转入
     */
    public String [] getOperation() {
        return this.Operation;
    }

    /**
     * Set 域名的购买类型：new  新购，renew 续费，redem 赎回，tran 转入
     * @param Operation 域名的购买类型：new  新购，renew 续费，redem 赎回，tran 转入
     */
    public void setOperation(String [] Operation) {
        this.Operation = Operation;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TldList.", this.TldList);
        this.setParamArraySimple(map, prefix + "Year.", this.Year);
        this.setParamArraySimple(map, prefix + "Operation.", this.Operation);

    }
}

