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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRumLogExportsV2Request extends AbstractModel {

    /**
    * <p>每页返回任务数</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>当前页码</p>
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
     * Get <p>每页返回任务数</p> 
     * @return PageSize <p>每页返回任务数</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页返回任务数</p>
     * @param PageSize <p>每页返回任务数</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>当前页码</p> 
     * @return PageNum <p>当前页码</p>
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set <p>当前页码</p>
     * @param PageNum <p>当前页码</p>
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get <p>项目ID</p> 
     * @return ID <p>项目ID</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>项目ID</p>
     * @param ID <p>项目ID</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    public DescribeRumLogExportsV2Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRumLogExportsV2Request(DescribeRumLogExportsV2Request source) {
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "ID", this.ID);

    }
}

