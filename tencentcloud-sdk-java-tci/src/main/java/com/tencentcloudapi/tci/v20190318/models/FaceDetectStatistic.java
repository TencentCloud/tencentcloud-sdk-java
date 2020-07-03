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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FaceDetectStatistic extends AbstractModel{

    /**
    * 人脸大小占画面平均占比
    */
    @SerializedName("FaceSizeRatio")
    @Expose
    private Float FaceSizeRatio;

    /**
    * 检测到正脸次数
    */
    @SerializedName("FrontalFaceCount")
    @Expose
    private Long FrontalFaceCount;

    /**
    * 正脸时长占比
    */
    @SerializedName("FrontalFaceRatio")
    @Expose
    private Float FrontalFaceRatio;

    /**
    * 正脸时长在总出现时常占比
    */
    @SerializedName("FrontalFaceRealRatio")
    @Expose
    private Float FrontalFaceRealRatio;

    /**
    * 人员唯一标识符
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * 检测到侧脸次数
    */
    @SerializedName("SideFaceCount")
    @Expose
    private Long SideFaceCount;

    /**
    * 侧脸时长占比
    */
    @SerializedName("SideFaceRatio")
    @Expose
    private Float SideFaceRatio;

    /**
    * 侧脸时长在总出现时常占比
    */
    @SerializedName("SideFaceRealRatio")
    @Expose
    private Float SideFaceRealRatio;

    /**
     * Get 人脸大小占画面平均占比 
     * @return FaceSizeRatio 人脸大小占画面平均占比
     */
    public Float getFaceSizeRatio() {
        return this.FaceSizeRatio;
    }

    /**
     * Set 人脸大小占画面平均占比
     * @param FaceSizeRatio 人脸大小占画面平均占比
     */
    public void setFaceSizeRatio(Float FaceSizeRatio) {
        this.FaceSizeRatio = FaceSizeRatio;
    }

    /**
     * Get 检测到正脸次数 
     * @return FrontalFaceCount 检测到正脸次数
     */
    public Long getFrontalFaceCount() {
        return this.FrontalFaceCount;
    }

    /**
     * Set 检测到正脸次数
     * @param FrontalFaceCount 检测到正脸次数
     */
    public void setFrontalFaceCount(Long FrontalFaceCount) {
        this.FrontalFaceCount = FrontalFaceCount;
    }

    /**
     * Get 正脸时长占比 
     * @return FrontalFaceRatio 正脸时长占比
     */
    public Float getFrontalFaceRatio() {
        return this.FrontalFaceRatio;
    }

    /**
     * Set 正脸时长占比
     * @param FrontalFaceRatio 正脸时长占比
     */
    public void setFrontalFaceRatio(Float FrontalFaceRatio) {
        this.FrontalFaceRatio = FrontalFaceRatio;
    }

    /**
     * Get 正脸时长在总出现时常占比 
     * @return FrontalFaceRealRatio 正脸时长在总出现时常占比
     */
    public Float getFrontalFaceRealRatio() {
        return this.FrontalFaceRealRatio;
    }

    /**
     * Set 正脸时长在总出现时常占比
     * @param FrontalFaceRealRatio 正脸时长在总出现时常占比
     */
    public void setFrontalFaceRealRatio(Float FrontalFaceRealRatio) {
        this.FrontalFaceRealRatio = FrontalFaceRealRatio;
    }

    /**
     * Get 人员唯一标识符 
     * @return PersonId 人员唯一标识符
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 人员唯一标识符
     * @param PersonId 人员唯一标识符
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get 检测到侧脸次数 
     * @return SideFaceCount 检测到侧脸次数
     */
    public Long getSideFaceCount() {
        return this.SideFaceCount;
    }

    /**
     * Set 检测到侧脸次数
     * @param SideFaceCount 检测到侧脸次数
     */
    public void setSideFaceCount(Long SideFaceCount) {
        this.SideFaceCount = SideFaceCount;
    }

    /**
     * Get 侧脸时长占比 
     * @return SideFaceRatio 侧脸时长占比
     */
    public Float getSideFaceRatio() {
        return this.SideFaceRatio;
    }

    /**
     * Set 侧脸时长占比
     * @param SideFaceRatio 侧脸时长占比
     */
    public void setSideFaceRatio(Float SideFaceRatio) {
        this.SideFaceRatio = SideFaceRatio;
    }

    /**
     * Get 侧脸时长在总出现时常占比 
     * @return SideFaceRealRatio 侧脸时长在总出现时常占比
     */
    public Float getSideFaceRealRatio() {
        return this.SideFaceRealRatio;
    }

    /**
     * Set 侧脸时长在总出现时常占比
     * @param SideFaceRealRatio 侧脸时长在总出现时常占比
     */
    public void setSideFaceRealRatio(Float SideFaceRealRatio) {
        this.SideFaceRealRatio = SideFaceRealRatio;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FaceSizeRatio", this.FaceSizeRatio);
        this.setParamSimple(map, prefix + "FrontalFaceCount", this.FrontalFaceCount);
        this.setParamSimple(map, prefix + "FrontalFaceRatio", this.FrontalFaceRatio);
        this.setParamSimple(map, prefix + "FrontalFaceRealRatio", this.FrontalFaceRealRatio);
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "SideFaceCount", this.SideFaceCount);
        this.setParamSimple(map, prefix + "SideFaceRatio", this.SideFaceRatio);
        this.setParamSimple(map, prefix + "SideFaceRealRatio", this.SideFaceRealRatio);

    }
}

