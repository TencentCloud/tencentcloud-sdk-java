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

public class SearchFileBySidRequest extends AbstractModel {

    /**
    * <p>若入参为Id，则其他入参字段不作为搜索依据，仅按照Id来搜索会话</p>
    */
    @SerializedName("Sid")
    @Expose
    private String Sid;

    /**
    * <p>是否创建审计日志,通过查看按钮调用时为true,其他为false</p>
    */
    @SerializedName("AuditLog")
    @Expose
    private Boolean AuditLog;

    /**
    * <p>分页的页内记录数，默认为20，最大200</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>可填写路径名或文件名</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>分页用偏移量</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>1-已放行，  2-已阻断</p>
    */
    @SerializedName("AuditAction")
    @Expose
    private Long AuditAction;

    /**
    * <p>1-已放行，  2-已阻断</p>
    */
    @SerializedName("AuditActionSet")
    @Expose
    private Long [] AuditActionSet;

    /**
    * <p>以Protocol和Method为条件查询</p>
    */
    @SerializedName("TypeFilters")
    @Expose
    private SearchFileTypeFilter [] TypeFilters;

    /**
     * Get <p>若入参为Id，则其他入参字段不作为搜索依据，仅按照Id来搜索会话</p> 
     * @return Sid <p>若入参为Id，则其他入参字段不作为搜索依据，仅按照Id来搜索会话</p>
     */
    public String getSid() {
        return this.Sid;
    }

    /**
     * Set <p>若入参为Id，则其他入参字段不作为搜索依据，仅按照Id来搜索会话</p>
     * @param Sid <p>若入参为Id，则其他入参字段不作为搜索依据，仅按照Id来搜索会话</p>
     */
    public void setSid(String Sid) {
        this.Sid = Sid;
    }

    /**
     * Get <p>是否创建审计日志,通过查看按钮调用时为true,其他为false</p> 
     * @return AuditLog <p>是否创建审计日志,通过查看按钮调用时为true,其他为false</p>
     */
    public Boolean getAuditLog() {
        return this.AuditLog;
    }

    /**
     * Set <p>是否创建审计日志,通过查看按钮调用时为true,其他为false</p>
     * @param AuditLog <p>是否创建审计日志,通过查看按钮调用时为true,其他为false</p>
     */
    public void setAuditLog(Boolean AuditLog) {
        this.AuditLog = AuditLog;
    }

    /**
     * Get <p>分页的页内记录数，默认为20，最大200</p> 
     * @return Limit <p>分页的页内记录数，默认为20，最大200</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页的页内记录数，默认为20，最大200</p>
     * @param Limit <p>分页的页内记录数，默认为20，最大200</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>可填写路径名或文件名</p> 
     * @return FileName <p>可填写路径名或文件名</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>可填写路径名或文件名</p>
     * @param FileName <p>可填写路径名或文件名</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>分页用偏移量</p> 
     * @return Offset <p>分页用偏移量</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页用偏移量</p>
     * @param Offset <p>分页用偏移量</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>1-已放行，  2-已阻断</p> 
     * @return AuditAction <p>1-已放行，  2-已阻断</p>
     */
    public Long getAuditAction() {
        return this.AuditAction;
    }

    /**
     * Set <p>1-已放行，  2-已阻断</p>
     * @param AuditAction <p>1-已放行，  2-已阻断</p>
     */
    public void setAuditAction(Long AuditAction) {
        this.AuditAction = AuditAction;
    }

    /**
     * Get <p>1-已放行，  2-已阻断</p> 
     * @return AuditActionSet <p>1-已放行，  2-已阻断</p>
     */
    public Long [] getAuditActionSet() {
        return this.AuditActionSet;
    }

    /**
     * Set <p>1-已放行，  2-已阻断</p>
     * @param AuditActionSet <p>1-已放行，  2-已阻断</p>
     */
    public void setAuditActionSet(Long [] AuditActionSet) {
        this.AuditActionSet = AuditActionSet;
    }

    /**
     * Get <p>以Protocol和Method为条件查询</p> 
     * @return TypeFilters <p>以Protocol和Method为条件查询</p>
     */
    public SearchFileTypeFilter [] getTypeFilters() {
        return this.TypeFilters;
    }

    /**
     * Set <p>以Protocol和Method为条件查询</p>
     * @param TypeFilters <p>以Protocol和Method为条件查询</p>
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
        if (source.AuditActionSet != null) {
            this.AuditActionSet = new Long[source.AuditActionSet.length];
            for (int i = 0; i < source.AuditActionSet.length; i++) {
                this.AuditActionSet[i] = new Long(source.AuditActionSet[i]);
            }
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
        this.setParamArraySimple(map, prefix + "AuditActionSet.", this.AuditActionSet);
        this.setParamArrayObj(map, prefix + "TypeFilters.", this.TypeFilters);

    }
}

