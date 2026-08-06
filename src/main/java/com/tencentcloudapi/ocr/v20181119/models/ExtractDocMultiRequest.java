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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtractDocMultiRequest extends AbstractModel {

    /**
    * <p>图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别。</p>
    */
    @SerializedName("PdfPageNumber")
    @Expose
    private Long PdfPageNumber;

    /**
    * <p>自定义结构化功能需返回的字段名称，例：若客户想新增返回姓名、性别两个字段的识别结果，则输入ItemNames=[&quot;姓名&quot;,&quot;性别&quot;]</p>
    */
    @SerializedName("ItemNames")
    @Expose
    private String [] ItemNames;

    /**
    * <p>true：仅输出自定义字段<br>false：输出默认字段+自定义字段<br>默认true</p>
    */
    @SerializedName("ItemNamesShowMode")
    @Expose
    private Boolean ItemNamesShowMode;

    /**
    * <p>是否开启全文字段识别</p>
    */
    @SerializedName("ReturnFullText")
    @Expose
    private Boolean ReturnFullText;

    /**
    * <p>配置id支持：<br>General -- 通用场景<br>InvoiceEng -- 国际invoice模板<br>WayBillEng --海运订单模板<br>CustomsDeclaration -- 进出口报关单<br>WeightNote -- 磅单<br>MedicalMeter -- 血压仪表识别<br>BillOfLading -- 海运提单<br>EntrustmentBook -- 海运托书<br>Statement -- 对账单识别模板<br>BookingConfirmation -- 配舱通知书识别模板<br>AirWayBill -- 航空运单识别模板<br>Table -- 表格模板<br>SteelLabel -- 实物标签识别模板<br>CarInsurance -- 车辆保险单识别模板<br>MultiRealEstateCertificate -- 房产材料识别模板<br>MultiRealEstateMaterial -- 房产证明识别模板<br>HongKongUtilityBill -- 中国香港水电煤单识别模板<br>OverseasCheques -- 海外支票<br>RegistrationCertificate -- 备案证<br>u200bGridPhoto -- 电网系统照片<br>u200bSignaturePage -- 签署页<br>u200bSalesDeliveryNote -- 销售发货单</p>
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * <p>是否开启全文字段坐标值的识别</p>
    */
    @SerializedName("EnableCoord")
    @Expose
    private Boolean EnableCoord;

    /**
    * <p>是否开启父子key识别，默认是</p>
    */
    @SerializedName("OutputParentKey")
    @Expose
    private Boolean OutputParentKey;

    /**
    * <p>模板的单个属性配置</p>
    */
    @SerializedName("ConfigAdvanced")
    @Expose
    private ConfigAdvanced ConfigAdvanced;

    /**
    * <p>cn时，添加的key为中文<br>en时，添加的key为英语</p>
    */
    @SerializedName("OutputLanguage")
    @Expose
    private String OutputLanguage;

    /**
    * <p>自定义抽取需要的字段名称、字段类型、字段提示词</p>
    */
    @SerializedName("NewItemNames")
    @Expose
    private ItemNames [] NewItemNames;

    /**
    * <p>文档抽取（多模态）识别服务所用的算法模型版本<br>-目前入参支持“1.0”和“2.0“两个输入。</p><ul><li>2026年7月20日开始，默认为“2.0”，之前使用过本接口的账号若未填写本参数默认为“1.0”。</li><li>2026年7月20日后开通服务的账号仅支持输入“2.0”。</li><li>不同算法模型版本对应的文档抽取识别算法不同，新版本的整体效果会优于旧版本，建议使用“2.0”版本。<br>示例值：2.0</li></ul>
    */
    @SerializedName("MultiModelVersion")
    @Expose
    private String MultiModelVersion;

    /**
     * Get <p>图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p> 
     * @return ImageUrl <p>图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
     * @param ImageUrl <p>图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get <p>图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p> 
     * @return ImageBase64 <p>图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set <p>图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
     * @param ImageBase64 <p>图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别。</p> 
     * @return PdfPageNumber <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别。</p>
     */
    public Long getPdfPageNumber() {
        return this.PdfPageNumber;
    }

    /**
     * Set <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别。</p>
     * @param PdfPageNumber <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别。</p>
     */
    public void setPdfPageNumber(Long PdfPageNumber) {
        this.PdfPageNumber = PdfPageNumber;
    }

    /**
     * Get <p>自定义结构化功能需返回的字段名称，例：若客户想新增返回姓名、性别两个字段的识别结果，则输入ItemNames=[&quot;姓名&quot;,&quot;性别&quot;]</p> 
     * @return ItemNames <p>自定义结构化功能需返回的字段名称，例：若客户想新增返回姓名、性别两个字段的识别结果，则输入ItemNames=[&quot;姓名&quot;,&quot;性别&quot;]</p>
     */
    public String [] getItemNames() {
        return this.ItemNames;
    }

    /**
     * Set <p>自定义结构化功能需返回的字段名称，例：若客户想新增返回姓名、性别两个字段的识别结果，则输入ItemNames=[&quot;姓名&quot;,&quot;性别&quot;]</p>
     * @param ItemNames <p>自定义结构化功能需返回的字段名称，例：若客户想新增返回姓名、性别两个字段的识别结果，则输入ItemNames=[&quot;姓名&quot;,&quot;性别&quot;]</p>
     */
    public void setItemNames(String [] ItemNames) {
        this.ItemNames = ItemNames;
    }

    /**
     * Get <p>true：仅输出自定义字段<br>false：输出默认字段+自定义字段<br>默认true</p> 
     * @return ItemNamesShowMode <p>true：仅输出自定义字段<br>false：输出默认字段+自定义字段<br>默认true</p>
     */
    public Boolean getItemNamesShowMode() {
        return this.ItemNamesShowMode;
    }

    /**
     * Set <p>true：仅输出自定义字段<br>false：输出默认字段+自定义字段<br>默认true</p>
     * @param ItemNamesShowMode <p>true：仅输出自定义字段<br>false：输出默认字段+自定义字段<br>默认true</p>
     */
    public void setItemNamesShowMode(Boolean ItemNamesShowMode) {
        this.ItemNamesShowMode = ItemNamesShowMode;
    }

    /**
     * Get <p>是否开启全文字段识别</p> 
     * @return ReturnFullText <p>是否开启全文字段识别</p>
     */
    public Boolean getReturnFullText() {
        return this.ReturnFullText;
    }

    /**
     * Set <p>是否开启全文字段识别</p>
     * @param ReturnFullText <p>是否开启全文字段识别</p>
     */
    public void setReturnFullText(Boolean ReturnFullText) {
        this.ReturnFullText = ReturnFullText;
    }

    /**
     * Get <p>配置id支持：<br>General -- 通用场景<br>InvoiceEng -- 国际invoice模板<br>WayBillEng --海运订单模板<br>CustomsDeclaration -- 进出口报关单<br>WeightNote -- 磅单<br>MedicalMeter -- 血压仪表识别<br>BillOfLading -- 海运提单<br>EntrustmentBook -- 海运托书<br>Statement -- 对账单识别模板<br>BookingConfirmation -- 配舱通知书识别模板<br>AirWayBill -- 航空运单识别模板<br>Table -- 表格模板<br>SteelLabel -- 实物标签识别模板<br>CarInsurance -- 车辆保险单识别模板<br>MultiRealEstateCertificate -- 房产材料识别模板<br>MultiRealEstateMaterial -- 房产证明识别模板<br>HongKongUtilityBill -- 中国香港水电煤单识别模板<br>OverseasCheques -- 海外支票<br>RegistrationCertificate -- 备案证<br>u200bGridPhoto -- 电网系统照片<br>u200bSignaturePage -- 签署页<br>u200bSalesDeliveryNote -- 销售发货单</p> 
     * @return ConfigId <p>配置id支持：<br>General -- 通用场景<br>InvoiceEng -- 国际invoice模板<br>WayBillEng --海运订单模板<br>CustomsDeclaration -- 进出口报关单<br>WeightNote -- 磅单<br>MedicalMeter -- 血压仪表识别<br>BillOfLading -- 海运提单<br>EntrustmentBook -- 海运托书<br>Statement -- 对账单识别模板<br>BookingConfirmation -- 配舱通知书识别模板<br>AirWayBill -- 航空运单识别模板<br>Table -- 表格模板<br>SteelLabel -- 实物标签识别模板<br>CarInsurance -- 车辆保险单识别模板<br>MultiRealEstateCertificate -- 房产材料识别模板<br>MultiRealEstateMaterial -- 房产证明识别模板<br>HongKongUtilityBill -- 中国香港水电煤单识别模板<br>OverseasCheques -- 海外支票<br>RegistrationCertificate -- 备案证<br>u200bGridPhoto -- 电网系统照片<br>u200bSignaturePage -- 签署页<br>u200bSalesDeliveryNote -- 销售发货单</p>
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set <p>配置id支持：<br>General -- 通用场景<br>InvoiceEng -- 国际invoice模板<br>WayBillEng --海运订单模板<br>CustomsDeclaration -- 进出口报关单<br>WeightNote -- 磅单<br>MedicalMeter -- 血压仪表识别<br>BillOfLading -- 海运提单<br>EntrustmentBook -- 海运托书<br>Statement -- 对账单识别模板<br>BookingConfirmation -- 配舱通知书识别模板<br>AirWayBill -- 航空运单识别模板<br>Table -- 表格模板<br>SteelLabel -- 实物标签识别模板<br>CarInsurance -- 车辆保险单识别模板<br>MultiRealEstateCertificate -- 房产材料识别模板<br>MultiRealEstateMaterial -- 房产证明识别模板<br>HongKongUtilityBill -- 中国香港水电煤单识别模板<br>OverseasCheques -- 海外支票<br>RegistrationCertificate -- 备案证<br>u200bGridPhoto -- 电网系统照片<br>u200bSignaturePage -- 签署页<br>u200bSalesDeliveryNote -- 销售发货单</p>
     * @param ConfigId <p>配置id支持：<br>General -- 通用场景<br>InvoiceEng -- 国际invoice模板<br>WayBillEng --海运订单模板<br>CustomsDeclaration -- 进出口报关单<br>WeightNote -- 磅单<br>MedicalMeter -- 血压仪表识别<br>BillOfLading -- 海运提单<br>EntrustmentBook -- 海运托书<br>Statement -- 对账单识别模板<br>BookingConfirmation -- 配舱通知书识别模板<br>AirWayBill -- 航空运单识别模板<br>Table -- 表格模板<br>SteelLabel -- 实物标签识别模板<br>CarInsurance -- 车辆保险单识别模板<br>MultiRealEstateCertificate -- 房产材料识别模板<br>MultiRealEstateMaterial -- 房产证明识别模板<br>HongKongUtilityBill -- 中国香港水电煤单识别模板<br>OverseasCheques -- 海外支票<br>RegistrationCertificate -- 备案证<br>u200bGridPhoto -- 电网系统照片<br>u200bSignaturePage -- 签署页<br>u200bSalesDeliveryNote -- 销售发货单</p>
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get <p>是否开启全文字段坐标值的识别</p> 
     * @return EnableCoord <p>是否开启全文字段坐标值的识别</p>
     */
    public Boolean getEnableCoord() {
        return this.EnableCoord;
    }

    /**
     * Set <p>是否开启全文字段坐标值的识别</p>
     * @param EnableCoord <p>是否开启全文字段坐标值的识别</p>
     */
    public void setEnableCoord(Boolean EnableCoord) {
        this.EnableCoord = EnableCoord;
    }

    /**
     * Get <p>是否开启父子key识别，默认是</p> 
     * @return OutputParentKey <p>是否开启父子key识别，默认是</p>
     */
    public Boolean getOutputParentKey() {
        return this.OutputParentKey;
    }

    /**
     * Set <p>是否开启父子key识别，默认是</p>
     * @param OutputParentKey <p>是否开启父子key识别，默认是</p>
     */
    public void setOutputParentKey(Boolean OutputParentKey) {
        this.OutputParentKey = OutputParentKey;
    }

    /**
     * Get <p>模板的单个属性配置</p> 
     * @return ConfigAdvanced <p>模板的单个属性配置</p>
     */
    public ConfigAdvanced getConfigAdvanced() {
        return this.ConfigAdvanced;
    }

    /**
     * Set <p>模板的单个属性配置</p>
     * @param ConfigAdvanced <p>模板的单个属性配置</p>
     */
    public void setConfigAdvanced(ConfigAdvanced ConfigAdvanced) {
        this.ConfigAdvanced = ConfigAdvanced;
    }

    /**
     * Get <p>cn时，添加的key为中文<br>en时，添加的key为英语</p> 
     * @return OutputLanguage <p>cn时，添加的key为中文<br>en时，添加的key为英语</p>
     */
    public String getOutputLanguage() {
        return this.OutputLanguage;
    }

    /**
     * Set <p>cn时，添加的key为中文<br>en时，添加的key为英语</p>
     * @param OutputLanguage <p>cn时，添加的key为中文<br>en时，添加的key为英语</p>
     */
    public void setOutputLanguage(String OutputLanguage) {
        this.OutputLanguage = OutputLanguage;
    }

    /**
     * Get <p>自定义抽取需要的字段名称、字段类型、字段提示词</p> 
     * @return NewItemNames <p>自定义抽取需要的字段名称、字段类型、字段提示词</p>
     */
    public ItemNames [] getNewItemNames() {
        return this.NewItemNames;
    }

    /**
     * Set <p>自定义抽取需要的字段名称、字段类型、字段提示词</p>
     * @param NewItemNames <p>自定义抽取需要的字段名称、字段类型、字段提示词</p>
     */
    public void setNewItemNames(ItemNames [] NewItemNames) {
        this.NewItemNames = NewItemNames;
    }

    /**
     * Get <p>文档抽取（多模态）识别服务所用的算法模型版本<br>-目前入参支持“1.0”和“2.0“两个输入。</p><ul><li>2026年7月20日开始，默认为“2.0”，之前使用过本接口的账号若未填写本参数默认为“1.0”。</li><li>2026年7月20日后开通服务的账号仅支持输入“2.0”。</li><li>不同算法模型版本对应的文档抽取识别算法不同，新版本的整体效果会优于旧版本，建议使用“2.0”版本。<br>示例值：2.0</li></ul> 
     * @return MultiModelVersion <p>文档抽取（多模态）识别服务所用的算法模型版本<br>-目前入参支持“1.0”和“2.0“两个输入。</p><ul><li>2026年7月20日开始，默认为“2.0”，之前使用过本接口的账号若未填写本参数默认为“1.0”。</li><li>2026年7月20日后开通服务的账号仅支持输入“2.0”。</li><li>不同算法模型版本对应的文档抽取识别算法不同，新版本的整体效果会优于旧版本，建议使用“2.0”版本。<br>示例值：2.0</li></ul>
     */
    public String getMultiModelVersion() {
        return this.MultiModelVersion;
    }

    /**
     * Set <p>文档抽取（多模态）识别服务所用的算法模型版本<br>-目前入参支持“1.0”和“2.0“两个输入。</p><ul><li>2026年7月20日开始，默认为“2.0”，之前使用过本接口的账号若未填写本参数默认为“1.0”。</li><li>2026年7月20日后开通服务的账号仅支持输入“2.0”。</li><li>不同算法模型版本对应的文档抽取识别算法不同，新版本的整体效果会优于旧版本，建议使用“2.0”版本。<br>示例值：2.0</li></ul>
     * @param MultiModelVersion <p>文档抽取（多模态）识别服务所用的算法模型版本<br>-目前入参支持“1.0”和“2.0“两个输入。</p><ul><li>2026年7月20日开始，默认为“2.0”，之前使用过本接口的账号若未填写本参数默认为“1.0”。</li><li>2026年7月20日后开通服务的账号仅支持输入“2.0”。</li><li>不同算法模型版本对应的文档抽取识别算法不同，新版本的整体效果会优于旧版本，建议使用“2.0”版本。<br>示例值：2.0</li></ul>
     */
    public void setMultiModelVersion(String MultiModelVersion) {
        this.MultiModelVersion = MultiModelVersion;
    }

    public ExtractDocMultiRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtractDocMultiRequest(ExtractDocMultiRequest source) {
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
        if (source.OutputLanguage != null) {
            this.OutputLanguage = new String(source.OutputLanguage);
        }
        if (source.NewItemNames != null) {
            this.NewItemNames = new ItemNames[source.NewItemNames.length];
            for (int i = 0; i < source.NewItemNames.length; i++) {
                this.NewItemNames[i] = new ItemNames(source.NewItemNames[i]);
            }
        }
        if (source.MultiModelVersion != null) {
            this.MultiModelVersion = new String(source.MultiModelVersion);
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
        this.setParamSimple(map, prefix + "OutputLanguage", this.OutputLanguage);
        this.setParamArrayObj(map, prefix + "NewItemNames.", this.NewItemNames);
        this.setParamSimple(map, prefix + "MultiModelVersion", this.MultiModelVersion);

    }
}

