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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAigcAdvancedCustomElementsRequest extends AbstractModel {

    /**
    * <p><b>点播<a href="https://cloud.tencent.com/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>分页返回的起始偏移量。将返回第 Offset 到第 Offset+Limit-1 条。</p><p>默认值：0</p><p>Offset 必须是 Limit 的整数倍。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>分页返回的记录条数。</p><p>取值范围：[1, 300]</p><p>默认值：10</p><p>Offset 必须是 Limit 的整数倍。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p><b>点播<a href="https://cloud.tencent.com/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p> 
     * @return SubAppId <p><b>点播<a href="https://cloud.tencent.com/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>点播<a href="https://cloud.tencent.com/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     * @param SubAppId <p><b>点播<a href="https://cloud.tencent.com/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>分页返回的起始偏移量。将返回第 Offset 到第 Offset+Limit-1 条。</p><p>默认值：0</p><p>Offset 必须是 Limit 的整数倍。</p> 
     * @return Offset <p>分页返回的起始偏移量。将返回第 Offset 到第 Offset+Limit-1 条。</p><p>默认值：0</p><p>Offset 必须是 Limit 的整数倍。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页返回的起始偏移量。将返回第 Offset 到第 Offset+Limit-1 条。</p><p>默认值：0</p><p>Offset 必须是 Limit 的整数倍。</p>
     * @param Offset <p>分页返回的起始偏移量。将返回第 Offset 到第 Offset+Limit-1 条。</p><p>默认值：0</p><p>Offset 必须是 Limit 的整数倍。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>分页返回的记录条数。</p><p>取值范围：[1, 300]</p><p>默认值：10</p><p>Offset 必须是 Limit 的整数倍。</p> 
     * @return Limit <p>分页返回的记录条数。</p><p>取值范围：[1, 300]</p><p>默认值：10</p><p>Offset 必须是 Limit 的整数倍。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页返回的记录条数。</p><p>取值范围：[1, 300]</p><p>默认值：10</p><p>Offset 必须是 Limit 的整数倍。</p>
     * @param Limit <p>分页返回的记录条数。</p><p>取值范围：[1, 300]</p><p>默认值：10</p><p>Offset 必须是 Limit 的整数倍。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeAigcAdvancedCustomElementsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAigcAdvancedCustomElementsRequest(DescribeAigcAdvancedCustomElementsRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

