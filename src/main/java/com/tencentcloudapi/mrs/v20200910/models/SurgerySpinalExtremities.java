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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SurgerySpinalExtremities extends AbstractModel {

    /**
    * 脊柱四肢总体描述
    */
    @SerializedName("Text")
    @Expose
    private KeyValueItem Text;

    /**
    * 脊柱
    */
    @SerializedName("SpinalColumn")
    @Expose
    private KeyValueItem SpinalColumn;

    /**
    * 四肢和关节
    */
    @SerializedName("LimbJoint")
    @Expose
    private KeyValueItem LimbJoint;

    /**
    * 平跛足
    */
    @SerializedName("Foot")
    @Expose
    private KeyValueItem Foot;

    /**
    * 骨骼
    */
    @SerializedName("Bone")
    @Expose
    private KeyValueItem Bone;

    /**
    * 步态
    */
    @SerializedName("Gait")
    @Expose
    private KeyValueItem Gait;

    /**
    * 残疾或畸形
    */
    @SerializedName("Deformity")
    @Expose
    private KeyValueItem Deformity;

    /**
     * Get 脊柱四肢总体描述 
     * @return Text 脊柱四肢总体描述
     */
    public KeyValueItem getText() {
        return this.Text;
    }

    /**
     * Set 脊柱四肢总体描述
     * @param Text 脊柱四肢总体描述
     */
    public void setText(KeyValueItem Text) {
        this.Text = Text;
    }

    /**
     * Get 脊柱 
     * @return SpinalColumn 脊柱
     */
    public KeyValueItem getSpinalColumn() {
        return this.SpinalColumn;
    }

    /**
     * Set 脊柱
     * @param SpinalColumn 脊柱
     */
    public void setSpinalColumn(KeyValueItem SpinalColumn) {
        this.SpinalColumn = SpinalColumn;
    }

    /**
     * Get 四肢和关节 
     * @return LimbJoint 四肢和关节
     */
    public KeyValueItem getLimbJoint() {
        return this.LimbJoint;
    }

    /**
     * Set 四肢和关节
     * @param LimbJoint 四肢和关节
     */
    public void setLimbJoint(KeyValueItem LimbJoint) {
        this.LimbJoint = LimbJoint;
    }

    /**
     * Get 平跛足 
     * @return Foot 平跛足
     */
    public KeyValueItem getFoot() {
        return this.Foot;
    }

    /**
     * Set 平跛足
     * @param Foot 平跛足
     */
    public void setFoot(KeyValueItem Foot) {
        this.Foot = Foot;
    }

    /**
     * Get 骨骼 
     * @return Bone 骨骼
     */
    public KeyValueItem getBone() {
        return this.Bone;
    }

    /**
     * Set 骨骼
     * @param Bone 骨骼
     */
    public void setBone(KeyValueItem Bone) {
        this.Bone = Bone;
    }

    /**
     * Get 步态 
     * @return Gait 步态
     */
    public KeyValueItem getGait() {
        return this.Gait;
    }

    /**
     * Set 步态
     * @param Gait 步态
     */
    public void setGait(KeyValueItem Gait) {
        this.Gait = Gait;
    }

    /**
     * Get 残疾或畸形 
     * @return Deformity 残疾或畸形
     */
    public KeyValueItem getDeformity() {
        return this.Deformity;
    }

    /**
     * Set 残疾或畸形
     * @param Deformity 残疾或畸形
     */
    public void setDeformity(KeyValueItem Deformity) {
        this.Deformity = Deformity;
    }

    public SurgerySpinalExtremities() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SurgerySpinalExtremities(SurgerySpinalExtremities source) {
        if (source.Text != null) {
            this.Text = new KeyValueItem(source.Text);
        }
        if (source.SpinalColumn != null) {
            this.SpinalColumn = new KeyValueItem(source.SpinalColumn);
        }
        if (source.LimbJoint != null) {
            this.LimbJoint = new KeyValueItem(source.LimbJoint);
        }
        if (source.Foot != null) {
            this.Foot = new KeyValueItem(source.Foot);
        }
        if (source.Bone != null) {
            this.Bone = new KeyValueItem(source.Bone);
        }
        if (source.Gait != null) {
            this.Gait = new KeyValueItem(source.Gait);
        }
        if (source.Deformity != null) {
            this.Deformity = new KeyValueItem(source.Deformity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Text.", this.Text);
        this.setParamObj(map, prefix + "SpinalColumn.", this.SpinalColumn);
        this.setParamObj(map, prefix + "LimbJoint.", this.LimbJoint);
        this.setParamObj(map, prefix + "Foot.", this.Foot);
        this.setParamObj(map, prefix + "Bone.", this.Bone);
        this.setParamObj(map, prefix + "Gait.", this.Gait);
        this.setParamObj(map, prefix + "Deformity.", this.Deformity);

    }
}

