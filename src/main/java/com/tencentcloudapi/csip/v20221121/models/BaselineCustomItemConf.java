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

public class BaselineCustomItemConf extends AbstractModel {

    /**
    * <p>内置检测项规则 ID，与 CustomItemID 二选一传入。</p>
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * <p>用户自定义的判定值列表，需符合检测项 WebEditParam 定义的取值约束。</p>
    */
    @SerializedName("CustomValueList")
    @Expose
    private String [] CustomValueList;

    /**
    * <p>已存在的自定义配置 ID；新增时可不传，编辑时回填。</p>
    */
    @SerializedName("CustomItemID")
    @Expose
    private Long CustomItemID;

    /**
     * Get <p>内置检测项规则 ID，与 CustomItemID 二选一传入。</p> 
     * @return RuleID <p>内置检测项规则 ID，与 CustomItemID 二选一传入。</p>
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set <p>内置检测项规则 ID，与 CustomItemID 二选一传入。</p>
     * @param RuleID <p>内置检测项规则 ID，与 CustomItemID 二选一传入。</p>
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get <p>用户自定义的判定值列表，需符合检测项 WebEditParam 定义的取值约束。</p> 
     * @return CustomValueList <p>用户自定义的判定值列表，需符合检测项 WebEditParam 定义的取值约束。</p>
     */
    public String [] getCustomValueList() {
        return this.CustomValueList;
    }

    /**
     * Set <p>用户自定义的判定值列表，需符合检测项 WebEditParam 定义的取值约束。</p>
     * @param CustomValueList <p>用户自定义的判定值列表，需符合检测项 WebEditParam 定义的取值约束。</p>
     */
    public void setCustomValueList(String [] CustomValueList) {
        this.CustomValueList = CustomValueList;
    }

    /**
     * Get <p>已存在的自定义配置 ID；新增时可不传，编辑时回填。</p> 
     * @return CustomItemID <p>已存在的自定义配置 ID；新增时可不传，编辑时回填。</p>
     */
    public Long getCustomItemID() {
        return this.CustomItemID;
    }

    /**
     * Set <p>已存在的自定义配置 ID；新增时可不传，编辑时回填。</p>
     * @param CustomItemID <p>已存在的自定义配置 ID；新增时可不传，编辑时回填。</p>
     */
    public void setCustomItemID(Long CustomItemID) {
        this.CustomItemID = CustomItemID;
    }

    public BaselineCustomItemConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineCustomItemConf(BaselineCustomItemConf source) {
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.CustomValueList != null) {
            this.CustomValueList = new String[source.CustomValueList.length];
            for (int i = 0; i < source.CustomValueList.length; i++) {
                this.CustomValueList[i] = new String(source.CustomValueList[i]);
            }
        }
        if (source.CustomItemID != null) {
            this.CustomItemID = new Long(source.CustomItemID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamArraySimple(map, prefix + "CustomValueList.", this.CustomValueList);
        this.setParamSimple(map, prefix + "CustomItemID", this.CustomItemID);

    }
}

