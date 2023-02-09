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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNotebookSessionsResponse extends AbstractModel{

    /**
    * session总数量
    */
    @SerializedName("TotalElements")
    @Expose
    private Long TotalElements;

    /**
    * 总页数
    */
    @SerializedName("TotalPages")
    @Expose
    private Long TotalPages;

    /**
    * 当前页码
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 当前页数量
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * session列表信息
    */
    @SerializedName("Sessions")
    @Expose
    private NotebookSessions [] Sessions;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get session总数量 
     * @return TotalElements session总数量
     */
    public Long getTotalElements() {
        return this.TotalElements;
    }

    /**
     * Set session总数量
     * @param TotalElements session总数量
     */
    public void setTotalElements(Long TotalElements) {
        this.TotalElements = TotalElements;
    }

    /**
     * Get 总页数 
     * @return TotalPages 总页数
     */
    public Long getTotalPages() {
        return this.TotalPages;
    }

    /**
     * Set 总页数
     * @param TotalPages 总页数
     */
    public void setTotalPages(Long TotalPages) {
        this.TotalPages = TotalPages;
    }

    /**
     * Get 当前页码 
     * @return Page 当前页码
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 当前页码
     * @param Page 当前页码
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 当前页数量 
     * @return Size 当前页数量
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 当前页数量
     * @param Size 当前页数量
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get session列表信息 
     * @return Sessions session列表信息
     */
    public NotebookSessions [] getSessions() {
        return this.Sessions;
    }

    /**
     * Set session列表信息
     * @param Sessions session列表信息
     */
    public void setSessions(NotebookSessions [] Sessions) {
        this.Sessions = Sessions;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeNotebookSessionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNotebookSessionsResponse(DescribeNotebookSessionsResponse source) {
        if (source.TotalElements != null) {
            this.TotalElements = new Long(source.TotalElements);
        }
        if (source.TotalPages != null) {
            this.TotalPages = new Long(source.TotalPages);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Sessions != null) {
            this.Sessions = new NotebookSessions[source.Sessions.length];
            for (int i = 0; i < source.Sessions.length; i++) {
                this.Sessions[i] = new NotebookSessions(source.Sessions[i]);
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
        this.setParamSimple(map, prefix + "TotalElements", this.TotalElements);
        this.setParamSimple(map, prefix + "TotalPages", this.TotalPages);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamArrayObj(map, prefix + "Sessions.", this.Sessions);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

