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
package com.tencentcloudapi.iai.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FaceHairAttributesInfo  extends AbstractModel{

    /**
    * 0：光头，1：短发，2：中发，3：长发，4：绑发
    */
    @SerializedName("Length")
    @Expose
    private Integer Length;

    /**
    * 0：有刘海，1：无刘海
    */
    @SerializedName("Bang")
    @Expose
    private Integer Bang;

    /**
    * 0：黑色，1：金色，2：棕色，3：灰白色
    */
    @SerializedName("Color")
    @Expose
    private Integer Color;

    /**
     * 获取0：光头，1：短发，2：中发，3：长发，4：绑发
     * @return Length 0：光头，1：短发，2：中发，3：长发，4：绑发
     */
    public Integer getLength() {
        return this.Length;
    }

    /**
     * 设置0：光头，1：短发，2：中发，3：长发，4：绑发
     * @param Length 0：光头，1：短发，2：中发，3：长发，4：绑发
     */
    public void setLength(Integer Length) {
        this.Length = Length;
    }

    /**
     * 获取0：有刘海，1：无刘海
     * @return Bang 0：有刘海，1：无刘海
     */
    public Integer getBang() {
        return this.Bang;
    }

    /**
     * 设置0：有刘海，1：无刘海
     * @param Bang 0：有刘海，1：无刘海
     */
    public void setBang(Integer Bang) {
        this.Bang = Bang;
    }

    /**
     * 获取0：黑色，1：金色，2：棕色，3：灰白色
     * @return Color 0：黑色，1：金色，2：棕色，3：灰白色
     */
    public Integer getColor() {
        return this.Color;
    }

    /**
     * 设置0：黑色，1：金色，2：棕色，3：灰白色
     * @param Color 0：黑色，1：金色，2：棕色，3：灰白色
     */
    public void setColor(Integer Color) {
        this.Color = Color;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Length", this.Length);
        this.setParamSimple(map, prefix + "Bang", this.Bang);
        this.setParamSimple(map, prefix + "Color", this.Color);

    }
}

