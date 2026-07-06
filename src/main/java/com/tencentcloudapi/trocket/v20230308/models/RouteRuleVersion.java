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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RouteRuleVersion extends AbstractModel {

    /**
    * <p>版本号</p>
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

    /**
    * <p>切流时间戳</p><p>单位：毫秒（ms）</p>
    */
    @SerializedName("CutTimestamp")
    @Expose
    private Long CutTimestamp;

    /**
    * <p>更新时间戳</p><p>单位：毫秒（ms）</p>
    */
    @SerializedName("UpdatedAt")
    @Expose
    private Long UpdatedAt;

    /**
    * <p>路由规则列表</p>
    */
    @SerializedName("Rules")
    @Expose
    private RouteRule [] Rules;

    /**
     * Get <p>版本号</p> 
     * @return Version <p>版本号</p>
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set <p>版本号</p>
     * @param Version <p>版本号</p>
     */
    public void setVersion(Long Version) {
        this.Version = Version;
    }

    /**
     * Get <p>切流时间戳</p><p>单位：毫秒（ms）</p> 
     * @return CutTimestamp <p>切流时间戳</p><p>单位：毫秒（ms）</p>
     */
    public Long getCutTimestamp() {
        return this.CutTimestamp;
    }

    /**
     * Set <p>切流时间戳</p><p>单位：毫秒（ms）</p>
     * @param CutTimestamp <p>切流时间戳</p><p>单位：毫秒（ms）</p>
     */
    public void setCutTimestamp(Long CutTimestamp) {
        this.CutTimestamp = CutTimestamp;
    }

    /**
     * Get <p>更新时间戳</p><p>单位：毫秒（ms）</p> 
     * @return UpdatedAt <p>更新时间戳</p><p>单位：毫秒（ms）</p>
     */
    public Long getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set <p>更新时间戳</p><p>单位：毫秒（ms）</p>
     * @param UpdatedAt <p>更新时间戳</p><p>单位：毫秒（ms）</p>
     */
    public void setUpdatedAt(Long UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get <p>路由规则列表</p> 
     * @return Rules <p>路由规则列表</p>
     */
    public RouteRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set <p>路由规则列表</p>
     * @param Rules <p>路由规则列表</p>
     */
    public void setRules(RouteRule [] Rules) {
        this.Rules = Rules;
    }

    public RouteRuleVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RouteRuleVersion(RouteRuleVersion source) {
        if (source.Version != null) {
            this.Version = new Long(source.Version);
        }
        if (source.CutTimestamp != null) {
            this.CutTimestamp = new Long(source.CutTimestamp);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new Long(source.UpdatedAt);
        }
        if (source.Rules != null) {
            this.Rules = new RouteRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new RouteRule(source.Rules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "CutTimestamp", this.CutTimestamp);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}

