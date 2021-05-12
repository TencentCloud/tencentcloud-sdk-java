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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeClusterInstancesRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * create 表示开始一次升级任务
pause 表示停止任务
resume表示继续任务
abort表示终止任务
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 升级类型，只有Operation是create需要设置
reset 大版本重装升级
hot 小版本热升级
major 大版本原地升级
    */
    @SerializedName("UpgradeType")
    @Expose
    private String UpgradeType;

    /**
    * 需要升级的节点列表
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 当节点重新加入集群时候所使用的参数，参考添加已有节点接口
    */
    @SerializedName("ResetParam")
    @Expose
    private UpgradeNodeResetParam ResetParam;

    /**
    * 是否忽略节点升级前检查
    */
    @SerializedName("SkipPreCheck")
    @Expose
    private Boolean SkipPreCheck;

    /**
    * 最大可容忍的不可用Pod比例
    */
    @SerializedName("MaxNotReadyPercent")
    @Expose
    private Float MaxNotReadyPercent;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get create 表示开始一次升级任务
pause 表示停止任务
resume表示继续任务
abort表示终止任务 
     * @return Operation create 表示开始一次升级任务
pause 表示停止任务
resume表示继续任务
abort表示终止任务
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set create 表示开始一次升级任务
pause 表示停止任务
resume表示继续任务
abort表示终止任务
     * @param Operation create 表示开始一次升级任务
pause 表示停止任务
resume表示继续任务
abort表示终止任务
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 升级类型，只有Operation是create需要设置
reset 大版本重装升级
hot 小版本热升级
major 大版本原地升级 
     * @return UpgradeType 升级类型，只有Operation是create需要设置
reset 大版本重装升级
hot 小版本热升级
major 大版本原地升级
     */
    public String getUpgradeType() {
        return this.UpgradeType;
    }

    /**
     * Set 升级类型，只有Operation是create需要设置
reset 大版本重装升级
hot 小版本热升级
major 大版本原地升级
     * @param UpgradeType 升级类型，只有Operation是create需要设置
reset 大版本重装升级
hot 小版本热升级
major 大版本原地升级
     */
    public void setUpgradeType(String UpgradeType) {
        this.UpgradeType = UpgradeType;
    }

    /**
     * Get 需要升级的节点列表 
     * @return InstanceIds 需要升级的节点列表
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 需要升级的节点列表
     * @param InstanceIds 需要升级的节点列表
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 当节点重新加入集群时候所使用的参数，参考添加已有节点接口 
     * @return ResetParam 当节点重新加入集群时候所使用的参数，参考添加已有节点接口
     */
    public UpgradeNodeResetParam getResetParam() {
        return this.ResetParam;
    }

    /**
     * Set 当节点重新加入集群时候所使用的参数，参考添加已有节点接口
     * @param ResetParam 当节点重新加入集群时候所使用的参数，参考添加已有节点接口
     */
    public void setResetParam(UpgradeNodeResetParam ResetParam) {
        this.ResetParam = ResetParam;
    }

    /**
     * Get 是否忽略节点升级前检查 
     * @return SkipPreCheck 是否忽略节点升级前检查
     */
    public Boolean getSkipPreCheck() {
        return this.SkipPreCheck;
    }

    /**
     * Set 是否忽略节点升级前检查
     * @param SkipPreCheck 是否忽略节点升级前检查
     */
    public void setSkipPreCheck(Boolean SkipPreCheck) {
        this.SkipPreCheck = SkipPreCheck;
    }

    /**
     * Get 最大可容忍的不可用Pod比例 
     * @return MaxNotReadyPercent 最大可容忍的不可用Pod比例
     */
    public Float getMaxNotReadyPercent() {
        return this.MaxNotReadyPercent;
    }

    /**
     * Set 最大可容忍的不可用Pod比例
     * @param MaxNotReadyPercent 最大可容忍的不可用Pod比例
     */
    public void setMaxNotReadyPercent(Float MaxNotReadyPercent) {
        this.MaxNotReadyPercent = MaxNotReadyPercent;
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

    }
}

