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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StandardTerm extends AbstractModel {

    /**
    * 标签
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * 条款
    */
    @SerializedName("Terms")
    @Expose
    private String [] Terms;

    /**
     * Get 标签 
     * @return Tag 标签
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set 标签
     * @param Tag 标签
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 条款 
     * @return Terms 条款
     */
    public String [] getTerms() {
        return this.Terms;
    }

    /**
     * Set 条款
     * @param Terms 条款
     */
    public void setTerms(String [] Terms) {
        this.Terms = Terms;
    }

    public StandardTerm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StandardTerm(StandardTerm source) {
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.Terms != null) {
            this.Terms = new String[source.Terms.length];
            for (int i = 0; i < source.Terms.length; i++) {
                this.Terms[i] = new String(source.Terms[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamArraySimple(map, prefix + "Terms.", this.Terms);

    }
}

