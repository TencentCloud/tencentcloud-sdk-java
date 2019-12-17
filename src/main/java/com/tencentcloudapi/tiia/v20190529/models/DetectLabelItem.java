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
package com.tencentcloudapi.tiia.v20190529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectLabelItem extends AbstractModel{

    /**
    * 图片中的物体名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 算法对于Name的置信度，0-100之间，值越高，表示对于Name越确定。
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * 标签的一级分类
    */
    @SerializedName("FirstCategory")
    @Expose
    private String FirstCategory;

    /**
    * 标签的二级分类
    */
    @SerializedName("SecondCategory")
    @Expose
    private String SecondCategory;

    /**
     * Get 图片中的物体名称。 
     * @return Name 图片中的物体名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 图片中的物体名称。
     * @param Name 图片中的物体名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 算法对于Name的置信度，0-100之间，值越高，表示对于Name越确定。 
     * @return Confidence 算法对于Name的置信度，0-100之间，值越高，表示对于Name越确定。
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 算法对于Name的置信度，0-100之间，值越高，表示对于Name越确定。
     * @param Confidence 算法对于Name的置信度，0-100之间，值越高，表示对于Name越确定。
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 标签的一级分类 
     * @return FirstCategory 标签的一级分类
     */
    public String getFirstCategory() {
        return this.FirstCategory;
    }

    /**
     * Set 标签的一级分类
     * @param FirstCategory 标签的一级分类
     */
    public void setFirstCategory(String FirstCategory) {
        this.FirstCategory = FirstCategory;
    }

    /**
     * Get 标签的二级分类 
     * @return SecondCategory 标签的二级分类
     */
    public String getSecondCategory() {
        return this.SecondCategory;
    }

    /**
     * Set 标签的二级分类
     * @param SecondCategory 标签的二级分类
     */
    public void setSecondCategory(String SecondCategory) {
        this.SecondCategory = SecondCategory;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "FirstCategory", this.FirstCategory);
        this.setParamSimple(map, prefix + "SecondCategory", this.SecondCategory);

    }
}

