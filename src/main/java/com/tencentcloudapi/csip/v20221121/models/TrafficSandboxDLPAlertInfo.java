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

public class TrafficSandboxDLPAlertInfo extends AbstractModel {

    /**
    * <p>告警记录 ID</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>归属资产类型<br>枚举值：<br>HOST：主机<br>CONTAINER：容器</p>
    */
    @SerializedName("BelongAssetType")
    @Expose
    private String BelongAssetType;

    /**
    * <p>命中的用户规则 ID</p>
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * <p>命中的用户规则名称</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>Agent UUID</p>
    */
    @SerializedName("UUID")
    @Expose
    private String UUID;

    /**
    * <p>实例 ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>集群 ID<br>入参限制：仅容器告警返回</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>容器 ID<br>入参限制：仅容器告警返回</p>
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * <p>容器名称<br>入参限制：仅容器告警返回</p>
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * <p>进程 exe 路径</p>
    */
    @SerializedName("Exe")
    @Expose
    private String Exe;

    /**
    * <p>进程命令行参数</p>
    */
    @SerializedName("Param")
    @Expose
    private String Param;

    /**
    * <p>目标地址</p>
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * <p>匹配范围<br>枚举值：<br>req_head：请求头<br>req_body：请求体<br>rsp_head：响应头<br>rsp_body：响应体</p>
    */
    @SerializedName("MatchScope")
    @Expose
    private String MatchScope;

    /**
    * <p>agent 上报的 match_content 完整内容<br>入参限制：最长 256 字节；前一半字符已脱敏打码</p>
    */
    @SerializedName("MatchContent")
    @Expose
    private String MatchContent;

    /**
    * <p>真正触发规则的匹配片段<br>入参限制：前一半字符已脱敏打码；规则缺失/未命中时退化为与 MatchContent 相同</p>
    */
    @SerializedName("MatchContentSample")
    @Expose
    private String MatchContentSample;

    /**
    * <p>上传协议</p>
    */
    @SerializedName("UpProto")
    @Expose
    private String UpProto;

    /**
    * <p>文件名称</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>文件类型</p>
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * <p>文件大小</p><p>单位：Byte</p>
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * <p>告警级别<br>枚举值：<br>INFO：提示<br>LOW：低危<br>MEDIUM：中危<br>HIGH：高危<br>CRITICAL：严重</p>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * <p>处理状态<br>枚举值：<br>PENDING：未处理<br>HANDLED：已处理<br>IGNORE：已忽略<br>PASS：已加白<br>BLOCK：已拦截</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>告警次数</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * <p>首次告警时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
    */
    @SerializedName("FirstAlertTime")
    @Expose
    private String FirstAlertTime;

    /**
    * <p>最后告警时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
    */
    @SerializedName("LastAlertTime")
    @Expose
    private String LastAlertTime;

    /**
    * <p>命中动作<br>枚举值：<br>PASS：加白<br>BLOCK：拦截并告警<br>MONITOR：告警</p>
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
     * Get <p>告警记录 ID</p> 
     * @return ID <p>告警记录 ID</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>告警记录 ID</p>
     * @param ID <p>告警记录 ID</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>归属资产类型<br>枚举值：<br>HOST：主机<br>CONTAINER：容器</p> 
     * @return BelongAssetType <p>归属资产类型<br>枚举值：<br>HOST：主机<br>CONTAINER：容器</p>
     */
    public String getBelongAssetType() {
        return this.BelongAssetType;
    }

    /**
     * Set <p>归属资产类型<br>枚举值：<br>HOST：主机<br>CONTAINER：容器</p>
     * @param BelongAssetType <p>归属资产类型<br>枚举值：<br>HOST：主机<br>CONTAINER：容器</p>
     */
    public void setBelongAssetType(String BelongAssetType) {
        this.BelongAssetType = BelongAssetType;
    }

    /**
     * Get <p>命中的用户规则 ID</p> 
     * @return RuleID <p>命中的用户规则 ID</p>
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set <p>命中的用户规则 ID</p>
     * @param RuleID <p>命中的用户规则 ID</p>
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get <p>命中的用户规则名称</p> 
     * @return RuleName <p>命中的用户规则名称</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>命中的用户规则名称</p>
     * @param RuleName <p>命中的用户规则名称</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>Agent UUID</p> 
     * @return UUID <p>Agent UUID</p>
     */
    public String getUUID() {
        return this.UUID;
    }

