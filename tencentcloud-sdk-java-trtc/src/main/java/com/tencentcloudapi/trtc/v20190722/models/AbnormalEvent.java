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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AbnormalEvent extends AbstractModel{

    /**
    * 异常事件ID，具体值查看附录：异常体验ID映射表：https://cloud.tencent.com/document/product/647/44916
    */
    @SerializedName("AbnormalEventId")
    @Expose
    private Long AbnormalEventId;

    /**
    * 远端用户ID,""：表示异常事件不是由远端用户产生
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeerId")
    @Expose
    private String PeerId;

    /**
     * Get 异常事件ID，具体值查看附录：异常体验ID映射表：https://cloud.tencent.com/document/product/647/44916 
     * @return AbnormalEventId 异常事件ID，具体值查看附录：异常体验ID映射表：https://cloud.tencent.com/document/product/647/44916
     */
    public Long getAbnormalEventId() {
        return this.AbnormalEventId;
    }

    /**
     * Set 异常事件ID，具体值查看附录：异常体验ID映射表：https://cloud.tencent.com/document/product/647/44916
     * @param AbnormalEventId 异常事件ID，具体值查看附录：异常体验ID映射表：https://cloud.tencent.com/document/product/647/44916
     */
    public void setAbnormalEventId(Long AbnormalEventId) {
        this.AbnormalEventId = AbnormalEventId;
    }

    /**
     * Get 远端用户ID,""：表示异常事件不是由远端用户产生
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PeerId 远端用户ID,""：表示异常事件不是由远端用户产生
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPeerId() {
        return this.PeerId;
    }

    /**
     * Set 远端用户ID,""：表示异常事件不是由远端用户产生
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeerId 远端用户ID,""：表示异常事件不是由远端用户产生
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeerId(String PeerId) {
        this.PeerId = PeerId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AbnormalEventId", this.AbnormalEventId);
        this.setParamSimple(map, prefix + "PeerId", this.PeerId);

    }
}

