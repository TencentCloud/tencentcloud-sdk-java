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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PersonInfo extends AbstractModel {

    /**
    * 公众人物姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 公众人物职务
    */
    @SerializedName("Job")
    @Expose
    private String Job;

    /**
    * 首次出现模态，可选值为[1,3]，详细参见AppearIndex定义
    */
    @SerializedName("FirstAppear")
    @Expose
    private Long FirstAppear;

    /**
    * 人物出现信息
    */
    @SerializedName("AppearInfo")
    @Expose
    private AppearInfo AppearInfo;

    /**
    * 人脸在图片中的位置，仅在图片标签任务有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppearRect")
    @Expose
    private Rectf AppearRect;

    /**
    * 人物的personId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
     * Get 公众人物姓名 
     * @return Name 公众人物姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 公众人物姓名
     * @param Name 公众人物姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 公众人物职务 
     * @return Job 公众人物职务
     */
    public String getJob() {
        return this.Job;
    }

    /**
     * Set 公众人物职务
     * @param Job 公众人物职务
     */
    public void setJob(String Job) {
        this.Job = Job;
    }

    /**
     * Get 首次出现模态，可选值为[1,3]，详细参见AppearIndex定义 
     * @return FirstAppear 首次出现模态，可选值为[1,3]，详细参见AppearIndex定义
     */
    public Long getFirstAppear() {
        return this.FirstAppear;
    }

    /**
     * Set 首次出现模态，可选值为[1,3]，详细参见AppearIndex定义
     * @param FirstAppear 首次出现模态，可选值为[1,3]，详细参见AppearIndex定义
     */
    public void setFirstAppear(Long FirstAppear) {
        this.FirstAppear = FirstAppear;
    }

    /**
     * Get 人物出现信息 
     * @return AppearInfo 人物出现信息
     */
    public AppearInfo getAppearInfo() {
        return this.AppearInfo;
    }

    /**
     * Set 人物出现信息
     * @param AppearInfo 人物出现信息
     */
    public void setAppearInfo(AppearInfo AppearInfo) {
        this.AppearInfo = AppearInfo;
    }

    /**
     * Get 人脸在图片中的位置，仅在图片标签任务有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppearRect 人脸在图片中的位置，仅在图片标签任务有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Rectf getAppearRect() {
        return this.AppearRect;
    }

    /**
     * Set 人脸在图片中的位置，仅在图片标签任务有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppearRect 人脸在图片中的位置，仅在图片标签任务有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppearRect(Rectf AppearRect) {
        this.AppearRect = AppearRect;
    }

    /**
     * Get 人物的personId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PersonId 人物的personId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 人物的personId
注意：此字段可能返回 null，表示取不到有效值。
     * @param PersonId 人物的personId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    public PersonInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PersonInfo(PersonInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Job != null) {
            this.Job = new String(source.Job);
        }
        if (source.FirstAppear != null) {
            this.FirstAppear = new Long(source.FirstAppear);
        }
        if (source.AppearInfo != null) {
            this.AppearInfo = new AppearInfo(source.AppearInfo);
        }
        if (source.AppearRect != null) {
            this.AppearRect = new Rectf(source.AppearRect);
        }
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Job", this.Job);
        this.setParamSimple(map, prefix + "FirstAppear", this.FirstAppear);
        this.setParamObj(map, prefix + "AppearInfo.", this.AppearInfo);
        this.setParamObj(map, prefix + "AppearRect.", this.AppearRect);
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);

    }
}

