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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchCommandBySidRequest extends AbstractModel {

    /**
    * <p>会话Id</p>
    */
    @SerializedName("Sid")
    @Expose
    private String Sid;

    /**
    * <p>命令，可模糊搜索</p>
    */
    @SerializedName("Cmd")
    @Expose
    private String Cmd;

    /**
    * <p>Cmd字段是前端传值是否进行base64.<br>0:否，1：是</p>
    */
    @SerializedName("Encoding")
    @Expose
    private Long Encoding;

    /**
    * <p>偏移量</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>每页容量，默认20，最大200</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>根据拦截状态进行过滤，1-已放行，2-已阻断，3-复核</p>
    */
    @SerializedName("AuditAction")
    @Expose
    private Long [] AuditAction;

    /**
     * Get <p>会话Id</p> 
     * @return Sid <p>会话Id</p>
     */
    public String getSid() {
        return this.Sid;
    }

    /**
     * Set <p>会话Id</p>
     * @param Sid <p>会话Id</p>
     */
    public void setSid(String Sid) {
        this.Sid = Sid;
    }

    /**
     * Get <p>命令，可模糊搜索</p> 
     * @return Cmd <p>命令，可模糊搜索</p>
     */
    public String getCmd() {
        return this.Cmd;
    }

    /**
     * Set <p>命令，可模糊搜索</p>
     * @param Cmd <p>命令，可模糊搜索</p>
     */
    public void setCmd(String Cmd) {
        this.Cmd = Cmd;
    }

    /**
     * Get <p>Cmd字段是前端传值是否进行base64.<br>0:否，1：是</p> 
     * @return Encoding <p>Cmd字段是前端传值是否进行base64.<br>0:否，1：是</p>
     */
    public Long getEncoding() {
        return this.Encoding;
    }

    /**
     * Set <p>Cmd字段是前端传值是否进行base64.<br>0:否，1：是</p>
     * @param Encoding <p>Cmd字段是前端传值是否进行base64.<br>0:否，1：是</p>
     */
    public void setEncoding(Long Encoding) {
        this.Encoding = Encoding;
    }

    /**
     * Get <p>偏移量</p> 
     * @return Offset <p>偏移量</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量</p>
     * @param Offset <p>偏移量</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>每页容量，默认20，最大200</p> 
     * @return Limit <p>每页容量，默认20，最大200</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页容量，默认20，最大200</p>
     * @param Limit <p>每页容量，默认20，最大200</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>根据拦截状态进行过滤，1-已放行，2-已阻断，3-复核</p> 
     * @return AuditAction <p>根据拦截状态进行过滤，1-已放行，2-已阻断，3-复核</p>
     */
    public Long [] getAuditAction() {
        return this.AuditAction;
    }

    /**
     * Set <p>根据拦截状态进行过滤，1-已放行，2-已阻断，3-复核</p>
     * @param AuditAction <p>根据拦截状态进行过滤，1-已放行，2-已阻断，3-复核</p>
     */
    public void setAuditAction(Long [] AuditAction) {
        this.AuditAction = AuditAction;
    }

    public SearchCommandBySidRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchCommandBySidRequest(SearchCommandBySidRequest source) {
        if (source.Sid != null) {
            this.Sid = new String(source.Sid);
        }
        if (source.Cmd != null) {
            this.Cmd = new String(source.Cmd);
        }
        if (source.Encoding != null) {
            this.Encoding = new Long(source.Encoding);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.AuditAction != null) {
            this.AuditAction = new Long[source.AuditAction.length];
            for (int i = 0; i < source.AuditAction.length; i++) {
                this.AuditAction[i] = new Long(source.AuditAction[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Sid", this.Sid);
        this.setParamSimple(map, prefix + "Cmd", this.Cmd);
        this.setParamSimple(map, prefix + "Encoding", this.Encoding);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "AuditAction.", this.AuditAction);

    }
}

