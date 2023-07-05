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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRawScanLogsRequest extends AbstractModel{

    /**
    * 企业ID, 默认为当前企业
如果有渠道权限，可以传 0 会查渠道下所有的企业
    */
    @SerializedName("CorpId")
    @Expose
    private Long CorpId;

    /**
    * 分页数量，默认为 100，最大为 1000
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 当前分页，默认为 1
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 从哪个日志后查询
即: LogId > $AfterLogId
    */
    @SerializedName("AfterLogId")
    @Expose
    private Long AfterLogId;

    /**
     * Get 企业ID, 默认为当前企业
如果有渠道权限，可以传 0 会查渠道下所有的企业 
     * @return CorpId 企业ID, 默认为当前企业
如果有渠道权限，可以传 0 会查渠道下所有的企业
     */
    public Long getCorpId() {
        return this.CorpId;
    }

    /**
     * Set 企业ID, 默认为当前企业
如果有渠道权限，可以传 0 会查渠道下所有的企业
     * @param CorpId 企业ID, 默认为当前企业
如果有渠道权限，可以传 0 会查渠道下所有的企业
     */
    public void setCorpId(Long CorpId) {
        this.CorpId = CorpId;
    }

    /**
     * Get 分页数量，默认为 100，最大为 1000 
     * @return PageSize 分页数量，默认为 100，最大为 1000
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页数量，默认为 100，最大为 1000
     * @param PageSize 分页数量，默认为 100，最大为 1000
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 当前分页，默认为 1 
     * @return PageNumber 当前分页，默认为 1
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 当前分页，默认为 1
     * @param PageNumber 当前分页，默认为 1
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 从哪个日志后查询
即: LogId > $AfterLogId 
     * @return AfterLogId 从哪个日志后查询
即: LogId > $AfterLogId
     */
    public Long getAfterLogId() {
        return this.AfterLogId;
    }

    /**
     * Set 从哪个日志后查询
即: LogId > $AfterLogId
     * @param AfterLogId 从哪个日志后查询
即: LogId > $AfterLogId
     */
    public void setAfterLogId(Long AfterLogId) {
        this.AfterLogId = AfterLogId;
    }

    public DescribeRawScanLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRawScanLogsRequest(DescribeRawScanLogsRequest source) {
        if (source.CorpId != null) {
            this.CorpId = new Long(source.CorpId);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.AfterLogId != null) {
            this.AfterLogId = new Long(source.AfterLogId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "AfterLogId", this.AfterLogId);

    }
}

