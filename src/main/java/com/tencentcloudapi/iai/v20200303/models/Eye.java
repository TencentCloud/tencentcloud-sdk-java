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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Eye extends AbstractModel{

    /**
    * 识别是否佩戴眼镜。
AttributeItem对应的Type为 —— 0：无眼镜，1：普通眼镜，2：墨镜
    */
    @SerializedName("Glass")
    @Expose
    private AttributeItem Glass;

    /**
    * 识别眼睛的睁开、闭合状态。
AttributeItem对应的Type为 —— 0：睁开，1：闭眼
    */
    @SerializedName("EyeOpen")
    @Expose
    private AttributeItem EyeOpen;

    /**
    * 识别是否双眼皮。
AttributeItem对应的Type为 —— 0：无，1：有。
    */
    @SerializedName("EyelidType")
    @Expose
    private AttributeItem EyelidType;

    /**
    * 眼睛大小。
AttributeItem对应的Type为 —— 0：小眼睛，1：普通眼睛，2：大眼睛。
    */
    @SerializedName("EyeSize")
    @Expose
    private AttributeItem EyeSize;

    /**
     * Get 识别是否佩戴眼镜。
AttributeItem对应的Type为 —— 0：无眼镜，1：普通眼镜，2：墨镜 
     * @return Glass 识别是否佩戴眼镜。
AttributeItem对应的Type为 —— 0：无眼镜，1：普通眼镜，2：墨镜
     */
    public AttributeItem getGlass() {
        return this.Glass;
    }

    /**
     * Set 识别是否佩戴眼镜。
AttributeItem对应的Type为 —— 0：无眼镜，1：普通眼镜，2：墨镜
     * @param Glass 识别是否佩戴眼镜。
AttributeItem对应的Type为 —— 0：无眼镜，1：普通眼镜，2：墨镜
     */
    public void setGlass(AttributeItem Glass) {
        this.Glass = Glass;
    }

    /**
     * Get 识别眼睛的睁开、闭合状态。
AttributeItem对应的Type为 —— 0：睁开，1：闭眼 
     * @return EyeOpen 识别眼睛的睁开、闭合状态。
AttributeItem对应的Type为 —— 0：睁开，1：闭眼
     */
    public AttributeItem getEyeOpen() {
        return this.EyeOpen;
    }

    /**
     * Set 识别眼睛的睁开、闭合状态。
AttributeItem对应的Type为 —— 0：睁开，1：闭眼
     * @param EyeOpen 识别眼睛的睁开、闭合状态。
AttributeItem对应的Type为 —— 0：睁开，1：闭眼
     */
    public void setEyeOpen(AttributeItem EyeOpen) {
        this.EyeOpen = EyeOpen;
    }

    /**
     * Get 识别是否双眼皮。
AttributeItem对应的Type为 —— 0：无，1：有。 
     * @return EyelidType 识别是否双眼皮。
AttributeItem对应的Type为 —— 0：无，1：有。
     */
    public AttributeItem getEyelidType() {
        return this.EyelidType;
    }

    /**
     * Set 识别是否双眼皮。
AttributeItem对应的Type为 —— 0：无，1：有。
     * @param EyelidType 识别是否双眼皮。
AttributeItem对应的Type为 —— 0：无，1：有。
     */
    public void setEyelidType(AttributeItem EyelidType) {
        this.EyelidType = EyelidType;
    }

    /**
     * Get 眼睛大小。
AttributeItem对应的Type为 —— 0：小眼睛，1：普通眼睛，2：大眼睛。 
     * @return EyeSize 眼睛大小。
AttributeItem对应的Type为 —— 0：小眼睛，1：普通眼睛，2：大眼睛。
     */
    public AttributeItem getEyeSize() {
        return this.EyeSize;
    }

    /**
     * Set 眼睛大小。
AttributeItem对应的Type为 —— 0：小眼睛，1：普通眼睛，2：大眼睛。
     * @param EyeSize 眼睛大小。
AttributeItem对应的Type为 —— 0：小眼睛，1：普通眼睛，2：大眼睛。
     */
    public void setEyeSize(AttributeItem EyeSize) {
        this.EyeSize = EyeSize;
    }

    public Eye() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Eye(Eye source) {
        if (source.Glass != null) {
            this.Glass = new AttributeItem(source.Glass);
        }
        if (source.EyeOpen != null) {
            this.EyeOpen = new AttributeItem(source.EyeOpen);
        }
        if (source.EyelidType != null) {
            this.EyelidType = new AttributeItem(source.EyelidType);
        }
        if (source.EyeSize != null) {
            this.EyeSize = new AttributeItem(source.EyeSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Glass.", this.Glass);
        this.setParamObj(map, prefix + "EyeOpen.", this.EyeOpen);
        this.setParamObj(map, prefix + "EyelidType.", this.EyelidType);
        this.setParamObj(map, prefix + "EyeSize.", this.EyeSize);

    }
}

