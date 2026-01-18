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

public class CreateDomainErrorPageInfoRequest extends AbstractModel {

    /**
    * <p>监听器ID</p>
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * <p>域名</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>原始错误码</p>
    */
    @SerializedName("ErrorNos")
    @Expose
    private Long [] ErrorNos;

    /**
    * <p>新的响应包体</p>
    */
    @SerializedName("Body")
    @Expose
    private String Body;

    /**
    * <p>新错误码</p>
    */
    @SerializedName("NewErrorNo")
    @Expose
    private Long NewErrorNo;

    /**
    * <p>需要删除的响应头</p>
    */
    @SerializedName("ClearHeaders")
    @Expose
    private String [] ClearHeaders;

    /**
    * <p>需要设置的响应头</p>
    */
    @SerializedName("SetHeaders")
    @Expose
    private HttpHeaderParam [] SetHeaders;

    /**
     * Get <p>监听器ID</p> 
     * @return ListenerId <p>监听器ID</p>
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set <p>监听器ID</p>
     * @param ListenerId <p>监听器ID</p>
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get <p>域名</p> 
     * @return Domain <p>域名</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>域名</p>
     * @param Domain <p>域名</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>原始错误码</p> 
     * @return ErrorNos <p>原始错误码</p>
     */
    public Long [] getErrorNos() {
        return this.ErrorNos;
    }

    /**
     * Set <p>原始错误码</p>
     * @param ErrorNos <p>原始错误码</p>
     */
    public void setErrorNos(Long [] ErrorNos) {
        this.ErrorNos = ErrorNos;
    }

    /**
     * Get <p>新的响应包体</p> 
     * @return Body <p>新的响应包体</p>
     */
    public String getBody() {
        return this.Body;
    }

    /**
     * Set <p>新的响应包体</p>
     * @param Body <p>新的响应包体</p>
     */
    public void setBody(String Body) {
        this.Body = Body;
    }

    /**
     * Get <p>新错误码</p> 
     * @return NewErrorNo <p>新错误码</p>
     */
    public Long getNewErrorNo() {
        return this.NewErrorNo;
    }

    /**
     * Set <p>新错误码</p>
     * @param NewErrorNo <p>新错误码</p>
     */
    public void setNewErrorNo(Long NewErrorNo) {
        this.NewErrorNo = NewErrorNo;
    }

    /**
     * Get <p>需要删除的响应头</p> 
     * @return ClearHeaders <p>需要删除的响应头</p>
     */
    public String [] getClearHeaders() {
        return this.ClearHeaders;
    }

    /**
     * Set <p>需要删除的响应头</p>
     * @param ClearHeaders <p>需要删除的响应头</p>
     */
    public void setClearHeaders(String [] ClearHeaders) {
        this.ClearHeaders = ClearHeaders;
    }

    /**
     * Get <p>需要设置的响应头</p> 
     * @return SetHeaders <p>需要设置的响应头</p>
     */
    public HttpHeaderParam [] getSetHeaders() {
        return this.SetHeaders;
    }

    /**
     * Set <p>需要设置的响应头</p>
     * @param SetHeaders <p>需要设置的响应头</p>
     */
    public void setSetHeaders(HttpHeaderParam [] SetHeaders) {
        this.SetHeaders = SetHeaders;
    }

    public CreateDomainErrorPageInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDomainErrorPageInfoRequest(CreateDomainErrorPageInfoRequest source) {
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
        if (source.Body != null) {
            this.Body = new String(source.Body);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "ErrorNos.", this.ErrorNos);
        this.setParamSimple(map, prefix + "Body", this.Body);
        this.setParamSimple(map, prefix + "NewErrorNo", this.NewErrorNo);
        this.setParamArraySimple(map, prefix + "ClearHeaders.", this.ClearHeaders);
        this.setParamArrayObj(map, prefix + "SetHeaders.", this.SetHeaders);

    }
}

