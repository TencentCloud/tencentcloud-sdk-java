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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReceiverData extends AbstractModel{

    /**
    * 收件人列表ID
    */
    @SerializedName("ReceiverId")
    @Expose
    private Long ReceiverId;

    /**
    * 收件人列表名称
    */
    @SerializedName("ReceiversName")
    @Expose
    private String ReceiversName;

    /**
    * 收件人地址总数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 收件人列表描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 列表状态(1 待上传 2 上传中 3 上传完成)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReceiversStatus")
    @Expose
    private Long ReceiversStatus;

    /**
    * 创建时间,如:2021-09-28 16:40:35
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 收件人列表ID 
     * @return ReceiverId 收件人列表ID
     */
    public Long getReceiverId() {
        return this.ReceiverId;
    }

    /**
     * Set 收件人列表ID
     * @param ReceiverId 收件人列表ID
     */
    public void setReceiverId(Long ReceiverId) {
        this.ReceiverId = ReceiverId;
    }

    /**
     * Get 收件人列表名称 
     * @return ReceiversName 收件人列表名称
     */
    public String getReceiversName() {
        return this.ReceiversName;
    }

    /**
     * Set 收件人列表名称
     * @param ReceiversName 收件人列表名称
     */
    public void setReceiversName(String ReceiversName) {
        this.ReceiversName = ReceiversName;
    }

    /**
     * Get 收件人地址总数 
     * @return Count 收件人地址总数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 收件人地址总数
     * @param Count 收件人地址总数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 收件人列表描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Desc 收件人列表描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 收件人列表描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Desc 收件人列表描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 列表状态(1 待上传 2 上传中 3 上传完成)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReceiversStatus 列表状态(1 待上传 2 上传中 3 上传完成)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReceiversStatus() {
        return this.ReceiversStatus;
    }

    /**
     * Set 列表状态(1 待上传 2 上传中 3 上传完成)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReceiversStatus 列表状态(1 待上传 2 上传中 3 上传完成)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReceiversStatus(Long ReceiversStatus) {
        this.ReceiversStatus = ReceiversStatus;
    }

    /**
     * Get 创建时间,如:2021-09-28 16:40:35 
     * @return CreateTime 创建时间,如:2021-09-28 16:40:35
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间,如:2021-09-28 16:40:35
     * @param CreateTime 创建时间,如:2021-09-28 16:40:35
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public ReceiverData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReceiverData(ReceiverData source) {
        if (source.ReceiverId != null) {
            this.ReceiverId = new Long(source.ReceiverId);
        }
        if (source.ReceiversName != null) {
            this.ReceiversName = new String(source.ReceiversName);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.ReceiversStatus != null) {
            this.ReceiversStatus = new Long(source.ReceiversStatus);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReceiverId", this.ReceiverId);
        this.setParamSimple(map, prefix + "ReceiversName", this.ReceiversName);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "ReceiversStatus", this.ReceiversStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

