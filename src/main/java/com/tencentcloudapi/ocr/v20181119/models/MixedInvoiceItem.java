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

public class MixedInvoiceItem extends AbstractModel{

    /**
    * 识别结果。
OK：表示识别成功；FailedOperation.UnsupportedInvioce：表示不支持识别；
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
11：增值税发票（卷票 ）
12：购车发票
13：过路过桥费发票
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 识别出的图片在混贴票据图片中的位置信息。与Angel结合可以得出原图位置，组成RotatedRect((X+0.5\*Width,Y+0.5\*Height), (Width, Height), Angle)，详情可参考OpenCV文档。
    */
    @SerializedName("Rect")
    @Expose
    private Rect Rect;

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
    private SingleInvoiceInfo [] SingleInvoiceInfos;

    /**
     * Get 识别结果。
OK：表示识别成功；FailedOperation.UnsupportedInvioce：表示不支持识别；
FailedOperation.UnKnowError：表示识别失败；
其它错误码见各个票据接口的定义。 
     * @return Code 识别结果。
OK：表示识别成功；FailedOperation.UnsupportedInvioce：表示不支持识别；
FailedOperation.UnKnowError：表示识别失败；
其它错误码见各个票据接口的定义。
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 识别结果。
OK：表示识别成功；FailedOperation.UnsupportedInvioce：表示不支持识别；
FailedOperation.UnKnowError：表示识别失败；
其它错误码见各个票据接口的定义。
     * @param Code 识别结果。
OK：表示识别成功；FailedOperation.UnsupportedInvioce：表示不支持识别；
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
11：增值税发票（卷票 ）
12：购车发票
13：过路过桥费发票 
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
11：增值税发票（卷票 ）
12：购车发票
13：过路过桥费发票
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
11：增值税发票（卷票 ）
12：购车发票
13：过路过桥费发票
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
11：增值税发票（卷票 ）
12：购车发票
13：过路过桥费发票
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 识别出的图片在混贴票据图片中的位置信息。与Angel结合可以得出原图位置，组成RotatedRect((X+0.5\*Width,Y+0.5\*Height), (Width, Height), Angle)，详情可参考OpenCV文档。 
     * @return Rect 识别出的图片在混贴票据图片中的位置信息。与Angel结合可以得出原图位置，组成RotatedRect((X+0.5\*Width,Y+0.5\*Height), (Width, Height), Angle)，详情可参考OpenCV文档。
     */
    public Rect getRect() {
        return this.Rect;
    }

    /**
     * Set 识别出的图片在混贴票据图片中的位置信息。与Angel结合可以得出原图位置，组成RotatedRect((X+0.5\*Width,Y+0.5\*Height), (Width, Height), Angle)，详情可参考OpenCV文档。
     * @param Rect 识别出的图片在混贴票据图片中的位置信息。与Angel结合可以得出原图位置，组成RotatedRect((X+0.5\*Width,Y+0.5\*Height), (Width, Height), Angle)，详情可参考OpenCV文档。
     */
    public void setRect(Rect Rect) {
        this.Rect = Rect;
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
    public SingleInvoiceInfo [] getSingleInvoiceInfos() {
        return this.SingleInvoiceInfos;
    }

    /**
     * Set 识别到的内容。
     * @param SingleInvoiceInfos 识别到的内容。
     */
    public void setSingleInvoiceInfos(SingleInvoiceInfo [] SingleInvoiceInfos) {
        this.SingleInvoiceInfos = SingleInvoiceInfos;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Rect.", this.Rect);
        this.setParamSimple(map, prefix + "Angle", this.Angle);
        this.setParamArrayObj(map, prefix + "SingleInvoiceInfos.", this.SingleInvoiceInfos);

    }
}

