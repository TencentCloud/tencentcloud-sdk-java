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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SQLFilter extends AbstractModel{

    /**
    * 任务ID。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 任务状态，取值包括RUNNING - 运行中, FINISHED - 已完成, TERMINATED - 已终止。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * SQL类型，取值包括SELECT, UPDATE, DELETE, INSERT, REPLACE。
    */
    @SerializedName("SqlType")
    @Expose
    private String SqlType;

    /**
    * 筛选SQL的关键词，多个关键词用英文逗号拼接。
    */
    @SerializedName("OriginKeys")
    @Expose
    private String OriginKeys;

    /**
    * 筛选SQL的规则。
    */
    @SerializedName("OriginRule")
    @Expose
    private String OriginRule;

    /**
    * 已拒绝SQL数目。
    */
    @SerializedName("RejectedSqlCount")
    @Expose
    private Long RejectedSqlCount;

    /**
    * 当前并发数。
    */
    @SerializedName("CurrentConcurrency")
    @Expose
    private Long CurrentConcurrency;

    /**
    * 最大并发数。
    */
    @SerializedName("MaxConcurrency")
    @Expose
    private Long MaxConcurrency;

    /**
    * 任务创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 当前时间。
    */
    @SerializedName("CurrentTime")
    @Expose
    private String CurrentTime;

    /**
    * 限流过期时间。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get 任务ID。 
     * @return Id 任务ID。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 任务ID。
     * @param Id 任务ID。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 任务状态，取值包括RUNNING - 运行中, FINISHED - 已完成, TERMINATED - 已终止。 
     * @return Status 任务状态，取值包括RUNNING - 运行中, FINISHED - 已完成, TERMINATED - 已终止。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态，取值包括RUNNING - 运行中, FINISHED - 已完成, TERMINATED - 已终止。
     * @param Status 任务状态，取值包括RUNNING - 运行中, FINISHED - 已完成, TERMINATED - 已终止。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get SQL类型，取值包括SELECT, UPDATE, DELETE, INSERT, REPLACE。 
     * @return SqlType SQL类型，取值包括SELECT, UPDATE, DELETE, INSERT, REPLACE。
     */
    public String getSqlType() {
        return this.SqlType;
    }

    /**
     * Set SQL类型，取值包括SELECT, UPDATE, DELETE, INSERT, REPLACE。
     * @param SqlType SQL类型，取值包括SELECT, UPDATE, DELETE, INSERT, REPLACE。
     */
    public void setSqlType(String SqlType) {
        this.SqlType = SqlType;
    }

    /**
     * Get 筛选SQL的关键词，多个关键词用英文逗号拼接。 
     * @return OriginKeys 筛选SQL的关键词，多个关键词用英文逗号拼接。
     */
    public String getOriginKeys() {
        return this.OriginKeys;
    }

    /**
     * Set 筛选SQL的关键词，多个关键词用英文逗号拼接。
     * @param OriginKeys 筛选SQL的关键词，多个关键词用英文逗号拼接。
     */
    public void setOriginKeys(String OriginKeys) {
        this.OriginKeys = OriginKeys;
    }

    /**
     * Get 筛选SQL的规则。 
     * @return OriginRule 筛选SQL的规则。
     */
    public String getOriginRule() {
        return this.OriginRule;
    }

    /**
     * Set 筛选SQL的规则。
     * @param OriginRule 筛选SQL的规则。
     */
    public void setOriginRule(String OriginRule) {
        this.OriginRule = OriginRule;
    }

    /**
     * Get 已拒绝SQL数目。 
     * @return RejectedSqlCount 已拒绝SQL数目。
     */
    public Long getRejectedSqlCount() {
        return this.RejectedSqlCount;
    }

    /**
     * Set 已拒绝SQL数目。
     * @param RejectedSqlCount 已拒绝SQL数目。
     */
    public void setRejectedSqlCount(Long RejectedSqlCount) {
        this.RejectedSqlCount = RejectedSqlCount;
    }

    /**
     * Get 当前并发数。 
     * @return CurrentConcurrency 当前并发数。
     */
    public Long getCurrentConcurrency() {
        return this.CurrentConcurrency;
    }

    /**
     * Set 当前并发数。
     * @param CurrentConcurrency 当前并发数。
     */
    public void setCurrentConcurrency(Long CurrentConcurrency) {
        this.CurrentConcurrency = CurrentConcurrency;
    }

    /**
     * Get 最大并发数。 
     * @return MaxConcurrency 最大并发数。
     */
    public Long getMaxConcurrency() {
        return this.MaxConcurrency;
    }

    /**
     * Set 最大并发数。
     * @param MaxConcurrency 最大并发数。
     */
    public void setMaxConcurrency(Long MaxConcurrency) {
        this.MaxConcurrency = MaxConcurrency;
    }

    /**
     * Get 任务创建时间。 
     * @return CreateTime 任务创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务创建时间。
     * @param CreateTime 任务创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 当前时间。 
     * @return CurrentTime 当前时间。
     */
    public String getCurrentTime() {
        return this.CurrentTime;
    }

    /**
     * Set 当前时间。
     * @param CurrentTime 当前时间。
     */
    public void setCurrentTime(String CurrentTime) {
        this.CurrentTime = CurrentTime;
    }

    /**
     * Get 限流过期时间。 
     * @return ExpireTime 限流过期时间。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 限流过期时间。
     * @param ExpireTime 限流过期时间。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public SQLFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SQLFilter(SQLFilter source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SqlType != null) {
            this.SqlType = new String(source.SqlType);
        }
        if (source.OriginKeys != null) {
            this.OriginKeys = new String(source.OriginKeys);
        }
        if (source.OriginRule != null) {
            this.OriginRule = new String(source.OriginRule);
        }
        if (source.RejectedSqlCount != null) {
            this.RejectedSqlCount = new Long(source.RejectedSqlCount);
        }
        if (source.CurrentConcurrency != null) {
            this.CurrentConcurrency = new Long(source.CurrentConcurrency);
        }
        if (source.MaxConcurrency != null) {
            this.MaxConcurrency = new Long(source.MaxConcurrency);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.CurrentTime != null) {
            this.CurrentTime = new String(source.CurrentTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SqlType", this.SqlType);
        this.setParamSimple(map, prefix + "OriginKeys", this.OriginKeys);
        this.setParamSimple(map, prefix + "OriginRule", this.OriginRule);
        this.setParamSimple(map, prefix + "RejectedSqlCount", this.RejectedSqlCount);
        this.setParamSimple(map, prefix + "CurrentConcurrency", this.CurrentConcurrency);
        this.setParamSimple(map, prefix + "MaxConcurrency", this.MaxConcurrency);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "CurrentTime", this.CurrentTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

