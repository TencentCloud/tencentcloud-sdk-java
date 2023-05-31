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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyResourcePackageNameRequest extends AbstractModel{

    /**
    * 资源包唯一ID
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * 自定义的资源包名称，最长支持120个字符
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
     * Get 资源包唯一ID 
     * @return PackageId 资源包唯一ID
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set 资源包唯一ID
     * @param PackageId 资源包唯一ID
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get 自定义的资源包名称，最长支持120个字符 
     * @return PackageName 自定义的资源包名称，最长支持120个字符
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set 自定义的资源包名称，最长支持120个字符
     * @param PackageName 自定义的资源包名称，最长支持120个字符
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    public ModifyResourcePackageNameRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyResourcePackageNameRequest(ModifyResourcePackageNameRequest source) {
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);

    }
}

