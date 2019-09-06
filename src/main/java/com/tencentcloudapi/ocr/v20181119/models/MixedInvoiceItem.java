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

public class MixedInvoiceItem  extends AbstractModel{

    /**
    * 识别结果。
OK：表示识别成功；FailedOperation.UnsupportedInvioce：表示不支持识别；
FailedOperation.UnKnowError： 表示识别失败；
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
4：客运限额发票（仅支持类型检测，不支持识别）
5：机票行程单
6：酒店账单（仅支持类型检测，不支持识别）
7：完税证明
8：通用机打发票
9：汽车票
10：轮船票
11：增值税发票（卷票 ）
12：购车发票
13：过路过桥费发票
14：购物小票（仅支持类型检测，不支持识别）
    */
    @SerializedName("Type")
    @Expose
    private Integer Type;

    /**
    * 识别出的图片在混贴票据图片中的位置信息。
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
     * 获取识别结果。
OK：表示识别成功；FailedOperation.UnsupportedInvioce：表示不支持识别；
FailedOperation.UnKnowError： 表示识别失败；
其它错误码见各个票据接口的定义。
     * @return Code 识别结果。
OK：表示识别成功；FailedOperation.UnsupportedInvioce：表示不支持识别；
FailedOperation.UnKnowError： 表示识别失败；
其它错误码见各个票据接口的定义。
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * 设置识别结果。
OK：表示识别成功；FailedOperation.UnsupportedInvioce：表示不支持识别；
FailedOperation.UnKnowError： 表示识别失败；
其它错误码见各个票据接口的定义。
     * @param Code 识别结果。
OK：表示识别成功；FailedOperation.UnsupportedInvioce：表示不支持识别；
FailedOperation.UnKnowError： 表示识别失败；
其它错误码见各个票据接口的定义。
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * 获取识别出的图片所属的票据类型。
-1：未知类型
0：出租车发票
1：定额发票
2：火车票
3：增值税发票
4：客运限额发票（仅支持类型检测，不支持识别）
5：机票行程单
6：酒店账单（仅支持类型检测，不支持识别）
7：完税证明
8：通用机打发票
9：汽车票
10：轮船票
11：增值税发票（卷票 ）
12：购车发票
13：过路过桥费发票
14：购物小票（仅支持类型检测，不支持识别）
     * @return Type 识别出的图片所属的票据类型。
-1：未知类型
0：出租车发票
1：定额发票
2：火车票
3：增值税发票
4：客运限额发票（仅支持类型检测，不支持识别）
5：机票行程单
6：酒店账单（仅支持类型检测，不支持识别）
7：完税证明
8：通用机打发票
9：汽车票
10：轮船票
11：增值税发票（卷票 ）
12：购车发票
13：过路过桥费发票
14：购物小票（仅支持类型检测，不支持识别）
     */
    public Integer getType() {
        return this.Type;
    }

    /**
     * 设置识别出的图片所属的票据类型。
-1：未知类型
0：出租车发票
1：定额发票
2：火车票
3：增值税发票
4：客运限额发票（仅支持类型检测，不支持识别）
5：机票行程单
6：酒店账单（仅支持类型检测，不支持识别）
7：完税证明
8：通用机打发票
9：汽车票
10：轮船票
11：增值税发票（卷票 ）
12：购车发票
13：过路过桥费发票
14：购物小票（仅支持类型检测，不支持识别）
     * @param Type 识别出的图片所属的票据类型。
-1：未知类型
0：出租车发票
1：定额发票
2：火车票
3：增值税发票
4：客运限额发票（仅支持类型检测，不支持识别）
5：机票行程单
6：酒店账单（仅支持类型检测，不支持识别）
7：完税证明
8：通用机打发票
9：汽车票
10：轮船票
11：增值税发票（卷票 ）
12：购车发票
13：过路过桥费发票
14：购物小票（仅支持类型检测，不支持识别）
     */
    public void setType(Integer Type) {
        this.Type = Type;
    }

    /**
     * 获取识别出的图片在混贴票据图片中的位置信息。
     * @return Rect 识别出的图片在混贴票据图片中的位置信息。
     */
    public Rect getRect() {
        return this.Rect;
    }

    /**
     * 设置识别出的图片在混贴票据图片中的位置信息。
     * @param Rect 识别出的图片在混贴票据图片中的位置信息。
     */
    public void setRect(Rect Rect) {
        this.Rect = Rect;
    }

    /**
     * 获取识别出的图片在混贴票据图片中的旋转角度。
     * @return Angle 识别出的图片在混贴票据图片中的旋转角度。
     */
    public Float getAngle() {
        return this.Angle;
    }

    /**
     * 设置识别出的图片在混贴票据图片中的旋转角度。
     * @param Angle 识别出的图片在混贴票据图片中的旋转角度。
     */
    public void setAngle(Float Angle) {
        this.Angle = Angle;
    }

    /**
     * 获取识别到的内容。
     * @return SingleInvoiceInfos 识别到的内容。
     */
    public SingleInvoiceInfo [] getSingleInvoiceInfos() {
        return this.SingleInvoiceInfos;
    }

    /**
     * 设置识别到的内容。
     * @param SingleInvoiceInfos 识别到的内容。
     */
    public void setSingleInvoiceInfos(SingleInvoiceInfo [] SingleInvoiceInfos) {
        this.SingleInvoiceInfos = SingleInvoiceInfos;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Rect.", this.Rect);
        this.setParamSimple(map, prefix + "Angle", this.Angle);
        this.setParamArrayObj(map, prefix + "SingleInvoiceInfos.", this.SingleInvoiceInfos);

    }
}

