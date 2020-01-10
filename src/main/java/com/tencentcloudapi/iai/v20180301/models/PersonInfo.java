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
package com.tencentcloudapi.iai.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PersonInfo extends AbstractModel{

    /**
    * 人员名称
    */
    @SerializedName("PersonName")
    @Expose
    private String PersonName;

    /**
    * 人员Id
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * 人员性别
    */
    @SerializedName("Gender")
    @Expose
    private Long Gender;

    /**
    * 人员描述字段内容
    */
    @SerializedName("PersonExDescriptions")
    @Expose
    private String [] PersonExDescriptions;

    /**
    * 包含的人脸照片列表
    */
    @SerializedName("FaceIds")
    @Expose
    private String [] FaceIds;

    /**
    * 人员的创建时间和日期 CreationTimestamp。CreationTimestamp 的值是自 Unix 纪元时间到Group创建时间的毫秒数。 
Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。有关更多信息，请参阅 Unix 时间。
    */
    @SerializedName("CreationTimestamp")
    @Expose
    private Long CreationTimestamp;

    /**
     * Get 人员名称 
     * @return PersonName 人员名称
     */
    public String getPersonName() {
        return this.PersonName;
    }

    /**
     * Set 人员名称
     * @param PersonName 人员名称
     */
    public void setPersonName(String PersonName) {
        this.PersonName = PersonName;
    }

    /**
     * Get 人员Id 
     * @return PersonId 人员Id
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 人员Id
     * @param PersonId 人员Id
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get 人员性别 
     * @return Gender 人员性别
     */
    public Long getGender() {
        return this.Gender;
    }

    /**
     * Set 人员性别
     * @param Gender 人员性别
     */
    public void setGender(Long Gender) {
        this.Gender = Gender;
    }

    /**
     * Get 人员描述字段内容 
     * @return PersonExDescriptions 人员描述字段内容
     */
    public String [] getPersonExDescriptions() {
        return this.PersonExDescriptions;
    }

    /**
     * Set 人员描述字段内容
     * @param PersonExDescriptions 人员描述字段内容
     */
    public void setPersonExDescriptions(String [] PersonExDescriptions) {
        this.PersonExDescriptions = PersonExDescriptions;
    }

    /**
     * Get 包含的人脸照片列表 
     * @return FaceIds 包含的人脸照片列表
     */
    public String [] getFaceIds() {
        return this.FaceIds;
    }

    /**
     * Set 包含的人脸照片列表
     * @param FaceIds 包含的人脸照片列表
     */
    public void setFaceIds(String [] FaceIds) {
        this.FaceIds = FaceIds;
    }

    /**
     * Get 人员的创建时间和日期 CreationTimestamp。CreationTimestamp 的值是自 Unix 纪元时间到Group创建时间的毫秒数。 
Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。有关更多信息，请参阅 Unix 时间。 
     * @return CreationTimestamp 人员的创建时间和日期 CreationTimestamp。CreationTimestamp 的值是自 Unix 纪元时间到Group创建时间的毫秒数。 
Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。有关更多信息，请参阅 Unix 时间。
     */
    public Long getCreationTimestamp() {
        return this.CreationTimestamp;
    }

    /**
     * Set 人员的创建时间和日期 CreationTimestamp。CreationTimestamp 的值是自 Unix 纪元时间到Group创建时间的毫秒数。 
Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。有关更多信息，请参阅 Unix 时间。
     * @param CreationTimestamp 人员的创建时间和日期 CreationTimestamp。CreationTimestamp 的值是自 Unix 纪元时间到Group创建时间的毫秒数。 
Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。有关更多信息，请参阅 Unix 时间。
     */
    public void setCreationTimestamp(Long CreationTimestamp) {
        this.CreationTimestamp = CreationTimestamp;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonName", this.PersonName);
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamArraySimple(map, prefix + "PersonExDescriptions.", this.PersonExDescriptions);
        this.setParamArraySimple(map, prefix + "FaceIds.", this.FaceIds);
        this.setParamSimple(map, prefix + "CreationTimestamp", this.CreationTimestamp);

    }
}

