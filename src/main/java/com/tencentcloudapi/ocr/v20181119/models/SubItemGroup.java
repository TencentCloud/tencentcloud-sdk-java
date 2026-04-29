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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubItemGroup extends AbstractModel {

    /**
    * <p>子结构嵌套FieldsInfo结构</p>
    */
    @SerializedName("Groups")
    @Expose
    private FieldsInfo [] Groups;

    /**
     * Get <p>子结构嵌套FieldsInfo结构</p> 
     * @return Groups <p>子结构嵌套FieldsInfo结构</p>
     */
    public FieldsInfo [] getGroups() {
        return this.Groups;
    }

    /**
     * Set <p>子结构嵌套FieldsInfo结构</p>
     * @param Groups <p>子结构嵌套FieldsInfo结构</p>
     */
    public void setGroups(FieldsInfo [] Groups) {
        this.Groups = Groups;
    }

    public SubItemGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubItemGroup(SubItemGroup source) {
        if (source.Groups != null) {
            this.Groups = new FieldsInfo[source.Groups.length];
            for (int i = 0; i < source.Groups.length; i++) {
                this.Groups[i] = new FieldsInfo(source.Groups[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Groups.", this.Groups);

    }
}

