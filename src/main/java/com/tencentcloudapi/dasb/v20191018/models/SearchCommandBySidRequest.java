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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchCommandBySidRequest extends AbstractModel{

    /**
    * 会话Id
    */
    @SerializedName("Sid")
    @Expose
    private String Sid;

    /**
    * 命令，可模糊搜索
    */
    @SerializedName("Cmd")
    @Expose
    private String Cmd;

    /**
    * Cmd字段是前端传值是否进行base64.
0:否，1：是
    */
    @SerializedName("Encoding")
    @Expose
    private Long Encoding;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页容量，默认20，最大200
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 根据拦截状态进行过滤
    */
    @SerializedName("AuditAction")
    @Expose
    private Long [] AuditAction;

    /**
     * Get 会话Id 
     * @return Sid 会话Id
     */
    public String getSid() {
        return this.Sid;
    }

    /**
     * Set 会话Id
     * @param Sid 会话Id
     */
    public void setSid(String Sid) {
        this.Sid = Sid;
    }

    /**
     * Get 命令，可模糊搜索 
     * @return Cmd 命令，可模糊搜索
     */
    public String getCmd() {
        return this.Cmd;
    }

    /**
     * Set 命令，可模糊搜索
     * @param Cmd 命令，可模糊搜索
     */
    public void setCmd(String Cmd) {
        this.Cmd = Cmd;
    }

    /**
     * Get Cmd字段是前端传值是否进行base64.
0:否，1：是 
     * @return Encoding Cmd字段是前端传值是否进行base64.
0:否，1：是
     */
    public Long getEncoding() {
        return this.Encoding;
    }

    /**
     * Set Cmd字段是前端传值是否进行base64.
0:否，1：是
     * @param Encoding Cmd字段是前端传值是否进行base64.
0:否，1：是
     */
    public void setEncoding(Long Encoding) {
        this.Encoding = Encoding;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页容量，默认20，最大200 
     * @return Limit 每页容量，默认20，最大200
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页容量，默认20，最大200
     * @param Limit 每页容量，默认20，最大200
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 根据拦截状态进行过滤 
     * @return AuditAction 根据拦截状态进行过滤
     */
    public Long [] getAuditAction() {
        return this.AuditAction;
    }

    /**
     * Set 根据拦截状态进行过滤
     * @param AuditAction 根据拦截状态进行过滤
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

