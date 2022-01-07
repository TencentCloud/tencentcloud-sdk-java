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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetWeChatBillDetailsRequest extends AbstractModel{

    /**
    * 拉取的日期（YYYY-MM-DD）。最大可追溯到365天前。当天6点后才能拉取前一天的数据。
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 游标。用于分页，取第一页时传0，取后续页面时，传入本接口响应中返回的NextCursor字段的值。
    */
    @SerializedName("Cursor")
    @Expose
    private Long Cursor;

    /**
    * 需要拉取账单详情业务对应的RuleId。不传会返回所有RuleId数据。默认为空字符串。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
     * Get 拉取的日期（YYYY-MM-DD）。最大可追溯到365天前。当天6点后才能拉取前一天的数据。 
     * @return Date 拉取的日期（YYYY-MM-DD）。最大可追溯到365天前。当天6点后才能拉取前一天的数据。
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 拉取的日期（YYYY-MM-DD）。最大可追溯到365天前。当天6点后才能拉取前一天的数据。
     * @param Date 拉取的日期（YYYY-MM-DD）。最大可追溯到365天前。当天6点后才能拉取前一天的数据。
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 游标。用于分页，取第一页时传0，取后续页面时，传入本接口响应中返回的NextCursor字段的值。 
     * @return Cursor 游标。用于分页，取第一页时传0，取后续页面时，传入本接口响应中返回的NextCursor字段的值。
     */
    public Long getCursor() {
        return this.Cursor;
    }

    /**
     * Set 游标。用于分页，取第一页时传0，取后续页面时，传入本接口响应中返回的NextCursor字段的值。
     * @param Cursor 游标。用于分页，取第一页时传0，取后续页面时，传入本接口响应中返回的NextCursor字段的值。
     */
    public void setCursor(Long Cursor) {
        this.Cursor = Cursor;
    }

    /**
     * Get 需要拉取账单详情业务对应的RuleId。不传会返回所有RuleId数据。默认为空字符串。 
     * @return RuleId 需要拉取账单详情业务对应的RuleId。不传会返回所有RuleId数据。默认为空字符串。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 需要拉取账单详情业务对应的RuleId。不传会返回所有RuleId数据。默认为空字符串。
     * @param RuleId 需要拉取账单详情业务对应的RuleId。不传会返回所有RuleId数据。默认为空字符串。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    public GetWeChatBillDetailsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetWeChatBillDetailsRequest(GetWeChatBillDetailsRequest source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.Cursor != null) {
            this.Cursor = new Long(source.Cursor);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Cursor", this.Cursor);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}

