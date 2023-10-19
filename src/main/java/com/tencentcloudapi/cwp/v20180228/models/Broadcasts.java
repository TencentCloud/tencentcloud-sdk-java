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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Broadcasts extends AbstractModel {

    /**
    * 文章名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 类型：0=紧急通知，1=功能更新，2=行业荣誉，3=版本发布
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 副标题
    */
    @SerializedName("Subtitle")
    @Expose
    private String Subtitle;

    /**
    * 发布时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 文章唯一id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 危险程度  0：无， 1：严重， 2: 高危， 3:中危， 4: 低危
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
     * Get 文章名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Title 文章名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 文章名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param Title 文章名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 类型：0=紧急通知，1=功能更新，2=行业荣誉，3=版本发布
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 类型：0=紧急通知，1=功能更新，2=行业荣誉，3=版本发布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 类型：0=紧急通知，1=功能更新，2=行业荣誉，3=版本发布
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 类型：0=紧急通知，1=功能更新，2=行业荣誉，3=版本发布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 副标题 
     * @return Subtitle 副标题
     */
    public String getSubtitle() {
        return this.Subtitle;
    }

    /**
     * Set 副标题
     * @param Subtitle 副标题
     */
    public void setSubtitle(String Subtitle) {
        this.Subtitle = Subtitle;
    }

    /**
     * Get 发布时间 
     * @return CreateTime 发布时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 发布时间
     * @param CreateTime 发布时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 文章唯一id 
     * @return Id 文章唯一id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 文章唯一id
     * @param Id 文章唯一id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 危险程度  0：无， 1：严重， 2: 高危， 3:中危， 4: 低危 
     * @return Level 危险程度  0：无， 1：严重， 2: 高危， 3:中危， 4: 低危
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 危险程度  0：无， 1：严重， 2: 高危， 3:中危， 4: 低危
     * @param Level 危险程度  0：无， 1：严重， 2: 高危， 3:中危， 4: 低危
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    public Broadcasts() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Broadcasts(Broadcasts source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Subtitle != null) {
            this.Subtitle = new String(source.Subtitle);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Subtitle", this.Subtitle);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Level", this.Level);

    }
}

