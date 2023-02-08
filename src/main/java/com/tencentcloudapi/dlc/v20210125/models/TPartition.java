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

public class TPartition extends AbstractModel{

    /**
    * 字段名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 字段类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 字段描述
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 分区类型
    */
    @SerializedName("PartitionType")
    @Expose
    private String PartitionType;

    /**
    * 分区格式
    */
    @SerializedName("PartitionFormat")
    @Expose
    private String PartitionFormat;

    /**
    * 分区分隔数
    */
    @SerializedName("PartitionDot")
    @Expose
    private Long PartitionDot;

    /**
    * 分区转换策略
    */
    @SerializedName("Transform")
    @Expose
    private String Transform;

    /**
    * 策略参数
    */
    @SerializedName("TransformArgs")
    @Expose
    private String [] TransformArgs;

    /**
     * Get 字段名称 
     * @return Name 字段名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 字段名称
     * @param Name 字段名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 字段类型 
     * @return Type 字段类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 字段类型
     * @param Type 字段类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 字段描述 
     * @return Comment 字段描述
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 字段描述
     * @param Comment 字段描述
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 分区类型 
     * @return PartitionType 分区类型
     */
    public String getPartitionType() {
        return this.PartitionType;
    }

    /**
     * Set 分区类型
     * @param PartitionType 分区类型
     */
    public void setPartitionType(String PartitionType) {
        this.PartitionType = PartitionType;
    }

    /**
     * Get 分区格式 
     * @return PartitionFormat 分区格式
     */
    public String getPartitionFormat() {
        return this.PartitionFormat;
    }

    /**
     * Set 分区格式
     * @param PartitionFormat 分区格式
     */
    public void setPartitionFormat(String PartitionFormat) {
        this.PartitionFormat = PartitionFormat;
    }

    /**
     * Get 分区分隔数 
     * @return PartitionDot 分区分隔数
     */
    public Long getPartitionDot() {
        return this.PartitionDot;
    }

    /**
     * Set 分区分隔数
     * @param PartitionDot 分区分隔数
     */
    public void setPartitionDot(Long PartitionDot) {
        this.PartitionDot = PartitionDot;
    }

    /**
     * Get 分区转换策略 
     * @return Transform 分区转换策略
     */
    public String getTransform() {
        return this.Transform;
    }

    /**
     * Set 分区转换策略
     * @param Transform 分区转换策略
     */
    public void setTransform(String Transform) {
        this.Transform = Transform;
    }

    /**
     * Get 策略参数 
     * @return TransformArgs 策略参数
     */
    public String [] getTransformArgs() {
        return this.TransformArgs;
    }

    /**
     * Set 策略参数
     * @param TransformArgs 策略参数
     */
    public void setTransformArgs(String [] TransformArgs) {
        this.TransformArgs = TransformArgs;
    }

    public TPartition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TPartition(TPartition source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.PartitionType != null) {
            this.PartitionType = new String(source.PartitionType);
        }
        if (source.PartitionFormat != null) {
            this.PartitionFormat = new String(source.PartitionFormat);
        }
        if (source.PartitionDot != null) {
            this.PartitionDot = new Long(source.PartitionDot);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "PartitionType", this.PartitionType);
        this.setParamSimple(map, prefix + "PartitionFormat", this.PartitionFormat);
        this.setParamSimple(map, prefix + "PartitionDot", this.PartitionDot);
        this.setParamSimple(map, prefix + "Transform", this.Transform);
        this.setParamArraySimple(map, prefix + "TransformArgs.", this.TransformArgs);

    }
}

