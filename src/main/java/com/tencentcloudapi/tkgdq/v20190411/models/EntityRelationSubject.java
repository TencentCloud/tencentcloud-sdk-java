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
package com.tencentcloudapi.tkgdq.v20190411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EntityRelationSubject extends AbstractModel{

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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Id.", this.Id);
        this.setParamArraySimple(map, prefix + "Name.", this.Name);
        this.setParamArraySimple(map, prefix + "Popular.", this.Popular);

    }
}

