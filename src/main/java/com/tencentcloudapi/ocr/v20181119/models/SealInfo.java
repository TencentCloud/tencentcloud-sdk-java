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

public class SealInfo extends AbstractModel{

    /**
    * 印章主体内容
    */
    @SerializedName("SealBody")
    @Expose
    private String SealBody;

    /**
    * 印章坐标
    */
    @SerializedName("Location")
    @Expose
    private Rect Location;

    /**
    * 印章其它文本内容
    */
    @SerializedName("OtherTexts")
    @Expose
    private String [] OtherTexts;

    /**
    * 印章类型，表示为:
圆形印章：0
椭圆形印章：1
方形印章：2
菱形印章：3
三角形印章：4
    */
    @SerializedName("SealShape")
    @Expose
    private String SealShape;

    /**
     * Get 印章主体内容 
     * @return SealBody 印章主体内容
     */
    public String getSealBody() {
        return this.SealBody;
    }

    /**
     * Set 印章主体内容
     * @param SealBody 印章主体内容
     */
    public void setSealBody(String SealBody) {
        this.SealBody = SealBody;
    }

    /**
     * Get 印章坐标 
     * @return Location 印章坐标
     */
    public Rect getLocation() {
        return this.Location;
    }

    /**
     * Set 印章坐标
     * @param Location 印章坐标
     */
    public void setLocation(Rect Location) {
        this.Location = Location;
    }

    /**
     * Get 印章其它文本内容 
     * @return OtherTexts 印章其它文本内容
     */
    public String [] getOtherTexts() {
        return this.OtherTexts;
    }

    /**
     * Set 印章其它文本内容
     * @param OtherTexts 印章其它文本内容
     */
    public void setOtherTexts(String [] OtherTexts) {
        this.OtherTexts = OtherTexts;
    }

    /**
     * Get 印章类型，表示为:
圆形印章：0
椭圆形印章：1
方形印章：2
菱形印章：3
三角形印章：4 
     * @return SealShape 印章类型，表示为:
圆形印章：0
椭圆形印章：1
方形印章：2
菱形印章：3
三角形印章：4
     */
    public String getSealShape() {
        return this.SealShape;
    }

    /**
     * Set 印章类型，表示为:
圆形印章：0
椭圆形印章：1
方形印章：2
菱形印章：3
三角形印章：4
     * @param SealShape 印章类型，表示为:
圆形印章：0
椭圆形印章：1
方形印章：2
菱形印章：3
三角形印章：4
     */
    public void setSealShape(String SealShape) {
        this.SealShape = SealShape;
    }

    public SealInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SealInfo(SealInfo source) {
        if (source.SealBody != null) {
            this.SealBody = new String(source.SealBody);
        }
        if (source.Location != null) {
            this.Location = new Rect(source.Location);
        }
        if (source.OtherTexts != null) {
            this.OtherTexts = new String[source.OtherTexts.length];
            for (int i = 0; i < source.OtherTexts.length; i++) {
                this.OtherTexts[i] = new String(source.OtherTexts[i]);
            }
        }
        if (source.SealShape != null) {
            this.SealShape = new String(source.SealShape);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SealBody", this.SealBody);
        this.setParamObj(map, prefix + "Location.", this.Location);
        this.setParamArraySimple(map, prefix + "OtherTexts.", this.OtherTexts);
        this.setParamSimple(map, prefix + "SealShape", this.SealShape);

    }
}

