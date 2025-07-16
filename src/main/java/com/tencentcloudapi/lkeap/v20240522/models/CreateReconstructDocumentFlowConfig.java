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

public class CreateReconstructDocumentFlowConfig extends AbstractModel {

    /**
    * Markdown文件中表格返回的形式
0，表格以MD形式返回
1，表格以HTML形式返回
默认为0
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
默认值为0
    */
    @SerializedName("ResultType")
    @Expose
    private String ResultType;

    /**
    * 是否忽略失败页，返回已成功的页数据。默认为true。
    */
    @SerializedName("IgnoreFailedPage")
    @Expose
    private Boolean IgnoreFailedPage;

    /**
     * Get Markdown文件中表格返回的形式
0，表格以MD形式返回
1，表格以HTML形式返回
默认为0 
     * @return TableResultType Markdown文件中表格返回的形式
0，表格以MD形式返回
1，表格以HTML形式返回
默认为0
     */
    public String getTableResultType() {
        return this.TableResultType;
    }

    /**
     * Set Markdown文件中表格返回的形式
0，表格以MD形式返回
1，表格以HTML形式返回
默认为0
     * @param TableResultType Markdown文件中表格返回的形式
0，表格以MD形式返回
1，表格以HTML形式返回
默认为0
     */
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
默认值为0 
     * @return ResultType 智能文档解析返回结果的格式
0：只返回全文MD；
1：只返回每一页的OCR原始Json；
2：只返回每一页的MD，
3：返回全文MD + 每一页的OCR原始Json；
4：返回全文MD + 每一页的MD，
默认值为0
     */
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
默认值为0
     * @param ResultType 智能文档解析返回结果的格式
0：只返回全文MD；
1：只返回每一页的OCR原始Json；
2：只返回每一页的MD，
3：返回全文MD + 每一页的OCR原始Json；
4：返回全文MD + 每一页的MD，
默认值为0
     */
    public void setResultType(String ResultType) {
        this.ResultType = ResultType;
    }

    /**
     * Get 是否忽略失败页，返回已成功的页数据。默认为true。 
     * @return IgnoreFailedPage 是否忽略失败页，返回已成功的页数据。默认为true。
     */
    public Boolean getIgnoreFailedPage() {
        return this.IgnoreFailedPage;
    }

    /**
     * Set 是否忽略失败页，返回已成功的页数据。默认为true。
     * @param IgnoreFailedPage 是否忽略失败页，返回已成功的页数据。默认为true。
     */
    public void setIgnoreFailedPage(Boolean IgnoreFailedPage) {
        this.IgnoreFailedPage = IgnoreFailedPage;
    }

    public CreateReconstructDocumentFlowConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateReconstructDocumentFlowConfig(CreateReconstructDocumentFlowConfig source) {
        if (source.TableResultType != null) {
            this.TableResultType = new String(source.TableResultType);
        }
        if (source.ResultType != null) {
            this.ResultType = new String(source.ResultType);
        }
        if (source.IgnoreFailedPage != null) {
            this.IgnoreFailedPage = new Boolean(source.IgnoreFailedPage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableResultType", this.TableResultType);
        this.setParamSimple(map, prefix + "ResultType", this.ResultType);
        this.setParamSimple(map, prefix + "IgnoreFailedPage", this.IgnoreFailedPage);

    }
}

