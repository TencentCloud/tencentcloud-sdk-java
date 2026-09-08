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
package com.tencentcloudapi.ams.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HitSnippetInfos extends AbstractModel {

    /**
    * <p>命中内容</p>
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * <p>文本命中的文本块</p>
    */
    @SerializedName("Snippet")
    @Expose
    private String Snippet;

    /**
    * <p>命中场景</p>
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * <p>命中类型</p>
    */
    @SerializedName("AtomicCategory")
    @Expose
    private String AtomicCategory;

    /**
    * <p>命中类型库/模型名称</p>
    */
    @SerializedName("AtomicName")
    @Expose
    private String AtomicName;

    /**
    * <p>命中原子能力</p>
    */
    @SerializedName("AtomicId")
    @Expose
    private String AtomicId;

    /**
    * <p>命中单位</p>
    */
    @SerializedName("UnitId")
    @Expose
    private String UnitId;

    /**
    * <p>命中单位名称</p>
    */
    @SerializedName("UnitName")
    @Expose
    private String UnitName;

    /**
    * <p>命中颗粒ID</p>
    */
    @SerializedName("ParticleId")
    @Expose
    private String ParticleId;

    /**
    * <p>命中文本在原文起始位置</p>
    */
    @SerializedName("Positions")
    @Expose
    private Position [] Positions;

    /**
    * <p>命中音时间位置</p>
    */
    @SerializedName("Duration")
    @Expose
    private Duration Duration;

    /**
    * <p>分数</p>
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
     * Get <p>命中内容</p> 
     * @return Target <p>命中内容</p>
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set <p>命中内容</p>
     * @param Target <p>命中内容</p>
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get <p>文本命中的文本块</p> 
     * @return Snippet <p>文本命中的文本块</p>
     */
    public String getSnippet() {
        return this.Snippet;
    }

    /**
     * Set <p>文本命中的文本块</p>
     * @param Snippet <p>文本命中的文本块</p>
     */
    public void setSnippet(String Snippet) {
        this.Snippet = Snippet;
    }

    /**
     * Get <p>命中场景</p> 
     * @return Scene <p>命中场景</p>
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set <p>命中场景</p>
     * @param Scene <p>命中场景</p>
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * Get <p>命中类型</p> 
     * @return AtomicCategory <p>命中类型</p>
     */
    public String getAtomicCategory() {
        return this.AtomicCategory;
    }

    /**
     * Set <p>命中类型</p>
     * @param AtomicCategory <p>命中类型</p>
     */
    public void setAtomicCategory(String AtomicCategory) {
        this.AtomicCategory = AtomicCategory;
    }

    /**
     * Get <p>命中类型库/模型名称</p> 
     * @return AtomicName <p>命中类型库/模型名称</p>
     */
    public String getAtomicName() {
        return this.AtomicName;
    }

    /**
     * Set <p>命中类型库/模型名称</p>
     * @param AtomicName <p>命中类型库/模型名称</p>
     */
    public void setAtomicName(String AtomicName) {
        this.AtomicName = AtomicName;
    }

    /**
     * Get <p>命中原子能力</p> 
     * @return AtomicId <p>命中原子能力</p>
     */
    public String getAtomicId() {
        return this.AtomicId;
    }

    /**
     * Set <p>命中原子能力</p>
     * @param AtomicId <p>命中原子能力</p>
     */
    public void setAtomicId(String AtomicId) {
        this.AtomicId = AtomicId;
    }

    /**
     * Get <p>命中单位</p> 
     * @return UnitId <p>命中单位</p>
     */
    public String getUnitId() {
        return this.UnitId;
    }

    /**
     * Set <p>命中单位</p>
     * @param UnitId <p>命中单位</p>
     */
    public void setUnitId(String UnitId) {
        this.UnitId = UnitId;
    }

    /**
     * Get <p>命中单位名称</p> 
     * @return UnitName <p>命中单位名称</p>
     */
    public String getUnitName() {
        return this.UnitName;
    }

    /**
     * Set <p>命中单位名称</p>
     * @param UnitName <p>命中单位名称</p>
     */
    public void setUnitName(String UnitName) {
        this.UnitName = UnitName;
    }

    /**
     * Get <p>命中颗粒ID</p> 
     * @return ParticleId <p>命中颗粒ID</p>
     */
    public String getParticleId() {
        return this.ParticleId;
    }

    /**
     * Set <p>命中颗粒ID</p>
     * @param ParticleId <p>命中颗粒ID</p>
     */
    public void setParticleId(String ParticleId) {
        this.ParticleId = ParticleId;
    }

    /**
     * Get <p>命中文本在原文起始位置</p> 
     * @return Positions <p>命中文本在原文起始位置</p>
     */
    public Position [] getPositions() {
        return this.Positions;
    }

    /**
     * Set <p>命中文本在原文起始位置</p>
     * @param Positions <p>命中文本在原文起始位置</p>
     */
    public void setPositions(Position [] Positions) {
        this.Positions = Positions;
    }

    /**
     * Get <p>命中音时间位置</p> 
     * @return Duration <p>命中音时间位置</p>
     */
    public Duration getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>命中音时间位置</p>
     * @param Duration <p>命中音时间位置</p>
     */
    public void setDuration(Duration Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>分数</p> 
     * @return Score <p>分数</p>
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set <p>分数</p>
     * @param Score <p>分数</p>
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    public HitSnippetInfos() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HitSnippetInfos(HitSnippetInfos source) {
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.Snippet != null) {
            this.Snippet = new String(source.Snippet);
        }
        if (source.Scene != null) {
            this.Scene = new String(source.Scene);
        }
        if (source.AtomicCategory != null) {
            this.AtomicCategory = new String(source.AtomicCategory);
        }
        if (source.AtomicName != null) {
            this.AtomicName = new String(source.AtomicName);
        }
        if (source.AtomicId != null) {
            this.AtomicId = new String(source.AtomicId);
        }
        if (source.UnitId != null) {
            this.UnitId = new String(source.UnitId);
        }
        if (source.UnitName != null) {
            this.UnitName = new String(source.UnitName);
        }
        if (source.ParticleId != null) {
            this.ParticleId = new String(source.ParticleId);
        }
        if (source.Positions != null) {
            this.Positions = new Position[source.Positions.length];
            for (int i = 0; i < source.Positions.length; i++) {
                this.Positions[i] = new Position(source.Positions[i]);
            }
        }
        if (source.Duration != null) {
            this.Duration = new Duration(source.Duration);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "Snippet", this.Snippet);
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "AtomicCategory", this.AtomicCategory);
        this.setParamSimple(map, prefix + "AtomicName", this.AtomicName);
        this.setParamSimple(map, prefix + "AtomicId", this.AtomicId);
        this.setParamSimple(map, prefix + "UnitId", this.UnitId);
        this.setParamSimple(map, prefix + "UnitName", this.UnitName);
        this.setParamSimple(map, prefix + "ParticleId", this.ParticleId);
        this.setParamArrayObj(map, prefix + "Positions.", this.Positions);
        this.setParamObj(map, prefix + "Duration.", this.Duration);
        this.setParamSimple(map, prefix + "Score", this.Score);

    }
}

