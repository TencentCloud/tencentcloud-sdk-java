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

public class RecognizeGeneralInvoiceRequest extends AbstractModel {

    /**
    * 图片的 Base64 值。支持的图片格式：PNG、JPG、JPEG、PDF，暂不支持 GIF 格式。支持的图片大小：所下载图片经Base64编码后不超过 10M。图片下载时间不超过 3 秒。支持的图片像素：单边介于20-10000px之间。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * 图片的 Url 地址。支持的图片格式：PNG、JPG、JPEG、PDF，暂不支持 GIF 格式。支持的图片大小：所下载图片经 Base64 编码后不超过 10M。图片下载时间不超过 3 秒。支持的图片像素：单边介于20-10000px之间。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 需要识别的票据类型列表，为空或不填表示识别全部类型。当传入单个类型时，图片均采用该票类型进行处理。
暂不支持多个参数进行局部控制。
0：出租车发票
1：定额发票
2：火车票
3：增值税发票
5：机票行程单
8：通用机打发票
9：汽车票
10：轮船票
11：增值税发票（卷票 ）
12：购车发票
13：过路过桥费发票
15：非税发票
16：全电发票
17：医疗发票
18：完税凭证
19：海关缴款书
20：银行回单
21：网约车行程单
22：海关进/出口货物报关单
23：海外发票
24：购物小票
25：销货清单
-1：其他发票
    */
    @SerializedName("Types")
    @Expose
    private Long [] Types;

    /**
    * 是否开启其他票识别，默认值为true，开启后可支持其他发票的智能识别。	
    */
    @SerializedName("EnableOther")
    @Expose
    private Boolean EnableOther;

    /**
    * 是否开启PDF识别，默认值为true，开启后可同时支持图片和PDF的识别。
    */
    @SerializedName("EnablePdf")
    @Expose
    private Boolean EnablePdf;

    /**
    * 需要识别的PDF页面的对应页码，传入时仅支持PDF单页识别，当上传文件为PDF且EnablePdf参数值为true时有效，默认值为1。
    */
    @SerializedName("PdfPageNumber")
    @Expose
    private Long PdfPageNumber;

    /**
    * 是否开启PDF多页识别，默认值为false，开启后可同时支持多页PDF的识别返回，仅支持返回文件前30页。开启后EnablePdf和PdfPageNumber入参不进行控制。
    */
    @SerializedName("EnableMultiplePage")
    @Expose
    private Boolean EnableMultiplePage;

    /**
    * 是否返回切割图片base64，默认值为false。
    */
    @SerializedName("EnableCutImage")
    @Expose
    private Boolean EnableCutImage;

    /**
    * 是否打开字段坐标返回。默认为false。
    */
    @SerializedName("EnableItemPolygon")
    @Expose
    private Boolean EnableItemPolygon;

    /**
    * 是否开启二维码识别。
    */
    @SerializedName("EnableQRCode")
    @Expose
    private Boolean EnableQRCode;

    /**
     * Get 图片的 Base64 值。支持的图片格式：PNG、JPG、JPEG、PDF，暂不支持 GIF 格式。支持的图片大小：所下载图片经Base64编码后不超过 10M。图片下载时间不超过 3 秒。支持的图片像素：单边介于20-10000px之间。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。 
     * @return ImageBase64 图片的 Base64 值。支持的图片格式：PNG、JPG、JPEG、PDF，暂不支持 GIF 格式。支持的图片大小：所下载图片经Base64编码后不超过 10M。图片下载时间不超过 3 秒。支持的图片像素：单边介于20-10000px之间。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 图片的 Base64 值。支持的图片格式：PNG、JPG、JPEG、PDF，暂不支持 GIF 格式。支持的图片大小：所下载图片经Base64编码后不超过 10M。图片下载时间不超过 3 秒。支持的图片像素：单边介于20-10000px之间。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     * @param ImageBase64 图片的 Base64 值。支持的图片格式：PNG、JPG、JPEG、PDF，暂不支持 GIF 格式。支持的图片大小：所下载图片经Base64编码后不超过 10M。图片下载时间不超过 3 秒。支持的图片像素：单边介于20-10000px之间。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get 图片的 Url 地址。支持的图片格式：PNG、JPG、JPEG、PDF，暂不支持 GIF 格式。支持的图片大小：所下载图片经 Base64 编码后不超过 10M。图片下载时间不超过 3 秒。支持的图片像素：单边介于20-10000px之间。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。 
     * @return ImageUrl 图片的 Url 地址。支持的图片格式：PNG、JPG、JPEG、PDF，暂不支持 GIF 格式。支持的图片大小：所下载图片经 Base64 编码后不超过 10M。图片下载时间不超过 3 秒。支持的图片像素：单边介于20-10000px之间。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 图片的 Url 地址。支持的图片格式：PNG、JPG、JPEG、PDF，暂不支持 GIF 格式。支持的图片大小：所下载图片经 Base64 编码后不超过 10M。图片下载时间不超过 3 秒。支持的图片像素：单边介于20-10000px之间。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     * @param ImageUrl 图片的 Url 地址。支持的图片格式：PNG、JPG、JPEG、PDF，暂不支持 GIF 格式。支持的图片大小：所下载图片经 Base64 编码后不超过 10M。图片下载时间不超过 3 秒。支持的图片像素：单边介于20-10000px之间。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 需要识别的票据类型列表，为空或不填表示识别全部类型。当传入单个类型时，图片均采用该票类型进行处理。
暂不支持多个参数进行局部控制。
0：出租车发票
1：定额发票
2：火车票
3：增值税发票
5：机票行程单
8：通用机打发票
9：汽车票
10：轮船票
11：增值税发票（卷票 ）
12：购车发票
13：过路过桥费发票
15：非税发票
16：全电发票
17：医疗发票
18：完税凭证
19：海关缴款书
20：银行回单
21：网约车行程单
22：海关进/出口货物报关单
23：海外发票
24：购物小票
25：销货清单
-1：其他发票 
     * @return Types 需要识别的票据类型列表，为空或不填表示识别全部类型。当传入单个类型时，图片均采用该票类型进行处理。
暂不支持多个参数进行局部控制。
0：出租车发票
1：定额发票
2：火车票
3：增值税发票
5：机票行程单
8：通用机打发票
9：汽车票
10：轮船票
11：增值税发票（卷票 ）
12：购车发票
13：过路过桥费发票
15：非税发票
16：全电发票
17：医疗发票
18：完税凭证
19：海关缴款书
20：银行回单
21：网约车行程单
22：海关进/出口货物报关单
23：海外发票
24：购物小票
25：销货清单
-1：其他发票
     */
    public Long [] getTypes() {
        return this.Types;
    }

