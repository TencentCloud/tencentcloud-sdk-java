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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRecordListRequest extends AbstractModel {

    /**
    * 脚本文件id
    */
    @SerializedName("ScriptId")
    @Expose
    private String ScriptId;

    /**
    * 分页索引
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * 单页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 脚本类型
    */
    @SerializedName("ScriptType")
    @Expose
    private String ScriptType;

    /**
    * sql语句
    */
    @SerializedName("SqlStatement")
    @Expose
    private String SqlStatement;

    /**
    * 开始时间(毫秒)
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间(毫秒)
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 任务状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 是否只查看用户自身的调试记录,默认或者不填都为true，填为false的时候会显示其他用户的此脚本的调试记录
    */
    @SerializedName("IsOnlyMyselfDebug")
    @Expose
    private Boolean IsOnlyMyselfDebug;

    /**
     * Get 脚本文件id 
     * @return ScriptId 脚本文件id
     */
    public String getScriptId() {
        return this.ScriptId;
    }

    /**
     * Set 脚本文件id
     * @param ScriptId 脚本文件id
     */
    public void setScriptId(String ScriptId) {
        this.ScriptId = ScriptId;
    }

    /**
     * Get 分页索引 
     * @return PageIndex 分页索引
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set 分页索引
     * @param PageIndex 分页索引
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get 单页大小 
     * @return PageSize 单页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 单页大小
     * @param PageSize 单页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 脚本类型 
     * @return ScriptType 脚本类型
     */
    public String getScriptType() {
        return this.ScriptType;
    }

    /**
     * Set 脚本类型
     * @param ScriptType 脚本类型
     */
    public void setScriptType(String ScriptType) {
        this.ScriptType = ScriptType;
    }

    /**
     * Get sql语句 
     * @return SqlStatement sql语句
     */
    public String getSqlStatement() {
        return this.SqlStatement;
    }

    /**
     * Set sql语句
     * @param SqlStatement sql语句
     */
    public void setSqlStatement(String SqlStatement) {
        this.SqlStatement = SqlStatement;
    }

    /**
     * Get 开始时间(毫秒) 
     * @return StartTime 开始时间(毫秒)
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间(毫秒)
     * @param StartTime 开始时间(毫秒)
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间(毫秒) 
     * @return EndTime 结束时间(毫秒)
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间(毫秒)
     * @param EndTime 结束时间(毫秒)
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 任务状态 
     * @return Status 任务状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态
     * @param Status 任务状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 是否只查看用户自身的调试记录,默认或者不填都为true，填为false的时候会显示其他用户的此脚本的调试记录 
     * @return IsOnlyMyselfDebug 是否只查看用户自身的调试记录,默认或者不填都为true，填为false的时候会显示其他用户的此脚本的调试记录
     */
    public Boolean getIsOnlyMyselfDebug() {
        return this.IsOnlyMyselfDebug;
    }

    /**
     * Set 是否只查看用户自身的调试记录,默认或者不填都为true，填为false的时候会显示其他用户的此脚本的调试记录
     * @param IsOnlyMyselfDebug 是否只查看用户自身的调试记录,默认或者不填都为true，填为false的时候会显示其他用户的此脚本的调试记录
     */
    public void setIsOnlyMyselfDebug(Boolean IsOnlyMyselfDebug) {
        this.IsOnlyMyselfDebug = IsOnlyMyselfDebug;
    }

    public DescribeRecordListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRecordListRequest(DescribeRecordListRequest source) {
        if (source.ScriptId != null) {
            this.ScriptId = new String(source.ScriptId);
        }
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.ScriptType != null) {
            this.ScriptType = new String(source.ScriptType);
        }
        if (source.SqlStatement != null) {
            this.SqlStatement = new String(source.SqlStatement);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.IsOnlyMyselfDebug != null) {
            this.IsOnlyMyselfDebug = new Boolean(source.IsOnlyMyselfDebug);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScriptId", this.ScriptId);
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ScriptType", this.ScriptType);
        this.setParamSimple(map, prefix + "SqlStatement", this.SqlStatement);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsOnlyMyselfDebug", this.IsOnlyMyselfDebug);

    }
}

