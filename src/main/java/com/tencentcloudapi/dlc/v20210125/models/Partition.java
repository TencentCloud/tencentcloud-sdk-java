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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Partition extends AbstractModel{

    /**
    * 分区列名。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 分区类型。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 对分区的描述。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 隐式分区转换策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Transform")
    @Expose
    private String Transform;

    /**
    * 转换策略参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransformArgs")
    @Expose
    private String [] TransformArgs;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
     * Get 分区列名。 
     * @return Name 分区列名。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 分区列名。
     * @param Name 分区列名。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 分区类型。 
     * @return Type 分区类型。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 分区类型。
     * @param Type 分区类型。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 对分区的描述。 
     * @return Comment 对分区的描述。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 对分区的描述。
     * @param Comment 对分区的描述。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 隐式分区转换策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Transform 隐式分区转换策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTransform() {
        return this.Transform;
    }

    /**
     * Set 隐式分区转换策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param Transform 隐式分区转换策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransform(String Transform) {
        this.Transform = Transform;
    }

    /**
     * Get 转换策略参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransformArgs 转换策略参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTransformArgs() {
        return this.TransformArgs;
    }

    /**
     * Set 转换策略参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransformArgs 转换策略参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransformArgs(String [] TransformArgs) {
        this.TransformArgs = TransformArgs;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    public Partition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Partition(Partition source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Transform != null) {
            this.Transform = new String(source.Transform);
        }
        if (source.TransformArgs != null) {
            this.TransformArgs = new String[source.TransformArgs.length];
            for (int i = 0; i < source.TransformArgs.length; i++) {
                this.TransformArgs[i] = new String(source.TransformArgs[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Transform", this.Transform);
        this.setParamArraySimple(map, prefix + "TransformArgs.", this.TransformArgs);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

