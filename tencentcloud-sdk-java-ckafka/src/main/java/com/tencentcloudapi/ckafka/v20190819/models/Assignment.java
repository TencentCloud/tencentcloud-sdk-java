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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Assignment extends AbstractModel{

    /**
    * assingment版本信息
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

    /**
    * topic信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Topics")
    @Expose
    private GroupInfoTopics [] Topics;

    /**
     * Get assingment版本信息 
     * @return Version assingment版本信息
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set assingment版本信息
     * @param Version assingment版本信息
     */
    public void setVersion(Long Version) {
        this.Version = Version;
    }

    /**
     * Get topic信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Topics topic信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GroupInfoTopics [] getTopics() {
        return this.Topics;
    }

    /**
     * Set topic信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Topics topic信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopics(GroupInfoTopics [] Topics) {
        this.Topics = Topics;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamArrayObj(map, prefix + "Topics.", this.Topics);

    }
}

