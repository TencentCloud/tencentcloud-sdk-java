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

public class DescribeStreamPackageLinearAssemblyProgramsRequest extends AbstractModel {

    /**
    * 页数，取值范围为[1, 1000]。
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * 每页大小，取值范围为[1, 10000]。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 查询某个Channel下面的所有Program。
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 按Name过滤，模糊匹配
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 页数，取值范围为[1, 1000]。 
     * @return PageNum 页数，取值范围为[1, 1000]。
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 页数，取值范围为[1, 1000]。
     * @param PageNum 页数，取值范围为[1, 1000]。
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get 每页大小，取值范围为[1, 10000]。 
     * @return PageSize 每页大小，取值范围为[1, 10000]。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页大小，取值范围为[1, 10000]。
     * @param PageSize 每页大小，取值范围为[1, 10000]。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

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
     * Get 按Name过滤，模糊匹配 
     * @return Name 按Name过滤，模糊匹配
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 按Name过滤，模糊匹配
     * @param Name 按Name过滤，模糊匹配
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public DescribeStreamPackageLinearAssemblyProgramsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStreamPackageLinearAssemblyProgramsRequest(DescribeStreamPackageLinearAssemblyProgramsRequest source) {
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

