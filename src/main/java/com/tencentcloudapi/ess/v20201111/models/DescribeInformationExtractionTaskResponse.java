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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInformationExtractionTaskResponse extends AbstractModel {

    /**
    * 合同信息提取字段信息
    */
    @SerializedName("Fields")
    @Expose
    private ExtractionField [] Fields;

    /**
    * 合同智能提取任务状态。
状态如下：
<ul>
    <li>**0** - 任务创建成功（还未执行）</li> 
    <li>**1** - 排队中（等待执行）</li>   
    <li>**2** - 提取中（正在执行）</li>  
    <li>**3** - 提取成功</li>   
    <li>**4** - 提取失败</li>
</ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 合同智能提取结果下载，文件格式为`xlsx`。

注意：`链接有效期为5分钟，过期后可重新获取`
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 合同信息提取结果信息
    */
    @SerializedName("Results")
    @Expose
    private ExtractionTaskResult [] Results;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 合同信息提取字段信息 
     * @return Fields 合同信息提取字段信息
     */
    public ExtractionField [] getFields() {
        return this.Fields;
    }

    /**
     * Set 合同信息提取字段信息
     * @param Fields 合同信息提取字段信息
     */
    public void setFields(ExtractionField [] Fields) {
        this.Fields = Fields;
    }

    /**
     * Get 合同智能提取任务状态。
状态如下：
<ul>
    <li>**0** - 任务创建成功（还未执行）</li> 
    <li>**1** - 排队中（等待执行）</li>   
    <li>**2** - 提取中（正在执行）</li>  
    <li>**3** - 提取成功</li>   
    <li>**4** - 提取失败</li>
</ul> 
     * @return Status 合同智能提取任务状态。
状态如下：
<ul>
    <li>**0** - 任务创建成功（还未执行）</li> 
    <li>**1** - 排队中（等待执行）</li>   
    <li>**2** - 提取中（正在执行）</li>  
    <li>**3** - 提取成功</li>   
    <li>**4** - 提取失败</li>
</ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 合同智能提取任务状态。
状态如下：
<ul>
    <li>**0** - 任务创建成功（还未执行）</li> 
    <li>**1** - 排队中（等待执行）</li>   
    <li>**2** - 提取中（正在执行）</li>  
    <li>**3** - 提取成功</li>   
    <li>**4** - 提取失败</li>
</ul>
     * @param Status 合同智能提取任务状态。
状态如下：
<ul>
    <li>**0** - 任务创建成功（还未执行）</li> 
    <li>**1** - 排队中（等待执行）</li>   
    <li>**2** - 提取中（正在执行）</li>  
    <li>**3** - 提取成功</li>   
    <li>**4** - 提取失败</li>
</ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 合同智能提取结果下载，文件格式为`xlsx`。

注意：`链接有效期为5分钟，过期后可重新获取` 
     * @return Url 合同智能提取结果下载，文件格式为`xlsx`。

注意：`链接有效期为5分钟，过期后可重新获取`
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 合同智能提取结果下载，文件格式为`xlsx`。

注意：`链接有效期为5分钟，过期后可重新获取`
     * @param Url 合同智能提取结果下载，文件格式为`xlsx`。

注意：`链接有效期为5分钟，过期后可重新获取`
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 合同信息提取结果信息 
     * @return Results 合同信息提取结果信息
     */
    public ExtractionTaskResult [] getResults() {
        return this.Results;
    }

    /**
     * Set 合同信息提取结果信息
     * @param Results 合同信息提取结果信息
     */
    public void setResults(ExtractionTaskResult [] Results) {
        this.Results = Results;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeInformationExtractionTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInformationExtractionTaskResponse(DescribeInformationExtractionTaskResponse source) {
        if (source.Fields != null) {
            this.Fields = new ExtractionField[source.Fields.length];
            for (int i = 0; i < source.Fields.length; i++) {
                this.Fields[i] = new ExtractionField(source.Fields[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Results != null) {
            this.Results = new ExtractionTaskResult[source.Results.length];
            for (int i = 0; i < source.Results.length; i++) {
                this.Results[i] = new ExtractionTaskResult(source.Results[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Fields.", this.Fields);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamArrayObj(map, prefix + "Results.", this.Results);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

