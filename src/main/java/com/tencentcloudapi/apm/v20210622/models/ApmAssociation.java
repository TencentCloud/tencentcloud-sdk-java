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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApmAssociation extends AbstractModel {

    /**
    * 关联产品的实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeerId")
    @Expose
    private String PeerId;

    /**
    * 关联关系状态：1（启用）、2（不启用）、3（已失效）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * CKafka消息主题
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
     * Get 关联产品的实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PeerId 关联产品的实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPeerId() {
        return this.PeerId;
    }

    /**
     * Set 关联产品的实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeerId 关联产品的实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeerId(String PeerId) {
        this.PeerId = PeerId;
    }

    /**
     * Get 关联关系状态：1（启用）、2（不启用）、3（已失效）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 关联关系状态：1（启用）、2（不启用）、3（已失效）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 关联关系状态：1（启用）、2（不启用）、3（已失效）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 关联关系状态：1（启用）、2（不启用）、3（已失效）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get CKafka消息主题 
     * @return Topic CKafka消息主题
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set CKafka消息主题
     * @param Topic CKafka消息主题
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    public ApmAssociation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApmAssociation(ApmAssociation source) {
        if (source.PeerId != null) {
            this.PeerId = new String(source.PeerId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PeerId", this.PeerId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Topic", this.Topic);

    }
}

