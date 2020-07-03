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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateStorageRequest extends AbstractModel{

    /**
    * 云存套餐ID
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * 设备TID
    */
    @SerializedName("Tid")
    @Expose
    private String Tid;

    /**
    * 用户唯一标识，由厂商保证内部唯一性
    */
    @SerializedName("UserTag")
    @Expose
    private String UserTag;

    /**
     * Get 云存套餐ID 
     * @return PkgId 云存套餐ID
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * Set 云存套餐ID
     * @param PkgId 云存套餐ID
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
    }

    /**
     * Get 设备TID 
     * @return Tid 设备TID
     */
    public String getTid() {
        return this.Tid;
    }

    /**
     * Set 设备TID
     * @param Tid 设备TID
     */
    public void setTid(String Tid) {
        this.Tid = Tid;
    }

    /**
     * Get 用户唯一标识，由厂商保证内部唯一性 
     * @return UserTag 用户唯一标识，由厂商保证内部唯一性
     */
    public String getUserTag() {
        return this.UserTag;
    }

    /**
     * Set 用户唯一标识，由厂商保证内部唯一性
     * @param UserTag 用户唯一标识，由厂商保证内部唯一性
     */
    public void setUserTag(String UserTag) {
        this.UserTag = UserTag;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);
        this.setParamSimple(map, prefix + "Tid", this.Tid);
        this.setParamSimple(map, prefix + "UserTag", this.UserTag);

    }
}

