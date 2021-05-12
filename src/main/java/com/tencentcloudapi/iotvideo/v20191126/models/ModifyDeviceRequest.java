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

public class ModifyDeviceRequest extends AbstractModel{

    /**
    * 设备ID
    */
    @SerializedName("Tid")
    @Expose
    private String Tid;

    /**
    * 用户ID
    */
    @SerializedName("AccessId")
    @Expose
    private String AccessId;

    /**
    * 设备昵称，最多不超过64个字符
    */
    @SerializedName("Nick")
    @Expose
    private String Nick;

    /**
     * Get 设备ID 
     * @return Tid 设备ID
     */
    public String getTid() {
        return this.Tid;
    }

    /**
     * Set 设备ID
     * @param Tid 设备ID
     */
    public void setTid(String Tid) {
        this.Tid = Tid;
    }

    /**
     * Get 用户ID 
     * @return AccessId 用户ID
     */
    public String getAccessId() {
        return this.AccessId;
    }

    /**
     * Set 用户ID
     * @param AccessId 用户ID
     */
    public void setAccessId(String AccessId) {
        this.AccessId = AccessId;
    }

    /**
     * Get 设备昵称，最多不超过64个字符 
     * @return Nick 设备昵称，最多不超过64个字符
     */
    public String getNick() {
        return this.Nick;
    }

    /**
     * Set 设备昵称，最多不超过64个字符
     * @param Nick 设备昵称，最多不超过64个字符
     */
    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    public ModifyDeviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDeviceRequest(ModifyDeviceRequest source) {
        if (source.Tid != null) {
            this.Tid = new String(source.Tid);
        }
        if (source.AccessId != null) {
            this.AccessId = new String(source.AccessId);
        }
        if (source.Nick != null) {
            this.Nick = new String(source.Nick);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tid", this.Tid);
        this.setParamSimple(map, prefix + "AccessId", this.AccessId);
        this.setParamSimple(map, prefix + "Nick", this.Nick);

    }
}

