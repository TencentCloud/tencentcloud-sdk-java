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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeClusterInstancesRequest extends AbstractModel {

    /**
    * <p>集群ID（请登录 <a href="https://console.cloud.tencent.com/tke2">TKE 控制台</a> 获取集群 ID ）</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>create 表示开始一次升级任务<br>pause 表示停止任务<br>resume表示继续任务<br>abort表示终止任务</p>
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * <p>升级类型，只有Operation是create需要设置<br>reset 大版本重装升级<br>hot 小版本热升级<br>major 大版本原地升级</p>
    */
    @SerializedName("UpgradeType")
    @Expose
    private String UpgradeType;

    /**
    * <p>需要升级的节点列表，可以通过控制台或 <a href="https://cloud.tencent.com/document/api/457/50366">查询待升级节点接口</a> 获取</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>当节点重新加入集群时候所使用的参数，参考添加已有节点接口</p>
    */
    @SerializedName("ResetParam")
    @Expose
    private UpgradeNodeResetParam ResetParam;

    /**
    * <p>是否忽略节点升级前检查，默认值 false</p>
    */
    @SerializedName("SkipPreCheck")
    @Expose
    private Boolean SkipPreCheck;

    /**
    * <p>最大可容忍的不可用Pod百分比，如果设置 0 表示不做校验</p><p>取值范围：[0, 100]</p><p>默认值：20</p>
    */
    @SerializedName("MaxNotReadyPercent")
    @Expose
    private Float MaxNotReadyPercent;

    /**
    * <p>是否升级节点运行时，默认false不升级</p>
    */
    @SerializedName("UpgradeRunTime")
    @Expose
    private Boolean UpgradeRunTime;

    /**
    * <p>支持多个节点并行升级，默认值为 1，最大并行数为15</p>
    */
    @SerializedName("Concurrent")
    @Expose
    private Long Concurrent;

    /**
     * Get <p>集群ID（请登录 <a href="https://console.cloud.tencent.com/tke2">TKE 控制台</a> 获取集群 ID ）</p> 
     * @return ClusterId <p>集群ID（请登录 <a href="https://console.cloud.tencent.com/tke2">TKE 控制台</a> 获取集群 ID ）</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID（请登录 <a href="https://console.cloud.tencent.com/tke2">TKE 控制台</a> 获取集群 ID ）</p>
     * @param ClusterId <p>集群ID（请登录 <a href="https://console.cloud.tencent.com/tke2">TKE 控制台</a> 获取集群 ID ）</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>create 表示开始一次升级任务<br>pause 表示停止任务<br>resume表示继续任务<br>abort表示终止任务</p> 
     * @return Operation <p>create 表示开始一次升级任务<br>pause 表示停止任务<br>resume表示继续任务<br>abort表示终止任务</p>
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set <p>create 表示开始一次升级任务<br>pause 表示停止任务<br>resume表示继续任务<br>abort表示终止任务</p>
     * @param Operation <p>create 表示开始一次升级任务<br>pause 表示停止任务<br>resume表示继续任务<br>abort表示终止任务</p>
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get <p>升级类型，只有Operation是create需要设置<br>reset 大版本重装升级<br>hot 小版本热升级<br>major 大版本原地升级</p> 
     * @return UpgradeType <p>升级类型，只有Operation是create需要设置<br>reset 大版本重装升级<br>hot 小版本热升级<br>major 大版本原地升级</p>
     */
    public String getUpgradeType() {
        return this.UpgradeType;
    }

    /**
     * Set <p>升级类型，只有Operation是create需要设置<br>reset 大版本重装升级<br>hot 小版本热升级<br>major 大版本原地升级</p>
     * @param UpgradeType <p>升级类型，只有Operation是create需要设置<br>reset 大版本重装升级<br>hot 小版本热升级<br>major 大版本原地升级</p>
     */
    public void setUpgradeType(String UpgradeType) {
        this.UpgradeType = UpgradeType;
    }

    /**
     * Get <p>需要升级的节点列表，可以通过控制台或 <a href="https://cloud.tencent.com/document/api/457/50366">查询待升级节点接口</a> 获取</p> 
     * @return InstanceIds <p>需要升级的节点列表，可以通过控制台或 <a href="https://cloud.tencent.com/document/api/457/50366">查询待升级节点接口</a> 获取</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>需要升级的节点列表，可以通过控制台或 <a href="https://cloud.tencent.com/document/api/457/50366">查询待升级节点接口</a> 获取</p>
     * @param InstanceIds <p>需要升级的节点列表，可以通过控制台或 <a href="https://cloud.tencent.com/document/api/457/50366">查询待升级节点接口</a> 获取</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>当节点重新加入集群时候所使用的参数，参考添加已有节点接口</p> 
     * @return ResetParam <p>当节点重新加入集群时候所使用的参数，参考添加已有节点接口</p>
     */
    public UpgradeNodeResetParam getResetParam() {
        return this.ResetParam;
    }

    /**
     * Set <p>当节点重新加入集群时候所使用的参数，参考添加已有节点接口</p>
     * @param ResetParam <p>当节点重新加入集群时候所使用的参数，参考添加已有节点接口</p>
     */
    public void setResetParam(UpgradeNodeResetParam ResetParam) {
        this.ResetParam = ResetParam;
    }

    /**
     * Get <p>是否忽略节点升级前检查，默认值 false</p> 
     * @return SkipPreCheck <p>是否忽略节点升级前检查，默认值 false</p>
     */
    public Boolean getSkipPreCheck() {
        return this.SkipPreCheck;
    }

    /**
     * Set <p>是否忽略节点升级前检查，默认值 false</p>
     * @param SkipPreCheck <p>是否忽略节点升级前检查，默认值 false</p>
     */
    public void setSkipPreCheck(Boolean SkipPreCheck) {
        this.SkipPreCheck = SkipPreCheck;
    }

    /**
     * Get <p>最大可容忍的不可用Pod百分比，如果设置 0 表示不做校验</p><p>取值范围：[0, 100]</p><p>默认值：20</p> 
     * @return MaxNotReadyPercent <p>最大可容忍的不可用Pod百分比，如果设置 0 表示不做校验</p><p>取值范围：[0, 100]</p><p>默认值：20</p>
     */
    public Float getMaxNotReadyPercent() {
        return this.MaxNotReadyPercent;
    }

    /**
     * Set <p>最大可容忍的不可用Pod百分比，如果设置 0 表示不做校验</p><p>取值范围：[0, 100]</p><p>默认值：20</p>
     * @param MaxNotReadyPercent <p>最大可容忍的不可用Pod百分比，如果设置 0 表示不做校验</p><p>取值范围：[0, 100]</p><p>默认值：20</p>
     */
    public void setMaxNotReadyPercent(Float MaxNotReadyPercent) {
        this.MaxNotReadyPercent = MaxNotReadyPercent;
    }

    /**
     * Get <p>是否升级节点运行时，默认false不升级</p> 
     * @return UpgradeRunTime <p>是否升级节点运行时，默认false不升级</p>
     */
    public Boolean getUpgradeRunTime() {
        return this.UpgradeRunTime;
    }

    /**
     * Set <p>是否升级节点运行时，默认false不升级</p>
     * @param UpgradeRunTime <p>是否升级节点运行时，默认false不升级</p>
     */
    public void setUpgradeRunTime(Boolean UpgradeRunTime) {
        this.UpgradeRunTime = UpgradeRunTime;
    }

    /**
     * Get <p>支持多个节点并行升级，默认值为 1，最大并行数为15</p> 
     * @return Concurrent <p>支持多个节点并行升级，默认值为 1，最大并行数为15</p>
     */
    public Long getConcurrent() {
        return this.Concurrent;
    }

    /**
     * Set <p>支持多个节点并行升级，默认值为 1，最大并行数为15</p>
     * @param Concurrent <p>支持多个节点并行升级，默认值为 1，最大并行数为15</p>
     */
    public void setConcurrent(Long Concurrent) {
        this.Concurrent = Concurrent;
    }

    public UpgradeClusterInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeClusterInstancesRequest(UpgradeClusterInstancesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.UpgradeType != null) {
            this.UpgradeType = new String(source.UpgradeType);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.ResetParam != null) {
            this.ResetParam = new UpgradeNodeResetParam(source.ResetParam);
        }
        if (source.SkipPreCheck != null) {
            this.SkipPreCheck = new Boolean(source.SkipPreCheck);
        }
        if (source.MaxNotReadyPercent != null) {
            this.MaxNotReadyPercent = new Float(source.MaxNotReadyPercent);
        }
        if (source.UpgradeRunTime != null) {
            this.UpgradeRunTime = new Boolean(source.UpgradeRunTime);
        }
        if (source.Concurrent != null) {
            this.Concurrent = new Long(source.Concurrent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "UpgradeType", this.UpgradeType);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamObj(map, prefix + "ResetParam.", this.ResetParam);
        this.setParamSimple(map, prefix + "SkipPreCheck", this.SkipPreCheck);
        this.setParamSimple(map, prefix + "MaxNotReadyPercent", this.MaxNotReadyPercent);
        this.setParamSimple(map, prefix + "UpgradeRunTime", this.UpgradeRunTime);
        this.setParamSimple(map, prefix + "Concurrent", this.Concurrent);

    }
}

