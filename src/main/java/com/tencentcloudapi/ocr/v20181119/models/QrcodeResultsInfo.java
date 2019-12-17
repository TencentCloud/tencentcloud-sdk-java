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

public class QrcodeResultsInfo extends AbstractModel{

    /**
    * 类型（二维码、条形码）
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * 二维码/条形码包含的地址
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 二维码/条形码坐标（二维码会返回位置坐标，条形码暂不返回位置坐标，因此默认X和Y返回值均为-1）
    */
    @SerializedName("Position")
    @Expose
    private QrcodePositionObj Position;

    /**
     * Get 类型（二维码、条形码） 
     * @return TypeName 类型（二维码、条形码）
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set 类型（二维码、条形码）
     * @param TypeName 类型（二维码、条形码）
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get 二维码/条形码包含的地址 
     * @return Url 二维码/条形码包含的地址
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 二维码/条形码包含的地址
     * @param Url 二维码/条形码包含的地址
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 二维码/条形码坐标（二维码会返回位置坐标，条形码暂不返回位置坐标，因此默认X和Y返回值均为-1） 
     * @return Position 二维码/条形码坐标（二维码会返回位置坐标，条形码暂不返回位置坐标，因此默认X和Y返回值均为-1）
     */
    public QrcodePositionObj getPosition() {
        return this.Position;
    }

    /**
     * Set 二维码/条形码坐标（二维码会返回位置坐标，条形码暂不返回位置坐标，因此默认X和Y返回值均为-1）
     * @param Position 二维码/条形码坐标（二维码会返回位置坐标，条形码暂不返回位置坐标，因此默认X和Y返回值均为-1）
     */
    public void setPosition(QrcodePositionObj Position) {
        this.Position = Position;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamObj(map, prefix + "Position.", this.Position);

    }
}

