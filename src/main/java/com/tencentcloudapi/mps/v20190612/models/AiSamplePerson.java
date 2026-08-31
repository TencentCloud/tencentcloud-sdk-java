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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiSamplePerson extends AbstractModel {

    /**
    * <p>人物 ID。</p>
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * <p>人物名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>人物描述。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>人脸信息。</p>
    */
    @SerializedName("FaceInfoSet")
    @Expose
    private AiSampleFaceInfo [] FaceInfoSet;

    /**
    * <p>人物标签。</p>
    */
    @SerializedName("TagSet")
    @Expose
    private String [] TagSet;

    /**
    * <p>应用场景。</p>
    */
    @SerializedName("UsageSet")
    @Expose
    private String [] UsageSet;

    /**
    * <p>创建时间，使用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>最后修改时间，使用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>人物 ID。</p> 
     * @return PersonId <p>人物 ID。</p>
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set <p>人物 ID。</p>
     * @param PersonId <p>人物 ID。</p>
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get <p>人物名称。</p> 
     * @return Name <p>人物名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>人物名称。</p>
     * @param Name <p>人物名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>人物描述。</p> 
     * @return Description <p>人物描述。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>人物描述。</p>
     * @param Description <p>人物描述。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>人脸信息。</p> 
     * @return FaceInfoSet <p>人脸信息。</p>
     */
    public AiSampleFaceInfo [] getFaceInfoSet() {
        return this.FaceInfoSet;
    }

    /**
     * Set <p>人脸信息。</p>
     * @param FaceInfoSet <p>人脸信息。</p>
     */
    public void setFaceInfoSet(AiSampleFaceInfo [] FaceInfoSet) {
        this.FaceInfoSet = FaceInfoSet;
    }

    /**
     * Get <p>人物标签。</p> 
     * @return TagSet <p>人物标签。</p>
     */
    public String [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set <p>人物标签。</p>
     * @param TagSet <p>人物标签。</p>
     */
    public void setTagSet(String [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get <p>应用场景。</p> 
     * @return UsageSet <p>应用场景。</p>
     */
    public String [] getUsageSet() {
        return this.UsageSet;
    }

    /**
     * Set <p>应用场景。</p>
     * @param UsageSet <p>应用场景。</p>
     */
    public void setUsageSet(String [] UsageSet) {
        this.UsageSet = UsageSet;
    }

    /**
     * Get <p>创建时间，使用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p> 
     * @return CreateTime <p>创建时间，使用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间，使用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
     * @param CreateTime <p>创建时间，使用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>最后修改时间，使用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p> 
     * @return UpdateTime <p>最后修改时间，使用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>最后修改时间，使用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
     * @param UpdateTime <p>最后修改时间，使用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public AiSamplePerson() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiSamplePerson(AiSamplePerson source) {
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.FaceInfoSet != null) {
            this.FaceInfoSet = new AiSampleFaceInfo[source.FaceInfoSet.length];
            for (int i = 0; i < source.FaceInfoSet.length; i++) {
                this.FaceInfoSet[i] = new AiSampleFaceInfo(source.FaceInfoSet[i]);
            }
        }
        if (source.TagSet != null) {
            this.TagSet = new String[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new String(source.TagSet[i]);
            }
        }
        if (source.UsageSet != null) {
            this.UsageSet = new String[source.UsageSet.length];
            for (int i = 0; i < source.UsageSet.length; i++) {
                this.UsageSet[i] = new String(source.UsageSet[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
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

