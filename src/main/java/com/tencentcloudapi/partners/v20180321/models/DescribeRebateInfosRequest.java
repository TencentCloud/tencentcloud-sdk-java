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

public class DescribeRebateInfosRequest  extends AbstractModel{

    /**
    * 返佣月份，如2018-02
    */
    @SerializedName("RebateMonth")
    @Expose
    private String RebateMonth;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 限制数目
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
     * 获取返佣月份，如2018-02
     * @return RebateMonth 返佣月份，如2018-02
     */
    public String getRebateMonth() {
        return this.RebateMonth;
    }

    /**
     * 设置返佣月份，如2018-02
     * @param RebateMonth 返佣月份，如2018-02
     */
    public void setRebateMonth(String RebateMonth) {
        this.RebateMonth = RebateMonth;
    }

    /**
     * 获取偏移量
     * @return Offset 偏移量
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取限制数目
     * @return Limit 限制数目
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置限制数目
     * @param Limit 限制数目
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RebateMonth", this.RebateMonth);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

