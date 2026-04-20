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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IndexOptionsField extends AbstractModel {

    /**
    * <p>过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireMaxAge")
    @Expose
    private String ExpireMaxAge;

    /**
    * <p>过期大小</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireMaxSize")
    @Expose
    private String ExpireMaxSize;

    /**
    * <p>滚动周期</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RolloverMaxAge")
    @Expose
    private String RolloverMaxAge;

    /**
    * <p>是否开启动态滚动</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RolloverDynamic")
    @Expose
    private String RolloverDynamic;

    /**
    * <p>是否开启动态分片</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShardNumDynamic")
    @Expose
    private String ShardNumDynamic;

    /**
    * <p>时间分区字段</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimestampField")
    @Expose
    private String TimestampField;

    /**
    * <p>写入模式</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WriteMode")
    @Expose
    private String WriteMode;

    /**
    * <p>是否开启完全卸载</p><p>枚举值：</p><ul><li>true： 开启完全卸载</li><li>false： 关闭完全卸载</li></ul>
    */
    @SerializedName("FullOffloadedEnable")
    @Expose
    private String FullOffloadedEnable;

    /**
    * <p>完全卸载生命周期</p>
    */
    @SerializedName("FullOffloadedMaxAge")
    @Expose
    private String FullOffloadedMaxAge;

    /**
    * <p>完全卸载后备索引取回后生命周期</p>
    */
    @SerializedName("FullOffloadedRetrieveMaxAge")
    @Expose
    private String FullOffloadedRetrieveMaxAge;

    /**
     * Get <p>过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireMaxAge <p>过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireMaxAge() {
        return this.ExpireMaxAge;
    }

    /**
     * Set <p>过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireMaxAge <p>过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireMaxAge(String ExpireMaxAge) {
        this.ExpireMaxAge = ExpireMaxAge;
    }

    /**
     * Get <p>过期大小</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireMaxSize <p>过期大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireMaxSize() {
        return this.ExpireMaxSize;
    }

    /**
     * Set <p>过期大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireMaxSize <p>过期大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireMaxSize(String ExpireMaxSize) {
        this.ExpireMaxSize = ExpireMaxSize;
    }

    /**
     * Get <p>滚动周期</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RolloverMaxAge <p>滚动周期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRolloverMaxAge() {
        return this.RolloverMaxAge;
    }

    /**
     * Set <p>滚动周期</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RolloverMaxAge <p>滚动周期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRolloverMaxAge(String RolloverMaxAge) {
        this.RolloverMaxAge = RolloverMaxAge;
    }

    /**
     * Get <p>是否开启动态滚动</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RolloverDynamic <p>是否开启动态滚动</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRolloverDynamic() {
        return this.RolloverDynamic;
    }

    /**
     * Set <p>是否开启动态滚动</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RolloverDynamic <p>是否开启动态滚动</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRolloverDynamic(String RolloverDynamic) {
        this.RolloverDynamic = RolloverDynamic;
    }

    /**
     * Get <p>是否开启动态分片</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShardNumDynamic <p>是否开启动态分片</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShardNumDynamic() {
        return this.ShardNumDynamic;
    }

    /**
     * Set <p>是否开启动态分片</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShardNumDynamic <p>是否开启动态分片</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShardNumDynamic(String ShardNumDynamic) {
        this.ShardNumDynamic = ShardNumDynamic;
    }

    /**
     * Get <p>时间分区字段</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimestampField <p>时间分区字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimestampField() {
        return this.TimestampField;
    }

    /**
     * Set <p>时间分区字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimestampField <p>时间分区字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimestampField(String TimestampField) {
        this.TimestampField = TimestampField;
    }

    /**
     * Get <p>写入模式</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WriteMode <p>写入模式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWriteMode() {
        return this.WriteMode;
    }

    /**
     * Set <p>写入模式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WriteMode <p>写入模式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWriteMode(String WriteMode) {
        this.WriteMode = WriteMode;
    }

    /**
     * Get <p>是否开启完全卸载</p><p>枚举值：</p><ul><li>true： 开启完全卸载</li><li>false： 关闭完全卸载</li></ul> 
     * @return FullOffloadedEnable <p>是否开启完全卸载</p><p>枚举值：</p><ul><li>true： 开启完全卸载</li><li>false： 关闭完全卸载</li></ul>
     */
    public String getFullOffloadedEnable() {
        return this.FullOffloadedEnable;
    }

    /**
     * Set <p>是否开启完全卸载</p><p>枚举值：</p><ul><li>true： 开启完全卸载</li><li>false： 关闭完全卸载</li></ul>
     * @param FullOffloadedEnable <p>是否开启完全卸载</p><p>枚举值：</p><ul><li>true： 开启完全卸载</li><li>false： 关闭完全卸载</li></ul>
     */
    public void setFullOffloadedEnable(String FullOffloadedEnable) {
        this.FullOffloadedEnable = FullOffloadedEnable;
    }

    /**
     * Get <p>完全卸载生命周期</p> 
     * @return FullOffloadedMaxAge <p>完全卸载生命周期</p>
     */
    public String getFullOffloadedMaxAge() {
        return this.FullOffloadedMaxAge;
    }

    /**
     * Set <p>完全卸载生命周期</p>
     * @param FullOffloadedMaxAge <p>完全卸载生命周期</p>
     */
    public void setFullOffloadedMaxAge(String FullOffloadedMaxAge) {
        this.FullOffloadedMaxAge = FullOffloadedMaxAge;
    }

    /**
     * Get <p>完全卸载后备索引取回后生命周期</p> 
     * @return FullOffloadedRetrieveMaxAge <p>完全卸载后备索引取回后生命周期</p>
     */
    public String getFullOffloadedRetrieveMaxAge() {
        return this.FullOffloadedRetrieveMaxAge;
    }

    /**
     * Set <p>完全卸载后备索引取回后生命周期</p>
     * @param FullOffloadedRetrieveMaxAge <p>完全卸载后备索引取回后生命周期</p>
     */
    public void setFullOffloadedRetrieveMaxAge(String FullOffloadedRetrieveMaxAge) {
        this.FullOffloadedRetrieveMaxAge = FullOffloadedRetrieveMaxAge;
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
        if (source.FullOffloadedEnable != null) {
            this.FullOffloadedEnable = new String(source.FullOffloadedEnable);
        }
        if (source.FullOffloadedMaxAge != null) {
            this.FullOffloadedMaxAge = new String(source.FullOffloadedMaxAge);
        }
        if (source.FullOffloadedRetrieveMaxAge != null) {
            this.FullOffloadedRetrieveMaxAge = new String(source.FullOffloadedRetrieveMaxAge);
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
        this.setParamSimple(map, prefix + "FullOffloadedEnable", this.FullOffloadedEnable);
        this.setParamSimple(map, prefix + "FullOffloadedMaxAge", this.FullOffloadedMaxAge);
        this.setParamSimple(map, prefix + "FullOffloadedRetrieveMaxAge", this.FullOffloadedRetrieveMaxAge);

    }
}

