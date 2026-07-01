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

public class DescribeAigcQuotasRequest extends AbstractModel {

    /**
    * <p><strong>点播应用 ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</strong></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>配额类型</p><p>枚举值：</p><ul><li>Image： AIGC 生图任务</li><li>Video： AIGC 生视频任务</li><li>Text： AIGC 生文任务</li></ul>
    */
    @SerializedName("QuotaType")
    @Expose
    private String QuotaType;

    /**
    * <p>仅当QuotaLimit=Text时有效，用于选择需要进行配额限制ApiToken</p>
    */
    @SerializedName("ApiToken")
    @Expose
    private String ApiToken;

    /**
    * <p>分页返回的记录条数，将返回第 Offset 到第 Offset+Limit-1 条。</p><p>取值范围：[1, 100]</p><p>默认值：10</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。</p><p>默认值：0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p><strong>点播应用 ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</strong></p> 
     * @return SubAppId <p><strong>点播应用 ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</strong></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><strong>点播应用 ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</strong></p>
     * @param SubAppId <p><strong>点播应用 ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</strong></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>配额类型</p><p>枚举值：</p><ul><li>Image： AIGC 生图任务</li><li>Video： AIGC 生视频任务</li><li>Text： AIGC 生文任务</li></ul> 
     * @return QuotaType <p>配额类型</p><p>枚举值：</p><ul><li>Image： AIGC 生图任务</li><li>Video： AIGC 生视频任务</li><li>Text： AIGC 生文任务</li></ul>
     */
    public String getQuotaType() {
        return this.QuotaType;
    }

    /**
     * Set <p>配额类型</p><p>枚举值：</p><ul><li>Image： AIGC 生图任务</li><li>Video： AIGC 生视频任务</li><li>Text： AIGC 生文任务</li></ul>
     * @param QuotaType <p>配额类型</p><p>枚举值：</p><ul><li>Image： AIGC 生图任务</li><li>Video： AIGC 生视频任务</li><li>Text： AIGC 生文任务</li></ul>
     */
    public void setQuotaType(String QuotaType) {
        this.QuotaType = QuotaType;
    }

    /**
     * Get <p>仅当QuotaLimit=Text时有效，用于选择需要进行配额限制ApiToken</p> 
     * @return ApiToken <p>仅当QuotaLimit=Text时有效，用于选择需要进行配额限制ApiToken</p>
     */
    public String getApiToken() {
        return this.ApiToken;
    }

    /**
     * Set <p>仅当QuotaLimit=Text时有效，用于选择需要进行配额限制ApiToken</p>
     * @param ApiToken <p>仅当QuotaLimit=Text时有效，用于选择需要进行配额限制ApiToken</p>
     */
    public void setApiToken(String ApiToken) {
        this.ApiToken = ApiToken;
    }

    /**
     * Get <p>分页返回的记录条数，将返回第 Offset 到第 Offset+Limit-1 条。</p><p>取值范围：[1, 100]</p><p>默认值：10</p> 
     * @return Limit <p>分页返回的记录条数，将返回第 Offset 到第 Offset+Limit-1 条。</p><p>取值范围：[1, 100]</p><p>默认值：10</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页返回的记录条数，将返回第 Offset 到第 Offset+Limit-1 条。</p><p>取值范围：[1, 100]</p><p>默认值：10</p>
     * @param Limit <p>分页返回的记录条数，将返回第 Offset 到第 Offset+Limit-1 条。</p><p>取值范围：[1, 100]</p><p>默认值：10</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。</p><p>默认值：0</p> 
     * @return Offset <p>分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。</p><p>默认值：0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。</p><p>默认值：0</p>
     * @param Offset <p>分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。</p><p>默认值：0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeAigcQuotasRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAigcQuotasRequest(DescribeAigcQuotasRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.QuotaType != null) {
            this.QuotaType = new String(source.QuotaType);
        }
        if (source.ApiToken != null) {
            this.ApiToken = new String(source.ApiToken);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "QuotaType", this.QuotaType);
        this.setParamSimple(map, prefix + "ApiToken", this.ApiToken);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

