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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryParseDocResultResponse extends AbstractModel {

    /**
    * 等待 / 执行中 / 成功 / 失败
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 解析后的文件内容
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 文件下载地址
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 解析失败原因
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 等待 / 执行中 / 成功 / 失败 
     * @return Status 等待 / 执行中 / 成功 / 失败
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 等待 / 执行中 / 成功 / 失败
     * @param Status 等待 / 执行中 / 成功 / 失败
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 解析后的文件内容 
     * @return Name 解析后的文件内容
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 解析后的文件内容
     * @param Name 解析后的文件内容
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 文件下载地址 
     * @return Url 文件下载地址
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 文件下载地址
     * @param Url 文件下载地址
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 解析失败原因 
     * @return Reason 解析失败原因
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 解析失败原因
     * @param Reason 解析失败原因
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
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

    public QueryParseDocResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryParseDocResultResponse(QueryParseDocResultResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

