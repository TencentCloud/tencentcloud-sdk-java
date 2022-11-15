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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DimensionScoreInfo extends AbstractModel{

    /**
    * 维度名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 权重
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Weight")
    @Expose
    private Float Weight;

    /**
    * 设置人id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private Long UserId;

    /**
    * 设置人名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 更新时间 时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 参与评估表数量
    */
    @SerializedName("JoinTableNumber")
    @Expose
    private Long JoinTableNumber;

    /**
    * 评分
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
     * Get 维度名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 维度名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 维度名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 维度名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 权重
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Weight 权重
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getWeight() {
        return this.Weight;
    }

    /**
     * Set 权重
注意：此字段可能返回 null，表示取不到有效值。
     * @param Weight 权重
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeight(Float Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 设置人id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId 设置人id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUserId() {
        return this.UserId;
    }

    /**
     * Set 设置人id
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId 设置人id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(Long UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 设置人名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName 设置人名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 设置人名
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName 设置人名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 更新时间 时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间 时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间 时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间 时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 参与评估表数量 
     * @return JoinTableNumber 参与评估表数量
     */
    public Long getJoinTableNumber() {
        return this.JoinTableNumber;
    }

    /**
     * Set 参与评估表数量
     * @param JoinTableNumber 参与评估表数量
     */
    public void setJoinTableNumber(Long JoinTableNumber) {
        this.JoinTableNumber = JoinTableNumber;
    }

    /**
     * Get 评分 
     * @return Score 评分
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set 评分
     * @param Score 评分
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    public DimensionScoreInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DimensionScoreInfo(DimensionScoreInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Weight != null) {
            this.Weight = new Float(source.Weight);
        }
        if (source.UserId != null) {
            this.UserId = new Long(source.UserId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.JoinTableNumber != null) {
            this.JoinTableNumber = new Long(source.JoinTableNumber);
        }
        if (source.Score != null) {
            this.Score = new Float(source.Score);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "JoinTableNumber", this.JoinTableNumber);
        this.setParamSimple(map, prefix + "Score", this.Score);

    }
}

