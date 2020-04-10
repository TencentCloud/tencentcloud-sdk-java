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

public class RegionDetected extends AbstractModel{

    /**
    * 商品的品类预测结果。 
包含：鞋、图书音像、箱包、美妆个护、服饰、家电数码、玩具乐器、食品饮料、珠宝、家居家装、药品、酒水、绿植园艺、其他商品、非商品等。
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 商品品类预测的置信度
    */
    @SerializedName("CategoryScore")
    @Expose
    private Float CategoryScore;

    /**
    * 检测到的主体在图片中的坐标，表示为矩形框的四个顶点坐标
    */
    @SerializedName("Location")
    @Expose
    private Location Location;

    /**
     * Get 商品的品类预测结果。 
包含：鞋、图书音像、箱包、美妆个护、服饰、家电数码、玩具乐器、食品饮料、珠宝、家居家装、药品、酒水、绿植园艺、其他商品、非商品等。 
     * @return Category 商品的品类预测结果。 
包含：鞋、图书音像、箱包、美妆个护、服饰、家电数码、玩具乐器、食品饮料、珠宝、家居家装、药品、酒水、绿植园艺、其他商品、非商品等。
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 商品的品类预测结果。 
包含：鞋、图书音像、箱包、美妆个护、服饰、家电数码、玩具乐器、食品饮料、珠宝、家居家装、药品、酒水、绿植园艺、其他商品、非商品等。
     * @param Category 商品的品类预测结果。 
包含：鞋、图书音像、箱包、美妆个护、服饰、家电数码、玩具乐器、食品饮料、珠宝、家居家装、药品、酒水、绿植园艺、其他商品、非商品等。
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get 商品品类预测的置信度 
     * @return CategoryScore 商品品类预测的置信度
     */
    public Float getCategoryScore() {
        return this.CategoryScore;
    }

    /**
     * Set 商品品类预测的置信度
     * @param CategoryScore 商品品类预测的置信度
     */
    public void setCategoryScore(Float CategoryScore) {
        this.CategoryScore = CategoryScore;
    }

    /**
     * Get 检测到的主体在图片中的坐标，表示为矩形框的四个顶点坐标 
     * @return Location 检测到的主体在图片中的坐标，表示为矩形框的四个顶点坐标
     */
    public Location getLocation() {
        return this.Location;
    }

    /**
     * Set 检测到的主体在图片中的坐标，表示为矩形框的四个顶点坐标
     * @param Location 检测到的主体在图片中的坐标，表示为矩形框的四个顶点坐标
     */
    public void setLocation(Location Location) {
        this.Location = Location;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "CategoryScore", this.CategoryScore);
        this.setParamObj(map, prefix + "Location.", this.Location);

    }
}

