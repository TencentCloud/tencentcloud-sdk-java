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

public class SearchFileBySidRequest extends AbstractModel{

    /**
    * 若入参为Id，则其他入参字段不作为搜索依据，仅按照Id来搜索会话
    */
    @SerializedName("Sid")
    @Expose
    private String Sid;

    /**
    * 是否创建审计日志,通过查看按钮调用时为true,其他为false
    */
    @SerializedName("AuditLog")
    @Expose
    private Boolean AuditLog;

    /**
    * 分页的页内记录数，默认为20，最大200
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 可填写路径名或文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 分页用偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 1-已执行，  2-被阻断
    */
    @SerializedName("AuditAction")
    @Expose
    private Long AuditAction;

    /**
    * 以Protocol和Method为条件查询
    */
    @SerializedName("TypeFilters")
    @Expose
    private SearchFileTypeFilter [] TypeFilters;

    /**
     * Get 若入参为Id，则其他入参字段不作为搜索依据，仅按照Id来搜索会话 
     * @return Sid 若入参为Id，则其他入参字段不作为搜索依据，仅按照Id来搜索会话
     */
    public String getSid() {
        return this.Sid;
    }

    /**
     * Set 若入参为Id，则其他入参字段不作为搜索依据，仅按照Id来搜索会话
     * @param Sid 若入参为Id，则其他入参字段不作为搜索依据，仅按照Id来搜索会话
     */
    public void setSid(String Sid) {
        this.Sid = Sid;
    }

    /**
     * Get 是否创建审计日志,通过查看按钮调用时为true,其他为false 
     * @return AuditLog 是否创建审计日志,通过查看按钮调用时为true,其他为false
     */
    public Boolean getAuditLog() {
        return this.AuditLog;
    }

    /**
     * Set 是否创建审计日志,通过查看按钮调用时为true,其他为false
     * @param AuditLog 是否创建审计日志,通过查看按钮调用时为true,其他为false
     */
    public void setAuditLog(Boolean AuditLog) {
        this.AuditLog = AuditLog;
    }

    /**
     * Get 分页的页内记录数，默认为20，最大200 
     * @return Limit 分页的页内记录数，默认为20，最大200
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页的页内记录数，默认为20，最大200
     * @param Limit 分页的页内记录数，默认为20，最大200
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 可填写路径名或文件名 
     * @return FileName 可填写路径名或文件名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 可填写路径名或文件名
     * @param FileName 可填写路径名或文件名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 分页用偏移量 
     * @return Offset 分页用偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页用偏移量
     * @param Offset 分页用偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 1-已执行，  2-被阻断 
     * @return AuditAction 1-已执行，  2-被阻断
     */
    public Long getAuditAction() {
        return this.AuditAction;
    }

    /**
     * Set 1-已执行，  2-被阻断
     * @param AuditAction 1-已执行，  2-被阻断
     */
    public void setAuditAction(Long AuditAction) {
        this.AuditAction = AuditAction;
    }

    /**
     * Get 以Protocol和Method为条件查询 
     * @return TypeFilters 以Protocol和Method为条件查询
     */
    public SearchFileTypeFilter [] getTypeFilters() {
        return this.TypeFilters;
    }

    /**
     * Set 以Protocol和Method为条件查询
     * @param TypeFilters 以Protocol和Method为条件查询
     */
    public void setTypeFilters(SearchFileTypeFilter [] TypeFilters) {
        this.TypeFilters = TypeFilters;
    }

    public SearchFileBySidRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchFileBySidRequest(SearchFileBySidRequest source) {
        if (source.Sid != null) {
            this.Sid = new String(source.Sid);
        }
        if (source.AuditLog != null) {
            this.AuditLog = new Boolean(source.AuditLog);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.AuditAction != null) {
            this.AuditAction = new Long(source.AuditAction);
        }
        if (source.TypeFilters != null) {
            this.TypeFilters = new SearchFileTypeFilter[source.TypeFilters.length];
            for (int i = 0; i < source.TypeFilters.length; i++) {
                this.TypeFilters[i] = new SearchFileTypeFilter(source.TypeFilters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Sid", this.Sid);
        this.setParamSimple(map, prefix + "AuditLog", this.AuditLog);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "AuditAction", this.AuditAction);
        this.setParamArrayObj(map, prefix + "TypeFilters.", this.TypeFilters);

    }
}

