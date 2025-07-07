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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageBlock extends AbstractModel {

    /**
    * HDD本地存储类型，值为：LOCAL_PRO.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * HDD本地存储的最小容量。单位：GiB。
    */
    @SerializedName("MinSize")
    @Expose
    private Long MinSize;

    /**
    * HDD本地存储的最大容量。单位：GiB。
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
     * Get HDD本地存储类型，值为：LOCAL_PRO. 
     * @return Type HDD本地存储类型，值为：LOCAL_PRO.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set HDD本地存储类型，值为：LOCAL_PRO.
     * @param Type HDD本地存储类型，值为：LOCAL_PRO.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get HDD本地存储的最小容量。单位：GiB。 
     * @return MinSize HDD本地存储的最小容量。单位：GiB。
     */
    public Long getMinSize() {
        return this.MinSize;
    }

    /**
     * Set HDD本地存储的最小容量。单位：GiB。
     * @param MinSize HDD本地存储的最小容量。单位：GiB。
     */
    public void setMinSize(Long MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * Get HDD本地存储的最大容量。单位：GiB。 
     * @return MaxSize HDD本地存储的最大容量。单位：GiB。
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set HDD本地存储的最大容量。单位：GiB。
     * @param MaxSize HDD本地存储的最大容量。单位：GiB。
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    public StorageBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageBlock(StorageBlock source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.MinSize != null) {
            this.MinSize = new Long(source.MinSize);
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);

    }
}

