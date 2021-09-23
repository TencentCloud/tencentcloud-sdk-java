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
package com.tencentcloudapi.cii.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClassifyInfo extends AbstractModel{

    /**
    * 一级分类
    */
    @SerializedName("FirstClass")
    @Expose
    private String FirstClass;

    /**
    * 二级分类
    */
    @SerializedName("SecondClass")
    @Expose
    private String SecondClass;

    /**
    * 三级分类
    */
    @SerializedName("ThirdClass")
    @Expose
    private String ThirdClass;

    /**
    * 一级分类序号
    */
    @SerializedName("FirstClassId")
    @Expose
    private Long FirstClassId;

    /**
    * 二级分类序号
    */
    @SerializedName("SecondClassId")
    @Expose
    private Long SecondClassId;

    /**
    * 三级分类序号
    */
    @SerializedName("ThirdClassId")
    @Expose
    private Long ThirdClassId;

    /**
     * Get 一级分类 
     * @return FirstClass 一级分类
     */
    public String getFirstClass() {
        return this.FirstClass;
    }

    /**
     * Set 一级分类
     * @param FirstClass 一级分类
     */
    public void setFirstClass(String FirstClass) {
        this.FirstClass = FirstClass;
    }

    /**
     * Get 二级分类 
     * @return SecondClass 二级分类
     */
    public String getSecondClass() {
        return this.SecondClass;
    }

    /**
     * Set 二级分类
     * @param SecondClass 二级分类
     */
    public void setSecondClass(String SecondClass) {
        this.SecondClass = SecondClass;
    }

    /**
     * Get 三级分类 
     * @return ThirdClass 三级分类
     */
    public String getThirdClass() {
        return this.ThirdClass;
    }

    /**
     * Set 三级分类
     * @param ThirdClass 三级分类
     */
    public void setThirdClass(String ThirdClass) {
        this.ThirdClass = ThirdClass;
    }

    /**
     * Get 一级分类序号 
     * @return FirstClassId 一级分类序号
     */
    public Long getFirstClassId() {
        return this.FirstClassId;
    }

    /**
     * Set 一级分类序号
     * @param FirstClassId 一级分类序号
     */
    public void setFirstClassId(Long FirstClassId) {
        this.FirstClassId = FirstClassId;
    }

    /**
     * Get 二级分类序号 
     * @return SecondClassId 二级分类序号
     */
    public Long getSecondClassId() {
        return this.SecondClassId;
    }

    /**
     * Set 二级分类序号
     * @param SecondClassId 二级分类序号
     */
    public void setSecondClassId(Long SecondClassId) {
        this.SecondClassId = SecondClassId;
    }

    /**
     * Get 三级分类序号 
     * @return ThirdClassId 三级分类序号
     */
    public Long getThirdClassId() {
        return this.ThirdClassId;
    }

    /**
     * Set 三级分类序号
     * @param ThirdClassId 三级分类序号
     */
    public void setThirdClassId(Long ThirdClassId) {
        this.ThirdClassId = ThirdClassId;
    }

    public ClassifyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClassifyInfo(ClassifyInfo source) {
        if (source.FirstClass != null) {
            this.FirstClass = new String(source.FirstClass);
        }
        if (source.SecondClass != null) {
            this.SecondClass = new String(source.SecondClass);
        }
        if (source.ThirdClass != null) {
            this.ThirdClass = new String(source.ThirdClass);
        }
        if (source.FirstClassId != null) {
            this.FirstClassId = new Long(source.FirstClassId);
        }
        if (source.SecondClassId != null) {
            this.SecondClassId = new Long(source.SecondClassId);
        }
        if (source.ThirdClassId != null) {
            this.ThirdClassId = new Long(source.ThirdClassId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FirstClass", this.FirstClass);
        this.setParamSimple(map, prefix + "SecondClass", this.SecondClass);
        this.setParamSimple(map, prefix + "ThirdClass", this.ThirdClass);
        this.setParamSimple(map, prefix + "FirstClassId", this.FirstClassId);
        this.setParamSimple(map, prefix + "SecondClassId", this.SecondClassId);
        this.setParamSimple(map, prefix + "ThirdClassId", this.ThirdClassId);

    }
}

