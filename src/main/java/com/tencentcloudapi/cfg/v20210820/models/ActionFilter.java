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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActionFilter extends AbstractModel{

    /**
    * 关键字
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 搜索内容值
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get 关键字 
     * @return Keyword 关键字
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 关键字
     * @param Keyword 关键字
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 搜索内容值 
     * @return Values 搜索内容值
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 搜索内容值
     * @param Values 搜索内容值
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public ActionFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActionFilter(ActionFilter source) {
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

