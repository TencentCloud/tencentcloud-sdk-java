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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CharsetCollationItem extends AbstractModel {

    /**
    * <p>字符集</p>
    */
    @SerializedName("CharsetName")
    @Expose
    private String CharsetName;

    /**
    * <p>排序规则</p>
    */
    @SerializedName("Collations")
    @Expose
    private String [] Collations;

    /**
    * <p>默认的排序规则</p>
    */
    @SerializedName("DefaultCollation")
    @Expose
    private String DefaultCollation;

    /**
     * Get <p>字符集</p> 
     * @return CharsetName <p>字符集</p>
     */
    public String getCharsetName() {
        return this.CharsetName;
    }

    /**
     * Set <p>字符集</p>
     * @param CharsetName <p>字符集</p>
     */
    public void setCharsetName(String CharsetName) {
        this.CharsetName = CharsetName;
    }

    /**
     * Get <p>排序规则</p> 
     * @return Collations <p>排序规则</p>
     */
    public String [] getCollations() {
        return this.Collations;
    }

    /**
     * Set <p>排序规则</p>
     * @param Collations <p>排序规则</p>
     */
    public void setCollations(String [] Collations) {
        this.Collations = Collations;
    }

    /**
     * Get <p>默认的排序规则</p> 
     * @return DefaultCollation <p>默认的排序规则</p>
     */
    public String getDefaultCollation() {
        return this.DefaultCollation;
    }

    /**
     * Set <p>默认的排序规则</p>
     * @param DefaultCollation <p>默认的排序规则</p>
     */
    public void setDefaultCollation(String DefaultCollation) {
        this.DefaultCollation = DefaultCollation;
    }

    public CharsetCollationItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CharsetCollationItem(CharsetCollationItem source) {
        if (source.CharsetName != null) {
            this.CharsetName = new String(source.CharsetName);
        }
        if (source.Collations != null) {
            this.Collations = new String[source.Collations.length];
            for (int i = 0; i < source.Collations.length; i++) {
                this.Collations[i] = new String(source.Collations[i]);
            }
        }
        if (source.DefaultCollation != null) {
            this.DefaultCollation = new String(source.DefaultCollation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CharsetName", this.CharsetName);
        this.setParamArraySimple(map, prefix + "Collations.", this.Collations);
        this.setParamSimple(map, prefix + "DefaultCollation", this.DefaultCollation);

    }
}

