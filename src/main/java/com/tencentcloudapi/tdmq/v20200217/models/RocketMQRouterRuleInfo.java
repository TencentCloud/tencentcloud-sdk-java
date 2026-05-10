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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RocketMQRouterRuleInfo extends AbstractModel {

    /**
    * <p>源类型。<br>OPEN_SOURCE_ROCKETMQ：开源rocketmq<br>ALI_ROCKETMQ：阿里云rocketmq<br>TENCENT_ROCKETMQ：腾讯云rocketmq<br>TENCENT_MQTT：腾讯云MQTT<br>ALI_MNS：阿里云mns</p>
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * <p>目标类型。<br>枚举和SourceType字段一样</p>
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * <p>规则备注，创建后任务后可以修改</p>
    */
    @SerializedName("RemarkName")
    @Expose
    private String RemarkName;

    /**
    * <p>阿里云rocketmq源信息</p>
    */
    @SerializedName("AliRocketMQSource")
    @Expose
    private RouterRocketMQSource AliRocketMQSource;

    /**
    * <p>阿里云rocketmq目标信息</p>
    */
    @SerializedName("AliRocketMQTarget")
    @Expose
    private RouterRocketMQTarget AliRocketMQTarget;

    /**
    * <p>阿里云mns源信息</p>
    */
    @SerializedName("AliMessageServiceSource")
    @Expose
    private RouterMessageServiceSource AliMessageServiceSource;

    /**
    * <p>阿里云mns目标信息</p>
    */
    @SerializedName("AliMessageServiceTarget")
    @Expose
    private RouterMessageServiceTarget AliMessageServiceTarget;

    /**
    * <p>腾讯云rocketmq源信息</p>
    */
    @SerializedName("TenRocketMQSource")
    @Expose
    private RouterTencentRocketMQSource TenRocketMQSource;

    /**
    * <p>腾讯云rocketmq目标信息</p>
    */
    @SerializedName("TenRocketMQTarget")
    @Expose
    private RouterTencentRocketMQTarget TenRocketMQTarget;

    /**
    * <p>任务别名</p>
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * <p>腾讯云 MQTT 源集群信息</p>
    */
    @SerializedName("TenMQTTSource")
    @Expose
    private RouterTencentMQTTSource TenMQTTSource;

    /**
    * <p>腾讯云 MQTT 目标集群信息</p>
    */
    @SerializedName("TenMQTTTarget")
    @Expose
    private RouterTencentMQTTTarget TenMQTTTarget;

    /**
     * Get <p>源类型。<br>OPEN_SOURCE_ROCKETMQ：开源rocketmq<br>ALI_ROCKETMQ：阿里云rocketmq<br>TENCENT_ROCKETMQ：腾讯云rocketmq<br>TENCENT_MQTT：腾讯云MQTT<br>ALI_MNS：阿里云mns</p> 
     * @return SourceType <p>源类型。<br>OPEN_SOURCE_ROCKETMQ：开源rocketmq<br>ALI_ROCKETMQ：阿里云rocketmq<br>TENCENT_ROCKETMQ：腾讯云rocketmq<br>TENCENT_MQTT：腾讯云MQTT<br>ALI_MNS：阿里云mns</p>
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>源类型。<br>OPEN_SOURCE_ROCKETMQ：开源rocketmq<br>ALI_ROCKETMQ：阿里云rocketmq<br>TENCENT_ROCKETMQ：腾讯云rocketmq<br>TENCENT_MQTT：腾讯云MQTT<br>ALI_MNS：阿里云mns</p>
     * @param SourceType <p>源类型。<br>OPEN_SOURCE_ROCKETMQ：开源rocketmq<br>ALI_ROCKETMQ：阿里云rocketmq<br>TENCENT_ROCKETMQ：腾讯云rocketmq<br>TENCENT_MQTT：腾讯云MQTT<br>ALI_MNS：阿里云mns</p>
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get <p>目标类型。<br>枚举和SourceType字段一样</p> 
     * @return TargetType <p>目标类型。<br>枚举和SourceType字段一样</p>
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set <p>目标类型。<br>枚举和SourceType字段一样</p>
     * @param TargetType <p>目标类型。<br>枚举和SourceType字段一样</p>
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get <p>规则备注，创建后任务后可以修改</p> 
     * @return RemarkName <p>规则备注，创建后任务后可以修改</p>
     */
    public String getRemarkName() {
        return this.RemarkName;
    }

    /**
     * Set <p>规则备注，创建后任务后可以修改</p>
     * @param RemarkName <p>规则备注，创建后任务后可以修改</p>
     */
    public void setRemarkName(String RemarkName) {
        this.RemarkName = RemarkName;
    }

    /**
     * Get <p>阿里云rocketmq源信息</p> 
     * @return AliRocketMQSource <p>阿里云rocketmq源信息</p>
     */
    public RouterRocketMQSource getAliRocketMQSource() {
        return this.AliRocketMQSource;
    }

    /**
     * Set <p>阿里云rocketmq源信息</p>
     * @param AliRocketMQSource <p>阿里云rocketmq源信息</p>
     */
    public void setAliRocketMQSource(RouterRocketMQSource AliRocketMQSource) {
        this.AliRocketMQSource = AliRocketMQSource;
    }

    /**
     * Get <p>阿里云rocketmq目标信息</p> 
     * @return AliRocketMQTarget <p>阿里云rocketmq目标信息</p>
     */
    public RouterRocketMQTarget getAliRocketMQTarget() {
        return this.AliRocketMQTarget;
    }

    /**
     * Set <p>阿里云rocketmq目标信息</p>
     * @param AliRocketMQTarget <p>阿里云rocketmq目标信息</p>
     */
    public void setAliRocketMQTarget(RouterRocketMQTarget AliRocketMQTarget) {
        this.AliRocketMQTarget = AliRocketMQTarget;
    }

    /**
     * Get <p>阿里云mns源信息</p> 
     * @return AliMessageServiceSource <p>阿里云mns源信息</p>
     */
    public RouterMessageServiceSource getAliMessageServiceSource() {
        return this.AliMessageServiceSource;
    }

    /**
     * Set <p>阿里云mns源信息</p>
     * @param AliMessageServiceSource <p>阿里云mns源信息</p>
     */
    public void setAliMessageServiceSource(RouterMessageServiceSource AliMessageServiceSource) {
        this.AliMessageServiceSource = AliMessageServiceSource;
    }

    /**
     * Get <p>阿里云mns目标信息</p> 
     * @return AliMessageServiceTarget <p>阿里云mns目标信息</p>
     */
    public RouterMessageServiceTarget getAliMessageServiceTarget() {
        return this.AliMessageServiceTarget;
    }

    /**
     * Set <p>阿里云mns目标信息</p>
     * @param AliMessageServiceTarget <p>阿里云mns目标信息</p>
     */
    public void setAliMessageServiceTarget(RouterMessageServiceTarget AliMessageServiceTarget) {
        this.AliMessageServiceTarget = AliMessageServiceTarget;
    }

    /**
     * Get <p>腾讯云rocketmq源信息</p> 
     * @return TenRocketMQSource <p>腾讯云rocketmq源信息</p>
     */
    public RouterTencentRocketMQSource getTenRocketMQSource() {
        return this.TenRocketMQSource;
    }

    /**
     * Set <p>腾讯云rocketmq源信息</p>
     * @param TenRocketMQSource <p>腾讯云rocketmq源信息</p>
     */
    public void setTenRocketMQSource(RouterTencentRocketMQSource TenRocketMQSource) {
        this.TenRocketMQSource = TenRocketMQSource;
    }

    /**
     * Get <p>腾讯云rocketmq目标信息</p> 
     * @return TenRocketMQTarget <p>腾讯云rocketmq目标信息</p>
     */
    public RouterTencentRocketMQTarget getTenRocketMQTarget() {
        return this.TenRocketMQTarget;
    }

    /**
     * Set <p>腾讯云rocketmq目标信息</p>
     * @param TenRocketMQTarget <p>腾讯云rocketmq目标信息</p>
     */
    public void setTenRocketMQTarget(RouterTencentRocketMQTarget TenRocketMQTarget) {
        this.TenRocketMQTarget = TenRocketMQTarget;
    }

    /**
     * Get <p>任务别名</p> 
     * @return AliasName <p>任务别名</p>
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set <p>任务别名</p>
     * @param AliasName <p>任务别名</p>
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    /**
     * Get <p>腾讯云 MQTT 源集群信息</p> 
     * @return TenMQTTSource <p>腾讯云 MQTT 源集群信息</p>
     */
    public RouterTencentMQTTSource getTenMQTTSource() {
        return this.TenMQTTSource;
    }

    /**
     * Set <p>腾讯云 MQTT 源集群信息</p>
     * @param TenMQTTSource <p>腾讯云 MQTT 源集群信息</p>
     */
    public void setTenMQTTSource(RouterTencentMQTTSource TenMQTTSource) {
        this.TenMQTTSource = TenMQTTSource;
    }

    /**
     * Get <p>腾讯云 MQTT 目标集群信息</p> 
     * @return TenMQTTTarget <p>腾讯云 MQTT 目标集群信息</p>
     */
    public RouterTencentMQTTTarget getTenMQTTTarget() {
        return this.TenMQTTTarget;
    }

    /**
     * Set <p>腾讯云 MQTT 目标集群信息</p>
     * @param TenMQTTTarget <p>腾讯云 MQTT 目标集群信息</p>
     */
    public void setTenMQTTTarget(RouterTencentMQTTTarget TenMQTTTarget) {
        this.TenMQTTTarget = TenMQTTTarget;
    }

    public RocketMQRouterRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RocketMQRouterRuleInfo(RocketMQRouterRuleInfo source) {
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.RemarkName != null) {
            this.RemarkName = new String(source.RemarkName);
        }
        if (source.AliRocketMQSource != null) {
            this.AliRocketMQSource = new RouterRocketMQSource(source.AliRocketMQSource);
        }
        if (source.AliRocketMQTarget != null) {
            this.AliRocketMQTarget = new RouterRocketMQTarget(source.AliRocketMQTarget);
        }
        if (source.AliMessageServiceSource != null) {
            this.AliMessageServiceSource = new RouterMessageServiceSource(source.AliMessageServiceSource);
        }
        if (source.AliMessageServiceTarget != null) {
            this.AliMessageServiceTarget = new RouterMessageServiceTarget(source.AliMessageServiceTarget);
        }
        if (source.TenRocketMQSource != null) {
            this.TenRocketMQSource = new RouterTencentRocketMQSource(source.TenRocketMQSource);
        }
        if (source.TenRocketMQTarget != null) {
            this.TenRocketMQTarget = new RouterTencentRocketMQTarget(source.TenRocketMQTarget);
        }
        if (source.AliasName != null) {
            this.AliasName = new String(source.AliasName);
        }
        if (source.TenMQTTSource != null) {
            this.TenMQTTSource = new RouterTencentMQTTSource(source.TenMQTTSource);
        }
        if (source.TenMQTTTarget != null) {
            this.TenMQTTTarget = new RouterTencentMQTTTarget(source.TenMQTTTarget);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "RemarkName", this.RemarkName);
        this.setParamObj(map, prefix + "AliRocketMQSource.", this.AliRocketMQSource);
        this.setParamObj(map, prefix + "AliRocketMQTarget.", this.AliRocketMQTarget);
        this.setParamObj(map, prefix + "AliMessageServiceSource.", this.AliMessageServiceSource);
        this.setParamObj(map, prefix + "AliMessageServiceTarget.", this.AliMessageServiceTarget);
        this.setParamObj(map, prefix + "TenRocketMQSource.", this.TenRocketMQSource);
        this.setParamObj(map, prefix + "TenRocketMQTarget.", this.TenRocketMQTarget);
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);
        this.setParamObj(map, prefix + "TenMQTTSource.", this.TenMQTTSource);
        this.setParamObj(map, prefix + "TenMQTTTarget.", this.TenMQTTTarget);

    }
}

