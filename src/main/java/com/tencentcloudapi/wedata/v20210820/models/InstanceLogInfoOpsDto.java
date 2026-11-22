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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceLogInfoOpsDto extends AbstractModel {

    /**
    * <p>实例运行日志</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogInfo")
    @Expose
    private String LogInfo;

    /**
    * <p>实例运行提交的yarn日志地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("YarnLogInfo")
    @Expose
    private String [] YarnLogInfo;

    /**
    * <p>实例运行产生的datax日志</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataLogInfo")
    @Expose
    private String DataLogInfo;

    /**
    * <p>第三方任务运行日志</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ThirdTaskRunLogInfo")
    @Expose
    private String ThirdTaskRunLogInfo;

    /**
    * <p>第三方任务日志链接描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ThirdTaskLogUrlDesc")
    @Expose
    private String ThirdTaskLogUrlDesc;

    /**
    * <p>日志行数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LineCount")
    @Expose
    private Long LineCount;

    /**
    * <p>统一执行平台日志分页查询参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
    * <p>日志分页查询，是否最后一页</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsEnd")
    @Expose
    private Boolean IsEnd;

    /**
    * <p>文件大小</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileSize")
    @Expose
    private String FileSize;

    /**
    * <p>日志匹配节点信息</p>
    */
    @SerializedName("MatchedBrokerIp")
    @Expose
    private String MatchedBrokerIp;

    /**
    * <p>执行平台通用协议</p>
    */
    @SerializedName("ExecutionExtendedProps")
    @Expose
    private PairDto [] ExecutionExtendedProps;

    /**
    * <p>日志诊断规则</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogDiagnosisRules")
    @Expose
    private LogDiagnosisRules LogDiagnosisRules;

    /**
     * Get <p>实例运行日志</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogInfo <p>实例运行日志</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogInfo() {
        return this.LogInfo;
    }

    /**
     * Set <p>实例运行日志</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogInfo <p>实例运行日志</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogInfo(String LogInfo) {
        this.LogInfo = LogInfo;
    }

    /**
     * Get <p>实例运行提交的yarn日志地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return YarnLogInfo <p>实例运行提交的yarn日志地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getYarnLogInfo() {
        return this.YarnLogInfo;
    }

    /**
     * Set <p>实例运行提交的yarn日志地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param YarnLogInfo <p>实例运行提交的yarn日志地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setYarnLogInfo(String [] YarnLogInfo) {
        this.YarnLogInfo = YarnLogInfo;
    }

    /**
     * Get <p>实例运行产生的datax日志</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataLogInfo <p>实例运行产生的datax日志</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataLogInfo() {
        return this.DataLogInfo;
    }

    /**
     * Set <p>实例运行产生的datax日志</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataLogInfo <p>实例运行产生的datax日志</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataLogInfo(String DataLogInfo) {
        this.DataLogInfo = DataLogInfo;
    }

    /**
     * Get <p>第三方任务运行日志</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ThirdTaskRunLogInfo <p>第三方任务运行日志</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getThirdTaskRunLogInfo() {
        return this.ThirdTaskRunLogInfo;
    }

    /**
     * Set <p>第三方任务运行日志</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ThirdTaskRunLogInfo <p>第三方任务运行日志</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThirdTaskRunLogInfo(String ThirdTaskRunLogInfo) {
        this.ThirdTaskRunLogInfo = ThirdTaskRunLogInfo;
    }

    /**
     * Get <p>第三方任务日志链接描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ThirdTaskLogUrlDesc <p>第三方任务日志链接描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getThirdTaskLogUrlDesc() {
        return this.ThirdTaskLogUrlDesc;
    }

    /**
     * Set <p>第三方任务日志链接描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ThirdTaskLogUrlDesc <p>第三方任务日志链接描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThirdTaskLogUrlDesc(String ThirdTaskLogUrlDesc) {
        this.ThirdTaskLogUrlDesc = ThirdTaskLogUrlDesc;
    }

    /**
     * Get <p>日志行数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LineCount <p>日志行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLineCount() {
        return this.LineCount;
    }

    /**
     * Set <p>日志行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LineCount <p>日志行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLineCount(Long LineCount) {
        this.LineCount = LineCount;
    }

    /**
     * Get <p>统一执行平台日志分页查询参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtInfo <p>统一执行平台日志分页查询参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set <p>统一执行平台日志分页查询参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtInfo <p>统一执行平台日志分页查询参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    /**
     * Get <p>日志分页查询，是否最后一页</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsEnd <p>日志分页查询，是否最后一页</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsEnd() {
        return this.IsEnd;
    }

    /**
     * Set <p>日志分页查询，是否最后一页</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsEnd <p>日志分页查询，是否最后一页</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsEnd(Boolean IsEnd) {
        this.IsEnd = IsEnd;
    }

    /**
     * Get <p>文件大小</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileSize <p>文件大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileSize() {
        return this.FileSize;
    }

    /**
     * Set <p>文件大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileSize <p>文件大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileSize(String FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get <p>日志匹配节点信息</p> 
     * @return MatchedBrokerIp <p>日志匹配节点信息</p>
     */
    public String getMatchedBrokerIp() {
        return this.MatchedBrokerIp;
    }

    /**
     * Set <p>日志匹配节点信息</p>
     * @param MatchedBrokerIp <p>日志匹配节点信息</p>
     */
    public void setMatchedBrokerIp(String MatchedBrokerIp) {
        this.MatchedBrokerIp = MatchedBrokerIp;
    }

    /**
     * Get <p>执行平台通用协议</p> 
     * @return ExecutionExtendedProps <p>执行平台通用协议</p>
     */
    public PairDto [] getExecutionExtendedProps() {
        return this.ExecutionExtendedProps;
    }

    /**
     * Set <p>执行平台通用协议</p>
     * @param ExecutionExtendedProps <p>执行平台通用协议</p>
     */
    public void setExecutionExtendedProps(PairDto [] ExecutionExtendedProps) {
        this.ExecutionExtendedProps = ExecutionExtendedProps;
    }

    /**
     * Get <p>日志诊断规则</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogDiagnosisRules <p>日志诊断规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public LogDiagnosisRules getLogDiagnosisRules() {
        return this.LogDiagnosisRules;
    }

    /**
     * Set <p>日志诊断规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogDiagnosisRules <p>日志诊断规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setLogDiagnosisRules(LogDiagnosisRules LogDiagnosisRules) {
        this.LogDiagnosisRules = LogDiagnosisRules;
    }

    public InstanceLogInfoOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceLogInfoOpsDto(InstanceLogInfoOpsDto source) {
        if (source.LogInfo != null) {
            this.LogInfo = new String(source.LogInfo);
        }
        if (source.YarnLogInfo != null) {
            this.YarnLogInfo = new String[source.YarnLogInfo.length];
            for (int i = 0; i < source.YarnLogInfo.length; i++) {
                this.YarnLogInfo[i] = new String(source.YarnLogInfo[i]);
            }
        }
        if (source.DataLogInfo != null) {
            this.DataLogInfo = new String(source.DataLogInfo);
        }
        if (source.ThirdTaskRunLogInfo != null) {
            this.ThirdTaskRunLogInfo = new String(source.ThirdTaskRunLogInfo);
        }
        if (source.ThirdTaskLogUrlDesc != null) {
            this.ThirdTaskLogUrlDesc = new String(source.ThirdTaskLogUrlDesc);
        }
        if (source.LineCount != null) {
            this.LineCount = new Long(source.LineCount);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
        if (source.IsEnd != null) {
            this.IsEnd = new Boolean(source.IsEnd);
        }
        if (source.FileSize != null) {
            this.FileSize = new String(source.FileSize);
        }
        if (source.MatchedBrokerIp != null) {
            this.MatchedBrokerIp = new String(source.MatchedBrokerIp);
        }
        if (source.ExecutionExtendedProps != null) {
            this.ExecutionExtendedProps = new PairDto[source.ExecutionExtendedProps.length];
            for (int i = 0; i < source.ExecutionExtendedProps.length; i++) {
                this.ExecutionExtendedProps[i] = new PairDto(source.ExecutionExtendedProps[i]);
            }
        }
        if (source.LogDiagnosisRules != null) {
            this.LogDiagnosisRules = new LogDiagnosisRules(source.LogDiagnosisRules);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogInfo", this.LogInfo);
        this.setParamArraySimple(map, prefix + "YarnLogInfo.", this.YarnLogInfo);
        this.setParamSimple(map, prefix + "DataLogInfo", this.DataLogInfo);
        this.setParamSimple(map, prefix + "ThirdTaskRunLogInfo", this.ThirdTaskRunLogInfo);
        this.setParamSimple(map, prefix + "ThirdTaskLogUrlDesc", this.ThirdTaskLogUrlDesc);
        this.setParamSimple(map, prefix + "LineCount", this.LineCount);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);
        this.setParamSimple(map, prefix + "IsEnd", this.IsEnd);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "MatchedBrokerIp", this.MatchedBrokerIp);
        this.setParamArrayObj(map, prefix + "ExecutionExtendedProps.", this.ExecutionExtendedProps);
        this.setParamObj(map, prefix + "LogDiagnosisRules.", this.LogDiagnosisRules);

    }
}

