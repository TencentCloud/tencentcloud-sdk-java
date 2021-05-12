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

public class VODExportInfo extends AbstractModel{

    /**
    * 导出的媒资名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 导出的媒资分类 Id。
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * 第三方平台发布信息列表。暂未正式对外，请勿使用。
    */
    @SerializedName("ThirdPartyPublishInfos")
    @Expose
    private ThirdPartyPublishInfo [] ThirdPartyPublishInfos;

    /**
     * Get 导出的媒资名称。 
     * @return Name 导出的媒资名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 导出的媒资名称。
     * @param Name 导出的媒资名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 导出的媒资分类 Id。 
     * @return ClassId 导出的媒资分类 Id。
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set 导出的媒资分类 Id。
     * @param ClassId 导出的媒资分类 Id。
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
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

    public VODExportInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VODExportInfo(VODExportInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ClassId != null) {
            this.ClassId = new Long(source.ClassId);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamArrayObj(map, prefix + "ThirdPartyPublishInfos.", this.ThirdPartyPublishInfos);

    }
}

