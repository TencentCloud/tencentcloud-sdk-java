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

public class InvoiceItem extends AbstractModel{

    /**
    * 识别结果。
OK：表示识别成功；FailedOperation.UnsupportedInvoice：表示不支持识别；
FailedOperation.UnKnowError：表示识别失败；
其它错误码见各个票据接口的定义。
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 识别出的图片所属的票据类型。
-1：未知类型
0：出租车发票
1：定额发票
2：火车票
3：增值税发票
5：机票行程单
8：通用机打发票
9：汽车票
10：轮船票
11：增值税发票（卷票）
12：购车发票
13：过路过桥费发票
15：非税发票
16：全电发票
17：医疗发票
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 该发票在原图片中的四点坐标。
    */
    @SerializedName("Polygon")
    @Expose
    private Polygon Polygon;

    /**
    * 识别出的图片在混贴票据图片中的旋转角度。
    */
    @SerializedName("Angle")
    @Expose
    private Float Angle;

    /**
    * 识别到的内容。
    */
    @SerializedName("SingleInvoiceInfos")
    @Expose
    private SingleInvoiceItem SingleInvoiceInfos;

    /**
    * 发票处于识别图片或PDF文件中的页教，默认从1开始。
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 发票详细类型，详见上方 SubType 返回值说明
    */
    @SerializedName("SubType")
    @Expose
    private String SubType;

    /**
    * 发票类型描述，详见上方 TypeDescription  返回值说明
    */
    @SerializedName("TypeDescription")
    @Expose
    private String TypeDescription;

    /**
    * 切割单图文件，Base64编码后的切图后的图片文件，开启 EnableCutImage 后进行返回
    */
    @SerializedName("CutImage")
    @Expose
    private String CutImage;

    /**
    * 发票详细类型描述，详见上方 SubType 返回值说明
    */
    @SerializedName("SubTypeDescription")
    @Expose
    private String SubTypeDescription;

    /**
     * Get 识别结果。
OK：表示识别成功；FailedOperation.UnsupportedInvoice：表示不支持识别；
FailedOperation.UnKnowError：表示识别失败；
其它错误码见各个票据接口的定义。 
     * @return Code 识别结果。
OK：表示识别成功；FailedOperation.UnsupportedInvoice：表示不支持识别；
FailedOperation.UnKnowError：表示识别失败；
其它错误码见各个票据接口的定义。
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 识别结果。
OK：表示识别成功；FailedOperation.UnsupportedInvoice：表示不支持识别；
FailedOperation.UnKnowError：表示识别失败；
其它错误码见各个票据接口的定义。
     * @param Code 识别结果。
OK：表示识别成功；FailedOperation.UnsupportedInvoice：表示不支持识别；
FailedOperation.UnKnowError：表示识别失败；
其它错误码见各个票据接口的定义。
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 识别出的图片所属的票据类型。
-1：未知类型
0：出租车发票
1：定额发票
2：火车票
3：增值税发票
5：机票行程单
8：通用机打发票
9：汽车票
10：轮船票
11：增值税发票（卷票）
12：购车发票
13：过路过桥费发票
15：非税发票
16：全电发票
17：医疗发票 
     * @return Type 识别出的图片所属的票据类型。
-1：未知类型
0：出租车发票
1：定额发票
2：火车票
3：增值税发票
5：机票行程单
8：通用机打发票
9：汽车票
10：轮船票
11：增值税发票（卷票）
12：购车发票
13：过路过桥费发票
15：非税发票
16：全电发票
17：医疗发票
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 识别出的图片所属的票据类型。
-1：未知类型
0：出租车发票
1：定额发票
2：火车票
3：增值税发票
5：机票行程单
8：通用机打发票
9：汽车票
10：轮船票
11：增值税发票（卷票）
12：购车发票
13：过路过桥费发票
15：非税发票
16：全电发票
17：医疗发票
     * @param Type 识别出的图片所属的票据类型。
-1：未知类型
0：出租车发票
1：定额发票
2：火车票
3：增值税发票
5：机票行程单
8：通用机打发票
9：汽车票
10：轮船票
11：增值税发票（卷票）
12：购车发票
13：过路过桥费发票
15：非税发票
16：全电发票
17：医疗发票
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 该发票在原图片中的四点坐标。 
     * @return Polygon 该发票在原图片中的四点坐标。
     */
    public Polygon getPolygon() {
        return this.Polygon;
    }

    /**
     * Set 该发票在原图片中的四点坐标。
     * @param Polygon 该发票在原图片中的四点坐标。
     */
    public void setPolygon(Polygon Polygon) {
        this.Polygon = Polygon;
    }

