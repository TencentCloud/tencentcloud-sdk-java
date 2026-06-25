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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CNAPIGwConsumer extends AbstractModel {

    /**
    * <p>消费者 ID。</p>
    */
    @SerializedName("ConsumerId")
    @Expose
    private String ConsumerId;

    /**
    * <p>名字</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间 yyyy-MM-dd hh:mm:ss</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>消费者分组</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumerGroups")
    @Expose
    private CNAPIGwConsumerGroup [] ConsumerGroups;

    /**
     * Get <p>消费者 ID。</p> 
     * @return ConsumerId <p>消费者 ID。</p>
     */
    public String getConsumerId() {
        return this.ConsumerId;
    }

    /**
     * Set <p>消费者 ID。</p>
     * @param ConsumerId <p>消费者 ID。</p>
     */
    public void setConsumerId(String ConsumerId) {
        this.ConsumerId = ConsumerId;
    }

    /**
     * Get <p>名字</p> 
     * @return Name <p>名字</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名字</p>
     * @param Name <p>名字</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间 yyyy-MM-dd hh:mm:ss</p> 
     * @return ModifyTime <p>更新时间 yyyy-MM-dd hh:mm:ss</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>更新时间 yyyy-MM-dd hh:mm:ss</p>
     * @param ModifyTime <p>更新时间 yyyy-MM-dd hh:mm:ss</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>消费者分组</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumerGroups <p>消费者分组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CNAPIGwConsumerGroup [] getConsumerGroups() {
        return this.ConsumerGroups;
    }

    /**
     * Set <p>消费者分组</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumerGroups <p>消费者分组</p>
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

