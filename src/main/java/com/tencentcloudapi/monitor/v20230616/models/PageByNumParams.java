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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PageByNumParams extends AbstractModel {

    /**
    * <p>每个分页的数量</p>
    */
    @SerializedName("PerPage")
    @Expose
    private Long PerPage;

    /**
    * <p>第几个分页，从1开始</p>
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
     * Get <p>每个分页的数量</p> 
     * @return PerPage <p>每个分页的数量</p>
     */
    public Long getPerPage() {
        return this.PerPage;
    }

    /**
     * Set <p>每个分页的数量</p>
     * @param PerPage <p>每个分页的数量</p>
     */
    public void setPerPage(Long PerPage) {
        this.PerPage = PerPage;
    }

    /**
     * Get <p>第几个分页，从1开始</p> 
     * @return PageNo <p>第几个分页，从1开始</p>
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set <p>第几个分页，从1开始</p>
     * @param PageNo <p>第几个分页，从1开始</p>
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    public PageByNumParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PageByNumParams(PageByNumParams source) {
        if (source.PerPage != null) {
            this.PerPage = new Long(source.PerPage);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PerPage", this.PerPage);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);

    }
}

