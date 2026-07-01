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

public class AigcQuotaItem extends AbstractModel {

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
    * <p>任务的配额数</p><p>单位：</p><ul><li>当QuotaLimit=Image时，单位为张</li><li>当QuotaLimit=Video时，单位为秒</li><li>当QuotaLimit=Text时，单位为token</li></ul>
    */
    @SerializedName("QuotaLimit")
    @Expose
    private Long QuotaLimit;

    /**
    * <p>已经使用的用量数</p><p>单位：</p><ul><li>当QuotaLimit=Image时，单位为张</li><li>当QuotaLimit=Video时，单位为秒</li><li>当QuotaLimit=Text时，单位为token</li></ul>
    */
    @SerializedName("Usage")
    @Expose
    private Long Usage;

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
     * Get <p>已经使用的用量数</p><p>单位：</p><ul><li>当QuotaLimit=Image时，单位为张</li><li>当QuotaLimit=Video时，单位为秒</li><li>当QuotaLimit=Text时，单位为token</li></ul> 
     * @return Usage <p>已经使用的用量数</p><p>单位：</p><ul><li>当QuotaLimit=Image时，单位为张</li><li>当QuotaLimit=Video时，单位为秒</li><li>当QuotaLimit=Text时，单位为token</li></ul>
     */
    public Long getUsage() {
        return this.Usage;
    }

    /**
     * Set <p>已经使用的用量数</p><p>单位：</p><ul><li>当QuotaLimit=Image时，单位为张</li><li>当QuotaLimit=Video时，单位为秒</li><li>当QuotaLimit=Text时，单位为token</li></ul>
     * @param Usage <p>已经使用的用量数</p><p>单位：</p><ul><li>当QuotaLimit=Image时，单位为张</li><li>当QuotaLimit=Video时，单位为秒</li><li>当QuotaLimit=Text时，单位为token</li></ul>
     */
    public void setUsage(Long Usage) {
        this.Usage = Usage;
    }

    public AigcQuotaItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcQuotaItem(AigcQuotaItem source) {
        if (source.QuotaType != null) {
            this.QuotaType = new String(source.QuotaType);
        }
        if (source.ApiToken != null) {
            this.ApiToken = new String(source.ApiToken);
        }
        if (source.QuotaLimit != null) {
            this.QuotaLimit = new Long(source.QuotaLimit);
        }
        if (source.Usage != null) {
            this.Usage = new Long(source.Usage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QuotaType", this.QuotaType);
        this.setParamSimple(map, prefix + "ApiToken", this.ApiToken);
        this.setParamSimple(map, prefix + "QuotaLimit", this.QuotaLimit);
        this.setParamSimple(map, prefix + "Usage", this.Usage);

    }
}

