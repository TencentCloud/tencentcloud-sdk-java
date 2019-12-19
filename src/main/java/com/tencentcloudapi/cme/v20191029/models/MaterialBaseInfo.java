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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MaterialBaseInfo extends AbstractModel{

    /**
    * 素材名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述信息。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 分类路径。
    */
    @SerializedName("ClassPath")
    @Expose
    private String ClassPath;

    /**
    * 标签集合。
    */
    @SerializedName("TagSet")
    @Expose
    private String [] TagSet;

    /**
    * 归属者。
    */
    @SerializedName("Owner")
    @Expose
    private Entity Owner;

    /**
    * 素材类型。
    */
    @SerializedName("MaterialType")
    @Expose
    private String MaterialType;

    /**
    * 素材 URL。
    */
    @SerializedName("MaterialUrl")
    @Expose
    private String MaterialUrl;

    /**
    * 云点播媒资 FileId。
    */
    @SerializedName("VodFileId")
    @Expose
    private String VodFileId;

    /**
    * 创建时间，格式按照 ISO 8601 标准表示。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 素材名称。 
     * @return Name 素材名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 素材名称。
     * @param Name 素材名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 描述信息。 
     * @return Description 描述信息。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述信息。
     * @param Description 描述信息。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 分类路径。 
     * @return ClassPath 分类路径。
     */
    public String getClassPath() {
        return this.ClassPath;
    }

    /**
     * Set 分类路径。
     * @param ClassPath 分类路径。
     */
    public void setClassPath(String ClassPath) {
        this.ClassPath = ClassPath;
    }

    /**
     * Get 标签集合。 
     * @return TagSet 标签集合。
     */
    public String [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 标签集合。
     * @param TagSet 标签集合。
     */
    public void setTagSet(String [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get 归属者。 
     * @return Owner 归属者。
     */
    public Entity getOwner() {
        return this.Owner;
    }

    /**
     * Set 归属者。
     * @param Owner 归属者。
     */
    public void setOwner(Entity Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 素材类型。 
     * @return MaterialType 素材类型。
     */
    public String getMaterialType() {
        return this.MaterialType;
    }

    /**
     * Set 素材类型。
     * @param MaterialType 素材类型。
     */
    public void setMaterialType(String MaterialType) {
        this.MaterialType = MaterialType;
    }

    /**
     * Get 素材 URL。 
     * @return MaterialUrl 素材 URL。
     */
    public String getMaterialUrl() {
        return this.MaterialUrl;
    }

    /**
     * Set 素材 URL。
     * @param MaterialUrl 素材 URL。
     */
    public void setMaterialUrl(String MaterialUrl) {
        this.MaterialUrl = MaterialUrl;
    }

    /**
     * Get 云点播媒资 FileId。 
     * @return VodFileId 云点播媒资 FileId。
     */
    public String getVodFileId() {
        return this.VodFileId;
    }

    /**
     * Set 云点播媒资 FileId。
     * @param VodFileId 云点播媒资 FileId。
     */
    public void setVodFileId(String VodFileId) {
        this.VodFileId = VodFileId;
    }

    /**
     * Get 创建时间，格式按照 ISO 8601 标准表示。 
     * @return CreateTime 创建时间，格式按照 ISO 8601 标准表示。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，格式按照 ISO 8601 标准表示。
     * @param CreateTime 创建时间，格式按照 ISO 8601 标准表示。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ClassPath", this.ClassPath);
        this.setParamArraySimple(map, prefix + "TagSet.", this.TagSet);
        this.setParamObj(map, prefix + "Owner.", this.Owner);
        this.setParamSimple(map, prefix + "MaterialType", this.MaterialType);
        this.setParamSimple(map, prefix + "MaterialUrl", this.MaterialUrl);
        this.setParamSimple(map, prefix + "VodFileId", this.VodFileId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

