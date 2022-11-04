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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAccessKeyRequest extends AbstractModel{

    /**
    * 指定需要删除的AccessKeyId
    */
    @SerializedName("AccessKeyId")
    @Expose
    private String AccessKeyId;

    /**
    * 指定用户Uin，不填默认为当前用户删除访问密钥
    */
    @SerializedName("TargetUin")
    @Expose
    private Long TargetUin;

    /**
     * Get 指定需要删除的AccessKeyId 
     * @return AccessKeyId 指定需要删除的AccessKeyId
     */
    public String getAccessKeyId() {
        return this.AccessKeyId;
    }

    /**
     * Set 指定需要删除的AccessKeyId
     * @param AccessKeyId 指定需要删除的AccessKeyId
     */
    public void setAccessKeyId(String AccessKeyId) {
        this.AccessKeyId = AccessKeyId;
    }

    /**
     * Get 指定用户Uin，不填默认为当前用户删除访问密钥 
     * @return TargetUin 指定用户Uin，不填默认为当前用户删除访问密钥
     */
    public Long getTargetUin() {
        return this.TargetUin;
    }

    /**
     * Set 指定用户Uin，不填默认为当前用户删除访问密钥
     * @param TargetUin 指定用户Uin，不填默认为当前用户删除访问密钥
     */
    public void setTargetUin(Long TargetUin) {
        this.TargetUin = TargetUin;
    }

    public DeleteAccessKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAccessKeyRequest(DeleteAccessKeyRequest source) {
        if (source.AccessKeyId != null) {
            this.AccessKeyId = new String(source.AccessKeyId);
        }
        if (source.TargetUin != null) {
            this.TargetUin = new Long(source.TargetUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessKeyId", this.AccessKeyId);
        this.setParamSimple(map, prefix + "TargetUin", this.TargetUin);

    }
}

