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
package com.tencentcloudapi.tkgdq.v20190411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EntityRelationSubject extends AbstractModel {

    /**
    * Subject对应id
    */
    @SerializedName("Id")
    @Expose
    private String [] Id;

    /**
    * Subject对应name
    */
    @SerializedName("Name")
    @Expose
    private String [] Name;

    /**
    * Subject对应popular
    */
    @SerializedName("Popular")
    @Expose
    private Long [] Popular;

    /**
     * Get Subject对应id 
     * @return Id Subject对应id
     */
    public String [] getId() {
        return this.Id;
    }

    /**
     * Set Subject对应id
     * @param Id Subject对应id
     */
    public void setId(String [] Id) {
        this.Id = Id;
    }

    /**
     * Get Subject对应name 
     * @return Name Subject对应name
     */
    public String [] getName() {
        return this.Name;
    }

    /**
     * Set Subject对应name
     * @param Name Subject对应name
     */
    public void setName(String [] Name) {
        this.Name = Name;
    }

    /**
     * Get Subject对应popular 
     * @return Popular Subject对应popular
     */
    public Long [] getPopular() {
        return this.Popular;
    }

    /**
     * Set Subject对应popular
     * @param Popular Subject对应popular
     */
    public void setPopular(Long [] Popular) {
        this.Popular = Popular;
    }

    public EntityRelationSubject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EntityRelationSubject(EntityRelationSubject source) {
        if (source.Id != null) {
            this.Id = new String[source.Id.length];
            for (int i = 0; i < source.Id.length; i++) {
                this.Id[i] = new String(source.Id[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String[source.Name.length];
            for (int i = 0; i < source.Name.length; i++) {
                this.Name[i] = new String(source.Name[i]);
            }
        }
        if (source.Popular != null) {
            this.Popular = new Long[source.Popular.length];
            for (int i = 0; i < source.Popular.length; i++) {
                this.Popular[i] = new Long(source.Popular[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Id.", this.Id);
        this.setParamArraySimple(map, prefix + "Name.", this.Name);
        this.setParamArraySimple(map, prefix + "Popular.", this.Popular);

    }
}

