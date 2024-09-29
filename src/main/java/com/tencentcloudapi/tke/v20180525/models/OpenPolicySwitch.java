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

public class OpenPolicySwitch extends AbstractModel {

    /**
    * 策略运行模式：dryrun空跑不生效，deny拦截生效
    */
    @SerializedName("EnforcementAction")
    @Expose
    private String EnforcementAction;

    /**
    * 策略英文名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 策略模版类型
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
    * 策略关联的实例列表
    */
    @SerializedName("OpenConstraintInfoList")
    @Expose
    private OpenConstraintInfo [] OpenConstraintInfoList;

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
     * Get 策略模版类型 
     * @return Kind 策略模版类型
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set 策略模版类型
     * @param Kind 策略模版类型
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
     * Get 策略关联的实例列表 
     * @return OpenConstraintInfoList 策略关联的实例列表
     */
    public OpenConstraintInfo [] getOpenConstraintInfoList() {
        return this.OpenConstraintInfoList;
    }

    /**
     * Set 策略关联的实例列表
     * @param OpenConstraintInfoList 策略关联的实例列表
     */
    public void setOpenConstraintInfoList(OpenConstraintInfo [] OpenConstraintInfoList) {
        this.OpenConstraintInfoList = OpenConstraintInfoList;
    }

    public OpenPolicySwitch() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenPolicySwitch(OpenPolicySwitch source) {
        if (source.EnforcementAction != null) {
            this.EnforcementAction = new String(source.EnforcementAction);
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
        this.setParamSimple(map, prefix + "EnforcementAction", this.EnforcementAction);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "EnabledStatus", this.EnabledStatus);
        this.setParamArrayObj(map, prefix + "OpenConstraintInfoList.", this.OpenConstraintInfoList);

    }
}

