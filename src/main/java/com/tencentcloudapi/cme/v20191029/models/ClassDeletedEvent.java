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

public class ClassDeletedEvent extends AbstractModel{

    /**
    * 删除的分类归属。
    */
    @SerializedName("Owner")
    @Expose
    private Entity Owner;

    /**
    * 删除的分类路径列表。
    */
    @SerializedName("ClassPathSet")
    @Expose
    private String [] ClassPathSet;

    /**
     * Get 删除的分类归属。 
     * @return Owner 删除的分类归属。
     */
    public Entity getOwner() {
        return this.Owner;
    }

    /**
     * Set 删除的分类归属。
     * @param Owner 删除的分类归属。
     */
    public void setOwner(Entity Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 删除的分类路径列表。 
     * @return ClassPathSet 删除的分类路径列表。
     */
    public String [] getClassPathSet() {
        return this.ClassPathSet;
    }

    /**
     * Set 删除的分类路径列表。
     * @param ClassPathSet 删除的分类路径列表。
     */
    public void setClassPathSet(String [] ClassPathSet) {
        this.ClassPathSet = ClassPathSet;
    }

    public ClassDeletedEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClassDeletedEvent(ClassDeletedEvent source) {
        if (source.Owner != null) {
            this.Owner = new Entity(source.Owner);
        }
        if (source.ClassPathSet != null) {
            this.ClassPathSet = new String[source.ClassPathSet.length];
            for (int i = 0; i < source.ClassPathSet.length; i++) {
                this.ClassPathSet[i] = new String(source.ClassPathSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Owner.", this.Owner);
        this.setParamArraySimple(map, prefix + "ClassPathSet.", this.ClassPathSet);

    }
}

