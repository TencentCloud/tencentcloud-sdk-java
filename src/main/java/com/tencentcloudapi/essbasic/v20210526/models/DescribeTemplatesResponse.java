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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTemplatesResponse extends AbstractModel{

    /**
    * 模板详情
    */
    @SerializedName("Templates")
    @Expose
    private TemplateInfo [] Templates;

    /**
    * 查询总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 查询数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 查询起始偏移
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 模板详情 
     * @return Templates 模板详情
     */
    public TemplateInfo [] getTemplates() {
        return this.Templates;
    }

    /**
     * Set 模板详情
     * @param Templates 模板详情
     */
    public void setTemplates(TemplateInfo [] Templates) {
        this.Templates = Templates;
    }

    /**
     * Get 查询总数 
     * @return TotalCount 查询总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 查询总数
     * @param TotalCount 查询总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 查询数量 
     * @return Limit 查询数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询数量
     * @param Limit 查询数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询起始偏移 
     * @return Offset 查询起始偏移
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询起始偏移
     * @param Offset 查询起始偏移
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
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

