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

public class Product extends AbstractModel{

    /**
    * 图片中商品的三级分类识别结果，选取所有三级分类中的置信度最大者
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 三级商品分类对应的一级分类和二级分类，两级之间用“-”（中划线）隔开，例如商品名称是“硬盘”，那么Parents输出为“电脑、办公-电脑配件”
    */
    @SerializedName("Parents")
    @Expose
    private String Parents;

    /**
    * 算法对于Name的置信度，0-100之间，值越高，表示对于Name越确定
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * 商品坐标X轴的最小值
    */
    @SerializedName("XMin")
    @Expose
    private Long XMin;

    /**
    * 商品坐标Y轴的最小值
    */
    @SerializedName("YMin")
    @Expose
    private Long YMin;

    /**
    * 商品坐标X轴的最大值
    */
    @SerializedName("XMax")
    @Expose
    private Long XMax;

    /**
    * 商品坐标Y轴的最大值
    */
    @SerializedName("YMax")
    @Expose
    private Long YMax;

    /**
     * Get 图片中商品的三级分类识别结果，选取所有三级分类中的置信度最大者 
     * @return Name 图片中商品的三级分类识别结果，选取所有三级分类中的置信度最大者
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 图片中商品的三级分类识别结果，选取所有三级分类中的置信度最大者
     * @param Name 图片中商品的三级分类识别结果，选取所有三级分类中的置信度最大者
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 三级商品分类对应的一级分类和二级分类，两级之间用“-”（中划线）隔开，例如商品名称是“硬盘”，那么Parents输出为“电脑、办公-电脑配件” 
     * @return Parents 三级商品分类对应的一级分类和二级分类，两级之间用“-”（中划线）隔开，例如商品名称是“硬盘”，那么Parents输出为“电脑、办公-电脑配件”
     */
    public String getParents() {
        return this.Parents;
    }

    /**
     * Set 三级商品分类对应的一级分类和二级分类，两级之间用“-”（中划线）隔开，例如商品名称是“硬盘”，那么Parents输出为“电脑、办公-电脑配件”
     * @param Parents 三级商品分类对应的一级分类和二级分类，两级之间用“-”（中划线）隔开，例如商品名称是“硬盘”，那么Parents输出为“电脑、办公-电脑配件”
     */
    public void setParents(String Parents) {
        this.Parents = Parents;
    }

    /**
     * Get 算法对于Name的置信度，0-100之间，值越高，表示对于Name越确定 
     * @return Confidence 算法对于Name的置信度，0-100之间，值越高，表示对于Name越确定
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 算法对于Name的置信度，0-100之间，值越高，表示对于Name越确定
     * @param Confidence 算法对于Name的置信度，0-100之间，值越高，表示对于Name越确定
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 商品坐标X轴的最小值 
     * @return XMin 商品坐标X轴的最小值
     */
    public Long getXMin() {
        return this.XMin;
    }

    /**
     * Set 商品坐标X轴的最小值
     * @param XMin 商品坐标X轴的最小值
     */
    public void setXMin(Long XMin) {
        this.XMin = XMin;
    }

    /**
     * Get 商品坐标Y轴的最小值 
     * @return YMin 商品坐标Y轴的最小值
     */
    public Long getYMin() {
        return this.YMin;
    }

    /**
     * Set 商品坐标Y轴的最小值
     * @param YMin 商品坐标Y轴的最小值
     */
    public void setYMin(Long YMin) {
        this.YMin = YMin;
    }

    /**
     * Get 商品坐标X轴的最大值 
     * @return XMax 商品坐标X轴的最大值
     */
    public Long getXMax() {
        return this.XMax;
    }

    /**
     * Set 商品坐标X轴的最大值
     * @param XMax 商品坐标X轴的最大值
     */
    public void setXMax(Long XMax) {
        this.XMax = XMax;
    }

    /**
     * Get 商品坐标Y轴的最大值 
     * @return YMax 商品坐标Y轴的最大值
     */
    public Long getYMax() {
        return this.YMax;
    }

    /**
     * Set 商品坐标Y轴的最大值
     * @param YMax 商品坐标Y轴的最大值
     */
    public void setYMax(Long YMax) {
        this.YMax = YMax;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Parents", this.Parents);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "XMin", this.XMin);
        this.setParamSimple(map, prefix + "YMin", this.YMin);
        this.setParamSimple(map, prefix + "XMax", this.XMax);
        this.setParamSimple(map, prefix + "YMax", this.YMax);

    }
}

