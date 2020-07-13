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

public class ProductInfo extends AbstractModel{

    /**
    * 1表示找到同款商品，以下字段为同款商品信息； 
0表示未找到同款商品， 具体商品信息为空（参考价格、名称、品牌等），仅提供商品类目和参考图片（商品库中找到的最相似图片，供参考）。  
是否找到同款的判断依据为Score分值，分值越大则同款的可能性越大。
    */
    @SerializedName("FindSKU")
    @Expose
    private Long FindSKU;

    /**
    * 本商品在图片中的坐标，表示为矩形框的四个顶点坐标。
    */
    @SerializedName("Location")
    @Expose
    private Location Location;

    /**
    * 商品名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 商品品牌
    */
    @SerializedName("Brand")
    @Expose
    private String Brand;

    /**
    * 参考价格，综合多个信息源，仅供参考。
    */
    @SerializedName("Price")
    @Expose
    private String Price;

    /**
    * 识别结果的商品类目。 
包含：鞋、图书音像、箱包、美妆个护、服饰、家电数码、玩具乐器、食品饮料、珠宝、家居家装、药品、酒水、绿植园艺、其他商品、非商品等。 
当类别为“非商品”时，除Location、Score和本字段之外的商品信息为空。
    */
    @SerializedName("ProductCategory")
    @Expose
    private String ProductCategory;

    /**
    * 输入图片中的主体物品和输出结果的相似度。分值越大，输出结果与输入图片是同款的可能性越高。
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * 搜索到的商品配图URL。
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
     * Get 1表示找到同款商品，以下字段为同款商品信息； 
0表示未找到同款商品， 具体商品信息为空（参考价格、名称、品牌等），仅提供商品类目和参考图片（商品库中找到的最相似图片，供参考）。  
是否找到同款的判断依据为Score分值，分值越大则同款的可能性越大。 
     * @return FindSKU 1表示找到同款商品，以下字段为同款商品信息； 
0表示未找到同款商品， 具体商品信息为空（参考价格、名称、品牌等），仅提供商品类目和参考图片（商品库中找到的最相似图片，供参考）。  
是否找到同款的判断依据为Score分值，分值越大则同款的可能性越大。
     */
    public Long getFindSKU() {
        return this.FindSKU;
    }

    /**
     * Set 1表示找到同款商品，以下字段为同款商品信息； 
0表示未找到同款商品， 具体商品信息为空（参考价格、名称、品牌等），仅提供商品类目和参考图片（商品库中找到的最相似图片，供参考）。  
是否找到同款的判断依据为Score分值，分值越大则同款的可能性越大。
     * @param FindSKU 1表示找到同款商品，以下字段为同款商品信息； 
0表示未找到同款商品， 具体商品信息为空（参考价格、名称、品牌等），仅提供商品类目和参考图片（商品库中找到的最相似图片，供参考）。  
是否找到同款的判断依据为Score分值，分值越大则同款的可能性越大。
     */
    public void setFindSKU(Long FindSKU) {
        this.FindSKU = FindSKU;
    }

    /**
     * Get 本商品在图片中的坐标，表示为矩形框的四个顶点坐标。 
     * @return Location 本商品在图片中的坐标，表示为矩形框的四个顶点坐标。
     */
    public Location getLocation() {
        return this.Location;
    }

    /**
     * Set 本商品在图片中的坐标，表示为矩形框的四个顶点坐标。
     * @param Location 本商品在图片中的坐标，表示为矩形框的四个顶点坐标。
     */
    public void setLocation(Location Location) {
        this.Location = Location;
    }

    /**
     * Get 商品名称 
     * @return Name 商品名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 商品名称
     * @param Name 商品名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 商品品牌 
     * @return Brand 商品品牌
     */
    public String getBrand() {
        return this.Brand;
    }

    /**
     * Set 商品品牌
     * @param Brand 商品品牌
     */
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    /**
     * Get 参考价格，综合多个信息源，仅供参考。 
     * @return Price 参考价格，综合多个信息源，仅供参考。
     */
    public String getPrice() {
        return this.Price;
    }

    /**
     * Set 参考价格，综合多个信息源，仅供参考。
     * @param Price 参考价格，综合多个信息源，仅供参考。
     */
    public void setPrice(String Price) {
        this.Price = Price;
    }

    /**
     * Get 识别结果的商品类目。 
包含：鞋、图书音像、箱包、美妆个护、服饰、家电数码、玩具乐器、食品饮料、珠宝、家居家装、药品、酒水、绿植园艺、其他商品、非商品等。 
当类别为“非商品”时，除Location、Score和本字段之外的商品信息为空。 
     * @return ProductCategory 识别结果的商品类目。 
包含：鞋、图书音像、箱包、美妆个护、服饰、家电数码、玩具乐器、食品饮料、珠宝、家居家装、药品、酒水、绿植园艺、其他商品、非商品等。 
当类别为“非商品”时，除Location、Score和本字段之外的商品信息为空。
     */
    public String getProductCategory() {
        return this.ProductCategory;
    }

    /**
     * Set 识别结果的商品类目。 
包含：鞋、图书音像、箱包、美妆个护、服饰、家电数码、玩具乐器、食品饮料、珠宝、家居家装、药品、酒水、绿植园艺、其他商品、非商品等。 
当类别为“非商品”时，除Location、Score和本字段之外的商品信息为空。
     * @param ProductCategory 识别结果的商品类目。 
包含：鞋、图书音像、箱包、美妆个护、服饰、家电数码、玩具乐器、食品饮料、珠宝、家居家装、药品、酒水、绿植园艺、其他商品、非商品等。 
当类别为“非商品”时，除Location、Score和本字段之外的商品信息为空。
     */
    public void setProductCategory(String ProductCategory) {
        this.ProductCategory = ProductCategory;
    }

    /**
     * Get 输入图片中的主体物品和输出结果的相似度。分值越大，输出结果与输入图片是同款的可能性越高。 
     * @return Score 输入图片中的主体物品和输出结果的相似度。分值越大，输出结果与输入图片是同款的可能性越高。
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set 输入图片中的主体物品和输出结果的相似度。分值越大，输出结果与输入图片是同款的可能性越高。
     * @param Score 输入图片中的主体物品和输出结果的相似度。分值越大，输出结果与输入图片是同款的可能性越高。
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get 搜索到的商品配图URL。 
     * @return Image 搜索到的商品配图URL。
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 搜索到的商品配图URL。
     * @param Image 搜索到的商品配图URL。
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FindSKU", this.FindSKU);
        this.setParamObj(map, prefix + "Location.", this.Location);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Brand", this.Brand);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "ProductCategory", this.ProductCategory);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "Image", this.Image);

    }
}

