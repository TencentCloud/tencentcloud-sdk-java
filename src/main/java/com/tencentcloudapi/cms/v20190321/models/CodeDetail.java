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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CodeDetail extends AbstractModel{

    /**
    * 二维码在图片中的位置，由边界点的坐标表示
    */
    @SerializedName("CodePosition")
    @Expose
    private CodePosition [] CodePosition;

    /**
    * 二维码文本的编码格式
    */
    @SerializedName("CodeCharset")
    @Expose
    private String CodeCharset;

    /**
    * 二维码的文本内容
    */
    @SerializedName("CodeText")
    @Expose
    private String CodeText;

    /**
    * 二维码的类型：1:ONED_BARCODE，2:QRCOD，3:WXCODE，4:PDF417，5:DATAMATRIX
    */
    @SerializedName("CodeType")
    @Expose
    private Long CodeType;

    /**
     * Get 二维码在图片中的位置，由边界点的坐标表示 
     * @return CodePosition 二维码在图片中的位置，由边界点的坐标表示
     */
    public CodePosition [] getCodePosition() {
        return this.CodePosition;
    }

    /**
     * Set 二维码在图片中的位置，由边界点的坐标表示
     * @param CodePosition 二维码在图片中的位置，由边界点的坐标表示
     */
    public void setCodePosition(CodePosition [] CodePosition) {
        this.CodePosition = CodePosition;
    }

    /**
     * Get 二维码文本的编码格式 
     * @return CodeCharset 二维码文本的编码格式
     */
    public String getCodeCharset() {
        return this.CodeCharset;
    }

    /**
     * Set 二维码文本的编码格式
     * @param CodeCharset 二维码文本的编码格式
     */
    public void setCodeCharset(String CodeCharset) {
        this.CodeCharset = CodeCharset;
    }

    /**
     * Get 二维码的文本内容 
     * @return CodeText 二维码的文本内容
     */
    public String getCodeText() {
        return this.CodeText;
    }

    /**
     * Set 二维码的文本内容
     * @param CodeText 二维码的文本内容
     */
    public void setCodeText(String CodeText) {
        this.CodeText = CodeText;
    }

    /**
     * Get 二维码的类型：1:ONED_BARCODE，2:QRCOD，3:WXCODE，4:PDF417，5:DATAMATRIX 
     * @return CodeType 二维码的类型：1:ONED_BARCODE，2:QRCOD，3:WXCODE，4:PDF417，5:DATAMATRIX
     */
    public Long getCodeType() {
        return this.CodeType;
    }

    /**
     * Set 二维码的类型：1:ONED_BARCODE，2:QRCOD，3:WXCODE，4:PDF417，5:DATAMATRIX
     * @param CodeType 二维码的类型：1:ONED_BARCODE，2:QRCOD，3:WXCODE，4:PDF417，5:DATAMATRIX
     */
    public void setCodeType(Long CodeType) {
        this.CodeType = CodeType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CodePosition.", this.CodePosition);
        this.setParamSimple(map, prefix + "CodeCharset", this.CodeCharset);
        this.setParamSimple(map, prefix + "CodeText", this.CodeText);
        this.setParamSimple(map, prefix + "CodeType", this.CodeType);

    }
}

