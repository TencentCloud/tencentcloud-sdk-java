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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDisasterRecoverGroupRequest extends AbstractModel {

    /**
    * <p>分散置放群组名称，长度1-60个字符，支持中、英文。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>分散置放群组类型，取值范围：<br><li>HOST：物理机</li><li>SW：交换机</li><li>RACK：机架</li></p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。<br>更多详细信息请参阅：如何保证幂等性。</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * <p>置放群组的亲和度，在置放群组的实例会按该亲和度分布，亲和度的取值范围是：1-10，默认为1</p>
    */
    @SerializedName("Affinity")
    @Expose
    private Long Affinity;

    /**
    * <p>置放群组类型，当前支持两种，分散置放群组和分区置放群组(灰度中)，取值范围：PARTITION：分区置放群组，SPREAD：分散置放群组，不传该值默认是分散置放群组。</p>
    */
    @SerializedName("Strategy")
    @Expose
    private String Strategy;

    /**
    * <p>分区置放群组的分区数量，取值范围：2-30，当置放群组类型是分区置放群组时传入(分区置放群组功能灰度中)。</p>
    */
    @SerializedName("PartitionCount")
    @Expose
    private Long PartitionCount;

    /**
    * <p>标签描述列表。通过指定该参数可以绑定标签到置放群组。</p>
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification [] TagSpecification;

    /**
     * Get <p>分散置放群组名称，长度1-60个字符，支持中、英文。</p> 
     * @return Name <p>分散置放群组名称，长度1-60个字符，支持中、英文。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>分散置放群组名称，长度1-60个字符，支持中、英文。</p>
     * @param Name <p>分散置放群组名称，长度1-60个字符，支持中、英文。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>分散置放群组类型，取值范围：<br><li>HOST：物理机</li><li>SW：交换机</li><li>RACK：机架</li></p> 
     * @return Type <p>分散置放群组类型，取值范围：<br><li>HOST：物理机</li><li>SW：交换机</li><li>RACK：机架</li></p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>分散置放群组类型，取值范围：<br><li>HOST：物理机</li><li>SW：交换机</li><li>RACK：机架</li></p>
     * @param Type <p>分散置放群组类型，取值范围：<br><li>HOST：物理机</li><li>SW：交换机</li><li>RACK：机架</li></p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。<br>更多详细信息请参阅：如何保证幂等性。</p> 
     * @return ClientToken <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。<br>更多详细信息请参阅：如何保证幂等性。</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。<br>更多详细信息请参阅：如何保证幂等性。</p>
     * @param ClientToken <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。<br>更多详细信息请参阅：如何保证幂等性。</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get <p>置放群组的亲和度，在置放群组的实例会按该亲和度分布，亲和度的取值范围是：1-10，默认为1</p> 
     * @return Affinity <p>置放群组的亲和度，在置放群组的实例会按该亲和度分布，亲和度的取值范围是：1-10，默认为1</p>
     */
    public Long getAffinity() {
        return this.Affinity;
    }

    /**
     * Set <p>置放群组的亲和度，在置放群组的实例会按该亲和度分布，亲和度的取值范围是：1-10，默认为1</p>
     * @param Affinity <p>置放群组的亲和度，在置放群组的实例会按该亲和度分布，亲和度的取值范围是：1-10，默认为1</p>
     */
    public void setAffinity(Long Affinity) {
        this.Affinity = Affinity;
    }

    /**
     * Get <p>置放群组类型，当前支持两种，分散置放群组和分区置放群组(灰度中)，取值范围：PARTITION：分区置放群组，SPREAD：分散置放群组，不传该值默认是分散置放群组。</p> 
     * @return Strategy <p>置放群组类型，当前支持两种，分散置放群组和分区置放群组(灰度中)，取值范围：PARTITION：分区置放群组，SPREAD：分散置放群组，不传该值默认是分散置放群组。</p>
     */
    public String getStrategy() {
        return this.Strategy;
    }

    /**
     * Set <p>置放群组类型，当前支持两种，分散置放群组和分区置放群组(灰度中)，取值范围：PARTITION：分区置放群组，SPREAD：分散置放群组，不传该值默认是分散置放群组。</p>
     * @param Strategy <p>置放群组类型，当前支持两种，分散置放群组和分区置放群组(灰度中)，取值范围：PARTITION：分区置放群组，SPREAD：分散置放群组，不传该值默认是分散置放群组。</p>
     */
    public void setStrategy(String Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get <p>分区置放群组的分区数量，取值范围：2-30，当置放群组类型是分区置放群组时传入(分区置放群组功能灰度中)。</p> 
     * @return PartitionCount <p>分区置放群组的分区数量，取值范围：2-30，当置放群组类型是分区置放群组时传入(分区置放群组功能灰度中)。</p>
     */
    public Long getPartitionCount() {
        return this.PartitionCount;
    }

    /**
     * Set <p>分区置放群组的分区数量，取值范围：2-30，当置放群组类型是分区置放群组时传入(分区置放群组功能灰度中)。</p>
     * @param PartitionCount <p>分区置放群组的分区数量，取值范围：2-30，当置放群组类型是分区置放群组时传入(分区置放群组功能灰度中)。</p>
     */
    public void setPartitionCount(Long PartitionCount) {
        this.PartitionCount = PartitionCount;
    }

    /**
     * Get <p>标签描述列表。通过指定该参数可以绑定标签到置放群组。</p> 
     * @return TagSpecification <p>标签描述列表。通过指定该参数可以绑定标签到置放群组。</p>
     */
    public TagSpecification [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set <p>标签描述列表。通过指定该参数可以绑定标签到置放群组。</p>
     * @param TagSpecification <p>标签描述列表。通过指定该参数可以绑定标签到置放群组。</p>
     */
    public void setTagSpecification(TagSpecification [] TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    public CreateDisasterRecoverGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDisasterRecoverGroupRequest(CreateDisasterRecoverGroupRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.Affinity != null) {
            this.Affinity = new Long(source.Affinity);
        }
        if (source.Strategy != null) {
            this.Strategy = new String(source.Strategy);
        }
        if (source.PartitionCount != null) {
            this.PartitionCount = new Long(source.PartitionCount);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new TagSpecification[source.TagSpecification.length];
            for (int i = 0; i < source.TagSpecification.length; i++) {
                this.TagSpecification[i] = new TagSpecification(source.TagSpecification[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "Affinity", this.Affinity);
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamSimple(map, prefix + "PartitionCount", this.PartitionCount);
        this.setParamArrayObj(map, prefix + "TagSpecification.", this.TagSpecification);

    }
}

