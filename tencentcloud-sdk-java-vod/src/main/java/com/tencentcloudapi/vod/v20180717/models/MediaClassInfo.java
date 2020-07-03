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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaClassInfo extends AbstractModel{

    /**
    * 分类 ID
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * 父类 ID，一级分类的父类 ID 为 -1。
    */
    @SerializedName("ParentId")
    @Expose
    private Long ParentId;

    /**
    * 分类名称
    */
    @SerializedName("ClassName")
    @Expose
    private String ClassName;

    /**
    * 分类级别，一级分类为 0，最大值为 3，即最多允许 4 级分类层次。
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 当前分类的第一级子类 ID 集合
    */
    @SerializedName("SubClassIdSet")
    @Expose
    private Long [] SubClassIdSet;

    /**
     * Get 分类 ID 
     * @return ClassId 分类 ID
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set 分类 ID
     * @param ClassId 分类 ID
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get 父类 ID，一级分类的父类 ID 为 -1。 
     * @return ParentId 父类 ID，一级分类的父类 ID 为 -1。
     */
    public Long getParentId() {
        return this.ParentId;
    }

    /**
     * Set 父类 ID，一级分类的父类 ID 为 -1。
     * @param ParentId 父类 ID，一级分类的父类 ID 为 -1。
     */
    public void setParentId(Long ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get 分类名称 
     * @return ClassName 分类名称
     */
    public String getClassName() {
        return this.ClassName;
    }

    /**
     * Set 分类名称
     * @param ClassName 分类名称
     */
    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    /**
     * Get 分类级别，一级分类为 0，最大值为 3，即最多允许 4 级分类层次。 
     * @return Level 分类级别，一级分类为 0，最大值为 3，即最多允许 4 级分类层次。
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 分类级别，一级分类为 0，最大值为 3，即最多允许 4 级分类层次。
     * @param Level 分类级别，一级分类为 0，最大值为 3，即最多允许 4 级分类层次。
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 当前分类的第一级子类 ID 集合 
     * @return SubClassIdSet 当前分类的第一级子类 ID 集合
     */
    public Long [] getSubClassIdSet() {
        return this.SubClassIdSet;
    }

    /**
     * Set 当前分类的第一级子类 ID 集合
     * @param SubClassIdSet 当前分类的第一级子类 ID 集合
     */
    public void setSubClassIdSet(Long [] SubClassIdSet) {
        this.SubClassIdSet = SubClassIdSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "ClassName", this.ClassName);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamArraySimple(map, prefix + "SubClassIdSet.", this.SubClassIdSet);

    }
}

