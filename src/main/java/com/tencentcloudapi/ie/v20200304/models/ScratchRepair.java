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

public class ScratchRepair extends AbstractModel{

    /**
    * 去划痕方式，取值：normal。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 去划痕强度， 可选项：0.0-1.0。小于0.0的默认为0.0，大于1.0的默认为1.0。
    */
    @SerializedName("Ratio")
    @Expose
    private Float Ratio;

    /**
     * Get 去划痕方式，取值：normal。 
     * @return Type 去划痕方式，取值：normal。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 去划痕方式，取值：normal。
     * @param Type 去划痕方式，取值：normal。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 去划痕强度， 可选项：0.0-1.0。小于0.0的默认为0.0，大于1.0的默认为1.0。 
     * @return Ratio 去划痕强度， 可选项：0.0-1.0。小于0.0的默认为0.0，大于1.0的默认为1.0。
     */
    public Float getRatio() {
        return this.Ratio;
    }

    /**
     * Set 去划痕强度， 可选项：0.0-1.0。小于0.0的默认为0.0，大于1.0的默认为1.0。
     * @param Ratio 去划痕强度， 可选项：0.0-1.0。小于0.0的默认为0.0，大于1.0的默认为1.0。
     */
    public void setRatio(Float Ratio) {
        this.Ratio = Ratio;
    }

    public ScratchRepair() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScratchRepair(ScratchRepair source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Ratio != null) {
            this.Ratio = new Float(source.Ratio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Ratio", this.Ratio);

    }
}

