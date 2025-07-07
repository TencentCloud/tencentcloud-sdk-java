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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PackSpec extends AbstractModel {

    /**
    * 层级
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 比例
    */
    @SerializedName("Rate")
    @Expose
    private Long Rate;

    /**
    * 数量
    */
    @SerializedName("Amount")
    @Expose
    private Long Amount;

    /**
    * 码规则ID
    */
    @SerializedName("CustomId")
    @Expose
    private String CustomId;

    /**
    * 码段配置
    */
    @SerializedName("CodeParts")
    @Expose
    private CodePart [] CodeParts;

    /**
    * 包装单位
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 场景值
    */
    @SerializedName("SceneCode")
    @Expose
    private Long SceneCode;

    /**
     * Get 层级 
     * @return Level 层级
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 层级
     * @param Level 层级
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 比例 
     * @return Rate 比例
     */
    public Long getRate() {
        return this.Rate;
    }

    /**
     * Set 比例
     * @param Rate 比例
     */
    public void setRate(Long Rate) {
        this.Rate = Rate;
    }

    /**
     * Get 数量 
     * @return Amount 数量
     */
    public Long getAmount() {
        return this.Amount;
    }

    /**
     * Set 数量
     * @param Amount 数量
     */
    public void setAmount(Long Amount) {
        this.Amount = Amount;
    }

    /**
     * Get 码规则ID 
     * @return CustomId 码规则ID
     */
    public String getCustomId() {
        return this.CustomId;
    }

    /**
     * Set 码规则ID
     * @param CustomId 码规则ID
     */
    public void setCustomId(String CustomId) {
        this.CustomId = CustomId;
    }

    /**
     * Get 码段配置 
     * @return CodeParts 码段配置
     */
    public CodePart [] getCodeParts() {
        return this.CodeParts;
    }

    /**
     * Set 码段配置
     * @param CodeParts 码段配置
     */
    public void setCodeParts(CodePart [] CodeParts) {
        this.CodeParts = CodeParts;
    }

    /**
     * Get 包装单位 
     * @return Unit 包装单位
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 包装单位
     * @param Unit 包装单位
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 场景值 
     * @return SceneCode 场景值
     */
    public Long getSceneCode() {
        return this.SceneCode;
    }

    /**
     * Set 场景值
     * @param SceneCode 场景值
     */
    public void setSceneCode(Long SceneCode) {
        this.SceneCode = SceneCode;
    }

    public PackSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PackSpec(PackSpec source) {
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Rate != null) {
            this.Rate = new Long(source.Rate);
        }
        if (source.Amount != null) {
            this.Amount = new Long(source.Amount);
        }
        if (source.CustomId != null) {
            this.CustomId = new String(source.CustomId);
        }
        if (source.CodeParts != null) {
            this.CodeParts = new CodePart[source.CodeParts.length];
            for (int i = 0; i < source.CodeParts.length; i++) {
                this.CodeParts[i] = new CodePart(source.CodeParts[i]);
            }
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.SceneCode != null) {
            this.SceneCode = new Long(source.SceneCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Rate", this.Rate);
        this.setParamSimple(map, prefix + "Amount", this.Amount);
        this.setParamSimple(map, prefix + "CustomId", this.CustomId);
        this.setParamArrayObj(map, prefix + "CodeParts.", this.CodeParts);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "SceneCode", this.SceneCode);

    }
}

