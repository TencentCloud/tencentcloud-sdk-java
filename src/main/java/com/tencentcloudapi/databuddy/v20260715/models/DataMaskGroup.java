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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataMaskGroup extends AbstractModel {

    /**
    * 工作组 ID，对应 WeData 用户组 ID，必填，字符串类型。示例值："17738042827013749"
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 脱敏方法（策略类型），必填，直接透传给 DLC。合法值：MASK_SHOW_FIRST_4（保留前四个字符）、MASK_SHOW_LAST_4（保留后四个字符）、MASK_HASH（哈希脱敏）、MASK_DATE_SHOW_YEAR（日期脱敏保留年份）、MASK_NULL（置为 NULL）、MASK_DEFAULT（默认值脱敏）
    */
    @SerializedName("StrategyType")
    @Expose
    private String StrategyType;

    /**
    * 用户组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
     * Get 工作组 ID，对应 WeData 用户组 ID，必填，字符串类型。示例值："17738042827013749" 
     * @return GroupId 工作组 ID，对应 WeData 用户组 ID，必填，字符串类型。示例值："17738042827013749"
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 工作组 ID，对应 WeData 用户组 ID，必填，字符串类型。示例值："17738042827013749"
     * @param GroupId 工作组 ID，对应 WeData 用户组 ID，必填，字符串类型。示例值："17738042827013749"
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 脱敏方法（策略类型），必填，直接透传给 DLC。合法值：MASK_SHOW_FIRST_4（保留前四个字符）、MASK_SHOW_LAST_4（保留后四个字符）、MASK_HASH（哈希脱敏）、MASK_DATE_SHOW_YEAR（日期脱敏保留年份）、MASK_NULL（置为 NULL）、MASK_DEFAULT（默认值脱敏） 
     * @return StrategyType 脱敏方法（策略类型），必填，直接透传给 DLC。合法值：MASK_SHOW_FIRST_4（保留前四个字符）、MASK_SHOW_LAST_4（保留后四个字符）、MASK_HASH（哈希脱敏）、MASK_DATE_SHOW_YEAR（日期脱敏保留年份）、MASK_NULL（置为 NULL）、MASK_DEFAULT（默认值脱敏）
     */
    public String getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set 脱敏方法（策略类型），必填，直接透传给 DLC。合法值：MASK_SHOW_FIRST_4（保留前四个字符）、MASK_SHOW_LAST_4（保留后四个字符）、MASK_HASH（哈希脱敏）、MASK_DATE_SHOW_YEAR（日期脱敏保留年份）、MASK_NULL（置为 NULL）、MASK_DEFAULT（默认值脱敏）
     * @param StrategyType 脱敏方法（策略类型），必填，直接透传给 DLC。合法值：MASK_SHOW_FIRST_4（保留前四个字符）、MASK_SHOW_LAST_4（保留后四个字符）、MASK_HASH（哈希脱敏）、MASK_DATE_SHOW_YEAR（日期脱敏保留年份）、MASK_NULL（置为 NULL）、MASK_DEFAULT（默认值脱敏）
     */
    public void setStrategyType(String StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get 用户组名称 
     * @return GroupName 用户组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 用户组名称
     * @param GroupName 用户组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    public DataMaskGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataMaskGroup(DataMaskGroup source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.StrategyType != null) {
            this.StrategyType = new String(source.StrategyType);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);

    }
}

