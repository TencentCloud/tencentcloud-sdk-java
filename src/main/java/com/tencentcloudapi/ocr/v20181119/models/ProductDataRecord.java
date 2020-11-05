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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductDataRecord extends AbstractModel{

    /**
    * 产品名称
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 产品名称(英文)
    */
    @SerializedName("EnName")
    @Expose
    private String EnName;

    /**
    * 品牌名称
    */
    @SerializedName("BrandName")
    @Expose
    private String BrandName;

    /**
    * 规格型号
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 宽度，单位毫米
    */
    @SerializedName("Width")
    @Expose
    private String Width;

    /**
    * 高度，单位毫米
    */
    @SerializedName("Height")
    @Expose
    private String Height;

    /**
    * 深度，单位毫米
    */
    @SerializedName("Depth")
    @Expose
    private String Depth;

    /**
    * 关键字
    */
    @SerializedName("KeyWord")
    @Expose
    private String KeyWord;

    /**
    * 简短描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 图片链接
    */
    @SerializedName("ImageLink")
    @Expose
    private String [] ImageLink;

    /**
    * 厂家名称
    */
    @SerializedName("ManufacturerName")
    @Expose
    private String ManufacturerName;

    /**
    * 厂家地址
    */
    @SerializedName("ManufacturerAddress")
    @Expose
    private String ManufacturerAddress;

    /**
    * 企业社会信用代码
    */
    @SerializedName("FirmCode")
    @Expose
    private String FirmCode;

    /**
    * 表示数据查询状态
checkResult	状态说明
1	 经查，该商品条码已在中国物品编码中心注册
2	经查，该厂商识别代码已在中国物品编码中心注册，但编码信息未按规定通报。
3	经查，该厂商识别代码已于xxxxx注销，请关注产品生产日期。
4	经查，该企业以及条码未经条码中心注册，属于违法使用
-1	经查，该商品条码被冒用
-2	经查，该厂商识别代码已在中国物品编码中心注册，但该产品已经下市
S001                未找到该厂商识别代码的注册信息。
S002		该厂商识别代码已经在GS1注册，但编码信息未通报
S003		该商品条码已在GS1通报
S004		该商品条码已注销
S005		数字不正确。GS1前缀（3位国家/地区代码）用于特殊用途。
E001		完整性失败：此GTIN的长度无效。
E002		完整性失败：校验位不正确。
E003		完整性失败：字符串包含字母数字字符。
E004		数字不正确。GS1前缀（3位国家/地区代码）不存在。
E005		数字不正确。GS1前缀（3位国家/地区代码）用于特殊用途。
E006		数字不正确。尚未分配该GS1公司前缀。
E008	        经查，该企业厂商识别代码以及条码尚未通报
    */
    @SerializedName("CheckResult")
    @Expose
    private String CheckResult;

    /**
    * UNSPSC分类码
    */
    @SerializedName("CategoryCode")
    @Expose
    private String CategoryCode;

    /**
     * Get 产品名称 
     * @return ProductName 产品名称
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品名称
     * @param ProductName 产品名称
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 产品名称(英文) 
     * @return EnName 产品名称(英文)
     */
    public String getEnName() {
        return this.EnName;
    }

    /**
     * Set 产品名称(英文)
     * @param EnName 产品名称(英文)
     */
    public void setEnName(String EnName) {
        this.EnName = EnName;
    }

    /**
     * Get 品牌名称 
     * @return BrandName 品牌名称
     */
    public String getBrandName() {
        return this.BrandName;
    }

    /**
     * Set 品牌名称
     * @param BrandName 品牌名称
     */
    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    /**
     * Get 规格型号 
     * @return Type 规格型号
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 规格型号
     * @param Type 规格型号
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 宽度，单位毫米 
     * @return Width 宽度，单位毫米
     */
    public String getWidth() {
        return this.Width;
    }

    /**
     * Set 宽度，单位毫米
     * @param Width 宽度，单位毫米
     */
    public void setWidth(String Width) {
        this.Width = Width;
    }

    /**
     * Get 高度，单位毫米 
     * @return Height 高度，单位毫米
     */
    public String getHeight() {
        return this.Height;
    }

    /**
     * Set 高度，单位毫米
     * @param Height 高度，单位毫米
     */
    public void setHeight(String Height) {
        this.Height = Height;
    }

    /**
     * Get 深度，单位毫米 
     * @return Depth 深度，单位毫米
     */
    public String getDepth() {
        return this.Depth;
    }

    /**
     * Set 深度，单位毫米
     * @param Depth 深度，单位毫米
     */
    public void setDepth(String Depth) {
        this.Depth = Depth;
    }

    /**
     * Get 关键字 
     * @return KeyWord 关键字
     */
    public String getKeyWord() {
        return this.KeyWord;
    }

    /**
     * Set 关键字
     * @param KeyWord 关键字
     */
    public void setKeyWord(String KeyWord) {
        this.KeyWord = KeyWord;
    }

    /**
     * Get 简短描述 
     * @return Description 简短描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 简短描述
     * @param Description 简短描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 图片链接 
     * @return ImageLink 图片链接
     */
    public String [] getImageLink() {
        return this.ImageLink;
    }

    /**
     * Set 图片链接
     * @param ImageLink 图片链接
     */
    public void setImageLink(String [] ImageLink) {
        this.ImageLink = ImageLink;
    }

    /**
     * Get 厂家名称 
     * @return ManufacturerName 厂家名称
     */
    public String getManufacturerName() {
        return this.ManufacturerName;
    }

    /**
     * Set 厂家名称
     * @param ManufacturerName 厂家名称
     */
    public void setManufacturerName(String ManufacturerName) {
        this.ManufacturerName = ManufacturerName;
    }

    /**
     * Get 厂家地址 
     * @return ManufacturerAddress 厂家地址
     */
    public String getManufacturerAddress() {
        return this.ManufacturerAddress;
    }

    /**
     * Set 厂家地址
     * @param ManufacturerAddress 厂家地址
     */
    public void setManufacturerAddress(String ManufacturerAddress) {
        this.ManufacturerAddress = ManufacturerAddress;
    }

    /**
     * Get 企业社会信用代码 
     * @return FirmCode 企业社会信用代码
     */
    public String getFirmCode() {
        return this.FirmCode;
    }

    /**
     * Set 企业社会信用代码
     * @param FirmCode 企业社会信用代码
     */
    public void setFirmCode(String FirmCode) {
        this.FirmCode = FirmCode;
    }

    /**
     * Get 表示数据查询状态
checkResult	状态说明
1	 经查，该商品条码已在中国物品编码中心注册
2	经查，该厂商识别代码已在中国物品编码中心注册，但编码信息未按规定通报。
3	经查，该厂商识别代码已于xxxxx注销，请关注产品生产日期。
4	经查，该企业以及条码未经条码中心注册，属于违法使用
-1	经查，该商品条码被冒用
-2	经查，该厂商识别代码已在中国物品编码中心注册，但该产品已经下市
S001                未找到该厂商识别代码的注册信息。
S002		该厂商识别代码已经在GS1注册，但编码信息未通报
S003		该商品条码已在GS1通报
S004		该商品条码已注销
S005		数字不正确。GS1前缀（3位国家/地区代码）用于特殊用途。
E001		完整性失败：此GTIN的长度无效。
E002		完整性失败：校验位不正确。
E003		完整性失败：字符串包含字母数字字符。
E004		数字不正确。GS1前缀（3位国家/地区代码）不存在。
E005		数字不正确。GS1前缀（3位国家/地区代码）用于特殊用途。
E006		数字不正确。尚未分配该GS1公司前缀。
E008	        经查，该企业厂商识别代码以及条码尚未通报 
     * @return CheckResult 表示数据查询状态
checkResult	状态说明
1	 经查，该商品条码已在中国物品编码中心注册
2	经查，该厂商识别代码已在中国物品编码中心注册，但编码信息未按规定通报。
3	经查，该厂商识别代码已于xxxxx注销，请关注产品生产日期。
4	经查，该企业以及条码未经条码中心注册，属于违法使用
-1	经查，该商品条码被冒用
-2	经查，该厂商识别代码已在中国物品编码中心注册，但该产品已经下市
S001                未找到该厂商识别代码的注册信息。
S002		该厂商识别代码已经在GS1注册，但编码信息未通报
S003		该商品条码已在GS1通报
S004		该商品条码已注销
S005		数字不正确。GS1前缀（3位国家/地区代码）用于特殊用途。
E001		完整性失败：此GTIN的长度无效。
E002		完整性失败：校验位不正确。
E003		完整性失败：字符串包含字母数字字符。
E004		数字不正确。GS1前缀（3位国家/地区代码）不存在。
E005		数字不正确。GS1前缀（3位国家/地区代码）用于特殊用途。
E006		数字不正确。尚未分配该GS1公司前缀。
E008	        经查，该企业厂商识别代码以及条码尚未通报
     */
    public String getCheckResult() {
        return this.CheckResult;
    }

    /**
     * Set 表示数据查询状态
checkResult	状态说明
1	 经查，该商品条码已在中国物品编码中心注册
2	经查，该厂商识别代码已在中国物品编码中心注册，但编码信息未按规定通报。
3	经查，该厂商识别代码已于xxxxx注销，请关注产品生产日期。
4	经查，该企业以及条码未经条码中心注册，属于违法使用
-1	经查，该商品条码被冒用
-2	经查，该厂商识别代码已在中国物品编码中心注册，但该产品已经下市
S001                未找到该厂商识别代码的注册信息。
S002		该厂商识别代码已经在GS1注册，但编码信息未通报
S003		该商品条码已在GS1通报
S004		该商品条码已注销
S005		数字不正确。GS1前缀（3位国家/地区代码）用于特殊用途。
E001		完整性失败：此GTIN的长度无效。
E002		完整性失败：校验位不正确。
E003		完整性失败：字符串包含字母数字字符。
E004		数字不正确。GS1前缀（3位国家/地区代码）不存在。
E005		数字不正确。GS1前缀（3位国家/地区代码）用于特殊用途。
E006		数字不正确。尚未分配该GS1公司前缀。
E008	        经查，该企业厂商识别代码以及条码尚未通报
     * @param CheckResult 表示数据查询状态
checkResult	状态说明
1	 经查，该商品条码已在中国物品编码中心注册
2	经查，该厂商识别代码已在中国物品编码中心注册，但编码信息未按规定通报。
3	经查，该厂商识别代码已于xxxxx注销，请关注产品生产日期。
4	经查，该企业以及条码未经条码中心注册，属于违法使用
-1	经查，该商品条码被冒用
-2	经查，该厂商识别代码已在中国物品编码中心注册，但该产品已经下市
S001                未找到该厂商识别代码的注册信息。
S002		该厂商识别代码已经在GS1注册，但编码信息未通报
S003		该商品条码已在GS1通报
S004		该商品条码已注销
S005		数字不正确。GS1前缀（3位国家/地区代码）用于特殊用途。
E001		完整性失败：此GTIN的长度无效。
E002		完整性失败：校验位不正确。
E003		完整性失败：字符串包含字母数字字符。
E004		数字不正确。GS1前缀（3位国家/地区代码）不存在。
E005		数字不正确。GS1前缀（3位国家/地区代码）用于特殊用途。
E006		数字不正确。尚未分配该GS1公司前缀。
E008	        经查，该企业厂商识别代码以及条码尚未通报
     */
    public void setCheckResult(String CheckResult) {
        this.CheckResult = CheckResult;
    }

    /**
     * Get UNSPSC分类码 
     * @return CategoryCode UNSPSC分类码
     */
    public String getCategoryCode() {
        return this.CategoryCode;
    }

    /**
     * Set UNSPSC分类码
     * @param CategoryCode UNSPSC分类码
     */
    public void setCategoryCode(String CategoryCode) {
        this.CategoryCode = CategoryCode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "EnName", this.EnName);
        this.setParamSimple(map, prefix + "BrandName", this.BrandName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Depth", this.Depth);
        this.setParamSimple(map, prefix + "KeyWord", this.KeyWord);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "ImageLink.", this.ImageLink);
        this.setParamSimple(map, prefix + "ManufacturerName", this.ManufacturerName);
        this.setParamSimple(map, prefix + "ManufacturerAddress", this.ManufacturerAddress);
        this.setParamSimple(map, prefix + "FirmCode", this.FirmCode);
        this.setParamSimple(map, prefix + "CheckResult", this.CheckResult);
        this.setParamSimple(map, prefix + "CategoryCode", this.CategoryCode);

    }
}

