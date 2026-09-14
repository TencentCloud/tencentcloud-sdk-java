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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LabelModifyFields extends AbstractModel {

    /**
    * <p>标签名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>标准词增量修改列表（增/改/删）</p>
    */
    @SerializedName("TermModifyList")
    @Expose
    private LabelTermModifyItem [] TermModifyList;

    /**
     * Get <p>标签名称</p> 
     * @return Name <p>标签名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>标签名称</p>
     * @param Name <p>标签名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>标准词增量修改列表（增/改/删）</p> 
     * @return TermModifyList <p>标准词增量修改列表（增/改/删）</p>
     */
    public LabelTermModifyItem [] getTermModifyList() {
        return this.TermModifyList;
    }

    /**
     * Set <p>标准词增量修改列表（增/改/删）</p>
     * @param TermModifyList <p>标准词增量修改列表（增/改/删）</p>
     */
    public void setTermModifyList(LabelTermModifyItem [] TermModifyList) {
        this.TermModifyList = TermModifyList;
    }

    public LabelModifyFields() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LabelModifyFields(LabelModifyFields source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TermModifyList != null) {
            this.TermModifyList = new LabelTermModifyItem[source.TermModifyList.length];
            for (int i = 0; i < source.TermModifyList.length; i++) {
                this.TermModifyList[i] = new LabelTermModifyItem(source.TermModifyList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "TermModifyList.", this.TermModifyList);

    }
}

