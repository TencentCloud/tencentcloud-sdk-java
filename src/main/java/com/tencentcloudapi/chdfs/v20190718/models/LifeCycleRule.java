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
package com.tencentcloudapi.chdfs.v20190718.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LifeCycleRule extends AbstractModel{

    /**
    * 生命周期规则ID
    */
    @SerializedName("LifeCycleRuleId")
    @Expose
    private Long LifeCycleRuleId;

    /**
    * 生命周期规则名称
    */
    @SerializedName("LifeCycleRuleName")
    @Expose
    private String LifeCycleRuleName;

    /**
    * 生命周期规则路径（目录或文件）
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 生命周期规则转换列表
    */
    @SerializedName("Transitions")
    @Expose
    private Transition [] Transitions;

    /**
    * 生命周期规则状态（1：打开；2：关闭）
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 生命周期规则ID 
     * @return LifeCycleRuleId 生命周期规则ID
     */
    public Long getLifeCycleRuleId() {
        return this.LifeCycleRuleId;
    }

    /**
     * Set 生命周期规则ID
     * @param LifeCycleRuleId 生命周期规则ID
     */
    public void setLifeCycleRuleId(Long LifeCycleRuleId) {
        this.LifeCycleRuleId = LifeCycleRuleId;
    }

    /**
     * Get 生命周期规则名称 
     * @return LifeCycleRuleName 生命周期规则名称
     */
    public String getLifeCycleRuleName() {
        return this.LifeCycleRuleName;
    }

    /**
     * Set 生命周期规则名称
     * @param LifeCycleRuleName 生命周期规则名称
     */
    public void setLifeCycleRuleName(String LifeCycleRuleName) {
        this.LifeCycleRuleName = LifeCycleRuleName;
    }

    /**
     * Get 生命周期规则路径（目录或文件） 
     * @return Path 生命周期规则路径（目录或文件）
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 生命周期规则路径（目录或文件）
     * @param Path 生命周期规则路径（目录或文件）
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 生命周期规则转换列表 
     * @return Transitions 生命周期规则转换列表
     */
    public Transition [] getTransitions() {
        return this.Transitions;
    }

    /**
     * Set 生命周期规则转换列表
     * @param Transitions 生命周期规则转换列表
     */
    public void setTransitions(Transition [] Transitions) {
        this.Transitions = Transitions;
    }

    /**
     * Get 生命周期规则状态（1：打开；2：关闭） 
     * @return Status 生命周期规则状态（1：打开；2：关闭）
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 生命周期规则状态（1：打开；2：关闭）
     * @param Status 生命周期规则状态（1：打开；2：关闭）
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public LifeCycleRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LifeCycleRule(LifeCycleRule source) {
        if (source.LifeCycleRuleId != null) {
            this.LifeCycleRuleId = new Long(source.LifeCycleRuleId);
        }
        if (source.LifeCycleRuleName != null) {
            this.LifeCycleRuleName = new String(source.LifeCycleRuleName);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Transitions != null) {
            this.Transitions = new Transition[source.Transitions.length];
            for (int i = 0; i < source.Transitions.length; i++) {
                this.Transitions[i] = new Transition(source.Transitions[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LifeCycleRuleId", this.LifeCycleRuleId);
        this.setParamSimple(map, prefix + "LifeCycleRuleName", this.LifeCycleRuleName);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamArrayObj(map, prefix + "Transitions.", this.Transitions);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

