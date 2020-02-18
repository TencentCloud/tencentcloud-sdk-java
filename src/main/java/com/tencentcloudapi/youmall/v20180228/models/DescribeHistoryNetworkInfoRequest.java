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
package com.tencentcloudapi.youmall.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHistoryNetworkInfoRequest extends AbstractModel{

    /**
    * 请求时间戳
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * 优mall集团id，通过"指定身份标识获取客户门店列表"接口获取
    */
    @SerializedName("CompanyId")
    @Expose
    private String CompanyId;

    /**
    * 优mall店铺id，通过"指定身份标识获取客户门店列表"接口获取，为0则拉取集团全部店铺当前
    */
    @SerializedName("ShopId")
    @Expose
    private Long ShopId;

    /**
    * 拉取开始日期，格式：2018-09-05
    */
    @SerializedName("StartDay")
    @Expose
    private String StartDay;

    /**
    * 拉取结束日期，格式L:2018-09-05，超过StartDay 90天，按StartDay+90天算
    */
    @SerializedName("EndDay")
    @Expose
    private String EndDay;

    /**
    * 拉取条数，默认10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 拉取偏移，返回offset之后的数据
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 请求时间戳 
     * @return Time 请求时间戳
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set 请求时间戳
     * @param Time 请求时间戳
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get 优mall集团id，通过"指定身份标识获取客户门店列表"接口获取 
     * @return CompanyId 优mall集团id，通过"指定身份标识获取客户门店列表"接口获取
     */
    public String getCompanyId() {
        return this.CompanyId;
    }

    /**
     * Set 优mall集团id，通过"指定身份标识获取客户门店列表"接口获取
     * @param CompanyId 优mall集团id，通过"指定身份标识获取客户门店列表"接口获取
     */
    public void setCompanyId(String CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * Get 优mall店铺id，通过"指定身份标识获取客户门店列表"接口获取，为0则拉取集团全部店铺当前 
     * @return ShopId 优mall店铺id，通过"指定身份标识获取客户门店列表"接口获取，为0则拉取集团全部店铺当前
     */
    public Long getShopId() {
        return this.ShopId;
    }

    /**
     * Set 优mall店铺id，通过"指定身份标识获取客户门店列表"接口获取，为0则拉取集团全部店铺当前
     * @param ShopId 优mall店铺id，通过"指定身份标识获取客户门店列表"接口获取，为0则拉取集团全部店铺当前
     */
    public void setShopId(Long ShopId) {
        this.ShopId = ShopId;
    }

    /**
     * Get 拉取开始日期，格式：2018-09-05 
     * @return StartDay 拉取开始日期，格式：2018-09-05
     */
    public String getStartDay() {
        return this.StartDay;
    }

    /**
     * Set 拉取开始日期，格式：2018-09-05
     * @param StartDay 拉取开始日期，格式：2018-09-05
     */
    public void setStartDay(String StartDay) {
        this.StartDay = StartDay;
    }

    /**
     * Get 拉取结束日期，格式L:2018-09-05，超过StartDay 90天，按StartDay+90天算 
     * @return EndDay 拉取结束日期，格式L:2018-09-05，超过StartDay 90天，按StartDay+90天算
     */
    public String getEndDay() {
        return this.EndDay;
    }

    /**
     * Set 拉取结束日期，格式L:2018-09-05，超过StartDay 90天，按StartDay+90天算
     * @param EndDay 拉取结束日期，格式L:2018-09-05，超过StartDay 90天，按StartDay+90天算
     */
    public void setEndDay(String EndDay) {
        this.EndDay = EndDay;
    }

    /**
     * Get 拉取条数，默认10 
     * @return Limit 拉取条数，默认10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 拉取条数，默认10
     * @param Limit 拉取条数，默认10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 拉取偏移，返回offset之后的数据 
     * @return Offset 拉取偏移，返回offset之后的数据
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 拉取偏移，返回offset之后的数据
     * @param Offset 拉取偏移，返回offset之后的数据
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "ShopId", this.ShopId);
        this.setParamSimple(map, prefix + "StartDay", this.StartDay);
        this.setParamSimple(map, prefix + "EndDay", this.EndDay);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

