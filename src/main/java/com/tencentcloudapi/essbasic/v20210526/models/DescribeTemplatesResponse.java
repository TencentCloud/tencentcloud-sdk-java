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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTemplatesResponse extends AbstractModel {

    /**
    * 模板详情列表数据
    */
    @SerializedName("Templates")
    @Expose
    private TemplateInfo [] Templates;

    /**
    * 查询到的模板总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 每页返回的数据条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 查询结果分页返回，此处指定第几页。页码从0开始，即首页为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 模板详情列表数据 
     * @return Templates 模板详情列表数据
     */
    public TemplateInfo [] getTemplates() {
        return this.Templates;
    }

    /**
     * Set 模板详情列表数据
     * @param Templates 模板详情列表数据
     */
    public void setTemplates(TemplateInfo [] Templates) {
        this.Templates = Templates;
    }

    /**
     * Get 查询到的模板总数 
     * @return TotalCount 查询到的模板总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 查询到的模板总数
     * @param TotalCount 查询到的模板总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 每页返回的数据条数 
     * @return Limit 每页返回的数据条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页返回的数据条数
     * @param Limit 每页返回的数据条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询结果分页返回，此处指定第几页。页码从0开始，即首页为0。 
     * @return Offset 查询结果分页返回，此处指定第几页。页码从0开始，即首页为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询结果分页返回，此处指定第几页。页码从0开始，即首页为0。
     * @param Offset 查询结果分页返回，此处指定第几页。页码从0开始，即首页为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeTemplatesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTemplatesResponse(DescribeTemplatesResponse source) {
        if (source.Templates != null) {
            this.Templates = new TemplateInfo[source.Templates.length];
            for (int i = 0; i < source.Templates.length; i++) {
                this.Templates[i] = new TemplateInfo(source.Templates[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Templates.", this.Templates);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

