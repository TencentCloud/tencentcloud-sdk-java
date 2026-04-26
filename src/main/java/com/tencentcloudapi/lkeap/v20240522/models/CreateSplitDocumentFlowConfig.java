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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSplitDocumentFlowConfig extends AbstractModel {

    /**
    * <p>Markdown文件中表格返回的形式<br>0，表格以MD形式返回<br>1，表格以HTML形式返回<br>默认为</p>
    */
    @SerializedName("TableResultType")
    @Expose
    private String TableResultType;

    /**
    * <p>智能文档解析返回结果的格式<br>0：只返回全文MD；<br>1：只返回每一页的OCR原始Json；<br>2：只返回每一页的MD；<br>3：返回全文MD + 每一页的OCR原始Json；<br>4：返回全文MD + 每一页的MD；<br>5：返回全文md，每一页ocr原始json，每一页md。</p>
    */
    @SerializedName("ResultType")
    @Expose
    private String ResultType;

    /**
    * <p>是否开启mllm</p>
    */
    @SerializedName("EnableMllm")
    @Expose
    private Boolean EnableMllm;

    /**
    * <p>最大分片长度</p>
    */
    @SerializedName("MaxChunkSize")
    @Expose
    private Long MaxChunkSize;

    /**
    * <p>是否忽略返回失败页码</p>
    */
    @SerializedName("IgnoreFailedPage")
    @Expose
    private Boolean IgnoreFailedPage;

    /**
    * <p>智能文档解析返回结果的格式<br>0：只返回全文MD；<br>1：只返回每一页的OCR原始Json；<br>2：只返回每一页的MD；<br>3：返回全文MD + 每一页的OCR原始Json；<br>4：返回全文MD + 每一页的MD；<br>5：返回全文md，每一页ocr原始json，每一页md。</p>
    */
    @SerializedName("SplitResultType")
    @Expose
    private String SplitResultType;

    /**
    * <p>Markdown文件中表格返回的形式<br>0，表格以MD形式返回<br>1，表格以HTML形式返回<br>默认为</p>
    */
    @SerializedName("SplitTableResultType")
    @Expose
    private String SplitTableResultType;

    /**
    * <p>Markdown文件中是否包含页码信息</p>
    */
    @SerializedName("ReturnPageFormat")
    @Expose
    private Boolean ReturnPageFormat;

    /**
    * <p>自定义输出页码样式,{{p}}为页码占位符，开启ReturnPageFormat生效。未填默认样式:<page_num>page {{p}}</page_num></p>
    */
    @SerializedName("PageFormat")
    @Expose
    private String PageFormat;

    /**
     * Get <p>Markdown文件中表格返回的形式<br>0，表格以MD形式返回<br>1，表格以HTML形式返回<br>默认为</p> 
     * @return TableResultType <p>Markdown文件中表格返回的形式<br>0，表格以MD形式返回<br>1，表格以HTML形式返回<br>默认为</p>
     * @deprecated
     */
    @Deprecated
    public String getTableResultType() {
        return this.TableResultType;
    }

    /**
     * Set <p>Markdown文件中表格返回的形式<br>0，表格以MD形式返回<br>1，表格以HTML形式返回<br>默认为</p>
     * @param TableResultType <p>Markdown文件中表格返回的形式<br>0，表格以MD形式返回<br>1，表格以HTML形式返回<br>默认为</p>
     * @deprecated
     */
    @Deprecated
    public void setTableResultType(String TableResultType) {
        this.TableResultType = TableResultType;
    }

    /**
     * Get <p>智能文档解析返回结果的格式<br>0：只返回全文MD；<br>1：只返回每一页的OCR原始Json；<br>2：只返回每一页的MD；<br>3：返回全文MD + 每一页的OCR原始Json；<br>4：返回全文MD + 每一页的MD；<br>5：返回全文md，每一页ocr原始json，每一页md。</p> 
     * @return ResultType <p>智能文档解析返回结果的格式<br>0：只返回全文MD；<br>1：只返回每一页的OCR原始Json；<br>2：只返回每一页的MD；<br>3：返回全文MD + 每一页的OCR原始Json；<br>4：返回全文MD + 每一页的MD；<br>5：返回全文md，每一页ocr原始json，每一页md。</p>
     * @deprecated
     */
    @Deprecated
    public String getResultType() {
        return this.ResultType;
    }

    /**
     * Set <p>智能文档解析返回结果的格式<br>0：只返回全文MD；<br>1：只返回每一页的OCR原始Json；<br>2：只返回每一页的MD；<br>3：返回全文MD + 每一页的OCR原始Json；<br>4：返回全文MD + 每一页的MD；<br>5：返回全文md，每一页ocr原始json，每一页md。</p>
     * @param ResultType <p>智能文档解析返回结果的格式<br>0：只返回全文MD；<br>1：只返回每一页的OCR原始Json；<br>2：只返回每一页的MD；<br>3：返回全文MD + 每一页的OCR原始Json；<br>4：返回全文MD + 每一页的MD；<br>5：返回全文md，每一页ocr原始json，每一页md。</p>
     * @deprecated
     */
    @Deprecated
    public void setResultType(String ResultType) {
        this.ResultType = ResultType;
    }

    /**
     * Get <p>是否开启mllm</p> 
     * @return EnableMllm <p>是否开启mllm</p>
     */
    public Boolean getEnableMllm() {
        return this.EnableMllm;
    }

    /**
     * Set <p>是否开启mllm</p>
     * @param EnableMllm <p>是否开启mllm</p>
     */
    public void setEnableMllm(Boolean EnableMllm) {
        this.EnableMllm = EnableMllm;
    }

    /**
     * Get <p>最大分片长度</p> 
     * @return MaxChunkSize <p>最大分片长度</p>
     */
    public Long getMaxChunkSize() {
        return this.MaxChunkSize;
    }

    /**
     * Set <p>最大分片长度</p>
     * @param MaxChunkSize <p>最大分片长度</p>
     */
    public void setMaxChunkSize(Long MaxChunkSize) {
        this.MaxChunkSize = MaxChunkSize;
    }

    /**
     * Get <p>是否忽略返回失败页码</p> 
     * @return IgnoreFailedPage <p>是否忽略返回失败页码</p>
     */
    public Boolean getIgnoreFailedPage() {
        return this.IgnoreFailedPage;
    }

    /**
     * Set <p>是否忽略返回失败页码</p>
     * @param IgnoreFailedPage <p>是否忽略返回失败页码</p>
     */
    public void setIgnoreFailedPage(Boolean IgnoreFailedPage) {
        this.IgnoreFailedPage = IgnoreFailedPage;
    }

    /**
     * Get <p>智能文档解析返回结果的格式<br>0：只返回全文MD；<br>1：只返回每一页的OCR原始Json；<br>2：只返回每一页的MD；<br>3：返回全文MD + 每一页的OCR原始Json；<br>4：返回全文MD + 每一页的MD；<br>5：返回全文md，每一页ocr原始json，每一页md。</p> 
     * @return SplitResultType <p>智能文档解析返回结果的格式<br>0：只返回全文MD；<br>1：只返回每一页的OCR原始Json；<br>2：只返回每一页的MD；<br>3：返回全文MD + 每一页的OCR原始Json；<br>4：返回全文MD + 每一页的MD；<br>5：返回全文md，每一页ocr原始json，每一页md。</p>
     */
    public String getSplitResultType() {
        return this.SplitResultType;
    }

    /**
     * Set <p>智能文档解析返回结果的格式<br>0：只返回全文MD；<br>1：只返回每一页的OCR原始Json；<br>2：只返回每一页的MD；<br>3：返回全文MD + 每一页的OCR原始Json；<br>4：返回全文MD + 每一页的MD；<br>5：返回全文md，每一页ocr原始json，每一页md。</p>
     * @param SplitResultType <p>智能文档解析返回结果的格式<br>0：只返回全文MD；<br>1：只返回每一页的OCR原始Json；<br>2：只返回每一页的MD；<br>3：返回全文MD + 每一页的OCR原始Json；<br>4：返回全文MD + 每一页的MD；<br>5：返回全文md，每一页ocr原始json，每一页md。</p>
     */
    public void setSplitResultType(String SplitResultType) {
        this.SplitResultType = SplitResultType;
    }

    /**
     * Get <p>Markdown文件中表格返回的形式<br>0，表格以MD形式返回<br>1，表格以HTML形式返回<br>默认为</p> 
     * @return SplitTableResultType <p>Markdown文件中表格返回的形式<br>0，表格以MD形式返回<br>1，表格以HTML形式返回<br>默认为</p>
     */
    public String getSplitTableResultType() {
        return this.SplitTableResultType;
    }

    /**
     * Set <p>Markdown文件中表格返回的形式<br>0，表格以MD形式返回<br>1，表格以HTML形式返回<br>默认为</p>
     * @param SplitTableResultType <p>Markdown文件中表格返回的形式<br>0，表格以MD形式返回<br>1，表格以HTML形式返回<br>默认为</p>
     */
    public void setSplitTableResultType(String SplitTableResultType) {
        this.SplitTableResultType = SplitTableResultType;
    }

    /**
     * Get <p>Markdown文件中是否包含页码信息</p> 
     * @return ReturnPageFormat <p>Markdown文件中是否包含页码信息</p>
     */
    public Boolean getReturnPageFormat() {
        return this.ReturnPageFormat;
    }

    /**
     * Set <p>Markdown文件中是否包含页码信息</p>
     * @param ReturnPageFormat <p>Markdown文件中是否包含页码信息</p>
     */
    public void setReturnPageFormat(Boolean ReturnPageFormat) {
        this.ReturnPageFormat = ReturnPageFormat;
    }

    /**
     * Get <p>自定义输出页码样式,{{p}}为页码占位符，开启ReturnPageFormat生效。未填默认样式:<page_num>page {{p}}</page_num></p> 
     * @return PageFormat <p>自定义输出页码样式,{{p}}为页码占位符，开启ReturnPageFormat生效。未填默认样式:<page_num>page {{p}}</page_num></p>
     */
    public String getPageFormat() {
        return this.PageFormat;
    }

    /**
     * Set <p>自定义输出页码样式,{{p}}为页码占位符，开启ReturnPageFormat生效。未填默认样式:<page_num>page {{p}}</page_num></p>
     * @param PageFormat <p>自定义输出页码样式,{{p}}为页码占位符，开启ReturnPageFormat生效。未填默认样式:<page_num>page {{p}}</page_num></p>
     */
    public void setPageFormat(String PageFormat) {
        this.PageFormat = PageFormat;
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
        if (source.IgnoreFailedPage != null) {
            this.IgnoreFailedPage = new Boolean(source.IgnoreFailedPage);
        }
        if (source.SplitResultType != null) {
            this.SplitResultType = new String(source.SplitResultType);
        }
        if (source.SplitTableResultType != null) {
            this.SplitTableResultType = new String(source.SplitTableResultType);
        }
        if (source.ReturnPageFormat != null) {
            this.ReturnPageFormat = new Boolean(source.ReturnPageFormat);
        }
        if (source.PageFormat != null) {
            this.PageFormat = new String(source.PageFormat);
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
        this.setParamSimple(map, prefix + "IgnoreFailedPage", this.IgnoreFailedPage);
        this.setParamSimple(map, prefix + "SplitResultType", this.SplitResultType);
        this.setParamSimple(map, prefix + "SplitTableResultType", this.SplitTableResultType);
        this.setParamSimple(map, prefix + "ReturnPageFormat", this.ReturnPageFormat);
        this.setParamSimple(map, prefix + "PageFormat", this.PageFormat);

    }
}

