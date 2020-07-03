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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopicInfo extends AbstractModel{

    /**
    * 主题ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 主题名字
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 是否启用投递
    */
    @SerializedName("Enabled")
    @Expose
    private Long Enabled;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 主题ID 
     * @return TopicId 主题ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 主题ID
     * @param TopicId 主题ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 主题名字 
     * @return TopicName 主题名字
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题名字
     * @param TopicName 主题名字
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 是否启用投递 
     * @return Enabled 是否启用投递
     */
    public Long getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否启用投递
     * @param Enabled 是否启用投递
     */
    public void setEnabled(Long Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

