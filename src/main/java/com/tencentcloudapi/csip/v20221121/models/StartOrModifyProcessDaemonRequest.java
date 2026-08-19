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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartOrModifyProcessDaemonRequest extends AbstractModel {

    /**
    * <p>操作来源 0   主机页面 1   客户端设置页面</p>
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * <p>开启范围 0 自选主机 1 全部主机</p>
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>正选的quuid集合</p>
    */
    @SerializedName("IncludeQuuid")
    @Expose
    private String [] IncludeQuuid;

    /**
    * <p>反选的quuid集合</p>
    */
    @SerializedName("ExcludeQuuid")
    @Expose
    private String [] ExcludeQuuid;

    /**
     * Get <p>操作来源 0   主机页面 1   客户端设置页面</p> 
     * @return From <p>操作来源 0   主机页面 1   客户端设置页面</p>
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set <p>操作来源 0   主机页面 1   客户端设置页面</p>
     * @param From <p>操作来源 0   主机页面 1   客户端设置页面</p>
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get <p>开启范围 0 自选主机 1 全部主机</p> 
     * @return Scope <p>开启范围 0 自选主机 1 全部主机</p>
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set <p>开启范围 0 自选主机 1 全部主机</p>
     * @param Scope <p>开启范围 0 自选主机 1 全部主机</p>
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>正选的quuid集合</p> 
     * @return IncludeQuuid <p>正选的quuid集合</p>
     */
    public String [] getIncludeQuuid() {
        return this.IncludeQuuid;
    }

    /**
     * Set <p>正选的quuid集合</p>
     * @param IncludeQuuid <p>正选的quuid集合</p>
     */
    public void setIncludeQuuid(String [] IncludeQuuid) {
        this.IncludeQuuid = IncludeQuuid;
    }

    /**
     * Get <p>反选的quuid集合</p> 
     * @return ExcludeQuuid <p>反选的quuid集合</p>
     */
    public String [] getExcludeQuuid() {
        return this.ExcludeQuuid;
    }

    /**
     * Set <p>反选的quuid集合</p>
     * @param ExcludeQuuid <p>反选的quuid集合</p>
     */
    public void setExcludeQuuid(String [] ExcludeQuuid) {
        this.ExcludeQuuid = ExcludeQuuid;
    }

    public StartOrModifyProcessDaemonRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartOrModifyProcessDaemonRequest(StartOrModifyProcessDaemonRequest source) {
        if (source.From != null) {
            this.From = new Long(source.From);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.IncludeQuuid != null) {
            this.IncludeQuuid = new String[source.IncludeQuuid.length];
            for (int i = 0; i < source.IncludeQuuid.length; i++) {
                this.IncludeQuuid[i] = new String(source.IncludeQuuid[i]);
            }
        }
        if (source.ExcludeQuuid != null) {
            this.ExcludeQuuid = new String[source.ExcludeQuuid.length];
            for (int i = 0; i < source.ExcludeQuuid.length; i++) {
                this.ExcludeQuuid[i] = new String(source.ExcludeQuuid[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "IncludeQuuid.", this.IncludeQuuid);
        this.setParamArraySimple(map, prefix + "ExcludeQuuid.", this.ExcludeQuuid);

    }
}

