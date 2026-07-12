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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BeautyEffectItem extends AbstractModel {

    /**
    * <p>是否开启美颜。</p><p>枚举值：</p><ul><li>ON： 开</li><li>OFF： 关</li></ul>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * <p>美颜项。</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>美颜强度。</p>
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
    * <p>附加资源路径。</p>
    */
    @SerializedName("ResourcePath")
    @Expose
    private String ResourcePath;

    /**
    * <p>附加信息。</p>
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get <p>是否开启美颜。</p><p>枚举值：</p><ul><li>ON： 开</li><li>OFF： 关</li></ul> 
     * @return Switch <p>是否开启美颜。</p><p>枚举值：</p><ul><li>ON： 开</li><li>OFF： 关</li></ul>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>是否开启美颜。</p><p>枚举值：</p><ul><li>ON： 开</li><li>OFF： 关</li></ul>
     * @param Switch <p>是否开启美颜。</p><p>枚举值：</p><ul><li>ON： 开</li><li>OFF： 关</li></ul>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get <p>美颜项。</p> 
     * @return Type <p>美颜项。</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>美颜项。</p>
     * @param Type <p>美颜项。</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>美颜强度。</p> 
     * @return Value <p>美颜强度。</p>
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set <p>美颜强度。</p>
     * @param Value <p>美颜强度。</p>
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    /**
     * Get <p>附加资源路径。</p> 
     * @return ResourcePath <p>附加资源路径。</p>
     */
    public String getResourcePath() {
        return this.ResourcePath;
    }

    /**
     * Set <p>附加资源路径。</p>
     * @param ResourcePath <p>附加资源路径。</p>
     */
    public void setResourcePath(String ResourcePath) {
        this.ResourcePath = ResourcePath;
    }

    /**
     * Get <p>附加信息。</p> 
     * @return ExtInfo <p>附加信息。</p>
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set <p>附加信息。</p>
     * @param ExtInfo <p>附加信息。</p>
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public BeautyEffectItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BeautyEffectItem(BeautyEffectItem source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
        if (source.ResourcePath != null) {
            this.ResourcePath = new String(source.ResourcePath);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "ResourcePath", this.ResourcePath);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}

