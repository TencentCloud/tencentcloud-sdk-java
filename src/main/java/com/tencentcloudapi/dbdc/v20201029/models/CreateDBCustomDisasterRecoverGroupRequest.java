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
package com.tencentcloudapi.dbdc.v20201029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDBCustomDisasterRecoverGroupRequest extends AbstractModel {

    /**
    * <p>置放群组名称</p><p>入参限制：长度1-60个字符，支持中、英文</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>置放群组类型</p><p>枚举值：</p><ul><li>HOST： 物理机</li></ul><p>默认值：HOST</p><p>当前仅支持物理机类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>置放群组策略</p><p>入参限制：当前仅支持分散置放群组</p><p>枚举值：</p><ul><li>SPREAD： 分散置放群组</li></ul><p>默认值：SPREAD</p>
    */
    @SerializedName("Strategy")
    @Expose
    private String Strategy;

    /**
    * <p>置放群组的亲和度，在置放群组的实例会按该亲和度分布</p><p>取值范围：[1, 10]</p><p>默认值：1</p>
    */
    @SerializedName("Affinity")
    @Expose
    private Long Affinity;

    /**
    * <p>标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
     * Get <p>置放群组名称</p><p>入参限制：长度1-60个字符，支持中、英文</p> 
     * @return Name <p>置放群组名称</p><p>入参限制：长度1-60个字符，支持中、英文</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>置放群组名称</p><p>入参限制：长度1-60个字符，支持中、英文</p>
     * @param Name <p>置放群组名称</p><p>入参限制：长度1-60个字符，支持中、英文</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>置放群组类型</p><p>枚举值：</p><ul><li>HOST： 物理机</li></ul><p>默认值：HOST</p><p>当前仅支持物理机类型</p> 
     * @return Type <p>置放群组类型</p><p>枚举值：</p><ul><li>HOST： 物理机</li></ul><p>默认值：HOST</p><p>当前仅支持物理机类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>置放群组类型</p><p>枚举值：</p><ul><li>HOST： 物理机</li></ul><p>默认值：HOST</p><p>当前仅支持物理机类型</p>
     * @param Type <p>置放群组类型</p><p>枚举值：</p><ul><li>HOST： 物理机</li></ul><p>默认值：HOST</p><p>当前仅支持物理机类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>置放群组策略</p><p>入参限制：当前仅支持分散置放群组</p><p>枚举值：</p><ul><li>SPREAD： 分散置放群组</li></ul><p>默认值：SPREAD</p> 
     * @return Strategy <p>置放群组策略</p><p>入参限制：当前仅支持分散置放群组</p><p>枚举值：</p><ul><li>SPREAD： 分散置放群组</li></ul><p>默认值：SPREAD</p>
     */
    public String getStrategy() {
        return this.Strategy;
    }

    /**
     * Set <p>置放群组策略</p><p>入参限制：当前仅支持分散置放群组</p><p>枚举值：</p><ul><li>SPREAD： 分散置放群组</li></ul><p>默认值：SPREAD</p>
     * @param Strategy <p>置放群组策略</p><p>入参限制：当前仅支持分散置放群组</p><p>枚举值：</p><ul><li>SPREAD： 分散置放群组</li></ul><p>默认值：SPREAD</p>
     */
    public void setStrategy(String Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get <p>置放群组的亲和度，在置放群组的实例会按该亲和度分布</p><p>取值范围：[1, 10]</p><p>默认值：1</p> 
     * @return Affinity <p>置放群组的亲和度，在置放群组的实例会按该亲和度分布</p><p>取值范围：[1, 10]</p><p>默认值：1</p>
     */
    public Long getAffinity() {
        return this.Affinity;
    }

    /**
     * Set <p>置放群组的亲和度，在置放群组的实例会按该亲和度分布</p><p>取值范围：[1, 10]</p><p>默认值：1</p>
     * @param Affinity <p>置放群组的亲和度，在置放群组的实例会按该亲和度分布</p><p>取值范围：[1, 10]</p><p>默认值：1</p>
     */
    public void setAffinity(Long Affinity) {
        this.Affinity = Affinity;
    }

    /**
     * Get <p>标签</p> 
     * @return Tags <p>标签</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签</p>
     * @param Tags <p>标签</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。</p> 
     * @return ClientToken <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。</p>
     * @param ClientToken <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    public CreateDBCustomDisasterRecoverGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDBCustomDisasterRecoverGroupRequest(CreateDBCustomDisasterRecoverGroupRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Strategy != null) {
            this.Strategy = new String(source.Strategy);
        }
        if (source.Affinity != null) {
            this.Affinity = new Long(source.Affinity);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamSimple(map, prefix + "Affinity", this.Affinity);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);

    }
}