    /**
     * Set <p>Agent UUID</p>
     * @param UUID <p>Agent UUID</p>
     */
    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    /**
     * Get <p>实例 ID</p> 
     * @return InstanceId <p>实例 ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID</p>
     * @param InstanceId <p>实例 ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例名称</p> 
     * @return InstanceName <p>实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
     * @param InstanceName <p>实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>集群 ID<br>入参限制：仅容器告警返回</p> 
     * @return ClusterId <p>集群 ID<br>入参限制：仅容器告警返回</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群 ID<br>入参限制：仅容器告警返回</p>
     * @param ClusterId <p>集群 ID<br>入参限制：仅容器告警返回</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>容器 ID<br>入参限制：仅容器告警返回</p> 
     * @return ContainerId <p>容器 ID<br>入参限制：仅容器告警返回</p>
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set <p>容器 ID<br>入参限制：仅容器告警返回</p>
     * @param ContainerId <p>容器 ID<br>入参限制：仅容器告警返回</p>
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get <p>容器名称<br>入参限制：仅容器告警返回</p> 
     * @return ContainerName <p>容器名称<br>入参限制：仅容器告警返回</p>
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set <p>容器名称<br>入参限制：仅容器告警返回</p>
     * @param ContainerName <p>容器名称<br>入参限制：仅容器告警返回</p>
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get <p>进程 exe 路径</p> 
     * @return Exe <p>进程 exe 路径</p>
     */
    public String getExe() {
        return this.Exe;
    }

    /**
     * Set <p>进程 exe 路径</p>
     * @param Exe <p>进程 exe 路径</p>
     */
    public void setExe(String Exe) {
        this.Exe = Exe;
    }

    /**
     * Get <p>进程命令行参数</p> 
     * @return Param <p>进程命令行参数</p>
     */
    public String getParam() {
        return this.Param;
    }

    /**
     * Set <p>进程命令行参数</p>
     * @param Param <p>进程命令行参数</p>
     */
    public void setParam(String Param) {
        this.Param = Param;
    }

    /**
     * Get <p>目标地址</p> 
     * @return Target <p>目标地址</p>
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set <p>目标地址</p>
     * @param Target <p>目标地址</p>
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get <p>匹配范围<br>枚举值：<br>req_head：请求头<br>req_body：请求体<br>rsp_head：响应头<br>rsp_body：响应体</p> 
     * @return MatchScope <p>匹配范围<br>枚举值：<br>req_head：请求头<br>req_body：请求体<br>rsp_head：响应头<br>rsp_body：响应体</p>
     */
    public String getMatchScope() {
        return this.MatchScope;
    }

    /**
     * Set <p>匹配范围<br>枚举值：<br>req_head：请求头<br>req_body：请求体<br>rsp_head：响应头<br>rsp_body：响应体</p>
     * @param MatchScope <p>匹配范围<br>枚举值：<br>req_head：请求头<br>req_body：请求体<br>rsp_head：响应头<br>rsp_body：响应体</p>
     */
    public void setMatchScope(String MatchScope) {
        this.MatchScope = MatchScope;
    }

    /**
     * Get <p>agent 上报的 match_content 完整内容<br>入参限制：最长 256 字节；前一半字符已脱敏打码</p> 
     * @return MatchContent <p>agent 上报的 match_content 完整内容<br>入参限制：最长 256 字节；前一半字符已脱敏打码</p>
     */
    public String getMatchContent() {
        return this.MatchContent;
    }

    /**
     * Set <p>agent 上报的 match_content 完整内容<br>入参限制：最长 256 字节；前一半字符已脱敏打码</p>
     * @param MatchContent <p>agent 上报的 match_content 完整内容<br>入参限制：最长 256 字节；前一半字符已脱敏打码</p>
     */
    public void setMatchContent(String MatchContent) {
        this.MatchContent = MatchContent;
    }

    /**
     * Get <p>真正触发规则的匹配片段<br>入参限制：前一半字符已脱敏打码；规则缺失/未命中时退化为与 MatchContent 相同</p> 
     * @return MatchContentSample <p>真正触发规则的匹配片段<br>入参限制：前一半字符已脱敏打码；规则缺失/未命中时退化为与 MatchContent 相同</p>
     */
    public String getMatchContentSample() {
        return this.MatchContentSample;
    }

    /**
     * Set <p>真正触发规则的匹配片段<br>入参限制：前一半字符已脱敏打码；规则缺失/未命中时退化为与 MatchContent 相同</p>
     * @param MatchContentSample <p>真正触发规则的匹配片段<br>入参限制：前一半字符已脱敏打码；规则缺失/未命中时退化为与 MatchContent 相同</p>
     */
    public void setMatchContentSample(String MatchContentSample) {
        this.MatchContentSample = MatchContentSample;
    }

    /**
     * Get <p>上传协议</p> 
     * @return UpProto <p>上传协议</p>
     */
    public String getUpProto() {
        return this.UpProto;
    }

    /**
     * Set <p>上传协议</p>
     * @param UpProto <p>上传协议</p>
     */
    public void setUpProto(String UpProto) {
        this.UpProto = UpProto;
    }

