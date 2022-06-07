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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryFlexFreezeOrderListRequest extends AbstractModel{

    /**
    * 收款用户ID
    */
    @SerializedName("PayeeId")
    @Expose
    private String PayeeId;

    /**
    * 操作类型
FREEZE:冻结
UNFREEZE:解冻
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
    * 开始时间，格式"yyyy-MM-dd hh:mm:ss"
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，格式"yyyy-MM-dd hh:mm:ss"
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 分页
    */
    @SerializedName("PageNumber")
    @Expose
    private Paging PageNumber;

    /**
     * Get 收款用户ID 
     * @return PayeeId 收款用户ID
     */
    public String getPayeeId() {
        return this.PayeeId;
    }

    /**
     * Set 收款用户ID
     * @param PayeeId 收款用户ID
     */
    public void setPayeeId(String PayeeId) {
        this.PayeeId = PayeeId;
    }

    /**
     * Get 操作类型
FREEZE:冻结
UNFREEZE:解冻 
     * @return OperationType 操作类型
FREEZE:冻结
UNFREEZE:解冻
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set 操作类型
FREEZE:冻结
UNFREEZE:解冻
     * @param OperationType 操作类型
FREEZE:冻结
UNFREEZE:解冻
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get 开始时间，格式"yyyy-MM-dd hh:mm:ss" 
     * @return StartTime 开始时间，格式"yyyy-MM-dd hh:mm:ss"
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，格式"yyyy-MM-dd hh:mm:ss"
     * @param StartTime 开始时间，格式"yyyy-MM-dd hh:mm:ss"
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，格式"yyyy-MM-dd hh:mm:ss" 
     * @return EndTime 结束时间，格式"yyyy-MM-dd hh:mm:ss"
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，格式"yyyy-MM-dd hh:mm:ss"
     * @param EndTime 结束时间，格式"yyyy-MM-dd hh:mm:ss"
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 分页 
     * @return PageNumber 分页
     */
    public Paging getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页
     * @param PageNumber 分页
     */
    public void setPageNumber(Paging PageNumber) {
        this.PageNumber = PageNumber;
    }

    public QueryFlexFreezeOrderListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryFlexFreezeOrderListRequest(QueryFlexFreezeOrderListRequest source) {
        if (source.PayeeId != null) {
            this.PayeeId = new String(source.PayeeId);
        }
        if (source.OperationType != null) {
            this.OperationType = new String(source.OperationType);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Paging(source.PageNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayeeId", this.PayeeId);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamObj(map, prefix + "PageNumber.", this.PageNumber);

    }
}

