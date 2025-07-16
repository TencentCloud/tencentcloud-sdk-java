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

public class AuditKeywordInfo extends AbstractModel {

    /**
    * 关键词 Id。
    */
    @SerializedName("KeywordId")
    @Expose
    private String KeywordId;

    /**
    * 关键词内容。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 关键词标签。
可取值：Normal: 正常 ，Polity: 政治，Porn: 色情，Sexy：性感，Ad: 广告，Illegal: 违法，Abuse: 谩骂，Terror: 暴恐，Spam: 灌水，Moan:呻吟。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 创建时间。UTC 格式，例如：2018-11-29T19:00:00Z。
注意：
1. 北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 关键词 Id。 
     * @return KeywordId 关键词 Id。
     */
    public String getKeywordId() {
        return this.KeywordId;
    }

    /**
     * Set 关键词 Id。
     * @param KeywordId 关键词 Id。
     */
    public void setKeywordId(String KeywordId) {
        this.KeywordId = KeywordId;
    }

    /**
     * Get 关键词内容。 
     * @return Content 关键词内容。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 关键词内容。
     * @param Content 关键词内容。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 关键词标签。
可取值：Normal: 正常 ，Polity: 政治，Porn: 色情，Sexy：性感，Ad: 广告，Illegal: 违法，Abuse: 谩骂，Terror: 暴恐，Spam: 灌水，Moan:呻吟。 
     * @return Label 关键词标签。
可取值：Normal: 正常 ，Polity: 政治，Porn: 色情，Sexy：性感，Ad: 广告，Illegal: 违法，Abuse: 谩骂，Terror: 暴恐，Spam: 灌水，Moan:呻吟。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 关键词标签。
可取值：Normal: 正常 ，Polity: 政治，Porn: 色情，Sexy：性感，Ad: 广告，Illegal: 违法，Abuse: 谩骂，Terror: 暴恐，Spam: 灌水，Moan:呻吟。
     * @param Label 关键词标签。
可取值：Normal: 正常 ，Polity: 政治，Porn: 色情，Sexy：性感，Ad: 广告，Illegal: 违法，Abuse: 谩骂，Terror: 暴恐，Spam: 灌水，Moan:呻吟。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 创建时间。UTC 格式，例如：2018-11-29T19:00:00Z。
注意：
1. 北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示。 
     * @return CreateTime 创建时间。UTC 格式，例如：2018-11-29T19:00:00Z。
注意：
1. 北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。UTC 格式，例如：2018-11-29T19:00:00Z。
注意：
1. 北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示。
     * @param CreateTime 创建时间。UTC 格式，例如：2018-11-29T19:00:00Z。
注意：
1. 北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public AuditKeywordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditKeywordInfo(AuditKeywordInfo source) {
        if (source.KeywordId != null) {
            this.KeywordId = new String(source.KeywordId);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeywordId", this.KeywordId);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