    /**
     * Get 识别出的图片在混贴票据图片中的旋转角度。 
     * @return Angle 识别出的图片在混贴票据图片中的旋转角度。
     */
    public Float getAngle() {
        return this.Angle;
    }

    /**
     * Set 识别出的图片在混贴票据图片中的旋转角度。
     * @param Angle 识别出的图片在混贴票据图片中的旋转角度。
     */
    public void setAngle(Float Angle) {
        this.Angle = Angle;
    }

    /**
     * Get 识别到的内容。 
     * @return SingleInvoiceInfos 识别到的内容。
     */
    public SingleInvoiceItem getSingleInvoiceInfos() {
        return this.SingleInvoiceInfos;
    }

    /**
     * Set 识别到的内容。
     * @param SingleInvoiceInfos 识别到的内容。
     */
    public void setSingleInvoiceInfos(SingleInvoiceItem SingleInvoiceInfos) {
        this.SingleInvoiceInfos = SingleInvoiceInfos;
    }

    /**
     * Get 发票处于识别图片或PDF文件中的页教，默认从1开始。 
     * @return Page 发票处于识别图片或PDF文件中的页教，默认从1开始。
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 发票处于识别图片或PDF文件中的页教，默认从1开始。
     * @param Page 发票处于识别图片或PDF文件中的页教，默认从1开始。
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 发票详细类型，详见上方 SubType 返回值说明 
     * @return SubType 发票详细类型，详见上方 SubType 返回值说明
     */
    public String getSubType() {
        return this.SubType;
    }

    /**
     * Set 发票详细类型，详见上方 SubType 返回值说明
     * @param SubType 发票详细类型，详见上方 SubType 返回值说明
     */
    public void setSubType(String SubType) {
        this.SubType = SubType;
    }

    /**
     * Get 发票类型描述，详见上方 TypeDescription  返回值说明 
     * @return TypeDescription 发票类型描述，详见上方 TypeDescription  返回值说明
     */
    public String getTypeDescription() {
        return this.TypeDescription;
    }

    /**
     * Set 发票类型描述，详见上方 TypeDescription  返回值说明
     * @param TypeDescription 发票类型描述，详见上方 TypeDescription  返回值说明
     */
    public void setTypeDescription(String TypeDescription) {
        this.TypeDescription = TypeDescription;
    }

    /**
     * Get 切割单图文件，Base64编码后的切图后的图片文件，开启 EnableCutImage 后进行返回 
     * @return CutImage 切割单图文件，Base64编码后的切图后的图片文件，开启 EnableCutImage 后进行返回
     */
    public String getCutImage() {
        return this.CutImage;
    }

    /**
     * Set 切割单图文件，Base64编码后的切图后的图片文件，开启 EnableCutImage 后进行返回
     * @param CutImage 切割单图文件，Base64编码后的切图后的图片文件，开启 EnableCutImage 后进行返回
     */
    public void setCutImage(String CutImage) {
        this.CutImage = CutImage;
    }

    /**
     * Get 发票详细类型描述，详见上方 SubType 返回值说明 
     * @return SubTypeDescription 发票详细类型描述，详见上方 SubType 返回值说明
     */
    public String getSubTypeDescription() {
        return this.SubTypeDescription;
    }

    /**
     * Set 发票详细类型描述，详见上方 SubType 返回值说明
     * @param SubTypeDescription 发票详细类型描述，详见上方 SubType 返回值说明
     */
    public void setSubTypeDescription(String SubTypeDescription) {
        this.SubTypeDescription = SubTypeDescription;
    }

    public InvoiceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvoiceItem(InvoiceItem source) {
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Polygon != null) {
            this.Polygon = new Polygon(source.Polygon);
        }
        if (source.Angle != null) {
            this.Angle = new Float(source.Angle);
        }
        if (source.SingleInvoiceInfos != null) {
            this.SingleInvoiceInfos = new SingleInvoiceItem(source.SingleInvoiceInfos);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.SubType != null) {
            this.SubType = new String(source.SubType);
        }
        if (source.TypeDescription != null) {
            this.TypeDescription = new String(source.TypeDescription);
        }
        if (source.CutImage != null) {
            this.CutImage = new String(source.CutImage);
        }
        if (source.SubTypeDescription != null) {
            this.SubTypeDescription = new String(source.SubTypeDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Polygon.", this.Polygon);
        this.setParamSimple(map, prefix + "Angle", this.Angle);
        this.setParamObj(map, prefix + "SingleInvoiceInfos.", this.SingleInvoiceInfos);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "SubType", this.SubType);
        this.setParamSimple(map, prefix + "TypeDescription", this.TypeDescription);
        this.setParamSimple(map, prefix + "CutImage", this.CutImage);
        this.setParamSimple(map, prefix + "SubTypeDescription", this.SubTypeDescription);

    }
}

