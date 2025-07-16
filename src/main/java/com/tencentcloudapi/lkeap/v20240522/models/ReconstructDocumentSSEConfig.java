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

public class ReconstructDocumentSSEConfig extends AbstractModel {

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
    * Markdown文件中图片返回的形式
0:markdown中图片以链接形式返回
1:markdown中图片只返回图片中提取的文本内容
默认是0
    */
    @SerializedName("MarkdownImageResponseType")
    @Expose
    private String MarkdownImageResponseType;

    /**
    * Markdown文件中是否包含页码信息
    */
    @SerializedName("ReturnPageFormat")
    @Expose
    private Boolean ReturnPageFormat;

    /**
    * 自定义输出页码样式,{{p}}为页码占位符，开启ReturnPageFormat生效。未填默认样式:<page_num>page {{p}}</page_num>
    */
    @SerializedName("PageFormat")
    @Expose
    private String PageFormat;

    /**
    * 是否忽略失败页，返回已成功的页数据
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
     * Get Markdown文件中图片返回的形式
0:markdown中图片以链接形式返回
1:markdown中图片只返回图片中提取的文本内容
默认是0 
     * @return MarkdownImageResponseType Markdown文件中图片返回的形式
0:markdown中图片以链接形式返回
1:markdown中图片只返回图片中提取的文本内容
默认是0
     */
    public String getMarkdownImageResponseType() {
        return this.MarkdownImageResponseType;
    }

    /**
     * Set Markdown文件中图片返回的形式
0:markdown中图片以链接形式返回
1:markdown中图片只返回图片中提取的文本内容
默认是0
     * @param MarkdownImageResponseType Markdown文件中图片返回的形式
0:markdown中图片以链接形式返回
1:markdown中图片只返回图片中提取的文本内容
默认是0
     */
    public void setMarkdownImageResponseType(String MarkdownImageResponseType) {
        this.MarkdownImageResponseType = MarkdownImageResponseType;
    }

    /**
     * Get Markdown文件中是否包含页码信息 
     * @return ReturnPageFormat Markdown文件中是否包含页码信息
     */
    public Boolean getReturnPageFormat() {
        return this.ReturnPageFormat;
    }

    /**
     * Set Markdown文件中是否包含页码信息
     * @param ReturnPageFormat Markdown文件中是否包含页码信息
     */
    public void setReturnPageFormat(Boolean ReturnPageFormat) {
        this.ReturnPageFormat = ReturnPageFormat;
    }

    /**
     * Get 自定义输出页码样式,{{p}}为页码占位符，开启ReturnPageFormat生效。未填默认样式:<page_num>page {{p}}</page_num> 
     * @return PageFormat 自定义输出页码样式,{{p}}为页码占位符，开启ReturnPageFormat生效。未填默认样式:<page_num>page {{p}}</page_num>
     */
    public String getPageFormat() {
        return this.PageFormat;
    }

    /**
     * Set 自定义输出页码样式,{{p}}为页码占位符，开启ReturnPageFormat生效。未填默认样式:<page_num>page {{p}}</page_num>
     * @param PageFormat 自定义输出页码样式,{{p}}为页码占位符，开启ReturnPageFormat生效。未填默认样式:<page_num>page {{p}}</page_num>
     */
    public void setPageFormat(String PageFormat) {
        this.PageFormat = PageFormat;
    }

    /**
     * Get 是否忽略失败页，返回已成功的页数据 
     * @return IgnoreFailedPage 是否忽略失败页，返回已成功的页数据
     */
    public Boolean getIgnoreFailedPage() {
        return this.IgnoreFailedPage;
    }

    /**
     * Set 是否忽略失败页，返回已成功的页数据
     * @param IgnoreFailedPage 是否忽略失败页，返回已成功的页数据
     */
    public void setIgnoreFailedPage(Boolean IgnoreFailedPage) {
        this.IgnoreFailedPage = IgnoreFailedPage;
    }

    public ReconstructDocumentSSEConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReconstructDocumentSSEConfig(ReconstructDocumentSSEConfig source) {
        if (source.TableResultType != null) {
            this.TableResultType = new String(source.TableResultType);
        }
        if (source.MarkdownImageResponseType != null) {
            this.MarkdownImageResponseType = new String(source.MarkdownImageResponseType);
        }
        if (source.ReturnPageFormat != null) {
            this.ReturnPageFormat = new Boolean(source.ReturnPageFormat);
        }
        if (source.PageFormat != null) {
            this.PageFormat = new String(source.PageFormat);
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
        this.setParamSimple(map, prefix + "MarkdownImageResponseType", this.MarkdownImageResponseType);
        this.setParamSimple(map, prefix + "ReturnPageFormat", this.ReturnPageFormat);
        this.setParamSimple(map, prefix + "PageFormat", this.PageFormat);
        this.setParamSimple(map, prefix + "IgnoreFailedPage", this.IgnoreFailedPage);

    }
}

