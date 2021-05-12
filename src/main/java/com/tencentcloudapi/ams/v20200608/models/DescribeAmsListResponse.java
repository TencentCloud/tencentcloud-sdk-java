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
package com.tencentcloudapi.ams.v20200608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAmsListResponse extends AbstractModel{

    /**
    * 返回列表数据----非必选，该参数暂未对外开放
    */
    @SerializedName("AmsDetailSet")
    @Expose
    private AmsDetailInfo [] AmsDetailSet;

    /**
    * 总条数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 分页 token
    */
    @SerializedName("PageToken")
    @Expose
    private String PageToken;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回列表数据----非必选，该参数暂未对外开放 
     * @return AmsDetailSet 返回列表数据----非必选，该参数暂未对外开放
     */
    public AmsDetailInfo [] getAmsDetailSet() {
        return this.AmsDetailSet;
    }

    /**
     * Set 返回列表数据----非必选，该参数暂未对外开放
     * @param AmsDetailSet 返回列表数据----非必选，该参数暂未对外开放
     */
    public void setAmsDetailSet(AmsDetailInfo [] AmsDetailSet) {
        this.AmsDetailSet = AmsDetailSet;
    }

    /**
     * Get 总条数 
     * @return Total 总条数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总条数
     * @param Total 总条数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 分页 token 
     * @return PageToken 分页 token
     */
    public String getPageToken() {
        return this.PageToken;
    }

    /**
     * Set 分页 token
     * @param PageToken 分页 token
     */
    public void setPageToken(String PageToken) {
        this.PageToken = PageToken;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAmsListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAmsListResponse(DescribeAmsListResponse source) {
        if (source.AmsDetailSet != null) {
            this.AmsDetailSet = new AmsDetailInfo[source.AmsDetailSet.length];
            for (int i = 0; i < source.AmsDetailSet.length; i++) {
                this.AmsDetailSet[i] = new AmsDetailInfo(source.AmsDetailSet[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.PageToken != null) {
            this.PageToken = new String(source.PageToken);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AmsDetailSet.", this.AmsDetailSet);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "PageToken", this.PageToken);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

