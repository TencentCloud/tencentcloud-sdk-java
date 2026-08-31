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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySubscribeObjectsRequest extends AbstractModel {

    /**
    * <p>数据订阅实例的ID，可通过<a href="https://cloud.tencent.com/document/product/571/102943">DescribeSubscribeJobs</a>接口获取。</p>
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * <p>数据订阅的类型，非mongo任务的枚举值：0-全实例更新；1-数据更新；2-结构更新；3-数据更新+结构更新。mongo任务的枚举值：0-全实例更新；4-订阅单库；5-订阅单集合</p>
    */
    @SerializedName("SubscribeObjectType")
    @Expose
    private Long SubscribeObjectType;

    /**
    * <p>修改后的订阅数据库表信息。会覆盖原来的订阅对象，所以除非 SubscribeObjectType = 0或2，否则该字段必填。</p>
    */
    @SerializedName("Objects")
    @Expose
    private ModifiedSubscribeObject [] Objects;

    /**
    * <p>kafka分区策略。如果不填，默认不修改。如果填了，会覆盖原来的策略。</p>
    */
    @SerializedName("DistributeRules")
    @Expose
    private DistributeRule [] DistributeRules;

    /**
    * <p>默认分区策略。不满足DistributeRules中正则表达式的数据，将按照默认分区策略计算分区。<br>非mongo产品支持的默认策略: table-按表名分区，pk-按表名+主键分区。mongo的默认策略仅支持：collection-按集合名分区。<br>该字段与DistributeRules搭配使用。如果配置了DistributeRules，该字段也必填。如果配置了该字段，视为配置了一条DistributeRules，原来的分区策略也会被覆盖。</p>
    */
    @SerializedName("DefaultRuleType")
    @Expose
    private String DefaultRuleType;

    /**
    * <p>mongo输出聚合设置，mongo任务可选。如果不填，默认不修改。</p>
    */
    @SerializedName("PipelineInfo")
    @Expose
    private PipelineInfo [] PipelineInfo;

    /**
     * Get <p>数据订阅实例的ID，可通过<a href="https://cloud.tencent.com/document/product/571/102943">DescribeSubscribeJobs</a>接口获取。</p> 
     * @return SubscribeId <p>数据订阅实例的ID，可通过<a href="https://cloud.tencent.com/document/product/571/102943">DescribeSubscribeJobs</a>接口获取。</p>
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set <p>数据订阅实例的ID，可通过<a href="https://cloud.tencent.com/document/product/571/102943">DescribeSubscribeJobs</a>接口获取。</p>
     * @param SubscribeId <p>数据订阅实例的ID，可通过<a href="https://cloud.tencent.com/document/product/571/102943">DescribeSubscribeJobs</a>接口获取。</p>
     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get <p>数据订阅的类型，非mongo任务的枚举值：0-全实例更新；1-数据更新；2-结构更新；3-数据更新+结构更新。mongo任务的枚举值：0-全实例更新；4-订阅单库；5-订阅单集合</p> 
     * @return SubscribeObjectType <p>数据订阅的类型，非mongo任务的枚举值：0-全实例更新；1-数据更新；2-结构更新；3-数据更新+结构更新。mongo任务的枚举值：0-全实例更新；4-订阅单库；5-订阅单集合</p>
     */
    public Long getSubscribeObjectType() {
        return this.SubscribeObjectType;
    }

    /**
     * Set <p>数据订阅的类型，非mongo任务的枚举值：0-全实例更新；1-数据更新；2-结构更新；3-数据更新+结构更新。mongo任务的枚举值：0-全实例更新；4-订阅单库；5-订阅单集合</p>
     * @param SubscribeObjectType <p>数据订阅的类型，非mongo任务的枚举值：0-全实例更新；1-数据更新；2-结构更新；3-数据更新+结构更新。mongo任务的枚举值：0-全实例更新；4-订阅单库；5-订阅单集合</p>
     */
    public void setSubscribeObjectType(Long SubscribeObjectType) {
        this.SubscribeObjectType = SubscribeObjectType;
    }

    /**
     * Get <p>修改后的订阅数据库表信息。会覆盖原来的订阅对象，所以除非 SubscribeObjectType = 0或2，否则该字段必填。</p> 
     * @return Objects <p>修改后的订阅数据库表信息。会覆盖原来的订阅对象，所以除非 SubscribeObjectType = 0或2，否则该字段必填。</p>
     */
    public ModifiedSubscribeObject [] getObjects() {
        return this.Objects;
    }

    /**
     * Set <p>修改后的订阅数据库表信息。会覆盖原来的订阅对象，所以除非 SubscribeObjectType = 0或2，否则该字段必填。</p>
     * @param Objects <p>修改后的订阅数据库表信息。会覆盖原来的订阅对象，所以除非 SubscribeObjectType = 0或2，否则该字段必填。</p>
     */
    public void setObjects(ModifiedSubscribeObject [] Objects) {
        this.Objects = Objects;
    }

    /**
     * Get <p>kafka分区策略。如果不填，默认不修改。如果填了，会覆盖原来的策略。</p> 
     * @return DistributeRules <p>kafka分区策略。如果不填，默认不修改。如果填了，会覆盖原来的策略。</p>
     */
    public DistributeRule [] getDistributeRules() {
        return this.DistributeRules;
    }

    /**
     * Set <p>kafka分区策略。如果不填，默认不修改。如果填了，会覆盖原来的策略。</p>
     * @param DistributeRules <p>kafka分区策略。如果不填，默认不修改。如果填了，会覆盖原来的策略。</p>
     */
    public void setDistributeRules(DistributeRule [] DistributeRules) {
        this.DistributeRules = DistributeRules;
    }

    /**
     * Get <p>默认分区策略。不满足DistributeRules中正则表达式的数据，将按照默认分区策略计算分区。<br>非mongo产品支持的默认策略: table-按表名分区，pk-按表名+主键分区。mongo的默认策略仅支持：collection-按集合名分区。<br>该字段与DistributeRules搭配使用。如果配置了DistributeRules，该字段也必填。如果配置了该字段，视为配置了一条DistributeRules，原来的分区策略也会被覆盖。</p> 
     * @return DefaultRuleType <p>默认分区策略。不满足DistributeRules中正则表达式的数据，将按照默认分区策略计算分区。<br>非mongo产品支持的默认策略: table-按表名分区，pk-按表名+主键分区。mongo的默认策略仅支持：collection-按集合名分区。<br>该字段与DistributeRules搭配使用。如果配置了DistributeRules，该字段也必填。如果配置了该字段，视为配置了一条DistributeRules，原来的分区策略也会被覆盖。</p>
     */
    public String getDefaultRuleType() {
        return this.DefaultRuleType;
    }

    /**
     * Set <p>默认分区策略。不满足DistributeRules中正则表达式的数据，将按照默认分区策略计算分区。<br>非mongo产品支持的默认策略: table-按表名分区，pk-按表名+主键分区。mongo的默认策略仅支持：collection-按集合名分区。<br>该字段与DistributeRules搭配使用。如果配置了DistributeRules，该字段也必填。如果配置了该字段，视为配置了一条DistributeRules，原来的分区策略也会被覆盖。</p>
     * @param DefaultRuleType <p>默认分区策略。不满足DistributeRules中正则表达式的数据，将按照默认分区策略计算分区。<br>非mongo产品支持的默认策略: table-按表名分区，pk-按表名+主键分区。mongo的默认策略仅支持：collection-按集合名分区。<br>该字段与DistributeRules搭配使用。如果配置了DistributeRules，该字段也必填。如果配置了该字段，视为配置了一条DistributeRules，原来的分区策略也会被覆盖。</p>
     */
    public void setDefaultRuleType(String DefaultRuleType) {
        this.DefaultRuleType = DefaultRuleType;
    }

    /**
     * Get <p>mongo输出聚合设置，mongo任务可选。如果不填，默认不修改。</p> 
     * @return PipelineInfo <p>mongo输出聚合设置，mongo任务可选。如果不填，默认不修改。</p>
     */
    public PipelineInfo [] getPipelineInfo() {
        return this.PipelineInfo;
    }

    /**
     * Set <p>mongo输出聚合设置，mongo任务可选。如果不填，默认不修改。</p>
     * @param PipelineInfo <p>mongo输出聚合设置，mongo任务可选。如果不填，默认不修改。</p>
     */
    public void setPipelineInfo(PipelineInfo [] PipelineInfo) {
        this.PipelineInfo = PipelineInfo;
    }

    public ModifySubscribeObjectsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySubscribeObjectsRequest(ModifySubscribeObjectsRequest source) {
        if (source.SubscribeId != null) {
            this.SubscribeId = new String(source.SubscribeId);
        }
        if (source.SubscribeObjectType != null) {
            this.SubscribeObjectType = new Long(source.SubscribeObjectType);
        }
        if (source.Objects != null) {
            this.Objects = new ModifiedSubscribeObject[source.Objects.length];
            for (int i = 0; i < source.Objects.length; i++) {
                this.Objects[i] = new ModifiedSubscribeObject(source.Objects[i]);
            }
        }
        if (source.DistributeRules != null) {
            this.DistributeRules = new DistributeRule[source.DistributeRules.length];
            for (int i = 0; i < source.DistributeRules.length; i++) {
                this.DistributeRules[i] = new DistributeRule(source.DistributeRules[i]);
            }
        }
        if (source.DefaultRuleType != null) {
            this.DefaultRuleType = new String(source.DefaultRuleType);
        }
        if (source.PipelineInfo != null) {
            this.PipelineInfo = new PipelineInfo[source.PipelineInfo.length];
            for (int i = 0; i < source.PipelineInfo.length; i++) {
                this.PipelineInfo[i] = new PipelineInfo(source.PipelineInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubscribeId", this.SubscribeId);
        this.setParamSimple(map, prefix + "SubscribeObjectType", this.SubscribeObjectType);
        this.setParamArrayObj(map, prefix + "Objects.", this.Objects);
        this.setParamArrayObj(map, prefix + "DistributeRules.", this.DistributeRules);
        this.setParamSimple(map, prefix + "DefaultRuleType", this.DefaultRuleType);
        this.setParamArrayObj(map, prefix + "PipelineInfo.", this.PipelineInfo);

    }
}