    /**
     * Get <p>文件名称</p> 
     * @return FileName <p>文件名称</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>文件名称</p>
     * @param FileName <p>文件名称</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>文件类型</p> 
     * @return FileType <p>文件类型</p>
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set <p>文件类型</p>
     * @param FileType <p>文件类型</p>
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get <p>文件大小</p><p>单位：Byte</p> 
     * @return FileSize <p>文件大小</p><p>单位：Byte</p>
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set <p>文件大小</p><p>单位：Byte</p>
     * @param FileSize <p>文件大小</p><p>单位：Byte</p>
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get <p>告警级别<br>枚举值：<br>INFO：提示<br>LOW：低危<br>MEDIUM：中危<br>HIGH：高危<br>CRITICAL：严重</p> 
     * @return Level <p>告警级别<br>枚举值：<br>INFO：提示<br>LOW：低危<br>MEDIUM：中危<br>HIGH：高危<br>CRITICAL：严重</p>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set <p>告警级别<br>枚举值：<br>INFO：提示<br>LOW：低危<br>MEDIUM：中危<br>HIGH：高危<br>CRITICAL：严重</p>
     * @param Level <p>告警级别<br>枚举值：<br>INFO：提示<br>LOW：低危<br>MEDIUM：中危<br>HIGH：高危<br>CRITICAL：严重</p>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get <p>处理状态<br>枚举值：<br>PENDING：未处理<br>HANDLED：已处理<br>IGNORE：已忽略<br>PASS：已加白<br>BLOCK：已拦截</p> 
     * @return Status <p>处理状态<br>枚举值：<br>PENDING：未处理<br>HANDLED：已处理<br>IGNORE：已忽略<br>PASS：已加白<br>BLOCK：已拦截</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>处理状态<br>枚举值：<br>PENDING：未处理<br>HANDLED：已处理<br>IGNORE：已忽略<br>PASS：已加白<br>BLOCK：已拦截</p>
     * @param Status <p>处理状态<br>枚举值：<br>PENDING：未处理<br>HANDLED：已处理<br>IGNORE：已忽略<br>PASS：已加白<br>BLOCK：已拦截</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>告警次数</p> 
     * @return Count <p>告警次数</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>告警次数</p>
     * @param Count <p>告警次数</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get <p>首次告警时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p> 
     * @return FirstAlertTime <p>首次告警时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
     */
    public String getFirstAlertTime() {
        return this.FirstAlertTime;
    }

    /**
     * Set <p>首次告警时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
     * @param FirstAlertTime <p>首次告警时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
     */
    public void setFirstAlertTime(String FirstAlertTime) {
        this.FirstAlertTime = FirstAlertTime;
    }

    /**
     * Get <p>最后告警时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p> 
     * @return LastAlertTime <p>最后告警时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
     */
    public String getLastAlertTime() {
        return this.LastAlertTime;
    }

    /**
     * Set <p>最后告警时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
     * @param LastAlertTime <p>最后告警时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
     */
    public void setLastAlertTime(String LastAlertTime) {
        this.LastAlertTime = LastAlertTime;
    }

    /**
     * Get <p>命中动作<br>枚举值：<br>PASS：加白<br>BLOCK：拦截并告警<br>MONITOR：告警</p> 
     * @return RuleAction <p>命中动作<br>枚举值：<br>PASS：加白<br>BLOCK：拦截并告警<br>MONITOR：告警</p>
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set <p>命中动作<br>枚举值：<br>PASS：加白<br>BLOCK：拦截并告警<br>MONITOR：告警</p>
     * @param RuleAction <p>命中动作<br>枚举值：<br>PASS：加白<br>BLOCK：拦截并告警<br>MONITOR：告警</p>
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    public TrafficSandboxDLPAlertInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficSandboxDLPAlertInfo(TrafficSandboxDLPAlertInfo source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.BelongAssetType != null) {
            this.BelongAssetType = new String(source.BelongAssetType);
        }
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.UUID != null) {
            this.UUID = new String(source.UUID);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.Exe != null) {
            this.Exe = new String(source.Exe);
        }
        if (source.Param != null) {
            this.Param = new String(source.Param);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.MatchScope != null) {
            this.MatchScope = new String(source.MatchScope);
        }
        if (source.MatchContent != null) {
            this.MatchContent = new String(source.MatchContent);
        }
        if (source.MatchContentSample != null) {
            this.MatchContentSample = new String(source.MatchContentSample);
        }
        if (source.UpProto != null) {
            this.UpProto = new String(source.UpProto);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.FirstAlertTime != null) {
            this.FirstAlertTime = new String(source.FirstAlertTime);
        }
        if (source.LastAlertTime != null) {
            this.LastAlertTime = new String(source.LastAlertTime);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "BelongAssetType", this.BelongAssetType);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "UUID", this.UUID);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "Exe", this.Exe);
        this.setParamSimple(map, prefix + "Param", this.Param);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "MatchScope", this.MatchScope);
        this.setParamSimple(map, prefix + "MatchContent", this.MatchContent);
        this.setParamSimple(map, prefix + "MatchContentSample", this.MatchContentSample);
        this.setParamSimple(map, prefix + "UpProto", this.UpProto);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "FirstAlertTime", this.FirstAlertTime);
        this.setParamSimple(map, prefix + "LastAlertTime", this.LastAlertTime);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);

    }
}

