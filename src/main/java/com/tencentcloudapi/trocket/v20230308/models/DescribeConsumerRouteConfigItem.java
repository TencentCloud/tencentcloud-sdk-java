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

public class DescribeConsumerRouteConfigItem extends AbstractModel {

    /**
    * <p>配置项标识</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Key")
    @Expose
    private ConsumerRouteKey Key;

    /**
    * <p>版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

    /**
    * <p>路由规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rules")
    @Expose
    private RouteRule [] Rules;

    /**
    * <p>切流时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CutTimestamp")
    @Expose
    private Long CutTimestamp;

    /**
     * Get <p>配置项标识</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Key <p>配置项标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConsumerRouteKey getKey() {
        return this.Key;
    }

    /**
     * Set <p>配置项标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Key <p>配置项标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKey(ConsumerRouteKey Key) {
        this.Key = Key;
    }

    /**
     * Get <p>版本号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version <p>版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set <p>版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version <p>版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(Long Version) {
        this.Version = Version;
    }

    /**
     * Get <p>路由规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rules <p>路由规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RouteRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set <p>路由规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rules <p>路由规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRules(RouteRule [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get <p>切流时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CutTimestamp <p>切流时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCutTimestamp() {
        return this.CutTimestamp;
    }

    /**
     * Set <p>切流时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CutTimestamp <p>切流时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCutTimestamp(Long CutTimestamp) {
        this.CutTimestamp = CutTimestamp;
    }

    public DescribeConsumerRouteConfigItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConsumerRouteConfigItem(DescribeConsumerRouteConfigItem source) {
        if (source.Key != null) {
            this.Key = new ConsumerRouteKey(source.Key);
        }
        if (source.Version != null) {
            this.Version = new Long(source.Version);
        }
        if (source.Rules != null) {
            this.Rules = new RouteRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new RouteRule(source.Rules[i]);
            }
        }
        if (source.CutTimestamp != null) {
            this.CutTimestamp = new Long(source.CutTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Key.", this.Key);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "CutTimestamp", this.CutTimestamp);

    }
}

