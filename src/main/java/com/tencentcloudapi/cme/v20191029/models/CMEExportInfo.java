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

public class CMEExportInfo extends AbstractModel{

    /**
    * 导出的归属者。
    */
    @SerializedName("Owner")
    @Expose
    private Entity Owner;

    /**
    * 导出的素材名称，不得超过30个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 导出的素材信息，不得超过50个字符。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 导出的素材分类路径，长度不能超过15字符。
    */
    @SerializedName("ClassPath")
    @Expose
    private String ClassPath;

    /**
    * 导出的素材标签，单个标签不得超过10个字符。
    */
    @SerializedName("TagSet")
    @Expose
    private String [] TagSet;

    /**
     * Get 导出的归属者。 
     * @return Owner 导出的归属者。
     */
    public Entity getOwner() {
        return this.Owner;
    }

    /**
     * Set 导出的归属者。
     * @param Owner 导出的归属者。
     */
    public void setOwner(Entity Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 导出的素材名称，不得超过30个字符。 
     * @return Name 导出的素材名称，不得超过30个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 导出的素材名称，不得超过30个字符。
     * @param Name 导出的素材名称，不得超过30个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 导出的素材信息，不得超过50个字符。 
     * @return Description 导出的素材信息，不得超过50个字符。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 导出的素材信息，不得超过50个字符。
     * @param Description 导出的素材信息，不得超过50个字符。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 导出的素材分类路径，长度不能超过15字符。 
     * @return ClassPath 导出的素材分类路径，长度不能超过15字符。
     */
    public String getClassPath() {
        return this.ClassPath;
    }

    /**
     * Set 导出的素材分类路径，长度不能超过15字符。
     * @param ClassPath 导出的素材分类路径，长度不能超过15字符。
     */
    public void setClassPath(String ClassPath) {
        this.ClassPath = ClassPath;
    }

    /**
     * Get 导出的素材标签，单个标签不得超过10个字符。 
     * @return TagSet 导出的素材标签，单个标签不得超过10个字符。
     */
    public String [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 导出的素材标签，单个标签不得超过10个字符。
     * @param TagSet 导出的素材标签，单个标签不得超过10个字符。
     */
    public void setTagSet(String [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Owner.", this.Owner);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ClassPath", this.ClassPath);
        this.setParamArraySimple(map, prefix + "TagSet.", this.TagSet);

    }
}

