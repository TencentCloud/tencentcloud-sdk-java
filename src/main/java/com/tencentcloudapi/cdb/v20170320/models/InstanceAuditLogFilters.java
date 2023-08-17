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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceAuditLogFilters extends AbstractModel{

    /**
    * 过滤项。目前支持以下搜索条件：

包含、不包含、包含（分词维度）、不包含（分词维度）:
sql - SQL详情

等于、不等于、包含、不包含：
host - 客户端地址；
user - 用户名；
dbName - 数据库名称；

等于、不等于：
sqlType - SQL类型；
errCode - 错误码；
threadId - 线程ID；

范围搜索（时间类型统一为微秒）：
execTime - 执行时间；
lockWaitTime - 执行时间；
ioWaitTime - IO等待时间；
trxLivingTime - 事物持续时间；
cpuTime - cpu时间；
checkRows - 扫描行数；
affectRows - 影响行数；
sentRows - 返回行数。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 过滤条件。支持以下条件：
WINC-包含（分词维度），
WEXC-不包含（分词维度）,
INC - 包含,
EXC - 不包含,
EQS - 等于,
NEQ - 不等于,
RA - 范围。
    */
    @SerializedName("Compare")
    @Expose
    private String Compare;

    /**
    * 过滤的值。反向查询时，多个值之前是且的关系，正向查询多个值是或的关系
    */
    @SerializedName("Value")
    @Expose
    private String [] Value;

    /**
     * Get 过滤项。目前支持以下搜索条件：

包含、不包含、包含（分词维度）、不包含（分词维度）:
sql - SQL详情

等于、不等于、包含、不包含：
host - 客户端地址；
user - 用户名；
dbName - 数据库名称；

等于、不等于：
sqlType - SQL类型；
errCode - 错误码；
threadId - 线程ID；

范围搜索（时间类型统一为微秒）：
execTime - 执行时间；
lockWaitTime - 执行时间；
ioWaitTime - IO等待时间；
trxLivingTime - 事物持续时间；
cpuTime - cpu时间；
checkRows - 扫描行数；
affectRows - 影响行数；
sentRows - 返回行数。 
     * @return Type 过滤项。目前支持以下搜索条件：

包含、不包含、包含（分词维度）、不包含（分词维度）:
sql - SQL详情

等于、不等于、包含、不包含：
host - 客户端地址；
user - 用户名；
dbName - 数据库名称；

等于、不等于：
sqlType - SQL类型；
errCode - 错误码；
threadId - 线程ID；

范围搜索（时间类型统一为微秒）：
execTime - 执行时间；
lockWaitTime - 执行时间；
ioWaitTime - IO等待时间；
trxLivingTime - 事物持续时间；
cpuTime - cpu时间；
checkRows - 扫描行数；
affectRows - 影响行数；
sentRows - 返回行数。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 过滤项。目前支持以下搜索条件：

包含、不包含、包含（分词维度）、不包含（分词维度）:
sql - SQL详情

等于、不等于、包含、不包含：
host - 客户端地址；
user - 用户名；
dbName - 数据库名称；

等于、不等于：
sqlType - SQL类型；
errCode - 错误码；
threadId - 线程ID；

范围搜索（时间类型统一为微秒）：
execTime - 执行时间；
lockWaitTime - 执行时间；
ioWaitTime - IO等待时间；
trxLivingTime - 事物持续时间；
cpuTime - cpu时间；
checkRows - 扫描行数；
affectRows - 影响行数；
sentRows - 返回行数。
     * @param Type 过滤项。目前支持以下搜索条件：

包含、不包含、包含（分词维度）、不包含（分词维度）:
sql - SQL详情

等于、不等于、包含、不包含：
host - 客户端地址；
user - 用户名；
dbName - 数据库名称；

等于、不等于：
sqlType - SQL类型；
errCode - 错误码；
threadId - 线程ID；

范围搜索（时间类型统一为微秒）：
execTime - 执行时间；
lockWaitTime - 执行时间；
ioWaitTime - IO等待时间；
trxLivingTime - 事物持续时间；
cpuTime - cpu时间；
checkRows - 扫描行数；
affectRows - 影响行数；
sentRows - 返回行数。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 过滤条件。支持以下条件：
WINC-包含（分词维度），
WEXC-不包含（分词维度）,
INC - 包含,
EXC - 不包含,
EQS - 等于,
NEQ - 不等于,
RA - 范围。 
     * @return Compare 过滤条件。支持以下条件：
WINC-包含（分词维度），
WEXC-不包含（分词维度）,
INC - 包含,
EXC - 不包含,
EQS - 等于,
NEQ - 不等于,
RA - 范围。
     */
    public String getCompare() {
        return this.Compare;
    }

    /**
     * Set 过滤条件。支持以下条件：
WINC-包含（分词维度），
WEXC-不包含（分词维度）,
INC - 包含,
EXC - 不包含,
EQS - 等于,
NEQ - 不等于,
RA - 范围。
     * @param Compare 过滤条件。支持以下条件：
WINC-包含（分词维度），
WEXC-不包含（分词维度）,
INC - 包含,
EXC - 不包含,
EQS - 等于,
NEQ - 不等于,
RA - 范围。
     */
    public void setCompare(String Compare) {
        this.Compare = Compare;
    }

    /**
     * Get 过滤的值。反向查询时，多个值之前是且的关系，正向查询多个值是或的关系 
     * @return Value 过滤的值。反向查询时，多个值之前是且的关系，正向查询多个值是或的关系
     */
    public String [] getValue() {
        return this.Value;
    }

    /**
     * Set 过滤的值。反向查询时，多个值之前是且的关系，正向查询多个值是或的关系
     * @param Value 过滤的值。反向查询时，多个值之前是且的关系，正向查询多个值是或的关系
     */
    public void setValue(String [] Value) {
        this.Value = Value;
    }

    public InstanceAuditLogFilters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceAuditLogFilters(InstanceAuditLogFilters source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Compare != null) {
            this.Compare = new String(source.Compare);
        }
        if (source.Value != null) {
            this.Value = new String[source.Value.length];
            for (int i = 0; i < source.Value.length; i++) {
                this.Value[i] = new String(source.Value[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Compare", this.Compare);
        this.setParamArraySimple(map, prefix + "Value.", this.Value);

    }
}

