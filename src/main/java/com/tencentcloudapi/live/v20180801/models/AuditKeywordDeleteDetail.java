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

public class AuditKeywordDeleteDetail extends AbstractModel {

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
    * 是否删除成功。
    */
    @SerializedName("Deleted")
    @Expose
    private Boolean Deleted;

    /**
    * 如果删除失败，错误信息。
    */
    @SerializedName("Error")
    @Expose
    private String Error;

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
     * Get 是否删除成功。 
     * @return Deleted 是否删除成功。
     */
    public Boolean getDeleted() {
        return this.Deleted;
    }

    /**
     * Set 是否删除成功。
     * @param Deleted 是否删除成功。
     */
    public void setDeleted(Boolean Deleted) {
        this.Deleted = Deleted;
    }

    /**
     * Get 如果删除失败，错误信息。 
     * @return Error 如果删除失败，错误信息。
     */
    public String getError() {
        return this.Error;
    }

    /**
     * Set 如果删除失败，错误信息。
     * @param Error 如果删除失败，错误信息。
     */
    public void setError(String Error) {
        this.Error = Error;
    }

    public AuditKeywordDeleteDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditKeywordDeleteDetail(AuditKeywordDeleteDetail source) {
        if (source.KeywordId != null) {
            this.KeywordId = new String(source.KeywordId);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Deleted != null) {
            this.Deleted = new Boolean(source.Deleted);
        }
        if (source.Error != null) {
            this.Error = new String(source.Error);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeywordId", this.KeywordId);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Deleted", this.Deleted);
        this.setParamSimple(map, prefix + "Error", this.Error);

    }
}

