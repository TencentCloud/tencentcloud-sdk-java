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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeadlockFrame extends AbstractModel {

    /**
    * <p>帧对应的行号（存储过程内的行号）。</p>
    */
    @SerializedName("Line")
    @Expose
    private Long Line;

    /**
    * <p>语句在存储过程文本内的起始字节偏移。</p>
    */
    @SerializedName("StatementStart")
    @Expose
    private Long StatementStart;

    /**
    * <p>存储过程名。adhoc 表示动态 SQL、非存过。</p>
    */
    @SerializedName("ProcName")
    @Expose
    private String ProcName;

    /**
    * <p>SQL 句柄（0x 十六进制字节），用于拉取具体语句文本和关联执行计划。</p>
    */
    @SerializedName("SqlHandle")
    @Expose
    private String SqlHandle;

    /**
    * <p>语句在存储过程文本内的结束字节偏移。StatementStart/StatementEnd 组合用于精确切片。</p>
    */
    @SerializedName("StatementEnd")
    @Expose
    private Long StatementEnd;

    /**
     * Get <p>帧对应的行号（存储过程内的行号）。</p> 
     * @return Line <p>帧对应的行号（存储过程内的行号）。</p>
     */
    public Long getLine() {
        return this.Line;
    }

    /**
     * Set <p>帧对应的行号（存储过程内的行号）。</p>
     * @param Line <p>帧对应的行号（存储过程内的行号）。</p>
     */
    public void setLine(Long Line) {
        this.Line = Line;
    }

    /**
     * Get <p>语句在存储过程文本内的起始字节偏移。</p> 
     * @return StatementStart <p>语句在存储过程文本内的起始字节偏移。</p>
     */
    public Long getStatementStart() {
        return this.StatementStart;
    }

    /**
     * Set <p>语句在存储过程文本内的起始字节偏移。</p>
     * @param StatementStart <p>语句在存储过程文本内的起始字节偏移。</p>
     */
    public void setStatementStart(Long StatementStart) {
        this.StatementStart = StatementStart;
    }

    /**
     * Get <p>存储过程名。adhoc 表示动态 SQL、非存过。</p> 
     * @return ProcName <p>存储过程名。adhoc 表示动态 SQL、非存过。</p>
     */
    public String getProcName() {
        return this.ProcName;
    }

    /**
     * Set <p>存储过程名。adhoc 表示动态 SQL、非存过。</p>
     * @param ProcName <p>存储过程名。adhoc 表示动态 SQL、非存过。</p>
     */
    public void setProcName(String ProcName) {
        this.ProcName = ProcName;
    }

    /**
     * Get <p>SQL 句柄（0x 十六进制字节），用于拉取具体语句文本和关联执行计划。</p> 
     * @return SqlHandle <p>SQL 句柄（0x 十六进制字节），用于拉取具体语句文本和关联执行计划。</p>
     */
    public String getSqlHandle() {
        return this.SqlHandle;
    }

    /**
     * Set <p>SQL 句柄（0x 十六进制字节），用于拉取具体语句文本和关联执行计划。</p>
     * @param SqlHandle <p>SQL 句柄（0x 十六进制字节），用于拉取具体语句文本和关联执行计划。</p>
     */
    public void setSqlHandle(String SqlHandle) {
        this.SqlHandle = SqlHandle;
    }

    /**
     * Get <p>语句在存储过程文本内的结束字节偏移。StatementStart/StatementEnd 组合用于精确切片。</p> 
     * @return StatementEnd <p>语句在存储过程文本内的结束字节偏移。StatementStart/StatementEnd 组合用于精确切片。</p>
     */
    public Long getStatementEnd() {
        return this.StatementEnd;
    }

    /**
     * Set <p>语句在存储过程文本内的结束字节偏移。StatementStart/StatementEnd 组合用于精确切片。</p>
     * @param StatementEnd <p>语句在存储过程文本内的结束字节偏移。StatementStart/StatementEnd 组合用于精确切片。</p>
     */
    public void setStatementEnd(Long StatementEnd) {
        this.StatementEnd = StatementEnd;
    }

    public DeadlockFrame() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeadlockFrame(DeadlockFrame source) {
        if (source.Line != null) {
            this.Line = new Long(source.Line);
        }
        if (source.StatementStart != null) {
            this.StatementStart = new Long(source.StatementStart);
        }
        if (source.ProcName != null) {
            this.ProcName = new String(source.ProcName);
        }
        if (source.SqlHandle != null) {
            this.SqlHandle = new String(source.SqlHandle);
        }
        if (source.StatementEnd != null) {
            this.StatementEnd = new Long(source.StatementEnd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Line", this.Line);
        this.setParamSimple(map, prefix + "StatementStart", this.StatementStart);
        this.setParamSimple(map, prefix + "ProcName", this.ProcName);
        this.setParamSimple(map, prefix + "SqlHandle", this.SqlHandle);
        this.setParamSimple(map, prefix + "StatementEnd", this.StatementEnd);

    }
}