    /**
     * Set 需要识别的票据类型列表，为空或不填表示识别全部类型。当传入单个类型时，图片均采用该票类型进行处理。
暂不支持多个参数进行局部控制。
0：出租车发票
1：定额发票
2：火车票
3：增值税发票
5：机票行程单
8：通用机打发票
9：汽车票
10：轮船票
11：增值税发票（卷票 ）
12：购车发票
13：过路过桥费发票
15：非税发票
16：全电发票
17：医疗发票
18：完税凭证
19：海关缴款书
20：银行回单
21：网约车行程单
22：海关进/出口货物报关单
23：海外发票
24：购物小票
25：销货清单
-1：其他发票
     * @param Types 需要识别的票据类型列表，为空或不填表示识别全部类型。当传入单个类型时，图片均采用该票类型进行处理。
暂不支持多个参数进行局部控制。
0：出租车发票
1：定额发票
2：火车票
3：增值税发票
5：机票行程单
8：通用机打发票
9：汽车票
10：轮船票
11：增值税发票（卷票 ）
12：购车发票
13：过路过桥费发票
15：非税发票
16：全电发票
17：医疗发票
18：完税凭证
19：海关缴款书
20：银行回单
21：网约车行程单
22：海关进/出口货物报关单
23：海外发票
24：购物小票
25：销货清单
-1：其他发票
     */
    public void setTypes(Long [] Types) {
        this.Types = Types;
    }

    /**
     * Get 是否开启其他票识别，默认值为true，开启后可支持其他发票的智能识别。	 
     * @return EnableOther 是否开启其他票识别，默认值为true，开启后可支持其他发票的智能识别。	
     */
    public Boolean getEnableOther() {
        return this.EnableOther;
    }

    /**
     * Set 是否开启其他票识别，默认值为true，开启后可支持其他发票的智能识别。	
     * @param EnableOther 是否开启其他票识别，默认值为true，开启后可支持其他发票的智能识别。	
     */
    public void setEnableOther(Boolean EnableOther) {
        this.EnableOther = EnableOther;
    }

    /**
     * Get 是否开启PDF识别，默认值为true，开启后可同时支持图片和PDF的识别。 
     * @return EnablePdf 是否开启PDF识别，默认值为true，开启后可同时支持图片和PDF的识别。
     */
    public Boolean getEnablePdf() {
        return this.EnablePdf;
    }

    /**
     * Set 是否开启PDF识别，默认值为true，开启后可同时支持图片和PDF的识别。
     * @param EnablePdf 是否开启PDF识别，默认值为true，开启后可同时支持图片和PDF的识别。
     */
    public void setEnablePdf(Boolean EnablePdf) {
        this.EnablePdf = EnablePdf;
    }

    /**
     * Get 需要识别的PDF页面的对应页码，传入时仅支持PDF单页识别，当上传文件为PDF且EnablePdf参数值为true时有效，默认值为1。 
     * @return PdfPageNumber 需要识别的PDF页面的对应页码，传入时仅支持PDF单页识别，当上传文件为PDF且EnablePdf参数值为true时有效，默认值为1。
     */
    public Long getPdfPageNumber() {
        return this.PdfPageNumber;
    }

