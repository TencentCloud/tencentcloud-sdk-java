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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateZoneRequest extends AbstractModel {

    /**
    * 空间ID。z-前缀开头，后面是12位随机数字/小写字母
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 空间名，必须全局唯一。包含小写字母、数字和短划线（-）。不能以短划线（-）开头或结尾，且不能有两个连续的短划线（-）。长度：2~64 个字符。
    */
    @SerializedName("NewZoneName")
    @Expose
    private String NewZoneName;

    /**
     * Get 空间ID。z-前缀开头，后面是12位随机数字/小写字母 
     * @return ZoneId 空间ID。z-前缀开头，后面是12位随机数字/小写字母
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 空间ID。z-前缀开头，后面是12位随机数字/小写字母
     * @param ZoneId 空间ID。z-前缀开头，后面是12位随机数字/小写字母
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 空间名，必须全局唯一。包含小写字母、数字和短划线（-）。不能以短划线（-）开头或结尾，且不能有两个连续的短划线（-）。长度：2~64 个字符。 
     * @return NewZoneName 空间名，必须全局唯一。包含小写字母、数字和短划线（-）。不能以短划线（-）开头或结尾，且不能有两个连续的短划线（-）。长度：2~64 个字符。
     */
    public String getNewZoneName() {
        return this.NewZoneName;
    }

    /**
     * Set 空间名，必须全局唯一。包含小写字母、数字和短划线（-）。不能以短划线（-）开头或结尾，且不能有两个连续的短划线（-）。长度：2~64 个字符。
     * @param NewZoneName 空间名，必须全局唯一。包含小写字母、数字和短划线（-）。不能以短划线（-）开头或结尾，且不能有两个连续的短划线（-）。长度：2~64 个字符。
     */
    public void setNewZoneName(String NewZoneName) {
        this.NewZoneName = NewZoneName;
    }

    public UpdateZoneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateZoneRequest(UpdateZoneRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.NewZoneName != null) {
            this.NewZoneName = new String(source.NewZoneName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "NewZoneName", this.NewZoneName);

    }
}

