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

public class InvoiceDetectInfo extends AbstractModel {

    /**
    * 识别出的图片在混贴票据图片中的旋转角度。
    */
    @SerializedName("Angle")
    @Expose
    private Float Angle;

    /**
    * 识别出的图片所属的票据类型。
-1：未知类型
0：出租车发票
1：定额发票
2：火车票
3：增值税发票
4：客运限额发票
5：机票行程单
6：酒店账单
7：完税证明
8：通用机打发票
9：汽车票
10：轮船票
11：增值税发票（卷票 ）
12：购车发票
13：过路过桥费发票
14：购物小票
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
    * 入参 ReturnImage 为 True 时返回 Base64 编码后的图片。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Image")
    @Expose
    private String Image;

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
     * Get 识别出的图片所属的票据类型。
-1：未知类型
0：出租车发票
1：定额发票
2：火车票
3：增值税发票
4：客运限额发票
5：机票行程单
6：酒店账单
7：完税证明
8：通用机打发票
9：汽车票
10：轮船票
11：增值税发票（卷票 ）
12：购车发票
13：过路过桥费发票
14：购物小票 
     * @return Type 识别出的图片所属的票据类型。
-1：未知类型
0：出租车发票
1：定额发票
2：火车票
3：增值税发票
4：客运限额发票
5：机票行程单
6：酒店账单
7：完税证明
8：通用机打发票
9：汽车票
10：轮船票
11：增值税发票（卷票 ）
12：购车发票
13：过路过桥费发票
14：购物小票
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
4：客运限额发票
5：机票行程单
6：酒店账单
7：完税证明
8：通用机打发票
9：汽车票
10：轮船票
11：增值税发票（卷票 ）
12：购车发票
13：过路过桥费发票
14：购物小票
     * @param Type 识别出的图片所属的票据类型。
-1：未知类型
0：出租车发票
1：定额发票
2：火车票
3：增值税发票
4：客运限额发票
5：机票行程单
6：酒店账单
7：完税证明
8：通用机打发票
9：汽车票
10：轮船票
11：增值税发票（卷票 ）
12：购车发票
13：过路过桥费发票
14：购物小票
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
     * Get 入参 ReturnImage 为 True 时返回 Base64 编码后的图片。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Image 入参 ReturnImage 为 True 时返回 Base64 编码后的图片。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 入参 ReturnImage 为 True 时返回 Base64 编码后的图片。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Image 入参 ReturnImage 为 True 时返回 Base64 编码后的图片。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    public InvoiceDetectInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvoiceDetectInfo(InvoiceDetectInfo source) {
        if (source.Angle != null) {
            this.Angle = new Float(source.Angle);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Rect != null) {
            this.Rect = new Rect(source.Rect);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Angle", this.Angle);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Rect.", this.Rect);
        this.setParamSimple(map, prefix + "Image", this.Image);

    }
}

