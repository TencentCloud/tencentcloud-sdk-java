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
package com.tencentcloudapi.nlp.v20190408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWordItemsRequest extends AbstractModel{

    /**
    * 自定义词库ID。
    */
    @SerializedName("DictId")
    @Expose
    private String DictId;

    /**
    * 每页数据量，范围为1~100，默认为10。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量，从0开始，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 待检索的词条文本，支持模糊匹配。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
     * Get 自定义词库ID。 
     * @return DictId 自定义词库ID。
     */
    public String getDictId() {
        return this.DictId;
    }

    /**
     * Set 自定义词库ID。
     * @param DictId 自定义词库ID。
     */
    public void setDictId(String DictId) {
        this.DictId = DictId;
    }

    /**
     * Get 每页数据量，范围为1~100，默认为10。 
     * @return Limit 每页数据量，范围为1~100，默认为10。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页数据量，范围为1~100，默认为10。
     * @param Limit 每页数据量，范围为1~100，默认为10。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量，从0开始，默认为0。 
     * @return Offset 分页偏移量，从0开始，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，从0开始，默认为0。
     * @param Offset 分页偏移量，从0开始，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 待检索的词条文本，支持模糊匹配。 
     * @return Text 待检索的词条文本，支持模糊匹配。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 待检索的词条文本，支持模糊匹配。
     * @param Text 待检索的词条文本，支持模糊匹配。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DictId", this.DictId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Text", this.Text);

    }
}

