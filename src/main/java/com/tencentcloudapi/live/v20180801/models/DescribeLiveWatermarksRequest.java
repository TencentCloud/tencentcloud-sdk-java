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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveWatermarksRequest extends AbstractModel {

    /**
    * 水印名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 分页的索引参数，从1开始
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * 分页的大小参数，默认值500
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 水印名称 
     * @return Name 水印名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 水印名称
     * @param Name 水印名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 分页的索引参数，从1开始 
     * @return PageNo 分页的索引参数，从1开始
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set 分页的索引参数，从1开始
     * @param PageNo 分页的索引参数，从1开始
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get 分页的大小参数，默认值500 
     * @return PageSize 分页的大小参数，默认值500
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页的大小参数，默认值500
     * @param PageSize 分页的大小参数，默认值500
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeLiveWatermarksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveWatermarksRequest(DescribeLiveWatermarksRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

