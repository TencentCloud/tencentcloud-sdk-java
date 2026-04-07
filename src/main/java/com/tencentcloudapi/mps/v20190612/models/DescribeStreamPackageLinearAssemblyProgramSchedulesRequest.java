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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStreamPackageLinearAssemblyProgramSchedulesRequest extends AbstractModel {

    /**
    * 查询某个Channel下面的所有Program。
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 窗口时长信息，单位秒。最大7776000s
    */
    @SerializedName("TimeWindow")
    @Expose
    private Long TimeWindow;

    /**
    * 页数，取值范围为[1, 10000]。
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * 每页大小，取值范围为[1, 1000]。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 查询某个Channel下面的所有Program。 
     * @return ChannelId 查询某个Channel下面的所有Program。
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 查询某个Channel下面的所有Program。
     * @param ChannelId 查询某个Channel下面的所有Program。
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 窗口时长信息，单位秒。最大7776000s 
     * @return TimeWindow 窗口时长信息，单位秒。最大7776000s
     */
    public Long getTimeWindow() {
        return this.TimeWindow;
    }

    /**
     * Set 窗口时长信息，单位秒。最大7776000s
     * @param TimeWindow 窗口时长信息，单位秒。最大7776000s
     */
    public void setTimeWindow(Long TimeWindow) {
        this.TimeWindow = TimeWindow;
    }

    /**
     * Get 页数，取值范围为[1, 10000]。 
     * @return PageNum 页数，取值范围为[1, 10000]。
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 页数，取值范围为[1, 10000]。
     * @param PageNum 页数，取值范围为[1, 10000]。
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get 每页大小，取值范围为[1, 1000]。 
     * @return PageSize 每页大小，取值范围为[1, 1000]。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页大小，取值范围为[1, 1000]。
     * @param PageSize 每页大小，取值范围为[1, 1000]。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeStreamPackageLinearAssemblyProgramSchedulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStreamPackageLinearAssemblyProgramSchedulesRequest(DescribeStreamPackageLinearAssemblyProgramSchedulesRequest source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.TimeWindow != null) {
            this.TimeWindow = new Long(source.TimeWindow);
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
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "TimeWindow", this.TimeWindow);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

