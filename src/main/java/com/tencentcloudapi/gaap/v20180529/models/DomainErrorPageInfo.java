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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainErrorPageInfo extends AbstractModel {

    /**
    * 错误定制响应的配置ID
    */
    @SerializedName("ErrorPageId")
    @Expose
    private String ErrorPageId;

    /**
    * 监听器ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 原始错误码
    */
    @SerializedName("ErrorNos")
    @Expose
    private Long [] ErrorNos;

    /**
    * 新的错误码
    */
    @SerializedName("NewErrorNo")
    @Expose
    private Long NewErrorNo;

    /**
    * 需要清理的响应头
    */
    @SerializedName("ClearHeaders")
    @Expose
    private String [] ClearHeaders;

    /**
    * 需要设置的响应头
    */
    @SerializedName("SetHeaders")
    @Expose
    private HttpHeaderParam [] SetHeaders;

    /**
    * 设置的响应体(不包括 HTTP头)
    */
    @SerializedName("Body")
    @Expose
    private String Body;

    /**
    * 规则状态,0为成功
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 错误定制响应的配置ID 
     * @return ErrorPageId 错误定制响应的配置ID
     */
    public String getErrorPageId() {
        return this.ErrorPageId;
    }

    /**
     * Set 错误定制响应的配置ID
     * @param ErrorPageId 错误定制响应的配置ID
     */
    public void setErrorPageId(String ErrorPageId) {
        this.ErrorPageId = ErrorPageId;
    }

    /**
     * Get 监听器ID 
     * @return ListenerId 监听器ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 监听器ID
     * @param ListenerId 监听器ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 原始错误码 
     * @return ErrorNos 原始错误码
     */
    public Long [] getErrorNos() {
        return this.ErrorNos;
    }

    /**
     * Set 原始错误码
     * @param ErrorNos 原始错误码
     */
    public void setErrorNos(Long [] ErrorNos) {
        this.ErrorNos = ErrorNos;
    }

    /**
     * Get 新的错误码 
     * @return NewErrorNo 新的错误码
     */
    public Long getNewErrorNo() {
        return this.NewErrorNo;
    }

    /**
     * Set 新的错误码
     * @param NewErrorNo 新的错误码
     */
    public void setNewErrorNo(Long NewErrorNo) {
        this.NewErrorNo = NewErrorNo;
    }

    /**
     * Get 需要清理的响应头 
     * @return ClearHeaders 需要清理的响应头
     */
    public String [] getClearHeaders() {
        return this.ClearHeaders;
    }

    /**
     * Set 需要清理的响应头
     * @param ClearHeaders 需要清理的响应头
     */
    public void setClearHeaders(String [] ClearHeaders) {
        this.ClearHeaders = ClearHeaders;
    }

    /**
     * Get 需要设置的响应头 
     * @return SetHeaders 需要设置的响应头
     */
    public HttpHeaderParam [] getSetHeaders() {
        return this.SetHeaders;
    }

    /**
     * Set 需要设置的响应头
     * @param SetHeaders 需要设置的响应头
     */
    public void setSetHeaders(HttpHeaderParam [] SetHeaders) {
        this.SetHeaders = SetHeaders;
    }

    /**
     * Get 设置的响应体(不包括 HTTP头) 
     * @return Body 设置的响应体(不包括 HTTP头)
     */
    public String getBody() {
        return this.Body;
    }

    /**
     * Set 设置的响应体(不包括 HTTP头)
     * @param Body 设置的响应体(不包括 HTTP头)
     */
    public void setBody(String Body) {
        this.Body = Body;
    }

    /**
     * Get 规则状态,0为成功 
     * @return Status 规则状态,0为成功
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 规则状态,0为成功
     * @param Status 规则状态,0为成功
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public DomainErrorPageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainErrorPageInfo(DomainErrorPageInfo source) {
        if (source.ErrorPageId != null) {
            this.ErrorPageId = new String(source.ErrorPageId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.ErrorNos != null) {
            this.ErrorNos = new Long[source.ErrorNos.length];
            for (int i = 0; i < source.ErrorNos.length; i++) {
                this.ErrorNos[i] = new Long(source.ErrorNos[i]);
            }
        }
        if (source.NewErrorNo != null) {
            this.NewErrorNo = new Long(source.NewErrorNo);
        }
        if (source.ClearHeaders != null) {
            this.ClearHeaders = new String[source.ClearHeaders.length];
            for (int i = 0; i < source.ClearHeaders.length; i++) {
                this.ClearHeaders[i] = new String(source.ClearHeaders[i]);
            }
        }
        if (source.SetHeaders != null) {
            this.SetHeaders = new HttpHeaderParam[source.SetHeaders.length];
            for (int i = 0; i < source.SetHeaders.length; i++) {
                this.SetHeaders[i] = new HttpHeaderParam(source.SetHeaders[i]);
            }
        }
        if (source.Body != null) {
            this.Body = new String(source.Body);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrorPageId", this.ErrorPageId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "ErrorNos.", this.ErrorNos);
        this.setParamSimple(map, prefix + "NewErrorNo", this.NewErrorNo);
        this.setParamArraySimple(map, prefix + "ClearHeaders.", this.ClearHeaders);
        this.setParamArrayObj(map, prefix + "SetHeaders.", this.SetHeaders);
        this.setParamSimple(map, prefix + "Body", this.Body);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

