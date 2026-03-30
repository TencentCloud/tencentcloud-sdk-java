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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogFilter extends AbstractModel {

    /**
    * 过滤条件名称。

如：sql - SQL命令详情

host – 客户端 IP；
user – 数据库账户；
dbName – 数据库名称；
sqlType - SQL类型；
errCode - 错误码

execTime - 执行时间
lockWaitTime - 锁等待时间
ioWaitTime - IO等待时间
trxLivingTime - 事务执行时间
cpuTime- Cpu时间

threadId - 线程ID
trxId - 事务ID
checkRows - 扫描行数
affectRows - 影响行数
sentRows - 返回行数
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 过滤条件匹配类型。支持：
INC – 包含；     （多个值之前是||的关系）
EXC – 不包含； （多个值之前是&&的关系）
EQS – 等于；     （多个值之前是||的关系）
NEQ – 不等于；（多个值之前是&&的关系）

RA – 范围；
    */
    @SerializedName("Compare")
    @Expose
    private String Compare;

    /**
    * 过滤条件匹配值。当Compare=RG时，例：["1-100","200-300"]
    */
    @SerializedName("Value")
    @Expose
    private String [] Value;

    /**
     * Get 过滤条件名称。

如：sql - SQL命令详情

host – 客户端 IP；
user – 数据库账户；
dbName – 数据库名称；
sqlType - SQL类型；
errCode - 错误码

execTime - 执行时间
lockWaitTime - 锁等待时间
ioWaitTime - IO等待时间
trxLivingTime - 事务执行时间
cpuTime- Cpu时间

threadId - 线程ID
trxId - 事务ID
checkRows - 扫描行数
affectRows - 影响行数
sentRows - 返回行数 
     * @return Type 过滤条件名称。

如：sql - SQL命令详情

host – 客户端 IP；
user – 数据库账户；
dbName – 数据库名称；
sqlType - SQL类型；
errCode - 错误码

execTime - 执行时间
lockWaitTime - 锁等待时间
ioWaitTime - IO等待时间
trxLivingTime - 事务执行时间
cpuTime- Cpu时间

threadId - 线程ID
trxId - 事务ID
checkRows - 扫描行数
affectRows - 影响行数
sentRows - 返回行数
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 过滤条件名称。

如：sql - SQL命令详情

host – 客户端 IP；
user – 数据库账户；
dbName – 数据库名称；
sqlType - SQL类型；
errCode - 错误码

execTime - 执行时间
lockWaitTime - 锁等待时间
ioWaitTime - IO等待时间
trxLivingTime - 事务执行时间
cpuTime- Cpu时间

threadId - 线程ID
trxId - 事务ID
checkRows - 扫描行数
affectRows - 影响行数
sentRows - 返回行数
     * @param Type 过滤条件名称。

如：sql - SQL命令详情

host – 客户端 IP；
user – 数据库账户；
dbName – 数据库名称；
sqlType - SQL类型；
errCode - 错误码

execTime - 执行时间
lockWaitTime - 锁等待时间
ioWaitTime - IO等待时间
trxLivingTime - 事务执行时间
cpuTime- Cpu时间

threadId - 线程ID
trxId - 事务ID
checkRows - 扫描行数
affectRows - 影响行数
sentRows - 返回行数
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 过滤条件匹配类型。支持：
INC – 包含；     （多个值之前是||的关系）
EXC – 不包含； （多个值之前是&&的关系）
EQS – 等于；     （多个值之前是||的关系）
NEQ – 不等于；（多个值之前是&&的关系）

RA – 范围； 
     * @return Compare 过滤条件匹配类型。支持：
INC – 包含；     （多个值之前是||的关系）
EXC – 不包含； （多个值之前是&&的关系）
EQS – 等于；     （多个值之前是||的关系）
NEQ – 不等于；（多个值之前是&&的关系）

RA – 范围；
     */
    public String getCompare() {
        return this.Compare;
    }

    /**
     * Set 过滤条件匹配类型。支持：
INC – 包含；     （多个值之前是||的关系）
EXC – 不包含； （多个值之前是&&的关系）
EQS – 等于；     （多个值之前是||的关系）
NEQ – 不等于；（多个值之前是&&的关系）

RA – 范围；
     * @param Compare 过滤条件匹配类型。支持：
INC – 包含；     （多个值之前是||的关系）
EXC – 不包含； （多个值之前是&&的关系）
EQS – 等于；     （多个值之前是||的关系）
NEQ – 不等于；（多个值之前是&&的关系）

RA – 范围；
     */
    public void setCompare(String Compare) {
        this.Compare = Compare;
    }

    /**
     * Get 过滤条件匹配值。当Compare=RG时，例：["1-100","200-300"] 
     * @return Value 过滤条件匹配值。当Compare=RG时，例：["1-100","200-300"]
     */
    public String [] getValue() {
        return this.Value;
    }

    /**
     * Set 过滤条件匹配值。当Compare=RG时，例：["1-100","200-300"]
     * @param Value 过滤条件匹配值。当Compare=RG时，例：["1-100","200-300"]
     */
    public void setValue(String [] Value) {
        this.Value = Value;
    }

    public LogFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogFilter(LogFilter source) {
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

