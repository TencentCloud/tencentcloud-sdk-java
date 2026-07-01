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

public class ModifyAigcQuotaRequest extends AbstractModel {

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
    * <p>任务的配额数</p><p>单位：</p><ul><li>当QuotaLimit=Image时，单位为张</li><li>当QuotaLimit=Video时，单位为秒</li><li>当QuotaLimit=Text时，单位为token</li></ul>
    */
    @SerializedName("QuotaLimit")
    @Expose
    private Long QuotaLimit;

    /**
    * <p>仅当QuotaLimit=Text时有效，用于选择需要进行配额限制ApiToken</p>
    */
    @SerializedName("ApiToken")
    @Expose
    private String ApiToken;

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
     * Get <p>任务的配额数</p><p>单位：</p><ul><li>当QuotaLimit=Image时，单位为张</li><li>当QuotaLimit=Video时，单位为秒</li><li>当QuotaLimit=Text时，单位为token</li></ul> 
     * @return QuotaLimit <p>任务的配额数</p><p>单位：</p><ul><li>当QuotaLimit=Image时，单位为张</li><li>当QuotaLimit=Video时，单位为秒</li><li>当QuotaLimit=Text时，单位为token</li></ul>
     */
    public Long getQuotaLimit() {
        return this.QuotaLimit;
    }

    /**
     * Set <p>任务的配额数</p><p>单位：</p><ul><li>当QuotaLimit=Image时，单位为张</li><li>当QuotaLimit=Video时，单位为秒</li><li>当QuotaLimit=Text时，单位为token</li></ul>
     * @param QuotaLimit <p>任务的配额数</p><p>单位：</p><ul><li>当QuotaLimit=Image时，单位为张</li><li>当QuotaLimit=Video时，单位为秒</li><li>当QuotaLimit=Text时，单位为token</li></ul>
     */
    public void setQuotaLimit(Long QuotaLimit) {
        this.QuotaLimit = QuotaLimit;
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

    public ModifyAigcQuotaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAigcQuotaRequest(ModifyAigcQuotaRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.QuotaType != null) {
            this.QuotaType = new String(source.QuotaType);
        }
        if (source.QuotaLimit != null) {
            this.QuotaLimit = new Long(source.QuotaLimit);
        }
        if (source.ApiToken != null) {
            this.ApiToken = new String(source.ApiToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "QuotaType", this.QuotaType);
        this.setParamSimple(map, prefix + "QuotaLimit", this.QuotaLimit);
        this.setParamSimple(map, prefix + "ApiToken", this.ApiToken);

    }
}

