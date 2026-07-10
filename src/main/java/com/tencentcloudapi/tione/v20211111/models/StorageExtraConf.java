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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageExtraConf extends AbstractModel {

    /**
    * <p>cfs的存储类型<br>  // HP:通用性能型<br>  // SD:通用标准型<br>  // TP:turbo性能型<br>  // TB:turbo标准型<br>  // THP:吞吐型</p>
    */
    @SerializedName("CFSStorageType")
    @Expose
    private String CFSStorageType;

    /**
    * <p>cfs的协议</p>
    */
    @SerializedName("CFSProtocol")
    @Expose
    private String CFSProtocol;

    /**
     * Get <p>cfs的存储类型<br>  // HP:通用性能型<br>  // SD:通用标准型<br>  // TP:turbo性能型<br>  // TB:turbo标准型<br>  // THP:吞吐型</p> 
     * @return CFSStorageType <p>cfs的存储类型<br>  // HP:通用性能型<br>  // SD:通用标准型<br>  // TP:turbo性能型<br>  // TB:turbo标准型<br>  // THP:吞吐型</p>
     */
    public String getCFSStorageType() {
        return this.CFSStorageType;
    }

    /**
     * Set <p>cfs的存储类型<br>  // HP:通用性能型<br>  // SD:通用标准型<br>  // TP:turbo性能型<br>  // TB:turbo标准型<br>  // THP:吞吐型</p>
     * @param CFSStorageType <p>cfs的存储类型<br>  // HP:通用性能型<br>  // SD:通用标准型<br>  // TP:turbo性能型<br>  // TB:turbo标准型<br>  // THP:吞吐型</p>
     */
    public void setCFSStorageType(String CFSStorageType) {
        this.CFSStorageType = CFSStorageType;
    }

    /**
     * Get <p>cfs的协议</p> 
     * @return CFSProtocol <p>cfs的协议</p>
     */
    public String getCFSProtocol() {
        return this.CFSProtocol;
    }

    /**
     * Set <p>cfs的协议</p>
     * @param CFSProtocol <p>cfs的协议</p>
     */
    public void setCFSProtocol(String CFSProtocol) {
        this.CFSProtocol = CFSProtocol;
    }

    public StorageExtraConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageExtraConf(StorageExtraConf source) {
        if (source.CFSStorageType != null) {
            this.CFSStorageType = new String(source.CFSStorageType);
        }
        if (source.CFSProtocol != null) {
            this.CFSProtocol = new String(source.CFSProtocol);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CFSStorageType", this.CFSStorageType);
        this.setParamSimple(map, prefix + "CFSProtocol", this.CFSProtocol);

    }
}

