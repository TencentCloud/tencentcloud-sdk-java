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
package com.tencentcloudapi.fmu.v20191213.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RGBAInfo extends AbstractModel{

    /**
    * R通道数值。[0,255]。
    */
    @SerializedName("R")
    @Expose
    private Long R;

    /**
    * G通道数值。[0,255]。
    */
    @SerializedName("G")
    @Expose
    private Long G;

    /**
    * B通道数值。[0,255]。
    */
    @SerializedName("B")
    @Expose
    private Long B;

    /**
    * A通道数值。[0,100]。建议取值50。
    */
    @SerializedName("A")
    @Expose
    private Long A;

    /**
     * Get R通道数值。[0,255]。 
     * @return R R通道数值。[0,255]。
     */
    public Long getR() {
        return this.R;
    }

    /**
     * Set R通道数值。[0,255]。
     * @param R R通道数值。[0,255]。
     */
    public void setR(Long R) {
        this.R = R;
    }

    /**
     * Get G通道数值。[0,255]。 
     * @return G G通道数值。[0,255]。
     */
    public Long getG() {
        return this.G;
    }

    /**
     * Set G通道数值。[0,255]。
     * @param G G通道数值。[0,255]。
     */
    public void setG(Long G) {
        this.G = G;
    }

    /**
     * Get B通道数值。[0,255]。 
     * @return B B通道数值。[0,255]。
     */
    public Long getB() {
        return this.B;
    }

    /**
     * Set B通道数值。[0,255]。
     * @param B B通道数值。[0,255]。
     */
    public void setB(Long B) {
        this.B = B;
    }

    /**
     * Get A通道数值。[0,100]。建议取值50。 
     * @return A A通道数值。[0,100]。建议取值50。
     */
    public Long getA() {
        return this.A;
    }

    /**
     * Set A通道数值。[0,100]。建议取值50。
     * @param A A通道数值。[0,100]。建议取值50。
     */
    public void setA(Long A) {
        this.A = A;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "R", this.R);
        this.setParamSimple(map, prefix + "G", this.G);
        this.setParamSimple(map, prefix + "B", this.B);
        this.setParamSimple(map, prefix + "A", this.A);

    }
}

