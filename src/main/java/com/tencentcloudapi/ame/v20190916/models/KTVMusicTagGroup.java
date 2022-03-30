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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KTVMusicTagGroup extends AbstractModel{

    /**
    * 标签分组英文名
    */
    @SerializedName("EnglishGroupName")
    @Expose
    private String EnglishGroupName;

    /**
    * 标签分组中文名
    */
    @SerializedName("ChineseGroupName")
    @Expose
    private String ChineseGroupName;

    /**
    * 标签分类下标签列表
    */
    @SerializedName("TagSet")
    @Expose
    private KTVMusicTagInfo [] TagSet;

    /**
     * Get 标签分组英文名 
     * @return EnglishGroupName 标签分组英文名
     */
    public String getEnglishGroupName() {
        return this.EnglishGroupName;
    }

    /**
     * Set 标签分组英文名
     * @param EnglishGroupName 标签分组英文名
     */
    public void setEnglishGroupName(String EnglishGroupName) {
        this.EnglishGroupName = EnglishGroupName;
    }

    /**
     * Get 标签分组中文名 
     * @return ChineseGroupName 标签分组中文名
     */
    public String getChineseGroupName() {
        return this.ChineseGroupName;
    }

    /**
     * Set 标签分组中文名
     * @param ChineseGroupName 标签分组中文名
     */
    public void setChineseGroupName(String ChineseGroupName) {
        this.ChineseGroupName = ChineseGroupName;
    }

    /**
     * Get 标签分类下标签列表 
     * @return TagSet 标签分类下标签列表
     */
    public KTVMusicTagInfo [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 标签分类下标签列表
     * @param TagSet 标签分类下标签列表
     */
    public void setTagSet(KTVMusicTagInfo [] TagSet) {
        this.TagSet = TagSet;
    }

    public KTVMusicTagGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KTVMusicTagGroup(KTVMusicTagGroup source) {
        if (source.EnglishGroupName != null) {
            this.EnglishGroupName = new String(source.EnglishGroupName);
        }
        if (source.ChineseGroupName != null) {
            this.ChineseGroupName = new String(source.ChineseGroupName);
        }
        if (source.TagSet != null) {
            this.TagSet = new KTVMusicTagInfo[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new KTVMusicTagInfo(source.TagSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnglishGroupName", this.EnglishGroupName);
        this.setParamSimple(map, prefix + "ChineseGroupName", this.ChineseGroupName);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}

