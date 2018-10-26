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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveStreamPublishedListResponse  extends AbstractModel{

    /**
    * 推流记录信息。
    */
    @SerializedName("PublishInfo")
    @Expose
    private StreamName [] PublishInfo;

    /**
    * 分页的页码。
    */
    @SerializedName("PageNum")
    @Expose
    private Integer PageNum;

    /**
    * 每页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Integer PageSize;

    /**
    * 符合条件的总个数。
    */
    @SerializedName("TotalNum")
    @Expose
    private Integer TotalNum;

    /**
    * 总页数。
    */
    @SerializedName("TotalPage")
    @Expose
    private Integer TotalPage;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取推流记录信息。
     * @return PublishInfo 推流记录信息。
     */
    public StreamName [] getPublishInfo() {
        return this.PublishInfo;
    }

    /**
     * 设置推流记录信息。
     * @param PublishInfo 推流记录信息。
     */
    public void setPublishInfo(StreamName [] PublishInfo) {
        this.PublishInfo = PublishInfo;
    }

    /**
     * 获取分页的页码。
     * @return PageNum 分页的页码。
     */
    public Integer getPageNum() {
        return this.PageNum;
    }

    /**
     * 设置分页的页码。
     * @param PageNum 分页的页码。
     */
    public void setPageNum(Integer PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * 获取每页大小
     * @return PageSize 每页大小
     */
    public Integer getPageSize() {
        return this.PageSize;
    }

    /**
     * 设置每页大小
     * @param PageSize 每页大小
     */
    public void setPageSize(Integer PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * 获取符合条件的总个数。
     * @return TotalNum 符合条件的总个数。
     */
    public Integer getTotalNum() {
        return this.TotalNum;
    }

    /**
     * 设置符合条件的总个数。
     * @param TotalNum 符合条件的总个数。
     */
    public void setTotalNum(Integer TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * 获取总页数。
     * @return TotalPage 总页数。
     */
    public Integer getTotalPage() {
        return this.TotalPage;
    }

    /**
     * 设置总页数。
     * @param TotalPage 总页数。
     */
    public void setTotalPage(Integer TotalPage) {
        this.TotalPage = TotalPage;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "PublishInfo.", this.PublishInfo);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "TotalPage", this.TotalPage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

