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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenPolicyInfo extends AbstractModel {

    /**
    * 策略分类：cluster集群策略、node节点策略、namespace命名空间策略、configuration配置相关策略、compute计算资源策略、storage存储资源策略、network网络资源策略
    */
    @SerializedName("PolicyCategory")
    @Expose
    private String PolicyCategory;

    /**
    * 策略中文名称
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 策略描述
    */
    @SerializedName("PolicyDesc")
    @Expose
    private String PolicyDesc;

    /**
    * 策略运行模式：dryrun空跑不生效，deny拦截生效
    */
    @SerializedName("EnforcementAction")
    @Expose
    private String EnforcementAction;

    /**
    * 关联的事件数量(最近7d)
    */
    @SerializedName("EventNums")
    @Expose
    private Long EventNums;

    /**
    * 策略英文名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 策略模板类型
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * 策略开关状态：open打开，close关闭
    */
    @SerializedName("EnabledStatus")
    @Expose
    private String EnabledStatus;

    /**
    * 策略的实例的yaml示例base64编码
    */
    @SerializedName("ConstraintYamlExample")
    @Expose
    private String ConstraintYamlExample;

    /**
    * 策略关联的实例列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OpenConstraintInfoList")
    @Expose
    private OpenConstraintInfo [] OpenConstraintInfoList;

    /**
     * Get 策略分类：cluster集群策略、node节点策略、namespace命名空间策略、configuration配置相关策略、compute计算资源策略、storage存储资源策略、network网络资源策略 
     * @return PolicyCategory 策略分类：cluster集群策略、node节点策略、namespace命名空间策略、configuration配置相关策略、compute计算资源策略、storage存储资源策略、network网络资源策略
     */
    public String getPolicyCategory() {
        return this.PolicyCategory;
    }

    /**
     * Set 策略分类：cluster集群策略、node节点策略、namespace命名空间策略、configuration配置相关策略、compute计算资源策略、storage存储资源策略、network网络资源策略
     * @param PolicyCategory 策略分类：cluster集群策略、node节点策略、namespace命名空间策略、configuration配置相关策略、compute计算资源策略、storage存储资源策略、network网络资源策略
     */
    public void setPolicyCategory(String PolicyCategory) {
        this.PolicyCategory = PolicyCategory;
    }

    /**
     * Get 策略中文名称 
     * @return PolicyName 策略中文名称
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 策略中文名称
     * @param PolicyName 策略中文名称
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 策略描述 
     * @return PolicyDesc 策略描述
     */
    public String getPolicyDesc() {
        return this.PolicyDesc;
    }

    /**
     * Set 策略描述
     * @param PolicyDesc 策略描述
     */
    public void setPolicyDesc(String PolicyDesc) {
        this.PolicyDesc = PolicyDesc;
    }

    /**
     * Get 策略运行模式：dryrun空跑不生效，deny拦截生效 
     * @return EnforcementAction 策略运行模式：dryrun空跑不生效，deny拦截生效
     */
    public String getEnforcementAction() {
        return this.EnforcementAction;
    }

    /**
     * Set 策略运行模式：dryrun空跑不生效，deny拦截生效
     * @param EnforcementAction 策略运行模式：dryrun空跑不生效，deny拦截生效
     */
    public void setEnforcementAction(String EnforcementAction) {
        this.EnforcementAction = EnforcementAction;
    }

    /**
     * Get 关联的事件数量(最近7d) 
     * @return EventNums 关联的事件数量(最近7d)
     */
    public Long getEventNums() {
        return this.EventNums;
    }

    /**
     * Set 关联的事件数量(最近7d)
     * @param EventNums 关联的事件数量(最近7d)
     */
    public void setEventNums(Long EventNums) {
        this.EventNums = EventNums;
    }

    /**
     * Get 策略英文名称 
     * @return Name 策略英文名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 策略英文名称
     * @param Name 策略英文名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 策略模板类型 
     * @return Kind 策略模板类型
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set 策略模板类型
     * @param Kind 策略模板类型
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get 策略开关状态：open打开，close关闭 
     * @return EnabledStatus 策略开关状态：open打开，close关闭
     */
    public String getEnabledStatus() {
        return this.EnabledStatus;
    }

    /**
     * Set 策略开关状态：open打开，close关闭
     * @param EnabledStatus 策略开关状态：open打开，close关闭
     */
    public void setEnabledStatus(String EnabledStatus) {
        this.EnabledStatus = EnabledStatus;
    }

    /**
     * Get 策略的实例的yaml示例base64编码 
     * @return ConstraintYamlExample 策略的实例的yaml示例base64编码
     */
    public String getConstraintYamlExample() {
        return this.ConstraintYamlExample;
    }

    /**
     * Set 策略的实例的yaml示例base64编码
     * @param ConstraintYamlExample 策略的实例的yaml示例base64编码
     */
    public void setConstraintYamlExample(String ConstraintYamlExample) {
        this.ConstraintYamlExample = ConstraintYamlExample;
    }

    /**
     * Get 策略关联的实例列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OpenConstraintInfoList 策略关联的实例列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OpenConstraintInfo [] getOpenConstraintInfoList() {
        return this.OpenConstraintInfoList;
    }

    /**
     * Set 策略关联的实例列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param OpenConstraintInfoList 策略关联的实例列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOpenConstraintInfoList(OpenConstraintInfo [] OpenConstraintInfoList) {
        this.OpenConstraintInfoList = OpenConstraintInfoList;
    }

    public OpenPolicyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenPolicyInfo(OpenPolicyInfo source) {
        if (source.PolicyCategory != null) {
            this.PolicyCategory = new String(source.PolicyCategory);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.PolicyDesc != null) {
            this.PolicyDesc = new String(source.PolicyDesc);
        }
        if (source.EnforcementAction != null) {
            this.EnforcementAction = new String(source.EnforcementAction);
        }
        if (source.EventNums != null) {
            this.EventNums = new Long(source.EventNums);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.EnabledStatus != null) {
            this.EnabledStatus = new String(source.EnabledStatus);
        }
        if (source.ConstraintYamlExample != null) {
            this.ConstraintYamlExample = new String(source.ConstraintYamlExample);
        }
        if (source.OpenConstraintInfoList != null) {
            this.OpenConstraintInfoList = new OpenConstraintInfo[source.OpenConstraintInfoList.length];
            for (int i = 0; i < source.OpenConstraintInfoList.length; i++) {
                this.OpenConstraintInfoList[i] = new OpenConstraintInfo(source.OpenConstraintInfoList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyCategory", this.PolicyCategory);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "PolicyDesc", this.PolicyDesc);
        this.setParamSimple(map, prefix + "EnforcementAction", this.EnforcementAction);
        this.setParamSimple(map, prefix + "EventNums", this.EventNums);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "EnabledStatus", this.EnabledStatus);
        this.setParamSimple(map, prefix + "ConstraintYamlExample", this.ConstraintYamlExample);
        this.setParamArrayObj(map, prefix + "OpenConstraintInfoList.", this.OpenConstraintInfoList);

    }
}

