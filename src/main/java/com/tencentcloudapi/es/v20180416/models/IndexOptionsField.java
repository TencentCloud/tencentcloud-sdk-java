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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IndexOptionsField extends AbstractModel{

    /**
    * 过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireMaxAge")
    @Expose
    private String ExpireMaxAge;

    /**
    * 过期大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireMaxSize")
    @Expose
    private String ExpireMaxSize;

    /**
    * 滚动周期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RolloverMaxAge")
    @Expose
    private String RolloverMaxAge;

    /**
    * 是否开启动态滚动
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RolloverDynamic")
    @Expose
    private String RolloverDynamic;

    /**
    * 是否开启动态分片
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShardNumDynamic")
    @Expose
    private String ShardNumDynamic;

    /**
    * 时间分区字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimestampField")
    @Expose
    private String TimestampField;

    /**
    * 写入模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WriteMode")
    @Expose
    private String WriteMode;

    /**
     * Get 过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireMaxAge 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireMaxAge() {
        return this.ExpireMaxAge;
    }

    /**
     * Set 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireMaxAge 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireMaxAge(String ExpireMaxAge) {
        this.ExpireMaxAge = ExpireMaxAge;
    }

    /**
     * Get 过期大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireMaxSize 过期大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireMaxSize() {
        return this.ExpireMaxSize;
    }

    /**
     * Set 过期大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireMaxSize 过期大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireMaxSize(String ExpireMaxSize) {
        this.ExpireMaxSize = ExpireMaxSize;
    }

    /**
     * Get 滚动周期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RolloverMaxAge 滚动周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRolloverMaxAge() {
        return this.RolloverMaxAge;
    }

    /**
     * Set 滚动周期
注意：此字段可能返回 null，表示取不到有效值。
     * @param RolloverMaxAge 滚动周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRolloverMaxAge(String RolloverMaxAge) {
        this.RolloverMaxAge = RolloverMaxAge;
    }

    /**
     * Get 是否开启动态滚动
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RolloverDynamic 是否开启动态滚动
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRolloverDynamic() {
        return this.RolloverDynamic;
    }

    /**
     * Set 是否开启动态滚动
注意：此字段可能返回 null，表示取不到有效值。
     * @param RolloverDynamic 是否开启动态滚动
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRolloverDynamic(String RolloverDynamic) {
        this.RolloverDynamic = RolloverDynamic;
    }

    /**
     * Get 是否开启动态分片
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShardNumDynamic 是否开启动态分片
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShardNumDynamic() {
        return this.ShardNumDynamic;
    }

    /**
     * Set 是否开启动态分片
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShardNumDynamic 是否开启动态分片
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShardNumDynamic(String ShardNumDynamic) {
        this.ShardNumDynamic = ShardNumDynamic;
    }

    /**
     * Get 时间分区字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimestampField 时间分区字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimestampField() {
        return this.TimestampField;
    }

    /**
     * Set 时间分区字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimestampField 时间分区字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimestampField(String TimestampField) {
        this.TimestampField = TimestampField;
    }

    /**
     * Get 写入模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WriteMode 写入模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWriteMode() {
        return this.WriteMode;
    }

    /**
     * Set 写入模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param WriteMode 写入模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWriteMode(String WriteMode) {
        this.WriteMode = WriteMode;
    }

    public IndexOptionsField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IndexOptionsField(IndexOptionsField source) {
        if (source.ExpireMaxAge != null) {
            this.ExpireMaxAge = new String(source.ExpireMaxAge);
        }
        if (source.ExpireMaxSize != null) {
            this.ExpireMaxSize = new String(source.ExpireMaxSize);
        }
        if (source.RolloverMaxAge != null) {
            this.RolloverMaxAge = new String(source.RolloverMaxAge);
        }
        if (source.RolloverDynamic != null) {
            this.RolloverDynamic = new String(source.RolloverDynamic);
        }
        if (source.ShardNumDynamic != null) {
            this.ShardNumDynamic = new String(source.ShardNumDynamic);
        }
        if (source.TimestampField != null) {
            this.TimestampField = new String(source.TimestampField);
        }
        if (source.WriteMode != null) {
            this.WriteMode = new String(source.WriteMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExpireMaxAge", this.ExpireMaxAge);
        this.setParamSimple(map, prefix + "ExpireMaxSize", this.ExpireMaxSize);
        this.setParamSimple(map, prefix + "RolloverMaxAge", this.RolloverMaxAge);
        this.setParamSimple(map, prefix + "RolloverDynamic", this.RolloverDynamic);
        this.setParamSimple(map, prefix + "ShardNumDynamic", this.ShardNumDynamic);
        this.setParamSimple(map, prefix + "TimestampField", this.TimestampField);
        this.setParamSimple(map, prefix + "WriteMode", this.WriteMode);

    }
}

