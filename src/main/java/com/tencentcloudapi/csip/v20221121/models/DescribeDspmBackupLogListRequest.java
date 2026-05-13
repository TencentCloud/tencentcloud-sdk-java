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

public class DescribeDspmBackupLogListRequest extends AbstractModel {

    /**
    * <p>限制数目</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>排序方式(desc=倒叙,asc=升序)</p>
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * <p>排序字段(支持&#39;StartTime&#39;)</p>
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * <p>开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>备份日志状态0未完成的,1备份文件，2恢复中，3已恢复，4.已删除,全部查询-1</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>数据库类型,如：cdb, mariadb</p>
    */
    @SerializedName("DbTypes")
    @Expose
    private String [] DbTypes;

    /**
     * Get <p>限制数目</p> 
     * @return Limit <p>限制数目</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>限制数目</p>
     * @param Limit <p>限制数目</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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
     * Get <p>排序方式(desc=倒叙,asc=升序)</p> 
     * @return Sort <p>排序方式(desc=倒叙,asc=升序)</p>
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set <p>排序方式(desc=倒叙,asc=升序)</p>
     * @param Sort <p>排序方式(desc=倒叙,asc=升序)</p>
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get <p>排序字段(支持&#39;StartTime&#39;)</p> 
     * @return Field <p>排序字段(支持&#39;StartTime&#39;)</p>
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set <p>排序字段(支持&#39;StartTime&#39;)</p>
     * @param Field <p>排序字段(支持&#39;StartTime&#39;)</p>
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * Get <p>开始时间</p> 
     * @return StartTime <p>开始时间</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间</p>
     * @param StartTime <p>开始时间</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间</p> 
     * @return EndTime <p>结束时间</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
     * @param EndTime <p>结束时间</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>备份日志状态0未完成的,1备份文件，2恢复中，3已恢复，4.已删除,全部查询-1</p> 
     * @return Status <p>备份日志状态0未完成的,1备份文件，2恢复中，3已恢复，4.已删除,全部查询-1</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>备份日志状态0未完成的,1备份文件，2恢复中，3已恢复，4.已删除,全部查询-1</p>
     * @param Status <p>备份日志状态0未完成的,1备份文件，2恢复中，3已恢复，4.已删除,全部查询-1</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>数据库类型,如：cdb, mariadb</p> 
     * @return DbTypes <p>数据库类型,如：cdb, mariadb</p>
     */
    public String [] getDbTypes() {
        return this.DbTypes;
    }

    /**
     * Set <p>数据库类型,如：cdb, mariadb</p>
     * @param DbTypes <p>数据库类型,如：cdb, mariadb</p>
     */
    public void setDbTypes(String [] DbTypes) {
        this.DbTypes = DbTypes;
    }

    public DescribeDspmBackupLogListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDspmBackupLogListRequest(DescribeDspmBackupLogListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.Field != null) {
            this.Field = new String(source.Field);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.DbTypes != null) {
            this.DbTypes = new String[source.DbTypes.length];
            for (int i = 0; i < source.DbTypes.length; i++) {
                this.DbTypes[i] = new String(source.DbTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Field", this.Field);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "DbTypes.", this.DbTypes);

    }
}

