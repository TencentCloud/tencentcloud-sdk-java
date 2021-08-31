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
    * 导出媒体归属，个人或团队。
    */
    @SerializedName("Owner")
    @Expose
    private Entity Owner;

    /**
    * 导出的媒体名称，不得超过30个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 导出的媒体信息，不得超过50个字符。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 导出的媒体分类路径，长度不能超过15字符。不存在默认创建。
    */
    @SerializedName("ClassPath")
    @Expose
    private String ClassPath;

    /**
    * 导出的媒体标签，单个标签不得超过10个字符。
    */
    @SerializedName("TagSet")
    @Expose
    private String [] TagSet;

    /**
    * 第三方平台发布信息列表。暂未正式对外，请勿使用。
    */
    @SerializedName("ThirdPartyPublishInfos")
    @Expose
    private ThirdPartyPublishInfo [] ThirdPartyPublishInfos;

    /**
     * Get 导出媒体归属，个人或团队。 
     * @return Owner 导出媒体归属，个人或团队。
     */
    public Entity getOwner() {
        return this.Owner;
    }

    /**
     * Set 导出媒体归属，个人或团队。
     * @param Owner 导出媒体归属，个人或团队。
     */
    public void setOwner(Entity Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 导出的媒体名称，不得超过30个字符。 
     * @return Name 导出的媒体名称，不得超过30个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 导出的媒体名称，不得超过30个字符。
     * @param Name 导出的媒体名称，不得超过30个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 导出的媒体信息，不得超过50个字符。 
     * @return Description 导出的媒体信息，不得超过50个字符。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 导出的媒体信息，不得超过50个字符。
     * @param Description 导出的媒体信息，不得超过50个字符。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 导出的媒体分类路径，长度不能超过15字符。不存在默认创建。 
     * @return ClassPath 导出的媒体分类路径，长度不能超过15字符。不存在默认创建。
     */
    public String getClassPath() {
        return this.ClassPath;
    }

    /**
     * Set 导出的媒体分类路径，长度不能超过15字符。不存在默认创建。
     * @param ClassPath 导出的媒体分类路径，长度不能超过15字符。不存在默认创建。
     */
    public void setClassPath(String ClassPath) {
        this.ClassPath = ClassPath;
    }

    /**
     * Get 导出的媒体标签，单个标签不得超过10个字符。 
     * @return TagSet 导出的媒体标签，单个标签不得超过10个字符。
     */
    public String [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 导出的媒体标签，单个标签不得超过10个字符。
     * @param TagSet 导出的媒体标签，单个标签不得超过10个字符。
     */
    public void setTagSet(String [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get 第三方平台发布信息列表。暂未正式对外，请勿使用。 
     * @return ThirdPartyPublishInfos 第三方平台发布信息列表。暂未正式对外，请勿使用。
     */
    public ThirdPartyPublishInfo [] getThirdPartyPublishInfos() {
        return this.ThirdPartyPublishInfos;
    }

    /**
     * Set 第三方平台发布信息列表。暂未正式对外，请勿使用。
     * @param ThirdPartyPublishInfos 第三方平台发布信息列表。暂未正式对外，请勿使用。
     */
    public void setThirdPartyPublishInfos(ThirdPartyPublishInfo [] ThirdPartyPublishInfos) {
        this.ThirdPartyPublishInfos = ThirdPartyPublishInfos;
    }

    public CMEExportInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CMEExportInfo(CMEExportInfo source) {
        if (source.Owner != null) {
            this.Owner = new Entity(source.Owner);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ClassPath != null) {
            this.ClassPath = new String(source.ClassPath);
        }
        if (source.TagSet != null) {
            this.TagSet = new String[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new String(source.TagSet[i]);
            }
        }
        if (source.ThirdPartyPublishInfos != null) {
            this.ThirdPartyPublishInfos = new ThirdPartyPublishInfo[source.ThirdPartyPublishInfos.length];
            for (int i = 0; i < source.ThirdPartyPublishInfos.length; i++) {
                this.ThirdPartyPublishInfos[i] = new ThirdPartyPublishInfo(source.ThirdPartyPublishInfos[i]);
            }
        }
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
        this.setParamArrayObj(map, prefix + "ThirdPartyPublishInfos.", this.ThirdPartyPublishInfos);

    }
}

