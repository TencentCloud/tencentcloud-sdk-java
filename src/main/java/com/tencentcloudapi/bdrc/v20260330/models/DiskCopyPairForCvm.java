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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiskCopyPairForCvm extends AbstractModel {

    /**
    * 云硬盘复制对ID
    */
    @SerializedName("CopyPairId")
    @Expose
    private String CopyPairId;

    /**
    * 云硬盘复制对名称
    */
    @SerializedName("CopyPairName")
    @Expose
    private String CopyPairName;

    /**
    * 生产端云硬盘ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceResourceId")
    @Expose
    private String SourceResourceId;

    /**
    * 容灾端云硬盘ID（延迟创建模式且 CVM 未真实创建时被脱敏为空字符串）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetResourceId")
    @Expose
    private String TargetResourceId;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 云硬盘复制对ID 
     * @return CopyPairId 云硬盘复制对ID
     */
    public String getCopyPairId() {
        return this.CopyPairId;
    }

    /**
     * Set 云硬盘复制对ID
     * @param CopyPairId 云硬盘复制对ID
     */
    public void setCopyPairId(String CopyPairId) {
        this.CopyPairId = CopyPairId;
    }

    /**
     * Get 云硬盘复制对名称 
     * @return CopyPairName 云硬盘复制对名称
     */
    public String getCopyPairName() {
        return this.CopyPairName;
    }

    /**
     * Set 云硬盘复制对名称
     * @param CopyPairName 云硬盘复制对名称
     */
    public void setCopyPairName(String CopyPairName) {
        this.CopyPairName = CopyPairName;
    }

    /**
     * Get 生产端云硬盘ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceResourceId 生产端云硬盘ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceResourceId() {
        return this.SourceResourceId;
    }

    /**
     * Set 生产端云硬盘ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceResourceId 生产端云硬盘ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceResourceId(String SourceResourceId) {
        this.SourceResourceId = SourceResourceId;
    }

    /**
     * Get 容灾端云硬盘ID（延迟创建模式且 CVM 未真实创建时被脱敏为空字符串）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetResourceId 容灾端云硬盘ID（延迟创建模式且 CVM 未真实创建时被脱敏为空字符串）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetResourceId() {
        return this.TargetResourceId;
    }

    /**
     * Set 容灾端云硬盘ID（延迟创建模式且 CVM 未真实创建时被脱敏为空字符串）
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetResourceId 容灾端云硬盘ID（延迟创建模式且 CVM 未真实创建时被脱敏为空字符串）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetResourceId(String TargetResourceId) {
        this.TargetResourceId = TargetResourceId;
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

    public DiskCopyPairForCvm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiskCopyPairForCvm(DiskCopyPairForCvm source) {
        if (source.CopyPairId != null) {
            this.CopyPairId = new String(source.CopyPairId);
        }
        if (source.CopyPairName != null) {
            this.CopyPairName = new String(source.CopyPairName);
        }
        if (source.SourceResourceId != null) {
            this.SourceResourceId = new String(source.SourceResourceId);
        }
        if (source.TargetResourceId != null) {
            this.TargetResourceId = new String(source.TargetResourceId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CopyPairId", this.CopyPairId);
        this.setParamSimple(map, prefix + "CopyPairName", this.CopyPairName);
        this.setParamSimple(map, prefix + "SourceResourceId", this.SourceResourceId);
        this.setParamSimple(map, prefix + "TargetResourceId", this.TargetResourceId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

