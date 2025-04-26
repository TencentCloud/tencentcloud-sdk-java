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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmartStructuralProRequest extends AbstractModel {

    /**
    * 图片的 Url 地址。支持的图片格式：PNG、JPG、JPEG，WORD，EXCEL，暂不支持 GIF 格式。支持的图片大小：所下载图片经 Base64 编码后不超过 7M。图片下载时间不超过 3 秒。支持的图片像素：需介于20-10000px之间。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 图片的 Base64 值。支持的图片格式：PNG、JPG、JPEG，WORD，EXCEL，暂不支持 GIF 格式。支持的图片大小：所下载图片经Base64编码后不超过 7M。图片下载时间不超过 3 秒。支持的图片像素：需介于20-10000px之间。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * 需要识别的PDF页面的对应页码，仅支持PDF单页识别，当上传文件为PDF且IsPdf参数值为true时有效，默认值为前3页。
    */
    @SerializedName("PdfPageNumber")
    @Expose
    private Long PdfPageNumber;

    /**
    * 自定义结构化功能需返回的字段名称，例：若客户想新增返回姓名、性别两个字段的识别结果，则输入ItemNames=["姓名","性别"]
    */
    @SerializedName("ItemNames")
    @Expose
    private String [] ItemNames;

    /**
    * true：仅输出自定义字段
flase：输出默认字段+自定义字段
默认true
    */
    @SerializedName("ItemNamesShowMode")
    @Expose
    private Boolean ItemNamesShowMode;

    /**
    * 是否开启全文字段识别
    */
    @SerializedName("ReturnFullText")
    @Expose
    private Boolean ReturnFullText;

    /**
    * 配置id支持：
General -- 通用场景 
InvoiceEng -- 国际invoice模版 
WayBillEng --海运订单模板
CustomsDeclaration -- 进出口报关单
WeightNote -- 磅单
MedicalMeter -- 血压仪表识别
BillOfLading -- 海运提单
EntrustmentBook -- 海运托书
WordRecognize -- 手写英文作文模版
Statement -- 对账单识别模板
BookingConfirmation -- 配舱通知书识别模板
AirWayBill -- 航空运单识别模板
DispatchWeightNote -- 磅单发货单识别模板
ReceiptWeightNote -- 磅单收货单识别模板
ArticalRecognize -- 手写作文模版
Table -- 表格模版
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * 是否开启全文字段坐标值的识别
    */
    @SerializedName("EnableCoord")
    @Expose
    private Boolean EnableCoord;

    /**
    * 是否开启父子key识别，默认是
    */
    @SerializedName("OutputParentKey")
    @Expose
    private Boolean OutputParentKey;

    /**
    * 模版的单个属性配置
    */
    @SerializedName("ConfigAdvanced")
    @Expose
    private ConfigAdvanced ConfigAdvanced;

    /**
     * Get 图片的 Url 地址。支持的图片格式：PNG、JPG、JPEG，WORD，EXCEL，暂不支持 GIF 格式。支持的图片大小：所下载图片经 Base64 编码后不超过 7M。图片下载时间不超过 3 秒。支持的图片像素：需介于20-10000px之间。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。 
     * @return ImageUrl 图片的 Url 地址。支持的图片格式：PNG、JPG、JPEG，WORD，EXCEL，暂不支持 GIF 格式。支持的图片大小：所下载图片经 Base64 编码后不超过 7M。图片下载时间不超过 3 秒。支持的图片像素：需介于20-10000px之间。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 图片的 Url 地址。支持的图片格式：PNG、JPG、JPEG，WORD，EXCEL，暂不支持 GIF 格式。支持的图片大小：所下载图片经 Base64 编码后不超过 7M。图片下载时间不超过 3 秒。支持的图片像素：需介于20-10000px之间。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     * @param ImageUrl 图片的 Url 地址。支持的图片格式：PNG、JPG、JPEG，WORD，EXCEL，暂不支持 GIF 格式。支持的图片大小：所下载图片经 Base64 编码后不超过 7M。图片下载时间不超过 3 秒。支持的图片像素：需介于20-10000px之间。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 图片的 Base64 值。支持的图片格式：PNG、JPG、JPEG，WORD，EXCEL，暂不支持 GIF 格式。支持的图片大小：所下载图片经Base64编码后不超过 7M。图片下载时间不超过 3 秒。支持的图片像素：需介于20-10000px之间。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。 
     * @return ImageBase64 图片的 Base64 值。支持的图片格式：PNG、JPG、JPEG，WORD，EXCEL，暂不支持 GIF 格式。支持的图片大小：所下载图片经Base64编码后不超过 7M。图片下载时间不超过 3 秒。支持的图片像素：需介于20-10000px之间。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 图片的 Base64 值。支持的图片格式：PNG、JPG、JPEG，WORD，EXCEL，暂不支持 GIF 格式。支持的图片大小：所下载图片经Base64编码后不超过 7M。图片下载时间不超过 3 秒。支持的图片像素：需介于20-10000px之间。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     * @param ImageBase64 图片的 Base64 值。支持的图片格式：PNG、JPG、JPEG，WORD，EXCEL，暂不支持 GIF 格式。支持的图片大小：所下载图片经Base64编码后不超过 7M。图片下载时间不超过 3 秒。支持的图片像素：需介于20-10000px之间。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get 需要识别的PDF页面的对应页码，仅支持PDF单页识别，当上传文件为PDF且IsPdf参数值为true时有效，默认值为前3页。 
     * @return PdfPageNumber 需要识别的PDF页面的对应页码，仅支持PDF单页识别，当上传文件为PDF且IsPdf参数值为true时有效，默认值为前3页。
     */
    public Long getPdfPageNumber() {
        return this.PdfPageNumber;
    }

    /**
     * Set 需要识别的PDF页面的对应页码，仅支持PDF单页识别，当上传文件为PDF且IsPdf参数值为true时有效，默认值为前3页。
     * @param PdfPageNumber 需要识别的PDF页面的对应页码，仅支持PDF单页识别，当上传文件为PDF且IsPdf参数值为true时有效，默认值为前3页。
     */
    public void setPdfPageNumber(Long PdfPageNumber) {
        this.PdfPageNumber = PdfPageNumber;
    }

    /**
     * Get 自定义结构化功能需返回的字段名称，例：若客户想新增返回姓名、性别两个字段的识别结果，则输入ItemNames=["姓名","性别"] 
     * @return ItemNames 自定义结构化功能需返回的字段名称，例：若客户想新增返回姓名、性别两个字段的识别结果，则输入ItemNames=["姓名","性别"]
     */
    public String [] getItemNames() {
        return this.ItemNames;
    }

    /**
     * Set 自定义结构化功能需返回的字段名称，例：若客户想新增返回姓名、性别两个字段的识别结果，则输入ItemNames=["姓名","性别"]
     * @param ItemNames 自定义结构化功能需返回的字段名称，例：若客户想新增返回姓名、性别两个字段的识别结果，则输入ItemNames=["姓名","性别"]
     */
    public void setItemNames(String [] ItemNames) {
        this.ItemNames = ItemNames;
    }

    /**
     * Get true：仅输出自定义字段
flase：输出默认字段+自定义字段
默认true 
     * @return ItemNamesShowMode true：仅输出自定义字段
flase：输出默认字段+自定义字段
默认true
     */
    public Boolean getItemNamesShowMode() {
        return this.ItemNamesShowMode;
    }

    /**
     * Set true：仅输出自定义字段
flase：输出默认字段+自定义字段
默认true
     * @param ItemNamesShowMode true：仅输出自定义字段
flase：输出默认字段+自定义字段
默认true
     */
    public void setItemNamesShowMode(Boolean ItemNamesShowMode) {
        this.ItemNamesShowMode = ItemNamesShowMode;
    }

    /**
     * Get 是否开启全文字段识别 
     * @return ReturnFullText 是否开启全文字段识别
     */
    public Boolean getReturnFullText() {
        return this.ReturnFullText;
    }

    /**
     * Set 是否开启全文字段识别
     * @param ReturnFullText 是否开启全文字段识别
     */
    public void setReturnFullText(Boolean ReturnFullText) {
        this.ReturnFullText = ReturnFullText;
    }

    /**
     * Get 配置id支持：
General -- 通用场景 
InvoiceEng -- 国际invoice模版 
WayBillEng --海运订单模板
CustomsDeclaration -- 进出口报关单
WeightNote -- 磅单
MedicalMeter -- 血压仪表识别
BillOfLading -- 海运提单
EntrustmentBook -- 海运托书
WordRecognize -- 手写英文作文模版
Statement -- 对账单识别模板
BookingConfirmation -- 配舱通知书识别模板
AirWayBill -- 航空运单识别模板
DispatchWeightNote -- 磅单发货单识别模板
ReceiptWeightNote -- 磅单收货单识别模板
ArticalRecognize -- 手写作文模版
Table -- 表格模版 
     * @return ConfigId 配置id支持：
General -- 通用场景 
InvoiceEng -- 国际invoice模版 
WayBillEng --海运订单模板
CustomsDeclaration -- 进出口报关单
WeightNote -- 磅单
MedicalMeter -- 血压仪表识别
BillOfLading -- 海运提单
EntrustmentBook -- 海运托书
WordRecognize -- 手写英文作文模版
Statement -- 对账单识别模板
BookingConfirmation -- 配舱通知书识别模板
AirWayBill -- 航空运单识别模板
DispatchWeightNote -- 磅单发货单识别模板
ReceiptWeightNote -- 磅单收货单识别模板
ArticalRecognize -- 手写作文模版
Table -- 表格模版
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set 配置id支持：
General -- 通用场景 
InvoiceEng -- 国际invoice模版 
WayBillEng --海运订单模板
CustomsDeclaration -- 进出口报关单
WeightNote -- 磅单
MedicalMeter -- 血压仪表识别
BillOfLading -- 海运提单
EntrustmentBook -- 海运托书
WordRecognize -- 手写英文作文模版
Statement -- 对账单识别模板
BookingConfirmation -- 配舱通知书识别模板
AirWayBill -- 航空运单识别模板
DispatchWeightNote -- 磅单发货单识别模板
ReceiptWeightNote -- 磅单收货单识别模板
ArticalRecognize -- 手写作文模版
Table -- 表格模版
     * @param ConfigId 配置id支持：
General -- 通用场景 
InvoiceEng -- 国际invoice模版 
WayBillEng --海运订单模板
CustomsDeclaration -- 进出口报关单
WeightNote -- 磅单
MedicalMeter -- 血压仪表识别
BillOfLading -- 海运提单
EntrustmentBook -- 海运托书
WordRecognize -- 手写英文作文模版
Statement -- 对账单识别模板
BookingConfirmation -- 配舱通知书识别模板
AirWayBill -- 航空运单识别模板
DispatchWeightNote -- 磅单发货单识别模板
ReceiptWeightNote -- 磅单收货单识别模板
ArticalRecognize -- 手写作文模版
Table -- 表格模版
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get 是否开启全文字段坐标值的识别 
     * @return EnableCoord 是否开启全文字段坐标值的识别
     */
    public Boolean getEnableCoord() {
        return this.EnableCoord;
    }

    /**
     * Set 是否开启全文字段坐标值的识别
     * @param EnableCoord 是否开启全文字段坐标值的识别
     */
    public void setEnableCoord(Boolean EnableCoord) {
        this.EnableCoord = EnableCoord;
    }

    /**
     * Get 是否开启父子key识别，默认是 
     * @return OutputParentKey 是否开启父子key识别，默认是
     */
    public Boolean getOutputParentKey() {
        return this.OutputParentKey;
    }

    /**
     * Set 是否开启父子key识别，默认是
     * @param OutputParentKey 是否开启父子key识别，默认是
     */
    public void setOutputParentKey(Boolean OutputParentKey) {
        this.OutputParentKey = OutputParentKey;
    }

    /**
     * Get 模版的单个属性配置 
     * @return ConfigAdvanced 模版的单个属性配置
     */
    public ConfigAdvanced getConfigAdvanced() {
        return this.ConfigAdvanced;
    }

    /**
     * Set 模版的单个属性配置
     * @param ConfigAdvanced 模版的单个属性配置
     */
    public void setConfigAdvanced(ConfigAdvanced ConfigAdvanced) {
        this.ConfigAdvanced = ConfigAdvanced;
    }

    public SmartStructuralProRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartStructuralProRequest(SmartStructuralProRequest source) {
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.PdfPageNumber != null) {
            this.PdfPageNumber = new Long(source.PdfPageNumber);
        }
        if (source.ItemNames != null) {
            this.ItemNames = new String[source.ItemNames.length];
            for (int i = 0; i < source.ItemNames.length; i++) {
                this.ItemNames[i] = new String(source.ItemNames[i]);
            }
        }
        if (source.ItemNamesShowMode != null) {
            this.ItemNamesShowMode = new Boolean(source.ItemNamesShowMode);
        }
        if (source.ReturnFullText != null) {
            this.ReturnFullText = new Boolean(source.ReturnFullText);
        }
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.EnableCoord != null) {
            this.EnableCoord = new Boolean(source.EnableCoord);
        }
        if (source.OutputParentKey != null) {
            this.OutputParentKey = new Boolean(source.OutputParentKey);
        }
        if (source.ConfigAdvanced != null) {
            this.ConfigAdvanced = new ConfigAdvanced(source.ConfigAdvanced);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "PdfPageNumber", this.PdfPageNumber);
        this.setParamArraySimple(map, prefix + "ItemNames.", this.ItemNames);
        this.setParamSimple(map, prefix + "ItemNamesShowMode", this.ItemNamesShowMode);
        this.setParamSimple(map, prefix + "ReturnFullText", this.ReturnFullText);
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "EnableCoord", this.EnableCoord);
        this.setParamSimple(map, prefix + "OutputParentKey", this.OutputParentKey);
        this.setParamObj(map, prefix + "ConfigAdvanced.", this.ConfigAdvanced);

    }
}

