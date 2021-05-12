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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Denoising extends AbstractModel{

    /**
    * 去噪方式，可选项：
templ：时域降噪；
spatial：空域降噪,
fast-spatial：快速空域降噪。
注意：可选择组合方式：
1.type:"templ,spatial" ;
2.type:"templ,fast-spatial"。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 时域去噪强度，可选值：0.0-1.0 。小于0.0的默认为0.0，大于1.0的默认为1.0。
    */
    @SerializedName("TemplStrength")
    @Expose
    private Float TemplStrength;

    /**
    * 空域去噪强度，可选值：0.0-1.0 。小于0.0的默认为0.0，大于1.0的默认为1.0。
    */
    @SerializedName("SpatialStrength")
    @Expose
    private Float SpatialStrength;

    /**
     * Get 去噪方式，可选项：
templ：时域降噪；
spatial：空域降噪,
fast-spatial：快速空域降噪。
注意：可选择组合方式：
1.type:"templ,spatial" ;
2.type:"templ,fast-spatial"。 
     * @return Type 去噪方式，可选项：
templ：时域降噪；
spatial：空域降噪,
fast-spatial：快速空域降噪。
注意：可选择组合方式：
1.type:"templ,spatial" ;
2.type:"templ,fast-spatial"。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 去噪方式，可选项：
templ：时域降噪；
spatial：空域降噪,
fast-spatial：快速空域降噪。
注意：可选择组合方式：
1.type:"templ,spatial" ;
2.type:"templ,fast-spatial"。
     * @param Type 去噪方式，可选项：
templ：时域降噪；
spatial：空域降噪,
fast-spatial：快速空域降噪。
注意：可选择组合方式：
1.type:"templ,spatial" ;
2.type:"templ,fast-spatial"。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 时域去噪强度，可选值：0.0-1.0 。小于0.0的默认为0.0，大于1.0的默认为1.0。 
     * @return TemplStrength 时域去噪强度，可选值：0.0-1.0 。小于0.0的默认为0.0，大于1.0的默认为1.0。
     */
    public Float getTemplStrength() {
        return this.TemplStrength;
    }

    /**
     * Set 时域去噪强度，可选值：0.0-1.0 。小于0.0的默认为0.0，大于1.0的默认为1.0。
     * @param TemplStrength 时域去噪强度，可选值：0.0-1.0 。小于0.0的默认为0.0，大于1.0的默认为1.0。
     */
    public void setTemplStrength(Float TemplStrength) {
        this.TemplStrength = TemplStrength;
    }

    /**
     * Get 空域去噪强度，可选值：0.0-1.0 。小于0.0的默认为0.0，大于1.0的默认为1.0。 
     * @return SpatialStrength 空域去噪强度，可选值：0.0-1.0 。小于0.0的默认为0.0，大于1.0的默认为1.0。
     */
    public Float getSpatialStrength() {
        return this.SpatialStrength;
    }

    /**
     * Set 空域去噪强度，可选值：0.0-1.0 。小于0.0的默认为0.0，大于1.0的默认为1.0。
     * @param SpatialStrength 空域去噪强度，可选值：0.0-1.0 。小于0.0的默认为0.0，大于1.0的默认为1.0。
     */
    public void setSpatialStrength(Float SpatialStrength) {
        this.SpatialStrength = SpatialStrength;
    }

    public Denoising() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Denoising(Denoising source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TemplStrength != null) {
            this.TemplStrength = new Float(source.TemplStrength);
        }
        if (source.SpatialStrength != null) {
            this.SpatialStrength = new Float(source.SpatialStrength);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TemplStrength", this.TemplStrength);
        this.setParamSimple(map, prefix + "SpatialStrength", this.SpatialStrength);

    }
}