    /**
     * Set 需要识别的PDF页面的对应页码，传入时仅支持PDF单页识别，当上传文件为PDF且EnablePdf参数值为true时有效，默认值为1。
     * @param PdfPageNumber 需要识别的PDF页面的对应页码，传入时仅支持PDF单页识别，当上传文件为PDF且EnablePdf参数值为true时有效，默认值为1。
     */
    public void setPdfPageNumber(Long PdfPageNumber) {
        this.PdfPageNumber = PdfPageNumber;
    }

    /**
     * Get 是否开启PDF多页识别，默认值为false，开启后可同时支持多页PDF的识别返回，仅支持返回文件前30页。开启后EnablePdf和PdfPageNumber入参不进行控制。 
     * @return EnableMultiplePage 是否开启PDF多页识别，默认值为false，开启后可同时支持多页PDF的识别返回，仅支持返回文件前30页。开启后EnablePdf和PdfPageNumber入参不进行控制。
     */
    public Boolean getEnableMultiplePage() {
        return this.EnableMultiplePage;
    }

    /**
     * Set 是否开启PDF多页识别，默认值为false，开启后可同时支持多页PDF的识别返回，仅支持返回文件前30页。开启后EnablePdf和PdfPageNumber入参不进行控制。
     * @param EnableMultiplePage 是否开启PDF多页识别，默认值为false，开启后可同时支持多页PDF的识别返回，仅支持返回文件前30页。开启后EnablePdf和PdfPageNumber入参不进行控制。
     */
    public void setEnableMultiplePage(Boolean EnableMultiplePage) {
        this.EnableMultiplePage = EnableMultiplePage;
    }

    /**
     * Get 是否返回切割图片base64，默认值为false。 
     * @return EnableCutImage 是否返回切割图片base64，默认值为false。
     */
    public Boolean getEnableCutImage() {
        return this.EnableCutImage;
    }

    /**
     * Set 是否返回切割图片base64，默认值为false。
     * @param EnableCutImage 是否返回切割图片base64，默认值为false。
     */
    public void setEnableCutImage(Boolean EnableCutImage) {
        this.EnableCutImage = EnableCutImage;
    }

    /**
     * Get 是否打开字段坐标返回。默认为false。 
     * @return EnableItemPolygon 是否打开字段坐标返回。默认为false。
     */
    public Boolean getEnableItemPolygon() {
        return this.EnableItemPolygon;
    }

    /**
     * Set 是否打开字段坐标返回。默认为false。
     * @param EnableItemPolygon 是否打开字段坐标返回。默认为false。
     */
    public void setEnableItemPolygon(Boolean EnableItemPolygon) {
        this.EnableItemPolygon = EnableItemPolygon;
    }

    /**
     * Get 是否开启二维码识别。 
     * @return EnableQRCode 是否开启二维码识别。
     */
    public Boolean getEnableQRCode() {
        return this.EnableQRCode;
    }

    /**
     * Set 是否开启二维码识别。
     * @param EnableQRCode 是否开启二维码识别。
     */
    public void setEnableQRCode(Boolean EnableQRCode) {
        this.EnableQRCode = EnableQRCode;
    }

    public RecognizeGeneralInvoiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeGeneralInvoiceRequest(RecognizeGeneralInvoiceRequest source) {
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.Types != null) {
            this.Types = new Long[source.Types.length];
            for (int i = 0; i < source.Types.length; i++) {
                this.Types[i] = new Long(source.Types[i]);
            }
        }
        if (source.EnableOther != null) {
            this.EnableOther = new Boolean(source.EnableOther);
        }
        if (source.EnablePdf != null) {
            this.EnablePdf = new Boolean(source.EnablePdf);
        }
        if (source.PdfPageNumber != null) {
            this.PdfPageNumber = new Long(source.PdfPageNumber);
        }
        if (source.EnableMultiplePage != null) {
            this.EnableMultiplePage = new Boolean(source.EnableMultiplePage);
        }
        if (source.EnableCutImage != null) {
            this.EnableCutImage = new Boolean(source.EnableCutImage);
        }
        if (source.EnableItemPolygon != null) {
            this.EnableItemPolygon = new Boolean(source.EnableItemPolygon);
        }
        if (source.EnableQRCode != null) {
            this.EnableQRCode = new Boolean(source.EnableQRCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamArraySimple(map, prefix + "Types.", this.Types);
        this.setParamSimple(map, prefix + "EnableOther", this.EnableOther);
        this.setParamSimple(map, prefix + "EnablePdf", this.EnablePdf);
        this.setParamSimple(map, prefix + "PdfPageNumber", this.PdfPageNumber);
        this.setParamSimple(map, prefix + "EnableMultiplePage", this.EnableMultiplePage);
        this.setParamSimple(map, prefix + "EnableCutImage", this.EnableCutImage);
        this.setParamSimple(map, prefix + "EnableItemPolygon", this.EnableItemPolygon);
        this.setParamSimple(map, prefix + "EnableQRCode", this.EnableQRCode);

    }
}

