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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomResult extends AbstractModel{

    /**
    * 命中的自定义关键词
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
    * 自定义库id
    */
    @SerializedName("LibId")
    @Expose
    private String LibId;

    /**
    * 自定义词库名称
    */
    @SerializedName("LibName")
    @Expose
    private String LibName;

    /**
    * 命中的自定义关键词的类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 命中的自定义关键词 
     * @return Keywords 命中的自定义关键词
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set 命中的自定义关键词
     * @param Keywords 命中的自定义关键词
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get 自定义库id 
     * @return LibId 自定义库id
     */
    public String getLibId() {
        return this.LibId;
    }

    /**
     * Set 自定义库id
     * @param LibId 自定义库id
     */
    public void setLibId(String LibId) {
        this.LibId = LibId;
    }

    /**
     * Get 自定义词库名称 
     * @return LibName 自定义词库名称
     */
    public String getLibName() {
        return this.LibName;
    }

    /**
     * Set 自定义词库名称
     * @param LibName 自定义词库名称
     */
    public void setLibName(String LibName) {
        this.LibName = LibName;
    }

    /**
     * Get 命中的自定义关键词的类型 
     * @return Type 命中的自定义关键词的类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 命中的自定义关键词的类型
     * @param Type 命中的自定义关键词的类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public CustomResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomResult(CustomResult source) {
        if (source.Keywords != null) {
            this.Keywords = new String[source.Keywords.length];
            for (int i = 0; i < source.Keywords.length; i++) {
                this.Keywords[i] = new String(source.Keywords[i]);
            }
        }
        if (source.LibId != null) {
            this.LibId = new String(source.LibId);
        }
        if (source.LibName != null) {
            this.LibName = new String(source.LibName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);
        this.setParamSimple(map, prefix + "LibId", this.LibId);
        this.setParamSimple(map, prefix + "LibName", this.LibName);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

