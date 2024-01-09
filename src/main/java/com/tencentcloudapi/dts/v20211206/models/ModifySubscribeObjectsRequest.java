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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySubscribeObjectsRequest extends AbstractModel {

    /**
    * 数据订阅实例的ID
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * 数据订阅的类型，非mongo任务的枚举值：0-全实例更新；1-数据更新；2-结构更新；3-数据更新+结构更新。mongo任务的枚举值：0-全实例更新；4-订阅单库；5-订阅单集合
    */
    @SerializedName("SubscribeObjectType")
    @Expose
    private Long SubscribeObjectType;

    /**
    * 修改后的订阅数据库表信息。会覆盖原来的订阅对象，所以除非 SubscribeObjectType = 0或2，否则改字段必填。
    */
    @SerializedName("Objects")
    @Expose
    private ModifiedSubscribeObject [] Objects;

    /**
    * kafka分区策略。如果不填，默认不修改。如果填了，会覆盖原来的策略。
    */
    @SerializedName("DistributeRules")
    @Expose
    private DistributeRule [] DistributeRules;

    /**
    * 默认分区策略。不满足DistributeRules中正则表达式的数据，将按照默认分区策略计算分区。
非mongo产品支持的默认策略: table-按表名分区，pk-按表名+主键分区。mongo的默认策略仅支持：collection-按集合名分区。
该字段与DistributeRules搭配使用。如果配置了DistributeRules，该字段也必填。如果配置了该字段，视为配置了一条DistributeRules，原来的分区策略也会被覆盖。
    */
    @SerializedName("DefaultRuleType")
    @Expose
    private String DefaultRuleType;

    /**
    * mongo输出聚合设置，mongo任务可选。如果不填，默认不修改。
    */
    @SerializedName("PipelineInfo")
    @Expose
    private PipelineInfo [] PipelineInfo;

    /**
     * Get 数据订阅实例的ID 
     * @return SubscribeId 数据订阅实例的ID
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set 数据订阅实例的ID
     * @param SubscribeId 数据订阅实例的ID
     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get 数据订阅的类型，非mongo任务的枚举值：0-全实例更新；1-数据更新；2-结构更新；3-数据更新+结构更新。mongo任务的枚举值：0-全实例更新；4-订阅单库；5-订阅单集合 
     * @return SubscribeObjectType 数据订阅的类型，非mongo任务的枚举值：0-全实例更新；1-数据更新；2-结构更新；3-数据更新+结构更新。mongo任务的枚举值：0-全实例更新；4-订阅单库；5-订阅单集合
     */
    public Long getSubscribeObjectType() {
        return this.SubscribeObjectType;
    }

    /**
     * Set 数据订阅的类型，非mongo任务的枚举值：0-全实例更新；1-数据更新；2-结构更新；3-数据更新+结构更新。mongo任务的枚举值：0-全实例更新；4-订阅单库；5-订阅单集合
     * @param SubscribeObjectType 数据订阅的类型，非mongo任务的枚举值：0-全实例更新；1-数据更新；2-结构更新；3-数据更新+结构更新。mongo任务的枚举值：0-全实例更新；4-订阅单库；5-订阅单集合
     */
    public void setSubscribeObjectType(Long SubscribeObjectType) {
        this.SubscribeObjectType = SubscribeObjectType;
    }

    /**
     * Get 修改后的订阅数据库表信息。会覆盖原来的订阅对象，所以除非 SubscribeObjectType = 0或2，否则改字段必填。 
     * @return Objects 修改后的订阅数据库表信息。会覆盖原来的订阅对象，所以除非 SubscribeObjectType = 0或2，否则改字段必填。
     */
    public ModifiedSubscribeObject [] getObjects() {
        return this.Objects;
    }

    /**
     * Set 修改后的订阅数据库表信息。会覆盖原来的订阅对象，所以除非 SubscribeObjectType = 0或2，否则改字段必填。
     * @param Objects 修改后的订阅数据库表信息。会覆盖原来的订阅对象，所以除非 SubscribeObjectType = 0或2，否则改字段必填。
     */
    public void setObjects(ModifiedSubscribeObject [] Objects) {
        this.Objects = Objects;
    }

    /**
     * Get kafka分区策略。如果不填，默认不修改。如果填了，会覆盖原来的策略。 
     * @return DistributeRules kafka分区策略。如果不填，默认不修改。如果填了，会覆盖原来的策略。
     */
    public DistributeRule [] getDistributeRules() {
        return this.DistributeRules;
    }

    /**
     * Set kafka分区策略。如果不填，默认不修改。如果填了，会覆盖原来的策略。
     * @param DistributeRules kafka分区策略。如果不填，默认不修改。如果填了，会覆盖原来的策略。
     */
    public void setDistributeRules(DistributeRule [] DistributeRules) {
        this.DistributeRules = DistributeRules;
    }

    /**
     * Get 默认分区策略。不满足DistributeRules中正则表达式的数据，将按照默认分区策略计算分区。
非mongo产品支持的默认策略: table-按表名分区，pk-按表名+主键分区。mongo的默认策略仅支持：collection-按集合名分区。
该字段与DistributeRules搭配使用。如果配置了DistributeRules，该字段也必填。如果配置了该字段，视为配置了一条DistributeRules，原来的分区策略也会被覆盖。 
     * @return DefaultRuleType 默认分区策略。不满足DistributeRules中正则表达式的数据，将按照默认分区策略计算分区。
非mongo产品支持的默认策略: table-按表名分区，pk-按表名+主键分区。mongo的默认策略仅支持：collection-按集合名分区。
该字段与DistributeRules搭配使用。如果配置了DistributeRules，该字段也必填。如果配置了该字段，视为配置了一条DistributeRules，原来的分区策略也会被覆盖。
     */
    public String getDefaultRuleType() {
        return this.DefaultRuleType;
    }

    /**
     * Set 默认分区策略。不满足DistributeRules中正则表达式的数据，将按照默认分区策略计算分区。
非mongo产品支持的默认策略: table-按表名分区，pk-按表名+主键分区。mongo的默认策略仅支持：collection-按集合名分区。
该字段与DistributeRules搭配使用。如果配置了DistributeRules，该字段也必填。如果配置了该字段，视为配置了一条DistributeRules，原来的分区策略也会被覆盖。
     * @param DefaultRuleType 默认分区策略。不满足DistributeRules中正则表达式的数据，将按照默认分区策略计算分区。
非mongo产品支持的默认策略: table-按表名分区，pk-按表名+主键分区。mongo的默认策略仅支持：collection-按集合名分区。
该字段与DistributeRules搭配使用。如果配置了DistributeRules，该字段也必填。如果配置了该字段，视为配置了一条DistributeRules，原来的分区策略也会被覆盖。
     */
    public void setDefaultRuleType(String DefaultRuleType) {
        this.DefaultRuleType = DefaultRuleType;
    }

    /**
     * Get mongo输出聚合设置，mongo任务可选。如果不填，默认不修改。 
     * @return PipelineInfo mongo输出聚合设置，mongo任务可选。如果不填，默认不修改。
     */
    public PipelineInfo [] getPipelineInfo() {
        return this.PipelineInfo;
    }

    /**
     * Set mongo输出聚合设置，mongo任务可选。如果不填，默认不修改。
     * @param PipelineInfo mongo输出聚合设置，mongo任务可选。如果不填，默认不修改。
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

