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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportAIGWCustomGuardrailHitsResult extends AbstractModel {

    /**
    * <p>实际导出格式</p>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * <p>实际编码进导出内容的审核记录数，最多 1000。</p>
    */
    @SerializedName("RowCount")
    @Expose
    private Long RowCount;

    /**
    * <p>是否达到单次最多 1000 条的导出截断条件；true 时可能还有更多记录，可缩小时间范围后分别导出。</p>
    */
    @SerializedName("Truncated")
    @Expose
    private Boolean Truncated;

    /**
    * <p>CSV/JSON 文件内容的 Base64 编码字符串，需 Base64 解码后保存，不是下载 URL。</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get <p>实际导出格式</p> 
     * @return Format <p>实际导出格式</p>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set <p>实际导出格式</p>
     * @param Format <p>实际导出格式</p>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get <p>实际编码进导出内容的审核记录数，最多 1000。</p> 
     * @return RowCount <p>实际编码进导出内容的审核记录数，最多 1000。</p>
     */
    public Long getRowCount() {
        return this.RowCount;
    }

    /**
     * Set <p>实际编码进导出内容的审核记录数，最多 1000。</p>
     * @param RowCount <p>实际编码进导出内容的审核记录数，最多 1000。</p>
     */
    public void setRowCount(Long RowCount) {
        this.RowCount = RowCount;
    }

    /**
     * Get <p>是否达到单次最多 1000 条的导出截断条件；true 时可能还有更多记录，可缩小时间范围后分别导出。</p> 
     * @return Truncated <p>是否达到单次最多 1000 条的导出截断条件；true 时可能还有更多记录，可缩小时间范围后分别导出。</p>
     */
    public Boolean getTruncated() {
        return this.Truncated;
    }

    /**
     * Set <p>是否达到单次最多 1000 条的导出截断条件；true 时可能还有更多记录，可缩小时间范围后分别导出。</p>
     * @param Truncated <p>是否达到单次最多 1000 条的导出截断条件；true 时可能还有更多记录，可缩小时间范围后分别导出。</p>
     */
    public void setTruncated(Boolean Truncated) {
        this.Truncated = Truncated;
    }

    /**
     * Get <p>CSV/JSON 文件内容的 Base64 编码字符串，需 Base64 解码后保存，不是下载 URL。</p> 
     * @return Content <p>CSV/JSON 文件内容的 Base64 编码字符串，需 Base64 解码后保存，不是下载 URL。</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>CSV/JSON 文件内容的 Base64 编码字符串，需 Base64 解码后保存，不是下载 URL。</p>
     * @param Content <p>CSV/JSON 文件内容的 Base64 编码字符串，需 Base64 解码后保存，不是下载 URL。</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public ExportAIGWCustomGuardrailHitsResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportAIGWCustomGuardrailHitsResult(ExportAIGWCustomGuardrailHitsResult source) {
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.RowCount != null) {
            this.RowCount = new Long(source.RowCount);
        }
        if (source.Truncated != null) {
            this.Truncated = new Boolean(source.Truncated);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "RowCount", this.RowCount);
        this.setParamSimple(map, prefix + "Truncated", this.Truncated);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

