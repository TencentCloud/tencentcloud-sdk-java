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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiffDetailItem extends AbstractModel {

    /**
    * 属性
    */
    @SerializedName("Attribute")
    @Expose
    private String Attribute;

    /**
    * 当前生效
    */
    @SerializedName("InEffect")
    @Expose
    private String InEffect;

    /**
    * 待生效
    */
    @SerializedName("PendingEffectiveness")
    @Expose
    private String PendingEffectiveness;

    /**
    * 操作
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 队列
    */
    @SerializedName("Queue")
    @Expose
    private String Queue;

    /**
    * 配置集
    */
    @SerializedName("ConfigSet")
    @Expose
    private String ConfigSet;

    /**
    * 标签
    */
    @SerializedName("LabelName")
    @Expose
    private String LabelName;

    /**
    * 当前所在位置
    */
    @SerializedName("InEffectIndex")
    @Expose
    private String InEffectIndex;

    /**
    * 待生效的位置
    */
    @SerializedName("PendingEffectIndex")
    @Expose
    private String PendingEffectIndex;

    /**
    * 计划模式名称
    */
    @SerializedName("PlanName")
    @Expose
    private String PlanName;

    /**
    * 标签
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 放置规则
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
     * Get 属性 
     * @return Attribute 属性
     */
    public String getAttribute() {
        return this.Attribute;
    }

    /**
     * Set 属性
     * @param Attribute 属性
     */
    public void setAttribute(String Attribute) {
        this.Attribute = Attribute;
    }

    /**
     * Get 当前生效 
     * @return InEffect 当前生效
     */
    public String getInEffect() {
        return this.InEffect;
    }

    /**
     * Set 当前生效
     * @param InEffect 当前生效
     */
    public void setInEffect(String InEffect) {
        this.InEffect = InEffect;
    }

    /**
     * Get 待生效 
     * @return PendingEffectiveness 待生效
     */
    public String getPendingEffectiveness() {
        return this.PendingEffectiveness;
    }

    /**
     * Set 待生效
     * @param PendingEffectiveness 待生效
     */
    public void setPendingEffectiveness(String PendingEffectiveness) {
        this.PendingEffectiveness = PendingEffectiveness;
    }

    /**
     * Get 操作 
     * @return Operation 操作
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作
     * @param Operation 操作
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 队列 
     * @return Queue 队列
     */
    public String getQueue() {
        return this.Queue;
    }

    /**
     * Set 队列
     * @param Queue 队列
     */
    public void setQueue(String Queue) {
        this.Queue = Queue;
    }

    /**
     * Get 配置集 
     * @return ConfigSet 配置集
     */
    public String getConfigSet() {
        return this.ConfigSet;
    }

    /**
     * Set 配置集
     * @param ConfigSet 配置集
     */
    public void setConfigSet(String ConfigSet) {
        this.ConfigSet = ConfigSet;
    }

    /**
     * Get 标签 
     * @return LabelName 标签
     */
    public String getLabelName() {
        return this.LabelName;
    }

    /**
     * Set 标签
     * @param LabelName 标签
     */
    public void setLabelName(String LabelName) {
        this.LabelName = LabelName;
    }

    /**
     * Get 当前所在位置 
     * @return InEffectIndex 当前所在位置
     */
    public String getInEffectIndex() {
        return this.InEffectIndex;
    }

    /**
     * Set 当前所在位置
     * @param InEffectIndex 当前所在位置
     */
    public void setInEffectIndex(String InEffectIndex) {
        this.InEffectIndex = InEffectIndex;
    }

    /**
     * Get 待生效的位置 
     * @return PendingEffectIndex 待生效的位置
     */
    public String getPendingEffectIndex() {
        return this.PendingEffectIndex;
    }

    /**
     * Set 待生效的位置
     * @param PendingEffectIndex 待生效的位置
     */
    public void setPendingEffectIndex(String PendingEffectIndex) {
        this.PendingEffectIndex = PendingEffectIndex;
    }

    /**
     * Get 计划模式名称 
     * @return PlanName 计划模式名称
     */
    public String getPlanName() {
        return this.PlanName;
    }

    /**
     * Set 计划模式名称
     * @param PlanName 计划模式名称
     */
    public void setPlanName(String PlanName) {
        this.PlanName = PlanName;
    }

    /**
     * Get 标签 
     * @return Label 标签
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 标签
     * @param Label 标签
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 放置规则 
     * @return RuleName 放置规则
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 放置规则
     * @param RuleName 放置规则
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 用户名 
     * @return UserName 用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名
     * @param UserName 用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public DiffDetailItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiffDetailItem(DiffDetailItem source) {
        if (source.Attribute != null) {
            this.Attribute = new String(source.Attribute);
        }
        if (source.InEffect != null) {
            this.InEffect = new String(source.InEffect);
        }
        if (source.PendingEffectiveness != null) {
            this.PendingEffectiveness = new String(source.PendingEffectiveness);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.Queue != null) {
            this.Queue = new String(source.Queue);
        }
        if (source.ConfigSet != null) {
            this.ConfigSet = new String(source.ConfigSet);
        }
        if (source.LabelName != null) {
            this.LabelName = new String(source.LabelName);
        }
        if (source.InEffectIndex != null) {
            this.InEffectIndex = new String(source.InEffectIndex);
        }
        if (source.PendingEffectIndex != null) {
            this.PendingEffectIndex = new String(source.PendingEffectIndex);
        }
        if (source.PlanName != null) {
            this.PlanName = new String(source.PlanName);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Attribute", this.Attribute);
        this.setParamSimple(map, prefix + "InEffect", this.InEffect);
        this.setParamSimple(map, prefix + "PendingEffectiveness", this.PendingEffectiveness);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "Queue", this.Queue);
        this.setParamSimple(map, prefix + "ConfigSet", this.ConfigSet);
        this.setParamSimple(map, prefix + "LabelName", this.LabelName);
        this.setParamSimple(map, prefix + "InEffectIndex", this.InEffectIndex);
        this.setParamSimple(map, prefix + "PendingEffectIndex", this.PendingEffectIndex);
        this.setParamSimple(map, prefix + "PlanName", this.PlanName);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "UserName", this.UserName);

    }
}

