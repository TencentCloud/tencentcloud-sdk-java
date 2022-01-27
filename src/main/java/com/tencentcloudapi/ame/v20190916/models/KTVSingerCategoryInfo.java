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

public class KTVSingerCategoryInfo extends AbstractModel{

    /**
    * 分类中文名
    */
    @SerializedName("ChineseName")
    @Expose
    private String ChineseName;

    /**
    * 分类英文名
    */
    @SerializedName("EnglishName")
    @Expose
    private String EnglishName;

    /**
     * Get 分类中文名 
     * @return ChineseName 分类中文名
     */
    public String getChineseName() {
        return this.ChineseName;
    }

    /**
     * Set 分类中文名
     * @param ChineseName 分类中文名
     */
    public void setChineseName(String ChineseName) {
        this.ChineseName = ChineseName;
    }

    /**
     * Get 分类英文名 
     * @return EnglishName 分类英文名
     */
    public String getEnglishName() {
        return this.EnglishName;
    }

    /**
     * Set 分类英文名
     * @param EnglishName 分类英文名
     */
    public void setEnglishName(String EnglishName) {
        this.EnglishName = EnglishName;
    }

    public KTVSingerCategoryInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KTVSingerCategoryInfo(KTVSingerCategoryInfo source) {
        if (source.ChineseName != null) {
            this.ChineseName = new String(source.ChineseName);
        }
        if (source.EnglishName != null) {
            this.EnglishName = new String(source.EnglishName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChineseName", this.ChineseName);
        this.setParamSimple(map, prefix + "EnglishName", this.EnglishName);

    }
}

