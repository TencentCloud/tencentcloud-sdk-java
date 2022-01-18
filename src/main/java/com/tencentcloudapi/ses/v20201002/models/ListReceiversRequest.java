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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListReceiversRequest extends AbstractModel{

    /**
    * 偏移量，整型，从0开始
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制数目，整型，不超过100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 列表状态(1 待上传 2 上传中  3传完成)，若查询所有就不传这个字段
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 列表名称的关键字，模糊查询
    */
    @SerializedName("KeyWord")
    @Expose
    private String KeyWord;

    /**
     * Get 偏移量，整型，从0开始 
     * @return Offset 偏移量，整型，从0开始
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，整型，从0开始
     * @param Offset 偏移量，整型，从0开始
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制数目，整型，不超过100 
     * @return Limit 限制数目，整型，不超过100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制数目，整型，不超过100
     * @param Limit 限制数目，整型，不超过100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 列表状态(1 待上传 2 上传中  3传完成)，若查询所有就不传这个字段 
     * @return Status 列表状态(1 待上传 2 上传中  3传完成)，若查询所有就不传这个字段
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 列表状态(1 待上传 2 上传中  3传完成)，若查询所有就不传这个字段
     * @param Status 列表状态(1 待上传 2 上传中  3传完成)，若查询所有就不传这个字段
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 列表名称的关键字，模糊查询 
     * @return KeyWord 列表名称的关键字，模糊查询
     */
    public String getKeyWord() {
        return this.KeyWord;
    }

    /**
     * Set 列表名称的关键字，模糊查询
     * @param KeyWord 列表名称的关键字，模糊查询
     */
    public void setKeyWord(String KeyWord) {
        this.KeyWord = KeyWord;
    }

    public ListReceiversRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListReceiversRequest(ListReceiversRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.KeyWord != null) {
            this.KeyWord = new String(source.KeyWord);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "KeyWord", this.KeyWord);

    }
}

