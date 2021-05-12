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

public class DescribeUnbindClientListRequest extends AbstractModel{

    /**
    * 解绑状态：0:所有,1:审核中,2已解绑
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

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
    * 解绑账号ID
    */
    @SerializedName("UnbindUin")
    @Expose
    private String UnbindUin;

    /**
    * 解绑申请时间范围起始点
    */
    @SerializedName("ApplyTimeStart")
    @Expose
    private String ApplyTimeStart;

    /**
    * 解绑申请时间范围终止点
    */
    @SerializedName("ApplyTimeEnd")
    @Expose
    private String ApplyTimeEnd;

    /**
    * 对申请时间的升序降序，值：asc，desc
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
     * Get 解绑状态：0:所有,1:审核中,2已解绑 
     * @return Status 解绑状态：0:所有,1:审核中,2已解绑
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 解绑状态：0:所有,1:审核中,2已解绑
     * @param Status 解绑状态：0:所有,1:审核中,2已解绑
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

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
     * Get 解绑账号ID 
     * @return UnbindUin 解绑账号ID
     */
    public String getUnbindUin() {
        return this.UnbindUin;
    }

    /**
     * Set 解绑账号ID
     * @param UnbindUin 解绑账号ID
     */
    public void setUnbindUin(String UnbindUin) {
        this.UnbindUin = UnbindUin;
    }

    /**
     * Get 解绑申请时间范围起始点 
     * @return ApplyTimeStart 解绑申请时间范围起始点
     */
    public String getApplyTimeStart() {
        return this.ApplyTimeStart;
    }

    /**
     * Set 解绑申请时间范围起始点
     * @param ApplyTimeStart 解绑申请时间范围起始点
     */
    public void setApplyTimeStart(String ApplyTimeStart) {
        this.ApplyTimeStart = ApplyTimeStart;
    }

    /**
     * Get 解绑申请时间范围终止点 
     * @return ApplyTimeEnd 解绑申请时间范围终止点
     */
    public String getApplyTimeEnd() {
        return this.ApplyTimeEnd;
    }

    /**
     * Set 解绑申请时间范围终止点
     * @param ApplyTimeEnd 解绑申请时间范围终止点
     */
    public void setApplyTimeEnd(String ApplyTimeEnd) {
        this.ApplyTimeEnd = ApplyTimeEnd;
    }

    /**
     * Get 对申请时间的升序降序，值：asc，desc 
     * @return OrderDirection 对申请时间的升序降序，值：asc，desc
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set 对申请时间的升序降序，值：asc，desc
     * @param OrderDirection 对申请时间的升序降序，值：asc，desc
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    public DescribeUnbindClientListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUnbindClientListRequest(DescribeUnbindClientListRequest source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.UnbindUin != null) {
            this.UnbindUin = new String(source.UnbindUin);
        }
        if (source.ApplyTimeStart != null) {
            this.ApplyTimeStart = new String(source.ApplyTimeStart);
        }
        if (source.ApplyTimeEnd != null) {
            this.ApplyTimeEnd = new String(source.ApplyTimeEnd);
        }
        if (source.OrderDirection != null) {
            this.OrderDirection = new String(source.OrderDirection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "UnbindUin", this.UnbindUin);
        this.setParamSimple(map, prefix + "ApplyTimeStart", this.ApplyTimeStart);
        this.setParamSimple(map, prefix + "ApplyTimeEnd", this.ApplyTimeEnd);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);

    }
}

