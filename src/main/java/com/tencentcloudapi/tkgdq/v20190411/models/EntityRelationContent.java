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

public class EntityRelationContent extends AbstractModel {

    /**
    * 实体关系查询返回关系的object
    */
    @SerializedName("Object")
    @Expose
    private EntityRelationObject [] Object;

    /**
    * 实体关系查询返回关系的subject
    */
    @SerializedName("Subject")
    @Expose
    private EntityRelationSubject [] Subject;

    /**
    * 实体关系查询返回的关系名称
    */
    @SerializedName("Relation")
    @Expose
    private String Relation;

    /**
     * Get 实体关系查询返回关系的object 
     * @return Object 实体关系查询返回关系的object
     */
    public EntityRelationObject [] getObject() {
        return this.Object;
    }

    /**
     * Set 实体关系查询返回关系的object
     * @param Object 实体关系查询返回关系的object
     */
    public void setObject(EntityRelationObject [] Object) {
        this.Object = Object;
    }

    /**
     * Get 实体关系查询返回关系的subject 
     * @return Subject 实体关系查询返回关系的subject
     */
    public EntityRelationSubject [] getSubject() {
        return this.Subject;
    }

    /**
     * Set 实体关系查询返回关系的subject
     * @param Subject 实体关系查询返回关系的subject
     */
    public void setSubject(EntityRelationSubject [] Subject) {
        this.Subject = Subject;
    }

    /**
     * Get 实体关系查询返回的关系名称 
     * @return Relation 实体关系查询返回的关系名称
     */
    public String getRelation() {
        return this.Relation;
    }

    /**
     * Set 实体关系查询返回的关系名称
     * @param Relation 实体关系查询返回的关系名称
     */
    public void setRelation(String Relation) {
        this.Relation = Relation;
    }

    public EntityRelationContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EntityRelationContent(EntityRelationContent source) {
        if (source.Object != null) {
            this.Object = new EntityRelationObject[source.Object.length];
            for (int i = 0; i < source.Object.length; i++) {
                this.Object[i] = new EntityRelationObject(source.Object[i]);
            }
        }
        if (source.Subject != null) {
            this.Subject = new EntityRelationSubject[source.Subject.length];
            for (int i = 0; i < source.Subject.length; i++) {
                this.Subject[i] = new EntityRelationSubject(source.Subject[i]);
            }
        }
        if (source.Relation != null) {
            this.Relation = new String(source.Relation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Object.", this.Object);
        this.setParamArrayObj(map, prefix + "Subject.", this.Subject);
        this.setParamSimple(map, prefix + "Relation", this.Relation);

    }
}

