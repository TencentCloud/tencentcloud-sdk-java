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
package com.tencentcloudapi.partners.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSalesmansRequest extends AbstractModel{

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制数目
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 业务员姓名(模糊查询)
    */
    @SerializedName("SalesName")
    @Expose
    private String SalesName;

    /**
    * 业务员ID
    */
    @SerializedName("SalesUin")
    @Expose
    private String SalesUin;

    /**
    * ASC/DESC， 不区分大小写，按创建通过时间排序
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制数目 
     * @return Limit 限制数目
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制数目
     * @param Limit 限制数目
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 业务员姓名(模糊查询) 
     * @return SalesName 业务员姓名(模糊查询)
     */
    public String getSalesName() {
        return this.SalesName;
    }

    /**
     * Set 业务员姓名(模糊查询)
     * @param SalesName 业务员姓名(模糊查询)
     */
    public void setSalesName(String SalesName) {
        this.SalesName = SalesName;
    }

    /**
     * Get 业务员ID 
     * @return SalesUin 业务员ID
     */
    public String getSalesUin() {
        return this.SalesUin;
    }

    /**
     * Set 业务员ID
     * @param SalesUin 业务员ID
     */
    public void setSalesUin(String SalesUin) {
        this.SalesUin = SalesUin;
    }

    /**
     * Get ASC/DESC， 不区分大小写，按创建通过时间排序 
     * @return OrderDirection ASC/DESC， 不区分大小写，按创建通过时间排序
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set ASC/DESC， 不区分大小写，按创建通过时间排序
     * @param OrderDirection ASC/DESC， 不区分大小写，按创建通过时间排序
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SalesName", this.SalesName);
        this.setParamSimple(map, prefix + "SalesUin", this.SalesUin);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);

    }
}

