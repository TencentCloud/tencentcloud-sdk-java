/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCompanyListRequest extends AbstractModel {

    /**
    * 分页尺寸，上限 100
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 分页页码，从 0 开始
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 公司名称
    */
    @SerializedName("CompanyName")
    @Expose
    private String [] CompanyName;

    /**
    * 审核状态，1-待审核，2-审核通过，3-驳回
    */
    @SerializedName("State")
    @Expose
    private Long [] State;

    /**
    * 申请ID
    */
    @SerializedName("ApplyID")
    @Expose
    private Long [] ApplyID;

    /**
     * Get 分页尺寸，上限 100 
     * @return PageSize 分页尺寸，上限 100
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页尺寸，上限 100
     * @param PageSize 分页尺寸，上限 100
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 分页页码，从 0 开始 
     * @return PageNumber 分页页码，从 0 开始
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页页码，从 0 开始
     * @param PageNumber 分页页码，从 0 开始
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 公司名称 
     * @return CompanyName 公司名称
     */
    public String [] getCompanyName() {
        return this.CompanyName;
    }

    /**
     * Set 公司名称
     * @param CompanyName 公司名称
     */
    public void setCompanyName(String [] CompanyName) {
        this.CompanyName = CompanyName;
    }

    /**
     * Get 审核状态，1-待审核，2-审核通过，3-驳回 
     * @return State 审核状态，1-待审核，2-审核通过，3-驳回
     */
    public Long [] getState() {
        return this.State;
    }

    /**
     * Set 审核状态，1-待审核，2-审核通过，3-驳回
     * @param State 审核状态，1-待审核，2-审核通过，3-驳回
     */
    public void setState(Long [] State) {
        this.State = State;
    }

    /**
     * Get 申请ID 
     * @return ApplyID 申请ID
     */
    public Long [] getApplyID() {
        return this.ApplyID;
    }

    /**
     * Set 申请ID
     * @param ApplyID 申请ID
     */
    public void setApplyID(Long [] ApplyID) {
        this.ApplyID = ApplyID;
    }

    public DescribeCompanyListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCompanyListRequest(DescribeCompanyListRequest source) {
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.CompanyName != null) {
            this.CompanyName = new String[source.CompanyName.length];
            for (int i = 0; i < source.CompanyName.length; i++) {
                this.CompanyName[i] = new String(source.CompanyName[i]);
            }
        }
        if (source.State != null) {
            this.State = new Long[source.State.length];
            for (int i = 0; i < source.State.length; i++) {
                this.State[i] = new Long(source.State[i]);
            }
        }
        if (source.ApplyID != null) {
            this.ApplyID = new Long[source.ApplyID.length];
            for (int i = 0; i < source.ApplyID.length; i++) {
                this.ApplyID[i] = new Long(source.ApplyID[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamArraySimple(map, prefix + "CompanyName.", this.CompanyName);
        this.setParamArraySimple(map, prefix + "State.", this.State);
        this.setParamArraySimple(map, prefix + "ApplyID.", this.ApplyID);

    }
}

