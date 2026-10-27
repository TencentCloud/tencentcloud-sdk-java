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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyImageAttrsRequest extends AbstractModel {

    /**
    * <p>镜像id</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>支持修改的属性列表为：{ImageName}</p>
    */
    @SerializedName("Attrs")
    @Expose
    private AttributeInfo [] Attrs;

    /**
     * Get <p>镜像id</p> 
     * @return ImageId <p>镜像id</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>镜像id</p>
     * @param ImageId <p>镜像id</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>支持修改的属性列表为：{ImageName}</p> 
     * @return Attrs <p>支持修改的属性列表为：{ImageName}</p>
     */
    public AttributeInfo [] getAttrs() {
        return this.Attrs;
    }

    /**
     * Set <p>支持修改的属性列表为：{ImageName}</p>
     * @param Attrs <p>支持修改的属性列表为：{ImageName}</p>
     */
    public void setAttrs(AttributeInfo [] Attrs) {
        this.Attrs = Attrs;
    }

    public ModifyImageAttrsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyImageAttrsRequest(ModifyImageAttrsRequest source) {
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.Attrs != null) {
            this.Attrs = new AttributeInfo[source.Attrs.length];
            for (int i = 0; i < source.Attrs.length; i++) {
                this.Attrs[i] = new AttributeInfo(source.Attrs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamArrayObj(map, prefix + "Attrs.", this.Attrs);

    }
}

