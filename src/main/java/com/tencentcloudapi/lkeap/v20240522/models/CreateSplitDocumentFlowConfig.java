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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSplitDocumentFlowConfig extends AbstractModel {

    /**
    * Markdown文件中表格返回的形式
0，表格以MD形式返回
1，表格以HTML形式返回
默认为
    */
    @SerializedName("TableResultType")
    @Expose
    private String TableResultType;

    /**
    * 智能文档解析返回结果的格式
0：只返回全文MD；
1：只返回每一页的OCR原始Json；
2：只返回每一页的MD，
3：返回全文MD + 每一页的OCR原始Json；
4：返回全文MD + 每一页的MD，
默认值为3（返回全文MD + 每一页的OCR原始Json）


    */
    @SerializedName("ResultType")
    @Expose
    private String ResultType;

    /**
    * 是否开启mllm
    */
    @SerializedName("EnableMllm")
    @Expose
    private Boolean EnableMllm;

    /**
    * 最大分片长度
    */
    @SerializedName("MaxChunkSize")
    @Expose
    private Long MaxChunkSize;

    /**
     * Get Markdown文件中表格返回的形式
0，表格以MD形式返回
1，表格以HTML形式返回
默认为 
     * @return TableResultType Markdown文件中表格返回的形式
0，表格以MD形式返回
1，表格以HTML形式返回
默认为
     * @deprecated
     */
    @Deprecated
    public String getTableResultType() {
        return this.TableResultType;
    }

    /**
     * Set Markdown文件中表格返回的形式
0，表格以MD形式返回
1，表格以HTML形式返回
默认为
     * @param TableResultType Markdown文件中表格返回的形式
0，表格以MD形式返回
1，表格以HTML形式返回
默认为
     * @deprecated
     */
    @Deprecated
    public void setTableResultType(String TableResultType) {
        this.TableResultType = TableResultType;
    }

    /**
     * Get 智能文档解析返回结果的格式
0：只返回全文MD；
1：只返回每一页的OCR原始Json；
2：只返回每一页的MD，
3：返回全文MD + 每一页的OCR原始Json；
4：返回全文MD + 每一页的MD，
默认值为3（返回全文MD + 每一页的OCR原始Json）

 
     * @return ResultType 智能文档解析返回结果的格式
0：只返回全文MD；
1：只返回每一页的OCR原始Json；
2：只返回每一页的MD，
3：返回全文MD + 每一页的OCR原始Json；
4：返回全文MD + 每一页的MD，
默认值为3（返回全文MD + 每一页的OCR原始Json）


     * @deprecated
     */
    @Deprecated
    public String getResultType() {
        return this.ResultType;
    }

    /**
     * Set 智能文档解析返回结果的格式
0：只返回全文MD；
1：只返回每一页的OCR原始Json；
2：只返回每一页的MD，
3：返回全文MD + 每一页的OCR原始Json；
4：返回全文MD + 每一页的MD，
默认值为3（返回全文MD + 每一页的OCR原始Json）


     * @param ResultType 智能文档解析返回结果的格式
0：只返回全文MD；
1：只返回每一页的OCR原始Json；
2：只返回每一页的MD，
3：返回全文MD + 每一页的OCR原始Json；
4：返回全文MD + 每一页的MD，
默认值为3（返回全文MD + 每一页的OCR原始Json）


     * @deprecated
     */
    @Deprecated
    public void setResultType(String ResultType) {
        this.ResultType = ResultType;
    }

    /**
     * Get 是否开启mllm 
     * @return EnableMllm 是否开启mllm
     */
    public Boolean getEnableMllm() {
        return this.EnableMllm;
    }

    /**
     * Set 是否开启mllm
     * @param EnableMllm 是否开启mllm
     */
    public void setEnableMllm(Boolean EnableMllm) {
        this.EnableMllm = EnableMllm;
    }

    /**
     * Get 最大分片长度 
     * @return MaxChunkSize 最大分片长度
     */
    public Long getMaxChunkSize() {
        return this.MaxChunkSize;
    }

    /**
     * Set 最大分片长度
     * @param MaxChunkSize 最大分片长度
     */
    public void setMaxChunkSize(Long MaxChunkSize) {
        this.MaxChunkSize = MaxChunkSize;
    }

    public CreateSplitDocumentFlowConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSplitDocumentFlowConfig(CreateSplitDocumentFlowConfig source) {
        if (source.TableResultType != null) {
            this.TableResultType = new String(source.TableResultType);
        }
        if (source.ResultType != null) {
            this.ResultType = new String(source.ResultType);
        }
        if (source.EnableMllm != null) {
            this.EnableMllm = new Boolean(source.EnableMllm);
        }
        if (source.MaxChunkSize != null) {
            this.MaxChunkSize = new Long(source.MaxChunkSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableResultType", this.TableResultType);
        this.setParamSimple(map, prefix + "ResultType", this.ResultType);
        this.setParamSimple(map, prefix + "EnableMllm", this.EnableMllm);
        this.setParamSimple(map, prefix + "MaxChunkSize", this.MaxChunkSize);

    }
}

