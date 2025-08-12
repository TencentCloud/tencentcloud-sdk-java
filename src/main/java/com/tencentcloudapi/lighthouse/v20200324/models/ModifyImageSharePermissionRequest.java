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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyImageSharePermissionRequest extends AbstractModel {

    /**
    * 镜像 ID。可通过[DescribeImages](https://cloud.tencent.com/document/api/213/15715)接口返回值中的ImageId获取。
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 共享属性，包括 SHARE，CANCEL。其中SHARE代表共享，CANCEL代表取消共享。
    */
    @SerializedName("Permission")
    @Expose
    private String Permission;

    /**
     * Get 镜像 ID。可通过[DescribeImages](https://cloud.tencent.com/document/api/213/15715)接口返回值中的ImageId获取。 
     * @return ImageId 镜像 ID。可通过[DescribeImages](https://cloud.tencent.com/document/api/213/15715)接口返回值中的ImageId获取。
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像 ID。可通过[DescribeImages](https://cloud.tencent.com/document/api/213/15715)接口返回值中的ImageId获取。
     * @param ImageId 镜像 ID。可通过[DescribeImages](https://cloud.tencent.com/document/api/213/15715)接口返回值中的ImageId获取。
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 共享属性，包括 SHARE，CANCEL。其中SHARE代表共享，CANCEL代表取消共享。 
     * @return Permission 共享属性，包括 SHARE，CANCEL。其中SHARE代表共享，CANCEL代表取消共享。
     */
    public String getPermission() {
        return this.Permission;
    }

    /**
     * Set 共享属性，包括 SHARE，CANCEL。其中SHARE代表共享，CANCEL代表取消共享。
     * @param Permission 共享属性，包括 SHARE，CANCEL。其中SHARE代表共享，CANCEL代表取消共享。
     */
    public void setPermission(String Permission) {
        this.Permission = Permission;
    }

    public ModifyImageSharePermissionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyImageSharePermissionRequest(ModifyImageSharePermissionRequest source) {
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.Permission != null) {
            this.Permission = new String(source.Permission);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "Permission", this.Permission);

    }
}

