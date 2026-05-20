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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CNAPIGwConsumer extends AbstractModel {

    /**
    * 分组id
    */
    @SerializedName("ConsumerId")
    @Expose
    private String ConsumerId;

    /**
    * 名字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间 yyyy-MM-dd hh:mm:ss
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 消费者分组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumerGroups")
    @Expose
    private CNAPIGwConsumerGroup [] ConsumerGroups;

    /**
     * Get 分组id 
     * @return ConsumerId 分组id
     */
    public String getConsumerId() {
        return this.ConsumerId;
    }

    /**
     * Set 分组id
     * @param ConsumerId 分组id
     */
    public void setConsumerId(String ConsumerId) {
        this.ConsumerId = ConsumerId;
    }

    /**
     * Get 名字 
     * @return Name 名字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名字
     * @param Name 名字
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 yyyy-MM-dd hh:mm:ss 
     * @return ModifyTime 更新时间 yyyy-MM-dd hh:mm:ss
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 更新时间 yyyy-MM-dd hh:mm:ss
     * @param ModifyTime 更新时间 yyyy-MM-dd hh:mm:ss
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 消费者分组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumerGroups 消费者分组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CNAPIGwConsumerGroup [] getConsumerGroups() {
        return this.ConsumerGroups;
    }

    /**
     * Set 消费者分组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumerGroups 消费者分组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumerGroups(CNAPIGwConsumerGroup [] ConsumerGroups) {
        this.ConsumerGroups = ConsumerGroups;
    }

    public CNAPIGwConsumer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CNAPIGwConsumer(CNAPIGwConsumer source) {
        if (source.ConsumerId != null) {
            this.ConsumerId = new String(source.ConsumerId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ConsumerGroups != null) {
            this.ConsumerGroups = new CNAPIGwConsumerGroup[source.ConsumerGroups.length];
            for (int i = 0; i < source.ConsumerGroups.length; i++) {
                this.ConsumerGroups[i] = new CNAPIGwConsumerGroup(source.ConsumerGroups[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsumerId", this.ConsumerId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "ConsumerGroups.", this.ConsumerGroups);

    }
}

