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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttrLabelDetail extends AbstractModel {

    /**
    * 标签ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttrBizId")
    @Expose
    private String AttrBizId;

    /**
    * 标签标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttrKey")
    @Expose
    private String AttrKey;

    /**
    * 标签名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttrName")
    @Expose
    private String AttrName;

    /**
    * 标签值名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelNames")
    @Expose
    private String [] LabelNames;

    /**
    * 标签是否在更新中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsUpdating")
    @Expose
    private Boolean IsUpdating;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 状态描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 标签值总数
    */
    @SerializedName("LabelTotalCount")
    @Expose
    private String LabelTotalCount;

    /**
     * Get 标签ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttrBizId 标签ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAttrBizId() {
        return this.AttrBizId;
    }

    /**
     * Set 标签ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttrBizId 标签ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttrBizId(String AttrBizId) {
        this.AttrBizId = AttrBizId;
    }

    /**
     * Get 标签标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttrKey 标签标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAttrKey() {
        return this.AttrKey;
    }

    /**
     * Set 标签标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttrKey 标签标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttrKey(String AttrKey) {
        this.AttrKey = AttrKey;
    }

    /**
     * Get 标签名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttrName 标签名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAttrName() {
        return this.AttrName;
    }

    /**
     * Set 标签名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttrName 标签名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttrName(String AttrName) {
        this.AttrName = AttrName;
    }

    /**
     * Get 标签值名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelNames 标签值名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getLabelNames() {
        return this.LabelNames;
    }

    /**
     * Set 标签值名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelNames 标签值名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelNames(String [] LabelNames) {
        this.LabelNames = LabelNames;
    }

    /**
     * Get 标签是否在更新中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsUpdating 标签是否在更新中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsUpdating() {
        return this.IsUpdating;
    }

    /**
     * Set 标签是否在更新中
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsUpdating 标签是否在更新中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsUpdating(Boolean IsUpdating) {
        this.IsUpdating = IsUpdating;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 状态描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusDesc 状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 状态描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusDesc 状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 标签值总数 
     * @return LabelTotalCount 标签值总数
     */
    public String getLabelTotalCount() {
        return this.LabelTotalCount;
    }

    /**
     * Set 标签值总数
     * @param LabelTotalCount 标签值总数
     */
    public void setLabelTotalCount(String LabelTotalCount) {
        this.LabelTotalCount = LabelTotalCount;
    }

    public AttrLabelDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttrLabelDetail(AttrLabelDetail source) {
        if (source.AttrBizId != null) {
            this.AttrBizId = new String(source.AttrBizId);
        }
        if (source.AttrKey != null) {
            this.AttrKey = new String(source.AttrKey);
        }
        if (source.AttrName != null) {
            this.AttrName = new String(source.AttrName);
        }
        if (source.LabelNames != null) {
            this.LabelNames = new String[source.LabelNames.length];
            for (int i = 0; i < source.LabelNames.length; i++) {
                this.LabelNames[i] = new String(source.LabelNames[i]);
            }
        }
        if (source.IsUpdating != null) {
            this.IsUpdating = new Boolean(source.IsUpdating);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.LabelTotalCount != null) {
            this.LabelTotalCount = new String(source.LabelTotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AttrBizId", this.AttrBizId);
        this.setParamSimple(map, prefix + "AttrKey", this.AttrKey);
        this.setParamSimple(map, prefix + "AttrName", this.AttrName);
        this.setParamArraySimple(map, prefix + "LabelNames.", this.LabelNames);
        this.setParamSimple(map, prefix + "IsUpdating", this.IsUpdating);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "LabelTotalCount", this.LabelTotalCount);

    }
}

