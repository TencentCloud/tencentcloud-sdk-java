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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImagePolityDetect extends AbstractModel {

    /**
    * 恶意类型
100：正常 
20001：政治
    */
    @SerializedName("EvilType")
    @Expose
    private Long EvilType;

    /**
    * 处置判定  0：正常 1：可疑
    */
    @SerializedName("HitFlag")
    @Expose
    private Long HitFlag;

    /**
    * 命中的人脸名称
    */
    @SerializedName("FaceNames")
    @Expose
    private String [] FaceNames;

    /**
    * 命中的logo标签信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolityLogoDetail")
    @Expose
    private Logo [] PolityLogoDetail;

    /**
    * 命中的政治物品名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolityItems")
    @Expose
    private String [] PolityItems;

    /**
    * 政治（人脸）分：分值范围 0-100，分数越高可疑程度越高
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 关键词明细
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
     * Get 恶意类型
100：正常 
20001：政治 
     * @return EvilType 恶意类型
100：正常 
20001：政治
     */
    public Long getEvilType() {
        return this.EvilType;
    }

    /**
     * Set 恶意类型
100：正常 
20001：政治
     * @param EvilType 恶意类型
100：正常 
20001：政治
     */
    public void setEvilType(Long EvilType) {
        this.EvilType = EvilType;
    }

    /**
     * Get 处置判定  0：正常 1：可疑 
     * @return HitFlag 处置判定  0：正常 1：可疑
     */
    public Long getHitFlag() {
        return this.HitFlag;
    }

    /**
     * Set 处置判定  0：正常 1：可疑
     * @param HitFlag 处置判定  0：正常 1：可疑
     */
    public void setHitFlag(Long HitFlag) {
        this.HitFlag = HitFlag;
    }

    /**
     * Get 命中的人脸名称 
     * @return FaceNames 命中的人脸名称
     */
    public String [] getFaceNames() {
        return this.FaceNames;
    }

    /**
     * Set 命中的人脸名称
     * @param FaceNames 命中的人脸名称
     */
    public void setFaceNames(String [] FaceNames) {
        this.FaceNames = FaceNames;
    }

    /**
     * Get 命中的logo标签信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolityLogoDetail 命中的logo标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Logo [] getPolityLogoDetail() {
        return this.PolityLogoDetail;
    }

    /**
     * Set 命中的logo标签信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolityLogoDetail 命中的logo标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolityLogoDetail(Logo [] PolityLogoDetail) {
        this.PolityLogoDetail = PolityLogoDetail;
    }

    /**
     * Get 命中的政治物品名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolityItems 命中的政治物品名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPolityItems() {
        return this.PolityItems;
    }

    /**
     * Set 命中的政治物品名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolityItems 命中的政治物品名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolityItems(String [] PolityItems) {
        this.PolityItems = PolityItems;
    }

    /**
     * Get 政治（人脸）分：分值范围 0-100，分数越高可疑程度越高 
     * @return Score 政治（人脸）分：分值范围 0-100，分数越高可疑程度越高
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 政治（人脸）分：分值范围 0-100，分数越高可疑程度越高
     * @param Score 政治（人脸）分：分值范围 0-100，分数越高可疑程度越高
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 关键词明细 
     * @return Keywords 关键词明细
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set 关键词明细
     * @param Keywords 关键词明细
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    public ImagePolityDetect() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImagePolityDetect(ImagePolityDetect source) {
        if (source.EvilType != null) {
            this.EvilType = new Long(source.EvilType);
        }
        if (source.HitFlag != null) {
            this.HitFlag = new Long(source.HitFlag);
        }
        if (source.FaceNames != null) {
            this.FaceNames = new String[source.FaceNames.length];
            for (int i = 0; i < source.FaceNames.length; i++) {
                this.FaceNames[i] = new String(source.FaceNames[i]);
            }
        }
        if (source.PolityLogoDetail != null) {
            this.PolityLogoDetail = new Logo[source.PolityLogoDetail.length];
            for (int i = 0; i < source.PolityLogoDetail.length; i++) {
                this.PolityLogoDetail[i] = new Logo(source.PolityLogoDetail[i]);
            }
        }
        if (source.PolityItems != null) {
            this.PolityItems = new String[source.PolityItems.length];
            for (int i = 0; i < source.PolityItems.length; i++) {
                this.PolityItems[i] = new String(source.PolityItems[i]);
            }
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.Keywords != null) {
            this.Keywords = new String[source.Keywords.length];
            for (int i = 0; i < source.Keywords.length; i++) {
                this.Keywords[i] = new String(source.Keywords[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EvilType", this.EvilType);
        this.setParamSimple(map, prefix + "HitFlag", this.HitFlag);
        this.setParamArraySimple(map, prefix + "FaceNames.", this.FaceNames);
        this.setParamArrayObj(map, prefix + "PolityLogoDetail.", this.PolityLogoDetail);
        this.setParamArraySimple(map, prefix + "PolityItems.", this.PolityItems);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);

    }
}

