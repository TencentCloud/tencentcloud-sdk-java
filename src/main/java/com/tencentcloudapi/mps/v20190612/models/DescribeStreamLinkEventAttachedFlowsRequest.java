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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStreamLinkEventAttachedFlowsRequest extends AbstractModel{

    /**
    * EventId。
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * 当前页数，默认1。
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * 每页大小，默认1000。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get EventId。 
     * @return EventId EventId。
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set EventId。
     * @param EventId EventId。
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 当前页数，默认1。 
     * @return PageNum 当前页数，默认1。
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 当前页数，默认1。
     * @param PageNum 当前页数，默认1。
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get 每页大小，默认1000。 
     * @return PageSize 每页大小，默认1000。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页大小，默认1000。
     * @param PageSize 每页大小，默认1000。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeStreamLinkEventAttachedFlowsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStreamLinkEventAttachedFlowsRequest(DescribeStreamLinkEventAttachedFlowsRequest source) {
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

