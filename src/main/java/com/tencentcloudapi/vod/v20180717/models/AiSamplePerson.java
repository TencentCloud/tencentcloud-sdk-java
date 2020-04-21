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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiSamplePerson extends AbstractModel{

    /**
    * 人物 ID。
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * 人物名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 人物描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 人脸信息。
    */
    @SerializedName("FaceInfoSet")
    @Expose
    private AiSampleFaceInfo [] FaceInfoSet;

    /**
    * 人物标签。
    */
    @SerializedName("TagSet")
    @Expose
    private String [] TagSet;

    /**
    * 应用场景。
    */
    @SerializedName("UsageSet")
    @Expose
    private String [] UsageSet;

    /**
    * 创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 人物 ID。 
     * @return PersonId 人物 ID。
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 人物 ID。
     * @param PersonId 人物 ID。
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
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
     * Get 人物描述。 
     * @return Description 人物描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 人物描述。
     * @param Description 人物描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 人脸信息。 
     * @return FaceInfoSet 人脸信息。
     */
    public AiSampleFaceInfo [] getFaceInfoSet() {
        return this.FaceInfoSet;
    }

    /**
     * Set 人脸信息。
     * @param FaceInfoSet 人脸信息。
     */
    public void setFaceInfoSet(AiSampleFaceInfo [] FaceInfoSet) {
        this.FaceInfoSet = FaceInfoSet;
    }

    /**
     * Get 人物标签。 
     * @return TagSet 人物标签。
     */
    public String [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 人物标签。
     * @param TagSet 人物标签。
     */
    public void setTagSet(String [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get 应用场景。 
     * @return UsageSet 应用场景。
     */
    public String [] getUsageSet() {
        return this.UsageSet;
    }

    /**
     * Set 应用场景。
     * @param UsageSet 应用场景。
     */
    public void setUsageSet(String [] UsageSet) {
        this.UsageSet = UsageSet;
    }

    /**
     * Get 创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return CreateTime 创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param CreateTime 创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return UpdateTime 最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param UpdateTime 最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "FaceInfoSet.", this.FaceInfoSet);
        this.setParamArraySimple(map, prefix + "TagSet.", this.TagSet);
        this.setParamArraySimple(map, prefix + "UsageSet.", this.UsageSet);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

