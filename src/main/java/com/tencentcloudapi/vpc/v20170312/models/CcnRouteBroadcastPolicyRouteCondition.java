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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CcnRouteBroadcastPolicyRouteCondition extends AbstractModel {

    /**
    * 条件类型
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 条件值列表
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * 匹配模式，`1` 精确匹配，`0` 模糊匹配
    */
    @SerializedName("MatchPattern")
    @Expose
    private Long MatchPattern;

    /**
     * Get 条件类型 
     * @return Name 条件类型
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 条件类型
     * @param Name 条件类型
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 条件值列表 
     * @return Values 条件值列表
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 条件值列表
     * @param Values 条件值列表
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get 匹配模式，`1` 精确匹配，`0` 模糊匹配 
     * @return MatchPattern 匹配模式，`1` 精确匹配，`0` 模糊匹配
     */
    public Long getMatchPattern() {
        return this.MatchPattern;
    }

    /**
     * Set 匹配模式，`1` 精确匹配，`0` 模糊匹配
     * @param MatchPattern 匹配模式，`1` 精确匹配，`0` 模糊匹配
     */
    public void setMatchPattern(Long MatchPattern) {
        this.MatchPattern = MatchPattern;
    }

    public CcnRouteBroadcastPolicyRouteCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CcnRouteBroadcastPolicyRouteCondition(CcnRouteBroadcastPolicyRouteCondition source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.MatchPattern != null) {
            this.MatchPattern = new Long(source.MatchPattern);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "MatchPattern", this.MatchPattern);

    }
}

