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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InferenceAPIToken extends AbstractModel {

    /**
    * 推理 API Token ID。
    */
    @SerializedName("TokenId")
    @Expose
    private String TokenId;

    /**
    * 推理 API Token 名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 推理 API Token 内容。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 推理 API Token ID。 
     * @return TokenId 推理 API Token ID。
     */
    public String getTokenId() {
        return this.TokenId;
    }

    /**
     * Set 推理 API Token ID。
     * @param TokenId 推理 API Token ID。
     */
    public void setTokenId(String TokenId) {
        this.TokenId = TokenId;
    }

    /**
     * Get 推理 API Token 名称。 
     * @return Name 推理 API Token 名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 推理 API Token 名称。
     * @param Name 推理 API Token 名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 推理 API Token 内容。 
     * @return Content 推理 API Token 内容。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 推理 API Token 内容。
     * @param Content 推理 API Token 内容。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return CreateTime 创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param CreateTime 创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public InferenceAPIToken() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceAPIToken(InferenceAPIToken source) {
        if (source.TokenId != null) {
            this.TokenId = new String(source.TokenId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TokenId", this.TokenId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

