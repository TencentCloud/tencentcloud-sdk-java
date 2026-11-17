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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KBCapacity extends AbstractModel {

    /**
    * <p>最大字符数</p>
    */
    @SerializedName("MaxCharSize")
    @Expose
    private String MaxCharSize;

    /**
    * <p>超量字符数</p>
    */
    @SerializedName("OverCharSize")
    @Expose
    private String OverCharSize;

    /**
    * <p>已用字符数</p>
    */
    @SerializedName("UsedCharSize")
    @Expose
    private String UsedCharSize;

    /**
    * <p>字符数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CharacterSize")
    @Expose
    private CharacterSize CharacterSize;

    /**
    * <p>容量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ByteCapacity")
    @Expose
    private ByteCapacity ByteCapacity;

    /**
    * <p>知识库容量状态</p><p>枚举值：</p><ul><li>1： 正常</li><li>2： 超量但可用（pu 抵扣）</li><li>3： 超量不可用</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CapacityStatus")
    @Expose
    private Long CapacityStatus;

    /**
     * Get <p>最大字符数</p> 
     * @return MaxCharSize <p>最大字符数</p>
     */
    public String getMaxCharSize() {
        return this.MaxCharSize;
    }

    /**
     * Set <p>最大字符数</p>
     * @param MaxCharSize <p>最大字符数</p>
     */
    public void setMaxCharSize(String MaxCharSize) {
        this.MaxCharSize = MaxCharSize;
    }

    /**
     * Get <p>超量字符数</p> 
     * @return OverCharSize <p>超量字符数</p>
     */
    public String getOverCharSize() {
        return this.OverCharSize;
    }

    /**
     * Set <p>超量字符数</p>
     * @param OverCharSize <p>超量字符数</p>
     */
    public void setOverCharSize(String OverCharSize) {
        this.OverCharSize = OverCharSize;
    }

    /**
     * Get <p>已用字符数</p> 
     * @return UsedCharSize <p>已用字符数</p>
     */
    public String getUsedCharSize() {
        return this.UsedCharSize;
    }

    /**
     * Set <p>已用字符数</p>
     * @param UsedCharSize <p>已用字符数</p>
     */
    public void setUsedCharSize(String UsedCharSize) {
        this.UsedCharSize = UsedCharSize;
    }

    /**
     * Get <p>字符数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CharacterSize <p>字符数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CharacterSize getCharacterSize() {
        return this.CharacterSize;
    }

    /**
     * Set <p>字符数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CharacterSize <p>字符数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCharacterSize(CharacterSize CharacterSize) {
        this.CharacterSize = CharacterSize;
    }

    /**
     * Get <p>容量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ByteCapacity <p>容量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ByteCapacity getByteCapacity() {
        return this.ByteCapacity;
    }

    /**
     * Set <p>容量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ByteCapacity <p>容量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setByteCapacity(ByteCapacity ByteCapacity) {
        this.ByteCapacity = ByteCapacity;
    }

    /**
     * Get <p>知识库容量状态</p><p>枚举值：</p><ul><li>1： 正常</li><li>2： 超量但可用（pu 抵扣）</li><li>3： 超量不可用</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CapacityStatus <p>知识库容量状态</p><p>枚举值：</p><ul><li>1： 正常</li><li>2： 超量但可用（pu 抵扣）</li><li>3： 超量不可用</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCapacityStatus() {
        return this.CapacityStatus;
    }

    /**
     * Set <p>知识库容量状态</p><p>枚举值：</p><ul><li>1： 正常</li><li>2： 超量但可用（pu 抵扣）</li><li>3： 超量不可用</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CapacityStatus <p>知识库容量状态</p><p>枚举值：</p><ul><li>1： 正常</li><li>2： 超量但可用（pu 抵扣）</li><li>3： 超量不可用</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCapacityStatus(Long CapacityStatus) {
        this.CapacityStatus = CapacityStatus;
    }

    public KBCapacity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KBCapacity(KBCapacity source) {
        if (source.MaxCharSize != null) {
            this.MaxCharSize = new String(source.MaxCharSize);
        }
        if (source.OverCharSize != null) {
            this.OverCharSize = new String(source.OverCharSize);
        }
        if (source.UsedCharSize != null) {
            this.UsedCharSize = new String(source.UsedCharSize);
        }
        if (source.CharacterSize != null) {
            this.CharacterSize = new CharacterSize(source.CharacterSize);
        }
        if (source.ByteCapacity != null) {
            this.ByteCapacity = new ByteCapacity(source.ByteCapacity);
        }
        if (source.CapacityStatus != null) {
            this.CapacityStatus = new Long(source.CapacityStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxCharSize", this.MaxCharSize);
        this.setParamSimple(map, prefix + "OverCharSize", this.OverCharSize);
        this.setParamSimple(map, prefix + "UsedCharSize", this.UsedCharSize);
        this.setParamObj(map, prefix + "CharacterSize.", this.CharacterSize);
        this.setParamObj(map, prefix + "ByteCapacity.", this.ByteCapacity);
        this.setParamSimple(map, prefix + "CapacityStatus", this.CapacityStatus);

    }
}

