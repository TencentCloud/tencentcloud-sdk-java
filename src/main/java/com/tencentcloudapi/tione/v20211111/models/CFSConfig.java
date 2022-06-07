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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CFSConfig extends AbstractModel{

    /**
    * cfs的实例的ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 存储的路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
     * Get cfs的实例的ID 
     * @return Id cfs的实例的ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set cfs的实例的ID
     * @param Id cfs的实例的ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 存储的路径 
     * @return Path 存储的路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 存储的路径
     * @param Path 存储的路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    public CFSConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CFSConfig(CFSConfig source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Path", this.Path);

    }
}

