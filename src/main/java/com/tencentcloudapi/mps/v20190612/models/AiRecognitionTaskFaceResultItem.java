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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiRecognitionTaskFaceResultItem extends AbstractModel{

    /**
    * 人物唯一标识 ID。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 人物库类型，表示识别出的人物来自哪个人物库：
<li>Default：默认人物库；</li>
<li>UserDefine：用户自定义人物库。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 人物名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 人物出现的片段结果集。
    */
    @SerializedName("SegmentSet")
    @Expose
    private AiRecognitionTaskFaceSegmentItem [] SegmentSet;

    /**
    * 人物性别：
<li>Male：男性；</li>
<li>Female：女性。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Gender")
    @Expose
    private String Gender;

    /**
    * 人物出生日期。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * 人物职业或者职务。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Profession")
    @Expose
    private String Profession;

    /**
    * 人物毕业院校。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchoolOfGraduation")
    @Expose
    private String SchoolOfGraduation;

    /**
    * 人物简介。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Abstract")
    @Expose
    private String Abstract;

    /**
    * 人物出生地或者籍贯。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlaceOfBirth")
    @Expose
    private String PlaceOfBirth;

    /**
    * 人物类型：
<li>Politician：官员；</li>
<li>Artist：艺人。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PersonType")
    @Expose
    private String PersonType;

    /**
    * 敏感度标注：
<li>Normal：正常；</li>
<li>Sensitive：敏感。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 截图链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get 人物唯一标识 ID。 
     * @return Id 人物唯一标识 ID。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 人物唯一标识 ID。
     * @param Id 人物唯一标识 ID。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 人物库类型，表示识别出的人物来自哪个人物库：
<li>Default：默认人物库；</li>
<li>UserDefine：用户自定义人物库。</li> 
     * @return Type 人物库类型，表示识别出的人物来自哪个人物库：
<li>Default：默认人物库；</li>
<li>UserDefine：用户自定义人物库。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 人物库类型，表示识别出的人物来自哪个人物库：
<li>Default：默认人物库；</li>
<li>UserDefine：用户自定义人物库。</li>
     * @param Type 人物库类型，表示识别出的人物来自哪个人物库：
<li>Default：默认人物库；</li>
<li>UserDefine：用户自定义人物库。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 人物名称。 
     * @return Name 人物名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 人物名称。
     * @param Name 人物名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 人物出现的片段结果集。 
     * @return SegmentSet 人物出现的片段结果集。
     */
    public AiRecognitionTaskFaceSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set 人物出现的片段结果集。
     * @param SegmentSet 人物出现的片段结果集。
     */
    public void setSegmentSet(AiRecognitionTaskFaceSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Get 人物性别：
<li>Male：男性；</li>
<li>Female：女性。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Gender 人物性别：
<li>Male：男性；</li>
<li>Female：女性。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGender() {
        return this.Gender;
    }

    /**
     * Set 人物性别：
<li>Male：男性；</li>
<li>Female：女性。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Gender 人物性别：
<li>Male：男性；</li>
<li>Female：女性。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * Get 人物出生日期。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Birthday 人物出生日期。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set 人物出生日期。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Birthday 人物出生日期。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get 人物职业或者职务。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Profession 人物职业或者职务。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProfession() {
        return this.Profession;
    }

    /**
     * Set 人物职业或者职务。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Profession 人物职业或者职务。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProfession(String Profession) {
        this.Profession = Profession;
    }

    /**
     * Get 人物毕业院校。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchoolOfGraduation 人物毕业院校。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchoolOfGraduation() {
        return this.SchoolOfGraduation;
    }

    /**
     * Set 人物毕业院校。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchoolOfGraduation 人物毕业院校。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchoolOfGraduation(String SchoolOfGraduation) {
        this.SchoolOfGraduation = SchoolOfGraduation;
    }

    /**
     * Get 人物简介。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Abstract 人物简介。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAbstract() {
        return this.Abstract;
    }

    /**
     * Set 人物简介。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Abstract 人物简介。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAbstract(String Abstract) {
        this.Abstract = Abstract;
    }

    /**
     * Get 人物出生地或者籍贯。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PlaceOfBirth 人物出生地或者籍贯。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPlaceOfBirth() {
        return this.PlaceOfBirth;
    }

    /**
     * Set 人物出生地或者籍贯。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlaceOfBirth 人物出生地或者籍贯。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlaceOfBirth(String PlaceOfBirth) {
        this.PlaceOfBirth = PlaceOfBirth;
    }

    /**
     * Get 人物类型：
<li>Politician：官员；</li>
<li>Artist：艺人。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PersonType 人物类型：
<li>Politician：官员；</li>
<li>Artist：艺人。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPersonType() {
        return this.PersonType;
    }

    /**
     * Set 人物类型：
<li>Politician：官员；</li>
<li>Artist：艺人。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PersonType 人物类型：
<li>Politician：官员；</li>
<li>Artist：艺人。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPersonType(String PersonType) {
        this.PersonType = PersonType;
    }

    /**
     * Get 敏感度标注：
<li>Normal：正常；</li>
<li>Sensitive：敏感。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 敏感度标注：
<li>Normal：正常；</li>
<li>Sensitive：敏感。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 敏感度标注：
<li>Normal：正常；</li>
<li>Sensitive：敏感。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 敏感度标注：
<li>Normal：正常；</li>
<li>Sensitive：敏感。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 截图链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url 截图链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 截图链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url 截图链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public AiRecognitionTaskFaceResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiRecognitionTaskFaceResultItem(AiRecognitionTaskFaceResultItem source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SegmentSet != null) {
            this.SegmentSet = new AiRecognitionTaskFaceSegmentItem[source.SegmentSet.length];
            for (int i = 0; i < source.SegmentSet.length; i++) {
                this.SegmentSet[i] = new AiRecognitionTaskFaceSegmentItem(source.SegmentSet[i]);
            }
        }
        if (source.Gender != null) {
            this.Gender = new String(source.Gender);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
        }
        if (source.Profession != null) {
            this.Profession = new String(source.Profession);
        }
        if (source.SchoolOfGraduation != null) {
            this.SchoolOfGraduation = new String(source.SchoolOfGraduation);
        }
        if (source.Abstract != null) {
            this.Abstract = new String(source.Abstract);
        }
        if (source.PlaceOfBirth != null) {
            this.PlaceOfBirth = new String(source.PlaceOfBirth);
        }
        if (source.PersonType != null) {
            this.PersonType = new String(source.PersonType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "Profession", this.Profession);
        this.setParamSimple(map, prefix + "SchoolOfGraduation", this.SchoolOfGraduation);
        this.setParamSimple(map, prefix + "Abstract", this.Abstract);
        this.setParamSimple(map, prefix + "PlaceOfBirth", this.PlaceOfBirth);
        this.setParamSimple(map, prefix + "PersonType", this.PersonType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

