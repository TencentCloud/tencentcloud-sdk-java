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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpConfig extends AbstractModel {

    /**
    * ip数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ips")
    @Expose
    private String [] Ips;

    /**
    * 生效类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EffectType")
    @Expose
    private String EffectType;

    /**
    * 生效时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EffectTimes")
    @Expose
    private StartEndTime [] EffectTimes;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get ip数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ips ip数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIps() {
        return this.Ips;
    }

    /**
     * Set ip数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ips ip数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIps(String [] Ips) {
        this.Ips = Ips;
    }

    /**
     * Get 生效类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EffectType 生效类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEffectType() {
        return this.EffectType;
    }

    /**
     * Set 生效类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param EffectType 生效类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEffectType(String EffectType) {
        this.EffectType = EffectType;
    }

    /**
     * Get 生效时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EffectTimes 生效时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StartEndTime [] getEffectTimes() {
        return this.EffectTimes;
    }

    /**
     * Set 生效时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EffectTimes 生效时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEffectTimes(StartEndTime [] EffectTimes) {
        this.EffectTimes = EffectTimes;
    }

    /**
     * Get 备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Comment 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Comment 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public IpConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpConfig(IpConfig source) {
        if (source.Ips != null) {
            this.Ips = new String[source.Ips.length];
            for (int i = 0; i < source.Ips.length; i++) {
                this.Ips[i] = new String(source.Ips[i]);
            }
        }
        if (source.EffectType != null) {
            this.EffectType = new String(source.EffectType);
        }
        if (source.EffectTimes != null) {
            this.EffectTimes = new StartEndTime[source.EffectTimes.length];
            for (int i = 0; i < source.EffectTimes.length; i++) {
                this.EffectTimes[i] = new StartEndTime(source.EffectTimes[i]);
            }
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Ips.", this.Ips);
        this.setParamSimple(map, prefix + "EffectType", this.EffectType);
        this.setParamArrayObj(map, prefix + "EffectTimes.", this.EffectTimes);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}

