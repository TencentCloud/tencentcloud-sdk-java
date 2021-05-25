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

public class DescribeLivePullStreamTasksResponse extends AbstractModel{

    /**
    * 直播拉流任务信息列表。
    */
    @SerializedName("TaskInfos")
    @Expose
    private PullStreamTaskInfo [] TaskInfos;

    /**
    * 分页的页码。
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * 每页大小。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 符合条件的总个数。
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * 总页数。
    */
    @SerializedName("TotalPage")
    @Expose
    private Long TotalPage;

    /**
    * 限制可创建的最大任务数。
    */
    @SerializedName("LimitTaskNum")
    @Expose
    private Long LimitTaskNum;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 直播拉流任务信息列表。 
     * @return TaskInfos 直播拉流任务信息列表。
     */
    public PullStreamTaskInfo [] getTaskInfos() {
        return this.TaskInfos;
    }

    /**
     * Set 直播拉流任务信息列表。
     * @param TaskInfos 直播拉流任务信息列表。
     */
    public void setTaskInfos(PullStreamTaskInfo [] TaskInfos) {
        this.TaskInfos = TaskInfos;
    }

    /**
     * Get 分页的页码。 
     * @return PageNum 分页的页码。
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 分页的页码。
     * @param PageNum 分页的页码。
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get 每页大小。 
     * @return PageSize 每页大小。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页大小。
     * @param PageSize 每页大小。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 符合条件的总个数。 
     * @return TotalNum 符合条件的总个数。
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set 符合条件的总个数。
     * @param TotalNum 符合条件的总个数。
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get 总页数。 
     * @return TotalPage 总页数。
     */
    public Long getTotalPage() {
        return this.TotalPage;
    }

    /**
     * Set 总页数。
     * @param TotalPage 总页数。
     */
    public void setTotalPage(Long TotalPage) {
        this.TotalPage = TotalPage;
    }

    /**
     * Get 限制可创建的最大任务数。 
     * @return LimitTaskNum 限制可创建的最大任务数。
     */
    public Long getLimitTaskNum() {
        return this.LimitTaskNum;
    }

    /**
     * Set 限制可创建的最大任务数。
     * @param LimitTaskNum 限制可创建的最大任务数。
     */
    public void setLimitTaskNum(Long LimitTaskNum) {
        this.LimitTaskNum = LimitTaskNum;
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

    public DescribeLivePullStreamTasksResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLivePullStreamTasksResponse(DescribeLivePullStreamTasksResponse source) {
        if (source.TaskInfos != null) {
            this.TaskInfos = new PullStreamTaskInfo[source.TaskInfos.length];
            for (int i = 0; i < source.TaskInfos.length; i++) {
                this.TaskInfos[i] = new PullStreamTaskInfo(source.TaskInfos[i]);
            }
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.TotalPage != null) {
            this.TotalPage = new Long(source.TotalPage);
        }
        if (source.LimitTaskNum != null) {
            this.LimitTaskNum = new Long(source.LimitTaskNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TaskInfos.", this.TaskInfos);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "TotalPage", this.TotalPage);
        this.setParamSimple(map, prefix + "LimitTaskNum", this.LimitTaskNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

