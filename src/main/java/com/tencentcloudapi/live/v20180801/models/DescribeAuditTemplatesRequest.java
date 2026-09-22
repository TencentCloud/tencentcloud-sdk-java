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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuditTemplatesRequest extends AbstractModel {

    /**
    * <p>是否过滤出文本审核，false不过滤，true过滤。</p>
    */
    @SerializedName("WithTextAudit")
    @Expose
    private Boolean WithTextAudit;

    /**
    * <p>页码。</p>
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * <p>每页数量。</p><p>取值范围：[5, 100]</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get <p>是否过滤出文本审核，false不过滤，true过滤。</p> 
     * @return WithTextAudit <p>是否过滤出文本审核，false不过滤，true过滤。</p>
     */
    public Boolean getWithTextAudit() {
        return this.WithTextAudit;
    }

    /**
     * Set <p>是否过滤出文本审核，false不过滤，true过滤。</p>
     * @param WithTextAudit <p>是否过滤出文本审核，false不过滤，true过滤。</p>
     */
    public void setWithTextAudit(Boolean WithTextAudit) {
        this.WithTextAudit = WithTextAudit;
    }

    /**
     * Get <p>页码。</p> 
     * @return PageNum <p>页码。</p>
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set <p>页码。</p>
     * @param PageNum <p>页码。</p>
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get <p>每页数量。</p><p>取值范围：[5, 100]</p> 
     * @return PageSize <p>每页数量。</p><p>取值范围：[5, 100]</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页数量。</p><p>取值范围：[5, 100]</p>
     * @param PageSize <p>每页数量。</p><p>取值范围：[5, 100]</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeAuditTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAuditTemplatesRequest(DescribeAuditTemplatesRequest source) {
        if (source.WithTextAudit != null) {
            this.WithTextAudit = new Boolean(source.WithTextAudit);
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
        this.setParamSimple(map, prefix + "WithTextAudit", this.WithTextAudit);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

